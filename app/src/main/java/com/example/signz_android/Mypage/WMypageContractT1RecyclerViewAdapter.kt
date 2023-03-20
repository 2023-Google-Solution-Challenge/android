package com.example.signz_android.Mypage

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.signz_android.JobpostData
import com.example.signz_android.databinding.MainOwnerJobListBinding
import com.example.signz_android.databinding.MypageWorkerContractListBinding

class WMypageContractT1RecyclerViewAdapter(private var items: ArrayList<JobpostData>) :
    RecyclerView.Adapter<WMypageContractT1RecyclerViewAdapter.ListItemViewHolder>() {

    inner class ListItemViewHolder(private val binding: MypageWorkerContractListBinding):RecyclerView.ViewHolder(binding.root){

        fun bind(data: JobpostData, position: Int){
            binding.tvJobTitle.text = data.getData1()
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListItemViewHolder {
        val binding = MypageWorkerContractListBinding.inflate(LayoutInflater.from(parent.context), parent, false)
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

