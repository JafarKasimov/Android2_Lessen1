package com.example.android2_lessen1.ui.fragments.cinema

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.android2_lessen1.data.model.CatsModel
import com.example.android2_lessen1.data.repository.CatsRepository
import com.example.android2_lessen1.databinding.FragmentCinemaBinding
import com.example.android2_lessen1.ui.adapters.CinemaAdapter

class CinemaFragment : Fragment() {

    private lateinit var binding: FragmentCinemaBinding
    private val mAdapter = CinemaAdapter(this::onItemClick)
    private val repository = CatsRepository()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentCinemaBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupRequest()
        setupSubscribes()
    }

    private fun setupSubscribes() {
            mAdapter.setData(repository.getListOfText())
    }

    private fun setupRequest() {
        binding.recyclerViewCinema.adapter = mAdapter
    }

    private fun onItemClick(catsModels: CatsModel) {
        findNavController().navigate(catsModels.name)
        Log.d("anime", "onItemClick")
    }
}

