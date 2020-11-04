package com.example.firstapp

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val showbtn = findViewById<Button>(R.id.btn)
        val txt = findViewById<EditText>(R.id.txt)
        val img = findViewById<ImageView>(R.id.img)
        val text = txt.text
        showbtn.setOnClickListener{

            Toast.makeText(this , "Welcome Mr : $text" , Toast.LENGTH_LONG).show()
        }
        img.setOnClickListener{

            Toast.makeText(this , "Hello : $text" , Toast.LENGTH_LONG).show()

        }
    }
}