package at.voyagers.common.customer.adapter.api

import at.voyagers.common.customer.application.CustomerService
import at.voyagers.common.customer.application.spec.CustomerCreateSpec
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1/customers")
class CustomerController(
    private val customerService: CustomerService
) {
    @PostMapping
    fun create(
        @RequestBody request: CustomerCreateRequest
    ): ResponseEntity<CustomerCreateResponse> {
        val customerId = customerService.create(
            CustomerCreateSpec(
                email = request.email,
                password = request.password,
                name = request.name,
                phone = request.phone,
                address = request.address
            )
        )

        return ResponseEntity.ok(
            CustomerCreateResponse(
                customerId = customerId
            )
        )
    }

    data class CustomerCreateRequest(
        val email: String,
        val password: String,
        val name: String,
        val phone: String,
        val address: String,
    )

    data class CustomerCreateResponse(val customerId: Long)
}