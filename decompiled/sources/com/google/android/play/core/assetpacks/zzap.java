package com.google.android.play.core.assetpacks;

/* JADX INFO: compiled from: com.google.android.play:core@@1.10.3 */
/* JADX INFO: loaded from: classes.dex */
final class zzap extends com.google.android.play.core.assetpacks.zzal {
    public final /* synthetic */ com.google.android.play.core.assetpacks.zzaw zzc;

    public zzap(com.google.android.play.core.assetpacks.zzaw r1, com.google.android.play.core.tasks.zzi r2) {
            r0 = this;
            r0.zzc = r1
            r0.<init>(r1, r2)
            return
    }

    @Override // com.google.android.play.core.assetpacks.zzal, com.google.android.play.core.internal.zzw
    public final void zzd(android.os.Bundle r5) {
            r4 = this;
            com.google.android.play.core.assetpacks.zzaw r0 = r4.zzc
            com.google.android.play.core.internal.zzas r0 = com.google.android.play.core.assetpacks.zzaw.zzt(r0)
            com.google.android.play.core.tasks.zzi r1 = r4.zza
            r0.zzs(r1)
            java.lang.String r0 = "error_code"
            int r5 = r5.getInt(r0)
            com.google.android.play.core.internal.zzag r0 = com.google.android.play.core.assetpacks.zzaw.zzr()
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r5)
            r3 = 0
            r1[r3] = r2
            java.lang.String r2 = "onError(%d)"
            r0.zzb(r2, r1)
            com.google.android.play.core.tasks.zzi r0 = r4.zza
            com.google.android.play.core.assetpacks.AssetPackException r1 = new com.google.android.play.core.assetpacks.AssetPackException
            r1.<init>(r5)
            r0.zzd(r1)
            return
    }

    @Override // com.google.android.play.core.assetpacks.zzal, com.google.android.play.core.internal.zzw
    public final void zzh(android.os.Bundle r3, android.os.Bundle r4) {
            r2 = this;
            super.zzh(r3, r4)
            com.google.android.play.core.assetpacks.zzaw r4 = r2.zzc
            java.util.concurrent.atomic.AtomicBoolean r4 = com.google.android.play.core.assetpacks.zzaw.zzx(r4)
            r0 = 1
            r1 = 0
            boolean r4 = r4.compareAndSet(r0, r1)
            if (r4 != 0) goto L1c
            com.google.android.play.core.internal.zzag r4 = com.google.android.play.core.assetpacks.zzaw.zzr()
            java.lang.Object[] r0 = new java.lang.Object[r1]
            java.lang.String r1 = "Expected keepingAlive to be true, but was false."
            r4.zze(r1, r0)
        L1c:
            java.lang.String r4 = "keep_alive"
            boolean r3 = r3.getBoolean(r4)
            if (r3 == 0) goto L29
            com.google.android.play.core.assetpacks.zzaw r3 = r2.zzc
            r3.zzf()
        L29:
            return
    }
}
