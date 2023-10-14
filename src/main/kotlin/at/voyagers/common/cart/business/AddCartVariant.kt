package at.voyagers.common.cart.business

import at.voyagers.common.cart.adapter.component.CartReader
import at.voyagers.common.cart.business.request.AddCartVariantRequest
import at.voyagers.common.customer.domain.Customer
import at.voyagers.common.order.domain.OrderVariant
import at.voyagers.common.product.domain.Product
import at.voyagers.common.product.domain.ProductStatus
import at.voyagers.common.variant.adapter.component.VariantReader
import at.voyagers.common.variant.domain.Variant
import org.springframework.stereotype.Service
import java.util.Random
import java.util.UUID

@Service
class AddCartVariant(
    private val cartReader: CartReader,
    private val variantReader: VariantReader,
) {

    fun execute(request: AddCartVariantRequest): Boolean {
//        val customer = customerReader.read(request.accountId)
        val customer = Customer(UUID.randomUUID().toString(), "John", "Doe", UUID.randomUUID().toString())
        val cart = cartReader.read(request.cartId)
        val variant = variantReader.read(request.variantId)
//        val product = productReader.read(variant.productId)
        val product = Product(UUID.randomUUID().toString(), "Product", "Description",
            Random().nextDouble(), ProductStatus.ACTIVE, UUID.randomUUID().toString())

        val orderVariant = OrderVariant(cart.id, product.price, request.quantity)
        cart.addVariant(orderVariant)

        return true
    }
}
