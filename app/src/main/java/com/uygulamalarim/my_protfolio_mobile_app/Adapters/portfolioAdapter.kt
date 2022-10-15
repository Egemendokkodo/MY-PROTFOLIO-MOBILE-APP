package com.uygulamalarim.my_protfolio_mobile_app.Adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.uygulamalarim.my_protfolio_mobile_app.R

class portfolioAdapter:RecyclerView.Adapter<portfolioAdapter.ViewHolder>() {

    private var title= arrayOf("Food Order App (Java)","Istanbul Times News Retrofit&REST-API (Java)","ToDo app SQLite (Java)","Instagram Follower Analyzer (Python Qt)","iOS Calculator Clone (Kotlin)")
    private var desc= arrayOf("\tA food order app with login and sign up features and database","\tNews app using retrofit and rest api"
    ,"\tI programmed a ToDo mobile app using java and sqlite","\tI programmed a instagram follower analyzer program using python and qt framework it reads information on instagram using selenium","\tI cloned iOS' calculator app using kotlin")
    private var img= intArrayOf(R.drawable.img1,R.drawable.img2,R.drawable.img3,R.drawable.img4,R.drawable.img5)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): portfolioAdapter.ViewHolder {
        val v= LayoutInflater.from(parent.context).inflate(R.layout.portfoliolayout,parent,false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: portfolioAdapter.ViewHolder, position: Int) {
        holder.title.text=title[position]
        holder.description.text=desc[position]
        holder.image.setImageResource(img[position])
    }

    override fun getItemCount(): Int {
        return title.size
    }
    inner class ViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        var title: TextView
        var description: TextView
        var image:ImageView

        init {
            title=itemView.findViewById(R.id.titleP)
            description=itemView.findViewById(R.id.descriptionP)
            image=itemView.findViewById(R.id.imageP)
        }
    }


}