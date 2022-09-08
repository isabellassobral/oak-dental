package com.example.oakdental

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.oakdental.adapter.AdapterProduto
import com.example.oakdental.model.Produto

class ProdutoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_produto)

        val recyclerviewProdutos = findViewById<RecyclerView>(R.id.recyclerView_produtos)
        recyclerviewProdutos.layoutManager = LinearLayoutManager(this)
        recyclerviewProdutos.setHasFixedSize(true)

        //Configurando o Adapter
        val listaProdutos: MutableList<Produto> = mutableListOf()
        val adapterProduto = AdapterProduto(this, listaProdutos)
        recyclerviewProdutos.adapter = adapterProduto

        val produto1 = Produto(
            R.drawable.avental,
            "AVENTAL DESCARTÁVEL MANGA LONGA 20G C/10 - ELÁSTICO NO PUNHO",
            "Marca:Derma-Plus",
            "R$ 30,20"
        )
        listaProdutos.add(produto1)
        val produto2 = Produto(
            R.drawable.resina,
            "RESINA Z100",
            "Marca:3M Espe",
            "R$ 50,00"
        )
        listaProdutos.add(produto2)
        val produto3 = Produto(
            R.drawable.mascara,
            "MÁSCARA N95 - UNIDADE",
            "Marca:Life Care",
            "R$ 1,20"
        )
        listaProdutos.add(produto3)
        val produto4 = Produto(
            R.drawable.dencojet,
            "AGULHA GENGIVAL DENCOJET",
            "Marca:DFL",
            "R$ 53,60"
        )
        listaProdutos.add(produto4)
        val produto5 = Produto(
            R.drawable.expansor,
            "EXPANSOR EXPANDEX ADULTO AC BLACK",
            "Marca:Jon",
            "R$ 11,60"
        )
        listaProdutos.add(produto5)
    }
}