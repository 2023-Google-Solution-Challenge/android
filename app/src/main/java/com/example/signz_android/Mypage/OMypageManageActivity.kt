package com.example.signz_android.Mypage

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.signz_android.CandiData
import com.example.signz_android.DialogOQuit
import com.example.signz_android.DialogQuit
import com.example.signz_android.DialogSelectCandi
import com.example.signz_android.WMain.WMainManageResult
import com.example.signz_android.WMain.WQuitActivity
import com.example.signz_android.databinding.ActivityOMypagemanageBinding
import com.example.signz_android.databinding.ActivityWMypagemanageBinding


class OMypageManageActivity : AppCompatActivity() {
    private lateinit var binding: ActivityOMypagemanageBinding
    private var adapter: OMypageManageRVAdapter? = null
    private var candidata = ArrayList<CandiData>()

    init{
        instance = this
    }

    companion object{
        private var instance: OMypageManageActivity? = null
        fun getInstance(): OMypageManageActivity? {
            return instance
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOMypagemanageBinding.inflate(layoutInflater)
        setContentView(binding.root)

        candidata.apply {
            add(CandiData("Gildong Hong", "Mon, Wed", "10:00 ~ 14:00", "65"))
        }
        adapter = OMypageManageRVAdapter(candidata)
        binding.rvOmanage.adapter = adapter
        binding.rvOmanage.layoutManager = LinearLayoutManager(this)

        binding.btnOManageBack.setOnClickListener {
            finish()
        }

    }

    fun onQuitClick() {
        val dialog = DialogOQuit(this)
        dialog.show()
        //startActivity(Intent(this, OQuitActivity::class.java))
    }

}