package br.digitalhouse.revisaovprv.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class MyViewPagerAdapter(fragmentManager: FragmentManager) : FragmentPagerAdapter(fragmentManager) {

    var listaDeFragmentos = mutableListOf<Fragment>()
    var listaDeTitulo = mutableListOf<String>()

    fun add(fragment: Fragment, titulo : String){
        listaDeFragmentos.add(fragment)
        listaDeTitulo.add(titulo)
    }

    override fun getCount(): Int {
      return listaDeFragmentos.size
    }

    override fun getItem(position: Int): Fragment {
        return listaDeFragmentos[position]
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return listaDeTitulo[position]
    }
}