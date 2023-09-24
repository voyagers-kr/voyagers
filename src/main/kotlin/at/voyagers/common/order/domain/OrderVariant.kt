package at.voyagers.common.order.domain

data class OrderVariant(
    val variantId: String,
    val price: String,
    val quantity: Int,
)
