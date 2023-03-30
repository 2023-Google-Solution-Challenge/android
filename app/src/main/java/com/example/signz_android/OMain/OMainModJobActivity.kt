package com.example.signz_android.OMain

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.example.signz_android.PobData
import com.example.signz_android.R
import com.example.signz_android.databinding.ActivityOwnerMainJopModBinding

class OMainModJobActivity : AppCompatActivity() {
    private val pobList = ArrayList<PobData>()
    private val place = ArrayList<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityOwnerMainJopModBinding.inflate(layoutInflater);
        setContentView(binding.root)

        pobList.apply { add(PobData("Cafe peach", "123-45-67890", "2023-03-16"))
            add(PobData("Gong cha", "123-45-67890", "2023-03-16")) }

        val spinner_poj = binding.spinnerPoj
        val spinner_money_type = binding.spMoney
        val sp_start = binding.spStartTime
        val sp_end = binding.spEndTime

        for (i in 0 until pobList.count()){
            place.add(pobList.get(i).store_name)
            print(place)
        }
        spinner_money_type.setSelection(0)
        spinner_money_type.adapter = ArrayAdapter.createFromResource(
            this,
            R.array.money,
            R.layout.style_spinner
        )
        sp_start.setSelection(21)
        sp_start.adapter = ArrayAdapter.createFromResource(
            this,
            R.array.start_time,
            R.layout.style_spinner
        )
        sp_end.setSelection(31)
        sp_end.adapter = ArrayAdapter.createFromResource(
            this,
            R.array.end_time,
            R.layout.style_spinner
        )
        spinner_poj.setSelection(0)
        spinner_poj.adapter = ArrayAdapter(
            this,
            R.layout.style_spinner,
            place
        )

        binding.btnAddJobBack.setOnClickListener {
            finish()
        }
        binding.btnHoliPayY.isSelected = true
        binding.btnHoliPayY.setOnClickListener {
            binding.btnHoliPayY.isSelected = true
            binding.btnHoliPayN.isSelected = false
        }

        binding.btnHoliPayN.setOnClickListener {
            binding.btnHoliPayY.isSelected = false
            binding.btnHoliPayN.isSelected = true
        }

        fun setUseableEditText(et: EditText, useable: Boolean) {
            et.isClickable = useable
            et.isEnabled = useable
            et.isFocusable = useable
            et.isFocusableInTouchMode = useable
        }
        setUseableEditText(binding.etProbationDay, false)
        binding.btnProbationY.setOnClickListener {
            binding.btnProbationY.isSelected = true
            binding.btnProbationN.isSelected = false
            setUseableEditText(binding.etProbationDay, true)
        }
        binding.btnProbationN.isSelected = true
        binding.btnProbationN.setOnClickListener {
            binding.btnProbationY.isSelected = false
            binding.btnProbationN.isSelected = true
            setUseableEditText(binding.etProbationDay, false)
        }

        binding.btnMday.isSelected = true
        binding.btnMday.setOnClickListener {
            binding.btnMday.isSelected  = binding.btnMday.isSelected != true
        }

        binding.btnTuday.setOnClickListener {
            binding.btnTuday.isSelected  = binding.btnTuday.isSelected != true
        }
        binding.btnWday.isSelected = true
        binding.btnWday.setOnClickListener {
            binding.btnWday.isSelected  = binding.btnWday.isSelected != true
        }

        binding.btnTrday.setOnClickListener {
            binding.btnTrday.isSelected  = binding.btnTrday.isSelected != true
        }

        binding.btnFday.setOnClickListener {
            binding.btnFday.isSelected  = binding.btnFday.isSelected != true
        }

        binding.btnSatday.setOnClickListener {
            binding.btnSatday.isSelected  = binding.btnSatday.isSelected != true
        }

        binding.btnSunday.setOnClickListener {
            binding.btnSunday.isSelected  = binding.btnSunday.isSelected != true
        }

        binding.btnPeriodDay.setOnClickListener {
            binding.btnPeriodDay.isSelected = true
            binding.btnPeriodWeek.isSelected = false
            binding.btnPeriodMonth.isSelected = false
        }

        binding.btnPeriodWeek.setOnClickListener {
            binding.btnPeriodDay.isSelected = false
            binding.btnPeriodWeek.isSelected = true
            binding.btnPeriodMonth.isSelected = false
        }
        binding.btnPeriodMonth.isSelected = true
        binding.btnPeriodMonth.setOnClickListener {
            binding.btnPeriodDay.isSelected = false
            binding.btnPeriodWeek.isSelected = false
            binding.btnPeriodMonth.isSelected = true
        }
    }
}