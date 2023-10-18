package at.voyagers.common.customer.domain

import at.voyagers.common.account.domain.Account
import jakarta.persistence.*

@Entity
class Customer(
    @Column(name = "name", nullable = false)
    val name: String,
    @Column(name = "phone", nullable = false)
    val phone: String,
    @OneToOne(optional = false, cascade = [CascadeType.ALL])
    @JoinColumn(
        name = "account_id", unique = true, nullable = false, updatable = false
    )
    val account: Account,
) {
    constructor() : this("", "", Account())

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customer_id", nullable = false)
    var id: Long? = null
}
