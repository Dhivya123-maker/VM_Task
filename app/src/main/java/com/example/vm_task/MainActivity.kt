package com.example.vm_task

import android.annotation.SuppressLint
import android.app.Dialog
import android.opengl.Visibility
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.vmstrings.String_Manipulation

class MainActivity : AppCompatActivity() {
   lateinit var editText: EditText
    lateinit var btn: Button
    lateinit var input: String
    lateinit var palindrome_txt: TextView

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editText = findViewById(R.id.edittext)
        btn = findViewById(R.id.btn)
        palindrome_txt = findViewById(R.id.palindrome_txt)



        btn.setOnClickListener {
            input = editText.text.toString()

           palindrome_txt.text = String_Manipulation.isPalindrome(input)


        }


    }


}