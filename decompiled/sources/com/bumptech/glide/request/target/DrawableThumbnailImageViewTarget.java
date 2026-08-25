package com.bumptech.glide.request.target;

/* JADX INFO: loaded from: classes.dex */
public class DrawableThumbnailImageViewTarget extends com.bumptech.glide.request.target.ThumbnailImageViewTarget<android.graphics.drawable.Drawable> {
    public DrawableThumbnailImageViewTarget(android.widget.ImageView r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @java.lang.Deprecated
    public DrawableThumbnailImageViewTarget(android.widget.ImageView r1, boolean r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    @Override // com.bumptech.glide.request.target.ThumbnailImageViewTarget
    public final android.graphics.drawable.Drawable getDrawable(android.graphics.drawable.Drawable r1) {
            r0 = this;
            android.graphics.drawable.Drawable r1 = (android.graphics.drawable.Drawable) r1
            return r1
    }
}
