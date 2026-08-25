package com.bumptech.glide.load.resource.bitmap;

/* JADX INFO: loaded from: classes.dex */
public class FitCenter extends com.bumptech.glide.load.resource.bitmap.BitmapTransformation {
    private static final java.lang.String ID = "com.bumptech.glide.load.resource.bitmap.FitCenter";
    private static final byte[] ID_BYTES = null;

    static {
            java.nio.charset.Charset r0 = com.bumptech.glide.load.Key.CHARSET
            java.lang.String r1 = "com.bumptech.glide.load.resource.bitmap.FitCenter"
            byte[] r0 = r1.getBytes(r0)
            com.bumptech.glide.load.resource.bitmap.FitCenter.ID_BYTES = r0
            return
    }

    public FitCenter() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.bumptech.glide.load.Key
    public boolean equals(java.lang.Object r1) {
            r0 = this;
            boolean r1 = r1 instanceof com.bumptech.glide.load.resource.bitmap.FitCenter
            return r1
    }

    @Override // com.bumptech.glide.load.Key
    public int hashCode() {
            r1 = this;
            r0 = 1572326941(0x5db7ce1d, float:1.6555694E18)
            return r0
    }

    @Override // com.bumptech.glide.load.resource.bitmap.BitmapTransformation
    public final android.graphics.Bitmap transform(@androidx.annotation.NonNull com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool r1, @androidx.annotation.NonNull android.graphics.Bitmap r2, int r3, int r4) {
            r0 = this;
            android.graphics.Bitmap r1 = com.bumptech.glide.load.resource.bitmap.TransformationUtils.fitCenter(r1, r2, r3, r4)
            return r1
    }

    @Override // com.bumptech.glide.load.Key
    public void updateDiskCacheKey(@androidx.annotation.NonNull java.security.MessageDigest r2) {
            r1 = this;
            byte[] r0 = com.bumptech.glide.load.resource.bitmap.FitCenter.ID_BYTES
            r2.update(r0)
            return
    }
}
