package com.naver.mobileteam

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.naver.mobileteam.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding :ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
//        setSupportActionBar(binding.appbar)

        binding.loginBtn.setOnClickListener {
            //id, password 입력이 DB에 있는지 체크하는 내용
            //true -> 다음화면
            //false -> toast 메세지로 일치하는 로그인 정보가 없습니다 띄우기

            //일단 다음 화면으로 가는 코드
            startActivity(Intent(this,ChooseActivity::class.java))
        }

        binding.newJoinBtn.setOnClickListener {
            startActivity(Intent(this,newJoin::class.java))
        }

//        binding.finishBtn.setOnClickListener {
//            //학년
//            val grade=binding.grade.text.toString()
//            //최대학점
//            val maxCredit=binding.maxCredit.text.toString()
//            //학과
//            val major=binding.major.text.toString()
//
//            //sharedpreference 로 저장
//            val pref = getSharedPreferences("pref", 0)//intent같은 역할
//            val edit=pref.edit()//수정모드
//
//            edit.putString("grade",grade)
//            edit.putString("maxCredit",maxCredit)
//            edit.putString("major",major)
//
//            edit.apply()//저장
//
//
//            Log.d("hiii","$grade $maxCredit $major")
//
//            if (major=="소프트웨어전공"){
//                //다른 액티비티로
//            }
//        }


    }
}