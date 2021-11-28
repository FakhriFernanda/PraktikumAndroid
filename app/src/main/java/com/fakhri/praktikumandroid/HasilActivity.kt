package com.fakhri.praktikumandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class HasilActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hasil)

        val nama = intent.getStringExtra("nama")
        val email = intent.getStringExtra("email")
        val noHandphone = intent.getStringExtra("noHandphone")
        val tanggalLahir = intent.getStringExtra("tanggalLahir")
        val jumlahMataKuliah = intent.getIntExtra("jumlahMataKuliah",0)

        val namaTextView = findViewById<TextView>(R.id.namaTextView)
        val emailTextView = findViewById<TextView>(R.id.emailTextView)
        val noHandphoneTextView = findViewById<TextView>(R.id.noHandphoneTextView)
        val tanggalLahirTextView = findViewById<TextView>(R.id.tanggalLahirTextView)
        val jumlahMataKuliahTextView = findViewById<TextView>(R.id.jumlahMataKuliahTextView)

        namaTextView.setText(nama)
        emailTextView.setText(email)
        noHandphoneTextView.setText(noHandphone)
        tanggalLahirTextView.setText(tanggalLahir)
        jumlahMataKuliahTextView.setText(jumlahMataKuliah.toString())
    }
}