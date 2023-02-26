package com.example.signz_android.WMain

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.signz_android.databinding.ActivityWRecruitBinding

class WRecruitActivity : AppCompatActivity() {
    private lateinit var binding: ActivityWRecruitBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityWRecruitBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //뒤로가기
        binding.btnWrecruitBack.setOnClickListener {
            finish()
        }
        //지원하기
        binding.btnWrecruitApply.setOnClickListener{
            startActivity(Intent(this, WApplyActivity::class.java))
            finish()
        }


    }
}