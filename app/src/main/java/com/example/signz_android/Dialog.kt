package com.example.signz_android

import android.app.Dialog
import android.content.Context
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.signz_android.databinding.DialogFindaccountBinding
import com.example.signz_android.databinding.DialogQuitBinding
import com.example.signz_android.databinding.DialogSelectcandiBinding

class DialogFindId (
    context: Context,
    private val okCallback: (String) -> Unit,
) : Dialog(context) { // 뷰를 띄워야하므로 Dialog 클래스는 context를 인자로 받는다.

    private lateinit var binding: DialogFindaccountBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DialogFindaccountBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initViews()
    }

    private fun initViews() = with(binding) {
        // 뒤로가기 버튼, 빈 화면 터치를 통해 dialog가 사라지지 않도록
        setCancelable(false)
        tvDialogfaPw.visibility = View.GONE

        // background를 투명하게 만듦
        window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))

        // OK Button 클릭에 대한 Callback 처리
        tvDialogfaOk.setOnClickListener {
            dismiss()
        }
        tvDialogfaLogin.setOnClickListener {
//            okCallback(profileEt.text.toString())
            okCallback("login")
            dismiss()

        }
    }
}

class DialogFindPw (
    context: Context,
    private val okCallback: (String) -> Unit,
) : Dialog(context) {

    private lateinit var binding: DialogFindaccountBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DialogFindaccountBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initViews()
    }

    private fun initViews() = with(binding) {
        setCancelable(false)
        tvDialogfaPw.visibility = View.VISIBLE

        window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))

        tvDialogfaOk.setOnClickListener {
            dismiss()
        }
        tvDialogfaLogin.setOnClickListener {
            okCallback("login")
            dismiss()

        }
    }
}

class DialogQuit (
    context: Context,
    private val okCallback: (String) -> Unit,
) : Dialog(context) {

    private lateinit var binding: DialogQuitBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DialogQuitBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initViews()
    }

    private fun initViews() = with(binding) {
        setCancelable(false)

        window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))

        tvDialogquitNo.setOnClickListener {
            dismiss()
        }
        tvDialogquitOk.setOnClickListener {
            okCallback("ok")
            dismiss()

        }
    }
}

class DialogSelectCandi (
    context: Context,
    private val okCallback: (String) -> Unit,
) : Dialog(context) {

    private lateinit var binding: DialogSelectcandiBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DialogSelectcandiBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initViews()
    }

    private fun initViews() = with(binding) {
        setCancelable(false)

        window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))

        tvDialogquitNo.setOnClickListener {
            dismiss()
        }
        tvDialogquitOk.setOnClickListener {
            okCallback("ok")
            dismiss()

        }
    }
}