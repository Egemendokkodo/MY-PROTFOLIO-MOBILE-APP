package com.uygulamalarim.my_protfolio_mobile_app.Adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ProgressBar
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.uygulamalarim.my_protfolio_mobile_app.R

class technicalAdapter: RecyclerView.Adapter<technicalAdapter.ViewHolder>() {

    private var skillNameArray= arrayOf("English","Python","Java","Kotlin","HTML&CSS","SQL")
    private var progressNumArray= arrayOf("B2-C1","100%","100%","100%","50%","70%")
    private var progressbarArray= intArrayOf(100,100,100,100,50,70)
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): technicalAdapter.ViewHolder {
        val v= LayoutInflater.from(parent.context).inflate(R.layout.recycler_t_layout,parent,false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: technicalAdapter.ViewHolder, position: Int) {
        holder.skillName.text=skillNameArray[position]
        holder.progressNum.text=progressNumArray[position]
        holder.progressbar.setProgress(progressbarArray[position])
    }

    override fun getItemCount(): Int {
        return skillNameArray.size
    }

    inner class ViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        var skillName: TextView
        var progressNum: TextView
        var progressbar:ProgressBar
        init {
            skillName=itemView.findViewById(R.id.skillName)
            progressNum=itemView.findViewById(R.id.progressNum)
            progressbar=itemView.findViewById(R.id.progressBar)
        }
    }

}