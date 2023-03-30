package com.example.signz_android.Calendar

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContentProviderCompat.requireContext
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.signz_android.databinding.ActivityNoticeBinding

class CalendarNoticeActivity : AppCompatActivity() {
    private lateinit var binding: ActivityNoticeBinding
    private var notice = ArrayList<NoticeData>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNoticeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnNoticeBack.setOnClickListener {
            finish()
        }
        initRecyclerView()

    }

    private fun initRecyclerView(){
        notice.apply{
            add(NoticeData("Today is pay date"))
            add(NoticeData("Kim attend"))
        }
        val noticeRVAdapter = NoticeRVAdapter(this, notice)
        binding.rvNoticeNotice.adapter = noticeRVAdapter
        binding.rvNoticeNotice.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        noticeRVAdapter.setNoticeClickListener(object : NoticeRVAdapter.NoticeClickListener{
            override fun onItemClick(notice: NoticeData) {

            }
        })
    }
}