package at.voyagers.common.vendor.domain

data class VendorSettlement(
    val id: String,
    val vendorId: String,
    val bankAccount: String,
    val bankName: String,
    val bankHolder: String,
)
