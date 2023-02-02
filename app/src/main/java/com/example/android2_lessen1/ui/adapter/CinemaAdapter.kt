package com.example.android2_lessen1.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.android2_lessen1.data.models.CatsModels
import com.example.android2_lessen1.databinding.ItemCinemaBinding

class CinemaAdapter(
    private val onItemClick: (catsModel: CatsModels) -> Unit
) : RecyclerView.Adapter<CinemaAdapter.CinemaViewHolder>() {

    private var list: MutableList<CatsModels> = ArrayList()

    inner class CinemaViewHolder(private val binding: ItemCinemaBinding) :
        RecyclerView.ViewHolder(binding.root) {


        init {
            itemView.setOnClickListener {
                onItemClick(list[absoluteAdapterPosition])
            }
        }

        fun onBind(model: CatsModels) {
            binding.textView.text = model.name
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CinemaViewHolder {
        return CinemaViewHolder(
            ItemCinemaBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: CinemaViewHolder, position: Int) {
        holder.onBind(list[position])
    }

    override fun getItemCount(): Int {
        return list.size
    }

}