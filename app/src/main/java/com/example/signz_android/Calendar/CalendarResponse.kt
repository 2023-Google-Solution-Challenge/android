package com.example.signz_android.Calendar

import com.google.gson.annotations.SerializedName

data class WPayListResult(
    @SerializedName(value = "date") val date: String,
    @SerializedName(value = "pay") val pay: String,
    @SerializedName(value = "sum") val sum: String,
)
