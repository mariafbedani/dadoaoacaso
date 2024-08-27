package com.example.dadoaoacaso

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    lateinit var BotaoJogar: ImageButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        BotaoJogar = findViewById(R.id.botaoJogar)

        BotaoJogar.setOnClickListener {

            val intent = Intent(applicationContext, telaResultado::class.java)
            val numero = Random.nextInt(5)

            intent.putExtra("numero", numero)

            startActivity(intent) // intent é o valor da variavel da tela de resultado, que foi creiado ali em cima

        }


    }
}