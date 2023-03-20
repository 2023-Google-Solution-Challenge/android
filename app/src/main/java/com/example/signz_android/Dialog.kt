package com.example.signz_android

import android.app.Dialog
import android.content.Context
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.view.View
import android.view.Window
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.signz_android.databinding.DialogContractBinding
import com.example.signz_android.databinding.DialogDelpobBinding
import com.example.signz_android.databinding.DialogFindaccountBinding
import com.example.signz_android.databinding.DialogQuitBinding
import com.example.signz_android.databinding.DialogRecruitendBinding
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

class DialogSelectCandi (private val context : AppCompatActivity) {

    private lateinit var binding: DialogSelectcandiBinding
    private val dlg = Dialog(context)   //부모 액티비티의 context 가 들어감

    fun show() {
        binding = DialogSelectcandiBinding.inflate(context.layoutInflater)

        dlg.requestWindowFeature(Window.FEATURE_NO_TITLE)   //타이틀바 제거
        dlg.setContentView(binding.root)     //다이얼로그에 사용할 xml 파일을 불러옴
        dlg.setCancelable(false)    //다이얼로그의 바깥 화면을 눌렀을 때 다이얼로그가 닫히지 않도록 함

        //ok 버튼 동작
        binding.tvDialogquitOk.setOnClickListener {
            dlg.dismiss()
        }

        //cancel 버튼 동작
        binding.tvDialogquitNo.setOnClickListener {
            dlg.dismiss()
        }

        dlg.show()
    }
}

class DialogContract (
    context: Context,
    private val okCallback: (String) -> Unit,
) : Dialog(context) {

    private lateinit var binding: DialogContractBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DialogContractBinding.inflate(layoutInflater)
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

class DialogRecruitEnd (
    context: Context,
    private val okCallback: (String) -> Unit,
) : Dialog(context) {

    private lateinit var binding: DialogRecruitendBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DialogRecruitendBinding.inflate(layoutInflater)
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

class DialogDelPob (
    context: Context,
    private val okCallback: (String) -> Unit,
) : Dialog(context) {

    private lateinit var binding: DialogDelpobBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DialogDelpobBinding.inflate(layoutInflater)
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