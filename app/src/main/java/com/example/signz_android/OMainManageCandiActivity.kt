package com.example.signz_android

import android.app.Dialog
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.signz_android.databinding.ActivityOManageBinding
import com.example.signz_android.databinding.ActivityOViewcandiBinding

class OMainManageCandiActivity : AppCompatActivity() {
    private lateinit var binding: ActivityOManageBinding
    private var adapter: OMainCandiRecyclerviewAdapter? = null
    private val data: MutableList<CandiData> = mutableListOf()

    init{
        instance = this
    }

    companion object{
        private var instance: OMainManageCandiActivity? = null
        fun getInstance(): OMainManageCandiActivity? {
            return instance
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOManageBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        adapter = OMainCandiRecyclerviewAdapter()
        adapter!!.listData = data
        binding.manageRecycle.adapter = adapter
        binding.manageRecycle.layoutManager = LinearLayoutManager(this)

        binding.btnManageBack.setOnClickListener {
            finish()
        }
    }

    fun startActivityViewCandi(){
        startActivity(Intent(this@OMainManageCandiActivity, ActivityOViewcandiBinding::class.java))
    }

    fun dialog(){
        //val dialog = DialogSelectCandi(this@OMainManageCandiActivity)
    }
}

