package com.example.signz_android.Mypage

import android.app.Activity
import android.os.Bundle
import com.example.signz_android.databinding.ActivityChangePasswordBinding

class ChangePasswordActivity : Activity() {
    private lateinit var binding : ActivityChangePasswordBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityChangePasswordBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSettingsCancel.setOnClickListener {
            finish()
        }
        binding.btnChangePassword.setOnClickListener {
            //db update
        }
    }
}