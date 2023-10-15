package at.voyagers.common.cart.business

import at.voyagers.common.cart.adapter.component.CartReader
import at.voyagers.common.cart.business.request.AddCartVariantRequest
import at.voyagers.common.cart.domain.Cart
import at.voyagers.common.variant.adapter.component.VariantReader
import at.voyagers.common.variant.domain.Variant
import com.ninjasquad.springmockk.MockkBean
import io.mockk.every
import io.mockk.justRun
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest
import kotlin.random.Random

@SpringBootTest
class AddCartVariantTest {

    @MockkBean
    lateinit var cartReader: CartReader

    @MockkBean
    lateinit var variantReader: VariantReader

    @Test
    fun `Cart에 Variant를 추가한다`() {
        every { cartReader.read(any()) } returns Cart(
            id = Random.nextLong(),
            customerId = Random.nextLong(),
            variants = mutableListOf(),
        )
        every { variantReader.read(any()) } returns Variant(
            id = Random.nextLong(),
            productId = Random.nextLong(),
            quantity = Random.nextInt(),
        )

        // given
        val addCartVariant = AddCartVariant(cartReader, variantReader)

        // when
        val result = addCartVariant.execute(AddCartVariantRequest(Random.nextLong(), Random.nextLong(), Random.nextLong(), Random.nextInt(),))

        // then
        assertTrue(result)
    }
}
