package com.example.signz_android.Community

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.signz_android.databinding.ActivityCommunityGuidedetailBinding

class GuideDetailActivity : AppCompatActivity() {
    private lateinit var binding : ActivityCommunityGuidedetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCommunityGuidedetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnGuidedetailBack.setOnClickListener {
            finish()
        }
    }
}