package at.voyagers.common.customer.application.spec

class CustomerCreateSpec(
    email: String,
    password: String,
    name: String,
    phone: String,
    address: String
) {
    val accountSpec = AccountSpec(email, password)
    val customerSpec = CustomerSpec(name, phone, address)
}

data class CustomerSpec(
    val name: String,
    val phone: String,
    val address: String,
) {
    init {
        validateName(name)
        validatePhone(phone)
        validateAddress(address)
    }

    private fun validateAddress(address: String) {
        if (address.isBlank()) throw IllegalArgumentException()
    }

    private fun validatePhone(phone: String) {
        if (phone.length != 11) throw IllegalArgumentException()
    }

    private fun validateName(name: String) {
        if (name.isBlank()) throw IllegalArgumentException()
    }
}

data class AccountSpec(
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
}