package at.voyagers.common.account.domain

data class CreateAccountSpec(
    val email: String,
    val password: String,
) {
    init {
        validateEmail(email)
        validatePassword(password)
    }

    private fun validatePassword(password: String) {
        if (password.length < 8) throw IllegalArgumentException()
    }

    private fun validateEmail(email: String) {
        when {
            !email.contains("@") -> throw IllegalArgumentException()
        }
    }

    fun toDomain(): Account {
        return Account(email, password, AccountRole.CUSTOMER)
    }

}