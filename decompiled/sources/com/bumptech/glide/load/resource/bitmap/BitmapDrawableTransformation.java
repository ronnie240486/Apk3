package com.bumptech.glide.load.resource.bitmap;

/* JADX INFO: loaded from: classes3.dex */
@java.lang.Deprecated
public class BitmapDrawableTransformation implements com.bumptech.glide.load.Transformation<android.graphics.drawable.BitmapDrawable> {
    private final com.bumptech.glide.load.Transformation<android.graphics.drawable.Drawable> wrapped;

    public BitmapDrawableTransformation(com.bumptech.glide.load.Transformation<android.graphics.Bitmap> r3) {
            r2 = this;
            r2.<init>()
            com.bumptech.glide.load.resource.bitmap.DrawableTransformation r0 = new com.bumptech.glide.load.resource.bitmap.DrawableTransformation
            r1 = 0
            r0.<init>(r3, r1)
            java.lang.Object r3 = com.bumptech.glide.util.Preconditions.checkNotNull(r0)
            com.bumptech.glide.load.Transformation r3 = (com.bumptech.glide.load.Transformation) r3
            r2.wrapped = r3
            return
    }

    private static com.bumptech.glide.load.engine.Resource<android.graphics.drawable.BitmapDrawable> convertToBitmapDrawableResource(com.bumptech.glide.load.engine.Resource<android.graphics.drawable.Drawable> r2) {
            java.lang.Object r0 = r2.get()
            boolean r0 = r0 instanceof android.graphics.drawable.BitmapDrawable
            if (r0 == 0) goto L9
            return r2
        L9:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Wrapped transformation unexpectedly returned a non BitmapDrawable resource: "
            java.lang.StringBuilder r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1)
            java.lang.Object r2 = r2.get()
            r1.append(r2)
            java.lang.String r2 = r1.toString()
            r0.<init>(r2)
            throw r0
    }

    private static com.bumptech.glide.load.engine.Resource<android.graphics.drawable.Drawable> convertToDrawableResource(com.bumptech.glide.load.engine.Resource<android.graphics.drawable.BitmapDrawable> r0) {
            return r0
    }

    @Override // com.bumptech.glide.load.Key
    public boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof com.bumptech.glide.load.resource.bitmap.BitmapDrawableTransformation
            if (r0 == 0) goto Lf
            com.bumptech.glide.load.resource.bitmap.BitmapDrawableTransformation r2 = (com.bumptech.glide.load.resource.bitmap.BitmapDrawableTransformation) r2
            com.bumptech.glide.load.Transformation<android.graphics.drawable.Drawable> r0 = r1.wrapped
            com.bumptech.glide.load.Transformation<android.graphics.drawable.Drawable> r2 = r2.wrapped
            boolean r2 = r0.equals(r2)
            return r2
        Lf:
            r2 = 0
            return r2
    }

    @Override // com.bumptech.glide.load.Key
    public int hashCode() {
            r1 = this;
            com.bumptech.glide.load.Transformation<android.graphics.drawable.Drawable> r0 = r1.wrapped
            int r0 = r0.hashCode()
            return r0
    }

    @Override // com.bumptech.glide.load.Transformation
    @androidx.annotation.NonNull
    public com.bumptech.glide.load.engine.Resource<android.graphics.drawable.BitmapDrawable> transform(@androidx.annotation.NonNull android.content.Context r2, @androidx.annotation.NonNull com.bumptech.glide.load.engine.Resource<android.graphics.drawable.BitmapDrawable> r3, int r4, int r5) {
            r1 = this;
            com.bumptech.glide.load.engine.Resource r3 = convertToDrawableResource(r3)
            com.bumptech.glide.load.Transformation<android.graphics.drawable.Drawable> r0 = r1.wrapped
            com.bumptech.glide.load.engine.Resource r2 = r0.transform(r2, r3, r4, r5)
            com.bumptech.glide.load.engine.Resource r2 = convertToBitmapDrawableResource(r2)
            return r2
    }

    @Override // com.bumptech.glide.load.Key
    public void updateDiskCacheKey(@androidx.annotation.NonNull java.security.MessageDigest r2) {
            r1 = this;
            com.bumptech.glide.load.Transformation<android.graphics.drawable.Drawable> r0 = r1.wrapped
            r0.updateDiskCacheKey(r2)
            return
    }
}
