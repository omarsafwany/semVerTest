package com.example.semVerTest

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SemVerTestApplication

fun main(args: Array<String>) {
	println("print msg")
	runApplication<SemVerTestApplication>(*args)
}
