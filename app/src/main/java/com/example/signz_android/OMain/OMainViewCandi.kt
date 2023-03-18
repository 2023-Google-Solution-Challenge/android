package com.example.signz_android.OMain

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.signz_android.DialogSelectCandi
import com.example.signz_android.databinding.ActivityOViewcandiBinding

class OMainViewCandi : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityOViewcandiBinding.inflate(layoutInflater);
        setContentView(binding.root)

        binding.btnConfirmCandi.setOnClickListener {
            /*val dialog = DialogSelectCandi(this@OMainViewCandi)
            dialog.show() 만약 ok면 다음 dialog 띄우기*/
        }
        binding.btnViewcandiBack.setOnClickListener{
            finish()
        }
    }
}

