package com.example.signz_android.Calendar

import com.google.gson.annotations.SerializedName

data class PaylistData(
    @SerializedName(value = "date") val date: String,
    @SerializedName(value = "pay") val pay: String,
    @SerializedName(value = "detail") val detail: String,
)

data class NoticeData(
    @SerializedName(value = "notice") val notice: String,
)
