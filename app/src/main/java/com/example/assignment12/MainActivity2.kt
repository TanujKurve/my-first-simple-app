package com.example.assignment12

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.provider.ContactsContract.CommonDataKinds.Phone
import android.provider.MediaStore
import android.widget.Button
import android.widget.EditText
import android.widget.MediaController
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val btn = findViewById<Button>(R.id.button3)
        val text1 = findViewById<TextView>(R.id.textView3)
        val text2 = findViewById<TextView>(R.id.textView4)
        val text3 = findViewById<TextView>(R.id.textView5)
        val text4 = findViewById<TextView>(R.id.textView6)

        btn.setOnClickListener {
            val intent =Intent(Intent.ACTION_DIAL);
            intent.setData(Uri.parse("tel:0123456789"))
            startActivity(intent)
        }
        text1.setOnClickListener {
            intent = Intent(applicationContext, MainActivity3::class.java)
            startActivity(intent)
        }

        text2.setOnClickListener {
            intent = Intent (applicationContext, MainActivity4::class.java)
            startActivity(intent)

        }

        text3.setOnClickListener {
            intent = Intent (applicationContext, MainActivity5::class.java)
            startActivity(intent)

        }

        text4.setOnClickListener {
            intent = Intent (applicationContext, MainActivity6::class.java)
            startActivity(intent)

        }

    }
}