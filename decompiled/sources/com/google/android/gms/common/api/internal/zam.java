package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* JADX INFO: loaded from: classes.dex */
final class zam {
    private final int zaa;
    private final com.google.android.gms.common.ConnectionResult zab;

    public zam(com.google.android.gms.common.ConnectionResult r1, int r2) {
            r0 = this;
            r0.<init>()
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r1)
            r0.zab = r1
            r0.zaa = r2
            return
    }

    public final int zaa() {
            r1 = this;
            int r0 = r1.zaa
            return r0
    }

    public final com.google.android.gms.common.ConnectionResult zab() {
            r1 = this;
            com.google.android.gms.common.ConnectionResult r0 = r1.zab
            return r0
    }
}
