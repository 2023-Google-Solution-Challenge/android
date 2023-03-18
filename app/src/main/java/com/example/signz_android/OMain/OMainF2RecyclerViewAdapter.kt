package com.example.signz_android.OMain

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.signz_android.PobData
import com.example.signz_android.databinding.MainOwnerPobListBinding

class OMainF2RecyclerViewAdapter(private var items: ArrayList<PobData>) :
    RecyclerView.Adapter<OMainF2RecyclerViewAdapter.ListItemViewHolder>() {

    inner class ListItemViewHolder(private val binding: MainOwnerPobListBinding):RecyclerView.ViewHolder(binding.root){

        fun bind(data: PobData, position: Int){
            binding.tvPobName.text = data.getData1()
            binding.tvPobNum.text = data.getData2()
            binding.tvPobDate.text = data.getData3()
        }
        private val fTab2 = OMainFragmentTab2.getInstance()
        init {
            binding.btnAdWorker.setOnClickListener {
                fTab2?.startActivity()
            }
            binding.btnDelPob.setOnClickListener {
                fTab2?.dialog()
            }
    }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListItemViewHolder {
        val binding = MainOwnerPobListBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ListItemViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return items.count()
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

