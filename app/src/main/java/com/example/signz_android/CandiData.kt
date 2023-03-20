package com.example.signz_android

data class CandiData (
    var user_name: String,
    var workday: String,
    var confi_score: String
){
    fun getData1(): String?{
        return user_name
    }
    fun setData1(name:String){
        this.user_name = user_name
    }
    fun getData2(): String?{
        return workday
    }
    fun setData2(title: String){
        this.workday = workday
    }
    fun getData3(): String?{
        return confi_score
    }
    fun setData4(date: String){
        this.confi_score = confi_score
    }
}