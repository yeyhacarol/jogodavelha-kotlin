package com.senai.jogodavelha

import android.content.Intent
import android.graphics.Color
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

        val btnUm = findViewById<Button>(R.id.btn1)
        val btnDois = findViewById<Button>(R.id.btn2)
        val btnTres = findViewById<Button>(R.id.btn3)
        val btnQuatro = findViewById<Button>(R.id.btn4)
        val btnCinco = findViewById<Button>(R.id.btn5)
        val btnSeis = findViewById<Button>(R.id.btn6)
        val btnSete = findViewById<Button>(R.id.btn7)
        val btnOito = findViewById<Button>(R.id.btn8)
        val btnNove = findViewById<Button>(R.id.btn9)

        val intent: Intent = getIntent()
        val tokenX = true
        val tokenO = true

        val jogador1 = intent.getStringExtra("jogador")
        val jogador2 = ""
        if (jogador1 == "x") {
            jogador2 == "o"
        }else{
            jogador2 == "x"
        }

        btnUm.setOnClickListener {
            btnUm.text = jogador1
        }
//
//
//        btnUm.setOnClickListener() {
//            if (tokenX) {
//                btnUm.text = intent.getStringExtra("xzin")
//                btnUm.setBackgroundColor(0x84BEF3)
//            } else if (tokenO) {
//                btnUm.text = intent.getStringExtra("ozin")
//                btnUm.setBackgroundColor(0xD3C1F9)
//            }
//
//            btnUm.text = intent.getStringExtra("xzin")
//        }
//
//        btnDois.setOnClickListener() {
//            if (tokenX) {
//                btnDois.text = intent.getStringExtra("xzin")
//                btnDois.setBackgroundColor(0x84BEF3)
//            } else if (tokenO) {
//                btnDois.text = intent.getStringExtra("ozin")
//                btnDois.setBackgroundColor(0xD3C1F9)
//            }
//        }
//
//        btnTres.setOnClickListener() {
//            if (tokenX) {
//                btnTres.text = intent.getStringExtra("xzin")
//                btnTres.setBackgroundColor(0x84BEF3)
//            } else if (tokenO) {
//                btnTres.text = intent.getStringExtra("ozin")
//                btnTres.setBackgroundColor(0xD3C1F9)
//            }
//        }
//
//        btnQuatro.setOnClickListener() {
//            if (tokenX) {
//                btnQuatro.text = intent.getStringExtra("xzin")
//                btnQuatro.setBackgroundColor(0x84BEF3)
//            } else if (tokenO) {
//                btnQuatro.text = intent.getStringExtra("ozin")
//                btnQuatro.setBackgroundColor(0xD3C1F9)
//            }
//        }
//
//        btnCinco.setOnClickListener() {
//            if (tokenX) {
//                btnCinco.text = intent.getStringExtra("xzin")
//                btnCinco.setBackgroundColor(0x84BEF3)
//            } else if (tokenO) {
//                btnCinco.text = intent.getStringExtra("ozin")
//                btnCinco.setBackgroundColor(0xD3C1F9)
//            }
//        }
//
//        btnSeis.setOnClickListener() {
//            if (tokenX) {
//                btnSeis.text = intent.getStringExtra("xzin")
//                btnSeis.setBackgroundColor(0x84BEF3)
//            } else if (tokenO) {
//                btnSeis.text = intent.getStringExtra("ozin")
//                btnSeis.setBackgroundColor(0xD3C1F9)
//            }
//        }
//
//        btnSete.setOnClickListener() {
//            if (tokenX) {
//                btnSete.text = intent.getStringExtra("xzin")
//                btnSete.setBackgroundColor(0x84BEF3)
//            } else if (tokenO) {
//                btnSete.text = intent.getStringExtra("ozin")
//                btnSete.setBackgroundColor(0xD3C1F9)
//            }
//        }
//
//        btnOito.setOnClickListener() {
//            if (tokenX) {
//                btnOito.text = intent.getStringExtra("xzin")
//                btnOito.setBackgroundColor(0x84BEF3)
//            } else if (tokenO) {
//                btnOito.text = intent.getStringExtra("ozin")
//                btnOito.setBackgroundColor(0xD3C1F9)
//            }
//        }
//
//        btnNove.setOnClickListener() {
//            if (tokenX) {
//                btnNove.text = intent.getStringExtra("xzin")
//                btnNove.setBackgroundColor(0x84BEF3)
//            } else if (tokenO) {
//                btnNove.text = intent.getStringExtra("ozin")
//                btnNove.setBackgroundColor(0xD3C1F9)
//            }
//        }


    }

    private fun voltarMain() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }

}