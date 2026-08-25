package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* JADX INFO: loaded from: classes.dex */
final class zaam extends com.google.android.gms.common.api.internal.zabg {
    public final /* synthetic */ com.google.android.gms.common.ConnectionResult zaa;
    public final /* synthetic */ com.google.android.gms.common.api.internal.zaao zab;

    public zaam(com.google.android.gms.common.api.internal.zaao r1, com.google.android.gms.common.api.internal.zabf r2, com.google.android.gms.common.ConnectionResult r3) {
            r0 = this;
            r0.zab = r1
            r0.zaa = r3
            r0.<init>(r2)
            return
    }

    @Override // com.google.android.gms.common.api.internal.zabg
    @javax.annotation.concurrent.GuardedBy("mLock")
    public final void zaa() {
            r2 = this;
            com.google.android.gms.common.api.internal.zaao r0 = r2.zab
            com.google.android.gms.common.api.internal.zaaw r0 = r0.zaa
            com.google.android.gms.common.ConnectionResult r1 = r2.zaa
            com.google.android.gms.common.api.internal.zaaw.zas(r0, r1)
            return
    }
}
