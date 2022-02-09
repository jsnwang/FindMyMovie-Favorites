package com.example.feature_favorite.viewmodel

import android.app.Application
import android.provider.SyncStateContract.Helpers.update
import android.util.Log
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.example.feature_favorite.adapter.FavoriteItemsAdapter
import com.example.feature_favorite.util.ViewState
import com.example.feature_favorite.view.FavoriteFragment
import com.example.omdb.OmdbRepo
import com.example.omdb.local.OmdbDatabase
import com.example.omdb.response.MediaItem
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.firstOrNull
import kotlinx.coroutines.flow.toList
import kotlinx.coroutines.launch

class FavoriteViewModel (app: Application) : AndroidViewModel(app) {

    private val _viewState = MutableLiveData<ViewState>(ViewState.Idle)
    val viewState: LiveData<ViewState> get() = _viewState

    private val omdbRepo by lazy { OmdbRepo(getApplication()) }
    //private val favoriteItemsAdapter by lazy { FavoriteItemsAdapter() }
    val mediaItemDao by lazy { OmdbDatabase.getInstance(app).mediaItemDao() }

    fun toFavs(){
        viewModelScope.launch {
            omdbRepo.mediaItems.firstOrNull()?.let { mediaItems ->
                val viewState = ViewState.Favorites(mediaItems)
                _viewState.value = viewState
            }
        }
    }

    fun editFav(mediaItem: MediaItem){
        viewModelScope.launch {
            if(mediaItem.faved) {
                mediaItem.faved = false
                mediaItemDao.delete(mediaItem)
            }
            else {
                mediaItem.faved = true
                mediaItemDao.insert(mediaItem)
            }

        }
    }


}


