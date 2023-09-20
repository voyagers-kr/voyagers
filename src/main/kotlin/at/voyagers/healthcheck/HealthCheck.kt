package at.voyagers.healthcheck

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/ping")
class HealthCheck {

    fun ping(): String {
        return "pong"
    }
}
