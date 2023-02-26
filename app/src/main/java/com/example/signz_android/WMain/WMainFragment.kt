package com.example.signz_android.WMain

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.signz_android.databinding.FragmentWMainBinding
import com.google.android.material.tabs.TabLayoutMediator

class WMainFragment : Fragment() {
    private lateinit var binding: FragmentWMainBinding
    private val tabwmain = arrayListOf("채용공고", "근무 관리")

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentWMainBinding.inflate(inflater, container, false)

        //뷰페이저 연결
        val WMainAdapter= WMainVPAdapter(this)
        binding.viewpagerWmain.adapter= WMainAdapter
        TabLayoutMediator(binding.tabWmain, binding.viewpagerWmain){
                tab, position -> tab.text = tabwmain[position]
        }.attach()


        return binding.root
    }
}
