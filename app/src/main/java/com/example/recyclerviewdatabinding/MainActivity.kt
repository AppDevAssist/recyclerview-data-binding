package com.example.recyclerviewdatabinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewdatabinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var manager: RecyclerView.LayoutManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        var data = listOf(DataModel(1, "First data"),DataModel(2, "Second data"),DataModel(3, "Third data"),DataModel(4, "Fourth data"),DataModel(5, "Fifth data"))

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        manager = LinearLayoutManager(this)

        binding.recyclerView.apply{
            adapter = RecyclerViewAdapter(data)
            layoutManager = manager
        }
    }
}