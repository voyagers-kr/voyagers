package at.voyagers.common.product.domain

data class ProductOption(
    val id: String,
    val productId: String,
    val option: String,
    val price: Double,
    val quantity: Int,
)
