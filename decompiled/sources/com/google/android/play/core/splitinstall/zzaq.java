package com.google.android.play.core.splitinstall;

/* JADX INFO: compiled from: com.google.android.play:core@@1.10.3 */
/* JADX INFO: loaded from: classes2.dex */
final class zzaq extends com.google.android.play.core.internal.zzah {
    public final /* synthetic */ int zza;
    public final /* synthetic */ com.google.android.play.core.tasks.zzi zzb;
    public final /* synthetic */ com.google.android.play.core.splitinstall.zzbc zzc;

    public zzaq(com.google.android.play.core.splitinstall.zzbc r1, com.google.android.play.core.tasks.zzi r2, int r3, com.google.android.play.core.tasks.zzi r4) {
            r0 = this;
            r0.zzc = r1
            r0.zza = r3
            r0.zzb = r4
            r0.<init>(r2)
            return
    }

    @Override // com.google.android.play.core.internal.zzah
    public final void zza() {
            r6 = this;
            com.google.android.play.core.splitinstall.zzbc r0 = r6.zzc     // Catch: android.os.RemoteException -> L1d
            com.google.android.play.core.internal.zzas r0 = r0.zza     // Catch: android.os.RemoteException -> L1d
            android.os.IInterface r0 = r0.zze()     // Catch: android.os.RemoteException -> L1d
            com.google.android.play.core.internal.zzca r0 = (com.google.android.play.core.internal.zzca) r0     // Catch: android.os.RemoteException -> L1d
            com.google.android.play.core.splitinstall.zzbc r1 = r6.zzc     // Catch: android.os.RemoteException -> L1d
            java.lang.String r2 = com.google.android.play.core.splitinstall.zzbc.zzk(r1)     // Catch: android.os.RemoteException -> L1d
            int r3 = r6.zza     // Catch: android.os.RemoteException -> L1d
            com.google.android.play.core.splitinstall.zzay r4 = new com.google.android.play.core.splitinstall.zzay     // Catch: android.os.RemoteException -> L1d
            com.google.android.play.core.tasks.zzi r5 = r6.zzb     // Catch: android.os.RemoteException -> L1d
            r4.<init>(r1, r5)     // Catch: android.os.RemoteException -> L1d
            r0.zzh(r2, r3, r4)     // Catch: android.os.RemoteException -> L1d
            return
        L1d:
            r0 = move-exception
            com.google.android.play.core.internal.zzag r1 = com.google.android.play.core.splitinstall.zzbc.zzb()
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            int r4 = r6.zza
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r2[r3] = r4
            java.lang.String r3 = "getSessionState(%d)"
            r1.zzc(r0, r3, r2)
            com.google.android.play.core.tasks.zzi r1 = r6.zzb
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            r2.<init>(r0)
            r1.zzd(r2)
            return
    }
}
