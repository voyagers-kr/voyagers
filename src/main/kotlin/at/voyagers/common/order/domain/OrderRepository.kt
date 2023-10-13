package at.voyagers.common.order.domain

interface OrderRepository {

    fun save(order: Order): Order

}