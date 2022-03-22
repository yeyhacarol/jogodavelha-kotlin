package com.senai.jogodavelha

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import java.util.*
import kotlin.concurrent.schedule

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val jogadorVsJogador = findViewById<Button>(R.id.player_vs_player)
        val jogadorVsComputador = findViewById<Button>(R.id.player_vs_computador)

        jogadorVsComputador.setOnClickListener() {
            Timer().schedule(1000){abrirDificuldades()}
        }
        jogadorVsJogador.setOnClickListener() {
            Timer().schedule(1000){abrirToken()}
        }

    }

    private fun abrirDificuldades() {
        val intent = Intent(this, DificuldadeActivity::class.java)
        startActivity(intent)
    }

    private fun abrirToken() {
        val intent = Intent(this, TokenActivity::class.java)
        startActivity(intent)
    }

}
