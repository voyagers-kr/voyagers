package at.voyagers.common.variant.domain

import java.util.*
import kotlin.random.Random

data class Variant(
    val id: Long,
    val productId: Long,
    val quantity: Int,
) {
    companion object {
        fun create(productId: Long, quantity: Int): Variant {
            return Variant(
                id = Random.nextLong(),
                productId = productId,
                quantity = quantity,
            )
        }
    }
}
