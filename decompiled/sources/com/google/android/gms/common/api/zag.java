package com.google.android.gms.common.api;

import com.google.android.gms.common.api.Result;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* JADX INFO: loaded from: classes.dex */
final class zag<R extends com.google.android.gms.common.api.Result> extends com.google.android.gms.common.api.internal.BasePendingResult<R> {
    private final R zae;

    public zag(com.google.android.gms.common.api.GoogleApiClient r1, R r2) {
            r0 = this;
            r0.<init>(r1)
            r0.zae = r2
            return
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final R createFailedResult(com.google.android.gms.common.api.Status r1) {
            r0 = this;
            R extends com.google.android.gms.common.api.Result r1 = r0.zae
            return r1
    }
}
