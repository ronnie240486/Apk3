package com.bumptech.glide.load.model;

/* JADX INFO: loaded from: classes.dex */
public class ByteBufferEncoder implements com.bumptech.glide.load.Encoder<java.nio.ByteBuffer> {
    private static final java.lang.String TAG = "ByteBufferEncoder";

    public ByteBufferEncoder() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.bumptech.glide.load.Encoder
    public /* bridge */ /* synthetic */ boolean encode(@androidx.annotation.NonNull java.nio.ByteBuffer r1, @androidx.annotation.NonNull java.io.File r2, @androidx.annotation.NonNull com.bumptech.glide.load.Options r3) {
            r0 = this;
            java.nio.ByteBuffer r1 = (java.nio.ByteBuffer) r1
            boolean r1 = r0.encode2(r1, r2, r3)
            return r1
    }

    /* JADX INFO: renamed from: encode, reason: avoid collision after fix types in other method */
    public boolean encode2(@androidx.annotation.NonNull java.nio.ByteBuffer r1, @androidx.annotation.NonNull java.io.File r2, @androidx.annotation.NonNull com.bumptech.glide.load.Options r3) {
            r0 = this;
            com.bumptech.glide.util.ByteBufferUtil.toFile(r1, r2)     // Catch: java.io.IOException -> L5
            r1 = 1
            goto L15
        L5:
            r1 = move-exception
            r2 = 3
            java.lang.String r3 = "ByteBufferEncoder"
            boolean r2 = android.util.Log.isLoggable(r3, r2)
            if (r2 == 0) goto L14
            java.lang.String r2 = "Failed to write data"
            android.util.Log.d(r3, r2, r1)
        L14:
            r1 = 0
        L15:
            return r1
    }
}
