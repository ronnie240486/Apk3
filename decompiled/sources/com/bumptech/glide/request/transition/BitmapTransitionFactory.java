package com.bumptech.glide.request.transition;

/* JADX INFO: loaded from: classes.dex */
public class BitmapTransitionFactory extends com.bumptech.glide.request.transition.BitmapContainerTransitionFactory<android.graphics.Bitmap> {
    public BitmapTransitionFactory(@androidx.annotation.NonNull com.bumptech.glide.request.transition.TransitionFactory<android.graphics.drawable.Drawable> r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // com.bumptech.glide.request.transition.BitmapContainerTransitionFactory
    @androidx.annotation.NonNull
    public final android.graphics.Bitmap getBitmap(@androidx.annotation.NonNull android.graphics.Bitmap r1) {
            r0 = this;
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            return r1
    }
}
