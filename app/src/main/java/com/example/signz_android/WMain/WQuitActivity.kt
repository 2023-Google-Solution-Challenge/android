package com.example.signz_android.WMain

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContentProviderCompat.requireContext
import com.example.signz_android.DialogFindId
import com.example.signz_android.Usersign.LoginActivity
import com.example.signz_android.databinding.ActivityWQuitBinding
import java.time.LocalDate
import java.time.format.DateTimeFormatter

class WQuitActivity : AppCompatActivity() {
    private lateinit var binding: ActivityWQuitBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityWQuitBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //
        binding.btnQuitBack.setOnClickListener {
            finish()
        }
        binding.btnQuitDone.setOnClickListener{
            finish()
        }

        binding.tvQuitPeriod.text = binding.tvQuitPeriod.text.toString() + LocalDate.now()
            .format(DateTimeFormatter.ofPattern("yyyy.MM.dd")).toString()

    }
}