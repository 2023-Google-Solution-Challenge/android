//package com.example.signz_android
//
//import android.app.PendingIntent.getActivity
//import android.content.Intent
//import android.view.LayoutInflater
//import android.view.View
//import android.view.ViewGroup
//import android.widget.TextView
//import androidx.core.content.ContextCompat.startActivity
//import androidx.recyclerview.widget.RecyclerView
//import com.example.signz_android.databinding.ActivityOViewcandiBinding
//import com.example.signz_android.databinding.MainOwnerCandiListBinding
//import com.example.signz_android.databinding.MainOwnerJobListBinding
//import java.lang.reflect.Member
//
//class OMainF1RecyclerViewAdapter(private var items: ArrayList<JobpostData>) :
//    RecyclerView.Adapter<OMainF1RecyclerViewAdapter.ListItemViewHolder>() {
//
//    inner class ListItemViewHolder(private val binding: MainOwnerJobListBinding):RecyclerView.ViewHolder(binding.root){
//
//        fun bind(data: JobpostData, position: Int){
//            binding.tvJobName.text = data.getData1()
//            binding.tvJobTitle.text = data.getData2()
//            binding.tvJobDate.text = data.getData3()
//
//        }
//        private val fTab1 = OMainFragmentTab1.getInstance()
//        init {
//            binding.btnViewCandi.setOnClickListener {
//                //지원자 관리 액티비티로 넘어가야함
//                fTab1?.startActivity()
//            }
//            binding.btnEndRecurit.setOnClickListener {
//                //dialog 띄워주고 버튼 enable 처리
//                fTab1?.dialog()
//            }
//    }
//    }
//
//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListItemViewHolder {
//        val binding = MainOwnerJobListBinding.inflate(LayoutInflater.from(parent.context), parent, false)
//        return ListItemViewHolder(binding)
//    }
//
//    override fun getItemCount(): Int {
//        return items.count()
//    }
//
//    override fun onBindViewHolder(holder: ListItemViewHolder, position: Int) {
//        holder.bind(items[position], position)
//        holder.itemView.setOnClickListener {
//            itemClickListener.onClick(it, position)
//        }
//    }
//    interface OnItemClickListener{
//        fun onClick(v: View, position: Int)
//    }
//    fun setItemClickListener(onItemClickListener: OnItemClickListener){
//        this.itemClickListener = onItemClickListener
//    }
//    private lateinit var itemClickListener : OnItemClickListener
//}
//
