package com.bumptech.glide.load.resource.bitmap;

/* JADX INFO: loaded from: classes3.dex */
public final class LazyBitmapDrawableResource implements com.bumptech.glide.load.engine.Resource<android.graphics.drawable.BitmapDrawable>, com.bumptech.glide.load.engine.Initializable {
    private final com.bumptech.glide.load.engine.Resource<android.graphics.Bitmap> bitmapResource;
    private final android.content.res.Resources resources;

    private LazyBitmapDrawableResource(@androidx.annotation.NonNull android.content.res.Resources r1, @androidx.annotation.NonNull com.bumptech.glide.load.engine.Resource<android.graphics.Bitmap> r2) {
            r0 = this;
            r0.<init>()
            java.lang.Object r1 = com.bumptech.glide.util.Preconditions.checkNotNull(r1)
            android.content.res.Resources r1 = (android.content.res.Resources) r1
            r0.resources = r1
            java.lang.Object r1 = com.bumptech.glide.util.Preconditions.checkNotNull(r2)
            com.bumptech.glide.load.engine.Resource r1 = (com.bumptech.glide.load.engine.Resource) r1
            r0.bitmapResource = r1
            return
    }

    @androidx.annotation.Nullable
    public static com.bumptech.glide.load.engine.Resource<android.graphics.drawable.BitmapDrawable> obtain(@androidx.annotation.NonNull android.content.res.Resources r1, @androidx.annotation.Nullable com.bumptech.glide.load.engine.Resource<android.graphics.Bitmap> r2) {
            if (r2 != 0) goto L4
            r1 = 0
            return r1
        L4:
            com.bumptech.glide.load.resource.bitmap.LazyBitmapDrawableResource r0 = new com.bumptech.glide.load.resource.bitmap.LazyBitmapDrawableResource
            r0.<init>(r1, r2)
            return r0
    }

    @java.lang.Deprecated
    public static com.bumptech.glide.load.resource.bitmap.LazyBitmapDrawableResource obtain(android.content.Context r1, android.graphics.Bitmap r2) {
            android.content.res.Resources r0 = r1.getResources()
            com.bumptech.glide.Glide r1 = com.bumptech.glide.Glide.get(r1)
            com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool r1 = r1.getBitmapPool()
            com.bumptech.glide.load.resource.bitmap.BitmapResource r1 = com.bumptech.glide.load.resource.bitmap.BitmapResource.obtain(r2, r1)
            com.bumptech.glide.load.engine.Resource r1 = obtain(r0, r1)
            com.bumptech.glide.load.resource.bitmap.LazyBitmapDrawableResource r1 = (com.bumptech.glide.load.resource.bitmap.LazyBitmapDrawableResource) r1
            return r1
    }

    @java.lang.Deprecated
    public static com.bumptech.glide.load.resource.bitmap.LazyBitmapDrawableResource obtain(android.content.res.Resources r0, com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool r1, android.graphics.Bitmap r2) {
            com.bumptech.glide.load.resource.bitmap.BitmapResource r1 = com.bumptech.glide.load.resource.bitmap.BitmapResource.obtain(r2, r1)
            com.bumptech.glide.load.engine.Resource r0 = obtain(r0, r1)
            com.bumptech.glide.load.resource.bitmap.LazyBitmapDrawableResource r0 = (com.bumptech.glide.load.resource.bitmap.LazyBitmapDrawableResource) r0
            return r0
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bumptech.glide.load.engine.Resource
    @androidx.annotation.NonNull
    public android.graphics.drawable.BitmapDrawable get() {
            r3 = this;
            android.graphics.drawable.BitmapDrawable r0 = new android.graphics.drawable.BitmapDrawable
            android.content.res.Resources r1 = r3.resources
            com.bumptech.glide.load.engine.Resource<android.graphics.Bitmap> r2 = r3.bitmapResource
            java.lang.Object r2 = r2.get()
            android.graphics.Bitmap r2 = (android.graphics.Bitmap) r2
            r0.<init>(r1, r2)
            return r0
    }

    @Override // com.bumptech.glide.load.engine.Resource
    @androidx.annotation.NonNull
    public /* bridge */ /* synthetic */ android.graphics.drawable.BitmapDrawable get() {
            r1 = this;
            android.graphics.drawable.BitmapDrawable r0 = r1.get()
            return r0
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
            com.bumptech.glide.load.engine.Resource<android.graphics.Bitmap> r0 = r1.bitmapResource
            int r0 = r0.getSize()
            return r0
    }

    @Override // com.bumptech.glide.load.engine.Initializable
    public void initialize() {
            r2 = this;
            com.bumptech.glide.load.engine.Resource<android.graphics.Bitmap> r0 = r2.bitmapResource
            boolean r1 = r0 instanceof com.bumptech.glide.load.engine.Initializable
            if (r1 == 0) goto Lb
            com.bumptech.glide.load.engine.Initializable r0 = (com.bumptech.glide.load.engine.Initializable) r0
            r0.initialize()
        Lb:
            return
    }

    @Override // com.bumptech.glide.load.engine.Resource
    public void recycle() {
            r1 = this;
            com.bumptech.glide.load.engine.Resource<android.graphics.Bitmap> r0 = r1.bitmapResource
            r0.recycle()
            return
    }
}
