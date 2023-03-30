package com.example.signz_android.Calendar

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import com.example.signz_android.databinding.ActivityAddbankaccountBinding

class PayAddBankActivity : AppCompatActivity() {
    private lateinit var binding: ActivityAddbankaccountBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAddbankaccountBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnAddbankaccountBack.setOnClickListener {
            finish()
        }
        binding.btnAddbankaccountSubmit.setOnClickListener {
            finish()
        }
    }
}