package at.voyagers.common.order.domain

import at.voyagers.common.order.domain.OrderStatus.PENDING_PAYMENT

class Order(
    val id: String? = null,
    val customerId: String,
    val orderVariants: MutableList<OrderVariant>,
    val customerAddress: OrderAddress,
    val status: OrderStatus = PENDING_PAYMENT,
) {

    init {
        require(orderVariants.isNotEmpty()) { "Order must have at least one variant" }
    }

    companion object {
        fun fixture(
            customerId: String = "customerId",
            orderVariants: MutableList<OrderVariant> = mutableListOf(OrderVariant.fixture()),
            customerAddress: OrderAddress = OrderAddress(),
            id: String? = null,
        ): Order {
            return Order(
                id = id,
                customerId = customerId,
                orderVariants = orderVariants,
                customerAddress = customerAddress,
            )
        }
    }

    fun addOrderVariants(orderVariants: MutableList<OrderVariant>) {
        this.orderVariants.addAll(orderVariants)
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Order

        return id == other.id
    }

    override fun hashCode(): Int {
        return id?.hashCode() ?: 0
    }
}

data class OrderCreateSpec(
    val customerId: String,
    val vendorId: String,
    val orderVariants: MutableList<OrderVariant>,
    val customerAddress: OrderAddress,
) {
    fun toDomain(): Order {
        return Order(
            customerId = customerId,
            orderVariants = orderVariants,
            customerAddress = customerAddress,
        )
    }
}
