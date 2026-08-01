package com.example.services

import io.ktor.server.routing.*

fun String.welcome(): String = "Welcome to $this brand new server !"