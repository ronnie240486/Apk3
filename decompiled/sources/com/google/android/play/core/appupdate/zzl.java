package com.google.android.play.core.appupdate;

/* JADX INFO: compiled from: com.google.android.play:core@@1.10.3 */
/* JADX INFO: loaded from: classes.dex */
final class zzl extends com.google.android.play.core.internal.zzah {
    public final /* synthetic */ java.lang.String zza;
    public final /* synthetic */ com.google.android.play.core.tasks.zzi zzb;
    public final /* synthetic */ com.google.android.play.core.appupdate.zzq zzc;

    public zzl(com.google.android.play.core.appupdate.zzq r1, com.google.android.play.core.tasks.zzi r2, java.lang.String r3, com.google.android.play.core.tasks.zzi r4) {
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
            com.google.android.play.core.appupdate.zzq r0 = r7.zzc     // Catch: android.os.RemoteException -> L25
            com.google.android.play.core.internal.zzas r0 = r0.zza     // Catch: android.os.RemoteException -> L25
            android.os.IInterface r0 = r0.zze()     // Catch: android.os.RemoteException -> L25
            com.google.android.play.core.internal.zzp r0 = (com.google.android.play.core.internal.zzp) r0     // Catch: android.os.RemoteException -> L25
            com.google.android.play.core.appupdate.zzq r1 = r7.zzc     // Catch: android.os.RemoteException -> L25
            java.lang.String r2 = com.google.android.play.core.appupdate.zzq.zzh(r1)     // Catch: android.os.RemoteException -> L25
            java.lang.String r3 = r7.zza     // Catch: android.os.RemoteException -> L25
            android.os.Bundle r1 = com.google.android.play.core.appupdate.zzq.zzb(r1, r3)     // Catch: android.os.RemoteException -> L25
            com.google.android.play.core.appupdate.zzp r3 = new com.google.android.play.core.appupdate.zzp     // Catch: android.os.RemoteException -> L25
            com.google.android.play.core.appupdate.zzq r4 = r7.zzc     // Catch: android.os.RemoteException -> L25
            com.google.android.play.core.tasks.zzi r5 = r7.zzb     // Catch: android.os.RemoteException -> L25
            java.lang.String r6 = r7.zza     // Catch: android.os.RemoteException -> L25
            r3.<init>(r4, r5, r6)     // Catch: android.os.RemoteException -> L25
            r0.zzd(r2, r1, r3)     // Catch: android.os.RemoteException -> L25
            return
        L25:
            r0 = move-exception
            com.google.android.play.core.internal.zzag r1 = com.google.android.play.core.appupdate.zzq.zze()
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            java.lang.String r4 = r7.zza
            r2[r3] = r4
            java.lang.String r3 = "requestUpdateInfo(%s)"
            r1.zzc(r0, r3, r2)
            com.google.android.play.core.tasks.zzi r1 = r7.zzb
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            r2.<init>(r0)
            r1.zzd(r2)
            return
    }
}
