package com.example.otpverify

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SecondActivity : AppCompatActivity() {
    lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        button = findViewById(R.id.Verify)
        button.setOnClickListener{
            Intent(this,ThirdActivity::class.java).also {
                startActivity(it)
            }
        }
    }
}