package com.example.recyclerviewdatabinding

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewdatabinding.databinding.RecyclerviewItemBinding

class RecyclerViewAdapter(private val data: List<DataModel>): RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder>(){


    inner class MyViewHolder(val binding: RecyclerviewItemBinding): RecyclerView.ViewHolder(binding.root){
        fun bind(item: DataModel){
            binding.listItem = item
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val inflater = LayoutInflater.from(parent.context)

        val listItemBinding = RecyclerviewItemBinding.inflate(inflater, parent, false)
        return MyViewHolder(listItemBinding)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.bind(data[position])
    }

    override fun getItemCount(): Int {
        return data.size
    }
}