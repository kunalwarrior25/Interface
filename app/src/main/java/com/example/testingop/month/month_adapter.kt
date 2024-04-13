package com.example.testingop.month

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.testingop.R

class month_adapter(var monthlist:ArrayList<month_modle>):RecyclerView.Adapter<month_adapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): month_adapter.ViewHolder {
        val monthly=LayoutInflater.from(parent.context).inflate(R.layout.month,parent,false)
        return ViewHolder(monthly)
    }

    override fun onBindViewHolder(holder: month_adapter.ViewHolder, position: Int) {
        holder.month_name.setText(monthlist[position].month)
    }

    override fun getItemCount(): Int {
        return monthlist.size
    }
    inner class ViewHolder(list: View):RecyclerView.ViewHolder(list){
        lateinit var month_name:TextView

        init {
            month_name=list.findViewById(R.id.month)
        }

    }


}