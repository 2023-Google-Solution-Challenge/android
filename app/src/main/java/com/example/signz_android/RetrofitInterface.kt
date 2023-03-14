package com.example.signz_android

import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST

interface RetrofitInterface {
    @POST("/users/signup/employee")
    fun addUserByEnqueue(
        @Body userInfo: SignUpRequestBody
    ): Call<PolicyResponse>

    @POST("/users/signup/employer")
    fun addOwnerByEnqueue(
        @Body userInfo: SignUpRequestBody
    ): Call<PolicyResponse>
}

