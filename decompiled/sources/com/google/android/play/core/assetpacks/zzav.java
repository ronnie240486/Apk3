package com.google.android.play.core.assetpacks;

/* JADX INFO: compiled from: com.google.android.play:core@@1.10.3 */
/* JADX INFO: loaded from: classes.dex */
final class zzav extends com.google.android.play.core.assetpacks.zzal {
    private final java.util.List zzc;
    private final com.google.android.play.core.assetpacks.zzco zzd;
    private final com.google.android.play.core.assetpacks.zzeb zze;

    public zzav(com.google.android.play.core.assetpacks.zzaw r1, com.google.android.play.core.tasks.zzi r2, com.google.android.play.core.assetpacks.zzco r3, com.google.android.play.core.assetpacks.zzeb r4, java.util.List r5) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.zzd = r3
            r0.zze = r4
            r0.zzc = r5
            return
    }

    @Override // com.google.android.play.core.assetpacks.zzal, com.google.android.play.core.internal.zzw
    public final void zzn(int r4, android.os.Bundle r5) {
            r3 = this;
            super.zzn(r4, r5)
            com.google.android.play.core.tasks.zzi r4 = r3.zza
            com.google.android.play.core.assetpacks.zzco r0 = r3.zzd
            com.google.android.play.core.assetpacks.zzeb r1 = r3.zze
            java.util.List r2 = r3.zzc
            com.google.android.play.core.assetpacks.AssetPackStates r5 = com.google.android.play.core.assetpacks.AssetPackStates.zzc(r5, r0, r1, r2)
            r4.zze(r5)
            return
    }
}
