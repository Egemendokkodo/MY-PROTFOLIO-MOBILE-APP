package com.uygulamalarim.my_protfolio_mobile_app.Adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.uygulamalarim.my_protfolio_mobile_app.R

class recyclerViewAdapter:RecyclerView.Adapter<recyclerViewAdapter.ViewHolder>() {

    private var baslik= arrayOf("Summary","Technical Skills")
    private var icerik= arrayOf("Hello, I am Egemen Sevgi. I am a 3rd year college student at Trakya University. I study Computer technology and Information Systems. My delegacy is a 4 year licence program. I am interested in Mobile App development and Web Development but i am currently more interested in mobile app development field. I know how to code in Python(Qt,Django) and Java(android studio) advanced level, HTML5 and CSS3 mid level. I can make SQL queries and I know English. My level in English at B2-C1. I can talk, understand and translate English. I am highly compatible with teamwork and my communication is strong. I have been always ambitious and learns new things person.","Java,Kotlin,Python,HTML,CSS,SQL,Office Programs")

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v=LayoutInflater.from(parent.context).inflate(R.layout.cardlayout,parent,false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.title.text=baslik[position]
        holder.description.text=icerik[position]
    }

    override fun getItemCount(): Int {
        return baslik.size
    }

    inner class ViewHolder(itemView:View):RecyclerView.ViewHolder(itemView){
        var title:TextView
        var description:TextView
        init {
            title=itemView.findViewById(R.id.title)
            description=itemView.findViewById(R.id.descriptonTv)
        }
    }
}