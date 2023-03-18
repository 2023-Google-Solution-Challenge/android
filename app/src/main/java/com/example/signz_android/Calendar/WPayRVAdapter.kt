package com.example.signz_android.Calendar

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.signz_android.databinding.ItemPayBinding

class WPayRVAdapter(val context: Context, val result: ArrayList<WPayListResult>) : RecyclerView.Adapter<WPayRVAdapter.ViewHolder>() {

    interface PayClickListener{
        fun onItemClick(recruit: WPayListResult)
    }
    private lateinit var recruitClickListener : PayClickListener
    fun setPayClickListener(itemClickListener: PayClickListener){
        recruitClickListener = itemClickListener
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): WPayRVAdapter.ViewHolder {
        val binding: ItemPayBinding = ItemPayBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: WPayRVAdapter.ViewHolder, position: Int) {
        holder.bind(result[position])

    }

    override fun getItemCount(): Int = result.size

    inner class ViewHolder(val binding: ItemPayBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(pay: WPayListResult){
            binding.tvItempayDate.text = pay.date
            binding.tvItempayPay.text = pay.pay
            binding.tvItempaySum.text = pay.sum
        }
    }
}