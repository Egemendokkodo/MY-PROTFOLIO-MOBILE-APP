package com.uygulamalarim.my_protfolio_mobile_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.uygulamalarim.my_protfolio_mobile_app.Adapters.portfolioAdapter
import com.uygulamalarim.my_protfolio_mobile_app.Adapters.recyclerViewAdapter
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_portfolio_page.*

class portfolioPage : AppCompatActivity() {

    private var layoutManager: RecyclerView.LayoutManager?=null
    private var adapter: RecyclerView.Adapter<portfolioAdapter.ViewHolder>?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_portfolio_page)



        layoutManager= LinearLayoutManager(this)
        portfolioRecycler.layoutManager=layoutManager
        adapter= portfolioAdapter()
        portfolioRecycler.adapter=adapter

    }
}