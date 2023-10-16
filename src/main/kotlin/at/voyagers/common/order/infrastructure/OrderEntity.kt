package at.voyagers.common.order.infrastructure

import at.voyagers.common.order.domain.Order
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType.IDENTITY
import jakarta.persistence.Id

@Entity
class OrderEntity {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    var id: Long? = null

    fun toDomain(): Order {
        return Order.fixture()
    }
}