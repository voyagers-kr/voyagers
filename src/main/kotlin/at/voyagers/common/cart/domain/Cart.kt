package at.voyagers.common.cart.domain

import at.voyagers.common.order.domain.OrderVariant
import java.util.*

data class Cart(
    val id: String,
    val customerId: String,
    val variants: MutableList<OrderVariant>,
) {
    companion object {
        fun initial(customerId: String): Cart {
            return Cart(
                id = UUID.randomUUID().toString(),
                customerId = customerId,
                variants = mutableListOf(),
            )
        }
    }

    fun addVariant(variant: OrderVariant) {
        variants.add(variant)
    }
}
