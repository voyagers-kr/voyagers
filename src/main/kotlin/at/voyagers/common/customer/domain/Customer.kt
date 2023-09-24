package at.voyagers.common.customer.domain

data class Customer(
    val id: String,
    val name: String,
    val phone: String,

    val accountId: String
)
