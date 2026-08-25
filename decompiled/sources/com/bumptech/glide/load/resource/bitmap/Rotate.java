package com.bumptech.glide.load.resource.bitmap;

/* JADX INFO: loaded from: classes.dex */
public class Rotate extends com.bumptech.glide.load.resource.bitmap.BitmapTransformation {
    private static final java.lang.String ID = "com.bumptech.glide.load.resource.bitmap.Rotate";
    private static final byte[] ID_BYTES = null;
    private final int degreesToRotate;

    static {
            java.nio.charset.Charset r0 = com.bumptech.glide.load.Key.CHARSET
            java.lang.String r1 = "com.bumptech.glide.load.resource.bitmap.Rotate"
            byte[] r0 = r1.getBytes(r0)
            com.bumptech.glide.load.resource.bitmap.Rotate.ID_BYTES = r0
            return
    }

    public Rotate(int r1) {
            r0 = this;
            r0.<init>()
            r0.degreesToRotate = r1
            return
    }

    @Override // com.bumptech.glide.load.Key
    public boolean equals(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof com.bumptech.glide.load.resource.bitmap.Rotate
            r1 = 0
            if (r0 == 0) goto Le
            com.bumptech.glide.load.resource.bitmap.Rotate r3 = (com.bumptech.glide.load.resource.bitmap.Rotate) r3
            int r0 = r2.degreesToRotate
            int r3 = r3.degreesToRotate
            if (r0 != r3) goto Le
            r1 = 1
        Le:
            return r1
    }

    @Override // com.bumptech.glide.load.Key
    public int hashCode() {
            r2 = this;
            int r0 = r2.degreesToRotate
            int r0 = com.bumptech.glide.util.Util.hashCode(r0)
            r1 = -950519196(0xffffffffc7583a64, float:-55354.39)
            int r0 = com.bumptech.glide.util.Util.hashCode(r1, r0)
            return r0
    }

    @Override // com.bumptech.glide.load.resource.bitmap.BitmapTransformation
    public final android.graphics.Bitmap transform(@androidx.annotation.NonNull com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool r1, @androidx.annotation.NonNull android.graphics.Bitmap r2, int r3, int r4) {
            r0 = this;
            int r1 = r0.degreesToRotate
            android.graphics.Bitmap r1 = com.bumptech.glide.load.resource.bitmap.TransformationUtils.rotateImage(r2, r1)
            return r1
    }

    @Override // com.bumptech.glide.load.Key
    public void updateDiskCacheKey(@androidx.annotation.NonNull java.security.MessageDigest r3) {
            r2 = this;
            byte[] r0 = com.bumptech.glide.load.resource.bitmap.Rotate.ID_BYTES
            r3.update(r0)
            r0 = 4
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r0)
            int r1 = r2.degreesToRotate
            java.nio.ByteBuffer r0 = r0.putInt(r1)
            byte[] r0 = r0.array()
            r3.update(r0)
            return
    }
}
