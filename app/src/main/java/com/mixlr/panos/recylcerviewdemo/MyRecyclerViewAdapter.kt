package com.mixlr.panos.recylcerviewdemo

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyRecyclerViewAdapter(val fruitsList: List<Fruit>): RecyclerView.Adapter<MyViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val listItem = layoutInflater.inflate(R.layout.list_item, parent, false)
        return MyViewHolder(listItem)
    }

    override fun getItemCount(): Int {
        return fruitsList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        Log.i("MYRECYCLERVIEWDEMO", "MyRecyclerViewAdapter.onBindViewHolder(): position is $position")
        val fruit = fruitsList[position]
        holder.bind(fruit)
    }
}

class MyViewHolder(val view: View): RecyclerView.ViewHolder(view) {
    fun bind(fruit: Fruit) {
        val myTextView = view.findViewById<TextView>(R.id.tvName)
        myTextView.text = "${fruit.name} (${fruit.supplier})"
    }
}