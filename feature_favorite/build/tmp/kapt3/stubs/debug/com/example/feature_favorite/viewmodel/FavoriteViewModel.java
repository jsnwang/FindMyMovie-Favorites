package com.example.feature_favorite.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aJ\u0006\u0010\u001b\u001a\u00020\u0018R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\b\u001a\u00020\t8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\u00148F\u00a2\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016\u00a8\u0006\u001c"}, d2 = {"Lcom/example/feature_favorite/viewmodel/FavoriteViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "app", "Landroid/app/Application;", "(Landroid/app/Application;)V", "_viewState", "Landroidx/lifecycle/MutableLiveData;", "Lcom/example/feature_favorite/util/ViewState;", "mediaItemDao", "Lcom/example/omdb/local/dao/MediaItemDao;", "getMediaItemDao", "()Lcom/example/omdb/local/dao/MediaItemDao;", "mediaItemDao$delegate", "Lkotlin/Lazy;", "omdbRepo", "Lcom/example/omdb/OmdbRepo;", "getOmdbRepo", "()Lcom/example/omdb/OmdbRepo;", "omdbRepo$delegate", "viewState", "Landroidx/lifecycle/LiveData;", "getViewState", "()Landroidx/lifecycle/LiveData;", "removeFav", "", "mediaItem", "Lcom/example/omdb/response/MediaItem;", "toFavs", "feature_favorite_debug"})
public final class FavoriteViewModel extends androidx.lifecycle.AndroidViewModel {
    private final androidx.lifecycle.MutableLiveData<com.example.feature_favorite.util.ViewState> _viewState = null;
    private final kotlin.Lazy omdbRepo$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy mediaItemDao$delegate = null;
    
    public FavoriteViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application app) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.feature_favorite.util.ViewState> getViewState() {
        return null;
    }
    
    private final com.example.omdb.OmdbRepo getOmdbRepo() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.omdb.local.dao.MediaItemDao getMediaItemDao() {
        return null;
    }
    
    public final void toFavs() {
    }
    
    public final void removeFav(@org.jetbrains.annotations.NotNull()
    com.example.omdb.response.MediaItem mediaItem) {
    }
}