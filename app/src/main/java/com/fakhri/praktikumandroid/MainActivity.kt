package com.fakhri.praktikumandroid

import android.content.Intent
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
        val logoutButton = findViewById<Button>(R.id.logoutButton)

        val namaEdittext = findViewById<EditText>(R.id.namaEdittext)
        val emailEdittext = findViewById<EditText>(R.id.emailEdittext)
        val noHandphoneEdittext = findViewById<EditText>(R.id.noHandphoneEditText)
        val tanggalLahirEdittext = findViewById<EditText>(R.id.tanggalLahirEditText)
        val jumlahmMtaKuliahEdittext = findViewById<EditText>(R.id.jumlahMataKuliahEditText)

        simpanButton.setOnClickListener{
            Toast.makeText(this,"Hai", Toast.LENGTH_SHORT).show()

            val nama = namaEdittext.text.toString()
            val email = emailEdittext.text.toString()
            val noHandphone = noHandphoneEdittext.text.toString()
            val tanggalLahir = tanggalLahirEdittext.text.toString()
            val jumlahMataKuliah = jumlahmMtaKuliahEdittext.text.toString().toInt()

            val intent = Intent(this,HasilActivity::class.java)
            intent.putExtra("nama",nama)
            intent.putExtra("email",email)
            intent.putExtra("noHandphone",noHandphone)
            intent.putExtra("tanggalLahir",tanggalLahir)
            intent.putExtra("jumlahMataKuliah",jumlahMataKuliah)
            startActivity(intent)
        }
        logoutButton.setOnClickListener {

            val sharedPreferences = this.getSharedPreferences("My_SP", MODE_PRIVATE)
            sharedPreferences.edit().putString("username","")
            sharedPreferences.edit().putString("password","")
            sharedPreferences.edit().apply()

            val intent = Intent(this,LoginActivity::class.java)
            startActivity(intent)

        }

        batalButton.setOnClickListener {
            finish()
        }
    }
}