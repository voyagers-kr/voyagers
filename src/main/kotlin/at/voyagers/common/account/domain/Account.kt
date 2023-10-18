package at.voyagers.common.account.domain

import jakarta.persistence.*

@Entity
class Account(
    @Column(name = "email", nullable = false)
    val email: String,
    @Column(name = "password", nullable = false)
    val password: String,
    @Enumerated(EnumType.STRING)
    @Column(name = "account_role", nullable = false)
    val role: AccountRole,
) {
    constructor() : this("", "", AccountRole.CUSTOMER)

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "account_id", nullable = false)
    var id: Long? = null
}
