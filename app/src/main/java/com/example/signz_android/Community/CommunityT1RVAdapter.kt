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

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListItemViewHolder {
        val binding = CommunityBoardListBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ListItemViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    fun addItem(item: BoardData) {
        items.add(item)
        notifyDataSetChanged()
    }


    override fun onBindViewHolder(holder: ListItemViewHolder, position: Int) {
        holder.bind(items[position])
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

    inner class ListItemViewHolder(private val binding: CommunityBoardListBinding):RecyclerView.ViewHolder(binding.root){

        fun bind(data: BoardData){
            binding.tvTitle.text = data.title
            binding.tvNickname.text = data.nickname
            binding.tvCommunityDate.text = data.date
            binding.tvComment.text = data.comments.toString()
            binding.tvViewCounts.text = data.view.toString()
        }
    }
}

