package com.google.android.play.core.assetpacks;

/* JADX INFO: compiled from: com.google.android.play:core@@1.10.3 */
/* JADX INFO: loaded from: classes.dex */
final class zzah extends com.google.android.play.core.internal.zzah {
    public final /* synthetic */ int zza;
    public final /* synthetic */ java.lang.String zzb;
    public final /* synthetic */ com.google.android.play.core.tasks.zzi zzc;
    public final /* synthetic */ int zzd;
    public final /* synthetic */ com.google.android.play.core.assetpacks.zzaw zze;

    public zzah(com.google.android.play.core.assetpacks.zzaw r1, com.google.android.play.core.tasks.zzi r2, int r3, java.lang.String r4, com.google.android.play.core.tasks.zzi r5, int r6) {
            r0 = this;
            r0.zze = r1
            r0.zza = r3
            r0.zzb = r4
            r0.zzc = r5
            r0.zzd = r6
            r0.<init>(r2)
            return
    }

    @Override // com.google.android.play.core.internal.zzah
    public final void zza() {
            r11 = this;
            com.google.android.play.core.assetpacks.zzaw r0 = r11.zze     // Catch: android.os.RemoteException -> L32
            com.google.android.play.core.internal.zzas r0 = com.google.android.play.core.assetpacks.zzaw.zzs(r0)     // Catch: android.os.RemoteException -> L32
            android.os.IInterface r0 = r0.zze()     // Catch: android.os.RemoteException -> L32
            com.google.android.play.core.internal.zzu r0 = (com.google.android.play.core.internal.zzu) r0     // Catch: android.os.RemoteException -> L32
            com.google.android.play.core.assetpacks.zzaw r1 = r11.zze     // Catch: android.os.RemoteException -> L32
            java.lang.String r1 = com.google.android.play.core.assetpacks.zzaw.zzu(r1)     // Catch: android.os.RemoteException -> L32
            int r2 = r11.zza     // Catch: android.os.RemoteException -> L32
            java.lang.String r3 = r11.zzb     // Catch: android.os.RemoteException -> L32
            android.os.Bundle r2 = com.google.android.play.core.assetpacks.zzaw.zzl(r2, r3)     // Catch: android.os.RemoteException -> L32
            android.os.Bundle r3 = com.google.android.play.core.assetpacks.zzaw.zzm()     // Catch: android.os.RemoteException -> L32
            com.google.android.play.core.assetpacks.zzar r10 = new com.google.android.play.core.assetpacks.zzar     // Catch: android.os.RemoteException -> L32
            com.google.android.play.core.assetpacks.zzaw r5 = r11.zze     // Catch: android.os.RemoteException -> L32
            com.google.android.play.core.tasks.zzi r6 = r11.zzc     // Catch: android.os.RemoteException -> L32
            int r7 = r11.zza     // Catch: android.os.RemoteException -> L32
            java.lang.String r8 = r11.zzb     // Catch: android.os.RemoteException -> L32
            int r9 = r11.zzd     // Catch: android.os.RemoteException -> L32
            r4 = r10
            r4.<init>(r5, r6, r7, r8, r9)     // Catch: android.os.RemoteException -> L32
            r0.zzh(r1, r2, r3, r10)     // Catch: android.os.RemoteException -> L32
            return
        L32:
            r0 = move-exception
            com.google.android.play.core.internal.zzag r1 = com.google.android.play.core.assetpacks.zzaw.zzr()
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r3 = "notifyModuleCompleted"
            r1.zzc(r0, r3, r2)
            return
    }
}
