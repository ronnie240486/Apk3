package com.bumptech.glide.request.target;

/* JADX INFO: loaded from: classes3.dex */
public interface Target<R> extends com.bumptech.glide.manager.LifecycleListener {
    public static final int SIZE_ORIGINAL = Integer.MIN_VALUE;

    @androidx.annotation.Nullable
    com.bumptech.glide.request.Request getRequest();

    void getSize(@androidx.annotation.NonNull com.bumptech.glide.request.target.SizeReadyCallback r1);

    void onLoadCleared(@androidx.annotation.Nullable android.graphics.drawable.Drawable r1);

    void onLoadFailed(@androidx.annotation.Nullable android.graphics.drawable.Drawable r1);

    void onLoadStarted(@androidx.annotation.Nullable android.graphics.drawable.Drawable r1);

    void onResourceReady(@androidx.annotation.NonNull R r1, @androidx.annotation.Nullable com.bumptech.glide.request.transition.Transition<? super R> r2);

    void removeCallback(@androidx.annotation.NonNull com.bumptech.glide.request.target.SizeReadyCallback r1);

    void setRequest(@androidx.annotation.Nullable com.bumptech.glide.request.Request r1);
}
