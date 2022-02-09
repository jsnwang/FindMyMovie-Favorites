package com.example.feature_favorite.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u000e2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000eB\u0005\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH\u0016J\u0018\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\tH\u0016\u00a8\u0006\u000f"}, d2 = {"Lcom/example/feature_favorite/adapter/FavoriteItemsAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/example/omdb/response/MediaItem;", "Lcom/example/feature_favorite/adapter/viewholder/FavoriteItemViewHolder;", "()V", "onBindViewHolder", "", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "Companion", "feature_favorite_debug"})
public final class FavoriteItemsAdapter extends androidx.recyclerview.widget.ListAdapter<com.example.omdb.response.MediaItem, com.example.feature_favorite.adapter.viewholder.FavoriteItemViewHolder> {
    @org.jetbrains.annotations.NotNull()
    public static final com.example.feature_favorite.adapter.FavoriteItemsAdapter.Companion Companion = null;
    private static final androidx.recyclerview.widget.DiffUtil.ItemCallback<com.example.omdb.response.MediaItem> diffUtilItemCallback = null;
    
    public FavoriteItemsAdapter() {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.feature_favorite.adapter.viewholder.FavoriteItemViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.feature_favorite.adapter.viewholder.FavoriteItemViewHolder holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/example/feature_favorite/adapter/FavoriteItemsAdapter$Companion;", "", "()V", "diffUtilItemCallback", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/example/omdb/response/MediaItem;", "feature_favorite_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}