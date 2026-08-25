package com.bumptech.glide.load.engine.cache;

/* JADX INFO: loaded from: classes2.dex */
public class MemoryCacheAdapter implements com.bumptech.glide.load.engine.cache.MemoryCache {
    private com.bumptech.glide.load.engine.cache.MemoryCache.ResourceRemovedListener listener;

    public MemoryCacheAdapter() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.bumptech.glide.load.engine.cache.MemoryCache
    public void clearMemory() {
            r0 = this;
            return
    }

    @Override // com.bumptech.glide.load.engine.cache.MemoryCache
    public long getCurrentSize() {
            r2 = this;
            r0 = 0
            return r0
    }

    @Override // com.bumptech.glide.load.engine.cache.MemoryCache
    public long getMaxSize() {
            r2 = this;
            r0 = 0
            return r0
    }

    @Override // com.bumptech.glide.load.engine.cache.MemoryCache
    @androidx.annotation.Nullable
    public com.bumptech.glide.load.engine.Resource<?> put(@androidx.annotation.NonNull com.bumptech.glide.load.Key r1, @androidx.annotation.Nullable com.bumptech.glide.load.engine.Resource<?> r2) {
            r0 = this;
            if (r2 == 0) goto L7
            com.bumptech.glide.load.engine.cache.MemoryCache$ResourceRemovedListener r1 = r0.listener
            r1.onResourceRemoved(r2)
        L7:
            r1 = 0
            return r1
    }

    @Override // com.bumptech.glide.load.engine.cache.MemoryCache
    @androidx.annotation.Nullable
    public com.bumptech.glide.load.engine.Resource<?> remove(@androidx.annotation.NonNull com.bumptech.glide.load.Key r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // com.bumptech.glide.load.engine.cache.MemoryCache
    public void setResourceRemovedListener(@androidx.annotation.NonNull com.bumptech.glide.load.engine.cache.MemoryCache.ResourceRemovedListener r1) {
            r0 = this;
            r0.listener = r1
            return
    }

    @Override // com.bumptech.glide.load.engine.cache.MemoryCache
    public void setSizeMultiplier(float r1) {
            r0 = this;
            return
    }

    @Override // com.bumptech.glide.load.engine.cache.MemoryCache
    public void trimMemory(int r1) {
            r0 = this;
            return
    }
}
