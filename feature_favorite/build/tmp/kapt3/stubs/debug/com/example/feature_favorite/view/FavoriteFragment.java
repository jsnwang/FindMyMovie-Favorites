package com.example.feature_favorite.view;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0002J\b\u0010\u0010\u001a\u00020\u000fH\u0002J$\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u000fH\u0016J\u001a\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\u0014\u0010\u001d\u001a\u00020\u000f2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020 0\u001fR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\b\u001a\u00020\t8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000b\u00a8\u0006!"}, d2 = {"Lcom/example/feature_favorite/view/FavoriteFragment;", "Landroidx/fragment/app/Fragment;", "()V", "_binding", "Lcom/example/feature_favorite/databinding/FragmentFavoriteBinding;", "binding", "getBinding", "()Lcom/example/feature_favorite/databinding/FragmentFavoriteBinding;", "viewModel", "Lcom/example/feature_favorite/viewmodel/FavoriteViewModel;", "getViewModel", "()Lcom/example/feature_favorite/viewmodel/FavoriteViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "initObservers", "", "initViews", "onCreateView", "Landroidx/constraintlayout/widget/ConstraintLayout;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "onViewCreated", "view", "Landroid/view/View;", "updateFavs", "items", "", "Lcom/example/omdb/response/MediaItem;", "feature_favorite_debug"})
public final class FavoriteFragment extends androidx.fragment.app.Fragment {
    private com.example.feature_favorite.databinding.FragmentFavoriteBinding _binding;
    private final kotlin.Lazy viewModel$delegate = null;
    
    public FavoriteFragment() {
        super();
    }
    
    private final com.example.feature_favorite.databinding.FragmentFavoriteBinding getBinding() {
        return null;
    }
    
    private final com.example.feature_favorite.viewmodel.FavoriteViewModel getViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.constraintlayout.widget.ConstraintLayout onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void initViews() {
    }
    
    private final void initObservers() {
    }
    
    public final void updateFavs(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.omdb.response.MediaItem> items) {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
}