package com.example.signz_android.OMain

import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.signz_android.CandiData
import com.example.signz_android.databinding.MainOwnerCandiListBinding


class OMainCandiRecyclerviewAdapter(private var items: ArrayList<CandiData>) :
    RecyclerView.Adapter<OMainCandiRecyclerviewAdapter.ListItemViewHolder>(){

    //var listData = mutableListOf<CandiData>()
    inner class ListItemViewHolder(private val binding: MainOwnerCandiListBinding) : RecyclerView.ViewHolder(binding.root){

        private val candiActivity = OMainManageCandiActivity.getInstance()
        init {
            binding.btnCandiDecide.setOnClickListener {
                //다이얼로그 후 확정
                candiActivity?.dialogSelectCandi()
            }

            binding.btnViewCandi.setOnClickListener {
                //지원서 보기 액티비티로 이동
                candiActivity?.startActivityViewCandi()
            }
        }

        fun bind(member: CandiData, position: Int){
            binding.tvCandiName.text = member.getData1()
            binding.tvWorkDay.text = member.getData2()
            binding.tvCandiScore.text = member.getData3()
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):ListItemViewHolder {
        val binding = MainOwnerCandiListBinding.inflate(LayoutInflater.from(parent.context), parent, false)
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

