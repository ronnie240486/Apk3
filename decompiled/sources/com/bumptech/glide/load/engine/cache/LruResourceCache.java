package com.bumptech.glide.load.engine.cache;

/* JADX INFO: loaded from: classes2.dex */
public class LruResourceCache extends com.bumptech.glide.util.LruCache<com.bumptech.glide.load.Key, com.bumptech.glide.load.engine.Resource<?>> implements com.bumptech.glide.load.engine.cache.MemoryCache {
    private com.bumptech.glide.load.engine.cache.MemoryCache.ResourceRemovedListener listener;

    public LruResourceCache(long r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // com.bumptech.glide.util.LruCache
    public final int getSize(@androidx.annotation.Nullable com.bumptech.glide.load.engine.Resource<?> r1) {
            r0 = this;
            com.bumptech.glide.load.engine.Resource r1 = (com.bumptech.glide.load.engine.Resource) r1
            if (r1 != 0) goto L6
            r1 = 1
            goto La
        L6:
            int r1 = r1.getSize()
        La:
            return r1
    }

    @Override // com.bumptech.glide.util.LruCache
    public final void onItemEvicted(@androidx.annotation.NonNull com.bumptech.glide.load.Key r1, @androidx.annotation.Nullable com.bumptech.glide.load.engine.Resource<?> r2) {
            r0 = this;
            com.bumptech.glide.load.Key r1 = (com.bumptech.glide.load.Key) r1
            com.bumptech.glide.load.engine.Resource r2 = (com.bumptech.glide.load.engine.Resource) r2
            com.bumptech.glide.load.engine.cache.MemoryCache$ResourceRemovedListener r1 = r0.listener
            if (r1 == 0) goto Ld
            if (r2 == 0) goto Ld
            r1.onResourceRemoved(r2)
        Ld:
            return
    }

    @Override // com.bumptech.glide.load.engine.cache.MemoryCache
    @androidx.annotation.Nullable
    public /* bridge */ /* synthetic */ com.bumptech.glide.load.engine.Resource put(@androidx.annotation.NonNull com.bumptech.glide.load.Key r1, @androidx.annotation.Nullable com.bumptech.glide.load.engine.Resource r2) {
            r0 = this;
            java.lang.Object r1 = super.put(r1, r2)
            com.bumptech.glide.load.engine.Resource r1 = (com.bumptech.glide.load.engine.Resource) r1
            return r1
    }

    @Override // com.bumptech.glide.load.engine.cache.MemoryCache
    @androidx.annotation.Nullable
    public /* bridge */ /* synthetic */ com.bumptech.glide.load.engine.Resource remove(@androidx.annotation.NonNull com.bumptech.glide.load.Key r1) {
            r0 = this;
            java.lang.Object r1 = super.remove(r1)
            com.bumptech.glide.load.engine.Resource r1 = (com.bumptech.glide.load.engine.Resource) r1
            return r1
    }

    @Override // com.bumptech.glide.load.engine.cache.MemoryCache
    public void setResourceRemovedListener(@androidx.annotation.NonNull com.bumptech.glide.load.engine.cache.MemoryCache.ResourceRemovedListener r1) {
            r0 = this;
            r0.listener = r1
            return
    }

    @Override // com.bumptech.glide.load.engine.cache.MemoryCache
    @android.annotation.SuppressLint({"InlinedApi"})
    public void trimMemory(int r5) {
            r4 = this;
            r0 = 40
            if (r5 < r0) goto L8
            r4.clearMemory()
            goto L1a
        L8:
            r0 = 20
            if (r5 >= r0) goto L10
            r0 = 15
            if (r5 != r0) goto L1a
        L10:
            long r0 = r4.getMaxSize()
            r2 = 2
            long r0 = r0 / r2
            r4.trimToSize(r0)
        L1a:
            return
    }
}
