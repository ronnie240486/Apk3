package com.google.android.play.core.appupdate;

/* JADX INFO: compiled from: com.google.android.play:core@@1.10.3 */
/* JADX INFO: loaded from: classes.dex */
final class zzm extends com.google.android.play.core.internal.zzah {
    public final /* synthetic */ com.google.android.play.core.tasks.zzi zza;
    public final /* synthetic */ java.lang.String zzb;
    public final /* synthetic */ com.google.android.play.core.appupdate.zzq zzc;

    public zzm(com.google.android.play.core.appupdate.zzq r1, com.google.android.play.core.tasks.zzi r2, com.google.android.play.core.tasks.zzi r3, java.lang.String r4) {
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
            com.google.android.play.core.appupdate.zzq r0 = r6.zzc     // Catch: android.os.RemoteException -> L21
            com.google.android.play.core.internal.zzas r0 = r0.zza     // Catch: android.os.RemoteException -> L21
            android.os.IInterface r0 = r0.zze()     // Catch: android.os.RemoteException -> L21
            com.google.android.play.core.internal.zzp r0 = (com.google.android.play.core.internal.zzp) r0     // Catch: android.os.RemoteException -> L21
            com.google.android.play.core.appupdate.zzq r1 = r6.zzc     // Catch: android.os.RemoteException -> L21
            java.lang.String r1 = com.google.android.play.core.appupdate.zzq.zzh(r1)     // Catch: android.os.RemoteException -> L21
            android.os.Bundle r2 = com.google.android.play.core.appupdate.zzq.zzc()     // Catch: android.os.RemoteException -> L21
            com.google.android.play.core.appupdate.zzo r3 = new com.google.android.play.core.appupdate.zzo     // Catch: android.os.RemoteException -> L21
            com.google.android.play.core.appupdate.zzq r4 = r6.zzc     // Catch: android.os.RemoteException -> L21
            com.google.android.play.core.tasks.zzi r5 = r6.zza     // Catch: android.os.RemoteException -> L21
            r3.<init>(r4, r5)     // Catch: android.os.RemoteException -> L21
            r0.zzc(r1, r2, r3)     // Catch: android.os.RemoteException -> L21
            return
        L21:
            r0 = move-exception
            com.google.android.play.core.internal.zzag r1 = com.google.android.play.core.appupdate.zzq.zze()
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            java.lang.String r4 = r6.zzb
            r2[r3] = r4
            java.lang.String r3 = "completeUpdate(%s)"
            r1.zzc(r0, r3, r2)
            com.google.android.play.core.tasks.zzi r1 = r6.zza
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            r2.<init>(r0)
            r1.zzd(r2)
            return
    }
}
