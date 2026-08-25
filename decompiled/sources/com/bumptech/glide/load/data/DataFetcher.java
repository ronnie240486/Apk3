package com.bumptech.glide.load.data;

/* JADX INFO: loaded from: classes.dex */
public interface DataFetcher<T> {

    /* JADX INFO: loaded from: classes2.dex */
    public interface DataCallback<T> {
        void onDataReady(@androidx.annotation.Nullable T r1);

        void onLoadFailed(@androidx.annotation.NonNull java.lang.Exception r1);
    }

    void cancel();

    void cleanup();

    @androidx.annotation.NonNull
    java.lang.Class<T> getDataClass();

    @androidx.annotation.NonNull
    com.bumptech.glide.load.DataSource getDataSource();

    void loadData(@androidx.annotation.NonNull com.bumptech.glide.Priority r1, @androidx.annotation.NonNull com.bumptech.glide.load.data.DataFetcher.DataCallback<? super T> r2);
}
