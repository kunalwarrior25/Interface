package com.example.testingop.movie

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.testingop.R

class movie_adapter(var movie_list:ArrayList<movie_modle>):RecyclerView.Adapter<movie_adapter.ViewHolder>() {

    var onItemClick:((movie_modle) -> Unit)? = null
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): movie_adapter.ViewHolder {
        var movie=LayoutInflater.from(parent.context).inflate(R.layout.frame_movie,parent,false)
        return ViewHolder(movie)
    }

    override fun onBindViewHolder(holder: movie_adapter.ViewHolder, position: Int) {
        val movie = movie_list[position]

        holder.movie_image.setImageResource(movie_list[position].movie_image)
        holder.movie_name.setText(movie_list[position].movie_name)
        holder.movie_date.setText(movie_list[position].movie_released_date)
        holder.movie_production.setText(movie_list[position].movie_released_by)

        holder.itemView.setOnClickListener(){
            onItemClick?.invoke(movie)
        }
    }

    override fun getItemCount(): Int {
        return movie_list.size
    }
    inner class ViewHolder(list: View):RecyclerView.ViewHolder(list){
        lateinit var movie_image:ImageView
        lateinit var movie_name:TextView
        lateinit var movie_date:TextView
        lateinit var movie_production:TextView

        init{
            movie_image=list.findViewById(R.id.movie_image)
            movie_name=list.findViewById(R.id.movie_name)
            movie_date=list.findViewById(R.id.movie_date)
            movie_production=list.findViewById(R.id.movie_produce)
        }


    }

}