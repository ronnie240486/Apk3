package com.google.android.gms.common.api;

import com.google.android.gms.common.api.Result;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* JADX INFO: loaded from: classes.dex */
final class zah<R extends com.google.android.gms.common.api.Result> extends com.google.android.gms.common.api.internal.BasePendingResult<R> {
    public zah(@androidx.annotation.Nullable com.google.android.gms.common.api.GoogleApiClient r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final R createFailedResult(com.google.android.gms.common.api.Status r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Creating failed results is not supported"
            r2.<init>(r0)
            throw r2
    }
}
