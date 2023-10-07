package at.voyagers.common.cart.domain

import at.voyagers.common.variant.domain.Variant

data class Cart(
    val id: String,
    val customerId: String,
    val variants: List<Variant>,
)
