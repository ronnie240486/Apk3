package com.bumptech.glide.load.resource.gif;

/* JADX INFO: loaded from: classes.dex */
public class GifDrawableResource extends com.bumptech.glide.load.resource.drawable.DrawableResource<com.bumptech.glide.load.resource.gif.GifDrawable> {
    public GifDrawableResource(com.bumptech.glide.load.resource.gif.GifDrawable r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // com.bumptech.glide.load.engine.Resource
    @androidx.annotation.NonNull
    public java.lang.Class<com.bumptech.glide.load.resource.gif.GifDrawable> getResourceClass() {
            r1 = this;
            java.lang.Class<com.bumptech.glide.load.resource.gif.GifDrawable> r0 = com.bumptech.glide.load.resource.gif.GifDrawable.class
            return r0
    }

    @Override // com.bumptech.glide.load.engine.Resource
    public int getSize() {
            r1 = this;
            T extends android.graphics.drawable.Drawable r0 = r1.drawable
            com.bumptech.glide.load.resource.gif.GifDrawable r0 = (com.bumptech.glide.load.resource.gif.GifDrawable) r0
            int r0 = r0.getSize()
            return r0
    }

    @Override // com.bumptech.glide.load.resource.drawable.DrawableResource, com.bumptech.glide.load.engine.Initializable
    public void initialize() {
            r1 = this;
            T extends android.graphics.drawable.Drawable r0 = r1.drawable
            com.bumptech.glide.load.resource.gif.GifDrawable r0 = (com.bumptech.glide.load.resource.gif.GifDrawable) r0
            android.graphics.Bitmap r0 = r0.getFirstFrame()
            r0.prepareToDraw()
            return
    }

    @Override // com.bumptech.glide.load.engine.Resource
    public void recycle() {
            r1 = this;
            T extends android.graphics.drawable.Drawable r0 = r1.drawable
            com.bumptech.glide.load.resource.gif.GifDrawable r0 = (com.bumptech.glide.load.resource.gif.GifDrawable) r0
            r0.stop()
            T extends android.graphics.drawable.Drawable r0 = r1.drawable
            com.bumptech.glide.load.resource.gif.GifDrawable r0 = (com.bumptech.glide.load.resource.gif.GifDrawable) r0
            r0.recycle()
            return
    }
}
