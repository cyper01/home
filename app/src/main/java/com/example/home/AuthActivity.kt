package com.example.home

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

class AuthActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_auth)
        setTitle("Авторизация")
    }
    fun buttonGuest_Click(view: View) {
        val intent= Intent(this@AuthActivity,GuestActivity::class.java)
        startActivity(intent)
    }

    fun buttonEnter_Click(view: View) {
        val etLogin:EditText=findViewById(R.id.editTextLogin)
        val etPassword:EditText=findViewById(R.id.editTextPassword)
        val login:String = etLogin.text.toString()
        val password:String = etPassword.text.toString()

        if(!etLogin.text.toString().isEmpty()&&!password.isEmpty()){

            if(login=="admin"&&password=="12345") {
                val intent = Intent(this@AuthActivity, MentActivity::class.java)
                startActivity(intent)
            }
            else if(login=="hhg"&&password=="12345") {
                val intent = Intent(this@AuthActivity, MentActivity::class.java)
                startActivity(intent)
            }
            else if(login=="1"&&password=="2") {
                val intent = Intent(this@AuthActivity, MentActivity::class.java)
                startActivity(intent)
            }

            else Toast.makeText(applicationContext,"Пользователь не найден",Toast.LENGTH_LONG).show()
        }
        else Toast.makeText(applicationContext,"Заполните все поля",Toast.LENGTH_LONG).show()
        //
    }
}