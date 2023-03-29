package com.example.signz_android.Mypage

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.signz_android.EduData
import com.example.signz_android.databinding.MypageBadgeListBinding


class MypageBadgeRVAdapter(private var items: ArrayList<EduData>):
    RecyclerView.Adapter<MypageBadgeRVAdapter.ListItemViewHolder>(){

    inner class ListItemViewHolder(private val binding: MypageBadgeListBinding) : RecyclerView.ViewHolder(binding.root){

        private val context = binding.root.context
        private val img : ImageView = binding.imgThumbnail

        fun bind(member: EduData){
            val id : String = member.getData1().substring(member.getData1().lastIndexOf("/") + 1)
            val url = "https://img.youtube.com/vi/$id/default.jpg"
            Glide.with(itemView).load(url).into(img)
            binding.badgeTitle.text = member.getData2()
            binding.badgeSrc.text = member.getData3()

            itemView.setOnClickListener {
                val intent = Intent(context, MypageYoutubeViewActivity::class.java)
                intent.putExtra("id", id)
                intent.run { context.startActivity(this) }
            }
        }
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MypageBadgeRVAdapter.ListItemViewHolder {
        val binding = MypageBadgeListBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ListItemViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MypageBadgeRVAdapter.ListItemViewHolder, position: Int) {
        val member = items[position]
        holder.bind(member)
    }

    override fun getItemCount(): Int {
        return items.count()
    }

}