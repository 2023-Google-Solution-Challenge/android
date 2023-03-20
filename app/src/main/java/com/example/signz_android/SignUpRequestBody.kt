package com.example.signz_android

import com.google.gson.annotations.SerializedName
import java.time.LocalDate
import java.util.*

data class SignUpRequestBody(
    @SerializedName("email") val email: String,
    @SerializedName("password") val password: String,
    @SerializedName("birth") val birth: String,
    @SerializedName("name") val name: String,
    @SerializedName("nickname") val nickname: String,
    @SerializedName("phone") val phone: String,
    @SerializedName("latitude") val latitude: Double,
    @SerializedName("longitude") val longitude: Double,
)
