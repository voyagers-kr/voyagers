package at.voyagers.common.variant.domain

import java.util.*

data class Variant(
    val id: String,
    val productId: String,
    val quantity: Int,
) {
    companion object {
        fun create(productId: String, quantity: Int): Variant {
            return Variant(
                id = UUID.randomUUID().toString(),
                productId = productId,
                quantity = quantity,
            )
        }
    }
}
