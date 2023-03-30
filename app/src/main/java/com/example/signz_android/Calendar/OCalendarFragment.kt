package com.example.signz_android.Calendar

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.signz_android.databinding.FragmentOCalendarBinding

class OCalendarFragment : Fragment() {
    private lateinit var binding: FragmentOCalendarBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentOCalendarBinding.inflate(inflater, container, false)

        binding.btnOcalendarManage.setOnClickListener {

        }
        binding.btnOcalendarPaymanage.setOnClickListener{
            startActivity(Intent(context, PayActivity::class.java))
        }
        binding.btnOcalendarNotice.setOnClickListener {
            startActivity(Intent(context, CalendarNoticeActivity::class.java))
        }

        return binding.root
    }
}