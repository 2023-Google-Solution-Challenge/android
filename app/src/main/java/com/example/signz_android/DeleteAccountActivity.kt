package com.example.signz_android

import android.app.Activity
import android.os.Bundle
import android.widget.Toast
import com.example.signz_android.databinding.ActivityDeleteAccountBinding

class DeleteAccountActivity : Activity() {
    private lateinit var binding : ActivityDeleteAccountBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDeleteAccountBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnDeleteCancel.setOnClickListener {
            finish()
        }
        binding.btnDeleteAccount.setOnClickListener {
            if (binding.checkboxDel.isChecked){
                //회원탈퇴
            } else {
                Toast.makeText(this, "안내사항에 동의해주세요", Toast.LENGTH_SHORT).show()
            }
        }
    }
}