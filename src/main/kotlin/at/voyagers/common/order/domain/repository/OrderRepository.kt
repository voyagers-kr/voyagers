package at.voyagers.common.order.domain.repository

import at.voyagers.common.order.domain.Order

interface OrderRepository {

    fun save(order: Order): Order

}