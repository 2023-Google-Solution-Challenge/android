package com.example.signz_android.WMain

import android.util.Log
import com.example.signz_android.RetrofitClient
import retrofit2.Call
import retrofit2.Response
import javax.security.auth.callback.Callback

class WMainService {
    private lateinit var recruitView: WMainRecruitView
    private lateinit var manageView: WMainManageView

    fun setRecruitView(recruitView: WMainRecruitView){
        this.recruitView = recruitView
    }
    fun setManageView(manageView: WMainManageView){
        this.manageView = manageView
    }

//    fun recruit(recruitResult: WMainRecruitResult){
//        val recruitService = RetrofitClient.getInstance().create(WMainRetrofitInterface::class.java)
//
//        recruitService.wrecruit(recruitResult).enqueue(object : retrofit2.Callback<WMainRecruitResponse> {
//            override fun onResponse(call: Call<WMainRecruitResponse>, response: Response<WMainRecruitResponse>) {
//                if (response.isSuccessful && response.code() == 200) {
//                    val joinResponse: WMainRecruitResponse = response.body()!!
//
//                    Log.d("RECRUIT-RESPONSE", joinResponse.toString())
//                    when (joinResponse.code) {
//                        1000 -> recruitView.onWMainRecruitSuccess()
//                        else -> recruitView.onWMainRecruitFailure()
//                    }
//                }
//            }
//            override fun onFailure(call: Call<WMainRecruitResponse>, t: Throwable) {
//                Log.d("RECRUIT-ACT/ERROR", t.message.toString())
//            }
//        }))
//    }
}