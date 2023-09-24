package at.voyagers.common.variant.domain

import at.voyagers.common.product.domain.OptionType

data class VariantOption(
    val productId: String,
    val optionType: OptionType,
    val optionValue: String
)
