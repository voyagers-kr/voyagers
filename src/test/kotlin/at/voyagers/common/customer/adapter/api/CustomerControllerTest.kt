package at.voyagers.common.customer.adapter.api

import at.voyagers.common.customer.adapter.api.CustomerController.CustomerCreateRequest
import at.voyagers.common.customer.adapter.api.CustomerController.CustomerCreateResponse
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.web.client.TestRestTemplate
import org.springframework.boot.test.web.client.postForEntity
import org.springframework.http.HttpStatus

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class CustomerControllerTest(@Autowired val restTemplate: TestRestTemplate) {

    @Test
    fun `Assert customer create body and status code`() {
        // given
        val request = CustomerCreateRequest("test@test.com", "test1234!", "boyagers", "01012341234", "AAA BBB CCC...")

        // when
        val response = restTemplate.postForEntity<CustomerCreateResponse>(url = "/api/v1/customers", request = request)

        // then
        assertThat(response.statusCode).isEqualTo(HttpStatus.OK)
        assertThat(response.body).isNotNull()
    }

}