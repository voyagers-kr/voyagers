package at.voyagers.common.order.infra

import at.voyagers.common.order.domain.OrderVariant
import jakarta.persistence.*
import jakarta.persistence.FetchType.LAZY

@Entity
class OrderVariantEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,

    @ManyToOne(fetch = LAZY)
    val order: OrderEntity,

    @Column(nullable = false)
    val variantId: Long,

    val price: Int,

    val quantity: Int,
) {

    fun toDomain(): OrderVariant {
        return OrderVariant.fixture()
    }

}