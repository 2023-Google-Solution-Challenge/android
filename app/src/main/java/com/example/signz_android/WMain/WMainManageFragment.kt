package com.example.signz_android.WMain

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContentProviderCompat
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.signz_android.*
import com.example.signz_android.Usersign.LoginActivity
import com.example.signz_android.databinding.FragmentWMainmanageBinding


class WMainManageFragment : Fragment() {
    private lateinit var binding: FragmentWMainmanageBinding
    private var wMainManageList = ArrayList<WMainManageResult>()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentWMainmanageBinding.inflate(inflater, container, false)

        initRecyclerView()

        //근무완료를 누르면 근무완료 api에서 데이터 받기

        return binding.root
    }

    private fun initRecyclerView(){
        wMainManageList.apply {
            add(WMainManageResult("Cafe peach", "Mon,Wed", "10:00 ~ 15:00", "2023.03.16 start"))
        }
        val wMainManageRVAdapter = WMainManageRVAdapter(requireContext(), wMainManageList)
        binding.rvWmange.adapter = wMainManageRVAdapter
        binding.rvWmange.layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        wMainManageRVAdapter.setManageClickListener(object : WMainManageRVAdapter.ManageClickListener {
            override fun onItemClick(recruit: WMainManageResult) {
                val intent = Intent(context, WRecruitActivity::class.java)
                startActivity(intent)
            }

            override fun onQuitClick(recruit: WMainManageResult) {
                DialogYesNo(requireContext()){
                    if(it == "yes"){
                        startActivity(Intent(activity, WQuitActivity::class.java))
                    }
                }.show()
            }

            override fun onReportClick(recruit: WMainManageResult) {
                startActivity(Intent(context, WQuitActivity::class.java))
            }
        })
    }

}