package com.example.signz_android

import android.app.PendingIntent.getActivity
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.signz_android.databinding.ActivityOViewcandiBinding
import com.example.signz_android.databinding.MainOwnerCandiListBinding
import com.example.signz_android.databinding.MainOwnerJobListBinding
import com.example.signz_android.databinding.MainOwnerPobListBinding
import java.lang.reflect.Member

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
                //지원자 관리 액티비티로 넘어가야함
                fTab2?.startActivity()
            }
            binding.btnDelPob.setOnClickListener {
                //dialog 띄워주고 버튼 enable 처리
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

