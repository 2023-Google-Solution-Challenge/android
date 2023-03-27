package com.example.signz_android.Community

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.signz_android.databinding.ActivityCommunityWriteBoardBinding

class CommunityBoardWriteActivity : AppCompatActivity() {
    private lateinit var binding : ActivityCommunityWriteBoardBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCommunityWriteBoardBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnAllBack.setOnClickListener {
            finish()
        }
        binding.tvBoardUpload.setOnClickListener {
            finish()
        }
    }
}