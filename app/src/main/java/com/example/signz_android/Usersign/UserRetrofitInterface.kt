package com.example.signz_android.Usersign

import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST

interface UserRetrofitInterface {
    @POST("/")
    fun findId(@Body findIdRequest: FindIdRequest): Call<UserResponse>
    @POST("/")
    fun findPw(@Body findPwRequest: FindPwRequest): Call<UserResponse>
}