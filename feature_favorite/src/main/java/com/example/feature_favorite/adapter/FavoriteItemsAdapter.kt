package com.example.feature_favorite.adapter

import android.util.Log
import android.view.ViewGroup
import com.example.omdb.response.MediaItem
import android.view.LayoutInflater
import androidx.recyclerview.widget.RecyclerView
import coil.load
import coil.size.Scale
import coil.transform.RoundedCornersTransformation
import com.example.feature_favorite.databinding.ItemMediaBinding
import com.example.feature_favorite.viewmodel.FavoriteViewModel
import com.example.findmymovie.R
import com.example.omdb.local.OmdbDatabase
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.launch

class FavoriteItemsAdapter (private val favItems : List<MediaItem>, val viewModel : FavoriteViewModel): RecyclerView.Adapter<FavoriteItemsAdapter.FavoriteItemViewHolder>() {

    override fun onCreateViewHolder(
        parent: ViewGroup, viewType: Int
    ) = FavoriteItemViewHolder.newInstance(parent)

    override fun onBindViewHolder(holder: FavoriteItemViewHolder, position: Int) {
        holder.bindMediaItem(favItems[position], viewModel)
    }

    override fun getItemCount(): Int {
        return favItems.size
    }

    class FavoriteItemViewHolder(
        private val binding: ItemMediaBinding
    ) : RecyclerView.ViewHolder(binding.root) {

        fun bindMediaItem(mediaItem: MediaItem, viewModel: FavoriteViewModel) {
            binding.tvTitle.text = mediaItem.title

            binding.ivPoster.load(mediaItem.poster) {
                scale(Scale.FIT)
                crossfade(true)
                crossfade(500)
                placeholder(R.drawable.no_image)
                transformations(RoundedCornersTransformation(25f))
                build()
            }
            binding.ivPoster.setOnClickListener{
                viewModel.editFav(mediaItem)
            }

        }
        companion object {
            fun newInstance(parent: ViewGroup) = ItemMediaBinding.inflate(
                LayoutInflater.from(parent.context), parent, false
            ).let { binding -> FavoriteItemViewHolder(binding) }
        }
    }

}
