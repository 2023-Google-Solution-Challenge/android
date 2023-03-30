package com.example.signz_android.Usersign

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.example.signz_android.PolicyResponse
import com.example.signz_android.RetrofitClient
import com.example.signz_android.RetrofitInterface
import com.example.signz_android.SignUpRequestBody
import com.example.signz_android.databinding.ActivitySignupWorkerBinding
import retrofit2.*
import java.time.LocalDate


class SignupActivity : AppCompatActivity() {
    private val retrofit: Retrofit = RetrofitClient.getInstance()
    private val api: RetrofitInterface = retrofit.create(RetrofitInterface::class.java)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivitySignupWorkerBinding.inflate(layoutInflater);
        setContentView(binding.root)

        binding.btnSignupBack.setOnClickListener {
            finish()
        }

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


            if (binding.signupCheck.isChecked) {
                if (email == "" || pass == "" || repass == "" || username == "" || nickname == "" || b_year == "" || b_month == "" || b_day == "" || phone == "" || address == "") Toast.makeText(
                    this@SignupActivity,
                    "회원정보를 전부 입력해주세요",
                    Toast.LENGTH_SHORT
                ).show() else {
                    finish()
                }
/*                    if (radioWorker.isChecked) {
                        if (pass==repass){
                            api.addUserByEnqueue(userInfo = SignUpRequestBody(email, pass, b_string, username, nickname, phone, latitude = 0.0, longitude = 0.0))
                                .enqueue(object : retrofit2.Callback<PolicyResponse> {
                                    override fun onResponse(
                                        call: Call<PolicyResponse>,
                                        response: Response<PolicyResponse>
                                    ) {
                                        if(response.isSuccessful){
                                            val result = response.body()
                                            Log.d("회원가입 성공", "$result")
                                            Toast.makeText(
                                                this@SignupActivity,
                                                "가입되었습니다.",
                                                Toast.LENGTH_SHORT
                                            ).show()
                                            val intent = Intent(applicationContext, LoginActivity::class.java)
                                            startActivity(intent)
                                        }
                                    }

                                    override fun onFailure(call: Call<PolicyResponse>, t: Throwable) {
                                        Log.d("회원가입 실패", t.message.toString())
                                        Toast.makeText(
                                            this@SignupActivity,
                                            "비밀번호가 일치하지 않습니다.",
                                            Toast.LENGTH_SHORT
                                        ).show()
                                    }

                                })
                        } else {
                            Toast.makeText(this@SignupActivity, "비밀번호가 일치하지 않습니다.", Toast.LENGTH_SHORT)
                                .show()
                        }
                    } else if (radioOwner.isChecked) {
                        if (pass==repass){
                            api.addOwnerByEnqueue(userInfo = SignUpRequestBody(email, pass, b_string, username, nickname, phone, latitude = 0.0, longitude = 0.0))
                                .enqueue(object : retrofit2.Callback<PolicyResponse> {
                                    override fun onResponse(
                                        call: Call<PolicyResponse>,
                                        response: Response<PolicyResponse>
                                    ) {
                                        if(response.isSuccessful){
                                            val result = response.body()
                                            Log.d("회원가입 성공", "$result")
                                            Toast.makeText(
                                                this@SignupActivity,
                                                "가입되었습니다.",
                                                Toast.LENGTH_SHORT
                                            ).show()
                                            val intent = Intent(applicationContext, LoginActivity::class.java)
                                            startActivity(intent)
                                        }
                                    }

                                    override fun onFailure(call: Call<PolicyResponse>, t: Throwable) {
                                        Log.d("회원가입 실패", t.message.toString())
                                        Toast.makeText(
                                            this@SignupActivity,
                                            "회원가입에 실패하였습니다.",
                                            Toast.LENGTH_SHORT
                                        ).show()
                                    }

                                })
                        } else {
                            Toast.makeText(this@SignupActivity, "비밀번호가 일치하지 않습니다.", Toast.LENGTH_SHORT)
                                .show()
                        }
                    } else {
                        Toast.makeText(this@SignupActivity, "사용자 유형을 선택해주세요", Toast.LENGTH_SHORT).show()
                    }

                }

            } else {
                Toast.makeText(this@SignupActivity, "개인정보 동의버튼을 눌러주세요.", Toast.LENGTH_SHORT)
                    .show()
            }*/
            }

        }
    }
}



