package com.example.signz_android

data class CandiData (
    var user_name: String,
    var workday: String,
    var worktime : String,
    var confi_score: String
){
    fun getData1(): String{
        return user_name
    }
    fun getData2(): String{
        return workday
    }
    fun getData3(): String{
        return worktime
    }
    fun getData4(): String{
        return confi_score
    }

}