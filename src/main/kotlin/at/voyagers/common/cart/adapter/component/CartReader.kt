package at.voyagers.common.cart.adapter.component

import at.voyagers.common.cart.domain.Cart
import org.springframework.stereotype.Component
import java.util.*

@Component
class CartReader {

    fun read(cartId: String): Cart {
        return Cart(
            id = UUID.randomUUID().toString(),
            customerId = UUID.randomUUID().toString(),
            variants = mutableListOf(),
        )
    }
}
