package com.example.signz_android

data class JobpostData (
    var pob_name: String = "ㅎㅇ",
    var title: String = "ㅎㅇㅎㅇ",
    var date: String = "ㅂ2"
){
    fun getData1(): String?{
        return pob_name
    }
    fun setData1(name:String){
        this.pob_name =pob_name
    }
    fun getData2(): String?{
        return title
    }
    fun setData2(title: String){
        this.title = title
    }
    fun getData3(): String?{
        return date
    }
    fun setData4(date: String){
        this.date = date
    }
}