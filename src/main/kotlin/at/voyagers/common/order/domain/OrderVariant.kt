package at.voyagers.common.order.domain

data class OrderVariant(
    val variantId: String,
    val price: Double,
    val quantity: Int,
) {
    companion object {
        fun create(
            variantId: String,
            price: Double,
            quantity: Int,
        ) = OrderVariant(
            variantId = variantId,
            price = price,
            quantity = quantity,
        )
    }
}
