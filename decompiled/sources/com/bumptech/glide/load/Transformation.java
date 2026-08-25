package com.bumptech.glide.load;

/* JADX INFO: loaded from: classes.dex */
public interface Transformation<T> extends com.bumptech.glide.load.Key {
    @androidx.annotation.NonNull
    com.bumptech.glide.load.engine.Resource<T> transform(@androidx.annotation.NonNull android.content.Context r1, @androidx.annotation.NonNull com.bumptech.glide.load.engine.Resource<T> r2, int r3, int r4);
}
