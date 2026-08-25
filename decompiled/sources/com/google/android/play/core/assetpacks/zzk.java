package com.google.android.play.core.assetpacks;

/* JADX INFO: compiled from: com.google.android.play:core@@1.10.3 */
/* JADX INFO: loaded from: classes2.dex */
final class zzk extends android.os.ResultReceiver {
    public final /* synthetic */ com.google.android.play.core.tasks.zzi zza;
    public final /* synthetic */ com.google.android.play.core.assetpacks.zzl zzb;

    public zzk(com.google.android.play.core.assetpacks.zzl r1, android.os.Handler r2, com.google.android.play.core.tasks.zzi r3) {
            r0 = this;
            r0.zzb = r1
            r0.zza = r3
            r0.<init>(r2)
            return
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int r2, android.os.Bundle r3) {
            r1 = this;
            r3 = 1
            if (r2 == r3) goto L1e
            r3 = 2
            if (r2 == r3) goto L13
            com.google.android.play.core.tasks.zzi r2 = r1.zza
            com.google.android.play.core.assetpacks.AssetPackException r3 = new com.google.android.play.core.assetpacks.AssetPackException
            r0 = -100
            r3.<init>(r0)
            r2.zzd(r3)
            return
        L13:
            com.google.android.play.core.tasks.zzi r2 = r1.zza
            r3 = 0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r2.zze(r3)
            return
        L1e:
            com.google.android.play.core.tasks.zzi r2 = r1.zza
            r3 = -1
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r2.zze(r3)
            com.google.android.play.core.assetpacks.zzl r2 = r1.zzb
            com.google.android.play.core.assetpacks.zzbx r2 = com.google.android.play.core.assetpacks.zzl.zzb(r2)
            r3 = 0
            r2.zzb(r3)
            return
    }
}
