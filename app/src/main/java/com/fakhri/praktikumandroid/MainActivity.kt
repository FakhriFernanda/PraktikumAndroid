package com.fakhri.praktikumandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val simpanButton = findViewById<Button>(R.id.simpanButton)
        val batalButton = findViewById<Button>(R.id.batalButton)

        val namaEdittext = findViewById<EditText>(R.id.namaEdittext)
        val emailEdittext = findViewById<EditText>(R.id.emailEdittext)

        simpanButton.setOnClickListener{
            Toast.makeText(this,"Hai", Toast.LENGTH_SHORT).show()
        }
        batalButton.setOnClickListener {
            finish()
        }
    }
}