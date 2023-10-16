package at.voyagers.common.order.infrastructure

import at.voyagers.common.order.domain.Order
import at.voyagers.common.order.domain.OrderAddress
import at.voyagers.common.order.domain.OrderStatus
import jakarta.persistence.*
import jakarta.persistence.GenerationType.IDENTITY

@Entity
class OrderEntity(
    @JoinColumn(name = "order_id", referencedColumnName = "id")
    @OneToMany(mappedBy = "order", cascade = [CascadeType.ALL])
    val orderVariants: MutableList<OrderVariantEntity>,

    val customerId: Long,

    @Embedded
    val customerAddress: OrderAddress,

    @Enumerated(EnumType.STRING)
    val status: OrderStatus,
) {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    val id: Long? = null

    fun toDomain(): Order {
        return Order.fixture()
    }

}