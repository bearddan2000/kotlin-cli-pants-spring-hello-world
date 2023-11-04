package example

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.runApplication
import org.springframework.boot.CommandLineRunner;

@SpringBootApplication
open class App : CommandLineRunner {
    override fun run(vararg args: String): Unit {
        println("Hello world!")
    }
}

fun main(args: Array<String>) {
    runApplication<App>(*args)
}
