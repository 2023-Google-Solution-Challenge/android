package com.example.signz_android.Mypage

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.signz_android.databinding.FragmentOMypageBinding

class MyPageFragment : Fragment() {
    private lateinit var binding: FragmentOMypageBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentOMypageBinding.inflate(inflater, container, false)

        binding.imgMypageSetting.setOnClickListener {
            startActivity(Intent(activity, SettingsActivity::class.java))
        }

        binding.tvMypageModify.setOnClickListener {
            startActivity(Intent(activity, ModifyInfoActivity::class.java))
        }

        binding.imgMypageContract.setOnClickListener {
            startActivity(Intent(activity, OMypageContractActivity::class.java))
        }

        binding.imgMypageJobinfo.setOnClickListener {
            startActivity(Intent(activity, SettingsActivity::class.java))
        }

        binding.imgMypageMoney.setOnClickListener {
            startActivity(Intent(activity, SettingsActivity::class.java))
        }

        binding.tvBadge1.setOnClickListener {
            startActivity(Intent(activity, SettingsActivity::class.java))
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