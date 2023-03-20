package com.example.signz_android.OMain

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.signz_android.JobpostData
import com.example.signz_android.PobData
import com.example.signz_android.R
import com.example.signz_android.databinding.ActivityMainOwnerAddWopBinding
import com.example.signz_android.databinding.ActivityWMainBinding
import java.time.LocalDate

class OMainAddWopActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainOwnerAddWopBinding
    private val pobList = ArrayList<PobData>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainOwnerAddWopBinding.inflate(layoutInflater);
        setContentView(binding.root)

        binding.btnAddWopBack.setOnClickListener {
            finish()
        }
        binding.btnAddWop.setOnClickListener {
            val bname = binding.etAddWopUsername.text.toString()
            val store_name = binding.etAddWopPname.text.toString()
            val address = binding.etAddWopAddress.text.toString()
            val b_reg_num = binding.etAddWopBregnum.toString()
            val onlyDate: String = LocalDate.now().toString()

            if (bname== "" || store_name == "" || address == "" || b_reg_num == "") Toast.makeText(
                this@OMainAddWopActivity,
                "모든 정보를 빠짐없이 입력해주세요",
                Toast.LENGTH_SHORT
            ).show() else {
                pobList.add(PobData(store_name, b_reg_num, onlyDate))
                val bundle = Bundle()
                bundle.putParcelableArrayList("item", pobList)
                val ftab2 = OMainFragmentTab2()
                ftab2.arguments = bundle
                val transaction = supportFragmentManager.beginTransaction()
                transaction.commit()
            }
        }
    }

}