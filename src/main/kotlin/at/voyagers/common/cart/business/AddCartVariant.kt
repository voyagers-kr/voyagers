package at.voyagers.common.cart.business

import at.voyagers.common.cart.adapter.CartReader
import at.voyagers.common.cart.business.request.AddCartVariantRequest
import at.voyagers.common.cart.domain.Cart
import at.voyagers.common.customer.domain.Customer
import at.voyagers.common.order.domain.OrderVariant
import at.voyagers.common.product.domain.Product
import at.voyagers.common.product.domain.ProductStatus
import at.voyagers.common.variant.application.VariantReader
import at.voyagers.common.variant.domain.Variant
import org.springframework.stereotype.Service
import kotlin.random.Random

@Service
class AddCartVariant(
    private val cartReader: CartReader,
    private val variantReader: VariantReader,
) {

    fun execute(request: AddCartVariantRequest): Boolean {
//        val customer = customerReader.read(request.accountId)
        val customer = Customer(Random.nextLong(), "John", "Doe", Random.nextLong())
        val cart: Cart = cartReader.read(request.cartId)
        val variant: Variant = variantReader.read(request.variantId)
//        val product = productReader.read(variant.productId)
        val product = Product(Random.nextLong(), "Product", "Description",
            Random.nextDouble(), ProductStatus.ACTIVE, Random.nextLong())

        val orderVariant = OrderVariant(variant.id!!, product.price, request.quantity)
        cart.addVariant(orderVariant)

        return true
    }
}
