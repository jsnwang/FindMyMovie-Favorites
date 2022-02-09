package com.example.feature_favorite.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\bH\u0016J\u0018\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\bH\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/example/feature_favorite/adapter/FavoriteItemsAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/feature_favorite/adapter/FavoriteItemsAdapter$FavoriteItemViewHolder;", "favItems", "", "Lcom/example/omdb/response/MediaItem;", "(Ljava/util/List;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "FavoriteItemViewHolder", "feature_favorite_debug"})
public final class FavoriteItemsAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.feature_favorite.adapter.FavoriteItemsAdapter.FavoriteItemViewHolder> {
    private final java.util.List<com.example.omdb.response.MediaItem> favItems = null;
    
    public FavoriteItemsAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.omdb.response.MediaItem> favItems) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.feature_favorite.adapter.FavoriteItemsAdapter.FavoriteItemViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.feature_favorite.adapter.FavoriteItemsAdapter.FavoriteItemViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \t2\u00020\u0001:\u0001\tB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/example/feature_favorite/adapter/FavoriteItemsAdapter$FavoriteItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/example/feature_favorite/databinding/ItemMediaBinding;", "(Lcom/example/feature_favorite/databinding/ItemMediaBinding;)V", "bindMediaItem", "", "mediaItem", "Lcom/example/omdb/response/MediaItem;", "Companion", "feature_favorite_debug"})
    public static final class FavoriteItemViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final com.example.feature_favorite.databinding.ItemMediaBinding binding = null;
        @org.jetbrains.annotations.NotNull()
        public static final com.example.feature_favorite.adapter.FavoriteItemsAdapter.FavoriteItemViewHolder.Companion Companion = null;
        
        public FavoriteItemViewHolder(@org.jetbrains.annotations.NotNull()
        com.example.feature_favorite.databinding.ItemMediaBinding binding) {
            super(null);
        }
        
        public final void bindMediaItem(@org.jetbrains.annotations.NotNull()
        com.example.omdb.response.MediaItem mediaItem) {
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/example/feature_favorite/adapter/FavoriteItemsAdapter$FavoriteItemViewHolder$Companion;", "", "()V", "newInstance", "Lcom/example/feature_favorite/adapter/FavoriteItemsAdapter$FavoriteItemViewHolder;", "parent", "Landroid/view/ViewGroup;", "feature_favorite_debug"})
        public static final class Companion {
            
            private Companion() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.example.feature_favorite.adapter.FavoriteItemsAdapter.FavoriteItemViewHolder newInstance(@org.jetbrains.annotations.NotNull()
            android.view.ViewGroup parent) {
                return null;
            }
        }
    }
}