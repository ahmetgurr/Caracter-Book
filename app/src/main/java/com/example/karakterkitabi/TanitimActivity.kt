package com.example.karakterkitabi

import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class TanitimActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tanitim)

        //Verimli Tanım

        val intent = intent
        val secilenKarakterIsmi = intent.getStringExtra("karakterListesi")

        val textView = findViewById<TextView>(R.id.textView)
        textView.text = secilenKarakterIsmi

        val secilenKarakterGorseli = intent.getIntExtra("karakterGorselleri",0)
        val imageView = findViewById<ImageView>(R.id.imageView)
        val bitmap = BitmapFactory.decodeResource(applicationContext.resources,secilenKarakterGorseli)
        imageView.setImageBitmap(bitmap)







    }
}