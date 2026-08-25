package com.bumptech.glide.load;

/* JADX INFO: loaded from: classes2.dex */
public interface ResourceDecoder<T, Z> {
    @androidx.annotation.Nullable
    com.bumptech.glide.load.engine.Resource<Z> decode(@androidx.annotation.NonNull T r1, int r2, int r3, @androidx.annotation.NonNull com.bumptech.glide.load.Options r4) throws java.io.IOException;

    boolean handles(@androidx.annotation.NonNull T r1, @androidx.annotation.NonNull com.bumptech.glide.load.Options r2) throws java.io.IOException;
}
