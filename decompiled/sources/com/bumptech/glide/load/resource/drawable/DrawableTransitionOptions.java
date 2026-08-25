package com.bumptech.glide.load.resource.drawable;

/* JADX INFO: loaded from: classes.dex */
public final class DrawableTransitionOptions extends com.bumptech.glide.TransitionOptions<com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions, android.graphics.drawable.Drawable> {
    public DrawableTransitionOptions() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.NonNull
    public static com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions with(@androidx.annotation.NonNull com.bumptech.glide.request.transition.TransitionFactory<android.graphics.drawable.Drawable> r1) {
            com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions r0 = new com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions
            r0.<init>()
            com.bumptech.glide.TransitionOptions r1 = r0.transition(r1)
            com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions r1 = (com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions) r1
            return r1
    }

    @androidx.annotation.NonNull
    public static com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions withCrossFade() {
            com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions r0 = new com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions
            r0.<init>()
            com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions r0 = r0.crossFade()
            return r0
    }

    @androidx.annotation.NonNull
    public static com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions withCrossFade(int r1) {
            com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions r0 = new com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions
            r0.<init>()
            com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions r1 = r0.crossFade(r1)
            return r1
    }

    @androidx.annotation.NonNull
    public static com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions withCrossFade(@androidx.annotation.NonNull com.bumptech.glide.request.transition.DrawableCrossFadeFactory.Builder r1) {
            com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions r0 = new com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions
            r0.<init>()
            com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions r1 = r0.crossFade(r1)
            return r1
    }

    @androidx.annotation.NonNull
    public static com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions withCrossFade(@androidx.annotation.NonNull com.bumptech.glide.request.transition.DrawableCrossFadeFactory r1) {
            com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions r0 = new com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions
            r0.<init>()
            com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions r1 = r0.crossFade(r1)
            return r1
    }

    @androidx.annotation.NonNull
    public com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions crossFade() {
            r1 = this;
            com.bumptech.glide.request.transition.DrawableCrossFadeFactory$Builder r0 = new com.bumptech.glide.request.transition.DrawableCrossFadeFactory$Builder
            r0.<init>()
            com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions r0 = r1.crossFade(r0)
            return r0
    }

    @androidx.annotation.NonNull
    public com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions crossFade(int r2) {
            r1 = this;
            com.bumptech.glide.request.transition.DrawableCrossFadeFactory$Builder r0 = new com.bumptech.glide.request.transition.DrawableCrossFadeFactory$Builder
            r0.<init>(r2)
            com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions r2 = r1.crossFade(r0)
            return r2
    }

    @androidx.annotation.NonNull
    public com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions crossFade(@androidx.annotation.NonNull com.bumptech.glide.request.transition.DrawableCrossFadeFactory.Builder r1) {
            r0 = this;
            com.bumptech.glide.request.transition.DrawableCrossFadeFactory r1 = r1.build()
            com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions r1 = r0.crossFade(r1)
            return r1
    }

    @androidx.annotation.NonNull
    public com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions crossFade(@androidx.annotation.NonNull com.bumptech.glide.request.transition.DrawableCrossFadeFactory r1) {
            r0 = this;
            com.bumptech.glide.TransitionOptions r1 = r0.transition(r1)
            com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions r1 = (com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions) r1
            return r1
    }
}
