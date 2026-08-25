package com.bumptech.glide.load.resource.drawable;

/* JADX INFO: loaded from: classes2.dex */
final class NonOwnedDrawableResource extends com.bumptech.glide.load.resource.drawable.DrawableResource<android.graphics.drawable.Drawable> {
    private NonOwnedDrawableResource(android.graphics.drawable.Drawable r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @androidx.annotation.Nullable
    public static com.bumptech.glide.load.engine.Resource<android.graphics.drawable.Drawable> newInstance(@androidx.annotation.Nullable android.graphics.drawable.Drawable r1) {
            if (r1 == 0) goto L8
            com.bumptech.glide.load.resource.drawable.NonOwnedDrawableResource r0 = new com.bumptech.glide.load.resource.drawable.NonOwnedDrawableResource
            r0.<init>(r1)
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    @Override // com.bumptech.glide.load.engine.Resource
    @androidx.annotation.NonNull
    public java.lang.Class<android.graphics.drawable.Drawable> getResourceClass() {
            r1 = this;
            T extends android.graphics.drawable.Drawable r0 = r1.drawable
            java.lang.Class r0 = r0.getClass()
            return r0
    }

    @Override // com.bumptech.glide.load.engine.Resource
    public int getSize() {
            r2 = this;
            T extends android.graphics.drawable.Drawable r0 = r2.drawable
            int r0 = r0.getIntrinsicWidth()
            T extends android.graphics.drawable.Drawable r1 = r2.drawable
            int r1 = r1.getIntrinsicHeight()
            int r1 = r1 * r0
            int r1 = r1 * 4
            r0 = 1
            int r0 = java.lang.Math.max(r0, r1)
            return r0
    }

    @Override // com.bumptech.glide.load.engine.Resource
    public void recycle() {
            r0 = this;
            return
    }
}
