package calle.lara.teo.reciclerviewuso

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import calle.lara.teo.reciclerviewuso.adapter.SuperHeroAdapter

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initRecyclerView()
    }

    private fun initRecyclerView(){
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerSuperHero)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = SuperHeroAdapter(SuperHeroProvider.superHeroList)
    }
}