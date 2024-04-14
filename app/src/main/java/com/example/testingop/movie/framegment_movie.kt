package com.example.testingop.movie

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.testingop.R
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

        moviedata.add(a1)

        movie.layoutManager=LinearLayoutManager(view.context,LinearLayoutManager.VERTICAL,false)
        val adapt = movie_adapter(moviedata)
        movie.adapter=adapt
    }
}