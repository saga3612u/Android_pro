package com.example.myapplication_1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val act2 = findViewById<TextView>(R.id.Forgetbt)
        act2.setOnClickListener {
            val Intent = Intent(this, secondactivity::class.java)
            startActivity(Intent)
        }

    }
}