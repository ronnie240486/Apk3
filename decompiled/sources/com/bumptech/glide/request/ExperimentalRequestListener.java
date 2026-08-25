package com.bumptech.glide.request;

/* JADX INFO: loaded from: classes.dex */
@java.lang.Deprecated
public abstract class ExperimentalRequestListener<ResourceT> implements com.bumptech.glide.request.RequestListener<ResourceT> {
    public ExperimentalRequestListener() {
            r0 = this;
            r0.<init>()
            return
    }

    public abstract boolean onResourceReady(ResourceT r1, java.lang.Object r2, com.bumptech.glide.request.target.Target<ResourceT> r3, com.bumptech.glide.load.DataSource r4, boolean r5, boolean r6);
}
