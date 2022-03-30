package br.digitalhouse.revisaovprv.ui.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import br.digitalhouse.revisaovprv.adapter.MyViewPagerAdapter
import br.digitalhouse.revisaovprv.R
import br.digitalhouse.revisaovprv.ui.fragments.Fragmento1
import br.digitalhouse.revisaovprv.ui.fragments.Fragmento2
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //configura o adapter adiciona os fragmentos no adapter
        var adapter = MyViewPagerAdapter(supportFragmentManager)
        adapter.add(Fragmento2(), "Câmera")
        adapter.add(Fragmento1(),"Conversas")

        //configura o viewpager e seta o adapter
        var viewPager = findViewById<ViewPager>(R.id.myviewpager)
        viewPager.adapter = adapter

        //configura o tablayout e seta o view pager
        var tabLayout = findViewById<TabLayout>(R.id.mtablayout)
        tabLayout.setupWithViewPager(viewPager)
    }
}