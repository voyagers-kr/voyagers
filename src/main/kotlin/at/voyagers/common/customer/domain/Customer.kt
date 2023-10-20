package at.voyagers.common.customer.domain

data class Customer(
    val id: Long? = null,
    val name: String,
    val phone: String,

    val accountId: Long
)
