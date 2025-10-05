package DocSync.api

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DocSyncApiApplication

fun main(args: Array<String>) {
	runApplication<DocSyncApiApplication>(*args)
}
