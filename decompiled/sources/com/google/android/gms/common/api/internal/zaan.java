package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* JADX INFO: loaded from: classes.dex */
final class zaan extends com.google.android.gms.common.api.internal.zabg {
    public final /* synthetic */ com.google.android.gms.common.internal.BaseGmsClient.ConnectionProgressReportCallbacks zaa;

    public zaan(com.google.android.gms.common.api.internal.zabf r1, com.google.android.gms.common.internal.BaseGmsClient.ConnectionProgressReportCallbacks r2) {
            r0 = this;
            r0.zaa = r2
            r0.<init>(r1)
            return
    }

    @Override // com.google.android.gms.common.api.internal.zabg
    @javax.annotation.concurrent.GuardedBy("mLock")
    public final void zaa() {
            r4 = this;
            com.google.android.gms.common.internal.BaseGmsClient$ConnectionProgressReportCallbacks r0 = r4.zaa
            com.google.android.gms.common.ConnectionResult r1 = new com.google.android.gms.common.ConnectionResult
            r2 = 16
            r3 = 0
            r1.<init>(r2, r3)
            r0.onReportServiceBinding(r1)
            return
    }
}
