package com.example.signz_android.Mypage

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.signz_android.Calendar.PayActivity
import com.example.signz_android.WMain.WMainActivity
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
            startActivity(Intent(activity, PayActivity::class.java))
        }

        binding.tvBadge1.setOnClickListener {
            startActivity(Intent(activity, WMypageWorkHistoryActivity::class.java))
        }

        binding.tvBadge2.setOnClickListener {
            startActivity(Intent(activity, MypageBadge1Activity::class.java))
        }

        binding.tvBadge3.setOnClickListener {
            startActivity(Intent(activity, MypageBadge2Activity::class.java))
        }

        binding.tvBadge4.setOnClickListener {
            startActivity(Intent(activity, MypageBadge3Activity::class.java))
        }

        return binding.root
    }
}