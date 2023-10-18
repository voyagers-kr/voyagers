package at.voyagers.common.product.domain

data class Product(
    val id: Long? = null,
    val name: String,
    val description: String,
    val price: Double,
    val status: ProductStatus,
    val categoryId: Long? = null,
)
