
package com.example.eduelixir.eduelixir.activities

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.eduelixir.eduelixir.MainActivity
import com.example.eduelixir.eduelixir.R

class LoginPage : AppCompatActivity() {

    private lateinit var etUserName: EditText
    private lateinit var etPassword: EditText
    private lateinit var btnLogin: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_page)

        etUserName = findViewById(R.id.etUserName)
        etPassword = findViewById(R.id.etPassword)
        btnLogin = findViewById(R.id.btnLogin)


        btnLogin.setOnClickListener{
            this.validatingUserNameAndPassword(etUserName.text.toString(),etPassword.text.toString())
        }
    }

    private fun validatingUserNameAndPassword(userName: String?, password: String?) {

        startActivity(Intent(this, InfoDrawer::class.java))
//        if (userName == "admin" && password == "1234") {
//            val intent = Intent(this, InfoDrawer::class.java)
//            startActivity(intent)
//        }
//        else {
//            Toast.makeText(this@LoginPage, "UserName: admin pass: 1234",Toast.LENGTH_SHORT).show()
//        }
    }
}
