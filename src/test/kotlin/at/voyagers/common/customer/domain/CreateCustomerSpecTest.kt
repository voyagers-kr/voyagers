package at.voyagers.common.customer.domain

import org.assertj.core.api.Assertions.assertThat
import org.assertj.core.api.Assertions.assertThatThrownBy
import org.junit.jupiter.api.Test

class CreateCustomerSpecTest {

    @Test
    fun `올바른 정보로 요청 시 소비자가 생성된다`() {
        // given
        val validName = "jaewon"
        val validPhone = "01012341234"
        val validAddress = "경기도 시흥시 ..."

        // when
        val createCustomerSpec = CreateCustomerSpec(name = validName, phone = validPhone, address = validAddress)

        // then
        assertThat(createCustomerSpec.name).isEqualTo(validName)
        assertThat(createCustomerSpec.phone).isEqualTo(validPhone)
        assertThat(createCustomerSpec.address).isEqualTo(validAddress)
    }

    @Test
    fun `유효하지 않은 이름으로 요청 시 예외가 발생한다`() {
        // given
        val invalidName = ""

        // when - then
        assertThatThrownBy { CreateCustomerSpec(name = invalidName, phone = "01012341234", address = "경기도 시흥시 ...") }
            .isInstanceOf(IllegalArgumentException::class.java)
    }

    @Test
    fun `유효하지 않은 전화번호로 요청 시 예외가 발생한다`() {
        // given
        val invalidPhone = "010123412341"

        // when - then
        assertThatThrownBy { CreateCustomerSpec(name = "jaewon", phone = invalidPhone, address = "경기도 시흥시 ...") }
            .isInstanceOf(IllegalArgumentException::class.java)
    }

    @Test
    fun `유효하지 않은 주소로 요청 시 예외가 발생한다`() {
        // given
        val invalidAddress = ""

        // when - then
        assertThatThrownBy { CreateCustomerSpec(name = "jaewon", phone = "01012341234", address = invalidAddress) }
            .isInstanceOf(IllegalArgumentException::class.java)
    }
}