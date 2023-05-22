package com.example.kotlincrudcd

import kotlin.random.Random

data class StudentModel(
    var id: Int = generateAutoId(),
    var name: String = "",
    var email: String = ""
) {
    companion object {
        fun generateAutoId(): Int {
            val random = Random
            return random.nextInt(100)
        }
    }
}
