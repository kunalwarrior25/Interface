package com.example.testingop.show

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.testingop.R

class showadapter(var showlist:ArrayList<showmodle>):RecyclerView.Adapter<showadapter.ViewHolder>() {
    inner class ViewHolder(list: View):RecyclerView.ViewHolder(list){
        lateinit var show_name:TextView
        lateinit var first_time:TextView
        lateinit var second_time:TextView
        lateinit var third_time:TextView
        init {
            show_name=list.findViewById(R.id.show_name)
            first_time=list.findViewById(R.id.first_time)
            second_time=list.findViewById(R.id.second_time)
            third_time=list.findViewById(R.id.third_time)
        }
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var show = LayoutInflater.from(parent.context).inflate(R.layout.frame_show,parent,false)
        return ViewHolder(show)
    }
    override fun getItemCount(): Int {
        return showlist.size
    }
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.show_name.setText(showlist[position].show_name)
        holder.first_time.setText(showlist[position].first_time)
        holder.second_time.setText(showlist[position].second_time)
        holder.third_time.setText(showlist[position].third_time)
    }
}