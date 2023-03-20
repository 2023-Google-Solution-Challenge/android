package com.example.signz_android

import com.google.gson.annotations.SerializedName
import java.util.Date

data class PolicyResponse(
    @SerializedName("status") val status: Int,
    @SerializedName("data") val data: String
)
