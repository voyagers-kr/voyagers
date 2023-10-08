package at.voyagers.common.account.domain

data class Account(
    var id: String?,
    val email: String,
    val password: String,
    val role: AccountRole,
)
