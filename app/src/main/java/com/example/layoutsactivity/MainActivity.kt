package com.example.layoutsactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun abrirTable(view : View){
        val intent = Intent(this, TableLayout::class.java).apply{ }
        startActivity(intent)
    }

    fun abrirFrame(view: View){
        val intent = Intent(this, FrameLayout::class.java).apply {  }
        startActivity(intent)
    }
}