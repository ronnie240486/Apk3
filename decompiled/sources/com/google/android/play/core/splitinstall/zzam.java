package com.google.android.play.core.splitinstall;

/* JADX INFO: compiled from: com.google.android.play:core@@1.10.3 */
/* JADX INFO: loaded from: classes2.dex */
final class zzam extends com.google.android.play.core.internal.zzah {
    public final /* synthetic */ java.util.List zza;
    public final /* synthetic */ com.google.android.play.core.tasks.zzi zzb;
    public final /* synthetic */ com.google.android.play.core.splitinstall.zzbc zzc;

    public zzam(com.google.android.play.core.splitinstall.zzbc r1, com.google.android.play.core.tasks.zzi r2, java.util.List r3, com.google.android.play.core.tasks.zzi r4) {
            r0 = this;
            r0.zzc = r1
            r0.zza = r3
            r0.zzb = r4
            r0.<init>(r2)
            return
    }

    @Override // com.google.android.play.core.internal.zzah
    public final void zza() {
            r7 = this;
            com.google.android.play.core.splitinstall.zzbc r0 = r7.zzc     // Catch: android.os.RemoteException -> L27
            com.google.android.play.core.internal.zzas r0 = r0.zza     // Catch: android.os.RemoteException -> L27
            android.os.IInterface r0 = r0.zze()     // Catch: android.os.RemoteException -> L27
            com.google.android.play.core.internal.zzca r0 = (com.google.android.play.core.internal.zzca) r0     // Catch: android.os.RemoteException -> L27
            com.google.android.play.core.splitinstall.zzbc r1 = r7.zzc     // Catch: android.os.RemoteException -> L27
            java.lang.String r1 = com.google.android.play.core.splitinstall.zzbc.zzk(r1)     // Catch: android.os.RemoteException -> L27
            java.util.List r2 = r7.zza     // Catch: android.os.RemoteException -> L27
            java.util.ArrayList r2 = com.google.android.play.core.splitinstall.zzbc.zzm(r2)     // Catch: android.os.RemoteException -> L27
            android.os.Bundle r3 = com.google.android.play.core.splitinstall.zzbc.zza()     // Catch: android.os.RemoteException -> L27
            com.google.android.play.core.splitinstall.zzax r4 = new com.google.android.play.core.splitinstall.zzax     // Catch: android.os.RemoteException -> L27
            com.google.android.play.core.splitinstall.zzbc r5 = r7.zzc     // Catch: android.os.RemoteException -> L27
            com.google.android.play.core.tasks.zzi r6 = r7.zzb     // Catch: android.os.RemoteException -> L27
            r4.<init>(r5, r6)     // Catch: android.os.RemoteException -> L27
            r0.zzg(r1, r2, r3, r4)     // Catch: android.os.RemoteException -> L27
            return
        L27:
            r0 = move-exception
            com.google.android.play.core.internal.zzag r1 = com.google.android.play.core.splitinstall.zzbc.zzb()
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            java.util.List r4 = r7.zza
            r2[r3] = r4
            java.lang.String r3 = "deferredUninstall(%s)"
            r1.zzc(r0, r3, r2)
            com.google.android.play.core.tasks.zzi r1 = r7.zzb
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            r2.<init>(r0)
            r1.zzd(r2)
            return
    }
}
