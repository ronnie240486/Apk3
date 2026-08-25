package com.google.android.play.core.assetpacks;

/* JADX INFO: compiled from: com.google.android.play:core@@1.10.3 */
/* JADX INFO: loaded from: classes.dex */
final class zzak extends com.google.android.play.core.internal.zzah {
    public final /* synthetic */ com.google.android.play.core.tasks.zzi zza;
    public final /* synthetic */ com.google.android.play.core.assetpacks.zzaw zzb;

    public zzak(com.google.android.play.core.assetpacks.zzaw r1, com.google.android.play.core.tasks.zzi r2, com.google.android.play.core.tasks.zzi r3) {
            r0 = this;
            r0.zzb = r1
            r0.zza = r3
            r0.<init>(r2)
            return
    }

    @Override // com.google.android.play.core.internal.zzah
    public final void zza() {
            r6 = this;
            com.google.android.play.core.assetpacks.zzaw r0 = r6.zzb     // Catch: android.os.RemoteException -> L23
            com.google.android.play.core.internal.zzas r0 = com.google.android.play.core.assetpacks.zzaw.zzt(r0)     // Catch: android.os.RemoteException -> L23
            android.os.IInterface r0 = r0.zze()     // Catch: android.os.RemoteException -> L23
            com.google.android.play.core.internal.zzu r0 = (com.google.android.play.core.internal.zzu) r0     // Catch: android.os.RemoteException -> L23
            com.google.android.play.core.assetpacks.zzaw r1 = r6.zzb     // Catch: android.os.RemoteException -> L23
            java.lang.String r1 = com.google.android.play.core.assetpacks.zzaw.zzu(r1)     // Catch: android.os.RemoteException -> L23
            android.os.Bundle r2 = com.google.android.play.core.assetpacks.zzaw.zzm()     // Catch: android.os.RemoteException -> L23
            com.google.android.play.core.assetpacks.zzap r3 = new com.google.android.play.core.assetpacks.zzap     // Catch: android.os.RemoteException -> L23
            com.google.android.play.core.assetpacks.zzaw r4 = r6.zzb     // Catch: android.os.RemoteException -> L23
            com.google.android.play.core.tasks.zzi r5 = r6.zza     // Catch: android.os.RemoteException -> L23
            r3.<init>(r4, r5)     // Catch: android.os.RemoteException -> L23
            r0.zzf(r1, r2, r3)     // Catch: android.os.RemoteException -> L23
            return
        L23:
            r0 = move-exception
            com.google.android.play.core.internal.zzag r1 = com.google.android.play.core.assetpacks.zzaw.zzr()
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r3 = "keepAlive"
            r1.zzc(r0, r3, r2)
            return
    }
}
