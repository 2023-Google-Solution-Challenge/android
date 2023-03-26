package com.example.signz_android.Community

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.signz_android.BoardData
import com.example.signz_android.JobpostData
import com.example.signz_android.databinding.CommunityBoardListBinding
import com.example.signz_android.databinding.MainOwnerJobListBinding

class CommunityT1RVAdapter(private var items: ArrayList<BoardData>) :
    RecyclerView.Adapter<CommunityT1RVAdapter.ListItemViewHolder>() {

    inner class ListItemViewHolder(private val binding: CommunityBoardListBinding):RecyclerView.ViewHolder(binding.root){

        fun bind(data: BoardData, position: Int){
            binding.tvTitle.text = data.getData1()
            binding.tvNickname.text = data.getData2()
            binding.tvCommunityDate.text = data.getData3()
            binding.tvComment.text = data.getData4().toString()
            binding.tvViewCounts.text = data.getData5().toString()
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListItemViewHolder {
        val binding = CommunityBoardListBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ListItemViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return items.count()
    }

    fun addItem(item: BoardData) {
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

