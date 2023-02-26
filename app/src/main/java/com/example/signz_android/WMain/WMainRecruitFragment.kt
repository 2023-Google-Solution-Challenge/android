package com.example.signz_android.WMain

import android.R
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.SeekBar
import android.widget.SlidingDrawer
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.signz_android.databinding.FragmentWMainrecruitBinding
import com.google.gson.Gson


class WMainRecruitFragment : Fragment(), WMainRecruitView {
    private lateinit var binding : FragmentWMainrecruitBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentWMainrecruitBinding.inflate(inflater, container, false)


        initSeekBar()

        return binding.root
    }

    override fun onStart() {
        super.onStart()
//        val recruitService = WMainService()
//        recruitService.setRecruitView(this)

    }

    private fun initSeekBar(){
        binding.seekbarWmainrecruit.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {
                binding.tvWmainrecruitKm.text = p1.toString()+"km"
                //서버에 번호 요청
            }

            override fun onStartTrackingTouch(p0: SeekBar?) {
            }

            override fun onStopTrackingTouch(p0: SeekBar?) {
            }

        })
    }

    private fun initRecyclerView(result: List<WMainRecruitResult>){
        val wMainRecruitRVAdapter = WMainRecruitRVAdapter(requireContext(), result)
        binding.rvWmainrecruit.adapter = wMainRecruitRVAdapter
        binding.rvWmainrecruit.layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        wMainRecruitRVAdapter.setRecruitClickListener(object : WMainRecruitRVAdapter.RecruitClickListener {
            override fun onItemClick(recruit: WMainRecruitResult) {
                val intent = Intent(context, WRecruitActivity::class.java)
                startActivity(intent)
            }
        })
    }

    override fun onWMainRecruitSuccess(code: Int, result: List<WMainRecruitResult>) {
        initRecyclerView(result)
        Log.d("RECRUIT-SUCCESS", result.toString())
    }

    override fun onWMainRecruitFailure() {

    }

}