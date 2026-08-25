package com.google.android.play.core.review;

/* JADX INFO: compiled from: com.google.android.play:core@@1.10.3 */
/* JADX INFO: loaded from: classes2.dex */
final class zzf extends com.google.android.play.core.internal.zzah {
    public final /* synthetic */ com.google.android.play.core.tasks.zzi zza;
    public final /* synthetic */ com.google.android.play.core.review.zzi zzb;

    public zzf(com.google.android.play.core.review.zzi r1, com.google.android.play.core.tasks.zzi r2, com.google.android.play.core.tasks.zzi r3) {
            r0 = this;
            r0.zzb = r1
            r0.zza = r3
            r0.<init>(r2)
            return
    }

    @Override // com.google.android.play.core.internal.zzah
    public final void zza() {
            r6 = this;
            com.google.android.play.core.review.zzi r0 = r6.zzb     // Catch: android.os.RemoteException -> L27
            com.google.android.play.core.internal.zzas r0 = r0.zza     // Catch: android.os.RemoteException -> L27
            android.os.IInterface r0 = r0.zze()     // Catch: android.os.RemoteException -> L27
            com.google.android.play.core.internal.zzac r0 = (com.google.android.play.core.internal.zzac) r0     // Catch: android.os.RemoteException -> L27
            com.google.android.play.core.review.zzi r1 = r6.zzb     // Catch: android.os.RemoteException -> L27
            java.lang.String r1 = com.google.android.play.core.review.zzi.zzc(r1)     // Catch: android.os.RemoteException -> L27
            java.lang.String r2 = "review"
            android.os.Bundle r2 = com.google.android.play.core.common.PlayCoreVersion.zza(r2)     // Catch: android.os.RemoteException -> L27
            com.google.android.play.core.review.zzh r3 = new com.google.android.play.core.review.zzh     // Catch: android.os.RemoteException -> L27
            com.google.android.play.core.review.zzi r4 = r6.zzb     // Catch: android.os.RemoteException -> L27
            com.google.android.play.core.tasks.zzi r5 = r6.zza     // Catch: android.os.RemoteException -> L27
            com.google.android.play.core.review.zzi.zzc(r4)     // Catch: android.os.RemoteException -> L27
            r3.<init>(r4, r5)     // Catch: android.os.RemoteException -> L27
            r0.zzc(r1, r2, r3)     // Catch: android.os.RemoteException -> L27
            return
        L27:
            r0 = move-exception
            com.google.android.play.core.internal.zzag r1 = com.google.android.play.core.review.zzi.zza()
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            com.google.android.play.core.review.zzi r4 = r6.zzb
            java.lang.String r4 = com.google.android.play.core.review.zzi.zzc(r4)
            r2[r3] = r4
            java.lang.String r3 = "error requesting in-app review for %s"
            r1.zzc(r0, r3, r2)
            com.google.android.play.core.tasks.zzi r1 = r6.zza
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            r2.<init>(r0)
            r1.zzd(r2)
            return
    }
}
