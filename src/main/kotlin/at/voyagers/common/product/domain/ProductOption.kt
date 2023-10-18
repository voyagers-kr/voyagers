package at.voyagers.common.product.domain

data class ProductOption(
    val id: Long? = null,
    val productId: Long? = null,
    val option: String,
    val price: Double,
    val quantity: Int,
)
