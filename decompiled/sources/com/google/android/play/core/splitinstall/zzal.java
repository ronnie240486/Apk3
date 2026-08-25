package com.google.android.play.core.splitinstall;

/* JADX INFO: compiled from: com.google.android.play:core@@1.10.3 */
/* JADX INFO: loaded from: classes2.dex */
final class zzal extends com.google.android.play.core.internal.zzah {
    public final /* synthetic */ java.util.Collection zza;
    public final /* synthetic */ java.util.Collection zzb;
    public final /* synthetic */ com.google.android.play.core.tasks.zzi zzc;
    public final /* synthetic */ com.google.android.play.core.splitinstall.zzbc zzd;

    public zzal(com.google.android.play.core.splitinstall.zzbc r1, com.google.android.play.core.tasks.zzi r2, java.util.Collection r3, java.util.Collection r4, com.google.android.play.core.tasks.zzi r5) {
            r0 = this;
            r0.zzd = r1
            r0.zza = r3
            r0.zzb = r4
            r0.zzc = r5
            r0.<init>(r2)
            return
    }

    @Override // com.google.android.play.core.internal.zzah
    public final void zza() {
            r7 = this;
            java.util.Collection r0 = r7.zza
            java.util.ArrayList r0 = com.google.android.play.core.splitinstall.zzbc.zzm(r0)
            java.util.Collection r1 = r7.zzb
            java.util.ArrayList r1 = com.google.android.play.core.splitinstall.zzbc.zzl(r1)
            r0.addAll(r1)
            com.google.android.play.core.splitinstall.zzbc r1 = r7.zzd     // Catch: android.os.RemoteException -> L30
            com.google.android.play.core.internal.zzas r1 = r1.zza     // Catch: android.os.RemoteException -> L30
            android.os.IInterface r1 = r1.zze()     // Catch: android.os.RemoteException -> L30
            com.google.android.play.core.internal.zzca r1 = (com.google.android.play.core.internal.zzca) r1     // Catch: android.os.RemoteException -> L30
            com.google.android.play.core.splitinstall.zzbc r2 = r7.zzd     // Catch: android.os.RemoteException -> L30
            java.lang.String r2 = com.google.android.play.core.splitinstall.zzbc.zzk(r2)     // Catch: android.os.RemoteException -> L30
            android.os.Bundle r3 = com.google.android.play.core.splitinstall.zzbc.zza()     // Catch: android.os.RemoteException -> L30
            com.google.android.play.core.splitinstall.zzba r4 = new com.google.android.play.core.splitinstall.zzba     // Catch: android.os.RemoteException -> L30
            com.google.android.play.core.splitinstall.zzbc r5 = r7.zzd     // Catch: android.os.RemoteException -> L30
            com.google.android.play.core.tasks.zzi r6 = r7.zzc     // Catch: android.os.RemoteException -> L30
            r4.<init>(r5, r6)     // Catch: android.os.RemoteException -> L30
            r1.zzj(r2, r0, r3, r4)     // Catch: android.os.RemoteException -> L30
            return
        L30:
            r0 = move-exception
            com.google.android.play.core.internal.zzag r1 = com.google.android.play.core.splitinstall.zzbc.zzb()
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            java.util.Collection r4 = r7.zza
            r2[r3] = r4
            r3 = 1
            java.util.Collection r4 = r7.zzb
            r2[r3] = r4
            java.lang.String r3 = "startInstall(%s,%s)"
            r1.zzc(r0, r3, r2)
            com.google.android.play.core.tasks.zzi r1 = r7.zzc
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            r2.<init>(r0)
            r1.zzd(r2)
            return
    }
}
