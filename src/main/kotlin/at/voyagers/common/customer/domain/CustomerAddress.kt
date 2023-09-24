package at.voyagers.common.customer.domain

data class CustomerAddress(
    val id: String,
    val customerId: String,
    val address: String,
    val default: Boolean
)
