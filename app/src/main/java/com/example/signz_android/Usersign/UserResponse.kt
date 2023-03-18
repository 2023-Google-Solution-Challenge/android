package com.example.signz_android.Usersign

import com.google.gson.annotations.SerializedName

data class UserResponse(
    @SerializedName("isSuccess") val isSuccess: Boolean,
    @SerializedName("code") val code: Int,
    @SerializedName("message") val message: String,
    @SerializedName("result") val findAccountResult: FindAccountResult?
)
data class FindAccountResult(
    @SerializedName("id") val id: String?,
)
