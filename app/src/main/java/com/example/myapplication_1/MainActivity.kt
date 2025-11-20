package com.example.myapplication_1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import kotlin.math.sign

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val act2 = findViewById<TextView>(R.id.Forgetbt)
        val login = findViewById< Button>(R.id.button2)
        val signup = findViewById<TextView>(R.id.signup)
        act2.setOnClickListener {
            val Intent = Intent(this, secondactivity::class.java)
            startActivity(Intent)
        }
        login.setOnClickListener {
            val Go = Intent(this, thirdactivity::class.java)
            startActivity(Go)
        }
        signup.setOnClickListener {
            val sign = Intent(this, Forthactivity::class.java)
            startActivity(sign)
        }

    }
}