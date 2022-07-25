package com.example.myapp1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class Frist_Activity : AppCompatActivity()
{

    lateinit var btnNext:Button
    lateinit var etName:EditText
    lateinit var etEmail:EditText
    lateinit var etAge:EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_frist)

        btnNext = findViewById(R.id.btn_next)
        etName = findViewById(R.id.et_name)
        etEmail = findViewById(R.id.et_email)
        etAge = findViewById(R.id.et_age)

        // Button Click Event
        btnNext.setOnClickListener {
            var name = etName.text.toString().trim()
            var email = etEmail.text.toString().trim()
            var age = etAge.text.toString().trim()

        // navigate firstactivity to secondactivity using intent

           /* var intent = Intent(this, Second_Activity::class.java)
            intent.putExtra("NAME",name)               // string
            intent.putExtra("EMAIL",email)              // string
            intent.putExtra("AGE",age.toInt())          // Int
            startActivity(intent)*/

            var user = User(name,email,age.toInt())

            var intent = Intent(this, Second_Activity::class.java)
            intent.putExtra("USER",user)
            startActivity(intent)

        // this statment runs when user click on next button
        Toast.makeText(this, "Button Clicked", Toast.LENGTH_SHORT).show()
        }
    }
}