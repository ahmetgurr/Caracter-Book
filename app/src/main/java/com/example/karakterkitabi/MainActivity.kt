package com.example.karakterkitabi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        // veri hazırlığı

        var karakterIsimleri = ArrayList<String>()
        karakterIsimleri.add("Karakter 1")
        karakterIsimleri.add("Karakter 2")
        karakterIsimleri.add("Karakter 3")
        karakterIsimleri.add("Karakter 4")
        karakterIsimleri.add("Karakter 5")
        karakterIsimleri.add("Karakter 6")


        val birDrawableId = R.drawable.images_bir
        val ikiDrawableId = R.drawable.images_iki
        val ucDrawableId = R.drawable.images_uc
        val dortDrawableId = R.drawable.images_dort
        val besDrawableId = R.drawable.images_bes
        val altiDrawableId = R.drawable.images_alti

        var karakterDrawableListesi = ArrayList<Int>()
        karakterDrawableListesi.add(birDrawableId)
        karakterDrawableListesi.add(ikiDrawableId)
        karakterDrawableListesi.add(ucDrawableId)
        karakterDrawableListesi.add(dortDrawableId)
        karakterDrawableListesi.add(besDrawableId)
        karakterDrawableListesi.add(altiDrawableId)


        //Adapter

        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)

        val layoutManager = LinearLayoutManager(this)
        recyclerView.layoutManager = layoutManager

        val adapter = RecyclerAdapter(karakterIsimleri,karakterDrawableListesi)
        recyclerView.adapter = adapter


        }
    }
