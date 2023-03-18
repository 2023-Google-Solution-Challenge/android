package com.example.signz_android.Mypage

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.signz_android.databinding.ActivityMypageWorkHistoryBinding

class WMypageWorkHistoryActivity : AppCompatActivity(){
    private lateinit var binding: ActivityMypageWorkHistoryBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMypageWorkHistoryBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.tvWriteHistory.setOnClickListener {
            val intent = Intent(this, WMypageAddWorkHistoryActivity::class.java)
            startActivity(intent)
        }
    }
}