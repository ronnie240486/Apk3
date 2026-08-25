package com.bumptech.glide.load.resource.transcode;

/* JADX INFO: loaded from: classes.dex */
public interface ResourceTranscoder<Z, R> {
    @androidx.annotation.Nullable
    com.bumptech.glide.load.engine.Resource<R> transcode(@androidx.annotation.NonNull com.bumptech.glide.load.engine.Resource<Z> r1, @androidx.annotation.NonNull com.bumptech.glide.load.Options r2);
}
