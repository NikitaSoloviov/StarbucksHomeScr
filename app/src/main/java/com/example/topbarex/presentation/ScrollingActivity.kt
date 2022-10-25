package com.example.topbarex.presentation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.topbarex.R
import com.example.topbarex.databinding.ActivityScrollingBinding
import com.example.topbarex.domain.News

class ScrollingActivity : AppCompatActivity() {

    private lateinit var binding: ActivityScrollingBinding
    private val adapter = ScrollingActivityAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityScrollingBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(findViewById(R.id.toolbar))
        binding.toolbarLayout.title = title

        setupAdapter()
        setupData()
    }

    private fun setupData() {
        adapter.items = listOf(
            News(R.drawable.cup_of_coffee), News(R.drawable.cup_of_coffee),
            News(R.drawable.cup_of_coffee),
            News(R.drawable.cup_of_coffee)
        )
    }

    private fun setupAdapter() {
        binding.rvImages.adapter = adapter
    }
}
