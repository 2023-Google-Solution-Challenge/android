package com.example.signz_android.Mypage

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.signz_android.JobpostData
import com.example.signz_android.databinding.MainOwnerJobListBinding
import com.example.signz_android.databinding.MypageWorkerContractCompleteListBinding
import com.example.signz_android.databinding.MypageWorkerContractListBinding

class WMypageContractT2RecyclerViewAdapter(private var items: ArrayList<JobpostData>) :
    RecyclerView.Adapter<WMypageContractT2RecyclerViewAdapter.ListItemViewHolder>() {

    inner class ListItemViewHolder(private val binding: MypageWorkerContractCompleteListBinding):RecyclerView.ViewHolder(binding.root){

        fun bind(data: JobpostData, position: Int){
            binding.tvWorkPlace.text = data.getData1()
            binding.tvCompleteDay.text = "2.1.2023"
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListItemViewHolder {
        val binding = MypageWorkerContractCompleteListBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ListItemViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return items.count()
    }

    fun addItem(item: JobpostData) {
        items.add(item)
        notifyDataSetChanged()
    }


    override fun onBindViewHolder(holder: ListItemViewHolder, position: Int) {
        holder.bind(items[position], position)
        holder.itemView.setOnClickListener {
            itemClickListener.onClick(it, position)
        }
    }
    interface OnItemClickListener{
        fun onClick(v: View, position: Int)
    }
    fun setItemClickListener(onItemClickListener: OnItemClickListener){
        this.itemClickListener = onItemClickListener
    }
    private lateinit var itemClickListener : OnItemClickListener
}

