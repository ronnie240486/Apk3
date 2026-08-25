package com.google.android.play.core.splitinstall;

/* JADX INFO: compiled from: com.google.android.play:core@@1.10.3 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzs {
    private static final com.google.android.play.core.internal.zzag zza = null;
    private final android.content.Context zzb;
    private final java.lang.String zzc;

    static {
            com.google.android.play.core.internal.zzag r0 = new com.google.android.play.core.internal.zzag
            java.lang.String r1 = "SplitInstallInfoProvider"
            r0.<init>(r1)
            com.google.android.play.core.splitinstall.zzs.zza = r0
            return
    }

    public zzs(android.content.Context r1) {
            r0 = this;
            r0.<init>()
            r0.zzb = r1
            java.lang.String r1 = r1.getPackageName()
            r0.zzc = r1
            return
    }

    public zzs(android.content.Context r1, java.lang.String r2) {
            r0 = this;
            r0.<init>()
            r0.zzb = r1
            r0.zzc = r2
            return
    }

    public static java.lang.String zzb(java.lang.String r2) {
            java.lang.String r0 = "config."
            boolean r0 = r2.startsWith(r0)
            if (r0 == 0) goto Lb
            java.lang.String r2 = ""
            return r2
        Lb:
            r0 = 2
            java.lang.String r1 = "\\.config\\."
            java.lang.String[] r2 = r2.split(r1, r0)
            r0 = 0
            r2 = r2[r0]
            return r2
    }

    public static boolean zze(java.lang.String r1) {
            java.lang.String r0 = "config."
            boolean r1 = r1.startsWith(r0)
            return r1
    }

    public static boolean zzf(java.lang.String r1) {
            java.lang.String r0 = "config."
            boolean r0 = r1.startsWith(r0)
            if (r0 != 0) goto L13
            java.lang.String r0 = ".config."
            boolean r1 = r1.contains(r0)
            if (r1 == 0) goto L11
            goto L13
        L11:
            r1 = 0
            return r1
        L13:
            r1 = 1
            return r1
    }

    @androidx.annotation.Nullable
    private final android.os.Bundle zzg() {
            r5 = this;
            r0 = 0
            r1 = 0
            android.content.Context r2 = r5.zzb     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L22
            android.content.pm.PackageManager r2 = r2.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L22
            java.lang.String r3 = r5.zzc     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L22
            r4 = 128(0x80, float:1.8E-43)
            android.content.pm.ApplicationInfo r2 = r2.getApplicationInfo(r3, r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L22
            if (r2 == 0) goto L18
            android.os.Bundle r2 = r2.metaData
            if (r2 != 0) goto L17
            goto L18
        L17:
            return r2
        L18:
            com.google.android.play.core.internal.zzag r2 = com.google.android.play.core.splitinstall.zzs.zza
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r3 = "App has no applicationInfo or metaData"
            r2.zza(r3, r1)
            return r0
        L22:
            com.google.android.play.core.internal.zzag r2 = com.google.android.play.core.splitinstall.zzs.zza
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r3 = "App is not found in PackageManager"
            r2.zze(r3, r1)
            return r0
    }

    private final java.util.Set zzh() {
            r6 = this;
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            android.os.Bundle r1 = r6.zzg()
            r2 = 0
            if (r1 != 0) goto Ld
            goto L3a
        Ld:
            java.lang.String r3 = "com.android.dynamic.apk.fused.modules"
            java.lang.String r1 = r1.getString(r3)
            if (r1 == 0) goto L31
            boolean r3 = r1.isEmpty()
            if (r3 == 0) goto L1c
            goto L31
        L1c:
            r3 = -1
            java.lang.String r4 = ","
            java.lang.String[] r1 = r1.split(r4, r3)
            java.util.Collections.addAll(r0, r1)
            java.lang.String r1 = ""
            r0.remove(r1)
            java.lang.String r1 = "base"
            r0.remove(r1)
            goto L3a
        L31:
            com.google.android.play.core.internal.zzag r1 = com.google.android.play.core.splitinstall.zzs.zza
            java.lang.Object[] r3 = new java.lang.Object[r2]
            java.lang.String r4 = "App has no fused modules."
            r1.zza(r4, r3)
        L3a:
            r1 = 0
            android.content.Context r3 = r6.zzb     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4c
            android.content.pm.PackageManager r3 = r3.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4c
            java.lang.String r4 = r6.zzc     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4c
            android.content.pm.PackageInfo r3 = r3.getPackageInfo(r4, r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4c
            if (r3 == 0) goto L55
            java.lang.String[] r1 = r3.splitNames     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4c
            goto L55
        L4c:
            com.google.android.play.core.internal.zzag r3 = com.google.android.play.core.splitinstall.zzs.zza
            java.lang.Object[] r4 = new java.lang.Object[r2]
            java.lang.String r5 = "App is not found in PackageManager"
            r3.zze(r5, r4)
        L55:
            if (r1 == 0) goto L6b
            com.google.android.play.core.internal.zzag r3 = com.google.android.play.core.splitinstall.zzs.zza
            r4 = 1
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.String r5 = java.util.Arrays.toString(r1)
            r4[r2] = r5
            java.lang.String r2 = "Adding splits from package manager: %s"
            r3.zza(r2, r4)
            java.util.Collections.addAll(r0, r1)
            goto L74
        L6b:
            com.google.android.play.core.internal.zzag r1 = com.google.android.play.core.splitinstall.zzs.zza
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r3 = "No splits are found or app cannot be found in package manager."
            r1.zza(r3, r2)
        L74:
            com.google.android.play.core.splitinstall.zzq r1 = com.google.android.play.core.splitinstall.zzr.zza()
            if (r1 == 0) goto L81
            java.util.Set r1 = r1.zza()
            r0.addAll(r1)
        L81:
            return r0
    }

    @androidx.annotation.Nullable
    public final com.google.android.play.core.splitinstall.zzk zza() {
            r4 = this;
            android.os.Bundle r0 = r4.zzg()
            r1 = 0
            r2 = 0
            if (r0 != 0) goto L12
            com.google.android.play.core.internal.zzag r0 = com.google.android.play.core.splitinstall.zzs.zza
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r3 = "No metadata found in Context."
            r0.zze(r3, r2)
            return r1
        L12:
            java.lang.String r3 = "com.android.vending.splits"
            int r0 = r0.getInt(r3)
            if (r0 != 0) goto L24
            com.google.android.play.core.internal.zzag r0 = com.google.android.play.core.splitinstall.zzs.zza
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r3 = "No metadata found in AndroidManifest."
            r0.zze(r3, r2)
            return r1
        L24:
            android.content.Context r3 = r4.zzb     // Catch: android.content.res.Resources.NotFoundException -> L43
            android.content.res.Resources r3 = r3.getResources()     // Catch: android.content.res.Resources.NotFoundException -> L43
            android.content.res.XmlResourceParser r0 = r3.getXml(r0)     // Catch: android.content.res.Resources.NotFoundException -> L43
            com.google.android.play.core.splitinstall.zzi r1 = new com.google.android.play.core.splitinstall.zzi
            r1.<init>()
            com.google.android.play.core.splitinstall.zzk r0 = com.google.android.play.core.splitinstall.zzbg.zza(r0, r1)
            if (r0 != 0) goto L42
            com.google.android.play.core.internal.zzag r1 = com.google.android.play.core.splitinstall.zzs.zza
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r3 = "Can't parse languages metadata."
            r1.zze(r3, r2)
        L42:
            return r0
        L43:
            com.google.android.play.core.internal.zzag r0 = com.google.android.play.core.splitinstall.zzs.zza
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r3 = "Resource with languages metadata doesn't exist."
            r0.zze(r3, r2)
            return r1
    }

    public final java.util.Set zzc() {
            r4 = this;
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            java.util.Set r1 = r4.zzh()
            java.util.Iterator r1 = r1.iterator()
        Ld:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L23
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            boolean r3 = zzf(r2)
            if (r3 != 0) goto Ld
            r0.add(r2)
            goto Ld
        L23:
            return r0
    }

    @androidx.annotation.Nullable
    public final java.util.Set zzd() {
            r5 = this;
            com.google.android.play.core.splitinstall.zzk r0 = r5.zza()
            if (r0 != 0) goto L8
            r0 = 0
            return r0
        L8:
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            java.util.Set r2 = r5.zzh()
            java.lang.String r3 = ""
            r2.add(r3)
            java.util.Set r4 = r5.zzc()
            r4.add(r3)
            java.util.Map r0 = r0.zza(r4)
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L29:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L4b
            java.lang.Object r3 = r0.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getValue()
            java.util.Collection r4 = (java.util.Collection) r4
            boolean r4 = r2.containsAll(r4)
            if (r4 == 0) goto L29
            java.lang.Object r3 = r3.getKey()
            java.lang.String r3 = (java.lang.String) r3
            r1.add(r3)
            goto L29
        L4b:
            return r1
    }
}
