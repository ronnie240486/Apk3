package com.google.android.play.core.assetpacks;

/* JADX INFO: compiled from: com.google.android.play:core@@1.10.3 */
/* JADX INFO: loaded from: classes.dex */
final class zzab extends com.google.android.play.core.internal.zzah {
    public final /* synthetic */ java.lang.String zza;
    public final /* synthetic */ com.google.android.play.core.tasks.zzi zzb;
    public final /* synthetic */ com.google.android.play.core.assetpacks.zzaw zzc;

    public zzab(com.google.android.play.core.assetpacks.zzaw r1, com.google.android.play.core.tasks.zzi r2, java.lang.String r3, com.google.android.play.core.tasks.zzi r4) {
            r0 = this;
            r0.zzc = r1
            r0.zza = r3
            r0.zzb = r4
            r0.<init>(r2)
            return
    }

    @Override // com.google.android.play.core.internal.zzah
    public final void zza() {
            r8 = this;
            r0 = 0
            com.google.android.play.core.assetpacks.zzaw r1 = r8.zzc     // Catch: android.os.RemoteException -> L2a
            com.google.android.play.core.internal.zzas r1 = com.google.android.play.core.assetpacks.zzaw.zzs(r1)     // Catch: android.os.RemoteException -> L2a
            android.os.IInterface r1 = r1.zze()     // Catch: android.os.RemoteException -> L2a
            com.google.android.play.core.internal.zzu r1 = (com.google.android.play.core.internal.zzu) r1     // Catch: android.os.RemoteException -> L2a
            com.google.android.play.core.assetpacks.zzaw r2 = r8.zzc     // Catch: android.os.RemoteException -> L2a
            java.lang.String r2 = com.google.android.play.core.assetpacks.zzaw.zzu(r2)     // Catch: android.os.RemoteException -> L2a
            java.lang.String r3 = r8.zza     // Catch: android.os.RemoteException -> L2a
            android.os.Bundle r3 = com.google.android.play.core.assetpacks.zzaw.zzl(r0, r3)     // Catch: android.os.RemoteException -> L2a
            android.os.Bundle r4 = com.google.android.play.core.assetpacks.zzaw.zzm()     // Catch: android.os.RemoteException -> L2a
            com.google.android.play.core.assetpacks.zzat r5 = new com.google.android.play.core.assetpacks.zzat     // Catch: android.os.RemoteException -> L2a
            com.google.android.play.core.assetpacks.zzaw r6 = r8.zzc     // Catch: android.os.RemoteException -> L2a
            com.google.android.play.core.tasks.zzi r7 = r8.zzb     // Catch: android.os.RemoteException -> L2a
            r5.<init>(r6, r7)     // Catch: android.os.RemoteException -> L2a
            r1.zzj(r2, r3, r4, r5)     // Catch: android.os.RemoteException -> L2a
            return
        L2a:
            r1 = move-exception
            com.google.android.play.core.internal.zzag r2 = com.google.android.play.core.assetpacks.zzaw.zzr()
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r4 = r8.zza
            r3[r0] = r4
            java.lang.String r0 = "removePack(%s)"
            r2.zzc(r1, r0, r3)
            return
    }
}
