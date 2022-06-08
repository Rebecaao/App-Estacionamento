package com.example.projetoestacionamento

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        val voltar = findViewById<ImageView>(R.id.voltar)

        voltar.setOnClickListener{
            val intent = Intent(this,MainActivity4::class.java)
            startActivity((intent))
            finish()
        }




    }
}