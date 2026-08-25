package com.google.android.play.core.assetpacks;

/* JADX INFO: compiled from: com.google.android.play:core@@1.10.3 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zzba implements java.lang.Runnable {
    public final /* synthetic */ com.google.android.play.core.assetpacks.zzbb zza;
    public final /* synthetic */ com.google.android.play.core.assetpacks.AssetPackState zzb;

    public /* synthetic */ zzba(com.google.android.play.core.assetpacks.zzbb r1, com.google.android.play.core.assetpacks.AssetPackState r2) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r2 = this;
            com.google.android.play.core.assetpacks.zzbb r0 = r2.zza
            com.google.android.play.core.assetpacks.AssetPackState r1 = r2.zzb
            r0.zzi(r1)
            return
    }
}
