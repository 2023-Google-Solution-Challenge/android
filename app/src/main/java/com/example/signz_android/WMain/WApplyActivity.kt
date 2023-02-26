package com.example.signz_android.WMain

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.signz_android.databinding.ActivityWApplyBinding

class WApplyActivity : AppCompatActivity() {
    private lateinit var binding: ActivityWApplyBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityWApplyBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //뒤로가기
        binding.btnWapplyBack.setOnClickListener {
            finish()
        }
        //지원서 작성완료
        binding.btnWapplyNext.setOnClickListener{
            finish()
        }

    }
}