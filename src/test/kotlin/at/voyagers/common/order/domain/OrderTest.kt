package at.voyagers.common.order.domain

import org.assertj.core.api.Assertions.assertThatThrownBy
import org.junit.jupiter.api.Test

class OrderTest {

    @Test
    fun `고객 id가 없을 경우 예외발생`() {
        val customerId = null

        assertThatThrownBy { Order.fixture(customerId) }
            .isInstanceOf(IllegalArgumentException::class.java)
    }

    @Test
    fun `주문품목이 비어있는 경우 예외 발생`() {
        val variants = emptyList<OrderVariant>()

        assertThatThrownBy { Order.fixture(variants = variants) }
            .isInstanceOf(IllegalArgumentException::class.java)
    }
}
