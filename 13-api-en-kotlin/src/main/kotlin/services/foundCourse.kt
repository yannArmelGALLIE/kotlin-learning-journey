package com.example.services

import com.example.models.Course

fun foundCourse(tableau: List<Course>, id: Int?): Course? {
    return tableau.find { course -> course.id == id }
}