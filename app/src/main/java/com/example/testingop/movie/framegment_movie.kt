package com.example.testingop.movie

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.core.os.bundleOf
import androidx.lifecycle.findViewTreeViewModelStoreOwner
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.testingop.R
import com.example.testingop.month.month_modle

class framegment_movie : Fragment() {
    lateinit var movie: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_framegment_movie, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        movie = view.findViewById(R.id.re_movie)
        var moviedata: ArrayList<movie_modle> = ArrayList()

        var a1 = movie_modle(
            R.drawable.gandhigodseekyu,
            "Gandhi Godse Ek Yudh",
            "26 Jan 2023",
            "Manila Santoshi"
        )
        var a2 = movie_modle(R.drawable.pathaan, "Pathaan", "25 Jan 2023", "Yash Raj Films")
        var a3 = movie_modle(R.drawable.paper, "Paper", "25 Jan 2023", "Unknown")
        var a4 = movie_modle(
            R.drawable.missionmajnu,
            "Mission Majnu",
            "20 Jan 2023",
            "Association Media LLP, RSVP Movies"
        )
        var a5 = movie_modle(R.drawable.chhatriwali, "Chhatriwali", "20 Jan 2023", "RSVP Movies")
        var a6 = movie_modle(
            R.drawable.zindagishatranjhai,
            "Zindagi Shatranj Hai",
            "20 Jan 2023",
            "Anand Motion Picture"
        )
        var a7 = movie_modle(
            R.drawable.junglemahaltheawakening,
            "Junglemahal: The Awakening",
            "20 Jan 2023",
            "Runava Chowdhury Productions"
        )
        var a8 = movie_modle(
            R.drawable.kuttey,
            "Kuttey",
            "13 Jan 2023",
            "Luv Films, T-Series Films, Vishal Bhardwaj Pictures Pvt Ltd"
        )
        var a9 =
            movie_modle(R.drawable.lakadbaggha, "Lakadbaggha", "13 Jan 2023", "First Ray Films")
        var a10 = movie_modle(
            R.drawable.sachintheultimatewinner,
            "Sachin The Utimate Winner",
            "13 Jan 2023",
            "J S R Productions Pvt. Ltd"
        )
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


        var b1 = movie_modle(R.drawable.selfiee, "Selfiee", "24 Feb 2023", "karan johar")
        var b2 = movie_modle(R.drawable.khelahobe, "Khela Hobe", "24 Feb 2023", "Kumari Manju")
        var b3 = movie_modle(R.drawable.dahaad, "Dahaad", "22 Feb 2023", "Zoya Akhtar")
        var b4 = movie_modle(R.drawable.yeh_shaadi_nahi_ho_sakti, "Yep Shaadi Nahi Ho Sakti", "19 Feb 2023", "Akarsh Lamba")
        var b5 = movie_modle(R.drawable.shehzada, "Shehzada", "17 Feb 2023", "Bhushan Kumar")
        var b6 = movie_modle(R.drawable.main_raj_kapoor_ho_gaya, "Main Raj Kapoor Ho Gaya", "17 Feb 2023", "Mukesh Sharma")
        var b7 = movie_modle(R.drawable.lost, "Lost", "16 Feb 2023", "Kishor Arora")
        var b8 = movie_modle(R.drawable.farzi, "Farzi", "10 Feb 2023", "Krishna DK")
        var b9 = movie_modle(R.drawable.the_tenant, "The Tenant", "10 Feb 2023", "Shushrut Jain")
        var b10 = movie_modle(R.drawable.who_am_i, "Who Am I", "03 Feb 2023", "Alok Prakash")

        moviedata.add(b1)
        moviedata.add(b2)
        moviedata.add(b3)
        moviedata.add(b4)
        moviedata.add(b5)
        moviedata.add(b6)
        moviedata.add(b7)
        moviedata.add(b8)
        moviedata.add(b9)
        moviedata.add(b10)

        movie.layoutManager = LinearLayoutManager(view.context, LinearLayoutManager.VERTICAL, false)
        val adapt = movie_adapter(moviedata)
        movie.adapter = adapt

    }
}