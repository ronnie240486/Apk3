package com.bumptech.glide.load.engine;

/* JADX INFO: loaded from: classes2.dex */
interface DataFetcherGenerator {

    public interface FetcherReadyCallback {
        void onDataFetcherFailed(com.bumptech.glide.load.Key r1, java.lang.Exception r2, com.bumptech.glide.load.data.DataFetcher<?> r3, com.bumptech.glide.load.DataSource r4);

        void onDataFetcherReady(com.bumptech.glide.load.Key r1, @androidx.annotation.Nullable java.lang.Object r2, com.bumptech.glide.load.data.DataFetcher<?> r3, com.bumptech.glide.load.DataSource r4, com.bumptech.glide.load.Key r5);

        void reschedule();
    }

    void cancel();

    boolean startNext();
}
