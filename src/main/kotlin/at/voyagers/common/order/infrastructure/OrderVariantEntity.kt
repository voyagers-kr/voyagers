package at.voyagers.common.order.infrastructure

import at.voyagers.common.order.domain.OrderVariant
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id

@Entity
class OrderVariantEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null

    fun toDomain(): OrderVariant {
        return OrderVariant.fixture()
    }
}