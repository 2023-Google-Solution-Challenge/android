package com.example.signz_android

import android.app.Dialog
import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.signz_android.databinding.MainOwnerCandiListBinding


class OMainCandiRecyclerviewAdapter : RecyclerView.Adapter<Holder>(){

    var listData = mutableListOf<CandiData>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val binding = MainOwnerCandiListBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return Holder(binding)
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        val member = listData[position]
        holder.setData(member, position)
    }

    override fun getItemCount(): Int {
        return listData.size
    }

}

class Holder(val binding: MainOwnerCandiListBinding) : RecyclerView.ViewHolder(binding.root){

    private val candiActivity = OMainManageCandiActivity.getInstance()
    init {
        binding.btnCandiDecide.setOnClickListener {
            //다이얼로그 후 확정
            candiActivity?.dialog()
        }

        binding.btnViewCandi.setOnClickListener {
            //지원서 보기 액티비티로 이동
            candiActivity?.startActivityViewCandi()
        }
    }

    fun setData(member: CandiData, position: Int){
        binding.tvCandiName.text = member.getData1()
        binding.tvWorkDay.text = member.getData2()
        binding.tvCandiScore.text = member.getData3()
    }
}