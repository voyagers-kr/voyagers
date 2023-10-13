package at.voyagers.common.order.application

import at.voyagers.common.order.domain.Order
import io.mockk.impl.annotations.InjectMockKs
import io.mockk.impl.annotations.MockK
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.mockito.ArgumentMatchers.any
import org.mockito.BDDMockito.given
import org.mockito.junit.jupiter.MockitoExtension

@ExtendWith(MockitoExtension::class)
class OrderManagerTest {

    @MockK lateinit var orderWriter: OrderWriter
    @MockK lateinit var productWriter: ProductWriter
    @InjectMockKs lateinit var orderManager: OrderManager

    @Test
    fun placeTest() {
        // given
        val order = Order.fixture()
        given(orderWriter.create(any())).willReturn(order)
        given(productWriter.decrease(any(), any())).willReturn(Unit)

        // when
        val createdOrder = orderManager.place(order)

        // then
        assert(createdOrder == order)
    }
}