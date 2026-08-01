package com.example.models

import kotlinx.serialization.Serializable

@Serializable
class ErrorCourse(val status: Int, val message: String) {}