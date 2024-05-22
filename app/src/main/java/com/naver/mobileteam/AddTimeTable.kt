package com.naver.mobileteam

import android.content.DialogInterface
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.naver.mobileteam.databinding.ActivityAddTimeTableBinding

class AddTimeTable : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        val binding=ActivityAddTimeTableBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        //양수아 열심히 하세용

        binding.grade.setOnClickListener{
            val items=arrayOf<String>("1학년","2학년","3학년","4학년")
            AlertDialog.Builder(this).run {
                setTitle("학년")
                setItems(items,object:DialogInterface.OnClickListener{
                    override fun onClick(p0:DialogInterface?,p1:Int){
                        //얘를 전역변수로 빼니까 크래시남
                        val pref = getSharedPreferences("pref", 0)
                        val grade="${items[p1]}"
                        binding.grade.text=grade
                        val edit=pref.edit()
                        edit.putString("grade",grade)
                        edit.apply()
                    }
                })
                show()
            }

            binding.maxCredit.setOnClickListener{
                val items=arrayOf<String>("18학점","21학점","24학점")
                AlertDialog.Builder(this).run{
                    setSingleChoiceItems(items,1,object :DialogInterface.OnClickListener{
                        override fun onClick(dialog: DialogInterface?, p1: Int) {
                            val pref = getSharedPreferences("pref", 0)
                            val maxCredit="${items[p1]}"
                            binding.maxCredit.text=maxCredit
                            val edit=pref.edit()
                            edit.putString("maxCredit",maxCredit)
                            edit.apply()
                        }
                    })
                    show()
                }
            }

        }



    }
}