package at.voyagers.common.product.domain

data class ProductOption(
    val id: Long,
    val productId: Long,
    val option: String,
    val price: Double,
    val quantity: Int,
)
