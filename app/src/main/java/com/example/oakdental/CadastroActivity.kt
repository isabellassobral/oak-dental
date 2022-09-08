package com.example.oakdental

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Spinner
import android.widget.TextView
import android.widget.Toast

class CadastroActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadastro)

        val btnSalvar: Button = findViewById(R.id.btnSalvar)
        val edt_nome: TextView = findViewById(R.id.edt_nome)
        val edt_email: TextView = findViewById(R.id.edt_email)
        val edt_senha: TextView = findViewById(R.id.edt_senha)


        btnSalvar.setOnClickListener(View.OnClickListener {

            val cadastroPersistencia = this.getSharedPreferences("cadastro", Context.MODE_PRIVATE)
            val editor = cadastroPersistencia.edit()

            editor.putString("nome",edt_nome.text.toString())
            editor.putString("email",edt_email.text.toString())
            editor.putString("senha",edt_senha.text.toString())
            editor.apply()


            Toast.makeText(this,"Cadastro realizado!",Toast.LENGTH_SHORT).show()

            val i = Intent(this, MainActivity::class.java)
            startActivity(i)

        })
    }
}