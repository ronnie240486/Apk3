package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Result;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* JADX INFO: loaded from: classes3.dex */
@com.google.android.gms.common.annotation.KeepForSdk
public abstract class PendingResultFacade<A extends com.google.android.gms.common.api.Result, B extends com.google.android.gms.common.api.Result> extends com.google.android.gms.common.api.PendingResult<B> {
    @Override // com.google.android.gms.common.api.PendingResult
    public final void addStatusListener(@androidx.annotation.NonNull com.google.android.gms.common.api.PendingResult.StatusListener r1) {
            r0 = this;
            r1 = 0
            throw r1
    }

    @Override // com.google.android.gms.common.api.PendingResult
    @androidx.annotation.NonNull
    public final B await() {
            r1 = this;
            r0 = 0
            throw r0
    }

    @Override // com.google.android.gms.common.api.PendingResult
    @androidx.annotation.NonNull
    public final B await(long r1, @androidx.annotation.NonNull java.util.concurrent.TimeUnit r3) {
            r0 = this;
            r1 = 0
            throw r1
    }

    @Override // com.google.android.gms.common.api.PendingResult
    public final void cancel() {
            r1 = this;
            r0 = 0
            throw r0
    }

    @Override // com.google.android.gms.common.api.PendingResult
    public final boolean isCanceled() {
            r1 = this;
            r0 = 0
            throw r0
    }

    @Override // com.google.android.gms.common.api.PendingResult
    public final void setResultCallback(@androidx.annotation.NonNull com.google.android.gms.common.api.ResultCallback<? super B> r1) {
            r0 = this;
            r1 = 0
            throw r1
    }

    @Override // com.google.android.gms.common.api.PendingResult
    public final void setResultCallback(@androidx.annotation.NonNull com.google.android.gms.common.api.ResultCallback<? super B> r1, long r2, @androidx.annotation.NonNull java.util.concurrent.TimeUnit r4) {
            r0 = this;
            r1 = 0
            throw r1
    }

    @Override // com.google.android.gms.common.api.PendingResult
    @androidx.annotation.NonNull
    public final <S extends com.google.android.gms.common.api.Result> com.google.android.gms.common.api.TransformedResult<S> then(@androidx.annotation.NonNull com.google.android.gms.common.api.ResultTransform<? super B, ? extends S> r1) {
            r0 = this;
            r1 = 0
            throw r1
    }
}
