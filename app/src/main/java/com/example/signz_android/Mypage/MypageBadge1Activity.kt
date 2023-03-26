package com.example.signz_android.Mypage

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.signz_android.EduData
import com.example.signz_android.databinding.ActivityMypageBadge1Binding

class MypageBadge1Activity : AppCompatActivity() {

    private lateinit var binding : ActivityMypageBadge1Binding
    private var adapter: MypageBadgeRVAdapter? = null
    private val data = ArrayList<EduData>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMypageBadge1Binding.inflate(layoutInflater)
        setContentView(binding.root)

        data.apply { add(EduData("https://youtu.be/FJz2q9jubIo", "노동인권 1화 당신의 감정은 얼마인가요", "서울특별시 교육청"))
            add(EduData("https://youtu.be/jhFdRzBAejA", "노동인권 2화 예쁜 꽃 그런 건 없어요", "서울특별시 교육청"))
            add(EduData("https://youtu.be/yYj0pnwFXaU", "노동인권 3화 어려도 노동자입니다", "서울특별시 교육청"))
            add(EduData("https://youtu.be/mldSJuA8XiA", "노동인권 4화 조금 불편해도 괜찮아요", "서울특별시 교육청"))
            add(EduData("https://youtu.be/LDQf66flNyk", "노동인권 5화 열정 그건 원래 제건데요", "서울특별시 교육청"))
            add(EduData("https://youtu.be/_mnnot9Utbw", "노동인권 6화 갑과 을은 위, 아래가 아닌 동행입니다", "서울특별시 교육청")) }

        adapter = MypageBadgeRVAdapter(data)
        binding.mypageEduRecycle.adapter = adapter
        binding.mypageEduRecycle.layoutManager = LinearLayoutManager(this)

        binding.btnB1Back.setOnClickListener {
            finish()
        }

    }
}