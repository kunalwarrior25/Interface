package com.example.testingop.show

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.testingop.R
import com.example.testingop.movie.movie_adapter
import com.example.testingop.movie.movie_modle
import kotlin.io.path.fileVisitor

class fragment_show : Fragment() {

    lateinit var re_show:RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_show, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        re_show=view.findViewById(R.id.re_show)

        var showdata:ArrayList<showmodle> = ArrayList()
        var a1 = showmodle("Gandhi Godse Ek Yudh","10 AM","3 PM","7 PM")

        showdata.add(a1)

        re_show.layoutManager= LinearLayoutManager(view.context, LinearLayoutManager.VERTICAL,false)
        val adapt = showadapter(showdata)
        re_show.adapter=adapt
    }
}