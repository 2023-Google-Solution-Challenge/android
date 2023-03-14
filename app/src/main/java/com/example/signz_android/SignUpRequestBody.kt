package com.example.signz_android

import java.time.LocalDate
import java.util.*

data class SignUpRequestBody(
    val email: String,
    val password: String,
    val birth: LocalDate,
    val name: String,
    val nickname: String,
    val phone: String,
    val latitude: Double,
    val longitude: Double,
)
