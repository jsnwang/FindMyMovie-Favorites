package com.example.feature_favorite.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.feature_favorite.adapter.FavoriteItemsAdapter
import com.example.feature_favorite.databinding.FragmentFavoriteBinding

class FavoriteFragment : Fragment() {

    private var _binding: FragmentFavoriteBinding? = null
    private val binding get() = _binding!!

    private val favoriteItemsAdapter by lazy { FavoriteItemsAdapter() }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ) = FragmentFavoriteBinding.inflate(inflater, container, false).also {
        _binding = it


    }.root

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initViews()
    }

    private fun initViews() = with(binding){
        rvResults.adapter = favoriteItemsAdapter
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}