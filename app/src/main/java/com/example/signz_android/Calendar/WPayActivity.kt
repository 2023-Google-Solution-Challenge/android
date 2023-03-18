package com.example.signz_android.Calendar

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.signz_android.Usersign.FindAccountVPAdapter
import com.example.signz_android.databinding.ActivityFindaccountBinding
import com.example.signz_android.databinding.ActivityWPayBinding
import com.google.android.material.tabs.TabLayoutMediator

class WPayActivity : AppCompatActivity() {
    private lateinit var binding: ActivityWPayBinding
    private val tabPay = arrayListOf("정산내역", "입금완료")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityWPayBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //뒤로가기
        binding.btnWpayBack.setOnClickListener {
            finish()
        }

        //뷰페이저 연결
        val AdapterPay= WPayVPAdapter(this)
        binding.viewpagerWpay.adapter= AdapterPay
        TabLayoutMediator(binding.tabWpay, binding.viewpagerWpay){
                tab, position -> tab.text = tabPay[position]
        }.attach()

    }
}