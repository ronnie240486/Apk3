package com.google.android.gms.common.api;

import com.google.android.gms.common.api.Result;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class ResultTransform<R extends com.google.android.gms.common.api.Result, S extends com.google.android.gms.common.api.Result> {
    public ResultTransform() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.NonNull
    public final com.google.android.gms.common.api.PendingResult<S> createFailedResult(@androidx.annotation.NonNull com.google.android.gms.common.api.Status r2) {
            r1 = this;
            com.google.android.gms.common.api.internal.zacp r0 = new com.google.android.gms.common.api.internal.zacp
            r0.<init>(r2)
            return r0
    }

    @androidx.annotation.NonNull
    public com.google.android.gms.common.api.Status onFailure(@androidx.annotation.NonNull com.google.android.gms.common.api.Status r1) {
            r0 = this;
            return r1
    }

    @androidx.annotation.Nullable
    @androidx.annotation.WorkerThread
    public abstract com.google.android.gms.common.api.PendingResult<S> onSuccess(@androidx.annotation.NonNull R r1);
}
