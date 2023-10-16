package at.voyagers.common.account.infra

import at.voyagers.common.account.domain.Account
import at.voyagers.common.account.domain.AccountRepository
import org.springframework.stereotype.Repository

@Repository
class AccountJpaRepository : AccountRepository {
    override fun save(account: Account): Account {
        TODO("Not yet implemented")
    }
}