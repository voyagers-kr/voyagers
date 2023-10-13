package at.voyagers.common.order.infrastructure

import at.voyagers.common.order.domain.Order

class OrderEntity {

    fun toDomain(): Order {
        return Order.fixture()
    }
}