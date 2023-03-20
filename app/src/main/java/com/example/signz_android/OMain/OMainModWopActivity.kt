package com.example.signz_android.OMain

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.signz_android.databinding.ActivityMainOwnerAddModBinding
import com.example.signz_android.databinding.ActivityOwnerMainJopModBinding

class OMainModWopActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainOwnerAddModBinding.inflate(layoutInflater);
        setContentView(binding.root)

        binding.btnModWopBack.setOnClickListener {
            finish()
        }
        binding.btnModWop.setOnClickListener {
            finish()
        }
    }
}