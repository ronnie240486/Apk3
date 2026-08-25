package com.bumptech.glide.load.engine.cache;

/* JADX INFO: loaded from: classes3.dex */
public interface DiskCache {

    /* JADX INFO: loaded from: classes2.dex */
    public interface Factory {
        public static final java.lang.String DEFAULT_DISK_CACHE_DIR = "image_manager_disk_cache";
        public static final int DEFAULT_DISK_CACHE_SIZE = 262144000;

        @androidx.annotation.Nullable
        com.bumptech.glide.load.engine.cache.DiskCache build();
    }

    /* JADX INFO: loaded from: classes.dex */
    public interface Writer {
        boolean write(@androidx.annotation.NonNull java.io.File r1);
    }

    void clear();

    void delete(com.bumptech.glide.load.Key r1);

    @androidx.annotation.Nullable
    java.io.File get(com.bumptech.glide.load.Key r1);

    void put(com.bumptech.glide.load.Key r1, com.bumptech.glide.load.engine.cache.DiskCache.Writer r2);
}
