package com.example.signz_android.Mypage

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.signz_android.Calendar.WPayActivity
import com.example.signz_android.R
import com.example.signz_android.WMain.WMainActivity
import com.example.signz_android.WMain.WMainManageFragment
import com.example.signz_android.databinding.FragmentOMypageBinding
import com.example.signz_android.databinding.FragmentWMypageBinding

class WMyPageFragment : Fragment() {
    private lateinit var binding: FragmentWMypageBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentWMypageBinding.inflate(inflater, container, false)

        binding.imgMypageSetting.setOnClickListener {
            startActivity(Intent(activity, SettingsActivity::class.java))
        }

        binding.tvMypageModify.setOnClickListener {
            startActivity(Intent(activity, ModifyInfoActivity::class.java))
        }

        binding.imgMypageContract.setOnClickListener {
            startActivity(Intent(activity, WMypageContractActivity::class.java))
        }

        binding.imgMypageJobinfo.setOnClickListener {
            (activity as WMainActivity).changeFragment(2)
        }

        binding.imgMypageMoney.setOnClickListener {
            startActivity(Intent(activity, WPayActivity::class.java))
        }

        binding.tvBadge1.setOnClickListener {
            startActivity(Intent(activity, WMypageWorkHistoryActivity::class.java))
        }

        binding.tvBadge2.setOnClickListener {
            startActivity(Intent(activity, SettingsActivity::class.java))
        }

        binding.tvBadge3.setOnClickListener {
            startActivity(Intent(activity, SettingsActivity::class.java))
        }

        binding.tvBadge4.setOnClickListener {
            startActivity(Intent(activity, SettingsActivity::class.java))
        }

        return binding.root
    }
}