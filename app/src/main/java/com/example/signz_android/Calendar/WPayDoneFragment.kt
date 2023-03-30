package com.example.signz_android.Calendar

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.signz_android.databinding.FragmentWPaylistBinding

class WPayDoneFragment: Fragment() {
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
        payList.apply{
            add(PaylistData("2023.01", "₩582,000", "12d X 5h X ₩9700"))
            add(PaylistData("2023.02", "₩776,000", "16d X 5h X ₩9700"))
        }
        val paydoneRVAdapter = PayDoneRVAdapter(requireContext(), payList)
        binding.rvWpaylist.adapter = paydoneRVAdapter
        binding.rvWpaylist.layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
    }
}