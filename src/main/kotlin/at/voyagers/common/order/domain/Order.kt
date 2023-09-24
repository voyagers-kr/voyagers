package at.voyagers.common.order.domain

data class Order(
    val id: String,
    val customerId: String,
    val vendorId: String,
    val variants: List<OrderVariant>,
    val vendorAddress: OrderAddress,
    val customerAddress: OrderAddress,
)
