package com.example.topbarex.presentation


import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.topbarex.R
import com.example.topbarex.domain.News


class ScrollingActivityAdapter() : RecyclerView.Adapter<ScrollingActivityViewHolder>() {

    var items = listOf<News>()
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ScrollingActivityViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.cell, parent, false)

        return ScrollingActivityViewHolder(view)
    }

    override fun onBindViewHolder(holder: ScrollingActivityViewHolder, position: Int) {
        holder.bind(items[position])
    }

    override fun getItemCount(): Int = items.size
}
