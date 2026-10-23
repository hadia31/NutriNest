package com.example.nutrinest

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val name = getSharedPreferences("NutriNestPrefs", MODE_PRIVATE)
            .getString("name", "User")

        findViewById<TextView>(R.id.tvWelcome).text = "Welcome, $name!"
    }
}