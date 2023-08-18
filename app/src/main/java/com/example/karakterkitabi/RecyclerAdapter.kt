package com.example.karakterkitabi

import android.content.Intent
import android.graphics.Bitmap
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecyclerAdapter(val karakterListesi : ArrayList<String>, val karakterGorselleri: ArrayList<Int>): RecyclerView.Adapter<RecyclerAdapter.CizgiKarakterVH>() {
    class CizgiKarakterVH(itemView : View): RecyclerView.ViewHolder(itemView) {

        // recyclerviewi tanımlaamn lazım
        val recyclerViewTextView: TextView = itemView.findViewById(R.id.recyclerViewTextView)

    }
    // overrideları implement edip içlerini doldur

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CizgiKarakterVH {

        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.recycler_row,parent,false)
        return CizgiKarakterVH(itemView)
    }

    override fun getItemCount(): Int {
        return karakterListesi.size

    }
/*
// hatalı kısım recyclerda hata veriyor doğrusu altta

    override fun onBindViewHolder(holder: CizgiKarakterVH, position: Int) {

        holder.itemView.recyclerViewTextView.text = karakterListesi.get(position)
        holder.itemView.setOnClickListener {
            val intent = Intent(holder.itemView.context, TanitimActivity::class.java)
            intent.putExtra("karakterListesi", karakterListesi.get(position))
            intent.putExtra("karakterGorselleri", karakterGorselleri.get(position))



            holder.itemView.context.startActivity(intent)
        }
    }

 */

    override fun onBindViewHolder(holder: CizgiKarakterVH, position: Int) {
        holder.recyclerViewTextView.text = karakterListesi[position]
        holder.itemView.setOnClickListener {
            val intent = Intent(holder.itemView.context, TanitimActivity::class.java)
            intent.putExtra("karakterListesi", karakterListesi[position])
            intent.putExtra("karakterGorselleri", karakterGorselleri[position])
            holder.itemView.context.startActivity(intent)
        }
    }


}