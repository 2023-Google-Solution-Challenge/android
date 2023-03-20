package com.example.signz_android

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class WorkHistoryData (
    var work_place: String,
    var start_day: String,
    var end_day: String
) : Parcelable
{
    fun getData1(): String?{
        return work_place
    }
    fun setData1(name:String){
        this.work_place = work_place
    }
    fun getData2(): String?{
        return start_day
    }
    fun setData2(title: String){
        this.start_day = start_day
    }
    fun getData3(): String?{
        return end_day
    }
    fun setData4(date: String){
        this.end_day = end_day
    }
}