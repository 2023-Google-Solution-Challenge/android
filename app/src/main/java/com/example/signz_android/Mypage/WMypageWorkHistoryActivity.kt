package com.example.signz_android.Mypage

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.signz_android.CandiData
import com.example.signz_android.OMain.OMainCandiRecyclerviewAdapter
import com.example.signz_android.WorkHistoryData
import com.example.signz_android.databinding.ActivityMypageWorkHistoryBinding
import java.io.Serializable

class WMypageWorkHistoryActivity : AppCompatActivity(){
    private lateinit var binding: ActivityMypageWorkHistoryBinding
    private val whlist = ArrayList<WorkHistoryData>()
    private lateinit var adapter: WMypageWorkHistoryRVAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMypageWorkHistoryBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initialize()
        adapter = WMypageWorkHistoryRVAdapter(whlist)
        binding.mypageHistoryRecycle.adapter = adapter
        binding.mypageHistoryRecycle.layoutManager = LinearLayoutManager(this)

        if (intent.hasExtra("name")){
            val name = intent.getStringExtra("name")
            val start_day = intent.getStringExtra("start_day")
            val end_day = intent.getStringExtra("end_day")
            whlist.add(WorkHistoryData(name!!, start_day!!, end_day!!))
        }

        adapter?.notifyDataSetChanged()

        binding.tvWriteHistory.setOnClickListener {
            val intent = Intent(this, WMypageAddWorkHistoryActivity::class.java)
            startActivity(intent)
        }

        binding.btnHistoryBack.setOnClickListener {
            finish()
        }
    }

    private fun initialize(){
        with(whlist){
            add(WorkHistoryData("Gongcha", "2022-1-5", "2022-10-10"))
            add(WorkHistoryData("Movie theater", "2020-11-27", "2021-11-11"))
        }
    }
}