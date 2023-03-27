package com.example.signz_android.Mypage

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.signz_android.CandiData
import com.example.signz_android.OMain.OMainCandiRecyclerviewAdapter
import com.example.signz_android.OMain.OMainManageCandiActivity
import com.example.signz_android.WMain.WMainManageResult
import com.example.signz_android.databinding.ItemManageBinding
import com.example.signz_android.databinding.MainOwnerCandiListBinding
import com.example.signz_android.databinding.MypageOwnerManageOngoingListBinding

class OMypageManageRVAdapter(val data : ArrayList<CandiData>) :
    RecyclerView.Adapter<OMypageManageRVAdapter.ViewHolder>() {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): OMypageManageRVAdapter.ViewHolder {
        val binding: MypageOwnerManageOngoingListBinding = MypageOwnerManageOngoingListBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }


    override fun onBindViewHolder(holder: OMypageManageRVAdapter.ViewHolder, position: Int) {
        holder.bind(data[position])
    }

    override fun getItemCount(): Int = data.size

    inner class ViewHolder(val binding: MypageOwnerManageOngoingListBinding) :
        RecyclerView.ViewHolder(binding.root) {

        private val candiActivity = OMypageManageActivity.getInstance()
        init {
            binding.btnQuitCandi.setOnClickListener {
                candiActivity?.onQuitClick()
            }

        }

        fun bind(data: CandiData){
            binding.tvCandiName.text = data.getData1()
            binding.tvWorkDay.text = data.getData2()
            binding.tvWorktime.text = data.getData3()
            binding.tvCandiScore.text = data.getData4()
        }
    }
}