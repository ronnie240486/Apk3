package com.google.android.gms.common;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzv extends com.google.android.gms.common.zzw {
    private final java.util.concurrent.Callable<java.lang.String> zzd;

    public /* synthetic */ zzv(java.util.concurrent.Callable r3) {
            r2 = this;
            r0 = 0
            r1 = 0
            r2.<init>(r0, r1, r1)
            r2.zzd = r3
            return
    }

    @Override // com.google.android.gms.common.zzw
    public final java.lang.String zza() {
            r2 = this;
            java.util.concurrent.Callable<java.lang.String> r0 = r2.zzd     // Catch: java.lang.Exception -> L9
            java.lang.Object r0 = r0.call()     // Catch: java.lang.Exception -> L9
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Exception -> L9
            return r0
        L9:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
    }
}
