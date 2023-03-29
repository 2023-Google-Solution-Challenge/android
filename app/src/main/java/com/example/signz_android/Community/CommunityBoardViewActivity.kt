package com.example.signz_android.Community

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.signz_android.databinding.ActivityCommunityViewBoardBinding
import com.example.signz_android.databinding.ActivityCommunityWriteBoardBinding

class CommunityBoardViewActivity : AppCompatActivity() {
    private lateinit var binding : ActivityCommunityViewBoardBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCommunityViewBoardBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnAllBack.setOnClickListener {
            finish()
        }
    }
}