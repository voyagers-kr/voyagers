package at.voyagers.common.variant.domain

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class VariantTest {

    @Test
    fun create() {
        Variant.create(productId = 0L, quantity = 10).apply {
            assertThat(id).isNull()
            assertThat(productId).isNotNull
            assertThat(quantity).isGreaterThan(0)
        }
    }
}
