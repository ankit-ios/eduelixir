package com.example.eduelixir.eduelixir

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.eduelixir.eduelixir.activities.InfoDrawer

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        startActivity(Intent(this, InfoDrawer::class.java))
    }
}
