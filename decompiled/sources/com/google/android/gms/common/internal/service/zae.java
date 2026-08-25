package com.google.android.gms.common.internal.service;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* JADX INFO: loaded from: classes.dex */
public final class zae {
    public zae() {
            r0 = this;
            r0.<init>()
            return
    }

    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> zaa(com.google.android.gms.common.api.GoogleApiClient r2) {
            r1 = this;
            com.google.android.gms.common.internal.service.zac r0 = new com.google.android.gms.common.internal.service.zac
            r0.<init>(r2)
            com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl r2 = r2.execute(r0)
            return r2
    }
}
