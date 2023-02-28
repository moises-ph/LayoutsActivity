package com.example.layoutsactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class LinealVertical : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lineal_vertical)
    }
    fun init(view:View){
        val intent = Intent (this, MainActivity::class.java).apply {  }
        startActivity(intent)
    }
}