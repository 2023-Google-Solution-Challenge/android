package com.example.signz_android.OMain

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.signz_android.DialogSelectCandi
import com.example.signz_android.databinding.ActivityOManageBinding
import com.example.signz_android.databinding.ActivityOViewcandiBinding

class OMainViewCandiActivity : AppCompatActivity() {

    private lateinit var binding: ActivityOViewcandiBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOViewcandiBinding.inflate(layoutInflater);
        setContentView(binding.root)

        binding.btnConfirmCandi.setOnClickListener {
            val dialog = DialogSelectCandi(this)
            dialog.show()
        }
        binding.btnViewcandiBack.setOnClickListener{
            finish()
        }
    }
}

