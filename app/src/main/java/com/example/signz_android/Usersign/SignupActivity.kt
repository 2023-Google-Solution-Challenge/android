package com.example.signz_android.Usersign

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.signz_android.databinding.ActivitySignupWorkerBinding
import java.time.LocalDate
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

class SignupActivity : AppCompatActivity() {
    var DB = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivitySignupWorkerBinding.inflate(layoutInflater);
        setContentView(binding.root)

        binding.btnSignup.setOnClickListener {
            val email = binding.etSignupEmail.text.toString()
            val pass = binding.etSignupPw.text.toString()
            val repass = binding.etSignupPwconfirm.text.toString()
            val username = binding.etSignupName.text.toString()
            val nickname = binding.etSignupNickname.text.toString()
            val b_year = binding.etSignupBirthYear.text.toString()
            val b_month = binding.etSignupBirthMonth.text.toString()
            val b_day = binding.etSignupBirthDay.text.toString()
            val b_string = b_year + "-" + b_month + "-" + b_day
            val birth = LocalDate.parse(b_string)
            val phone = binding.etSignupPhoneNum.text.toString()
            val address = binding.etSignupLocation.text.toString()
            val radioWorker = binding.worker
            val radioOwner = binding.owner
            val isEmployer = 0

            if (radioWorker.isChecked) {
                val isEmployer = 0
            } else if (radioOwner.isChecked) {
                val isEmployer = 1
            } else {
                Toast.makeText(this@SignupActivity, "사용자 유형을 선택해주세요", Toast.LENGTH_SHORT).show()
            }

            if (binding.signupCheck.isChecked) {
                if (email == "" || pass == "" || repass == "" || username == "" || nickname == "" || b_year == "" || b_month == "" || b_day == "" || phone == "" || address == "") Toast.makeText(
                    this@SignupActivity,
                    "회원정보를 전부 입력해주세요",
                    Toast.LENGTH_SHORT
                ).show() //else{
//                    if (pass==repass){
//                        val checkEmail = DB!!.checkEmail(email)
//                        if (checkEmail == false){
//                            val insert = DB!!.insertData(email, pass, birth, username, nickname, phone, isEmployer, address)
//                            if (insert == true) {
//                                Toast.makeText(
//                                    this@SignupActivity,
//                                    "가입되었습니다.",
//                                    Toast.LENGTH_SHORT
//                                ).show()
//                                val intent = Intent(applicationContext, LoginActivity::class.java)
//                                startActivity(intent)
//                            } else {
//                                Toast.makeText(
//                                    this@SignupActivity,
//                                    "비밀번호가 일치하지 않습니다.",
//                                    Toast.LENGTH_SHORT
//                                ).show()
//                            }
//                        } else {
//                            Toast.makeText(
//                                this@SignupActivity,
//                                "가입된 회원입니다.",
//                                Toast.LENGTH_SHORT
//                            ).show()
//                        }
//                    } else {
//                        Toast.makeText(this@SignupActivity, "비밀번호가 일치하지 않습니다.", Toast.LENGTH_SHORT)
//                            .show()
//                    }
//                }
//
//            } else {
//                Toast.makeText(this@SignupActivity, "개인정보 동의버튼을 눌러주세요.", Toast.LENGTH_SHORT)
//                    .show()
//            }
            }

        }
    }
}


