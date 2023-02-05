package com.example.signz_android

import android.app.AlertDialog
import android.app.Dialog
import android.app.ProgressDialog.show
import android.content.DialogInterface
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.signz_android.databinding.FragmentFindidBinding

class FindIdFragment : Fragment() {
    private lateinit var binding: FragmentFindidBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFindidBinding.inflate(inflater, container, false)

        //인증번호 받기 클릭시
        binding.btnFindidCertify.setOnClickListener{
            binding.tvFindidCerti.visibility = View.VISIBLE
            binding.etFindidCerti.visibility = View.VISIBLE
        }

        //확인 클릭
        binding.btnFindidConfirm.setOnClickListener{
            DialogFindId(requireContext()){
                if(it == "login"){
//                    startActivity(Intent(activity, LoginActivity::class.java))
                }
            }.show()
        }

        return binding.root
    }

    override fun onPause() {
        super.onPause()
        binding.tvFindidCerti.visibility = View.GONE
        binding.etFindidCerti.visibility = View.GONE
    }
}