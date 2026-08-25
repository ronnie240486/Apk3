package com.bumptech.glide.request;

/* JADX INFO: loaded from: classes3.dex */
public interface RequestListener<R> {
    boolean onLoadFailed(@androidx.annotation.Nullable com.bumptech.glide.load.engine.GlideException r1, java.lang.Object r2, com.bumptech.glide.request.target.Target<R> r3, boolean r4);

    boolean onResourceReady(R r1, java.lang.Object r2, com.bumptech.glide.request.target.Target<R> r3, com.bumptech.glide.load.DataSource r4, boolean r5);
}
