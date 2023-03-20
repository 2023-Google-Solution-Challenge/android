package com.example.signz_android.Mypage

import android.app.Activity
import android.os.Bundle
import com.example.signz_android.databinding.ActivityChangePhoneBinding

class ChangePhoneNumActivity : Activity() {
    private lateinit var binding : ActivityChangePhoneBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityChangePhoneBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnPhoneCancel.setOnClickListener {
            finish()
        }
    }
}