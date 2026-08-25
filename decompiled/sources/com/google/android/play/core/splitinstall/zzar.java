package com.google.android.play.core.splitinstall;

/* JADX INFO: compiled from: com.google.android.play:core@@1.10.3 */
/* JADX INFO: loaded from: classes2.dex */
final class zzar extends com.google.android.play.core.internal.zzah {
    public final /* synthetic */ com.google.android.play.core.tasks.zzi zza;
    public final /* synthetic */ com.google.android.play.core.splitinstall.zzbc zzb;

    public zzar(com.google.android.play.core.splitinstall.zzbc r1, com.google.android.play.core.tasks.zzi r2, com.google.android.play.core.tasks.zzi r3) {
            r0 = this;
            r0.zzb = r1
            r0.zza = r3
            r0.<init>(r2)
            return
    }

    @Override // com.google.android.play.core.internal.zzah
    public final void zza() {
            r5 = this;
            com.google.android.play.core.splitinstall.zzbc r0 = r5.zzb     // Catch: android.os.RemoteException -> L1b
            com.google.android.play.core.internal.zzas r0 = r0.zza     // Catch: android.os.RemoteException -> L1b
            android.os.IInterface r0 = r0.zze()     // Catch: android.os.RemoteException -> L1b
            com.google.android.play.core.internal.zzca r0 = (com.google.android.play.core.internal.zzca) r0     // Catch: android.os.RemoteException -> L1b
            com.google.android.play.core.splitinstall.zzbc r1 = r5.zzb     // Catch: android.os.RemoteException -> L1b
            java.lang.String r2 = com.google.android.play.core.splitinstall.zzbc.zzk(r1)     // Catch: android.os.RemoteException -> L1b
            com.google.android.play.core.splitinstall.zzaz r3 = new com.google.android.play.core.splitinstall.zzaz     // Catch: android.os.RemoteException -> L1b
            com.google.android.play.core.tasks.zzi r4 = r5.zza     // Catch: android.os.RemoteException -> L1b
            r3.<init>(r1, r4)     // Catch: android.os.RemoteException -> L1b
            r0.zzi(r2, r3)     // Catch: android.os.RemoteException -> L1b
            return
        L1b:
            r0 = move-exception
            com.google.android.play.core.internal.zzag r1 = com.google.android.play.core.splitinstall.zzbc.zzb()
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r3 = "getSessionStates"
            r1.zzc(r0, r3, r2)
            com.google.android.play.core.tasks.zzi r1 = r5.zza
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            r2.<init>(r0)
            r1.zzd(r2)
            return
    }
}
