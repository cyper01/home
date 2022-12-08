package com.example.home

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MentActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ment)
        setTitle("Мой Профиль")
    }

    fun buttinment(view: View) {
        val intent= Intent (this@MentActivity,AuthActivity::class.java)
        startActivity(intent)
    }
}