package com.google.android.gms.common.internal.service;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* JADX INFO: loaded from: classes.dex */
final class zad extends com.google.android.gms.common.internal.service.zaa {
    private final com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder<com.google.android.gms.common.api.Status> zaa;

    public zad(com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder<com.google.android.gms.common.api.Status> r1) {
            r0 = this;
            r0.<init>()
            r0.zaa = r1
            return
    }

    @Override // com.google.android.gms.common.internal.service.zaa, com.google.android.gms.common.internal.service.zak
    public final void zab(int r3) throws android.os.RemoteException {
            r2 = this;
            com.google.android.gms.common.api.internal.BaseImplementation$ResultHolder<com.google.android.gms.common.api.Status> r0 = r2.zaa
            com.google.android.gms.common.api.Status r1 = new com.google.android.gms.common.api.Status
            r1.<init>(r3)
            r0.setResult(r1)
            return
    }
}
