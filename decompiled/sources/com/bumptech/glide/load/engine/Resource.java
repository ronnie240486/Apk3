package com.bumptech.glide.load.engine;

/* JADX INFO: loaded from: classes.dex */
public interface Resource<Z> {
    @androidx.annotation.NonNull
    Z get();

    @androidx.annotation.NonNull
    java.lang.Class<Z> getResourceClass();

    int getSize();

    void recycle();
}
