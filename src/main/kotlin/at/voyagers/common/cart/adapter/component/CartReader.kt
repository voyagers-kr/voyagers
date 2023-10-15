package at.voyagers.common.cart.adapter.component

import at.voyagers.common.cart.domain.Cart
import org.springframework.stereotype.Component
import java.util.*
import kotlin.random.Random

@Component
class CartReader {

    fun read(cartId: Long): Cart {
        return Cart(
            id = Random.nextLong(),
            customerId = Random.nextLong(),
            variants = mutableListOf(),
        )
    }
}
