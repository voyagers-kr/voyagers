package at.voyagers.common.vendor.domain

data class Vendor(
    val id: String,
    val name: String,
    val phone: String,
    val address: String,

    val accountId: String,

    val brand: String,
)
