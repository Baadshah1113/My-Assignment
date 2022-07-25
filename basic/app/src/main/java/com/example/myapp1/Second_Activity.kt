package com.example.myapp1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Second_Activity : AppCompatActivity()
{
    val btnMain:Button
    get() = findViewById(R.id.btn_main)

    val tvName: TextView
    get() = findViewById(R.id.tv_name)

    val tvEmail: TextView
    get() = findViewById(R.id.tv_email)

    val tvAge: TextView
    get() = findViewById(R.id.tv_age)

    private var name: String? = null
    private var email: String? = null
    private var age: Int? = null
    private var user: User? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

      /*  name = intent.getStringExtra("NAME")
        email = intent.getStringExtra("EMAIL")
        age = intent.getIntExtra("AGE",0)

        tvName.text = "Name : $name"
        tvEmail.text = "Email : $email"
        tvAge.text = "Age : ${age}"*/

        user = intent.getParcelableExtra("USER")

        user?.let {
            tvName.text = "Name : ${it.name}"
            tvEmail.text = "Email : ${it.email}"
            tvAge.text = "Age : ${it.age}"
        }

        btnMain.setOnClickListener {

            //  intent.putExtra("EMAIL",email)
            var intent = Intent(this, MainActivity::class.java)
            intent.putExtra("EMAIL",user?.email)
            startActivity(intent)
        }
    }

}