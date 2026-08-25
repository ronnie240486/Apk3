package com.google.android.play.core.internal;

/* JADX INFO: compiled from: com.google.android.play:core@@1.10.3 */
/* JADX INFO: loaded from: classes.dex */
final class zzar implements android.content.ServiceConnection {
    public final /* synthetic */ com.google.android.play.core.internal.zzas zza;

    public /* synthetic */ zzar(com.google.android.play.core.internal.zzas r1) {
            r0 = this;
            r0.zza = r1
            r0.<init>()
            return
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(android.content.ComponentName r4, android.os.IBinder r5) {
            r3 = this;
            com.google.android.play.core.internal.zzas r0 = r3.zza
            com.google.android.play.core.internal.zzag r0 = com.google.android.play.core.internal.zzas.zzf(r0)
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r4
            java.lang.String r4 = "ServiceConnectionImpl.onServiceConnected(%s)"
            r0.zzd(r4, r1)
            com.google.android.play.core.internal.zzas r4 = r3.zza
            com.google.android.play.core.internal.zzao r0 = new com.google.android.play.core.internal.zzao
            r0.<init>(r3, r5)
            android.os.Handler r4 = r4.zzc()
            r4.post(r0)
            return
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(android.content.ComponentName r4) {
            r3 = this;
            com.google.android.play.core.internal.zzas r0 = r3.zza
            com.google.android.play.core.internal.zzag r0 = com.google.android.play.core.internal.zzas.zzf(r0)
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r4
            java.lang.String r4 = "ServiceConnectionImpl.onServiceDisconnected(%s)"
            r0.zzd(r4, r1)
            com.google.android.play.core.internal.zzas r4 = r3.zza
            com.google.android.play.core.internal.zzap r0 = new com.google.android.play.core.internal.zzap
            r0.<init>(r3)
            android.os.Handler r4 = r4.zzc()
            r4.post(r0)
            return
    }
}
