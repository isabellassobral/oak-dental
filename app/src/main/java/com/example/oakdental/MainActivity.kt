package com.example.oakdental

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnLogin = findViewById<Button>(R.id.btn_login)
        val btnCriarConta = findViewById<Button>(R.id.btn_criarConta)

        btnCriarConta.setOnClickListener{
            val i = Intent(this, CadastroActivity::class.java)
            startActivity(i)
        }

        btnLogin.setOnClickListener{
            val i = Intent(this, ProdutoActivity::class.java)
            startActivity(i)
        }
    }
}