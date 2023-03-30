package com.example.signz_android.WMain

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.signz_android.databinding.ActivityWReportBinding
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

class WReportBottomSheet : BottomSheetDialogFragment() {
    private lateinit var binding : ActivityWReportBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = ActivityWReportBinding.inflate(inflater, container, false)

        binding.btnReportSubmit.setOnClickListener {
            dismiss()
        }

        binding.btnReportPay.setOnClickListener {
            val address = "https://minwon.moel.go.kr/minwonCms/minwonCmsMwmdView/1000.do"
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(address))
            startActivity(intent)
        }

        binding.btnReportOverwork.setOnClickListener {
            val address = "https://labor.moel.go.kr/reportCntr/illegalLabor.do"
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(address))
            startActivity(intent)
        }

        binding.btnReportFire.setOnClickListener {
            val address = "https://minwon.moel.go.kr/minwonCms/minwonCmsMwmdView/2000.do"
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(address))
            startActivity(intent)
        }

        binding.btnReportTreatment.setOnClickListener {
            val address = "https://labor.moel.go.kr/reportCntr/illegalLabor.do"
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(address))
            startActivity(intent)
        }

        return binding.root
    }
}