package com.example.signz_android

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.signz_android.databinding.ActivityMainOwnerAddWopBinding

class OMainAddWopActivity : AppCompatActivity() {
    var DB = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainOwnerAddWopBinding.inflate(layoutInflater);
        setContentView(binding.root)

        binding.btnAddWopBack.setOnClickListener {
            finish()
        }
        binding.btnAddWop.setOnClickListener {
            val bname = binding.etAddWopUsername.text.toString()
            val store_name = binding.etAddWopPname.text.toString()
            val address = binding.etAddWopAddress.text.toString()
            val b_reg_num = binding.etAddWopBregnum.toString()

            if (bname== "" || store_name == "" || address == "" || b_reg_num == "") Toast.makeText(
                this@OMainAddWopActivity,
                "모든 정보를 빠짐없이 입력해주세요",
                Toast.LENGTH_SHORT
            ).show() //else {
//                val insert = DB!!.insertData(b_reg_num, address, store_name, bname)
//                if (insert == true) {
//                    val intent = Intent(applicationContext, OMainActivity::class.java)
//                    startActivity(intent)
//                }
            }
        }
    }

//}