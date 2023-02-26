package com.example.signz_android.Usersign


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.signz_android.databinding.ActivityFindaccountBinding
import com.google.android.material.tabs.TabLayoutMediator

class FindAccountActivity : AppCompatActivity() {
    private lateinit var binding: ActivityFindaccountBinding
    private val tabfind = arrayListOf("아이디 찾기", "비밀번호 찾기")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFindaccountBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //뒤로가기
        binding.btnFindBack.setOnClickListener {
            finish()
        }

        //뷰페이저 연결
        val AdapterFind = FindAccountVPAdapter(this)
        binding.viewpagerFind.adapter= AdapterFind
        TabLayoutMediator(binding.tabFind, binding.viewpagerFind){
                tab, position -> tab.text = tabfind[position]
        }.attach()

    }

}