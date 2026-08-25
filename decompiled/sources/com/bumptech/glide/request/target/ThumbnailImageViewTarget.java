package com.bumptech.glide.request.target;

/* JADX INFO: loaded from: classes.dex */
public abstract class ThumbnailImageViewTarget<T> extends com.bumptech.glide.request.target.ImageViewTarget<T> {
    public ThumbnailImageViewTarget(android.widget.ImageView r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @java.lang.Deprecated
    public ThumbnailImageViewTarget(android.widget.ImageView r1, boolean r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public abstract android.graphics.drawable.Drawable getDrawable(T r1);

    @Override // com.bumptech.glide.request.target.ImageViewTarget
    public final void setResource(@androidx.annotation.Nullable T r4) {
            r3 = this;
            T extends android.view.View r0 = r3.view
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            android.graphics.drawable.Drawable r4 = r3.getDrawable(r4)
            if (r0 == 0) goto L20
            int r1 = r0.width
            if (r1 <= 0) goto L20
            int r1 = r0.height
            if (r1 <= 0) goto L20
            com.bumptech.glide.request.target.FixedSizeDrawable r1 = new com.bumptech.glide.request.target.FixedSizeDrawable
            int r2 = r0.width
            int r0 = r0.height
            r1.<init>(r4, r2, r0)
            r4 = r1
        L20:
            T extends android.view.View r0 = r3.view
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r0.setImageDrawable(r4)
            return
    }
}
