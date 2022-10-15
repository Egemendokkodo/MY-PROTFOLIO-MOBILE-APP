package com.uygulamalarim.my_protfolio_mobile_app

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.uygulamalarim.my_protfolio_mobile_app.Adapters.recyclerViewAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    // for recyclerview
    lateinit var toggle:ActionBarDrawerToggle
    private var layoutManager:RecyclerView.LayoutManager?=null
    private var adapter:RecyclerView.Adapter<recyclerViewAdapter.ViewHolder>?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // for the left menu
        setContentView(R.layout.activity_main)
        toggle= ActionBarDrawerToggle(this,drawerLayout,R.string.open,R.string.close)
        drawerLayout.addDrawerListener(toggle)
        toggle.syncState()
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        menuItemListeners()


        // for recyclerview
        layoutManager=LinearLayoutManager(this)
        recyclerView.layoutManager=layoutManager
        adapter= recyclerViewAdapter()
        recyclerView.adapter=adapter




        // for the button actions
        githubBtn.setOnClickListener(View.OnClickListener {
            val i =Intent(Intent.ACTION_VIEW,Uri.parse("https://github.com/Egemendokkodo"))
            startActivity(i)
        })
        linkedinBtn.setOnClickListener(View.OnClickListener {
            val i =Intent(Intent.ACTION_VIEW,Uri.parse("https://www.linkedin.com/in/egemen-sevgi-813925206/"))
            startActivity(i)
        })
        contactMeBtn.setOnClickListener({
            val i=Intent(this,ContactPage::class.java)
            startActivity(i)
        })



    }

    private fun menuItemListeners(){
        navView.setNavigationItemSelectedListener {
            when(it.itemId){
                R.id.item1->{
                    val intent:Intent=Intent(this,portfolioPage::class.java)
                    startActivity(intent)
                }
                R.id.item2->{
                    val intent:Intent=Intent(this,technicalPage::class.java)
                    startActivity(intent)
                }
                R.id.item3->{
                    val i=Intent(this,ContactPage::class.java)
                    startActivity(i)
                }
            }
            true
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (toggle.onOptionsItemSelected(item)){
            return true
        }
        return super.onOptionsItemSelected(item)
    }
}