package com.example.jobsheet10

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val btnMhs: Button = findViewById(R.id.btnMahasiswa)
        val btnkmps: Button = findViewById(R.id.btnKampus)

        btnMhs.setOnClickListener{
            val jobsheet10 = Intent(this, next::class.java)
            startActivity(intent)
        }
        btnkmps.setOnClickListener{
            val jobsheet10 = Intent(this, last::class.java)
            startActivity(intent)
        }
    }
}