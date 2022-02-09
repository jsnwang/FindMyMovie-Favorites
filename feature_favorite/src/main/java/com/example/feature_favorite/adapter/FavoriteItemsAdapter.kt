package com.example.feature_favorite.adapter

import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import com.example.feature_favorite.adapter.viewholder.FavoriteItemViewHolder
import com.example.omdb.response.MediaItem

class FavoriteItemsAdapter : ListAdapter<MediaItem, FavoriteItemViewHolder>(diffUtilItemCallback) {

    override fun onCreateViewHolder(
        parent: ViewGroup, viewType: Int
    ) = FavoriteItemViewHolder.newInstance(parent)

    override fun onBindViewHolder(holder: FavoriteItemViewHolder, position: Int) {
        holder.bindMediaItem(getItem(position))
    }

    companion object {

        private val diffUtilItemCallback = object : DiffUtil.ItemCallback<MediaItem>() {
            override fun areItemsTheSame(
                oldItem: MediaItem, newItem: MediaItem
            ) = oldItem.imdbID == newItem.imdbID

            override fun areContentsTheSame(
                oldItem: MediaItem, newItem: MediaItem
            ) = oldItem == newItem
        }
    }

}
