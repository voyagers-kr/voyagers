package at.voyagers.common.account.application.component

import at.voyagers.common.account.application.AccountWriter
import at.voyagers.common.account.domain.Account
import at.voyagers.common.account.domain.AccountRepository
import at.voyagers.common.account.domain.AccountRole
import at.voyagers.common.account.application.CreateAccountSpec
import org.assertj.core.api.Assertions
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class AccountWriterTest {

    private lateinit var sut : AccountWriter

    @BeforeEach
    fun setUp() {
        val accountRepository = object : AccountRepository {

            private val accounts: Map<Long, Account> = mutableMapOf()
            private var sequenceId: Long = 0L

            override fun save(account: Account): Account {
                account.id = ++sequenceId
                accounts[account.id] to account
                return account
            }
        }
        sut = AccountWriter(accountRepository)
    }

    @Test
    fun `스펙에 해당하는 소비자 계정이 생성된다`() {
        // given
        val createAccountSpec = CreateAccountSpec(email = "test@test.com", password = "test1234!")

        // when
        val account = sut.createAccount(createAccountSpec)

        // then
        Assertions.assertThat(account.email).isEqualTo(createAccountSpec.email)
        Assertions.assertThat(account.password).isEqualTo(createAccountSpec.password)
        Assertions.assertThat(account.id).isEqualTo(1L)
        Assertions.assertThat(account.role).isEqualTo(AccountRole.CUSTOMER)
    }
}