package com.uygulamalarim.my_protfolio_mobile_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.uygulamalarim.my_protfolio_mobile_app.Adapters.portfolioAdapter
import com.uygulamalarim.my_protfolio_mobile_app.Adapters.technicalAdapter
import kotlinx.android.synthetic.main.activity_portfolio_page.*
import kotlinx.android.synthetic.main.activity_technical_page.*

class technicalPage : AppCompatActivity() {
    private var layoutManager: RecyclerView.LayoutManager?=null
    private var adapter: RecyclerView.Adapter<technicalAdapter.ViewHolder>?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_technical_page)

        layoutManager= LinearLayoutManager(this)
        recyclerT.layoutManager=layoutManager
        adapter= technicalAdapter()
        recyclerT.adapter=adapter

    }
}