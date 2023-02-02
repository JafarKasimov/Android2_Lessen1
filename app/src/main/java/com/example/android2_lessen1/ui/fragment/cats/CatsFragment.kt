package com.example.android2_lessen1.ui.fragment.cats

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.android2_lessen1.data.models.CatsModels
import com.example.android2_lessen1.data.repository.CatsRepository
import com.example.android2_lessen1.databinding.FragmentCatsBinding
import com.example.android2_lessen1.ui.adapter.CatsAdapter


class CatsFragment : Fragment() {

    private lateinit var binding: FragmentCatsBinding
    private val mAdapter = CatsAdapter(this::onItemClick)
    private val repository = CatsRepository()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentCatsBinding.inflate(inflater, container, false)
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
        binding.recyclerViewCat.adapter = mAdapter
    }

    private fun onItemClick(catsModels: CatsModels) {
        findNavController().navigate(CatsFragmentDirections.actionCatsFragmentToDetailFragment(catsModels.name, catsModels.image))
        Log.d("anime", "onItemClick")
    }
}