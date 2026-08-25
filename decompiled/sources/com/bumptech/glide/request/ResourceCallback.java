package com.bumptech.glide.request;

/* JADX INFO: loaded from: classes3.dex */
public interface ResourceCallback {
    java.lang.Object getLock();

    void onLoadFailed(com.bumptech.glide.load.engine.GlideException r1);

    void onResourceReady(com.bumptech.glide.load.engine.Resource<?> r1, com.bumptech.glide.load.DataSource r2, boolean r3);
}
