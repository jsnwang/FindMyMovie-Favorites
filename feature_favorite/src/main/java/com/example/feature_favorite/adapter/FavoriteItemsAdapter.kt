package com.example.feature_favorite.adapter

import android.view.ViewGroup
import com.example.omdb.response.MediaItem
import android.view.LayoutInflater
import androidx.recyclerview.widget.RecyclerView
import coil.load
import coil.size.Scale
import coil.transform.RoundedCornersTransformation
import com.example.feature_favorite.databinding.ItemMediaBinding
import com.example.findmymovie.R

class FavoriteItemsAdapter (private val favItems : List<MediaItem>): RecyclerView.Adapter<FavoriteItemsAdapter.FavoriteItemViewHolder>() {

    override fun onCreateViewHolder(
        parent: ViewGroup, viewType: Int
    ) = FavoriteItemViewHolder.newInstance(parent)

    override fun onBindViewHolder(holder: FavoriteItemViewHolder, position: Int) {
        holder.bindMediaItem(favItems[position])
    }

    override fun getItemCount(): Int {
        return favItems.size
    }

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

}
