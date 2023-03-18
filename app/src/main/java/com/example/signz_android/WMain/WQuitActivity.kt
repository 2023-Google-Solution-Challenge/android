package com.example.signz_android.WMain

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.signz_android.databinding.ActivityWQuitBinding

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

    }
}