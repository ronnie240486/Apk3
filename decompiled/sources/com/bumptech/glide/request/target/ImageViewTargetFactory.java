package com.bumptech.glide.request.target;

/* JADX INFO: loaded from: classes2.dex */
public class ImageViewTargetFactory {
    public ImageViewTargetFactory() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.NonNull
    public <Z> com.bumptech.glide.request.target.ViewTarget<android.widget.ImageView, Z> buildTarget(@androidx.annotation.NonNull android.widget.ImageView r3, @androidx.annotation.NonNull java.lang.Class<Z> r4) {
            r2 = this;
            java.lang.Class<android.graphics.Bitmap> r0 = android.graphics.Bitmap.class
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto Le
            com.bumptech.glide.request.target.BitmapImageViewTarget r4 = new com.bumptech.glide.request.target.BitmapImageViewTarget
            r4.<init>(r3)
            return r4
        Le:
            java.lang.Class<android.graphics.drawable.Drawable> r0 = android.graphics.drawable.Drawable.class
            boolean r0 = r0.isAssignableFrom(r4)
            if (r0 == 0) goto L1c
            com.bumptech.glide.request.target.DrawableImageViewTarget r4 = new com.bumptech.glide.request.target.DrawableImageViewTarget
            r4.<init>(r3)
            return r4
        L1c:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unhandled class: "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r4 = ", try .as*(Class).transcode(ResourceTranscoder)"
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r3.<init>(r4)
            throw r3
    }
}
