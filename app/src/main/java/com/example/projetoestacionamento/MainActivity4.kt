package com.example.projetoestacionamento

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)

        val vagasdisponiveis = findViewById<ImageView>(R.id.vagasDisponiveis)
        val tempoEvalores = findViewById<ImageView>(R.id.tempoEvalores)



        vagasdisponiveis.setOnClickListener{
            val intent = Intent(this, MainActivity3::class.java)
            startActivity((intent))
            finish()
        }

        tempoEvalores.setOnClickListener{
            val  intent = Intent(this, MainActivity2::class.java)
            startActivity((intent))
            finish()
        }

        
    }
}
