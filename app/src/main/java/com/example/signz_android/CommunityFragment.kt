package com.example.signz_android

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.signz_android.databinding.FragmentCommunityBinding

class CommunityFragment : Fragment() {
    private lateinit var binding: FragmentCommunityBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentCommunityBinding.inflate(inflater, container, false)

        //test
        binding.communityTest.setOnClickListener {
            startActivity(Intent(activity, WRecruitActivity::class.java))
        }
        //test
        binding.communityTest2.setOnClickListener {
            startActivity(Intent(activity, ContractActivity::class.java))
        }

        return binding.root
    }

}