package com.example.home

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        scheduleSplashScreen()
    }
    private fun scheduleSplashScreen() {
        val splashScreenDuration: Long = 2000
        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(this@MainActivity,
                AuthActivity::class.java)
            startActivity(intent)
            finish()
        }, splashScreenDuration)
    }
}