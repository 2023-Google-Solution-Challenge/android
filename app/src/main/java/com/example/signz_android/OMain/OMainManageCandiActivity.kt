package com.example.signz_android.OMain

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.signz_android.CandiData
import com.example.signz_android.DialogSelectCandi
import com.example.signz_android.databinding.ActivityOManageBinding

class OMainManageCandiActivity : AppCompatActivity() {
    private lateinit var binding: ActivityOManageBinding
    private var adapter: OMainCandiRecyclerviewAdapter? = null
    private val data = ArrayList<CandiData>()

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

        data.apply { add(CandiData("Gildong Hong", "Mon, Wed", "10:00 ~ 14:00", "65")) }

        adapter = OMainCandiRecyclerviewAdapter(data)
        binding.manageRecycle.adapter = adapter
        binding.manageRecycle.layoutManager = LinearLayoutManager(this)

        binding.btnManageBack.setOnClickListener {
            finish()
        }
    }

    fun startActivityViewCandi(){
        val intent = Intent(this, OMainViewCandiActivity::class.java)
        startActivity(intent)
    }

    fun dialogSelectCandi(){
        val dialog = DialogSelectCandi(this)
        dialog.show()
    }
}

