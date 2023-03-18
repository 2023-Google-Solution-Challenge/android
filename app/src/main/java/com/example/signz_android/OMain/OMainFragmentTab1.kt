package com.example.signz_android.OMain

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.signz_android.JobpostData
import com.example.signz_android.databinding.ActivityMainOwnerFrag1Binding
import com.example.signz_android.databinding.ActivityOManageBinding

class OMainFragmentTab1 : Fragment(){
    private lateinit var binding: ActivityMainOwnerFrag1Binding
    private lateinit var listAdapter: OMainF1RecyclerViewAdapter

    private val jobList = ArrayList<JobpostData>()

    init{
        instance = this
    }

    companion object{
        private var instance: OMainFragmentTab1? = null
        fun getInstance(): OMainFragmentTab1? {
            return instance
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = ActivityMainOwnerFrag1Binding.inflate(inflater, container, false)

        binding.tvWriteOp.setOnClickListener {
            startActivity(Intent(context, OMainAddJobActivity::class.java))
        }

        return binding.root
    }



    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        listAdapter = OMainF1RecyclerViewAdapter(jobList)
        binding.frag1Recycle.layoutManager = LinearLayoutManager(activity, RecyclerView.VERTICAL, false)
        binding.frag1Recycle.adapter = listAdapter

        listAdapter.setItemClickListener(object : OMainF1RecyclerViewAdapter.OnItemClickListener{
            override fun onClick(v: View, position: Int) {
                val intent = Intent(activity, OMainModJobActivity::class.java)
                startActivity(intent)
            }

    })

    }

    fun startActivity(){
        startActivity(Intent(activity, OMainManageCandiActivity::class.java))
    }

    fun dialog(){

    }
}
