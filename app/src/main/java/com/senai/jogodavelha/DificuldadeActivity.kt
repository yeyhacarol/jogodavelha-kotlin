package com.senai.jogodavelha

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import java.util.*
import kotlin.concurrent.schedule

class DificuldadeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dificuldade)

        val facil = findViewById<Button>(R.id.facil)
        val intermediario = findViewById<Button>(R.id.intermediario)
        val dificil = findViewById<Button>(R.id.dificil)

        facil.setOnClickListener() {
            Timer().schedule(1000){abrirToken()}
        }
        intermediario.setOnClickListener() {
            Timer().schedule(1000){abrirToken()}
        }
        dificil.setOnClickListener() {
            Timer().schedule(1000){abrirToken()}
        }


    }

    private fun abrirToken() {
        val intent = Intent(this, TokenActivity::class.java)
        startActivity(intent)
    }
}