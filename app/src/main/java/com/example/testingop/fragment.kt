package com.example.testingop

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Button
import android.widget.FrameLayout
import android.widget.TextView
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.drawerlayout.widget.DrawerLayout
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import com.example.testingop.month.month_modle
import com.example.testingop.movie.framegment_movie
import com.example.testingop.show.fragment_show
import com.google.android.material.navigation.NavigationView

class fragment : AppCompatActivity() {
    lateinit var frame_movie:Button
    lateinit var frame_show:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fragment)

        val bundle:Bundle? = intent.extras
        var text = findViewById<TextView>(R.id.month_heading)
        var heading = bundle?.getString("opmonth")
        text.text = heading

        frame_movie = findViewById(R.id.frame_movie)
        frame_show = findViewById(R.id.frame_show)

        frame_movie.setOnClickListener() {
            var frame1: Fragment = framegment_movie()
            val myfrag: FragmentTransaction = supportFragmentManager.beginTransaction()
            myfrag.replace(R.id.frame, frame1).commit()
        }
        frame_show.setOnClickListener() {
            var frame2: Fragment = fragment_show()
            val myfrag: FragmentTransaction = supportFragmentManager.beginTransaction()
            myfrag.replace(R.id.frame, frame2).commit()
        }
    }
}