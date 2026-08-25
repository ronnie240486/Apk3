package com.google.android.play.core.assetpacks;

/* JADX INFO: compiled from: com.google.android.play:core@@1.10.3 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzs implements com.google.android.play.core.internal.zzcs {
    private final com.google.android.play.core.internal.zzcs zza;
    private final com.google.android.play.core.internal.zzcs zzb;

    public zzs(com.google.android.play.core.internal.zzcs r1, com.google.android.play.core.internal.zzcs r2) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            return
    }

    @Override // com.google.android.play.core.internal.zzcs
    public final /* bridge */ /* synthetic */ java.lang.Object zza() {
            r6 = this;
            com.google.android.play.core.internal.zzcs r0 = r6.zza
            java.lang.Object r0 = r0.zza()
            com.google.android.play.core.internal.zzcs r1 = r6.zzb
            com.google.android.play.core.assetpacks.zzu r1 = (com.google.android.play.core.assetpacks.zzu) r1
            android.content.Context r1 = r1.zzb()
            com.google.android.play.core.assetpacks.zzl r0 = (com.google.android.play.core.assetpacks.zzl) r0
            android.content.pm.PackageManager r2 = r1.getPackageManager()
            android.content.ComponentName r3 = new android.content.ComponentName
            java.lang.String r4 = r1.getPackageName()
            java.lang.String r5 = "com.google.android.play.core.assetpacks.AssetPackExtractionService"
            r3.<init>(r4, r5)
            r4 = 4
            com.google.android.play.core.internal.zzcd.zza(r2, r3, r4)
            android.content.pm.PackageManager r2 = r1.getPackageManager()
            android.content.ComponentName r3 = new android.content.ComponentName
            java.lang.String r1 = r1.getPackageName()
            java.lang.String r5 = "com.google.android.play.core.assetpacks.ExtractionForegroundService"
            r3.<init>(r1, r5)
            com.google.android.play.core.internal.zzcd.zza(r2, r3, r4)
            com.google.android.play.core.internal.zzcr.zza(r0)
            return r0
    }
}
