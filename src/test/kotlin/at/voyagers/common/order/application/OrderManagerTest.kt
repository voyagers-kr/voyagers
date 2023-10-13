package at.voyagers.common.order.application

import at.voyagers.common.order.domain.Order
import at.voyagers.common.order.temp.ProductWriter
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.mockito.ArgumentMatchers.any
import org.mockito.BDDMockito.given
import org.mockito.InjectMocks
import org.mockito.Mock
import org.mockito.junit.jupiter.MockitoExtension

@ExtendWith(MockitoExtension::class)
class OrderManagerTest {

    init {

    }
    @Mock lateinit var orderWriter: OrderWriter
    @Mock lateinit var productWriter: ProductWriter
    @InjectMocks lateinit var orderManager: OrderManager

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