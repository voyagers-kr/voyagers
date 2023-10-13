package at.voyagers.common.order.infrastructure

import at.voyagers.common.order.domain.OrderVariant
import at.voyagers.common.order.domain.OrderVariantRepository
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
class OrderVariantJpaRepository(
    private val orderVariantEntityRepository: OrderVariantEntityRepository,
) : OrderVariantRepository {

}

interface OrderVariantEntityRepository : JpaRepository<OrderVariantEntity, String>

fun OrderVariant.toEntity(): OrderVariantEntity {
    return OrderVariantEntity()
}