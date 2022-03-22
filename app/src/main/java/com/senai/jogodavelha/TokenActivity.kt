package com.senai.jogodavelha

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import java.util.*
import kotlin.concurrent.schedule

class TokenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_token)

        val tokenX = findViewById<Button>(R.id.tokenX)
        val tokenO = findViewById<Button>(R.id.tokenO)

        tokenX.setOnClickListener() {
            Timer().schedule(1000){iniciarJogo()}
        }
        tokenO.setOnClickListener(){
            Timer().schedule(1000){iniciarJogo()}
        }

    }

    private fun iniciarJogo() {
        val intent = Intent(this, PlayActivity::class.java)
        startActivity(intent)
    }

}