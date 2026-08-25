package com.google.android.play.core.assetpacks;

/* JADX INFO: compiled from: com.google.android.play:core@@1.10.3 */
/* JADX INFO: loaded from: classes2.dex */
public final class AssetPackManagerFactory {
    private AssetPackManagerFactory() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.NonNull
    public static synchronized com.google.android.play.core.assetpacks.AssetPackManager getInstance(@androidx.annotation.NonNull android.content.Context r1) {
            java.lang.Class<com.google.android.play.core.assetpacks.AssetPackManagerFactory> r0 = com.google.android.play.core.assetpacks.AssetPackManagerFactory.class
            monitor-enter(r0)
            com.google.android.play.core.assetpacks.zza r1 = com.google.android.play.core.assetpacks.zzd.zza(r1)     // Catch: java.lang.Throwable -> Ld
            com.google.android.play.core.assetpacks.AssetPackManager r1 = r1.zza()     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r0)
            return r1
        Ld:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }
}
