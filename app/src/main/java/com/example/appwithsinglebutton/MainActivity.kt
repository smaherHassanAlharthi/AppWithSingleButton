package com.example.appwithsinglebutton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val tvtext=findViewById<TextView>(R.id.tvText)
        val editText=findViewById<EditText>(R.id.etText)
        val submit=findViewById<Button>(R.id.btsubmit)
        submit.setOnClickListener{

            if(editText.text.isNotEmpty()){
                tvtext.text=editText.text
                editText.text.clear()
            }
            else
                Toast.makeText(this,"Enter a text",Toast.LENGTH_SHORT).show()
        }
    }
}