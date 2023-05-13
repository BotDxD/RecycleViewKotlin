package com.example.recycleviewkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

  companion object{
    val INTENT_PARCELABLE = "OBJECT_INTENT"
      }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val superheroList = listOf<Superhero>(
            Superhero(
                R.drawable.superman,
                nameSuperhero = "SuperMan",
                descSuperhero = "Character DC",
            ),
            Superhero(
                R.drawable.batman,
                nameSuperhero = "BatMan",
                descSuperhero = "Character DC",
            ),
            Superhero(
                R.drawable.ironman,
                nameSuperhero = "Iron Man",
                descSuperhero = "Character Marvel",
            ),
            Superhero(
                R.drawable.spiderman,
                nameSuperhero = "Spider Man",
                descSuperhero = "Character Marvel",
            ),
            Superhero(
                R.drawable.captainamerica,
                nameSuperhero = "Captain America",
                descSuperhero = "Character Marvel",
            ),
            Superhero(
                R.drawable.wolverine,
                nameSuperhero = "Wolverine",
                descSuperhero = "Character Marvel",
            ),
            Superhero(
                R.drawable.hulk,
                nameSuperhero = "Hulk",
                descSuperhero = "Character Marvel",
            ),
            Superhero(
                R.drawable.deadpool,
                nameSuperhero = "Deadpool",
                descSuperhero = "Character Marvel",
            ),
            Superhero(
                R.drawable.thor,
                nameSuperhero = "Thor",
                descSuperhero = "Character Marvel",
            ),
            Superhero(
                R.drawable.venom,
                nameSuperhero = "Venom",
                descSuperhero = "Character Villain Series SpiderMan",
            ),
        )
        val recyclerView = findViewById<RecyclerView>(R.id.rv_hero)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = SuperheroAdapter(this, superheroList){
            val intent = Intent(this, DetailSuperheroActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)
        }
    }
}