package com.example.feature_favorite.adapter.viewholder

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import coil.load
import coil.size.Scale
import coil.transform.RoundedCornersTransformation
import com.example.feature_favorite.databinding.ItemMediaBinding
import com.example.findmymovie.R
import com.example.omdb.response.MediaItem

class FavoriteItemViewHolder(
    private val binding: ItemMediaBinding
) : RecyclerView.ViewHolder(binding.root) {

    fun bindMediaItem(mediaItem: MediaItem) {
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

        }
    }

    companion object {
        fun newInstance(parent: ViewGroup) = ItemMediaBinding.inflate(
            LayoutInflater.from(parent.context), parent, false
        ).let { binding -> FavoriteItemViewHolder(binding) }
    }
}
