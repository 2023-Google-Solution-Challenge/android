package com.example.signz_android.OMain

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.signz_android.Calendar.OCalendarFragment
import com.example.signz_android.CommunityFragment
import com.example.signz_android.Mypage.OMyPageFragment
import com.example.signz_android.R
import com.example.signz_android.databinding.ActivityWMainBinding

class OMainActivity : AppCompatActivity() {
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
            .replace(R.id.frame_main, OMainFragment()).commitAllowingStateLoss()
        binding.bnvMain.itemIconTintList = null

        binding.bnvMain.setOnItemSelectedListener { item ->
            when(item.itemId){
                R.id.fragment_main -> {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.frame_main, OMainFragment())
                        .commitAllowingStateLoss()
                    return@setOnItemSelectedListener true
                }

                R.id.fragment_calendar -> {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.frame_main, OCalendarFragment())
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
                        .replace(R.id.frame_main, OMyPageFragment())
                        .commitAllowingStateLoss()
                    return@setOnItemSelectedListener true
                }
            }
            false
        }
    }
}