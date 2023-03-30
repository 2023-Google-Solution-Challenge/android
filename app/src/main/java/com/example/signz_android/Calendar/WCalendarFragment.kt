package com.example.signz_android.Calendar

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import com.example.signz_android.DialogHoliday
import com.example.signz_android.DialogOkCancel
import com.example.signz_android.DialogYesNo
import com.example.signz_android.R
import com.example.signz_android.WMain.WQuitActivity
import com.example.signz_android.databinding.FragmentWCalendarBinding

class WCalendarFragment : Fragment() {
    private lateinit var binding: FragmentWCalendarBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentWCalendarBinding.inflate(inflater, container, false)

        binding.btnWcalendarWpay.setOnClickListener {
            startActivity(Intent(context, PayActivity::class.java))
        }

        binding.btnWcalendarYes.setOnClickListener {
            binding.btnWcalendarYes.setBackgroundColor(Color.parseColor("#333333"))
            binding.btnWcalendarYes.setTextColor(ContextCompat.getColor(requireContext(), R.color.white))
            DialogOkCancel(requireContext()){
                if(it == "ok"){
                    binding.btnWcalendarYes.text = "LEAVE"
                    binding.btnWcalendarYes.setBackgroundResource(R.drawable.box_stroke_gray_half_round_l)
                    binding.btnWcalendarYes.setTextColor(ContextCompat.getColor(requireContext(), R.color.font))
                    binding.btnWcalendarNo.visibility = View.VISIBLE
                    binding.btnWcalendarNo.text = "BREAK TIME"
                }
            }.show()
        }
        binding.btnWcalendarNo.setOnClickListener {
            DialogHoliday(requireContext()){
                if (it == "ok"){
                }
            }.show()
        }


        return binding.root
    }
}