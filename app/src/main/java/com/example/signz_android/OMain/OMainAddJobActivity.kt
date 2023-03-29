package com.example.signz_android.OMain

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.signz_android.JobpostData
import com.example.signz_android.PobData
import com.example.signz_android.R
import com.example.signz_android.databinding.ActivityOwnerMainJopBinding
import java.time.LocalDate
import java.time.LocalTime

class OMainAddJobActivity : AppCompatActivity() {

    private val jobList = ArrayList<JobpostData>()
    private val pobList = ArrayList<PobData>()
    private val place = ArrayList<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityOwnerMainJopBinding.inflate(layoutInflater);
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

        spinner_money_type.adapter = ArrayAdapter.createFromResource(
            this,
            R.array.money,
            R.layout.style_spinner
        )
        sp_start.adapter = ArrayAdapter.createFromResource(
            this,
            R.array.start_time,
            R.layout.style_spinner
        )
        sp_end.adapter = ArrayAdapter.createFromResource(
            this,
            R.array.end_time,
            R.layout.style_spinner
        )

        spinner_poj.adapter = ArrayAdapter(
            this,
            R.layout.style_spinner,
            place
        )

        binding.btnAddJobBack.setOnClickListener {
            finish()
        }

        binding.btnHoliPayY.setOnClickListener {
            binding.btnHoliPayY.isSelected = true
            binding.btnHoliPayN.isSelected = false
        }

        binding.btnHoliPayN.setOnClickListener {
            binding.btnHoliPayY.isSelected = false
            binding.btnHoliPayN.isSelected = true
        }

        binding.btnProbationY.setOnClickListener {
            binding.btnProbationY.isSelected = true
            binding.btnProbationN.isSelected = false
        }

        binding.btnProbationN.setOnClickListener {
            binding.btnProbationY.isSelected = false
            binding.btnProbationN.isSelected = true
            binding.etProbationDay.isEnabled = false
        }

        binding.btnMday.setOnClickListener {
            binding.btnMday.isSelected  = binding.btnMday.isSelected != true
        }

        binding.btnTuday.setOnClickListener {
            binding.btnTuday.isSelected  = binding.btnTuday.isSelected != true
        }

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

        binding.btnPeriodMonth.setOnClickListener {
            binding.btnPeriodDay.isSelected = false
            binding.btnPeriodWeek.isSelected = false
            binding.btnPeriodMonth.isSelected = true
        }


        binding.btnAddJobPost.setOnClickListener {
            //DB에 저장
            //리사이클러뷰 추가
            //finish
            val poj = binding.spinnerPoj.selectedItem.toString()
            val title = binding.etAddJobTitle.text.toString()
            val contents = binding.etPostContent.text.toString()
            val paytype = spinner_money_type.selectedItem.toString()
            val pay = binding.etAddJobMoney.toString()
            val prob_period = binding.etProbationDay.toString()
            val work_period = binding.etWPeriod.toString()
            val st_string = sp_start.selectedItem.toString()
            val ed_string = sp_end.selectedItem.toString()
            //val start_time: LocalTime = LocalTime.parse(st_string)
            //val end_time: LocalTime = LocalTime.parse(ed_string)
            var is_weekly_holiday_paid: Int? = null
            var work_day: Int? = null
            var period_type: Int? = null
            var is_probation: Int? = null
            val pay_type_int = 0
            val onlyDate: String = LocalDate.now().toString()

            if (title == "" || contents == "" || paytype == "" || pay == "" || prob_period == "" || work_period == "" || st_string == "" || ed_string == "") //binding.btnMday.isSelected || binding.btnTuday.isSelected -> work_day =
            {
                Toast.makeText(
                    this@OMainAddJobActivity,
                    "모든 정보를 빠짐없이 입력해주세요",
                    Toast.LENGTH_SHORT
                ).show()
            } else {
                if (binding.btnHoliPayY.isSelected) {
                    is_weekly_holiday_paid = 1
                } else if (binding.btnHoliPayN.isSelected) {
                    is_weekly_holiday_paid = 0
                } else {
                    Toast.makeText(
                        this@OMainAddJobActivity,
                        "주휴수당 여부를 선택해주세요",
                        Toast.LENGTH_SHORT
                    ).show()
                }

                if (paytype == "시급"){
                    val pay_type_int = 0
                } else if(paytype == "일급"){
                    val pay_type_int = 1
                } else {
                    val pay_type_int = 2
                }

                if (binding.btnProbationY.isSelected) {
                    is_probation = 1
                } else if (binding.btnProbationN.isSelected) {
                    is_probation = 0
                } else {
                    Toast.makeText(
                        this@OMainAddJobActivity,
                        "수습 여부를 선택해주세요",
                        Toast.LENGTH_SHORT
                    ).show()
                }

                when {
                    binding.btnMday.isSelected -> work_day = 0
                    binding.btnTuday.isSelected -> work_day = 1
                    binding.btnWday.isSelected -> work_day = 2
                    binding.btnTrday.isSelected -> work_day = 3
                    binding.btnFday.isSelected -> work_day = 4
                    binding.btnSatday.isSelected -> work_day = 5
                    binding.btnSunday.isSelected -> work_day = 6
                    //binding.btnMday.isSelected || binding.btnTuday.isSelected -> work_day =
                    else -> Toast.makeText(
                        this@OMainAddJobActivity,
                        "근무요일을 선택해주세요",
                        Toast.LENGTH_SHORT
                    ).show()
                }

                when{
                    binding.btnPeriodDay.isSelected -> period_type = 0
                    binding.btnPeriodWeek.isSelected -> period_type = 1
                    binding.btnPeriodMonth.isSelected -> period_type = 2
                    else -> Toast.makeText(
                        this@OMainAddJobActivity,
                        "근무 기간을 선택해주세요",
                        Toast.LENGTH_SHORT
                    ).show()
                }

              if (period_type != null && is_weekly_holiday_paid != null && work_day!= null && is_probation != null){
                  jobList.add(JobpostData(poj, title, onlyDate))
                  finish()
                }
            }
        }
    }
}
