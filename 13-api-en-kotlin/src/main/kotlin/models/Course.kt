package com.example.models

import kotlinx.serialization.Serializable

@Serializable
data class Course (var id: Int, var title: String, var level: Int, var isActive: Boolean) {

    init {
        println("Course created")
    }


}