package com.example.homedrop_example

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.homedrop_example.databinding.ItemRowUserBinding

class RvAdapter:RecyclerView.Adapter<RvAdapter.ViewHolder>() {

    inner class ViewHolder(private val binding: ItemRowUserBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(position: Int) {
//            val item = getItem(position)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

}