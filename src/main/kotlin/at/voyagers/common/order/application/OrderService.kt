package at.voyagers.common.order.application

import at.voyagers.common.order.domain.Order
import at.voyagers.common.order.domain.OrderCreateSpec
import org.springframework.stereotype.Service

@Service
class OrderService(
    private val orderManager: OrderManager,
) {
    fun create(orderCreateSpec: OrderCreateSpec): Order {
        return orderManager.place(orderCreateSpec.toDomain())
    }
}