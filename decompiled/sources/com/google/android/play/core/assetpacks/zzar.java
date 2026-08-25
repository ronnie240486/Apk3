package com.google.android.play.core.assetpacks;

/* JADX INFO: compiled from: com.google.android.play:core@@1.10.3 */
/* JADX INFO: loaded from: classes.dex */
final class zzar extends com.google.android.play.core.assetpacks.zzal {
    public final int zzc;
    public final java.lang.String zzd;
    public final int zze;
    public final /* synthetic */ com.google.android.play.core.assetpacks.zzaw zzf;

    public zzar(com.google.android.play.core.assetpacks.zzaw r1, com.google.android.play.core.tasks.zzi r2, int r3, java.lang.String r4, int r5) {
            r0 = this;
            r0.zzf = r1
            r0.<init>(r1, r2)
            r0.zzc = r3
            r0.zzd = r4
            r0.zze = r5
            return
    }

    @Override // com.google.android.play.core.assetpacks.zzal, com.google.android.play.core.internal.zzw
    public final void zzd(android.os.Bundle r4) {
            r3 = this;
            com.google.android.play.core.assetpacks.zzaw r0 = r3.zzf
            com.google.android.play.core.internal.zzas r0 = com.google.android.play.core.assetpacks.zzaw.zzs(r0)
            com.google.android.play.core.tasks.zzi r1 = r3.zza
            r0.zzs(r1)
            java.lang.String r0 = "error_code"
            int r4 = r4.getInt(r0)
            com.google.android.play.core.internal.zzag r0 = com.google.android.play.core.assetpacks.zzaw.zzr()
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r2 = 0
            r1[r2] = r4
            java.lang.String r4 = "onError(%d), retrying notifyModuleCompleted..."
            r0.zzb(r4, r1)
            int r4 = r3.zze
            if (r4 <= 0) goto L33
            com.google.android.play.core.assetpacks.zzaw r0 = r3.zzf
            int r1 = r3.zzc
            java.lang.String r2 = r3.zzd
            int r4 = r4 + (-1)
            com.google.android.play.core.assetpacks.zzaw.zzy(r0, r1, r2, r4)
        L33:
            return
    }
}
