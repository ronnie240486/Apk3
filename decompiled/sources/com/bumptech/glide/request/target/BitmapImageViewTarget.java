package com.bumptech.glide.request.target;

/* JADX INFO: loaded from: classes2.dex */
public class BitmapImageViewTarget extends com.bumptech.glide.request.target.ImageViewTarget<android.graphics.Bitmap> {
    public BitmapImageViewTarget(android.widget.ImageView r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @java.lang.Deprecated
    public BitmapImageViewTarget(android.widget.ImageView r1, boolean r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    @Override // com.bumptech.glide.request.target.ImageViewTarget
    public final void setResource(android.graphics.Bitmap r2) {
            r1 = this;
            android.graphics.Bitmap r2 = (android.graphics.Bitmap) r2
            T extends android.view.View r0 = r1.view
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r0.setImageBitmap(r2)
            return
    }
}
