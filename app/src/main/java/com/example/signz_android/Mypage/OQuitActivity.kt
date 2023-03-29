package com.example.signz_android.Mypage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.signz_android.databinding.ActivityOQuitBinding
import com.example.signz_android.databinding.ActivityWQuitBinding

class OQuitActivity : AppCompatActivity() {
    private lateinit var binding: ActivityOQuitBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOQuitBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //
        binding.btnQuitBack.setOnClickListener {
            finish()
        }
        binding.btnQuitDone.setOnClickListener{
            finish()
        }

    }
}