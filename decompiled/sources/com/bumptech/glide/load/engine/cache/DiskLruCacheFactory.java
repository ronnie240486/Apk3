package com.bumptech.glide.load.engine.cache;

/* JADX INFO: loaded from: classes2.dex */
public class DiskLruCacheFactory implements com.bumptech.glide.load.engine.cache.DiskCache.Factory {
    private final com.bumptech.glide.load.engine.cache.DiskLruCacheFactory.CacheDirectoryGetter cacheDirectoryGetter;
    private final long diskCacheSize;



    /* JADX INFO: loaded from: classes.dex */
    public interface CacheDirectoryGetter {
        java.io.File getCacheDirectory();
    }

    public DiskLruCacheFactory(com.bumptech.glide.load.engine.cache.DiskLruCacheFactory.CacheDirectoryGetter r1, long r2) {
            r0 = this;
            r0.<init>()
            r0.diskCacheSize = r2
            r0.cacheDirectoryGetter = r1
            return
    }

    public DiskLruCacheFactory(java.lang.String r2, long r3) {
            r1 = this;
            com.bumptech.glide.load.engine.cache.DiskLruCacheFactory$1 r0 = new com.bumptech.glide.load.engine.cache.DiskLruCacheFactory$1
            r0.<init>(r2)
            r1.<init>(r0, r3)
            return
    }

    public DiskLruCacheFactory(java.lang.String r2, java.lang.String r3, long r4) {
            r1 = this;
            com.bumptech.glide.load.engine.cache.DiskLruCacheFactory$2 r0 = new com.bumptech.glide.load.engine.cache.DiskLruCacheFactory$2
            r0.<init>(r2, r3)
            r1.<init>(r0, r4)
            return
    }

    @Override // com.bumptech.glide.load.engine.cache.DiskCache.Factory
    public com.bumptech.glide.load.engine.cache.DiskCache build() {
            r3 = this;
            com.bumptech.glide.load.engine.cache.DiskLruCacheFactory$CacheDirectoryGetter r0 = r3.cacheDirectoryGetter
            java.io.File r0 = r0.getCacheDirectory()
            r1 = 0
            if (r0 != 0) goto La
            return r1
        La:
            boolean r2 = r0.isDirectory()
            if (r2 != 0) goto L18
            boolean r2 = r0.mkdirs()
            if (r2 == 0) goto L17
            goto L18
        L17:
            return r1
        L18:
            long r1 = r3.diskCacheSize
            com.bumptech.glide.load.engine.cache.DiskCache r0 = com.bumptech.glide.load.engine.cache.DiskLruCacheWrapper.create(r0, r1)
            return r0
    }
}
