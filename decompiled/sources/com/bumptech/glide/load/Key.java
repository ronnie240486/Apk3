package com.bumptech.glide.load;

/* JADX INFO: loaded from: classes.dex */
public interface Key {
    public static final java.nio.charset.Charset CHARSET = null;
    public static final java.lang.String STRING_CHARSET_NAME = "UTF-8";

    static {
            java.lang.String r0 = "UTF-8"
            java.nio.charset.Charset r0 = java.nio.charset.Charset.forName(r0)
            com.bumptech.glide.load.Key.CHARSET = r0
            return
    }

    boolean equals(java.lang.Object r1);

    int hashCode();

    void updateDiskCacheKey(@androidx.annotation.NonNull java.security.MessageDigest r1);
}
