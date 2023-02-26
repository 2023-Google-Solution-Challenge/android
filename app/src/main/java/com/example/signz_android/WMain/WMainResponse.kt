package com.example.signz_android.WMain

import com.google.gson.annotations.SerializedName

data class WMainRecruitResponse(
    @SerializedName("isSuccess") val isSuccess: Boolean,
    @SerializedName("code") val code: Int,
    @SerializedName("message") val message: String,
    @SerializedName("result") val result: List<WMainRecruitResult>,
)
data class WMainRecruitResult(
    @SerializedName(value = "shop") val shop: String,
    @SerializedName(value = "title") val title: String,
    @SerializedName(value = "pay") val pay: String,
    @SerializedName(value = "rating") val rating: Int,
    @SerializedName(value = "reliability") val reliability: Int,
)

data class WMainManageResponse(
    @SerializedName("isSuccess") val isSuccess: Boolean,
    @SerializedName("code") val code: Int,
    @SerializedName("message") val message: String,
    @SerializedName("result") val result: List<WMainManageResult>,
)
data class WMainManageResult(
    @SerializedName(value = "shop") val shop: String,
    @SerializedName(value = "date") val date: String,
    @SerializedName(value = "time") val time: String,
    @SerializedName(value = "period") val period: String,
)
