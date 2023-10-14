package at.voyagers.common.order.application

import io.mockk.impl.annotations.InjectMockKs
import io.mockk.impl.annotations.MockK
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.mockito.junit.jupiter.MockitoExtension

@ExtendWith(MockitoExtension::class)
class OrderManagerTest {

    @MockK lateinit var orderWriter: OrderWriter
    @MockK lateinit var productWriter: ProductWriter
    @InjectMockKs lateinit var orderManager: OrderManager

    @Test
    fun placeTest() {
        // given

        // when

        // then
    }
}