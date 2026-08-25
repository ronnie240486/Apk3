package com.bumptech.glide.load.model;

/* JADX INFO: loaded from: classes3.dex */
public class StreamEncoder implements com.bumptech.glide.load.Encoder<java.io.InputStream> {
    private static final java.lang.String TAG = "StreamEncoder";
    private final com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool byteArrayPool;

    public StreamEncoder(com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool r1) {
            r0 = this;
            r0.<init>()
            r0.byteArrayPool = r1
            return
    }

    /* JADX INFO: renamed from: encode, reason: avoid collision after fix types in other method */
    public boolean encode2(@androidx.annotation.NonNull java.io.InputStream r5, @androidx.annotation.NonNull java.io.File r6, @androidx.annotation.NonNull com.bumptech.glide.load.Options r7) {
            r4 = this;
            java.lang.String r7 = "StreamEncoder"
            com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool r0 = r4.byteArrayPool
            java.lang.Class<byte[]> r1 = byte[].class
            r2 = 65536(0x10000, float:9.1835E-41)
            java.lang.Object r0 = r0.get(r2, r1)
            byte[] r0 = (byte[]) r0
            r1 = 0
            r2 = 0
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L2e java.io.IOException -> L30
            r3.<init>(r6)     // Catch: java.lang.Throwable -> L2e java.io.IOException -> L30
        L15:
            int r6 = r5.read(r0)     // Catch: java.lang.Throwable -> L28 java.io.IOException -> L2b
            r2 = -1
            if (r6 == r2) goto L20
            r3.write(r0, r1, r6)     // Catch: java.lang.Throwable -> L28 java.io.IOException -> L2b
            goto L15
        L20:
            r3.close()     // Catch: java.lang.Throwable -> L28 java.io.IOException -> L2b
            r1 = 1
            r3.close()     // Catch: java.io.IOException -> L42
            goto L42
        L28:
            r5 = move-exception
            r2 = r3
            goto L48
        L2b:
            r5 = move-exception
            r2 = r3
            goto L31
        L2e:
            r5 = move-exception
            goto L48
        L30:
            r5 = move-exception
        L31:
            r6 = 3
            boolean r6 = android.util.Log.isLoggable(r7, r6)     // Catch: java.lang.Throwable -> L2e
            if (r6 == 0) goto L3d
            java.lang.String r6 = "Failed to encode data onto the OutputStream"
            android.util.Log.d(r7, r6, r5)     // Catch: java.lang.Throwable -> L2e
        L3d:
            if (r2 == 0) goto L42
            r2.close()     // Catch: java.io.IOException -> L42
        L42:
            com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool r5 = r4.byteArrayPool
            r5.put(r0)
            return r1
        L48:
            if (r2 == 0) goto L4d
            r2.close()     // Catch: java.io.IOException -> L4d
        L4d:
            com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool r6 = r4.byteArrayPool
            r6.put(r0)
            throw r5
    }

    @Override // com.bumptech.glide.load.Encoder
    public /* bridge */ /* synthetic */ boolean encode(@androidx.annotation.NonNull java.io.InputStream r1, @androidx.annotation.NonNull java.io.File r2, @androidx.annotation.NonNull com.bumptech.glide.load.Options r3) {
            r0 = this;
            java.io.InputStream r1 = (java.io.InputStream) r1
            boolean r1 = r0.encode2(r1, r2, r3)
            return r1
    }
}
