package at.voyagers.common.product.domain

data class ProductOption(
    val id: String,
    val productId: String,
    val options: Map<OptionType, List<String>>
)
