package com.example.home

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class GuestActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_guest)
        setTitle("Гостевой режим")
    }

    fun buttonEnter_Click(view: View) {
        val intent= Intent (this@GuestActivity,AuthActivity::class.java)
        startActivity(intent)

    }
}