package at.voyagers.common.cart.domain

import at.voyagers.common.order.domain.OrderVariant
import at.voyagers.common.variant.domain.Variant
import kotlin.random.Random

data class Cart(
    val id: Long,
    val customerId: Long,
    val variants: MutableList<OrderVariant>,
) {
    companion object {
        fun initial(customerId: Long): Cart {
            return Cart(
                id = Random.nextLong(),
                customerId = customerId,
                variants = mutableListOf(),
            )
        }
    }

    fun addVariant(variant: OrderVariant) {
        variants.add(variant)
    }
}
