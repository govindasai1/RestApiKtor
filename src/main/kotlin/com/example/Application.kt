package com.example

import com.example.plugins.*
import io.ktor.server.application.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*

fun main() {
    embeddedServer(Netty, port = 8082, host = "127.0.0.2", module = Application::module)
        .start(wait = true)
}
//hello send commit updation
fun Application.module() {
    configureRouting()
}
