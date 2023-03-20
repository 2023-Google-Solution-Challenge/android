package com.example.signz_android.Mypage

import android.app.Activity
import android.app.DatePickerDialog
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.signz_android.WorkHistoryData
import com.example.signz_android.databinding.ActivityMypageAddWorkHistotyBinding
import java.util.Calendar

class WMypageAddWorkHistoryActivity : AppCompatActivity(){
    private lateinit var binding: ActivityMypageAddWorkHistotyBinding
    private val data = ArrayList<WorkHistoryData>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMypageAddWorkHistotyBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.tvHisStartDay.setOnClickListener {
            val cal = Calendar.getInstance()
            val data = DatePickerDialog.OnDateSetListener { view, year, month, day ->
                binding.tvHisStartDay.text = "${year}-${month+1}-${day}"
            }
            DatePickerDialog(this, data, cal.get(Calendar.YEAR), cal.get(Calendar.MONTH), cal.get(Calendar.DAY_OF_MONTH)).show()
        }

        binding.tvHisEndDay.setOnClickListener {
            val cal = Calendar.getInstance()
            val data = DatePickerDialog.OnDateSetListener { view, year, month, day ->
                binding.tvHisEndDay.text = "${year}-${month+1}-${day}"
            }
            DatePickerDialog(this, data, cal.get(Calendar.YEAR), cal.get(Calendar.MONTH), cal.get(Calendar.DAY_OF_MONTH)).show()
        }

        binding.btnAddHisCancel.setOnClickListener {
            finish()
        }

        binding.btnAddHis.setOnClickListener {
            val place_name = binding.etHisPlaceName.text.toString()
            val start_day = binding.tvHisStartDay.text.toString()
            val end_day = binding.tvHisEndDay.text.toString()

            data.add(WorkHistoryData(place_name, start_day, end_day))

            val returnIntent = Intent()
            //returnIntent.putExtra("history", data)
            returnIntent.putExtra("name", place_name)
            returnIntent.putExtra("start_day", start_day)
            returnIntent.putExtra("end_day", end_day)
            setResult(Activity.RESULT_OK, returnIntent)
            finish()
        }
    }
}