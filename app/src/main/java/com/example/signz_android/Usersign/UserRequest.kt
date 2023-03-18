package com.example.signz_android.Usersign

import com.google.gson.annotations.SerializedName

data class FindIdRequest(
    @SerializedName(value = "name")val name: String,
    @SerializedName(value = "number")val number: Number
)

data class FindPwRequest(
    @SerializedName(value = "email")val email: String,
    @SerializedName(value = "name")val name: String,
    @SerializedName(value = "number")val number: Number
)
