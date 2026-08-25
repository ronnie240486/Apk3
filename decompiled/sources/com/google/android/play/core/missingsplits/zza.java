package com.google.android.play.core.missingsplits;

/* JADX INFO: compiled from: com.google.android.play:core@@1.10.3 */
/* JADX INFO: loaded from: classes2.dex */
final class zza {
    private static final com.google.android.play.core.internal.zzag zza = null;
    private final android.content.Context zzb;
    private final android.content.pm.PackageManager zzc;

    static {
            com.google.android.play.core.internal.zzag r0 = new com.google.android.play.core.internal.zzag
            java.lang.String r1 = "MissingSplitsAppComponentsHelper"
            r0.<init>(r1)
            com.google.android.play.core.missingsplits.zza.zza = r0
            return
    }

    public zza(android.content.Context r1, android.content.pm.PackageManager r2) {
            r0 = this;
            r0.<init>()
            r0.zzb = r1
            r0.zzc = r2
            return
    }

    private final java.util.List zzd() {
            r4 = this;
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L29
            r0.<init>()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L29
            android.content.pm.PackageManager r1 = r4.zzc     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L29
            android.content.Context r2 = r4.zzb     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L29
            java.lang.String r2 = r2.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L29
            r3 = 526(0x20e, float:7.37E-43)
            android.content.pm.PackageInfo r1 = r1.getPackageInfo(r2, r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L29
            android.content.pm.ProviderInfo[] r2 = r1.providers     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L29
            if (r2 == 0) goto L1a
            java.util.Collections.addAll(r0, r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L29
        L1a:
            android.content.pm.ActivityInfo[] r2 = r1.receivers     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L29
            if (r2 == 0) goto L21
            java.util.Collections.addAll(r0, r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L29
        L21:
            android.content.pm.ServiceInfo[] r1 = r1.services     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L29
            if (r1 == 0) goto L28
            java.util.Collections.addAll(r0, r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L29
        L28:
            return r0
        L29:
            r0 = move-exception
            com.google.android.play.core.internal.zzag r1 = com.google.android.play.core.missingsplits.zza.zza
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r0
            java.lang.String r0 = "Failed to resolve own package : %s"
            r1.zze(r0, r2)
            java.util.List r0 = java.util.Collections.emptyList()
            return r0
    }

    private final void zze(java.util.List r5, int r6) {
            r4 = this;
            java.util.Iterator r5 = r5.iterator()
        L4:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L20
            java.lang.Object r0 = r5.next()
            android.content.pm.ComponentInfo r0 = (android.content.pm.ComponentInfo) r0
            android.content.pm.PackageManager r1 = r4.zzc
            android.content.ComponentName r2 = new android.content.ComponentName
            java.lang.String r3 = r0.packageName
            java.lang.String r0 = r0.name
            r2.<init>(r3, r0)
            r0 = 1
            r1.setComponentEnabledSetting(r2, r6, r0)
            goto L4
        L20:
            return
    }

    public final void zza() {
            r3 = this;
            com.google.android.play.core.internal.zzag r0 = com.google.android.play.core.missingsplits.zza.zza
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = "Disabling all non-activity components"
            r0.zzd(r2, r1)
            java.util.List r0 = r3.zzd()
            r1 = 2
            r3.zze(r0, r1)
            return
    }

    public final void zzb() {
            r4 = this;
            com.google.android.play.core.internal.zzag r0 = com.google.android.play.core.missingsplits.zza.zza
            r1 = 0
            java.lang.Object[] r2 = new java.lang.Object[r1]
            java.lang.String r3 = "Resetting enabled state of all non-activity components"
            r0.zzd(r3, r2)
            java.util.List r0 = r4.zzd()
            r4.zze(r0, r1)
            return
    }

    public final boolean zzc() {
            r6 = this;
            java.util.List r0 = r6.zzd()
            java.util.Iterator r0 = r0.iterator()
        L8:
            boolean r1 = r0.hasNext()
            r2 = 0
            if (r1 == 0) goto L31
            java.lang.Object r1 = r0.next()
            android.content.pm.ComponentInfo r1 = (android.content.pm.ComponentInfo) r1
            android.content.pm.PackageManager r3 = r6.zzc
            android.content.ComponentName r4 = new android.content.ComponentName
            java.lang.String r5 = r1.packageName
            java.lang.String r1 = r1.name
            r4.<init>(r5, r1)
            int r1 = r3.getComponentEnabledSetting(r4)
            r3 = 2
            if (r1 == r3) goto L8
            com.google.android.play.core.internal.zzag r0 = com.google.android.play.core.missingsplits.zza.zza
            java.lang.Object[] r1 = new java.lang.Object[r2]
            java.lang.String r3 = "Not all non-activity components are disabled"
            r0.zza(r3, r1)
            return r2
        L31:
            com.google.android.play.core.internal.zzag r0 = com.google.android.play.core.missingsplits.zza.zza
            java.lang.Object[] r1 = new java.lang.Object[r2]
            java.lang.String r2 = "All non-activity components are disabled"
            r0.zza(r2, r1)
            r0 = 1
            return r0
    }
}
