package at.voyagers.common.customer.application

import at.voyagers.common.account.domain.Account
import at.voyagers.common.account.domain.AccountRole
import at.voyagers.common.customer.application.spec.CustomerCreateSpec
import at.voyagers.common.customer.domain.Customer
import at.voyagers.common.customer.domain.CustomerRepository
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
@Transactional
class CustomerService(
    private val customerRepository: CustomerRepository,
) {
    fun create(spec: CustomerCreateSpec): Long {
        val (email, password) = spec.accountSpec
        val account = Account(
            email = email,
            password = password,
            role = AccountRole.CUSTOMER
        )

        val (name, phone) = spec.customerSpec
        val customer = customerRepository.save(
            Customer(
                name = name,
                phone = phone,
                account = account,
            )
        )

        return customer.id!!
    }
}