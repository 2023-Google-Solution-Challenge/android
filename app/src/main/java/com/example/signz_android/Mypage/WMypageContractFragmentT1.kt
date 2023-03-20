package com.example.signz_android.Mypage

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.signz_android.JobpostData
import com.example.signz_android.OMain.OMainF1RecyclerViewAdapter
import com.example.signz_android.OMain.OMainModJobActivity
import com.example.signz_android.WMain.ContractActivity
import com.example.signz_android.WMain.WMainRecruitRVAdapter
import com.example.signz_android.WMain.WMainRecruitResult
import com.example.signz_android.WMain.WRecruitActivity
import com.example.signz_android.databinding.FragmentMypageOContractT1Binding
import com.example.signz_android.databinding.FragmentMypageWContractT1Binding

class WMypageContractFragmentT1 : Fragment() {
    private lateinit var binding: FragmentMypageWContractT1Binding
    private val jobList = ArrayList<JobpostData>()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMypageWContractT1Binding.inflate(inflater, container, false)

        initRecyclerView()

        return binding.root
    }

    private fun initRecyclerView(){
        jobList.apply { add(JobpostData("Cafe peach", "Cafe peach needs new barista", "2023-03-16")) }
        val listAdapter = WMypageContractT1RecyclerViewAdapter(jobList)
        binding.mypageT1Recycle.layoutManager = LinearLayoutManager(activity, RecyclerView.VERTICAL, false)
        binding.mypageT1Recycle.adapter = listAdapter

        listAdapter.setItemClickListener(object : WMypageContractT1RecyclerViewAdapter.OnItemClickListener {
            override fun onClick(v: View, position: Int) {
                val intent = Intent(activity, ContractActivity::class.java)
                startActivity(intent)
            }
        })
    }
}