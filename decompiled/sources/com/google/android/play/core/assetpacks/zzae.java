package com.google.android.play.core.assetpacks;

/* JADX INFO: compiled from: com.google.android.play:core@@1.10.3 */
/* JADX INFO: loaded from: classes.dex */
final class zzae extends com.google.android.play.core.internal.zzah {
    public final /* synthetic */ java.util.Map zza;
    public final /* synthetic */ com.google.android.play.core.tasks.zzi zzb;
    public final /* synthetic */ com.google.android.play.core.assetpacks.zzaw zzc;

    public zzae(com.google.android.play.core.assetpacks.zzaw r1, com.google.android.play.core.tasks.zzi r2, java.util.Map r3, com.google.android.play.core.tasks.zzi r4) {
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
            com.google.android.play.core.assetpacks.zzaw r0 = r6.zzc     // Catch: android.os.RemoteException -> L25
            com.google.android.play.core.internal.zzas r0 = com.google.android.play.core.assetpacks.zzaw.zzs(r0)     // Catch: android.os.RemoteException -> L25
            android.os.IInterface r0 = r0.zze()     // Catch: android.os.RemoteException -> L25
            com.google.android.play.core.internal.zzu r0 = (com.google.android.play.core.internal.zzu) r0     // Catch: android.os.RemoteException -> L25
            com.google.android.play.core.assetpacks.zzaw r1 = r6.zzc     // Catch: android.os.RemoteException -> L25
            java.lang.String r1 = com.google.android.play.core.assetpacks.zzaw.zzu(r1)     // Catch: android.os.RemoteException -> L25
            java.util.Map r2 = r6.zza     // Catch: android.os.RemoteException -> L25
            android.os.Bundle r2 = com.google.android.play.core.assetpacks.zzaw.zzn(r2)     // Catch: android.os.RemoteException -> L25
            com.google.android.play.core.assetpacks.zzao r3 = new com.google.android.play.core.assetpacks.zzao     // Catch: android.os.RemoteException -> L25
            com.google.android.play.core.assetpacks.zzaw r4 = r6.zzc     // Catch: android.os.RemoteException -> L25
            com.google.android.play.core.tasks.zzi r5 = r6.zzb     // Catch: android.os.RemoteException -> L25
            r3.<init>(r4, r5)     // Catch: android.os.RemoteException -> L25
            r0.zze(r1, r2, r3)     // Catch: android.os.RemoteException -> L25
            return
        L25:
            r0 = move-exception
            com.google.android.play.core.internal.zzag r1 = com.google.android.play.core.assetpacks.zzaw.zzr()
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r3 = "syncPacks"
            r1.zzc(r0, r3, r2)
            com.google.android.play.core.tasks.zzi r1 = r6.zzb
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            r2.<init>(r0)
            r1.zzd(r2)
            return
    }
}
