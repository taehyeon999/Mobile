package com.naver.mobileteam

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.naver.mobileteam.databinding.ActivityChooseBinding

class ChooseActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        val binding=ActivityChooseBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.addTimeTable.setOnClickListener{
            startActivity(Intent(this,AddTimeTable::class.java))
        }

        binding.toDo.setOnClickListener {
            startActivity(Intent(this, TodoActivity::class.java))
        }


    }
}