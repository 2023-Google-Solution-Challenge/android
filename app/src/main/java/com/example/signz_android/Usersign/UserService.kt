package com.example.signz_android.Usersign

import android.util.Log
import com.example.signz_android.RetrofitClient
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class UserService {

    fun findId(findIdRequest: FindIdRequest) {
        val findIdService = RetrofitClient.getInstance().create(UserRetrofitInterface::class.java)

        findIdService.findId(findIdRequest).enqueue(object : Callback<UserResponse> {
            override fun onResponse(call: Call<UserResponse>, response: Response<UserResponse>) {
                if (response.isSuccessful && response.code() == 200) {
                    val findIdResponse: UserResponse = response.body()!!
                    Log.d("FINDACCOUNT-RESPONSE", findIdResponse.toString())

                    when (val code = findIdResponse.code) {
//                        1000 -> loginView.onLoginSuccess(code, loginResponse.result!!)
//                        else -> loginView.onLoginFailure()
                    }
                }
            }

            override fun onFailure(call: Call<UserResponse>, t: Throwable) {
                Log.d("FINDAACOUNT-ACT/ERROR", t.message.toString())
            }

        })
    }

}