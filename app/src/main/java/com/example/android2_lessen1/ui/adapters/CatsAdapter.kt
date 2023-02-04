package com.example.android2_lessen1.ui.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.android2_lessen1.data.model.CatsModel
import com.example.android2_lessen1.databinding.ItemCatBinding

class CatsAdapter(
    private val onItemClick: (catsModel: CatsModel) -> Unit
) : RecyclerView.Adapter<CatsAdapter.CatsViewHolder>() {

    private var list: MutableList<CatsModel> = ArrayList()

    inner class CatsViewHolder(private val binding: ItemCatBinding) :
        RecyclerView.ViewHolder(binding.root) {


        init {
            itemView.setOnClickListener {
                onItemClick(list[absoluteAdapterPosition])
            }
        }

        fun onBind(catsModel: CatsModel) {
            binding.textsView.text = catsModel.name
            Glide.with(binding.imagesView.context).load(catsModel.image).into(binding.imagesView)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CatsViewHolder {
        return CatsViewHolder(
            ItemCatBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: CatsViewHolder, position: Int) {
        holder.onBind(list[position])
    }

    override fun getItemCount(): Int {
        return list.size
    }

    fun setData(list: MutableList<CatsModel>) {
        this.list = list
    }
}