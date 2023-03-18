package com.example.signz_android.Calendar

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.signz_android.databinding.FragmentWPaylistBinding

class WPayDoneFragment: Fragment() {
    private lateinit var binding: FragmentWPaylistBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentWPaylistBinding.inflate(inflater, container, false)


        return binding.root
    }
}