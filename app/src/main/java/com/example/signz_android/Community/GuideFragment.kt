package com.example.signz_android.Community

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

        return binding.root
    }
}