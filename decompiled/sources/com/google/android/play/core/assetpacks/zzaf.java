package com.google.android.play.core.assetpacks;

/* JADX INFO: compiled from: com.google.android.play:core@@1.10.3 */
/* JADX INFO: loaded from: classes.dex */
final class zzaf extends com.google.android.play.core.internal.zzah {
    public final /* synthetic */ java.util.List zza;
    public final /* synthetic */ java.util.Map zzb;
    public final /* synthetic */ com.google.android.play.core.tasks.zzi zzc;
    public final /* synthetic */ com.google.android.play.core.assetpacks.zzbe zzd;
    public final /* synthetic */ com.google.android.play.core.assetpacks.zzaw zze;

    public zzaf(com.google.android.play.core.assetpacks.zzaw r1, com.google.android.play.core.tasks.zzi r2, java.util.List r3, java.util.Map r4, com.google.android.play.core.tasks.zzi r5, com.google.android.play.core.assetpacks.zzbe r6) {
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
            java.util.List r0 = r11.zza
            java.util.ArrayList r0 = com.google.android.play.core.assetpacks.zzaw.zzv(r0)
            com.google.android.play.core.assetpacks.zzaw r1 = r11.zze     // Catch: android.os.RemoteException -> L36
            com.google.android.play.core.internal.zzas r1 = com.google.android.play.core.assetpacks.zzaw.zzs(r1)     // Catch: android.os.RemoteException -> L36
            android.os.IInterface r1 = r1.zze()     // Catch: android.os.RemoteException -> L36
            com.google.android.play.core.internal.zzu r1 = (com.google.android.play.core.internal.zzu) r1     // Catch: android.os.RemoteException -> L36
            com.google.android.play.core.assetpacks.zzaw r2 = r11.zze     // Catch: android.os.RemoteException -> L36
            java.lang.String r2 = com.google.android.play.core.assetpacks.zzaw.zzu(r2)     // Catch: android.os.RemoteException -> L36
            java.util.Map r3 = r11.zzb     // Catch: android.os.RemoteException -> L36
            android.os.Bundle r3 = com.google.android.play.core.assetpacks.zzaw.zzn(r3)     // Catch: android.os.RemoteException -> L36
            com.google.android.play.core.assetpacks.zzau r10 = new com.google.android.play.core.assetpacks.zzau     // Catch: android.os.RemoteException -> L36
            com.google.android.play.core.assetpacks.zzaw r5 = r11.zze     // Catch: android.os.RemoteException -> L36
            com.google.android.play.core.tasks.zzi r6 = r11.zzc     // Catch: android.os.RemoteException -> L36
            com.google.android.play.core.assetpacks.zzco r7 = com.google.android.play.core.assetpacks.zzaw.zzp(r5)     // Catch: android.os.RemoteException -> L36
            com.google.android.play.core.assetpacks.zzeb r8 = com.google.android.play.core.assetpacks.zzaw.zzq(r5)     // Catch: android.os.RemoteException -> L36
            com.google.android.play.core.assetpacks.zzbe r9 = r11.zzd     // Catch: android.os.RemoteException -> L36
            r4 = r10
            r4.<init>(r5, r6, r7, r8, r9)     // Catch: android.os.RemoteException -> L36
            r1.zzk(r2, r0, r3, r10)     // Catch: android.os.RemoteException -> L36
            return
        L36:
            r0 = move-exception
            com.google.android.play.core.internal.zzag r1 = com.google.android.play.core.assetpacks.zzaw.zzr()
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            java.util.List r4 = r11.zza
            r2[r3] = r4
            java.lang.String r3 = "getPackStates(%s)"
            r1.zzc(r0, r3, r2)
            com.google.android.play.core.tasks.zzi r1 = r11.zzc
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            r2.<init>(r0)
            r1.zzd(r2)
            return
    }
}
