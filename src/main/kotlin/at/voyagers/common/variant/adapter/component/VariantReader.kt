package at.voyagers.common.variant.adapter.component

import at.voyagers.common.variant.domain.Variant
import org.springframework.stereotype.Component
import kotlin.random.Random

@Component
class VariantReader {

    fun read(variantId: Long): Variant {
        return Variant(
            id = Random.nextLong(),
            productId = Random.nextLong(),
            quantity = Random.nextInt(),
        )
    }
}
