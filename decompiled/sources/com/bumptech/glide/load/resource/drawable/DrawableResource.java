package com.bumptech.glide.load.resource.drawable;

import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes2.dex */
public abstract class DrawableResource<T extends android.graphics.drawable.Drawable> implements com.bumptech.glide.load.engine.Resource<T>, com.bumptech.glide.load.engine.Initializable {
    public final T drawable;

    public DrawableResource(T r1) {
            r0 = this;
            r0.<init>()
            java.lang.Object r1 = com.bumptech.glide.util.Preconditions.checkNotNull(r1)
            android.graphics.drawable.Drawable r1 = (android.graphics.drawable.Drawable) r1
            r0.drawable = r1
            return
    }

    @Override // com.bumptech.glide.load.engine.Resource
    @androidx.annotation.NonNull
    public final T get() {
            r1 = this;
            T extends android.graphics.drawable.Drawable r0 = r1.drawable
            android.graphics.drawable.Drawable$ConstantState r0 = r0.getConstantState()
            if (r0 != 0) goto Lb
            T extends android.graphics.drawable.Drawable r0 = r1.drawable
            return r0
        Lb:
            android.graphics.drawable.Drawable r0 = r0.newDrawable()
            return r0
    }

    @Override // com.bumptech.glide.load.engine.Resource
    @androidx.annotation.NonNull
    public /* bridge */ /* synthetic */ java.lang.Object get() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.get()
            return r0
    }

    public void initialize() {
            r2 = this;
            T extends android.graphics.drawable.Drawable r0 = r2.drawable
            boolean r1 = r0 instanceof android.graphics.drawable.BitmapDrawable
            if (r1 == 0) goto L10
            android.graphics.drawable.BitmapDrawable r0 = (android.graphics.drawable.BitmapDrawable) r0
            android.graphics.Bitmap r0 = r0.getBitmap()
            r0.prepareToDraw()
            goto L1d
        L10:
            boolean r1 = r0 instanceof com.bumptech.glide.load.resource.gif.GifDrawable
            if (r1 == 0) goto L1d
            com.bumptech.glide.load.resource.gif.GifDrawable r0 = (com.bumptech.glide.load.resource.gif.GifDrawable) r0
            android.graphics.Bitmap r0 = r0.getFirstFrame()
            r0.prepareToDraw()
        L1d:
            return
    }
}
