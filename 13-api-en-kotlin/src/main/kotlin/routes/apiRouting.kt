package com.example.routes

import com.example.models.Course
import com.example.models.ErrorCourse
import com.example.services.courseExt
import com.example.services.foundCourse
import com.example.services.welcome
import io.ktor.http.HttpStatusCode
import io.ktor.server.plugins.origin
import io.ktor.server.request.host
import io.ktor.server.request.port
import io.ktor.server.response.respond
import io.ktor.server.response.respondText
import io.ktor.server.routing.Route
import io.ktor.server.routing.get
import io.ktor.server.routing.route

fun Route.apiRouting() {
    val coursesList = listOf<Course>(
        Course(0,"API".courseExt(), 8, true),
    Course(1,"classes".courseExt(), 2, false),
    Course(2,"variables".courseExt(), 3, false)
    )

    route("/") {
        get {
            val text: String = "OpenClassrooms".welcome()
            val scheme: String = call.request.origin.scheme
            val host: String = call.request.host()
            val port: Int = call.request.port()
            call.respondText(text)
            println("Le message \"$text\" est sur la page $scheme://$host:$port")
        }

        get("/course/{id}") {
            val id = call.parameters["id"]?.toIntOrNull()
            val course = foundCourse(coursesList, id)
            if (course != null) {
                call.respond(course)
            } else {
                val erreur = ErrorCourse(404, "Aucun cours trouvé")
                call.respond(HttpStatusCode.NotFound, erreur)
            }
        }

        get("/course/top") {
            val courseTop = foundCourse(coursesList, 0)
            if (courseTop != null) {
                call.respond(courseTop)
            } else {
                val erreur = ErrorCourse(404, "Aucun cours trouvé")
                call.respond(HttpStatusCode.NotFound, erreur)
            }
        }
    }
}
