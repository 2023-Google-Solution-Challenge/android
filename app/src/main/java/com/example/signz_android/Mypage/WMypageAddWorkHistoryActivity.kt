package com.example.signz_android.Mypage

import android.app.DatePickerDialog
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.signz_android.databinding.ActivityMypageAddWorkHistotyBinding
import java.util.Calendar

class WMypageAddWorkHistoryActivity : AppCompatActivity(){
    private lateinit var binding: ActivityMypageAddWorkHistotyBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMypageAddWorkHistotyBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.etHisStartDay.setOnClickListener {
            val cal = Calendar.getInstance()
            val data = DatePickerDialog.OnDateSetListener { view, year, month, day ->
                binding.etHisStartDay.text = "${year}-${month}-${day}"
            }
            DatePickerDialog(this, data, cal.get(Calendar.YEAR), cal.get(Calendar.MONTH), cal.get(Calendar.DAY_OF_MONTH)).show()
        }

        binding.etHisEndDay.setOnClickListener {
            val cal = Calendar.getInstance()
            val data = DatePickerDialog.OnDateSetListener { view, year, month, day ->
                binding.etHisEndDay.text = "${year}-${month}-${day}"
            }
            DatePickerDialog(this, data, cal.get(Calendar.YEAR), cal.get(Calendar.MONTH), cal.get(Calendar.DAY_OF_MONTH)).show()
        }
    }
}