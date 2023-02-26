package com.example.signz_android.WMain


import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.example.signz_android.databinding.ItemManageBinding
import com.example.signz_android.databinding.ItemRecruitBinding

class WMainRecruitRVAdapter(val context: Context, val result : List<WMainRecruitResult>) : RecyclerView.Adapter<WMainRecruitRVAdapter.ViewHolder>() {

    interface RecruitClickListener{
        fun onItemClick(recruit: WMainRecruitResult)
    }
    private lateinit var recruitClickListener : RecruitClickListener
    fun setRecruitClickListener(itemClickListener: RecruitClickListener){
        recruitClickListener = itemClickListener
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): WMainRecruitRVAdapter.ViewHolder {
        val binding: ItemRecruitBinding = ItemRecruitBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: WMainRecruitRVAdapter.ViewHolder, position: Int) {
        holder.bind(result[position])
        holder.binding.clRecruitlist.setOnClickListener {
            recruitClickListener.onItemClick((result[position]))
        }
    }

    override fun getItemCount(): Int = result.size

    inner class ViewHolder(val binding: ItemRecruitBinding) :
        RecyclerView.ViewHolder(binding.root) {
            fun bind(recruit: WMainRecruitResult){
                binding.tvRecruitlistShop.text = recruit.shop
                binding.tvRecruitlistTitle.text = recruit.title
                binding.tvRecruitlistPay.text = recruit.pay
                binding.tvRecruitlistRating.text = recruit.rating.toString()
                binding.tvRecruitlistReliability.text = recruit.reliability.toString()
            }
    }
}

class WMainManageRVAdapter(val context: Context, val result : List<WMainManageResult>) : RecyclerView.Adapter<WMainManageRVAdapter.ViewHolder>() {

    interface ManageClickListener{
        fun onItemClick(recruit: WMainManageResult)
        fun onQuitClick(recruit: WMainManageResult)
        fun onReportClick(recruit: WMainManageResult)
    }
    private lateinit var recruitClickListener : ManageClickListener
    fun setManageClickListener(itemClickListener: ManageClickListener){
        recruitClickListener = itemClickListener
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): WMainManageRVAdapter.ViewHolder {
        val binding: ItemManageBinding = ItemManageBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: WMainManageRVAdapter.ViewHolder, position: Int) {
        holder.bind(result[position])
        holder.binding.clManagelist.setOnClickListener {
            recruitClickListener.onItemClick((result[position]))
        }
        holder.binding.btnManagelistQuit.setOnClickListener{
            recruitClickListener.onQuitClick((result[position]))
        }
        holder.binding.btnManagelistReport.setOnClickListener{
            recruitClickListener.onReportClick((result[position]))
        }
    }

    override fun getItemCount(): Int = result.size

    inner class ViewHolder(val binding: ItemManageBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(recruit: WMainManageResult){
            binding.tvManagelistTitle.text = recruit.shop
            binding.tvManagelistDay.text = recruit.date
            binding.tvManagelistTime.text = recruit.time
            binding.tvManagelistPeriod.text = recruit.period
        }
    }
}
