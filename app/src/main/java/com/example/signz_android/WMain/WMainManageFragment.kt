package com.example.signz_android.WMain

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.signz_android.databinding.FragmentWMainmanageBinding


class WMainManageFragment : Fragment() {
    private lateinit var binding: FragmentWMainmanageBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentWMainmanageBinding.inflate(inflater, container, false)

        //근무완료를 누르면 근무완료 api에서 데이터 받기

        return binding.root
    }

    private fun initRecyclerView(result: List<WMainManageResult>){
        val wMainManageRVAdapter = WMainManageRVAdapter(requireContext(), result)
        binding.rvWmange.adapter = wMainManageRVAdapter
        binding.rvWmange.layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        wMainManageRVAdapter.setManageClickListener(object : WMainManageRVAdapter.ManageClickListener {
            override fun onItemClick(recruit: WMainManageResult) {
                val intent = Intent(context, WRecruitActivity::class.java)
                startActivity(intent)
            }

            override fun onQuitClick(recruit: WMainManageResult) {
                startActivity(Intent(context, WQuitActivity::class.java))
            }

            override fun onReportClick(recruit: WMainManageResult) {
                startActivity(Intent(context, WQuitActivity::class.java))
            }
        })
    }

}