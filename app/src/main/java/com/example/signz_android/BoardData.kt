package com.example.signz_android

data class BoardData(
    var title: String,
    var nickname: String,
    var date : String,
    var comments: Int,
    var view : Int
){
    fun getData1(): String{
        return title
    }
    fun getData2(): String{
        return nickname
    }
    fun getData3(): String{
        return date
    }
    fun getData4(): Int{
        return comments
    }
    fun getData5() : Int{
        return view
    }

}
