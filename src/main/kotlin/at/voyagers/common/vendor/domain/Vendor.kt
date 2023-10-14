package at.voyagers.common.vendor.domain

data class Vendor(
    val id: Long,
    val name: String,
    val phone: String,
    val address: String,

    val accountId: Long,

    val brand: String,
)
