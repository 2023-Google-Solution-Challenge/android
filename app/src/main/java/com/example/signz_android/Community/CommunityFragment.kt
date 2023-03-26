package com.example.signz_android.Community

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import com.example.signz_android.OMain.OMainFragmentTab1
import com.example.signz_android.OMain.OMainFragmentTab2
import com.example.signz_android.OViewPagerAdapter
import com.example.signz_android.Usersign.FindAccountActivity
import com.example.signz_android.databinding.FragmentCommunityBinding
import com.google.android.material.tabs.TabLayoutMediator

class CommunityFragment : Fragment() {
    private val tabTitleArray = arrayOf("Board", "Guide")
    private lateinit var binding: FragmentCommunityBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentCommunityBinding.inflate(inflater, container, false)

        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        val pagerAdapter = OViewPagerAdapter(requireActivity())
        pagerAdapter.addFragment(CommunityFragmentT1())
        //pagerAdapter.addFragment(OMainFragmentTab2())

        binding.viewpagerCommunityCon.adapter = pagerAdapter
        binding.viewpagerCommunityCon.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback(){
            override fun onPageSelected(position: Int) {
                super.onPageSelected(position)
                Log.e("ViewPagerFragment", "Page ${position + 1}")
            }
        })
        TabLayoutMediator(binding.tabCommunityCon, binding.viewpagerCommunityCon){
                tab, position ->tab.text = tabTitleArray[position]
        }.attach()

    }

}