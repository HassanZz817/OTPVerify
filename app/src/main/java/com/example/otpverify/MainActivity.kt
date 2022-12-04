package com.example.otpverify

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.firebase.FirebaseApp
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.PhoneAuthProvider

class MainActivity : AppCompatActivity() {
    lateinit var button: Button
    private lateinit var auth: FirebaseAuth
    private var storedVerificationId: String? = ""
    private lateinit var callbacks:  PhoneAuthProvider.OnVerificationStateChangedCallbacks


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button = findViewById(R.id.buttonSignIn)
        FirebaseApp.initializeApp(this)
        button.setOnClickListener{
            Intent(this,SecondActivity::class.java).also {
                startActivity(it)
            }
        }
    }
}