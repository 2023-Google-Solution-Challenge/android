package com.example.signz_android.Calendar

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.signz_android.databinding.ItemNoticeBinding
import com.example.signz_android.databinding.ItemPayBinding


class NoticeRVAdapter(val context: Context, val result: ArrayList<NoticeData>) : RecyclerView.Adapter<NoticeRVAdapter.ViewHolder>() {
    interface NoticeClickListener{
        fun onItemClick(notice: NoticeData)
    }
    private lateinit var noticeClickListener : NoticeClickListener
    fun setNoticeClickListener(itemClickListener: NoticeClickListener){
        noticeClickListener = itemClickListener
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): NoticeRVAdapter.ViewHolder {
        val binding: ItemNoticeBinding = ItemNoticeBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(result[position])
        holder.binding.btnItemnotice.setOnClickListener {
            noticeClickListener.onItemClick(result[position])
        }
    }

    override fun getItemCount(): Int  = result.size

    inner class ViewHolder(val binding: ItemNoticeBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(notice: NoticeData){
            binding.tvItemnotice.text = notice.notice
        }
    }

}

class PaylistRVAdapter(val context: Context, val result: ArrayList<PaylistData>) : RecyclerView.Adapter<PaylistRVAdapter.ViewHolder>() {
    interface PaylistClickListener{
        fun onNoClick(paylist: PaylistData)
        fun onYesClick(paylist: PaylistData)
    }
    private lateinit var paylistClickListener : PaylistClickListener
    fun setPaylistClickListener(itemClickListener: PaylistClickListener){
        paylistClickListener = itemClickListener
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): PaylistRVAdapter.ViewHolder {
        val binding: ItemPayBinding = ItemPayBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(result[position])
        holder.binding.btnItempayNo.setOnClickListener {
            paylistClickListener.onNoClick(result[position])
        }
        holder.binding.btnItempayYes.setOnClickListener {
            paylistClickListener.onYesClick(result[position])
            holder.binding.btnItempayNo.visibility = View.GONE
            holder.binding.btnItempayYes.visibility = View.GONE
        }
    }

    override fun getItemCount(): Int  = result.size

    inner class ViewHolder(val binding: ItemPayBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(paylist: PaylistData){
            binding.tvItempayDate.text = paylist.date
            binding.tvItempayPay.text = paylist.pay
            binding.tvItempaySum.text = paylist.detail
        }
    }

}

class PayDoneRVAdapter(val context: Context, val result: ArrayList<PaylistData>) : RecyclerView.Adapter<PayDoneRVAdapter.ViewHolder>() {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): PayDoneRVAdapter.ViewHolder {
        val binding: ItemPayBinding = ItemPayBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(result[position])
    }

    override fun getItemCount(): Int  = result.size

    inner class ViewHolder(val binding: ItemPayBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(paylist: PaylistData){
            binding.tvItempayDate.text = paylist.date
            binding.tvItempayPay.text = paylist.pay
            binding.tvItempaySum.text = paylist.detail
            binding.btnItempayNo.visibility = View.GONE
            binding.btnItempayYes.visibility = View.GONE
        }    }

}

