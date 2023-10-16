package at.voyagers.common.cart.domain

import at.voyagers.common.variant.domain.Variant

data class Cart(
    val id: Long,
    val customerId: Long,
    val variants: List<Variant>,
)
