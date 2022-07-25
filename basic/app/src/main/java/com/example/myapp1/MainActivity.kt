package com.example.myapp1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText

class MainActivity : AppCompatActivity()
{
    val etEmail:EditText
    get() = findViewById(R.id.et_email)

    lateinit var email:String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        email = intent.getStringExtra("EMAIL") ?: " "
        etEmail.setText(email)
    }
}