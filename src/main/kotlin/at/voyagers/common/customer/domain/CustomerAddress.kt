package at.voyagers.common.customer.domain

data class CustomerAddress(
    val id: Long? = null,
    val customerId: Long? = null,
    val address: String,
    val default: Boolean,
)
