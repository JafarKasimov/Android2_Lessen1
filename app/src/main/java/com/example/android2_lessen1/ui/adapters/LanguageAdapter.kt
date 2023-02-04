package com.example.android2_lessen1.ui.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.android2_lessen1.data.model.CatsModel
import com.example.android2_lessen1.databinding.ItemLenguageBinding

class LanguageAdapter(
    private val onItemClick: (catsModel: CatsModel) -> Unit
) : RecyclerView.Adapter<LanguageAdapter.LanguageViewHolder>() {

    private var list: MutableList<CatsModel> = ArrayList()

    inner class LanguageViewHolder(private val binding: ItemLenguageBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun onBind(model: CatsModel) {
            binding.textViewLenguage.text = model.name
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LanguageViewHolder {
        return LanguageViewHolder(
            ItemLenguageBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: LanguageViewHolder, position: Int) {
        holder.onBind(list[position])
    }

    override fun getItemCount(): Int {
        return list.size
    }

    fun setData(list: MutableList<CatsModel>) {
        this.list = list
    }
}