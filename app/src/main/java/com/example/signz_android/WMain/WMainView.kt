package com.example.signz_android.WMain

interface WMainRecruitView {
    fun onWMainRecruitSuccess(code : Int, result : List<WMainRecruitResult>)
    fun onWMainRecruitFailure()
}

interface WMainManageView {
    fun onWMainManageSuccess(code : Int, result : WMainManageResult)
    fun onWMainManageFailure()
}