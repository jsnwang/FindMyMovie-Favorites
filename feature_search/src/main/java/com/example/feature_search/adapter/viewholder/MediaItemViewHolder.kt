package com.example.feature_search.adapter.viewholder

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import coil.load
import coil.size.Scale
import coil.transform.RoundedCornersTransformation
import com.example.feature_search.databinding.ItemMediaBinding
import com.example.feature_search.viewmodel.SearchViewModel
import com.example.findmymovie.R
import com.example.omdb.response.MediaItem

class MediaItemViewHolder(
    private val binding: ItemMediaBinding
) : RecyclerView.ViewHolder(binding.root) {

    //private val mediaItemDao by lazy { OmdbDatabase.getInstance(app).mediaItemDao() }
    fun bindMediaItem(mediaItem: MediaItem, viewModel: SearchViewModel) {
        binding.tvTitle.text = mediaItem.title
        binding.ivPoster.load(mediaItem.poster) {
            scale(Scale.FIT)
            crossfade(true)
            crossfade(500)
            placeholder(R.drawable.no_image)
            transformations(RoundedCornersTransformation(25f))
            build()
        }

        binding.ivPoster.setOnClickListener(){
            viewModel.addFav(mediaItem)
        }
    }

    companion object {
        fun newInstance(parent: ViewGroup) = ItemMediaBinding.inflate(
            LayoutInflater.from(parent.context), parent, false
        ).let { binding -> MediaItemViewHolder(binding) }
    }
}