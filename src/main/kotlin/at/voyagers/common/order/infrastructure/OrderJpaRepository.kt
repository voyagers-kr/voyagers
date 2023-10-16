package at.voyagers.common.order.infrastructure

import at.voyagers.common.order.domain.Order
import at.voyagers.common.order.domain.OrderRepository
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
class OrderJpaRepository(
    private val orderEntityRepository: OrderEntityRepository,
    private val orderVariantEntityRepository: OrderVariantEntityRepository,
) : OrderRepository {

    override fun save(order: Order): Order {
        val createdOrder = orderEntityRepository.save(order.toEntity()).toDomain()
        val createdOrderVariants =
            orderVariantEntityRepository.saveAll(createdOrder.orderVariants.map { it.toEntity() })
        createdOrder.addOrderVariants(createdOrderVariants.map { it.toDomain() }
            .toCollection(mutableListOf()))
        return createdOrder
    }

}

interface OrderEntityRepository : JpaRepository<OrderEntity, Long> {

}

fun Order.toEntity(): OrderEntity {
    return OrderEntity()
}