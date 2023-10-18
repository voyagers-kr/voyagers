package at.voyagers.common.vendor.domain

data class VendorSettlement(
    val id: Long? = null,
    val vendorId: Long? = null,
    val bankAccount: String,
    val bankName: String,
    val bankHolder: String,
)
