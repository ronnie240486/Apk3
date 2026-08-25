package com.bumptech.glide.load.resource.bitmap;

/* JADX INFO: loaded from: classes2.dex */
public class DrawableTransformation implements com.bumptech.glide.load.Transformation<android.graphics.drawable.Drawable> {
    private final boolean isRequired;
    private final com.bumptech.glide.load.Transformation<android.graphics.Bitmap> wrapped;

    public DrawableTransformation(com.bumptech.glide.load.Transformation<android.graphics.Bitmap> r1, boolean r2) {
            r0 = this;
            r0.<init>()
            r0.wrapped = r1
            r0.isRequired = r2
            return
    }

    private com.bumptech.glide.load.engine.Resource<android.graphics.drawable.Drawable> newDrawableResource(android.content.Context r1, com.bumptech.glide.load.engine.Resource<android.graphics.Bitmap> r2) {
            r0 = this;
            android.content.res.Resources r1 = r1.getResources()
            com.bumptech.glide.load.engine.Resource r1 = com.bumptech.glide.load.resource.bitmap.LazyBitmapDrawableResource.obtain(r1, r2)
            return r1
    }

    public com.bumptech.glide.load.Transformation<android.graphics.drawable.BitmapDrawable> asBitmapDrawable() {
            r0 = this;
            return r0
    }

    @Override // com.bumptech.glide.load.Key
    public boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof com.bumptech.glide.load.resource.bitmap.DrawableTransformation
            if (r0 == 0) goto Lf
            com.bumptech.glide.load.resource.bitmap.DrawableTransformation r2 = (com.bumptech.glide.load.resource.bitmap.DrawableTransformation) r2
            com.bumptech.glide.load.Transformation<android.graphics.Bitmap> r0 = r1.wrapped
            com.bumptech.glide.load.Transformation<android.graphics.Bitmap> r2 = r2.wrapped
            boolean r2 = r0.equals(r2)
            return r2
        Lf:
            r2 = 0
            return r2
    }

    @Override // com.bumptech.glide.load.Key
    public int hashCode() {
            r1 = this;
            com.bumptech.glide.load.Transformation<android.graphics.Bitmap> r0 = r1.wrapped
            int r0 = r0.hashCode()
            return r0
    }

    @Override // com.bumptech.glide.load.Transformation
    @androidx.annotation.NonNull
    public com.bumptech.glide.load.engine.Resource<android.graphics.drawable.Drawable> transform(@androidx.annotation.NonNull android.content.Context r3, @androidx.annotation.NonNull com.bumptech.glide.load.engine.Resource<android.graphics.drawable.Drawable> r4, int r5, int r6) {
            r2 = this;
            com.bumptech.glide.Glide r0 = com.bumptech.glide.Glide.get(r3)
            com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool r0 = r0.getBitmapPool()
            java.lang.Object r1 = r4.get()
            android.graphics.drawable.Drawable r1 = (android.graphics.drawable.Drawable) r1
            com.bumptech.glide.load.engine.Resource r0 = com.bumptech.glide.load.resource.bitmap.DrawableToBitmapConverter.convert(r0, r1, r5, r6)
            if (r0 != 0) goto L35
            boolean r3 = r2.isRequired
            if (r3 != 0) goto L19
            return r4
        L19:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Unable to convert "
            r4.append(r5)
            r4.append(r1)
            java.lang.String r5 = " to a Bitmap"
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
        L35:
            com.bumptech.glide.load.Transformation<android.graphics.Bitmap> r1 = r2.wrapped
            com.bumptech.glide.load.engine.Resource r5 = r1.transform(r3, r0, r5, r6)
            boolean r6 = r5.equals(r0)
            if (r6 == 0) goto L45
            r5.recycle()
            return r4
        L45:
            com.bumptech.glide.load.engine.Resource r3 = r2.newDrawableResource(r3, r5)
            return r3
    }

    @Override // com.bumptech.glide.load.Key
    public void updateDiskCacheKey(@androidx.annotation.NonNull java.security.MessageDigest r2) {
            r1 = this;
            com.bumptech.glide.load.Transformation<android.graphics.Bitmap> r0 = r1.wrapped
            r0.updateDiskCacheKey(r2)
            return
    }
}
