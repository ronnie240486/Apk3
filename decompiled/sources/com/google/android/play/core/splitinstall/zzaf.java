package com.google.android.play.core.splitinstall;

/* JADX INFO: compiled from: com.google.android.play:core@@1.10.3 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzaf implements com.google.android.play.core.internal.zzcs {
    private final com.google.android.play.core.internal.zzcs zza;

    public zzaf(com.google.android.play.core.internal.zzcs r1) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            return
    }

    @Override // com.google.android.play.core.internal.zzcs
    @androidx.annotation.Nullable
    public final /* bridge */ /* synthetic */ java.lang.Object zza() {
            r5 = this;
            com.google.android.play.core.internal.zzcs r0 = r5.zza
            com.google.android.play.core.splitinstall.zzad r0 = (com.google.android.play.core.splitinstall.zzad) r0
            android.content.Context r0 = r0.zzb()
            r1 = 0
            android.content.pm.PackageManager r2 = r0.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2e
            java.lang.String r3 = r0.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2e
            r4 = 128(0x80, float:1.8E-43)
            android.content.pm.ApplicationInfo r2 = r2.getApplicationInfo(r3, r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2e
            android.os.Bundle r2 = r2.metaData     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2e
            if (r2 != 0) goto L1c
            goto L2e
        L1c:
            java.lang.String r3 = "local_testing_dir"
            java.lang.String r2 = r2.getString(r3)
            if (r2 == 0) goto L2e
            java.io.File r3 = new java.io.File
            java.io.File r0 = r0.getExternalFilesDir(r1)
            r3.<init>(r0, r2)
            return r3
        L2e:
            return r1
    }
}
