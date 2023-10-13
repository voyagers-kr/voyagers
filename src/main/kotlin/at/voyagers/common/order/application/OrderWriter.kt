package at.voyagers.common.order.application

import at.voyagers.common.order.domain.Order
import at.voyagers.common.order.domain.OrderRepository
import org.springframework.stereotype.Component
import org.springframework.transaction.annotation.Transactional

@Component
class OrderWriter(
    private val orderRepository: OrderRepository,
) {

    @Transactional
    fun create(order: Order): Order {
        return orderRepository.save(order)
    }

}