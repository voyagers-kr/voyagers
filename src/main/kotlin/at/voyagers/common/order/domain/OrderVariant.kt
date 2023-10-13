package at.voyagers.common.order.domain

data class OrderVariant(
    val variantId: String,
    val price: String,
    val quantity: Int,
) {

    companion object {
        fun fixture(
            variantId: String = "variantId",
            price: String = "price",
            quantity: Int = 1,
        ): OrderVariant {
            return OrderVariant(
                variantId = variantId,
                price = price,
                quantity = quantity,
            )
        }
    }

}
