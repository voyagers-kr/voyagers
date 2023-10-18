package at.voyagers.common.account.domain

import org.springframework.data.jpa.repository.JpaRepository


interface AccountRepository: JpaRepository<Account, Long>