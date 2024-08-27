package com.example.dadoaoacaso

import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class telaResultado : AppCompatActivity() {

    lateinit var imagemResultado: ImageView
    lateinit var botaoVoltar: ImageButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_tela_resultado)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        imagemResultado = findViewById(R.id.imagemResultado)
        botaoVoltar = findViewById(R.id.botaoVoltar)

        val faces: Bundle? = intent.extras

        // variavel numero esta armazenando 0 ou 1
        val numero = faces?.getInt("numero")

        when(numero){

            0 -> imagemResultado.setImageResource(R.drawable.faceum)
            1 -> imagemResultado.setImageResource(R.drawable.facedois)
            2 -> imagemResultado.setImageResource(R.drawable.facetres)
            3 -> imagemResultado.setImageResource(R.drawable.facequatro)
            4 -> imagemResultado.setImageResource(R.drawable.facecinco)
            5 -> imagemResultado.setImageResource(R.drawable.faceseis)

        }

        botaoVoltar.setOnClickListener { finish() }
    }
}