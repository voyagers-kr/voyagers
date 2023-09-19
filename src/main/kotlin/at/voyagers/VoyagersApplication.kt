package at.voyagers

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class VoyagersApplication

fun main(args: Array<String>) {
	runApplication<VoyagersApplication>(*args)
}
