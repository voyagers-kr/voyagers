package at.voyagers.common.customer.domain

data class Customer(
    val id: Long,
    val name: String,
    val phone: String,

    val accountId: Long
)
