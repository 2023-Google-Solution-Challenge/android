package com.example.signz_android.Mypage

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.signz_android.EduData
import com.example.signz_android.databinding.ActivityMypageBadge1Binding
import com.example.signz_android.databinding.ActivityMypageBadge2Binding
import com.example.signz_android.databinding.ActivityMypageBadge3Binding

class MypageBadge3Activity : AppCompatActivity() {

    private lateinit var binding : ActivityMypageBadge3Binding
    private var adapter: MypageBadgeRVAdapter? = null
    private val data = ArrayList<EduData>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMypageBadge3Binding.inflate(layoutInflater)
        setContentView(binding.root)

        data.apply { add(EduData("https://youtu.be/0lZBin-e6Qw", "가사노동인식개선 캠페인 영상", "경기도체육회"))
            add(EduData("https://youtu.be/NG6p3W_fEH4", "장애 인식 개선 교육(자동 수업 진행용)|장애 이해 교육(12분)|용툰과 교육영상", "용툰과 교육영상"))
            add(EduData("https://youtu.be/laVfzLzBFQ0", "[물어보자고용~] 직장 내 장애인 인식개선 교육", "한국장애인고용공단"))
            add(EduData("https://youtu.be/dYACQWqivjk", "\"같은 하루\" - 정신장애인 고용 인식개선 홍보영상", "광주광역정신건강복지센터")) }

        adapter = MypageBadgeRVAdapter(data)
        binding.mypageEduRecycle.adapter = adapter
        binding.mypageEduRecycle.layoutManager = LinearLayoutManager(this)

        binding.btnB3Back.setOnClickListener {
            finish()
        }

    }
}