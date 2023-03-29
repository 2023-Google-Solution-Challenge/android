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
import com.example.signz_android.WMain.ContractActivity
import com.example.signz_android.databinding.FragmentMypageOContractT2Binding
import com.example.signz_android.databinding.FragmentMypageWContractT2Binding

class WMypageContractFragmentT2 : Fragment() {
    private lateinit var binding: FragmentMypageWContractT2Binding
    private val jobList = ArrayList<JobpostData>()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMypageWContractT2Binding.inflate(inflater, container, false)

        initRecyclerView()

        return binding.root
    }

    private fun initRecyclerView(){
        jobList.apply { add(JobpostData("Gong cha", "Gong cha needs new barista", "2022-01-27")) }
        val listAdapter = WMypageContractT2RecyclerViewAdapter(jobList)
        binding.mypageT2Recycle.layoutManager = LinearLayoutManager(activity, RecyclerView.VERTICAL, false)
        binding.mypageT2Recycle.adapter = listAdapter

        listAdapter.setItemClickListener(object : WMypageContractT2RecyclerViewAdapter.OnItemClickListener {
            override fun onClick(v: View, position: Int) {
                val intent = Intent(activity, ContractActivity::class.java)
                startActivity(intent)
            }
        })
    }

}