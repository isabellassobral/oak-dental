package com.example.oakdental.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.oakdental.R
import com.example.oakdental.model.Produto

class AdapterProduto(private val context: Context, private val produtos: MutableList<Produto>): RecyclerView.Adapter<AdapterProduto.ProdutoViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProdutoViewHolder {
        val itemLista = LayoutInflater.from(context).inflate(R.layout.odonto_itens, parent,false)
        val holder = ProdutoViewHolder(itemLista)
        return holder
    }

    override fun onBindViewHolder(holder: ProdutoViewHolder, position: Int) {
        holder.foto.setImageResource(produtos[position].foto)
        holder.nome.text = produtos[position].nome
        holder.descricao.text = produtos[position].descricao
        holder.preco.text = produtos[position].preco
    }

    override fun getItemCount(): Int = produtos.size

    inner class ProdutoViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val foto: ImageView = itemView.findViewById<ImageView>(R.id.fotoProduto)
        val nome: TextView = itemView.findViewById<TextView>(R.id.nomeProduto)
        val descricao: TextView = itemView.findViewById<TextView>(R.id.descricaoProduto)
        val preco: TextView = itemView.findViewById<TextView>(R.id.precoProduto)
    }
}