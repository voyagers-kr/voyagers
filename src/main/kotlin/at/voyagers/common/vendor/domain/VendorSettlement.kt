package at.voyagers.common.vendor.domain

data class VendorSettlement(
    val id: Long,
    val vendorId: Long,
    val bankAccount: String,
    val bankName: String,
    val bankHolder: String,
)
