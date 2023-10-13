package at.voyagers.common.order.domain

data class Order(
    val id: String? = null,
    val customerId: String?,
    val vendorId: String?,
    val variants: List<OrderVariant>,
    val vendorAddress: OrderAddress,
    val customerAddress: OrderAddress,
) {

    init {
        require(variants.isNotEmpty()) { "Order must have at least one variant" }
    }

    companion object {
        fun fixture(
            customerId: String? = "customerId",
            vendorId: String? = "vendorId",
            variants: List<OrderVariant> = mutableListOf(OrderVariant.fixture()),
            vendorAddress: OrderAddress = OrderAddress(),
            customerAddress: OrderAddress = OrderAddress(),
            id: String? = null,
        ): Order {
            return Order(
                id = id,
                customerId = customerId,
                vendorId = vendorId,
                variants = variants,
                vendorAddress = vendorAddress,
                customerAddress = customerAddress,
            )
        }
    }
}
