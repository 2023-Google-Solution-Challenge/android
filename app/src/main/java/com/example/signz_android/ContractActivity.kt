package com.example.signz_android

import android.Manifest
import android.app.DatePickerDialog
import android.app.TimePickerDialog
import android.content.Intent
import android.content.pm.PackageManager
import android.graphics.Bitmap
import android.icu.util.Calendar
import android.net.Uri
import android.os.Build
import android.os.Bundle
import android.os.Environment
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import com.example.signz_android.databinding.ActivityContractBinding
import java.io.File
import java.io.FileOutputStream

class ContractActivity : AppCompatActivity() {
    private lateinit var binding: ActivityContractBinding

    @RequiresApi(Build.VERSION_CODES.N)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityContractBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //뒤로가기
        binding.btnContractBack.setOnClickListener {
            finish()
        }

        //입력세팅
        initInputText()

    }

    @RequiresApi(Build.VERSION_CODES.N)
    private fun initInputText() {
        //서명패드
        initSignaturePad()

        //기간 선택
        binding.etContractPeriods.setOnClickListener{
            val calendar = Calendar.getInstance()
            val dateSetListener = DatePickerDialog.OnDateSetListener { view, year, month, dayOfMonth ->
                binding.etContractPeriods.text = "${year}/ ${month+1}/ ${dayOfMonth}"
            }
            DatePickerDialog(this, dateSetListener, calendar.get(Calendar.YEAR),calendar.get(Calendar.MONTH),calendar.get(Calendar.DAY_OF_MONTH))
                .apply{
                    datePicker.minDate = System.currentTimeMillis()
                }.show()
        }
        binding.etContractPeriode.setOnClickListener{
            val calendar = Calendar.getInstance()
            val dateSetListener = DatePickerDialog.OnDateSetListener { view, year, month, dayOfMonth ->
                binding.etContractPeriode.text = "${year}/ ${month+1}/ ${dayOfMonth}"
            }
            DatePickerDialog(this, R.style.DatePickerStyle,
                dateSetListener, calendar.get(Calendar.YEAR),calendar.get(Calendar.MONTH),calendar.get(Calendar.DAY_OF_MONTH))
                .apply{
                    datePicker.minDate = System.currentTimeMillis()
                }.show()
        }
        //근로시간 선택
        binding.etContractStime.setOnClickListener {
            val calendar = Calendar.getInstance()
            val timeSetListener = TimePickerDialog.OnTimeSetListener { view, hourOfDay, minute ->
                binding.etContractStime.text = "${hourOfDay}:${minute}"
            }
            TimePickerDialog(this,
                R.style.DatePickerStyle, timeSetListener, calendar.get(Calendar.HOUR_OF_DAY), calendar.get(Calendar.MINUTE),true).show()
        }
        binding.etContractEtime.setOnClickListener {
            val calendar = Calendar.getInstance()
            val timeSetListener = TimePickerDialog.OnTimeSetListener { view, hourOfDay, minute ->
                binding.etContractEtime.text = "${hourOfDay}:${minute}"
            }
            TimePickerDialog(this, timeSetListener, calendar.get(Calendar.HOUR_OF_DAY), calendar.get(Calendar.MINUTE),true).show()
        }

        //휴게시간 선택

        //요일 선택
        binding.etContractDay.adapter = ArrayAdapter(this,
            R.layout.style_spinner, resources.getStringArray(R.array.day))

        //임금유형 선택
        binding.etContractPaytype.adapter = ArrayAdapter(this,
            R.layout.style_spinner, resources.getStringArray(R.array.paytype))
//        binding.etContractDay.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
//            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
//
//            }
//
//            override fun onNothingSelected(p0: AdapterView<*>?) {
//
//            }
//        }

    }

    private fun initSignaturePad(){
        /** 초기화 */
//        binding.bClear.setOnClickListener {
//            binding.signaturePad.clearCanvas()
//        }

        /** 저장 */
        binding.btnContractNext.setOnClickListener {
            if(!binding.etContractSign.isBitmapEmpty){
                /** 권한 체크 */
                if(!checkPermission(android.Manifest.permission.READ_EXTERNAL_STORAGE) || !checkPermission(Manifest.permission.WRITE_EXTERNAL_STORAGE)) {
                }

                /** 그림 저장 */
                if(!imageExternalSave(binding.etContractSign.signatureBitmap, this.getString(R.string.app_name))){
                    Toast.makeText(this, "사인패드 저장에 실패하였습니다", Toast.LENGTH_SHORT).show()
                }else{
                    Toast.makeText(this, "사인패드를 갤러리에 저장하였습니다.", Toast.LENGTH_SHORT).show()
                }
            }else {
                Toast.makeText(this, "사인패드가 비어있습니다.", Toast.LENGTH_SHORT).show()
            }
        }
    }

    /** 이미지 저장 */
    private fun imageExternalSave(bitmap: Bitmap, path: String): Boolean {
        val state = Environment.getExternalStorageState()
        if (Environment.MEDIA_MOUNTED == state) {

            val rootPath = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES).toString()
            val dirName = "/" + path
            val fileName = System.currentTimeMillis().toString() + ".png"
            val savePath = File(rootPath + dirName)
            savePath.mkdirs()

            val file = File(savePath, fileName)
            if (file.exists()) file.delete()

            try {
                val out = FileOutputStream(file)
                bitmap.compress(Bitmap.CompressFormat.PNG, 100, out)
                out.flush()
                out.close()

                //갤러리 갱신
                galleyAddPic(file)
                return true
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }
        return false
    }

    /** 갤러리 갱신 */
    private fun galleyAddPic(file: File){
        Intent(Intent.ACTION_MEDIA_SCANNER_SCAN_FILE).also { mediaScanIntent ->
            mediaScanIntent.data = Uri.fromFile(file)
            sendBroadcast(mediaScanIntent)
        }
    }

    /** 권한 체크 */
    private fun checkPermission(permission: String): Boolean {
        val permissionChecker = ContextCompat.checkSelfPermission(applicationContext, permission)

        //권한이 없으면 권한 요청
        if (permissionChecker == PackageManager.PERMISSION_GRANTED){
            return true
        }

        ActivityCompat.requestPermissions(this, arrayOf(permission), 100)
        return false
    }

}