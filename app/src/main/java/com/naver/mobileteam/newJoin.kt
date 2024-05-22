package com.naver.mobileteam

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.naver.mobileteam.databinding.ActivityNewJoinBinding

class newJoin : AppCompatActivity() {
    lateinit var binding : ActivityNewJoinBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding=ActivityNewJoinBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
//        setSupportActionBar(binding.appbar)


    }
}