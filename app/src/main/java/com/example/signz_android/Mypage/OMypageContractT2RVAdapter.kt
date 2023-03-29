package com.example.signz_android.Mypage

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.signz_android.CandiData
import com.example.signz_android.JobpostData
import com.example.signz_android.databinding.MainOwnerJobListBinding
import com.example.signz_android.databinding.MypageOwnerContractCompleteListBinding
import com.example.signz_android.databinding.MypageOwnerContractListBinding
import com.example.signz_android.databinding.MypageWorkerContractListBinding

class OMypageContractT2RVAdapter(private var items: ArrayList<CandiData>) :
    RecyclerView.Adapter<OMypageContractT2RVAdapter.ListItemViewHolder>() {

    inner class ListItemViewHolder(private val binding: MypageOwnerContractCompleteListBinding):RecyclerView.ViewHolder(binding.root){

        fun bind(data: CandiData, position: Int){
            binding.tvCandiName.text = data.getData1()
            binding.tvCompleteDay.text = data.getData2()
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListItemViewHolder {
        val binding = MypageOwnerContractCompleteListBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ListItemViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return items.count()
    }

    fun addItem(item: CandiData) {
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

