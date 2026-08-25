package com.bumptech.glide.load.resource.bitmap;

/* JADX INFO: loaded from: classes.dex */
public class BitmapEncoder implements com.bumptech.glide.load.ResourceEncoder<android.graphics.Bitmap> {
    public static final com.bumptech.glide.load.Option<android.graphics.Bitmap.CompressFormat> COMPRESSION_FORMAT = null;
    public static final com.bumptech.glide.load.Option<java.lang.Integer> COMPRESSION_QUALITY = null;
    private static final java.lang.String TAG = "BitmapEncoder";

    @androidx.annotation.Nullable
    private final com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool arrayPool;

    static {
            r0 = 90
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = "com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionQuality"
            com.bumptech.glide.load.Option r0 = com.bumptech.glide.load.Option.memory(r1, r0)
            com.bumptech.glide.load.resource.bitmap.BitmapEncoder.COMPRESSION_QUALITY = r0
            java.lang.String r0 = "com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionFormat"
            com.bumptech.glide.load.Option r0 = com.bumptech.glide.load.Option.memory(r0)
            com.bumptech.glide.load.resource.bitmap.BitmapEncoder.COMPRESSION_FORMAT = r0
            return
    }

    @java.lang.Deprecated
    public BitmapEncoder() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.arrayPool = r0
            return
    }

    public BitmapEncoder(@androidx.annotation.NonNull com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool r1) {
            r0 = this;
            r0.<init>()
            r0.arrayPool = r1
            return
    }

    private android.graphics.Bitmap.CompressFormat getFormat(android.graphics.Bitmap r2, com.bumptech.glide.load.Options r3) {
            r1 = this;
            com.bumptech.glide.load.Option<android.graphics.Bitmap$CompressFormat> r0 = com.bumptech.glide.load.resource.bitmap.BitmapEncoder.COMPRESSION_FORMAT
            java.lang.Object r3 = r3.get(r0)
            android.graphics.Bitmap$CompressFormat r3 = (android.graphics.Bitmap.CompressFormat) r3
            if (r3 == 0) goto Lb
            return r3
        Lb:
            boolean r2 = r2.hasAlpha()
            if (r2 == 0) goto L14
            android.graphics.Bitmap$CompressFormat r2 = android.graphics.Bitmap.CompressFormat.PNG
            return r2
        L14:
            android.graphics.Bitmap$CompressFormat r2 = android.graphics.Bitmap.CompressFormat.JPEG
            return r2
    }

    public boolean encode(@androidx.annotation.NonNull com.bumptech.glide.load.engine.Resource<android.graphics.Bitmap> r9, @androidx.annotation.NonNull java.io.File r10, @androidx.annotation.NonNull com.bumptech.glide.load.Options r11) {
            r8 = this;
            java.lang.String r0 = "BitmapEncoder"
            java.lang.Object r9 = r9.get()
            android.graphics.Bitmap r9 = (android.graphics.Bitmap) r9
            android.graphics.Bitmap$CompressFormat r1 = r8.getFormat(r9, r11)
            int r2 = r9.getWidth()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            int r3 = r9.getHeight()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.String r4 = "encode: [%dx%d] %s"
            com.bumptech.glide.util.pool.GlideTrace.beginSectionFormat(r4, r2, r3, r1)
            long r2 = com.bumptech.glide.util.LogTime.getLogTime()     // Catch: java.lang.Throwable -> Lc0
            com.bumptech.glide.load.Option<java.lang.Integer> r4 = com.bumptech.glide.load.resource.bitmap.BitmapEncoder.COMPRESSION_QUALITY     // Catch: java.lang.Throwable -> Lc0
            java.lang.Object r4 = r11.get(r4)     // Catch: java.lang.Throwable -> Lc0
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch: java.lang.Throwable -> Lc0
            int r4 = r4.intValue()     // Catch: java.lang.Throwable -> Lc0
            r5 = 0
            r6 = 0
            java.io.FileOutputStream r7 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L57 java.io.IOException -> L59
            r7.<init>(r10)     // Catch: java.lang.Throwable -> L57 java.io.IOException -> L59
            com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool r10 = r8.arrayPool     // Catch: java.lang.Throwable -> L51 java.io.IOException -> L54
            if (r10 == 0) goto L45
            com.bumptech.glide.load.data.BufferedOutputStream r10 = new com.bumptech.glide.load.data.BufferedOutputStream     // Catch: java.lang.Throwable -> L51 java.io.IOException -> L54
            com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool r6 = r8.arrayPool     // Catch: java.lang.Throwable -> L51 java.io.IOException -> L54
            r10.<init>(r7, r6)     // Catch: java.lang.Throwable -> L51 java.io.IOException -> L54
            r6 = r10
            goto L46
        L45:
            r6 = r7
        L46:
            r9.compress(r1, r4, r6)     // Catch: java.lang.Throwable -> L57 java.io.IOException -> L59
            r6.close()     // Catch: java.lang.Throwable -> L57 java.io.IOException -> L59
            r5 = 1
        L4d:
            r6.close()     // Catch: java.io.IOException -> L69 java.lang.Throwable -> Lc0
            goto L69
        L51:
            r9 = move-exception
            r6 = r7
            goto Lba
        L54:
            r10 = move-exception
            r6 = r7
            goto L5a
        L57:
            r9 = move-exception
            goto Lba
        L59:
            r10 = move-exception
        L5a:
            r4 = 3
            boolean r4 = android.util.Log.isLoggable(r0, r4)     // Catch: java.lang.Throwable -> L57
            if (r4 == 0) goto L66
            java.lang.String r4 = "Failed to encode Bitmap"
            android.util.Log.d(r0, r4, r10)     // Catch: java.lang.Throwable -> L57
        L66:
            if (r6 == 0) goto L69
            goto L4d
        L69:
            r10 = 2
            boolean r10 = android.util.Log.isLoggable(r0, r10)     // Catch: java.lang.Throwable -> Lc0
            if (r10 == 0) goto Lb6
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lc0
            r10.<init>()     // Catch: java.lang.Throwable -> Lc0
            java.lang.String r4 = "Compressed with type: "
            r10.append(r4)     // Catch: java.lang.Throwable -> Lc0
            r10.append(r1)     // Catch: java.lang.Throwable -> Lc0
            java.lang.String r1 = " of size "
            r10.append(r1)     // Catch: java.lang.Throwable -> Lc0
            int r1 = com.bumptech.glide.util.Util.getBitmapByteSize(r9)     // Catch: java.lang.Throwable -> Lc0
            r10.append(r1)     // Catch: java.lang.Throwable -> Lc0
            java.lang.String r1 = " in "
            r10.append(r1)     // Catch: java.lang.Throwable -> Lc0
            double r1 = com.bumptech.glide.util.LogTime.getElapsedMillis(r2)     // Catch: java.lang.Throwable -> Lc0
            r10.append(r1)     // Catch: java.lang.Throwable -> Lc0
            java.lang.String r1 = ", options format: "
            r10.append(r1)     // Catch: java.lang.Throwable -> Lc0
            com.bumptech.glide.load.Option<android.graphics.Bitmap$CompressFormat> r1 = com.bumptech.glide.load.resource.bitmap.BitmapEncoder.COMPRESSION_FORMAT     // Catch: java.lang.Throwable -> Lc0
            java.lang.Object r11 = r11.get(r1)     // Catch: java.lang.Throwable -> Lc0
            r10.append(r11)     // Catch: java.lang.Throwable -> Lc0
            java.lang.String r11 = ", hasAlpha: "
            r10.append(r11)     // Catch: java.lang.Throwable -> Lc0
            boolean r9 = r9.hasAlpha()     // Catch: java.lang.Throwable -> Lc0
            r10.append(r9)     // Catch: java.lang.Throwable -> Lc0
            java.lang.String r9 = r10.toString()     // Catch: java.lang.Throwable -> Lc0
            android.util.Log.v(r0, r9)     // Catch: java.lang.Throwable -> Lc0
        Lb6:
            com.bumptech.glide.util.pool.GlideTrace.endSection()
            return r5
        Lba:
            if (r6 == 0) goto Lbf
            r6.close()     // Catch: java.io.IOException -> Lbf java.lang.Throwable -> Lc0
        Lbf:
            throw r9     // Catch: java.lang.Throwable -> Lc0
        Lc0:
            r9 = move-exception
            com.bumptech.glide.util.pool.GlideTrace.endSection()
            throw r9
    }

    @Override // com.bumptech.glide.load.Encoder
    public /* bridge */ /* synthetic */ boolean encode(@androidx.annotation.NonNull java.lang.Object r1, @androidx.annotation.NonNull java.io.File r2, @androidx.annotation.NonNull com.bumptech.glide.load.Options r3) {
            r0 = this;
            com.bumptech.glide.load.engine.Resource r1 = (com.bumptech.glide.load.engine.Resource) r1
            boolean r1 = r0.encode(r1, r2, r3)
            return r1
    }

    @Override // com.bumptech.glide.load.ResourceEncoder
    @androidx.annotation.NonNull
    public com.bumptech.glide.load.EncodeStrategy getEncodeStrategy(@androidx.annotation.NonNull com.bumptech.glide.load.Options r1) {
            r0 = this;
            com.bumptech.glide.load.EncodeStrategy r1 = com.bumptech.glide.load.EncodeStrategy.TRANSFORMED
            return r1
    }
}
