package gazssha.com.middleservice

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MiddleServiceApplication

fun main(args: Array<String>) {
	runApplication<MiddleServiceApplication>(*args)
}
