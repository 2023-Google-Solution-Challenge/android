package com.example.signz_android

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.signz_android.databinding.ActivityModInfoBinding

class ModifyInfoActivity : AppCompatActivity() {

    private lateinit var binding: ActivityModInfoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityModInfoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnModinfoCancel.setOnClickListener {
            finish()
        }
        binding.btnModInfo.setOnClickListener {
            //정보 수정 db 업데이트
        }
        binding.btnModPhone.setOnClickListener {
            val intent = Intent(this, ChangePhoneNumActivity::class.java)
            startActivity(intent)
        }
        binding.btnModAddress.setOnClickListener {
            //주소찾기 api
        }

    }


}