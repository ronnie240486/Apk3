package com.bumptech.glide.load.model;

/* JADX INFO: loaded from: classes2.dex */
public interface ModelLoaderFactory<T, Y> {
    @androidx.annotation.NonNull
    com.bumptech.glide.load.model.ModelLoader<T, Y> build(@androidx.annotation.NonNull com.bumptech.glide.load.model.MultiModelLoaderFactory r1);

    void teardown();
}
