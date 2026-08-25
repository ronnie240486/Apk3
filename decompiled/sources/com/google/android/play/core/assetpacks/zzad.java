package com.google.android.play.core.assetpacks;

/* JADX INFO: compiled from: com.google.android.play:core@@1.10.3 */
/* JADX INFO: loaded from: classes.dex */
final class zzad extends com.google.android.play.core.internal.zzah {
    public final /* synthetic */ java.util.List zza;
    public final /* synthetic */ com.google.android.play.core.tasks.zzi zzb;
    public final /* synthetic */ com.google.android.play.core.assetpacks.zzaw zzc;

    public zzad(com.google.android.play.core.assetpacks.zzaw r1, com.google.android.play.core.tasks.zzi r2, java.util.List r3, com.google.android.play.core.tasks.zzi r4) {
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
            java.util.List r0 = r7.zza
            java.util.ArrayList r0 = com.google.android.play.core.assetpacks.zzaw.zzv(r0)
            com.google.android.play.core.assetpacks.zzaw r1 = r7.zzc     // Catch: android.os.RemoteException -> L29
            com.google.android.play.core.internal.zzas r1 = com.google.android.play.core.assetpacks.zzaw.zzs(r1)     // Catch: android.os.RemoteException -> L29
            android.os.IInterface r1 = r1.zze()     // Catch: android.os.RemoteException -> L29
            com.google.android.play.core.internal.zzu r1 = (com.google.android.play.core.internal.zzu) r1     // Catch: android.os.RemoteException -> L29
            com.google.android.play.core.assetpacks.zzaw r2 = r7.zzc     // Catch: android.os.RemoteException -> L29
            java.lang.String r2 = com.google.android.play.core.assetpacks.zzaw.zzu(r2)     // Catch: android.os.RemoteException -> L29
            android.os.Bundle r3 = com.google.android.play.core.assetpacks.zzaw.zzm()     // Catch: android.os.RemoteException -> L29
            com.google.android.play.core.assetpacks.zzam r4 = new com.google.android.play.core.assetpacks.zzam     // Catch: android.os.RemoteException -> L29
            com.google.android.play.core.assetpacks.zzaw r5 = r7.zzc     // Catch: android.os.RemoteException -> L29
            com.google.android.play.core.tasks.zzi r6 = r7.zzb     // Catch: android.os.RemoteException -> L29
            r4.<init>(r5, r6)     // Catch: android.os.RemoteException -> L29
            r1.zzc(r2, r0, r3, r4)     // Catch: android.os.RemoteException -> L29
            return
        L29:
            r0 = move-exception
            com.google.android.play.core.internal.zzag r1 = com.google.android.play.core.assetpacks.zzaw.zzr()
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            java.util.List r4 = r7.zza
            r2[r3] = r4
            java.lang.String r3 = "cancelDownloads(%s)"
            r1.zzc(r0, r3, r2)
            return
    }
}
