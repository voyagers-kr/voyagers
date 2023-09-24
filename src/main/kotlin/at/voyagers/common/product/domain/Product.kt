package at.voyagers.common.product.domain

data class Product(
    val id: String,
    val name: String,
    val description: String,
    val price: Double,
    val quantity: Int,

    val status: ProductStatus,
    val categoryId: String,
)
