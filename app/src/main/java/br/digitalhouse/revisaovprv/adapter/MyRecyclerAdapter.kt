package br.digitalhouse.revisaovprv.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import br.digitalhouse.revisaovprv.R
import br.digitalhouse.revisaovprv.data.Monster

class MyRecyclerAdapter(val context : Context?, val listaDeMonster : List<Monster>) : RecyclerView.Adapter<MyRecyclerAdapter.myViewHolder> (){

    //responsável por inflar a view na tela
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): myViewHolder {
        var layoutInflater = LayoutInflater.from(context).inflate(R.layout.item_view,parent,false)
        return myViewHolder(layoutInflater)
    }

    //função responsável por alterar os componentes da view
    override fun onBindViewHolder(holder: myViewHolder, position: Int) {
       holder.imageView.setImageResource(listaDeMonster[position].imagem)
       holder.textView.text = listaDeMonster[position].name

    }

    //retorna a quantidade de itens na lista
    override fun getItemCount(): Int {
      return listaDeMonster.size
    }

    //classe responsável por segurar os itens da view para serem implementados
    inner class myViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
     var imageView = itemView.findViewById<ImageView>(R.id.foto)
     var textView = itemView.findViewById<TextView>(R.id.nome)
    }

}