package com.kitkat.hackathon

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    lateinit var submit : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        submit = findViewById(R.id.submit)

        submit.setOnClickListener {

            val intent = Intent(this, WelcomeActivity::class.java)
            startActivity(intent)

        }

    }
}