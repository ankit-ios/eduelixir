package com.example.eduelixir.eduelixir.activities

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.eduelixir.eduelixir.MainActivity
import com.example.eduelixir.eduelixir.R
import java.util.*

class SplashScreen : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)
        addTimer()
    }

    private fun addTimer()
    {
        Timer().schedule( object : TimerTask(){
            override fun run() {
                val intent = Intent(applicationContext, LoginPage::class.java)
                startActivity(intent)
                finish()
            }
        }, 2000L)
    }
}
