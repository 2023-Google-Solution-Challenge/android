package com.example.signz_android.Mypage

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.signz_android.CandiData
import com.example.signz_android.OMain.OMainCandiRecyclerviewAdapter
import com.example.signz_android.OMain.OMainManageCandiActivity
import com.example.signz_android.WMain.WMainManageResult
import com.example.signz_android.databinding.ItemManageBinding
import com.example.signz_android.databinding.MainOwnerCandiListBinding

class WMypageManageRVAdapter(val result : ArrayList<WMainManageResult>) :
    RecyclerView.Adapter<WMypageManageRVAdapter.ViewHolder>() {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): WMypageManageRVAdapter.ViewHolder {
        val binding: ItemManageBinding = ItemManageBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }


    override fun onBindViewHolder(holder: WMypageManageRVAdapter.ViewHolder, position: Int) {
        holder.bind(result[position])
    }

    override fun getItemCount(): Int = result.size

    inner class ViewHolder(val binding: ItemManageBinding) :
        RecyclerView.ViewHolder(binding.root) {

        private val candiActivity = WMypageManageActivity.getInstance()
        init {
            binding.btnManagelistQuit.setOnClickListener {
                candiActivity?.onQuitClick()
            }

            binding.btnManagelistReport.setOnClickListener {
                candiActivity?.onReportClick()
            }
        }

        fun bind(recruit: WMainManageResult){
            binding.tvManagelistTitle.text = recruit.shop
            binding.tvManagelistDay.text = recruit.date
            binding.tvManagelistTime.text = recruit.time
            binding.tvManagelistPeriod.text = recruit.period
        }
    }
}