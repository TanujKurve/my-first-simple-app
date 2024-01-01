package com.example.assignment12

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val a = findViewById<Button>(R.id.button1)

        a.setOnClickListener{
            intent = Intent(applicationContext, MainActivity2::class.java)
            startActivity(intent)
        }
    }
}