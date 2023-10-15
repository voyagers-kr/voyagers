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
import java.util.*

@SpringBootTest
class AddCartVariantTest {

    @MockkBean
    lateinit var cartReader: CartReader

    @MockkBean
    lateinit var variantReader: VariantReader

    @Test
    fun `Cart에 Variant를 추가한다`() {
        every { cartReader.read(any()) } returns Cart(
            id = UUID.randomUUID().toString(),
            customerId = UUID.randomUUID().toString(),
            variants = mutableListOf(),
        )
        every { variantReader.read(any()) } returns Variant(
            id = UUID.randomUUID().toString(),
            productId = UUID.randomUUID().toString(),
            quantity = Random().nextInt(),
        )

        // given
        val addCartVariant = AddCartVariant(cartReader, variantReader)

        // when
        val result = addCartVariant.execute(AddCartVariantRequest(
            UUID.randomUUID().toString(),
            UUID.randomUUID().toString(),
            UUID.randomUUID().toString(),
            1
        ))

        // then
        assertTrue(result)
    }
}