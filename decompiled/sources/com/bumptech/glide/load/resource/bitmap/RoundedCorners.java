package com.bumptech.glide.load.resource.bitmap;

/* JADX INFO: loaded from: classes2.dex */
public final class RoundedCorners extends com.bumptech.glide.load.resource.bitmap.BitmapTransformation {
    private static final java.lang.String ID = "com.bumptech.glide.load.resource.bitmap.RoundedCorners";
    private static final byte[] ID_BYTES = null;
    private final int roundingRadius;

    static {
            java.nio.charset.Charset r0 = com.bumptech.glide.load.Key.CHARSET
            java.lang.String r1 = "com.bumptech.glide.load.resource.bitmap.RoundedCorners"
            byte[] r0 = r1.getBytes(r0)
            com.bumptech.glide.load.resource.bitmap.RoundedCorners.ID_BYTES = r0
            return
    }

    public RoundedCorners(int r3) {
            r2 = this;
            r2.<init>()
            if (r3 <= 0) goto L7
            r0 = 1
            goto L8
        L7:
            r0 = 0
        L8:
            java.lang.String r1 = "roundingRadius must be greater than 0."
            com.bumptech.glide.util.Preconditions.checkArgument(r0, r1)
            r2.roundingRadius = r3
            return
    }

    @Override // com.bumptech.glide.load.Key
    public boolean equals(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof com.bumptech.glide.load.resource.bitmap.RoundedCorners
            r1 = 0
            if (r0 == 0) goto Le
            com.bumptech.glide.load.resource.bitmap.RoundedCorners r3 = (com.bumptech.glide.load.resource.bitmap.RoundedCorners) r3
            int r0 = r2.roundingRadius
            int r3 = r3.roundingRadius
            if (r0 != r3) goto Le
            r1 = 1
        Le:
            return r1
    }

    @Override // com.bumptech.glide.load.Key
    public int hashCode() {
            r2 = this;
            int r0 = r2.roundingRadius
            int r0 = com.bumptech.glide.util.Util.hashCode(r0)
            r1 = -569625254(0xffffffffde0c355a, float:-2.52577E18)
            int r0 = com.bumptech.glide.util.Util.hashCode(r1, r0)
            return r0
    }

    @Override // com.bumptech.glide.load.resource.bitmap.BitmapTransformation
    public final android.graphics.Bitmap transform(@androidx.annotation.NonNull com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool r1, @androidx.annotation.NonNull android.graphics.Bitmap r2, int r3, int r4) {
            r0 = this;
            int r3 = r0.roundingRadius
            android.graphics.Bitmap r1 = com.bumptech.glide.load.resource.bitmap.TransformationUtils.roundedCorners(r1, r2, r3)
            return r1
    }

    @Override // com.bumptech.glide.load.Key
    public void updateDiskCacheKey(@androidx.annotation.NonNull java.security.MessageDigest r3) {
            r2 = this;
            byte[] r0 = com.bumptech.glide.load.resource.bitmap.RoundedCorners.ID_BYTES
            r3.update(r0)
            r0 = 4
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r0)
            int r1 = r2.roundingRadius
            java.nio.ByteBuffer r0 = r0.putInt(r1)
            byte[] r0 = r0.array()
            r3.update(r0)
            return
    }
}
