package com.example.signz_android.Calendar

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.signz_android.DialogOkCancel
import com.example.signz_android.databinding.DialogOkcancelBinding
import com.example.signz_android.databinding.FragmentWPaylistBinding
import com.example.signz_android.databinding.ItemPayBinding

class WPayListFragment: Fragment() {
    private lateinit var binding: FragmentWPaylistBinding
    private var payList = ArrayList<PaylistData>()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentWPaylistBinding.inflate(inflater, container, false)

        initRecyclerView()

        return binding.root
    }

    private fun initRecyclerView(){
        payList.apply {
            add(PaylistData("2023.01", "₩582,000", "12d X 5h X ₩9700"))
            add(PaylistData("2023.02", "₩776,000", "16d X 5h X ₩9700"))
        }
        val payRVAdapter = PaylistRVAdapter(requireContext(), payList)
        binding.rvWpaylist.adapter = payRVAdapter
        binding.rvWpaylist.layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        payRVAdapter.setPaylistClickListener(object : PaylistRVAdapter.PaylistClickListener{
            override fun onNoClick(payroll: PaylistData) {
                DialogOkCancel(requireContext()){
                    if (it == "ok"){

                    }
                }.show()
            }

            override fun onYesClick(payroll: PaylistData) {

            }
        })
    }
}