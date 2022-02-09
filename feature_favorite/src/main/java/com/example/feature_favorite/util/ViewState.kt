package com.example.feature_favorite.util

import android.media.browse.MediaBrowser
import com.example.omdb.response.MediaItem

sealed class ViewState {
    object Idle : ViewState()
    data class Favorites(val mediaItems: List<MediaItem>) : ViewState()
    data class Update(val mediaItem: MediaItem) : ViewState()
}