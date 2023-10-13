package at.voyagers.common.order.infrastructure

import at.voyagers.common.order.domain.OrderVariant

class OrderVariantEntity {

    fun toDomain(): OrderVariant {
        return OrderVariant.fixture()
    }
}