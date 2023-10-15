package at.voyagers.common.cart.business.request

data class AddCartVariantRequest(
    val customerId: Long,
    val cartId: Long,
    val variantId: Long,
    val quantity: Int,
)
