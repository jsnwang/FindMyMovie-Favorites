package com.example.feature_favorite.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015B\u001b\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\u000b\u001a\u00020\fH\u0016J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\fH\u0016J\u0018\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\fH\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0016"}, d2 = {"Lcom/example/feature_favorite/adapter/FavoriteItemsAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/feature_favorite/adapter/FavoriteItemsAdapter$FavoriteItemViewHolder;", "favItems", "", "Lcom/example/omdb/response/MediaItem;", "viewModel", "Lcom/example/feature_favorite/viewmodel/FavoriteViewModel;", "(Ljava/util/List;Lcom/example/feature_favorite/viewmodel/FavoriteViewModel;)V", "getViewModel", "()Lcom/example/feature_favorite/viewmodel/FavoriteViewModel;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "FavoriteItemViewHolder", "feature_favorite_debug"})
public final class FavoriteItemsAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.feature_favorite.adapter.FavoriteItemsAdapter.FavoriteItemViewHolder> {
    private final java.util.List<com.example.omdb.response.MediaItem> favItems = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.feature_favorite.viewmodel.FavoriteViewModel viewModel = null;
    
    public FavoriteItemsAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.omdb.response.MediaItem> favItems, @org.jetbrains.annotations.NotNull()
    com.example.feature_favorite.viewmodel.FavoriteViewModel viewModel) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.feature_favorite.viewmodel.FavoriteViewModel getViewModel() {
        return null;
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
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/example/feature_favorite/adapter/FavoriteItemsAdapter$FavoriteItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/example/feature_favorite/databinding/ItemMediaBinding;", "(Lcom/example/feature_favorite/databinding/ItemMediaBinding;)V", "bindMediaItem", "", "mediaItem", "Lcom/example/omdb/response/MediaItem;", "viewModel", "Lcom/example/feature_favorite/viewmodel/FavoriteViewModel;", "Companion", "feature_favorite_debug"})
    public static final class FavoriteItemViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final com.example.feature_favorite.databinding.ItemMediaBinding binding = null;
        @org.jetbrains.annotations.NotNull()
        public static final com.example.feature_favorite.adapter.FavoriteItemsAdapter.FavoriteItemViewHolder.Companion Companion = null;
        
        public FavoriteItemViewHolder(@org.jetbrains.annotations.NotNull()
        com.example.feature_favorite.databinding.ItemMediaBinding binding) {
            super(null);
        }
        
        public final void bindMediaItem(@org.jetbrains.annotations.NotNull()
        com.example.omdb.response.MediaItem mediaItem, @org.jetbrains.annotations.NotNull()
        com.example.feature_favorite.viewmodel.FavoriteViewModel viewModel) {
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