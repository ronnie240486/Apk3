package com.google.android.gms.common.api;

import com.google.android.gms.common.api.Result;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* JADX INFO: loaded from: classes.dex */
@com.google.android.gms.common.annotation.KeepForSdk
public abstract class PendingResult<R extends com.google.android.gms.common.api.Result> {

    /* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    @com.google.android.gms.common.annotation.KeepForSdk
    public interface StatusListener {
        @com.google.android.gms.common.annotation.KeepForSdk
        void onComplete(@androidx.annotation.NonNull com.google.android.gms.common.api.Status r1);
    }

    public PendingResult() {
            r0 = this;
            r0.<init>()
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public void addStatusListener(@androidx.annotation.NonNull com.google.android.gms.common.api.PendingResult.StatusListener r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @androidx.annotation.NonNull
    public abstract R await();

    @androidx.annotation.NonNull
    public abstract R await(long r1, @androidx.annotation.NonNull java.util.concurrent.TimeUnit r3);

    public abstract void cancel();

    public abstract boolean isCanceled();

    public abstract void setResultCallback(@androidx.annotation.NonNull com.google.android.gms.common.api.ResultCallback<? super R> r1);

    public abstract void setResultCallback(@androidx.annotation.NonNull com.google.android.gms.common.api.ResultCallback<? super R> r1, long r2, @androidx.annotation.NonNull java.util.concurrent.TimeUnit r4);

    @androidx.annotation.NonNull
    public <S extends com.google.android.gms.common.api.Result> com.google.android.gms.common.api.TransformedResult<S> then(@androidx.annotation.NonNull com.google.android.gms.common.api.ResultTransform<? super R, ? extends S> r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }
}
