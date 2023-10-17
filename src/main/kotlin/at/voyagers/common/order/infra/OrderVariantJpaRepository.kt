package at.voyagers.common.order.infra

import at.voyagers.common.order.domain.OrderVariant
import at.voyagers.common.order.domain.OrderVariantRepository
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
class OrderVariantJpaRepository(
    private val orderVariantEntityRepository: OrderVariantEntityRepository,
) : OrderVariantRepository {

}

interface OrderVariantEntityRepository : JpaRepository<OrderVariantEntity, Long>

fun OrderVariant.toEntity(order: OrderEntity): OrderVariantEntity {
    return OrderVariantEntity(
        order = order,
        quantity = this.quantity,
        price = this.price,
        variantId = this.variantId,
    )
}