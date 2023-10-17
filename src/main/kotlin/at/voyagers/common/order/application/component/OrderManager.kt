package at.voyagers.common.order.application.component

import at.voyagers.common.order.domain.Order
import org.springframework.stereotype.Component
import org.springframework.transaction.annotation.Transactional

@Component
class OrderManager(
    private val orderWriter: OrderWriter,
    private val productWriter: ProductWriter,
) {

    @Transactional
    fun place(order: Order): Order {
        val createdOrder = orderWriter.create(order)
        createdOrder.orderVariants.forEach {
            productWriter.decrease(it.variantId, it.quantity)
        }
        return createdOrder
    }

}