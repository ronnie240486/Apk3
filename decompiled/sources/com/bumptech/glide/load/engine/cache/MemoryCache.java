package com.bumptech.glide.load.engine.cache;

/* JADX INFO: loaded from: classes2.dex */
public interface MemoryCache {

    /* JADX INFO: loaded from: classes.dex */
    public interface ResourceRemovedListener {
        void onResourceRemoved(@androidx.annotation.NonNull com.bumptech.glide.load.engine.Resource<?> r1);
    }

    void clearMemory();

    long getCurrentSize();

    long getMaxSize();

    @androidx.annotation.Nullable
    com.bumptech.glide.load.engine.Resource<?> put(@androidx.annotation.NonNull com.bumptech.glide.load.Key r1, @androidx.annotation.Nullable com.bumptech.glide.load.engine.Resource<?> r2);

    @androidx.annotation.Nullable
    com.bumptech.glide.load.engine.Resource<?> remove(@androidx.annotation.NonNull com.bumptech.glide.load.Key r1);

    void setResourceRemovedListener(@androidx.annotation.NonNull com.bumptech.glide.load.engine.cache.MemoryCache.ResourceRemovedListener r1);

    void setSizeMultiplier(float r1);

    void trimMemory(int r1);
}
