package com.bumptech.glide.load.engine.cache;

/* JADX INFO: loaded from: classes2.dex */
public final class ExternalPreferredCacheDiskCacheFactory extends com.bumptech.glide.load.engine.cache.DiskLruCacheFactory {


    public ExternalPreferredCacheDiskCacheFactory(android.content.Context r4) {
            r3 = this;
            java.lang.String r0 = "image_manager_disk_cache"
            r1 = 262144000(0xfa00000, double:1.295163447E-315)
            r3.<init>(r4, r0, r1)
            return
    }

    public ExternalPreferredCacheDiskCacheFactory(android.content.Context r2, long r3) {
            r1 = this;
            java.lang.String r0 = "image_manager_disk_cache"
            r1.<init>(r2, r0, r3)
            return
    }

    public ExternalPreferredCacheDiskCacheFactory(android.content.Context r2, java.lang.String r3, long r4) {
            r1 = this;
            com.bumptech.glide.load.engine.cache.ExternalPreferredCacheDiskCacheFactory$1 r0 = new com.bumptech.glide.load.engine.cache.ExternalPreferredCacheDiskCacheFactory$1
            r0.<init>(r2, r3)
            r1.<init>(r0, r4)
            return
    }
}
