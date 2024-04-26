package com.example.testingop

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.drawerlayout.widget.DrawerLayout
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.testingop.month.month_adapter
import com.example.testingop.month.month_modle
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity() {
    lateinit var list:RecyclerView
    lateinit var data:ArrayList<month_modle>
    lateinit var monthId:Array<String>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        list = findViewById(R.id.month_list)

        monthId = arrayOf(
            "December"
            ,"November"
            ,"October"
            ,"September"
            ,"August"
            ,"July"
            ,"June"
            ,"May"
            ,"April"
            ,"March"
            ,"Febrary"
            ,"January")

        list.layoutManager = LinearLayoutManager(this)
        list.setHasFixedSize(true)
        data = arrayListOf<month_modle>()
        getdata()

    }

    private fun getdata() {

        for(i in monthId.indices){
            val month = month_modle(monthId[i])
            data.add(month)
        }
        var monthAdapt = month_adapter(data)
        list.adapter=monthAdapt
        monthAdapt.setOnItemClickListener(object :month_adapter.onItemClickListener{
            override fun onItemCLick(position: Int) {
                var intent = Intent(this@MainActivity,fragment::class.java)
                intent.putExtra("opmonth",data[position].month)
                startActivity(intent)
            }

        })
    }
}