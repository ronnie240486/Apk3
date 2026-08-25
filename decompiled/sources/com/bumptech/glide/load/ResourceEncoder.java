package com.bumptech.glide.load;

/* JADX INFO: loaded from: classes2.dex */
public interface ResourceEncoder<T> extends com.bumptech.glide.load.Encoder<com.bumptech.glide.load.engine.Resource<T>> {
    @androidx.annotation.NonNull
    com.bumptech.glide.load.EncodeStrategy getEncodeStrategy(@androidx.annotation.NonNull com.bumptech.glide.load.Options r1);
}
