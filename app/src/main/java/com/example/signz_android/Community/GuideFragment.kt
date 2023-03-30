package com.example.signz_android.Community

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.signz_android.databinding.FragmentCommunityGuideBinding

class GuideFragment : Fragment() {
    private lateinit var binding : FragmentCommunityGuideBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentCommunityGuideBinding.inflate(inflater, container, false)

        binding.tvItemguide.setOnClickListener{
            startActivity(Intent(context, GuideDetailActivity::class.java))
        }

        return binding.root
    }
}