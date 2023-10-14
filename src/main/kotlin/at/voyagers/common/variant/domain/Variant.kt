package at.voyagers.common.variant.domain

data class Variant(
    val id: String,
    val productId: String,
    val quantity: Int,
) {
    companion object {
        fun create(productId: String, quantity: Int): Variant {
            return Variant(
                id = "1",
                productId = productId,
                quantity = quantity,
            )
        }
    }
}
