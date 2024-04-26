package com.example.testingop.movie

import android.content.Intent
import android.content.Intent.getIntent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.testingop.R
import com.example.testingop.fragment
import com.example.testingop.month.month_adapter
import com.example.testingop.month.month_modle

class framegment_movie : Fragment() {
    lateinit var movie: RecyclerView
    lateinit var movieimageId:Array<Int>
    lateinit var movienameId:Array<String>
    lateinit var moviedataId:Array<String>
    lateinit var movieproducedId:Array<String>
    lateinit var moviedata:ArrayList<movie_modle>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_framegment_movie, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        var bundle = this.getArguments()
        var msg = bundle?.getString("opmonth")
        movie = view.findViewById(R.id.re_movie)
        moviedata = ArrayList()

        if (msg =="January") {

            movieimageId = arrayOf(
                R.drawable.gandhigodseekyu,
                R.drawable.pathaan,
                R.drawable.paper,
                R.drawable.missionmajnu,
                R.drawable.chhatriwali,
                R.drawable.zindagishatranjhai,
                R.drawable.junglemahaltheawakening,
                R.drawable.kuttey,
                R.drawable.lakadbaggha,
                R.drawable.sachintheultimatewinner
            )
            movienameId = arrayOf(
                "Gandhi Godse Ek Yudh",
                "Pathaan",
                "Paper",
                "Mission Majnu",
                "Chhatriwali",
                "Zindagi Shatranj Hai",
                "Junglemahal: The Awakening",
                "Kuttey",
                "Lakadbaggha",
                "Sachin The Utimate Winner"
            )

            moviedataId = arrayOf(
                "26 Jan 2023",
                "25 Jan 2023",
                "25 Jan 2023",
                "20 Jan 2023",
                "20 Jan 2023",
                "20 Jan 2023",
                "20 Jan 2023",
                "13 Jan 2023",
                "13 Jan 2023",
                "13 Jan 2023"
            )

            movieproducedId = arrayOf(
                "Manila Santoshi",
                "Yash Raj Films",
                "Unknown",
                "Association Media LLP, RSVP Movies",
                "RSVP Movies",
                "Anand Motion Picture",
                "Runava Chowdhury Productions",
                "Luv Films, T-Series Films, Vishal Bhardwaj Pictures Pvt Ltd",
                "First Ray Films",
                "J S R Productions Pvt. Ltd"
            )
            getdata2()
        }

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

        var c1 = movie_modle(R.drawable.c1,"Gaslight","31 Mar 2023","Ramesh Taurani")
        var c2 = movie_modle(R.drawable.c2,"Bholaa","30 Mar 2023","Ajay Devgn")
        var c3 = movie_modle(R.drawable.c3,"Chor Nikal ke Bhaaga","24 Mar 2023","Amar Kaushiik")
        var c4 = movie_modle(R.drawable.c4,"Kanjoos Makhichoos","24 Mar 2023","Deepak Mukut")
        var c5 = movie_modle(R.drawable.c5,"Bheed","24 Mar 2023","Bhushan Kumar")
        var c6 = movie_modle(R.drawable.c6,"A Winter Tale At Shimla","24 Mar 2023","Yogesh Varma")
        var c7 = movie_modle(R.drawable.c7,"Mrs Chatterjee Vs Norway","17 Mar 2023","Monisha Advani")
        var c8 = movie_modle(R.drawable.c8,"Zwigato","17 Mar 2023","Nandita Das")
        var c9 = movie_modle(R.drawable.c9,"Shubh Nikah","17 Mar 2023","Bhupender Singh")
        var c10 = movie_modle(R.drawable.c10,"Tu Jhooti Main Makkaar","08 Mar 2023","Ankur Grag")

        moviedata.add(c1)
        moviedata.add(c2)
        moviedata.add(c3)
        moviedata.add(c4)
        moviedata.add(c5)
        moviedata.add(c6)
        moviedata.add(c7)
        moviedata.add(c8)
        moviedata.add(c9)
        moviedata.add(c10)

        var d1 = movie_modle(R.drawable.d1,"Bad Boy","28 Apr 2023","Anjum Qureshi")
        var d2 = movie_modle(R.drawable.d2,"U-Turn","28 Apr 2023","Shobha Kapoor")
        var d3 = movie_modle(R.drawable.d3,"Thugs","25 Apr 2023","Unknown")
        var d4 = movie_modle(R.drawable.d4,"Kisi Ka Bhai Kisi Ki Jaan","21 Apr 2023","Sajid Nadiadwala")
        var d5 = movie_modle(R.drawable.d5,"Chengiz","21 Apr 2023","Jeet")
        var d6 = movie_modle(R.drawable.d6,"Mrs UnderCover","14 Apr 2023","Varun Bajaj")
        var d7 = movie_modle(R.drawable.d7,"Gumraah","07 Apr 2023","Bhushan Kumar")

        moviedata.add(d1)
        moviedata.add(d2)
        moviedata.add(d3)
        moviedata.add(d4)
        moviedata.add(d5)
        moviedata.add(d6)
        moviedata.add(d7)

        var e1 = movie_modle(R.drawable.e1,"Jogira Sara Ra Ra","26 May 2023","Naeem A Siddiqui")
        var e2 = movie_modle(R.drawable.e2,"Chhipkali","26 May 2023","Meemo")
        var e3 = movie_modle(R.drawable.e3,"Agra","24 May 2023","Vikram Mehra")
        var e4 = movie_modle(R.drawable.e4,"Bandaa","23 May 2023","Vinod Bhanushali")
        var e5 = movie_modle(R.drawable.e5,"Kathal","19 May 2023","Achin Jain")
        var e6 = movie_modle(R.drawable.e6,"Ittar","19 May 2023","Tanuj Bhramar")
        var e7 = movie_modle(R.drawable.e7,"Sirf Ek Bandaa Kaafi Hai","13 May 2023","Suparn Verma")
        var e8 = movie_modle(R.drawable.e8,"IB71","12 May 2023","vidyut Jammwal")
        var e9 = movie_modle(R.drawable.e9,"The Kerala Story","05 May 2023","Vipul Amrutlal")
        var e10 = movie_modle(R.drawable.e10,"Hasseen Dillruba 2","04 May 2023","Aanand L. Rai")

        moviedata.add(e1)
        moviedata.add(e2)
        moviedata.add(e3)
        moviedata.add(e4)
        moviedata.add(e5)
        moviedata.add(e6)
        moviedata.add(e7)
        moviedata.add(e8)
        moviedata.add(e9)
        moviedata.add(e10)

        movie.layoutManager = LinearLayoutManager(view.context, LinearLayoutManager.VERTICAL, false)
        val adapt = movie_adapter(moviedata)
        movie.adapter = adapt

    }
    private fun getdata2() {

        for(i in movieimageId.indices){
            val month = movie_modle(movieimageId[i],movienameId[i],moviedataId[i],movieproducedId[i])
            moviedata.add(month)
        }
        movie.adapter = movie_adapter(moviedata)


    }
}