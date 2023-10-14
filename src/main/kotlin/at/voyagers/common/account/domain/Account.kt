package at.voyagers.common.account.domain

data class Account(
    val email: String,
    val password: String,
    val role: AccountRole,
    var id: Long? = null,
)
