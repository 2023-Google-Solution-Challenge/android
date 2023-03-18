package com.example.signz_android.OMain

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.signz_android.databinding.ActivityOwnerMainJopModBinding

class OMainModJobActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityOwnerMainJopModBinding.inflate(layoutInflater);
        setContentView(binding.root)
    }
}