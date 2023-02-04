package com.example.android2_lessen1.ui.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.android2_lessen1.data.model.CatsModel
import com.example.android2_lessen1.databinding.ItemCinemaBinding

class CinemaAdapter(
    private val onItemClick: (catsModel: CatsModel) -> Unit
) : RecyclerView.Adapter<CinemaAdapter.CinemaViewHolder>() {

    private var list: MutableList<CatsModel> = ArrayList()

    inner class CinemaViewHolder(private val binding: ItemCinemaBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun onBind(model: CatsModel) {
            binding.textViewCinema.text = model.name
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

    fun setData(list: MutableList<CatsModel>) {
        this.list = list
    }

}