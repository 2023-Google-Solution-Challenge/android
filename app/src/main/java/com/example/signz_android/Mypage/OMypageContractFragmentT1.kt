package com.example.signz_android.Mypage

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.signz_android.CandiData
import com.example.signz_android.WMain.ContractActivity
import com.example.signz_android.databinding.FragmentMypageOContractT1Binding

class OMypageContractFragmentT1 : Fragment() {
    private lateinit var binding: FragmentMypageOContractT1Binding
    private val employee = ArrayList<CandiData>()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMypageOContractT1Binding.inflate(inflater, container, false)

        initRecyclerView()
        return binding.root
    }

    private fun initRecyclerView(){
        employee.apply { add(CandiData("Gildong Hong", "2023-3-16", "","")) }
        val listAdapter = OMypageContractT1RVAdapter(employee)
        binding.mypageT1Recycle.layoutManager = LinearLayoutManager(activity, RecyclerView.VERTICAL, false)
        binding.mypageT1Recycle.adapter = listAdapter

        listAdapter.setItemClickListener(object : OMypageContractT1RVAdapter.OnItemClickListener {
            override fun onClick(v: View, position: Int) {
                val intent = Intent(activity, ContractActivity::class.java)
                startActivity(intent)
            }
        })
    }
}