package com.example.layoutsactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class TableLayout : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_table_layout)
    }
    fun volverInicio(view : View){
        val intent = Intent(this, MainActivity::class.java).apply{ }
        startActivity(intent)
    }
}