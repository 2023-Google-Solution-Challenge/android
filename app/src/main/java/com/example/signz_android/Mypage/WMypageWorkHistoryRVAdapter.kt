package com.example.signz_android.Mypage

import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.signz_android.CandiData
import com.example.signz_android.WorkHistoryData
import com.example.signz_android.databinding.MainOwnerCandiListBinding
import com.example.signz_android.databinding.MypageWorkerWorkHistoryListBinding


class WMypageWorkHistoryRVAdapter(private var items: ArrayList<WorkHistoryData>) :
    RecyclerView.Adapter<WMypageWorkHistoryRVAdapter.ListItemViewHolder>(){

    //var listData = mutableListOf<CandiData>()
    inner class ListItemViewHolder(private val binding: MypageWorkerWorkHistoryListBinding) : RecyclerView.ViewHolder(binding.root){

        fun bind(member: WorkHistoryData, position: Int){
            binding.tvWorkPlace.text = member.getData1()
            binding.tvStartDay.text = member.getData2()
            binding.tvEndDay.text = member.getData3()
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):ListItemViewHolder {
        val binding = MypageWorkerWorkHistoryListBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ListItemViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ListItemViewHolder, position: Int) {
        val member = items[position]
        holder.bind(member, position)
    }

    override fun getItemCount(): Int {
        return items.count()
    }

}

