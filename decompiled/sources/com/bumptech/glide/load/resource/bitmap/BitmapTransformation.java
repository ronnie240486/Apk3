package com.bumptech.glide.load.resource.bitmap;

/* JADX INFO: loaded from: classes2.dex */
public abstract class BitmapTransformation implements com.bumptech.glide.load.Transformation<android.graphics.Bitmap> {
    public BitmapTransformation() {
            r0 = this;
            r0.<init>()
            return
    }

    public abstract android.graphics.Bitmap transform(@androidx.annotation.NonNull com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool r1, @androidx.annotation.NonNull android.graphics.Bitmap r2, int r3, int r4);

    @Override // com.bumptech.glide.load.Transformation
    @androidx.annotation.NonNull
    public final com.bumptech.glide.load.engine.Resource<android.graphics.Bitmap> transform(@androidx.annotation.NonNull android.content.Context r3, @androidx.annotation.NonNull com.bumptech.glide.load.engine.Resource<android.graphics.Bitmap> r4, int r5, int r6) {
            r2 = this;
            boolean r0 = com.bumptech.glide.util.Util.isValidDimensions(r5, r6)
            if (r0 == 0) goto L32
            com.bumptech.glide.Glide r3 = com.bumptech.glide.Glide.get(r3)
            com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool r3 = r3.getBitmapPool()
            java.lang.Object r0 = r4.get()
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r5 != r1) goto L1c
            int r5 = r0.getWidth()
        L1c:
            if (r6 != r1) goto L22
            int r6 = r0.getHeight()
        L22:
            android.graphics.Bitmap r5 = r2.transform(r3, r0, r5, r6)
            boolean r6 = r0.equals(r5)
            if (r6 == 0) goto L2d
            goto L31
        L2d:
            com.bumptech.glide.load.resource.bitmap.BitmapResource r4 = com.bumptech.glide.load.resource.bitmap.BitmapResource.obtain(r5, r3)
        L31:
            return r4
        L32:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r0 = "Cannot apply transformation on width: "
            r4.append(r0)
            r4.append(r5)
            java.lang.String r5 = " or height: "
            r4.append(r5)
            r4.append(r6)
            java.lang.String r5 = " less than or equal to zero and not Target.SIZE_ORIGINAL"
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
    }
}
