package com.example.signz_android.Mypage

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.signz_android.OViewPagerAdapter
import com.example.signz_android.databinding.ActivityMypageOContractBinding
import com.example.signz_android.databinding.ActivityMypageWContractBinding
import com.google.android.material.tabs.TabLayoutMediator

class WMypageContractActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMypageWContractBinding
    private val tabTitleArray = arrayOf("진행중", "계약완료")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMypageWContractBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val viewPager = binding.viewpagerMypageCon
        val tabLayout = binding.tabMypageCon

        val pagerAdapter = OViewPagerAdapter(this)
        pagerAdapter.addFragment(WMypageContractFragmentT1())
        pagerAdapter.addFragment(WMypageContractFragmentT2())

        viewPager.adapter = pagerAdapter

        TabLayoutMediator(tabLayout, viewPager) { tab, position ->
            tab.text = tabTitleArray[position]
        }.attach()

        binding.btnMpconBack.setOnClickListener {
            finish()
        }
    }
}