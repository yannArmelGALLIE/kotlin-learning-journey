package com.example

import com.example.routes.apiRouting
import io.ktor.serialization.kotlinx.json.json

import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import io.ktor.server.plugins.contentnegotiation.*

fun Application.configureRouting() {

    install(ContentNegotiation) {
        json()
    }
    routing {
        apiRouting()
    }
}