package com.google.android.gms.common.api;

import com.google.android.gms.common.api.Result;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class TransformedResult<R extends com.google.android.gms.common.api.Result> {
    public TransformedResult() {
            r0 = this;
            r0.<init>()
            return
    }

    public abstract void andFinally(@androidx.annotation.NonNull com.google.android.gms.common.api.ResultCallbacks<? super R> r1);

    @androidx.annotation.NonNull
    public abstract <S extends com.google.android.gms.common.api.Result> com.google.android.gms.common.api.TransformedResult<S> then(@androidx.annotation.NonNull com.google.android.gms.common.api.ResultTransform<? super R, ? extends S> r1);
}
