package com.bumptech.glide.request.target;

/* JADX INFO: loaded from: classes.dex */
public abstract class ImageViewTarget<Z> extends com.bumptech.glide.request.target.ViewTarget<android.widget.ImageView, Z> implements com.bumptech.glide.request.transition.Transition.ViewAdapter {

    @androidx.annotation.Nullable
    private android.graphics.drawable.Animatable animatable;

    public ImageViewTarget(android.widget.ImageView r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @java.lang.Deprecated
    public ImageViewTarget(android.widget.ImageView r1, boolean r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    private void maybeUpdateAnimatable(@androidx.annotation.Nullable Z r2) {
            r1 = this;
            boolean r0 = r2 instanceof android.graphics.drawable.Animatable
            if (r0 == 0) goto Lc
            android.graphics.drawable.Animatable r2 = (android.graphics.drawable.Animatable) r2
            r1.animatable = r2
            r2.start()
            goto Lf
        Lc:
            r2 = 0
            r1.animatable = r2
        Lf:
            return
    }

    private void setResourceInternal(@androidx.annotation.Nullable Z r1) {
            r0 = this;
            r0.setResource(r1)
            r0.maybeUpdateAnimatable(r1)
            return
    }

    @Override // com.bumptech.glide.request.transition.Transition.ViewAdapter
    @androidx.annotation.Nullable
    public android.graphics.drawable.Drawable getCurrentDrawable() {
            r1 = this;
            T extends android.view.View r0 = r1.view
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            android.graphics.drawable.Drawable r0 = r0.getDrawable()
            return r0
    }

    @Override // com.bumptech.glide.request.target.ViewTarget, com.bumptech.glide.request.target.BaseTarget, com.bumptech.glide.request.target.Target
    public void onLoadCleared(@androidx.annotation.Nullable android.graphics.drawable.Drawable r2) {
            r1 = this;
            super.onLoadCleared(r2)
            android.graphics.drawable.Animatable r0 = r1.animatable
            if (r0 == 0) goto La
            r0.stop()
        La:
            r0 = 0
            r1.setResourceInternal(r0)
            r1.setDrawable(r2)
            return
    }

    @Override // com.bumptech.glide.request.target.BaseTarget, com.bumptech.glide.request.target.Target
    public void onLoadFailed(@androidx.annotation.Nullable android.graphics.drawable.Drawable r2) {
            r1 = this;
            super.onLoadFailed(r2)
            r0 = 0
            r1.setResourceInternal(r0)
            r1.setDrawable(r2)
            return
    }

    @Override // com.bumptech.glide.request.target.ViewTarget, com.bumptech.glide.request.target.BaseTarget, com.bumptech.glide.request.target.Target
    public void onLoadStarted(@androidx.annotation.Nullable android.graphics.drawable.Drawable r2) {
            r1 = this;
            super.onLoadStarted(r2)
            r0 = 0
            r1.setResourceInternal(r0)
            r1.setDrawable(r2)
            return
    }

    @Override // com.bumptech.glide.request.target.Target
    public void onResourceReady(@androidx.annotation.NonNull Z r1, @androidx.annotation.Nullable com.bumptech.glide.request.transition.Transition<? super Z> r2) {
            r0 = this;
            if (r2 == 0) goto Ld
            boolean r2 = r2.transition(r1, r0)
            if (r2 != 0) goto L9
            goto Ld
        L9:
            r0.maybeUpdateAnimatable(r1)
            goto L10
        Ld:
            r0.setResourceInternal(r1)
        L10:
            return
    }

    @Override // com.bumptech.glide.request.target.BaseTarget, com.bumptech.glide.manager.LifecycleListener
    public void onStart() {
            r1 = this;
            android.graphics.drawable.Animatable r0 = r1.animatable
            if (r0 == 0) goto L7
            r0.start()
        L7:
            return
    }

    @Override // com.bumptech.glide.request.target.BaseTarget, com.bumptech.glide.manager.LifecycleListener
    public void onStop() {
            r1 = this;
            android.graphics.drawable.Animatable r0 = r1.animatable
            if (r0 == 0) goto L7
            r0.stop()
        L7:
            return
    }

    @Override // com.bumptech.glide.request.transition.Transition.ViewAdapter
    public void setDrawable(android.graphics.drawable.Drawable r2) {
            r1 = this;
            T extends android.view.View r0 = r1.view
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r0.setImageDrawable(r2)
            return
    }

    public abstract void setResource(@androidx.annotation.Nullable Z r1);
}
