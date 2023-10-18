package at.voyagers.common.variant.domain

import kotlin.random.Random

data class Variant(
    val productId: Long,
    val quantity: Int,

    var id: Long? = null,
) {
    companion object {
        fun create(productId: Long, quantity: Int): Variant {
            return Variant(
                productId = productId,
                quantity = quantity,
            )
        }
    }

    // spec -> domain 이 되기 위한 조건을 검증
}
