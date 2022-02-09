package com.example.feature_favorite.view

import android.media.browse.MediaBrowser
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.isVisible
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.example.feature_favorite.adapter.FavoriteItemsAdapter
import com.example.feature_favorite.databinding.FragmentFavoriteBinding
import com.example.feature_favorite.util.ViewState
import com.example.feature_favorite.viewmodel.FavoriteViewModel
import com.example.omdb.response.MediaItem

class FavoriteFragment : Fragment() {

    private var _binding: FragmentFavoriteBinding? = null
    private val binding get() = _binding!!

    private val viewModel by viewModels<FavoriteViewModel>()
    //private val favoriteItemsAdapter by lazy { FavoriteItemsAdapter() }

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
        initObservers()
    }

    private fun initViews() = with(binding){
        viewModel.toFavs()

    }

    private fun initObservers() = with(viewModel){
        viewState.observe(viewLifecycleOwner) { state ->
            if (state is ViewState.Favorites) updateFavs(state.mediaItems)

        }
    }

    fun updateFavs(items:List<MediaItem>) = with(binding) {
        rvResults.adapter = FavoriteItemsAdapter(items)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}