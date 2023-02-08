package com.example.signz_android

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class FindAccountVPAdapter(fragmentActivity: FragmentActivity) :  FragmentStateAdapter(fragmentActivity) {
    override fun getItemCount(): Int = 2

    override fun createFragment(position: Int): Fragment {
        return when(position){
            0 -> FindIdFragment()
            else -> FindPwFragment()
        }
    }

}