package com.example.signz_android.Mypage

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.signz_android.EduData
import com.example.signz_android.databinding.ActivityMypageBadge1Binding
import com.example.signz_android.databinding.ActivityMypageBadge2Binding

class MypageBadge2Activity : AppCompatActivity() {

    private lateinit var binding : ActivityMypageBadge2Binding
    private var adapter: MypageBadgeRVAdapter? = null
    private val data = ArrayList<EduData>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMypageBadge2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        data.apply { add(EduData("https://youtu.be/fJE0_0DiMoY", "[계절별 재해 예방] 봄철 노동자 안전을 위협하는 이것은?! 봄 편❄", "안전보건공단안젤이"))
            add(EduData("https://youtu.be/PJd8G1dYNGI", "노인일자리 사례로 배우는 안전사고 예방교육 1차시 영상", "한국노인인력개발원"))
            add(EduData("https://youtu.be/D3lJGjR5MvA", "감정노동과 건강관리[산업안전보건교육]", "세중에듀티비"))
            add(EduData("https://youtu.be/QCC4LuKOExk", "꼭 챙겨야 할 산업현장 속 안전백신! ㅣ#노동안전지킴이ㅣ#산재예방", "경기도청")) }

        adapter = MypageBadgeRVAdapter(data)
        binding.mypageEduRecycle.adapter = adapter
        binding.mypageEduRecycle.layoutManager = LinearLayoutManager(this)

        binding.btnB2Back.setOnClickListener {
            finish()
        }

    }
}