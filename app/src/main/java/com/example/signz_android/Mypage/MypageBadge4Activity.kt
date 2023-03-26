package com.example.signz_android.Mypage

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.signz_android.EduData
import com.example.signz_android.databinding.ActivityMypageBadge1Binding
import com.example.signz_android.databinding.ActivityMypageBadge2Binding
import com.example.signz_android.databinding.ActivityMypageBadge3Binding
import com.example.signz_android.databinding.ActivityMypageBadge4Binding

class MypageBadge4Activity : AppCompatActivity() {

    private lateinit var binding : ActivityMypageBadge4Binding
    private var adapter: MypageBadgeRVAdapter? = null
    private val data = ArrayList<EduData>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMypageBadge4Binding.inflate(layoutInflater)
        setContentView(binding.root)

        data.apply { add(EduData("https://youtu.be/wjfloLW5ZlI", "여성 제조업자 이야기 I 성평등 노동 특집", "젠더온"))
            add(EduData("https://youtu.be/UI7L3zlBhDM", "물리치료사 이야기 I 성평등 노동 특집", "젠더온"))
            add(EduData("https://youtu.be/TxWb5SqHgvo", "차별과 혐오를 넘어, 성평등한 세상으로 | 노동자의 시선으로 'BOM'", "민주노총"))
            add(EduData("https://youtu.be/U1hd8KDW4JQ", "남성 네일 아티스트의 이야기 I 성평등 노동 특집", "젠더온")) }

        adapter = MypageBadgeRVAdapter(data)
        binding.mypageEduRecycle.adapter = adapter
        binding.mypageEduRecycle.layoutManager = LinearLayoutManager(this)

        binding.btnB4Back.setOnClickListener {
            finish()
        }

    }
}