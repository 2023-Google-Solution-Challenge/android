package com.example.signz_android.Usersign

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
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

        binding.imgLogo.setOnClickListener {
            startActivity(Intent(this, WMainActivity::class.java))
        }

        binding.tvSignupTv.setOnClickListener {
            startActivity(Intent(this, OMainActivity::class.java))
        }

        binding.passIdFind.setOnClickListener {
            val findIntent = Intent(this, FindAccountActivity::class.java)
            startActivity(findIntent)
        }
        binding.tvSignup.setOnClickListener {
            val signupIntent = Intent(this, SignupActivity::class.java)
            startActivity(signupIntent)
        }

        binding.btnSignin!!.setOnClickListener {
            val email = binding.emailEdittext!!.text.toString()
            val pass = binding.passwordEdittext!!.text.toString()
            if (email == "" || pass == "") Toast.makeText(
                this@LoginActivity,
                "회원정보를 모두 입력해주세요",
                Toast.LENGTH_SHORT
            ).show() //else{
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