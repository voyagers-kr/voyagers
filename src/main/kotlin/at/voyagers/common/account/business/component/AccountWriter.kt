package at.voyagers.common.account.business.component

import at.voyagers.common.account.domain.Account
import at.voyagers.common.account.domain.AccountRepository
import at.voyagers.common.account.domain.AccountRole
import at.voyagers.common.account.domain.CreateAccountSpec
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