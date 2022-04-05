package com.senai.jogodavelha

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import java.util.*
import kotlin.concurrent.schedule

private lateinit var tokenXButton: Button
private lateinit var tokenOButton: Button

class TokenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_token)

        tokenXButton = findViewById<Button>(R.id.tokenX)
        tokenOButton = findViewById<Button>(R.id.tokenO)

        tokenXButton.setOnClickListener { iniciarJogo("X") }
        tokenOButton.setOnClickListener { iniciarJogo("O") }
    }

    fun iniciarJogo(jogador: String) {
        val intent = Intent(this, PlayActivity::class.java)
        intent.putExtra("jogador", jogador)
        startActivity(intent)
    }



}