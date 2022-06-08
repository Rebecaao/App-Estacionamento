package com.example.projetoestacionamento

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.util.*
import kotlin.concurrent.schedule

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splash_main)

        Timer().schedule(1000){ abrirTela1()}
    }

    private fun abrirTela1() {
        val intent = Intent(this, MainActivity4::class.java)
        startActivity((intent))
        finish()

    }
}