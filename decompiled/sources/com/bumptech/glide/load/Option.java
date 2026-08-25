package com.bumptech.glide.load;

/* JADX INFO: loaded from: classes.dex */
public final class Option<T> {
    private static final com.bumptech.glide.load.Option.CacheKeyUpdater<java.lang.Object> EMPTY_UPDATER = null;
    private final com.bumptech.glide.load.Option.CacheKeyUpdater<T> cacheKeyUpdater;
    private final T defaultValue;
    private final java.lang.String key;
    private volatile byte[] keyBytes;


    /* JADX INFO: loaded from: classes2.dex */
    public interface CacheKeyUpdater<T> {
        void update(@androidx.annotation.NonNull byte[] r1, @androidx.annotation.NonNull T r2, @androidx.annotation.NonNull java.security.MessageDigest r3);
    }

    static {
            com.bumptech.glide.load.Option$1 r0 = new com.bumptech.glide.load.Option$1
            r0.<init>()
            com.bumptech.glide.load.Option.EMPTY_UPDATER = r0
            return
    }

    private Option(@androidx.annotation.NonNull java.lang.String r1, @androidx.annotation.Nullable T r2, @androidx.annotation.NonNull com.bumptech.glide.load.Option.CacheKeyUpdater<T> r3) {
            r0 = this;
            r0.<init>()
            java.lang.String r1 = com.bumptech.glide.util.Preconditions.checkNotEmpty(r1)
            r0.key = r1
            r0.defaultValue = r2
            java.lang.Object r1 = com.bumptech.glide.util.Preconditions.checkNotNull(r3)
            com.bumptech.glide.load.Option$CacheKeyUpdater r1 = (com.bumptech.glide.load.Option.CacheKeyUpdater) r1
            r0.cacheKeyUpdater = r1
            return
    }

    @androidx.annotation.NonNull
    public static <T> com.bumptech.glide.load.Option<T> disk(@androidx.annotation.NonNull java.lang.String r2, @androidx.annotation.NonNull com.bumptech.glide.load.Option.CacheKeyUpdater<T> r3) {
            com.bumptech.glide.load.Option r0 = new com.bumptech.glide.load.Option
            r1 = 0
            r0.<init>(r2, r1, r3)
            return r0
    }

    @androidx.annotation.NonNull
    public static <T> com.bumptech.glide.load.Option<T> disk(@androidx.annotation.NonNull java.lang.String r1, @androidx.annotation.Nullable T r2, @androidx.annotation.NonNull com.bumptech.glide.load.Option.CacheKeyUpdater<T> r3) {
            com.bumptech.glide.load.Option r0 = new com.bumptech.glide.load.Option
            r0.<init>(r1, r2, r3)
            return r0
    }

    @androidx.annotation.NonNull
    private static <T> com.bumptech.glide.load.Option.CacheKeyUpdater<T> emptyUpdater() {
            com.bumptech.glide.load.Option$CacheKeyUpdater<java.lang.Object> r0 = com.bumptech.glide.load.Option.EMPTY_UPDATER
            return r0
    }

    @androidx.annotation.NonNull
    private byte[] getKeyBytes() {
            r2 = this;
            byte[] r0 = r2.keyBytes
            if (r0 != 0) goto Le
            java.lang.String r0 = r2.key
            java.nio.charset.Charset r1 = com.bumptech.glide.load.Key.CHARSET
            byte[] r0 = r0.getBytes(r1)
            r2.keyBytes = r0
        Le:
            byte[] r0 = r2.keyBytes
            return r0
    }

    @androidx.annotation.NonNull
    public static <T> com.bumptech.glide.load.Option<T> memory(@androidx.annotation.NonNull java.lang.String r3) {
            com.bumptech.glide.load.Option r0 = new com.bumptech.glide.load.Option
            com.bumptech.glide.load.Option$CacheKeyUpdater r1 = emptyUpdater()
            r2 = 0
            r0.<init>(r3, r2, r1)
            return r0
    }

    @androidx.annotation.NonNull
    public static <T> com.bumptech.glide.load.Option<T> memory(@androidx.annotation.NonNull java.lang.String r2, @androidx.annotation.NonNull T r3) {
            com.bumptech.glide.load.Option r0 = new com.bumptech.glide.load.Option
            com.bumptech.glide.load.Option$CacheKeyUpdater r1 = emptyUpdater()
            r0.<init>(r2, r3, r1)
            return r0
    }

    public boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof com.bumptech.glide.load.Option
            if (r0 == 0) goto Lf
            com.bumptech.glide.load.Option r2 = (com.bumptech.glide.load.Option) r2
            java.lang.String r0 = r1.key
            java.lang.String r2 = r2.key
            boolean r2 = r0.equals(r2)
            return r2
        Lf:
            r2 = 0
            return r2
    }

    @androidx.annotation.Nullable
    public T getDefaultValue() {
            r1 = this;
            T r0 = r1.defaultValue
            return r0
    }

    public int hashCode() {
            r1 = this;
            java.lang.String r0 = r1.key
            int r0 = r0.hashCode()
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.String r0 = "Option{key='"
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            java.lang.String r1 = r2.key
            r0.append(r1)
            r1 = 39
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public void update(@androidx.annotation.NonNull T r3, @androidx.annotation.NonNull java.security.MessageDigest r4) {
            r2 = this;
            com.bumptech.glide.load.Option$CacheKeyUpdater<T> r0 = r2.cacheKeyUpdater
            byte[] r1 = r2.getKeyBytes()
            r0.update(r1, r3, r4)
            return
    }
}
