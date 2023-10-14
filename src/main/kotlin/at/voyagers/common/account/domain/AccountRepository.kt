package at.voyagers.common.account.domain

import org.springframework.stereotype.Repository

@Repository
interface AccountRepository {

    fun save(account: Account): Account
}