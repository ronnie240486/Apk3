package com.bumptech.glide.load.engine.cache;

/* JADX INFO: loaded from: classes2.dex */
public class DiskCacheAdapter implements com.bumptech.glide.load.engine.cache.DiskCache {

    /* JADX INFO: loaded from: classes.dex */
    public static final class Factory implements com.bumptech.glide.load.engine.cache.DiskCache.Factory {
        public Factory() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.bumptech.glide.load.engine.cache.DiskCache.Factory
        public com.bumptech.glide.load.engine.cache.DiskCache build() {
                r1 = this;
                com.bumptech.glide.load.engine.cache.DiskCacheAdapter r0 = new com.bumptech.glide.load.engine.cache.DiskCacheAdapter
                r0.<init>()
                return r0
        }
    }

    public DiskCacheAdapter() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.bumptech.glide.load.engine.cache.DiskCache
    public void clear() {
            r0 = this;
            return
    }

    @Override // com.bumptech.glide.load.engine.cache.DiskCache
    public void delete(com.bumptech.glide.load.Key r1) {
            r0 = this;
            return
    }

    @Override // com.bumptech.glide.load.engine.cache.DiskCache
    public java.io.File get(com.bumptech.glide.load.Key r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // com.bumptech.glide.load.engine.cache.DiskCache
    public void put(com.bumptech.glide.load.Key r1, com.bumptech.glide.load.engine.cache.DiskCache.Writer r2) {
            r0 = this;
            return
    }
}
