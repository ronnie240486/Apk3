package com.bumptech.glide.load.resource.bitmap;

/* JADX INFO: loaded from: classes2.dex */
public class BitmapDrawableResource extends com.bumptech.glide.load.resource.drawable.DrawableResource<android.graphics.drawable.BitmapDrawable> {
    private final com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool bitmapPool;

    public BitmapDrawableResource(android.graphics.drawable.BitmapDrawable r1, com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool r2) {
            r0 = this;
            r0.<init>(r1)
            r0.bitmapPool = r2
            return
    }

    @Override // com.bumptech.glide.load.engine.Resource
    @androidx.annotation.NonNull
    public java.lang.Class<android.graphics.drawable.BitmapDrawable> getResourceClass() {
            r1 = this;
            java.lang.Class<android.graphics.drawable.BitmapDrawable> r0 = android.graphics.drawable.BitmapDrawable.class
            return r0
    }

    @Override // com.bumptech.glide.load.engine.Resource
    public int getSize() {
            r1 = this;
            T extends android.graphics.drawable.Drawable r0 = r1.drawable
            android.graphics.drawable.BitmapDrawable r0 = (android.graphics.drawable.BitmapDrawable) r0
            android.graphics.Bitmap r0 = r0.getBitmap()
            int r0 = com.bumptech.glide.util.Util.getBitmapByteSize(r0)
            return r0
    }

    @Override // com.bumptech.glide.load.resource.drawable.DrawableResource, com.bumptech.glide.load.engine.Initializable
    public void initialize() {
            r1 = this;
            T extends android.graphics.drawable.Drawable r0 = r1.drawable
            android.graphics.drawable.BitmapDrawable r0 = (android.graphics.drawable.BitmapDrawable) r0
            android.graphics.Bitmap r0 = r0.getBitmap()
            r0.prepareToDraw()
            return
    }

    @Override // com.bumptech.glide.load.engine.Resource
    public void recycle() {
            r2 = this;
            com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool r0 = r2.bitmapPool
            T extends android.graphics.drawable.Drawable r1 = r2.drawable
            android.graphics.drawable.BitmapDrawable r1 = (android.graphics.drawable.BitmapDrawable) r1
            android.graphics.Bitmap r1 = r1.getBitmap()
            r0.put(r1)
            return
    }
}
