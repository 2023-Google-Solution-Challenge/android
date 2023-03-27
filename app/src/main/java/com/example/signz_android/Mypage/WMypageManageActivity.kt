package com.example.signz_android.Mypage

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.signz_android.WMain.WMainManageResult
import com.example.signz_android.WMain.WQuitActivity
import com.example.signz_android.databinding.ActivityWMypagemanageBinding


class WMypageManageActivity : AppCompatActivity() {
    private lateinit var binding: ActivityWMypagemanageBinding
    private var adapter: WMypageManageRVAdapter? = null
    private var wMainManageList = ArrayList<WMainManageResult>()

    init{
        instance = this
    }

    companion object{
        private var instance: WMypageManageActivity? = null
        fun getInstance(): WMypageManageActivity? {
            return instance
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityWMypagemanageBinding.inflate(layoutInflater)
        setContentView(binding.root)

        wMainManageList.apply {
            add(WMainManageResult("Cafe peach", "월요일,수요일", "10:00 ~ 14:00", "2022.11.19 ~ 2023.5.19"))
        }
        adapter = WMypageManageRVAdapter(wMainManageList)
        binding.rvWmange.adapter = adapter
        binding.rvWmange.layoutManager = LinearLayoutManager(this)

        binding.btnWManageBack.setOnClickListener {
            finish()
        }

    }

    fun onQuitClick() {
        startActivity(Intent(this, WQuitActivity::class.java))
    }

    fun onReportClick() {
        startActivity(Intent(this, WQuitActivity::class.java))
    }

}