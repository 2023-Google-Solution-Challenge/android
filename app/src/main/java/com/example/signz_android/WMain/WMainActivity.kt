package com.example.signz_android.WMain

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.signz_android.Calendar.CalendarFragment
import com.example.signz_android.CommunityFragment
import com.example.signz_android.MyPageFragment
import com.example.signz_android.R
import com.example.signz_android.databinding.ActivityWMainBinding

class WMainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityWMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_w_main)

        binding = ActivityWMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initNavigation()
    }

    //네비게이션
    private fun initNavigation(){
        supportFragmentManager.beginTransaction()
            .replace(R.id.frame_main, WMainFragment()).commitAllowingStateLoss()
        binding.bnvMain.itemIconTintList = null

        binding.bnvMain.setOnItemSelectedListener { item ->
            when(item.itemId){
                R.id.fragment_main -> {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.frame_main, WMainFragment())
                        .commitAllowingStateLoss()
                    return@setOnItemSelectedListener true
                }

                R.id.fragment_calendar -> {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.frame_main, CalendarFragment())
                        .commitAllowingStateLoss()
                    return@setOnItemSelectedListener true
                }

                R.id.fragment_community -> {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.frame_main, CommunityFragment())
                        .commitAllowingStateLoss()
                    return@setOnItemSelectedListener true
                }

                R.id.fragment_mypage -> {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.frame_main, MyPageFragment())
                        .commitAllowingStateLoss()
                    return@setOnItemSelectedListener true
                }
            }
            false
        }
    }
}