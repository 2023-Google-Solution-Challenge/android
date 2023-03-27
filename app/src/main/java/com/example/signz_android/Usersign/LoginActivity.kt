package com.example.signz_android.Usersign

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.Toast
import com.example.signz_android.OMain.OMainActivity
import com.example.signz_android.WMain.WMainActivity
import com.example.signz_android.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    var DB = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityLoginBinding.inflate(layoutInflater);
        setContentView(binding.root)

        binding.btnSignin.isEnabled = false

        binding.emailEdittext.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                val msg = binding.emailEdittext.text.toString()
                binding.btnSignin.isEnabled = msg.isNotEmpty()
            }

            override fun afterTextChanged(s: Editable?) {}

        })


        binding.btnEmployer.setOnClickListener {
            binding.btnEmployer.isSelected = true
            binding.btnEmployee.isSelected = false
        }

        binding.btnEmployee.setOnClickListener {
            binding.btnEmployer.isSelected = false
            binding.btnEmployee.isSelected = true
        }


        binding.passIdFind.setOnClickListener {
            val findIntent = Intent(this, FindAccountActivity::class.java)
            startActivity(findIntent)
        }
        binding.tvSignup.setOnClickListener {
            val signupIntent = Intent(this, SignupActivity::class.java)
            startActivity(signupIntent)
        }

        binding.btnSignin.setOnClickListener {
            val email = binding.emailEdittext.text.toString()
            val pass = binding.passwordEdittext.text.toString()
            if (email == "" || pass == "") Toast.makeText(
                this@LoginActivity,
                "회원정보를 모두 입력해주세요",
                Toast.LENGTH_SHORT
            ).show() else {
                if (binding.btnEmployer.isSelected) {
                    startActivity(Intent(this, OMainActivity::class.java))
                }
                else if (binding.btnEmployee.isSelected) {
                    startActivity(Intent(this, WMainActivity::class.java))
                }
                else {
                    Toast.makeText(
                        this@LoginActivity,
                        "회원 유형을 선택해주세요.",
                        Toast.LENGTH_SHORT
                    ).show()
                }
            }


        //else{
//                val checkEmailpass = DB!!.checkEmailpass(email, pass)
//                val checkisEmployer = DB!!.checkisEmployer
//                if (checkEmailpass == true){
//                    Toast.makeText(this@LoginActivity, "로그인 되었습니다.", Toast.LENGTH_SHORT)
//                        .show()
//                    if (checkisEmployer == 0){
//                        val intent = Intent(applicationContext, MainActivity::class.java)
//                        startActivity(intent)
//                    } else {
//                        val intent = Intent(applicationContext, MainActivity::class.java)
//                        startActivity(intent)
//                    }
//                }
//                else {
//                    Toast.makeText(this@LoginActivity, " 회원정보가 존재하지 않습니다.", Toast.LENGTH_SHORT)
//                        .show()
//                }
//            }
//        }

        }
    }
}