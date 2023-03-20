package com.example.signz_android

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class PobData (
    var store_name: String,
    var b_reg_num: String,
    var date: String
) : Parcelable
{
    fun getData1(): String?{
        return store_name
    }
    fun setData1(name:String){
        this.store_name = store_name
    }
    fun getData2(): String?{
        return b_reg_num
    }
    fun setData2(title: String){
        this.b_reg_num = b_reg_num
    }
    fun getData3(): String?{
        return date
    }
    fun setData4(date: String){
        this.date = date
    }
}