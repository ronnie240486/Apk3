package com.bumptech.glide.load.resource.bitmap;

/* JADX INFO: loaded from: classes.dex */
public class BitmapResource implements com.bumptech.glide.load.engine.Resource<android.graphics.Bitmap>, com.bumptech.glide.load.engine.Initializable {
    private final android.graphics.Bitmap bitmap;
    private final com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool bitmapPool;

    public BitmapResource(@androidx.annotation.NonNull android.graphics.Bitmap r2, @androidx.annotation.NonNull com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool r3) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "Bitmap must not be null"
            java.lang.Object r2 = com.bumptech.glide.util.Preconditions.checkNotNull(r2, r0)
            android.graphics.Bitmap r2 = (android.graphics.Bitmap) r2
            r1.bitmap = r2
            java.lang.String r2 = "BitmapPool must not be null"
            java.lang.Object r2 = com.bumptech.glide.util.Preconditions.checkNotNull(r3, r2)
            com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool r2 = (com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool) r2
            r1.bitmapPool = r2
            return
    }

    @androidx.annotation.Nullable
    public static com.bumptech.glide.load.resource.bitmap.BitmapResource obtain(@androidx.annotation.Nullable android.graphics.Bitmap r1, @androidx.annotation.NonNull com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool r2) {
            if (r1 != 0) goto L4
            r1 = 0
            return r1
        L4:
            com.bumptech.glide.load.resource.bitmap.BitmapResource r0 = new com.bumptech.glide.load.resource.bitmap.BitmapResource
            r0.<init>(r1, r2)
            return r0
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bumptech.glide.load.engine.Resource
    @androidx.annotation.NonNull
    public android.graphics.Bitmap get() {
            r1 = this;
            android.graphics.Bitmap r0 = r1.bitmap
            return r0
    }

    @Override // com.bumptech.glide.load.engine.Resource
    @androidx.annotation.NonNull
    public /* bridge */ /* synthetic */ android.graphics.Bitmap get() {
            r1 = this;
            android.graphics.Bitmap r0 = r1.get()
            return r0
    }

    @Override // com.bumptech.glide.load.engine.Resource
    @androidx.annotation.NonNull
    public java.lang.Class<android.graphics.Bitmap> getResourceClass() {
            r1 = this;
            java.lang.Class<android.graphics.Bitmap> r0 = android.graphics.Bitmap.class
            return r0
    }

    @Override // com.bumptech.glide.load.engine.Resource
    public int getSize() {
            r1 = this;
            android.graphics.Bitmap r0 = r1.bitmap
            int r0 = com.bumptech.glide.util.Util.getBitmapByteSize(r0)
            return r0
    }

    @Override // com.bumptech.glide.load.engine.Initializable
    public void initialize() {
            r1 = this;
            android.graphics.Bitmap r0 = r1.bitmap
            r0.prepareToDraw()
            return
    }

    @Override // com.bumptech.glide.load.engine.Resource
    public void recycle() {
            r2 = this;
            com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool r0 = r2.bitmapPool
            android.graphics.Bitmap r1 = r2.bitmap
            r0.put(r1)
            return
    }
}
