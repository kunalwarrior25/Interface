package com.example.testingop.movie

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.testingop.R
import com.example.testingop.month.month_modle

class framegment_movie : Fragment() {
    lateinit var movie:RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_framegment_movie, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        movie= view.findViewById(R.id.re_movie)

        var moviedata:ArrayList<movie_modle> = ArrayList()
        var a1 = movie_modle(R.drawable.gandhigodseekyu,"Gandhi Godse Ek Yudh","26 Jan 2023","Manila Santoshi")
        var a2 = movie_modle(R.drawable.pathaan,"Pathaan","25 Jan 2023","Yash Raj Films")
        var a3 = movie_modle(R.drawable.paper,"Paper","25 Jan 2023","Unknown")
        var a4 = movie_modle(R.drawable.missionmajnu,"Mission Majnu","20 Jan 2023","Association Media LLP, RSVP Movies")
        var a5 = movie_modle(R.drawable.chhatriwali,"Chhatriwali","20 Jan 2023","RSVP Movies")
        var a6 = movie_modle(R.drawable.zindagishatranjhai,"Zindagi Shatranj Hai","20 Jan 2023","Anand Motion Picture")
        var a7 = movie_modle(R.drawable.junglemahaltheawakening,"Junglemahal: The Awakening","20 Jan 2023","Runava Chowdhury Productions")
        var a8 = movie_modle(R.drawable.kuttey,"Kuttey","13 Jan 2023","Luv Films, T-Series Films, Vishal Bhardwaj Pictures Pvt Ltd")
        var a9 = movie_modle(R.drawable.lakadbaggha,"Lakadbaggha","13 Jan 2023","First Ray Films")
        var a10 =movie_modle(R.drawable.sachintheultimatewinner,"Sachin The Utimate Winner","13 Jan 2023","J S R Productions Pvt. Ltd")


        moviedata.add(a1)
        moviedata.add(a2)
        moviedata.add(a3)
        moviedata.add(a4)
        moviedata.add(a5)
        moviedata.add(a6)
        moviedata.add(a7)
        moviedata.add(a8)
        moviedata.add(a9)
        moviedata.add(a10)

        movie.layoutManager=LinearLayoutManager(view.context,LinearLayoutManager.VERTICAL,false)
        val adapt = movie_adapter(moviedata)
        movie.adapter=adapt
    }
}