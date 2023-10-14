package at.voyagers.common.customer.domain

class CreateCustomerSpec(val name: String, val phone: String, val address: String) {
    init {
        validateName(name)
        validatePhone(phone)
        validateAddress(address)
    }

    private fun validateAddress(address: String) {
        if (address.isBlank()) throw IllegalArgumentException()
    }

    private fun validatePhone(phone: String) {
        if (phone.length != 8) throw IllegalArgumentException()
    }

    private fun validateName(name: String) {
        if (name.isBlank()) throw IllegalArgumentException()
    }
}