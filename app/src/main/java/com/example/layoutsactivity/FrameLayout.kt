package com.example.layoutsactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View


class FrameLayout : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_frame_layout)
    }
    fun volverInicioFr(view: View){
        var intent = Intent(this, MainActivity::class.java).apply{ }
        startActivity(intent)
    }
}