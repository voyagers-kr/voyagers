package at.voyagers.common.vendor.domain

data class Vendor(
    val id: Long? = null,
    val name: String,
    val phone: String,
    val address: String,

    val accountId: Long? = null,

    val brand: String,
)
