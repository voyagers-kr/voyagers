package at.voyagers.common.cart.business

import at.voyagers.common.cart.adapter.component.CartReader
import at.voyagers.common.cart.business.request.AddCartVariantRequest
import at.voyagers.common.variant.adapter.component.VariantReader
import com.ninjasquad.springmockk.MockkBean
import io.mockk.justRun
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest
import java.util.UUID

@SpringBootTest
class AddCartVariantTest {

    @MockkBean
    lateinit var cartReader: CartReader

    @MockkBean
    lateinit var variantReader: VariantReader

    @Test
    fun `Cart에 Variant를 추가한다`() {
        justRun { cartReader.read(any()) }
        justRun { variantReader.read(any()) }

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
