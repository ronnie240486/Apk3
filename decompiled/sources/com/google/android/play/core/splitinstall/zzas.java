package com.google.android.play.core.splitinstall;

/* JADX INFO: compiled from: com.google.android.play:core@@1.10.3 */
/* JADX INFO: loaded from: classes2.dex */
final class zzas extends com.google.android.play.core.internal.zzah {
    public final /* synthetic */ int zza;
    public final /* synthetic */ com.google.android.play.core.tasks.zzi zzb;
    public final /* synthetic */ com.google.android.play.core.splitinstall.zzbc zzc;

    public zzas(com.google.android.play.core.splitinstall.zzbc r1, com.google.android.play.core.tasks.zzi r2, int r3, com.google.android.play.core.tasks.zzi r4) {
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
            com.google.android.play.core.splitinstall.zzbc r0 = r7.zzc     // Catch: android.os.RemoteException -> L23
            com.google.android.play.core.internal.zzas r0 = r0.zza     // Catch: android.os.RemoteException -> L23
            android.os.IInterface r0 = r0.zze()     // Catch: android.os.RemoteException -> L23
            com.google.android.play.core.internal.zzca r0 = (com.google.android.play.core.internal.zzca) r0     // Catch: android.os.RemoteException -> L23
            com.google.android.play.core.splitinstall.zzbc r1 = r7.zzc     // Catch: android.os.RemoteException -> L23
            java.lang.String r1 = com.google.android.play.core.splitinstall.zzbc.zzk(r1)     // Catch: android.os.RemoteException -> L23
            int r2 = r7.zza     // Catch: android.os.RemoteException -> L23
            android.os.Bundle r3 = com.google.android.play.core.splitinstall.zzbc.zza()     // Catch: android.os.RemoteException -> L23
            com.google.android.play.core.splitinstall.zzat r4 = new com.google.android.play.core.splitinstall.zzat     // Catch: android.os.RemoteException -> L23
            com.google.android.play.core.splitinstall.zzbc r5 = r7.zzc     // Catch: android.os.RemoteException -> L23
            com.google.android.play.core.tasks.zzi r6 = r7.zzb     // Catch: android.os.RemoteException -> L23
            r4.<init>(r5, r6)     // Catch: android.os.RemoteException -> L23
            r0.zzc(r1, r2, r3, r4)     // Catch: android.os.RemoteException -> L23
            return
        L23:
            r0 = move-exception
            com.google.android.play.core.internal.zzag r1 = com.google.android.play.core.splitinstall.zzbc.zzb()
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            int r4 = r7.zza
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r2[r3] = r4
            java.lang.String r3 = "cancelInstall(%d)"
            r1.zzc(r0, r3, r2)
            com.google.android.play.core.tasks.zzi r1 = r7.zzb
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            r2.<init>(r0)
            r1.zzd(r2)
            return
    }
}
