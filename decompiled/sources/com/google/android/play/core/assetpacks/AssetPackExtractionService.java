package com.google.android.play.core.assetpacks;

/* JADX INFO: compiled from: com.google.android.play:core@@1.10.3 */
/* JADX INFO: loaded from: classes2.dex */
public class AssetPackExtractionService extends android.app.Service {
    public com.google.android.play.core.assetpacks.zzb zza;

    public AssetPackExtractionService() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.app.Service
    public final android.os.IBinder onBind(android.content.Intent r1) {
            r0 = this;
            com.google.android.play.core.assetpacks.zzb r1 = r0.zza
            return r1
    }

    @Override // android.app.Service
    public final void onCreate() {
            r1 = this;
            super.onCreate()
            android.content.Context r0 = r1.getApplicationContext()
            com.google.android.play.core.assetpacks.zza r0 = com.google.android.play.core.assetpacks.zzd.zza(r0)
            r0.zzb(r1)
            return
    }
}
