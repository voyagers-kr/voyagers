package at.voyagers.common.order.ui

import at.voyagers.common.order.application.OrderService
import at.voyagers.common.order.domain.Order
import at.voyagers.common.order.domain.OrderAddress
import at.voyagers.common.order.domain.OrderCreateSpec
import at.voyagers.common.order.domain.OrderVariant
import org.springframework.http.HttpStatus.CREATED
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController

@RestController
class OrderController(
    private val orderService: OrderService
) {

    @ResponseStatus(CREATED)
    @PostMapping("/orders")
    fun postOrder(@RequestBody request: OrderCreateRequest): Order {
        return orderService.create(request.toOrderCreateSpec())
    }

}

data class OrderCreateRequest(
    val customerId: Long,
    val vendorId: Long,
    val orderVariants: MutableList<OrderVariant>,
    val customerAddress: OrderAddress,
) {
    fun toOrderCreateSpec(): OrderCreateSpec {
        return OrderCreateSpec(
            customerId = customerId,
            orderVariants = orderVariants,
            customerAddress = customerAddress,
        )
    }
}

