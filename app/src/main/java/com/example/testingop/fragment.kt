package com.example.testingop

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.FrameLayout
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import com.example.testingop.month.month_modle
import com.example.testingop.movie.framegment_movie
import com.example.testingop.show.fragment_show

class fragment : AppCompatActivity() {
    lateinit var frame_movie:Button
    lateinit var frame_show:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fragment)

        val month = intent.getParcelableExtra<month_modle>("opmonth")
        if (month!=null){
            val textView :TextView = findViewById(R.id.month_heading)

            textView.text = month.month
        }

        frame_movie=findViewById(R.id.frame_movie)
        frame_show=findViewById(R.id.frame_show)

        frame_movie.setOnClickListener(){
            var frame1:Fragment=framegment_movie()
            val myfrag:FragmentTransaction=supportFragmentManager.beginTransaction()
            myfrag.replace(R.id.frame,frame1).commit()
        }
        frame_show.setOnClickListener(){
            var frame2:Fragment=fragment_show()
            val myfrag:FragmentTransaction=supportFragmentManager.beginTransaction()
            myfrag.replace(R.id.frame,frame2).commit()
        }
    }
}