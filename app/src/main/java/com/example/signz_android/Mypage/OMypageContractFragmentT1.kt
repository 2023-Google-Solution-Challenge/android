package com.example.signz_android.Mypage

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.signz_android.databinding.FragmentMypageOContractT1Binding

class OMypageContractFragmentT1 : Fragment() {
    private lateinit var binding: FragmentMypageOContractT1Binding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMypageOContractT1Binding.inflate(inflater, container, false)
        return binding.root
    }
}