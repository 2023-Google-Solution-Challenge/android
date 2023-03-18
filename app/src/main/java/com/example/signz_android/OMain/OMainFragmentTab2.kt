package com.example.signz_android.OMain

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.signz_android.PobData
import com.example.signz_android.databinding.*

class OMainFragmentTab2 : Fragment(){
    private lateinit var binding: ActivityMainOwnerFrag2Binding
    private lateinit var listAdapter: OMainF2RecyclerViewAdapter

    private val pobList = ArrayList<PobData>()

    init{
        instance = this
    }

    companion object{
        private var instance: OMainFragmentTab2? = null
        fun getInstance(): OMainFragmentTab2? {
            return instance
        }
    }
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = ActivityMainOwnerFrag2Binding.inflate(inflater, container, false)

        binding.tvAddOp.setOnClickListener {
            startActivity(Intent(activity, ActivityMainOwnerAddWopBinding::class.java))
        }
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        listAdapter = OMainF2RecyclerViewAdapter(pobList)
        binding.frag2Recycle.layoutManager = LinearLayoutManager(activity, RecyclerView.VERTICAL, false)
        binding.frag2Recycle.adapter = listAdapter

        listAdapter.setItemClickListener(object : OMainF2RecyclerViewAdapter.OnItemClickListener {
            override fun onClick(v: View, position: Int) {
                val intent = Intent(activity, ActivityMainOwnerAddModBinding::class.java)
                startActivity(intent)
            }

        })

    }

    fun startActivity(){
        startActivity(Intent(activity, OMainModWopActivity::class.java))
    }

    fun dialog(){

    }
}