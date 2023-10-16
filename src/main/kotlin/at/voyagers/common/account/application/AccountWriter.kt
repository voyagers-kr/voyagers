package at.voyagers.common.account.application

import at.voyagers.common.account.domain.Account
import at.voyagers.common.account.domain.AccountRepository
import at.voyagers.common.account.domain.AccountRole
import org.springframework.stereotype.Component

@Component
class AccountWriter(
    private val accountRepository: AccountRepository
) {
    fun createAccount(createAccountSpec: CreateAccountSpec): Account {
        val account = Account(
            email = createAccountSpec.email,
            password = createAccountSpec.password,
            AccountRole.CUSTOMER,
        )
        return accountRepository.save(account)
    }
}