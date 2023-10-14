package at.voyagers.common.cart.domain

import at.voyagers.common.variant.domain.Variant
import java.util.UUID

data class Cart(
    val id: String,
    val customerId: String,
    val variants: List<Variant>,
) {
    companion object {
        fun initial(customerId: String): Cart {
            return Cart(
                id = UUID.randomUUID().toString(),
                customerId = customerId,
                variants = listOf(),
            )
        }
    }
}
