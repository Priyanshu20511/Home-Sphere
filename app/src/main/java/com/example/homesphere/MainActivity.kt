package com.example.homesphere

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.FirebaseApp

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("MainActivity", "onCreate called") // Log to confirm onCreate

        FirebaseApp.initializeApp(this) // Initialize Firebase
        setContentView(R.layout.activity_main) // Your welcome page layout

        // Show the welcome page for 5 seconds
        Handler(Looper.getMainLooper()).postDelayed({
            Log.d("MainActivity", "Navigating to HomeActivity") // Log navigation attempt
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
            finish()
 // Finish MainActivity so it's removed from the back stack
        }, 1000)
    }
}
