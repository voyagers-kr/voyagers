package at.voyagers.common.account.domain

import org.assertj.core.api.Assertions.assertThat
import org.assertj.core.api.Assertions.assertThatThrownBy
import org.junit.jupiter.api.Test

class CreateAccountSpecTest {

    @Test
    fun `올바른 정보로 요청 시 계정이 생성된다`() {
        // given
        val validEmail = "test@test.com"
        val validPassword = "test1234!"

        // when
        val createAccountSpec = CreateAccountSpec(validEmail, validPassword)
        val account: Account = createAccountSpec.toDomain()

        // then
        assertThat(account.email).isEqualTo(validEmail)
        assertThat(account.password).isEqualTo(validPassword)
    }
    @Test
    fun `유효하지 않은 이메일로 요청 시 예외가 발생한다`() {
        // given
        val invalidEmail = "test_test.com"

        // when - then
        assertThatThrownBy { CreateAccountSpec(email = invalidEmail, "") }
            .isInstanceOf(IllegalArgumentException::class.java)
    }

    @Test
    fun `유효하지 않은 비밀번호로 요청 시 예외가 발생한다`() {
        // given
        val invalidPassword = ""

        // when - then
        assertThatThrownBy { CreateAccountSpec("test@test.com", password = invalidPassword) }
            .isInstanceOf(IllegalArgumentException::class.java)
    }

}
