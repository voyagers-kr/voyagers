package at.voyagers.common.order.domain

/**
 * Value Object
 * Order 에서 사용하는 주소
 */
data class OrderAddress(
    val name: String,
    val phone: String,
    val address: String,
)
