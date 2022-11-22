package com.example.recyclerview.adapter

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.bumptech.glide.Glide
import com.example.recyclerview.Informacion
import com.example.recyclerview.R

class InformacionViewHolder(view: View): ViewHolder(view) {

    val nombreper =  view.findViewById<TextView>(R.id.tvNombre)
    val especieper =  view.findViewById<TextView>(R.id.tvespecie)
    val imagen = view.findViewById<ImageView>(R.id.ivImagen)

    fun render(infoModel: Informacion){
        nombreper.text = infoModel.nombre
        especieper.text = infoModel.especie
        Glide.with(imagen.context).load(infoModel.imagen).into(imagen)


    }
}