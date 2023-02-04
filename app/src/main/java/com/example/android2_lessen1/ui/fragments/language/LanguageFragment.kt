package com.example.android2_lessen1.ui.fragments.language

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.android2_lessen1.data.model.CatsModel
import com.example.android2_lessen1.data.repository.LanguageRepository
import com.example.android2_lessen1.databinding.FragmentLenguageBinding
import com.example.android2_lessen1.ui.adapters.LanguageAdapter

class LanguageFragment : Fragment() {

    private lateinit var binding: FragmentLenguageBinding
    private val mAdapter = LanguageAdapter(this::onItemClick)
    private val repository = LanguageRepository()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentLenguageBinding.inflate(inflater, container, false)
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
        binding.recyclerViewLanguage.adapter = mAdapter
    }

    private fun onItemClick(catsModels: CatsModel) {
        findNavController().navigate(catsModels.image)
        Log.d("anime", "onItemClick")
    }
}
