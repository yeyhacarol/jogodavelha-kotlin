package com.senai.jogodavelha

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_play.*

class PlayActivity : AppCompatActivity() {
    var jogador: Int = 1
    var buttons = ArrayList<Button>()
    var tokenAtual = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_play)

        val intent: Intent = getIntent()
        tokenAtual = intent.getStringExtra("jogador").toString()

//      resgatando button para reiniciar, colocando evento de click e chamando a função que faz isso
        val reiniciar = findViewById<Button>(R.id.reiniciar)

        reiniciar.setOnClickListener() {
            voltarMain()
        }

//      array com todos os buttons, utilizando extensão kotlin
        buttons = arrayListOf<Button>(btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9)

//      colocando um evento de click em cada um dos buttons entre zero e oito e chamando a função de jogar para cada um dos buttons
        for(button in 0..buttons.size-1) {
            buttons[button].setOnClickListener {
                jogar(it as Button)
            }
        }
    }

    private fun jogar(btn: Button) {
        btn.text = tokenAtual
        proximoJogador()

        btn.isClickable = false
        vitorias()
    }

    private fun proximoJogador() {
        if (tokenAtual == "X"){
            tokenAtual = "O"
        }else{
            tokenAtual = "X"
        }
    }

    private fun vitorias() {
//      verificando se foi velha
        if(jogador == 9) {
            resultado.text = "DEU VELHA!"
        }

//      verificando as verticais
        val posicoes = listOf<Int>(0, 3, 6)

        for(x in posicoes) {
            if (buttons[x].text != "" && buttons[x].text == buttons[x + 1].text && buttons[x + 1].text == buttons[x + 2].text) {
                ganhador()
            }
        }

//      verificando as horizontais
        for(x in 0..2) {
            if(buttons[x].text != "" && buttons[x].text == buttons[x + 3].text && buttons[x + 3].text == buttons[x + 6].text){
                ganhador()
            }
        }

//      verificando as diagonais
        if ((buttons[0].text != "" && buttons[0].text == buttons[4].text && buttons[4].text == buttons[8].text)
            || (buttons[2].text != "" && buttons[2].text == buttons[4].text && buttons[4].text == buttons[6].text)) {
            ganhador()
        }

    }

//  função para determinar quem ganhou e mostrar na tela
    private fun ganhador() {
        if (jogador == 0) {
            resultado.text = "Ganhador X"
        } else if (jogador == 1) {
            resultado.text = "Ganhador O"
        }

        jogoAcabado()
    }

    private fun jogoAcabado() {
        for(x in 0..buttons.size-1) {
            buttons[x].isClickable = false
        }
    }


    private fun voltarMain() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }



}