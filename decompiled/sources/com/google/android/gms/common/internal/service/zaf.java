package com.google.android.gms.common.internal.service;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* JADX INFO: loaded from: classes.dex */
abstract class zaf extends com.google.android.gms.common.internal.service.zag<com.google.android.gms.common.api.Status> {
    public zaf(com.google.android.gms.common.api.GoogleApiClient r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* bridge */ /* synthetic */ com.google.android.gms.common.api.Result createFailedResult(com.google.android.gms.common.api.Status r1) {
            r0 = this;
            return r1
    }
}
