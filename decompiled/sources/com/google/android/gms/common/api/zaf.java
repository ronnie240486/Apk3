package com.google.android.gms.common.api;

import com.google.android.gms.common.api.Result;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* JADX INFO: loaded from: classes.dex */
final class zaf<R extends com.google.android.gms.common.api.Result> extends com.google.android.gms.common.api.internal.BasePendingResult<R> {
    private final R zae;

    public zaf(R r2) {
            r1 = this;
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            r1.<init>(r0)
            r1.zae = r2
            return
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final R createFailedResult(com.google.android.gms.common.api.Status r2) {
            r1 = this;
            int r2 = r2.getStatusCode()
            R extends com.google.android.gms.common.api.Result r0 = r1.zae
            com.google.android.gms.common.api.Status r0 = r0.getStatus()
            int r0 = r0.getStatusCode()
            if (r2 != r0) goto L13
            R extends com.google.android.gms.common.api.Result r2 = r1.zae
            return r2
        L13:
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Creating failed results is not supported"
            r2.<init>(r0)
            throw r2
    }
}
