package com.google.android.play.core.assetpacks;

/* JADX INFO: compiled from: com.google.android.play:core@@1.10.3 */
/* JADX INFO: loaded from: classes.dex */
final class zzag extends com.google.android.play.core.internal.zzah {
    public final /* synthetic */ int zza;
    public final /* synthetic */ java.lang.String zzb;
    public final /* synthetic */ java.lang.String zzc;
    public final /* synthetic */ int zzd;
    public final /* synthetic */ com.google.android.play.core.tasks.zzi zze;
    public final /* synthetic */ com.google.android.play.core.assetpacks.zzaw zzf;

    public zzag(com.google.android.play.core.assetpacks.zzaw r1, com.google.android.play.core.tasks.zzi r2, int r3, java.lang.String r4, java.lang.String r5, int r6, com.google.android.play.core.tasks.zzi r7) {
            r0 = this;
            r0.zzf = r1
            r0.zza = r3
            r0.zzb = r4
            r0.zzc = r5
            r0.zzd = r6
            r0.zze = r7
            r0.<init>(r2)
            return
    }

    @Override // com.google.android.play.core.internal.zzah
    public final void zza() {
            r7 = this;
            com.google.android.play.core.assetpacks.zzaw r0 = r7.zzf     // Catch: android.os.RemoteException -> L2f
            com.google.android.play.core.internal.zzas r0 = com.google.android.play.core.assetpacks.zzaw.zzs(r0)     // Catch: android.os.RemoteException -> L2f
            android.os.IInterface r0 = r0.zze()     // Catch: android.os.RemoteException -> L2f
            com.google.android.play.core.internal.zzu r0 = (com.google.android.play.core.internal.zzu) r0     // Catch: android.os.RemoteException -> L2f
            com.google.android.play.core.assetpacks.zzaw r1 = r7.zzf     // Catch: android.os.RemoteException -> L2f
            java.lang.String r1 = com.google.android.play.core.assetpacks.zzaw.zzu(r1)     // Catch: android.os.RemoteException -> L2f
            int r2 = r7.zza     // Catch: android.os.RemoteException -> L2f
            java.lang.String r3 = r7.zzb     // Catch: android.os.RemoteException -> L2f
            java.lang.String r4 = r7.zzc     // Catch: android.os.RemoteException -> L2f
            int r5 = r7.zzd     // Catch: android.os.RemoteException -> L2f
            android.os.Bundle r2 = com.google.android.play.core.assetpacks.zzaw.zzk(r2, r3, r4, r5)     // Catch: android.os.RemoteException -> L2f
            android.os.Bundle r3 = com.google.android.play.core.assetpacks.zzaw.zzm()     // Catch: android.os.RemoteException -> L2f
            com.google.android.play.core.assetpacks.zzaq r4 = new com.google.android.play.core.assetpacks.zzaq     // Catch: android.os.RemoteException -> L2f
            com.google.android.play.core.assetpacks.zzaw r5 = r7.zzf     // Catch: android.os.RemoteException -> L2f
            com.google.android.play.core.tasks.zzi r6 = r7.zze     // Catch: android.os.RemoteException -> L2f
            r4.<init>(r5, r6)     // Catch: android.os.RemoteException -> L2f
            r0.zzg(r1, r2, r3, r4)     // Catch: android.os.RemoteException -> L2f
            return
        L2f:
            r0 = move-exception
            com.google.android.play.core.internal.zzag r1 = com.google.android.play.core.assetpacks.zzaw.zzr()
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r3 = "notifyChunkTransferred"
            r1.zzc(r0, r3, r2)
            return
    }
}
