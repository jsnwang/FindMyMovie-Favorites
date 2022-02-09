package com.example.feature_search.adapter

import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import com.example.feature_search.adapter.viewholder.MediaItemViewHolder
import com.example.feature_search.viewmodel.SearchViewModel
import com.example.omdb.response.MediaItem

class MediaItemsAdapter (val viewModel: SearchViewModel) : ListAdapter<MediaItem, MediaItemViewHolder>(diffUtilItemCallback) {

    override fun onCreateViewHolder(
        parent: ViewGroup, viewType: Int
    ) = MediaItemViewHolder.newInstance(parent)

    override fun onBindViewHolder(holder: MediaItemViewHolder, position: Int) {
        holder.bindMediaItem(getItem(position), viewModel)
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
