package at.voyagers.common.variant.adapter.component

import at.voyagers.common.variant.domain.Variant
import org.springframework.stereotype.Component
import java.util.*

@Component
class VariantReader {

    fun read(variantId: String): Variant {
        return Variant(
            id = UUID.randomUUID().toString(),
            productId = UUID.randomUUID().toString(),
            quantity = Random().nextInt(),
        )
    }
}
