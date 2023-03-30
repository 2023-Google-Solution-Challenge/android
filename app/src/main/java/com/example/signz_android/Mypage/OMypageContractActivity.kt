package com.example.signz_android.Mypage

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.signz_android.OViewPagerAdapter
import com.example.signz_android.databinding.ActivityMypageOContractBinding
import com.google.android.material.tabs.TabLayoutMediator

class OMypageContractActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMypageOContractBinding
    private val tabTitleArray = arrayOf("Ongoing", "Completion")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMypageOContractBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val viewPager = binding.viewpagerMypageCon
        val tabLayout = binding.tabMypageCon

        val pagerAdapter = OViewPagerAdapter(this)
        pagerAdapter.addFragment(OMypageContractFragmentT1())
        pagerAdapter.addFragment(OMypageContractFragmentT2())

        viewPager.adapter = pagerAdapter

        TabLayoutMediator(tabLayout, viewPager) { tab, position ->
            tab.text = tabTitleArray[position]
        }.attach()

        binding.btnMpconBack.setOnClickListener {
            finish()
        }
    }
}