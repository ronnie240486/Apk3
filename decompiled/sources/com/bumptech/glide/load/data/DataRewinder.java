package com.bumptech.glide.load.data;

/* JADX INFO: loaded from: classes2.dex */
public interface DataRewinder<T> {

    /* JADX INFO: loaded from: classes3.dex */
    public interface Factory<T> {
        @androidx.annotation.NonNull
        com.bumptech.glide.load.data.DataRewinder<T> build(@androidx.annotation.NonNull T r1);

        @androidx.annotation.NonNull
        java.lang.Class<T> getDataClass();
    }

    void cleanup();

    @androidx.annotation.NonNull
    T rewindAndGet() throws java.io.IOException;
}
