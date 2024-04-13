package com.example.testingop

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.testingop.month.month_adapter
import com.example.testingop.month.month_modle

class MainActivity : AppCompatActivity() {
    lateinit var list:RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        list=findViewById(R.id.month_list)

        var b1 = "December"
        var b2 = "November"
        var b3 = "October"
        var b4 = "September"
        var b5 = "August"
        var b6 = "July"
        var b7 = "June"
        var b8 = "May"
        var b9 = "April"
        var b10 = "March"
        var b11 = "Febrary"
        var b12 = "January"

        var data:ArrayList<month_modle> = ArrayList()
        var a1 = month_modle("$b1")
        var a2 = month_modle("$b2")
        var a3 = month_modle("$b3")
        var a4 = month_modle("$b4")
        var a5 = month_modle("$b5")
        var a6 = month_modle("$b6")
        var a7 = month_modle("$b7")
        var a8 = month_modle("$b8")
        var a9 = month_modle("$b9")
        var a10 = month_modle("$b10")
        var a11 = month_modle("$b11")
        var a12 = month_modle("$b12")

        data.add(a1)
        data.add(a2)
        data.add(a3)
        data.add(a4)
        data.add(a5)
        data.add(a6)
        data.add(a7)
        data.add(a8)
        data.add(a9)
        data.add(a10)
        data.add(a11)
        data.add(a12)

        list.layoutManager=LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
        var adaptt=month_adapter(data)
        list.adapter=adaptt
    }
}