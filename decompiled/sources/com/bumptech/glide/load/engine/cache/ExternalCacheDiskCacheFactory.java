package com.bumptech.glide.load.engine.cache;

/* JADX INFO: loaded from: classes.dex */
@java.lang.Deprecated
public final class ExternalCacheDiskCacheFactory extends com.bumptech.glide.load.engine.cache.DiskLruCacheFactory {


    public ExternalCacheDiskCacheFactory(android.content.Context r3) {
            r2 = this;
            java.lang.String r0 = "image_manager_disk_cache"
            r1 = 262144000(0xfa00000, float:1.5777218E-29)
            r2.<init>(r3, r0, r1)
            return
    }

    public ExternalCacheDiskCacheFactory(android.content.Context r2, int r3) {
            r1 = this;
            java.lang.String r0 = "image_manager_disk_cache"
            r1.<init>(r2, r0, r3)
            return
    }

    public ExternalCacheDiskCacheFactory(android.content.Context r2, java.lang.String r3, int r4) {
            r1 = this;
            com.bumptech.glide.load.engine.cache.ExternalCacheDiskCacheFactory$1 r0 = new com.bumptech.glide.load.engine.cache.ExternalCacheDiskCacheFactory$1
            r0.<init>(r2, r3)
            long r2 = (long) r4
            r1.<init>(r0, r2)
            return
    }
}
