package com.example.signz_android.Usersign

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.signz_android.DialogFindPw
import com.example.signz_android.databinding.FragmentFindpwBinding

class FindPwFragment : Fragment() {
    private lateinit var binding: FragmentFindpwBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFindpwBinding.inflate(inflater, container, false)

        //인증번호 받기 클릭시
        binding.btnFindpwCertify.setOnClickListener{
            binding.tvFindpwCerti.visibility = View.VISIBLE
            binding.etFindpwCerti.visibility = View.VISIBLE
        }

        //확인 클릭
        binding.btnFindpwConfirm.setOnClickListener{
//            val builder = AlertDialog.Builder(requireContext())
//                .setMessage("회원님의 비밀번호는 ‘GDSC A’ 입니다.")
//                .setPositiveButton("로그인",
//                    DialogInterface.OnClickListener { dialog, id ->
//                        startActivity(Intent(activity, MainActivity::class.java))
//                    })
//                .setNegativeButton("확인",
//                    DialogInterface.OnClickListener { dialog, id ->
//
//                    })
//            builder.create().show()
            DialogFindPw(requireContext()){
                if(it == "login"){
//                    startActivity(Intent(activity, LoginActivity::class.java))
                }
            }.show()

        }

        return binding.root
    }

    override fun onPause() {
        super.onPause()
        binding.tvFindpwCerti.visibility = View.GONE
        binding.etFindpwCerti.visibility = View.GONE
    }
}