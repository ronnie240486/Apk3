package com.bumptech.glide.load.resource.bitmap;

/* JADX INFO: loaded from: classes3.dex */
public final class GranularRoundedCorners extends com.bumptech.glide.load.resource.bitmap.BitmapTransformation {
    private static final java.lang.String ID = "com.bumptech.glide.load.resource.bitmap.GranularRoundedCorners";
    private static final byte[] ID_BYTES = null;
    private final float bottomLeft;
    private final float bottomRight;
    private final float topLeft;
    private final float topRight;

    static {
            java.nio.charset.Charset r0 = com.bumptech.glide.load.Key.CHARSET
            java.lang.String r1 = "com.bumptech.glide.load.resource.bitmap.GranularRoundedCorners"
            byte[] r0 = r1.getBytes(r0)
            com.bumptech.glide.load.resource.bitmap.GranularRoundedCorners.ID_BYTES = r0
            return
    }

    public GranularRoundedCorners(float r1, float r2, float r3, float r4) {
            r0 = this;
            r0.<init>()
            r0.topLeft = r1
            r0.topRight = r2
            r0.bottomRight = r3
            r0.bottomLeft = r4
            return
    }

    @Override // com.bumptech.glide.load.Key
    public boolean equals(java.lang.Object r4) {
            r3 = this;
            boolean r0 = r4 instanceof com.bumptech.glide.load.resource.bitmap.GranularRoundedCorners
            r1 = 0
            if (r0 == 0) goto L28
            com.bumptech.glide.load.resource.bitmap.GranularRoundedCorners r4 = (com.bumptech.glide.load.resource.bitmap.GranularRoundedCorners) r4
            float r0 = r3.topLeft
            float r2 = r4.topLeft
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L28
            float r0 = r3.topRight
            float r2 = r4.topRight
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L28
            float r0 = r3.bottomRight
            float r2 = r4.bottomRight
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L28
            float r0 = r3.bottomLeft
            float r4 = r4.bottomLeft
            int r4 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r4 != 0) goto L28
            r1 = 1
        L28:
            return r1
    }

    @Override // com.bumptech.glide.load.Key
    public int hashCode() {
            r2 = this;
            float r0 = r2.topLeft
            int r0 = com.bumptech.glide.util.Util.hashCode(r0)
            r1 = -2013597734(0xffffffff87faefda, float:-3.7756791E-34)
            int r0 = com.bumptech.glide.util.Util.hashCode(r1, r0)
            float r1 = r2.topRight
            int r0 = com.bumptech.glide.util.Util.hashCode(r1, r0)
            float r1 = r2.bottomRight
            int r0 = com.bumptech.glide.util.Util.hashCode(r1, r0)
            float r1 = r2.bottomLeft
            int r0 = com.bumptech.glide.util.Util.hashCode(r1, r0)
            return r0
    }

    @Override // com.bumptech.glide.load.resource.bitmap.BitmapTransformation
    public final android.graphics.Bitmap transform(@androidx.annotation.NonNull com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool r7, @androidx.annotation.NonNull android.graphics.Bitmap r8, int r9, int r10) {
            r6 = this;
            float r2 = r6.topLeft
            float r3 = r6.topRight
            float r4 = r6.bottomRight
            float r5 = r6.bottomLeft
            r0 = r7
            r1 = r8
            android.graphics.Bitmap r7 = com.bumptech.glide.load.resource.bitmap.TransformationUtils.roundedCorners(r0, r1, r2, r3, r4, r5)
            return r7
    }

    @Override // com.bumptech.glide.load.Key
    public void updateDiskCacheKey(@androidx.annotation.NonNull java.security.MessageDigest r3) {
            r2 = this;
            byte[] r0 = com.bumptech.glide.load.resource.bitmap.GranularRoundedCorners.ID_BYTES
            r3.update(r0)
            r0 = 16
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r0)
            float r1 = r2.topLeft
            java.nio.ByteBuffer r0 = r0.putFloat(r1)
            float r1 = r2.topRight
            java.nio.ByteBuffer r0 = r0.putFloat(r1)
            float r1 = r2.bottomRight
            java.nio.ByteBuffer r0 = r0.putFloat(r1)
            float r1 = r2.bottomLeft
            java.nio.ByteBuffer r0 = r0.putFloat(r1)
            byte[] r0 = r0.array()
            r3.update(r0)
            return
    }
}
