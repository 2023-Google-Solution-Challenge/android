package com.example.signz_android

data class EduData(
    var link : String,
    var title : String,
    var src : String
){
    fun getData1(): String{
        return link
    }
    fun setData1(name:String){
        this.link =link
    }
    fun getData2(): String?{
        return title
    }
    fun setData2(title: String){
        this.title = title
    }
    fun getData3(): String?{
        return src
    }
    fun setData4(date: String){
        this.src = date
    }

}
