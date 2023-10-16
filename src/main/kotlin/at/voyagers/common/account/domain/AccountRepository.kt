package at.voyagers.common.account.domain


interface AccountRepository {

    fun save(account: Account): Account
}