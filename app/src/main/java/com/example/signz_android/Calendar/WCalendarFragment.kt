package com.example.signz_android.Calendar

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat.startActivity
import androidx.fragment.app.Fragment
import com.example.signz_android.WMain.WQuitActivity
import com.example.signz_android.databinding.FragmentOCalendarBinding
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
            startActivity(Intent(context, WPayActivity::class.java))
        }

        return binding.root
    }
}