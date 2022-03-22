package com.senai.jogodavelha

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class PlayActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_play)

        val reiniciar = findViewById<Button>(R.id.reiniciar)

        reiniciar.setOnClickListener() {
            voltarMain()
        }

    }

    private fun voltarMain() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }

}