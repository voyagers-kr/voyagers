package at.voyagers.common.order.domain

class OrderVariant(
    val variantId: String,
    val price: String,
    val quantity: Int,
) {

    init {
        require(quantity > 0) { "Order variants must have a quantity greater than 0" }
    }

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

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as OrderVariant

        return variantId == other.variantId
    }

    override fun hashCode(): Int {
        return variantId.hashCode()
    }

}
