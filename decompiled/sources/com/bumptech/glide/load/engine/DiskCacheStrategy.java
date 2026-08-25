package com.bumptech.glide.load.engine;

/* JADX INFO: loaded from: classes.dex */
public abstract class DiskCacheStrategy {
    public static final com.bumptech.glide.load.engine.DiskCacheStrategy ALL = null;
    public static final com.bumptech.glide.load.engine.DiskCacheStrategy AUTOMATIC = null;
    public static final com.bumptech.glide.load.engine.DiskCacheStrategy DATA = null;
    public static final com.bumptech.glide.load.engine.DiskCacheStrategy NONE = null;
    public static final com.bumptech.glide.load.engine.DiskCacheStrategy RESOURCE = null;






    static {
            com.bumptech.glide.load.engine.DiskCacheStrategy$1 r0 = new com.bumptech.glide.load.engine.DiskCacheStrategy$1
            r0.<init>()
            com.bumptech.glide.load.engine.DiskCacheStrategy.ALL = r0
            com.bumptech.glide.load.engine.DiskCacheStrategy$2 r0 = new com.bumptech.glide.load.engine.DiskCacheStrategy$2
            r0.<init>()
            com.bumptech.glide.load.engine.DiskCacheStrategy.NONE = r0
            com.bumptech.glide.load.engine.DiskCacheStrategy$3 r0 = new com.bumptech.glide.load.engine.DiskCacheStrategy$3
            r0.<init>()
            com.bumptech.glide.load.engine.DiskCacheStrategy.DATA = r0
            com.bumptech.glide.load.engine.DiskCacheStrategy$4 r0 = new com.bumptech.glide.load.engine.DiskCacheStrategy$4
            r0.<init>()
            com.bumptech.glide.load.engine.DiskCacheStrategy.RESOURCE = r0
            com.bumptech.glide.load.engine.DiskCacheStrategy$5 r0 = new com.bumptech.glide.load.engine.DiskCacheStrategy$5
            r0.<init>()
            com.bumptech.glide.load.engine.DiskCacheStrategy.AUTOMATIC = r0
            return
    }

    public DiskCacheStrategy() {
            r0 = this;
            r0.<init>()
            return
    }

    public abstract boolean decodeCachedData();

    public abstract boolean decodeCachedResource();

    public abstract boolean isDataCacheable(com.bumptech.glide.load.DataSource r1);

    public abstract boolean isResourceCacheable(boolean r1, com.bumptech.glide.load.DataSource r2, com.bumptech.glide.load.EncodeStrategy r3);
}
