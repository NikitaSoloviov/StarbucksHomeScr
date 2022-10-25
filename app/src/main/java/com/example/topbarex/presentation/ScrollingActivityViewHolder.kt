package com.example.topbarex.presentation

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.topbarex.databinding.CellBinding
import com.example.topbarex.domain.News


class ScrollingActivityViewHolder (view: View): RecyclerView.ViewHolder(view){

    private val binding: CellBinding = CellBinding.bind(view)

    fun bind(view: News){
        binding.ivCupOfCoffee.setImageDrawable(itemView.resources.getDrawable(view.drawableResourceID))
    }
}

