package com.example.signz_android.OMain

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import com.example.signz_android.OViewPagerAdapter
import com.example.signz_android.databinding.FragmentOMainBinding
import com.google.android.material.tabs.TabLayoutMediator

class OMainFragment : Fragment() {
    private val tabTitleArray = arrayOf("Job Postings", "Workplace")
    private lateinit var binding: FragmentOMainBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentOMainBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        val pagerAdapter = OViewPagerAdapter(requireActivity())
        pagerAdapter.addFragment(OMainFragmentTab1())
        pagerAdapter.addFragment(OMainFragmentTab2())

        binding.viewpagerOmain.adapter = pagerAdapter
        binding.viewpagerOmain.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback(){
            override fun onPageSelected(position: Int) {
                super.onPageSelected(position)
                Log.e("ViewPagerFragment", "Page ${position + 1}")
            }
    })
        TabLayoutMediator(binding.tabOmain, binding.viewpagerOmain){
            tab, position ->tab.text = tabTitleArray[position]
        }.attach()

    }



}