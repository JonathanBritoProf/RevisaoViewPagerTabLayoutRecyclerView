package br.digitalhouse.revisaovprv.ui.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import br.digitalhouse.revisaovprv.data.MonsterBuilder
import br.digitalhouse.revisaovprv.adapter.MyRecyclerAdapter
import br.digitalhouse.revisaovprv.R

class Fragmento1 : Fragment(R.layout.fragmento1){

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //adciona os items na lista
        var monsterBuilder = MonsterBuilder()
        monsterBuilder.add(R.drawable.frank,"Frank", "Frank")
        monsterBuilder.add(R.drawable.mummy,"mummy" ,"mummy")
        monsterBuilder.add(R.drawable.pumpkin, "pumpkin", "pumpkin")
        monsterBuilder.add(R.drawable.cauldron,"caldron","caldron")
        monsterBuilder.add(R.drawable.castle,"castle","castle")

        //cria a recyclerview e configura seu adapter
        var recyclerView = view.findViewById<RecyclerView>(R.id.myrecycler)
        recyclerView.adapter = MyRecyclerAdapter(this.context,monsterBuilder.listaDeMonstros)

    }
}