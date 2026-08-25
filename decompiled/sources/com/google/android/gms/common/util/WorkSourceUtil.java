package com.google.android.gms.common.util;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* JADX INFO: loaded from: classes2.dex */
@com.google.android.gms.common.annotation.KeepForSdk
public class WorkSourceUtil {
    private static final int zza = 0;
    private static final java.lang.reflect.Method zzb = null;
    private static final java.lang.reflect.Method zzc = null;
    private static final java.lang.reflect.Method zzd = null;
    private static final java.lang.reflect.Method zze = null;
    private static final java.lang.reflect.Method zzf = null;
    private static final java.lang.reflect.Method zzg = null;
    private static final java.lang.reflect.Method zzh = null;
    private static final java.lang.reflect.Method zzi = null;

    static {
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            java.lang.String r1 = "add"
            int r2 = android.os.Process.myUid()
            com.google.android.gms.common.util.WorkSourceUtil.zza = r2
            r2 = 1
            r3 = 0
            r4 = 0
            java.lang.Class[] r5 = new java.lang.Class[r2]     // Catch: java.lang.Exception -> L1a
            java.lang.Class r6 = java.lang.Integer.TYPE     // Catch: java.lang.Exception -> L1a
            r5[r3] = r6     // Catch: java.lang.Exception -> L1a
            java.lang.Class<android.os.WorkSource> r6 = android.os.WorkSource.class
            java.lang.reflect.Method r5 = r6.getMethod(r1, r5)     // Catch: java.lang.Exception -> L1a
            goto L1b
        L1a:
            r5 = r4
        L1b:
            com.google.android.gms.common.util.WorkSourceUtil.zzb = r5
            boolean r5 = com.google.android.gms.common.util.PlatformVersion.isAtLeastJellyBeanMR2()
            r6 = 2
            if (r5 == 0) goto L33
            java.lang.Class[] r5 = new java.lang.Class[r6]     // Catch: java.lang.Exception -> L33
            java.lang.Class r7 = java.lang.Integer.TYPE     // Catch: java.lang.Exception -> L33
            r5[r3] = r7     // Catch: java.lang.Exception -> L33
            r5[r2] = r0     // Catch: java.lang.Exception -> L33
            java.lang.Class<android.os.WorkSource> r7 = android.os.WorkSource.class
            java.lang.reflect.Method r1 = r7.getMethod(r1, r5)     // Catch: java.lang.Exception -> L33
            goto L34
        L33:
            r1 = r4
        L34:
            com.google.android.gms.common.util.WorkSourceUtil.zzc = r1
            java.lang.Class<android.os.WorkSource> r1 = android.os.WorkSource.class
            java.lang.String r5 = "size"
            java.lang.Class[] r7 = new java.lang.Class[r3]     // Catch: java.lang.Exception -> L42
            java.lang.reflect.Method r1 = r1.getMethod(r5, r7)     // Catch: java.lang.Exception -> L42
            goto L43
        L42:
            r1 = r4
        L43:
            com.google.android.gms.common.util.WorkSourceUtil.zzd = r1
            java.lang.Class[] r1 = new java.lang.Class[r2]     // Catch: java.lang.Exception -> L54
            java.lang.Class r5 = java.lang.Integer.TYPE     // Catch: java.lang.Exception -> L54
            r1[r3] = r5     // Catch: java.lang.Exception -> L54
            java.lang.Class<android.os.WorkSource> r5 = android.os.WorkSource.class
            java.lang.String r7 = "get"
            java.lang.reflect.Method r1 = r5.getMethod(r7, r1)     // Catch: java.lang.Exception -> L54
            goto L55
        L54:
            r1 = r4
        L55:
            com.google.android.gms.common.util.WorkSourceUtil.zze = r1
            boolean r1 = com.google.android.gms.common.util.PlatformVersion.isAtLeastJellyBeanMR2()
            if (r1 == 0) goto L6c
            java.lang.Class[] r1 = new java.lang.Class[r2]     // Catch: java.lang.Exception -> L6c
            java.lang.Class r5 = java.lang.Integer.TYPE     // Catch: java.lang.Exception -> L6c
            r1[r3] = r5     // Catch: java.lang.Exception -> L6c
            java.lang.Class<android.os.WorkSource> r5 = android.os.WorkSource.class
            java.lang.String r7 = "getName"
            java.lang.reflect.Method r1 = r5.getMethod(r7, r1)     // Catch: java.lang.Exception -> L6c
            goto L6d
        L6c:
            r1 = r4
        L6d:
            com.google.android.gms.common.util.WorkSourceUtil.zzf = r1
            boolean r1 = com.google.android.gms.common.util.PlatformVersion.isAtLeastP()
            java.lang.String r5 = "WorkSourceUtil"
            if (r1 == 0) goto L88
            java.lang.Class<android.os.WorkSource> r1 = android.os.WorkSource.class
            java.lang.String r7 = "createWorkChain"
            java.lang.Class[] r8 = new java.lang.Class[r3]     // Catch: java.lang.Exception -> L82
            java.lang.reflect.Method r1 = r1.getMethod(r7, r8)     // Catch: java.lang.Exception -> L82
            goto L89
        L82:
            r1 = move-exception
            java.lang.String r7 = "Missing WorkChain API createWorkChain"
            android.util.Log.w(r5, r7, r1)
        L88:
            r1 = r4
        L89:
            com.google.android.gms.common.util.WorkSourceUtil.zzg = r1
            boolean r1 = com.google.android.gms.common.util.PlatformVersion.isAtLeastP()
            if (r1 == 0) goto Lac
            java.lang.String r1 = "android.os.WorkSource$WorkChain"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Exception -> La6
            java.lang.Class[] r6 = new java.lang.Class[r6]     // Catch: java.lang.Exception -> La6
            java.lang.Class r7 = java.lang.Integer.TYPE     // Catch: java.lang.Exception -> La6
            r6[r3] = r7     // Catch: java.lang.Exception -> La6
            r6[r2] = r0     // Catch: java.lang.Exception -> La6
            java.lang.String r0 = "addNode"
            java.lang.reflect.Method r0 = r1.getMethod(r0, r6)     // Catch: java.lang.Exception -> La6
            goto Lad
        La6:
            r0 = move-exception
            java.lang.String r1 = "Missing WorkChain class"
            android.util.Log.w(r5, r1, r0)
        Lac:
            r0 = r4
        Lad:
            com.google.android.gms.common.util.WorkSourceUtil.zzh = r0
            boolean r0 = com.google.android.gms.common.util.PlatformVersion.isAtLeastP()
            if (r0 == 0) goto Lc2
            java.lang.Class<android.os.WorkSource> r0 = android.os.WorkSource.class
            java.lang.String r1 = "isEmpty"
            java.lang.Class[] r3 = new java.lang.Class[r3]     // Catch: java.lang.Exception -> Lc2
            java.lang.reflect.Method r4 = r0.getMethod(r1, r3)     // Catch: java.lang.Exception -> Lc2
            r4.setAccessible(r2)     // Catch: java.lang.Exception -> Lc2
        Lc2:
            com.google.android.gms.common.util.WorkSourceUtil.zzi = r4
            return
    }

    private WorkSourceUtil() {
            r0 = this;
            r0.<init>()
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public static void add(@androidx.annotation.NonNull android.os.WorkSource r6, int r7, @androidx.annotation.NonNull java.lang.String r8) {
            java.lang.reflect.Method r0 = com.google.android.gms.common.util.WorkSourceUtil.zzc
            java.lang.String r1 = "Unable to assign blame through WorkSource"
            java.lang.String r2 = "WorkSourceUtil"
            r3 = 0
            r4 = 1
            if (r0 == 0) goto L22
            if (r8 != 0) goto Le
            java.lang.String r8 = ""
        Le:
            r5 = 2
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch: java.lang.Exception -> L1d
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Exception -> L1d
            r5[r3] = r7     // Catch: java.lang.Exception -> L1d
            r5[r4] = r8     // Catch: java.lang.Exception -> L1d
            r0.invoke(r6, r5)     // Catch: java.lang.Exception -> L1d
            return
        L1d:
            r6 = move-exception
            android.util.Log.wtf(r2, r1, r6)
            return
        L22:
            java.lang.reflect.Method r8 = com.google.android.gms.common.util.WorkSourceUtil.zzb
            if (r8 == 0) goto L36
            java.lang.Object[] r0 = new java.lang.Object[r4]     // Catch: java.lang.Exception -> L32
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Exception -> L32
            r0[r3] = r7     // Catch: java.lang.Exception -> L32
            r8.invoke(r6, r0)     // Catch: java.lang.Exception -> L32
            return
        L32:
            r6 = move-exception
            android.util.Log.wtf(r2, r1, r6)
        L36:
            return
    }

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public static android.os.WorkSource fromPackage(@androidx.annotation.NonNull android.content.Context r3, @androidx.annotation.NonNull java.lang.String r4) {
            java.lang.String r0 = "WorkSourceUtil"
            r1 = 0
            if (r3 == 0) goto L51
            android.content.pm.PackageManager r2 = r3.getPackageManager()
            if (r2 == 0) goto L51
            if (r4 == 0) goto L51
            com.google.android.gms.common.wrappers.PackageManagerWrapper r3 = com.google.android.gms.common.wrappers.Wrappers.packageManager(r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L3a
            r2 = 0
            android.content.pm.ApplicationInfo r3 = r3.getApplicationInfo(r4, r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L3a
            if (r3 != 0) goto L2f
            java.lang.String r3 = "Could not get applicationInfo from package: "
            int r2 = r4.length()
            if (r2 == 0) goto L25
            java.lang.String r3 = r3.concat(r4)
            goto L2b
        L25:
            java.lang.String r4 = new java.lang.String
            r4.<init>(r3)
            r3 = r4
        L2b:
            android.util.Log.e(r0, r3)
            return r1
        L2f:
            int r3 = r3.uid
            android.os.WorkSource r0 = new android.os.WorkSource
            r0.<init>()
            add(r0, r3, r4)
            return r0
        L3a:
            java.lang.String r3 = "Could not find package: "
            int r2 = r4.length()
            if (r2 == 0) goto L48
            java.lang.String r3 = r3.concat(r4)
            goto L4e
        L48:
            java.lang.String r4 = new java.lang.String
            r4.<init>(r3)
            r3 = r4
        L4e:
            android.util.Log.e(r0, r3)
        L51:
            return r1
    }

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public static android.os.WorkSource fromPackageAndModuleExperimentalPi(@androidx.annotation.NonNull android.content.Context r9, @androidx.annotation.NonNull java.lang.String r10, @androidx.annotation.NonNull java.lang.String r11) {
            r0 = 0
            java.lang.String r1 = "WorkSourceUtil"
            if (r9 == 0) goto L91
            android.content.pm.PackageManager r2 = r9.getPackageManager()
            if (r2 == 0) goto L91
            if (r11 == 0) goto L91
            if (r10 != 0) goto L11
            goto L91
        L11:
            r2 = -1
            r3 = 0
            com.google.android.gms.common.wrappers.PackageManagerWrapper r9 = com.google.android.gms.common.wrappers.Wrappers.packageManager(r9)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L37
            android.content.pm.ApplicationInfo r9 = r9.getApplicationInfo(r10, r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L37
            if (r9 != 0) goto L34
            java.lang.String r9 = "Could not get applicationInfo from package: "
            int r4 = r10.length()
            if (r4 == 0) goto L2a
            java.lang.String r9 = r9.concat(r10)
            goto L30
        L2a:
            java.lang.String r4 = new java.lang.String
            r4.<init>(r9)
            r9 = r4
        L30:
            android.util.Log.e(r1, r9)
            goto L4e
        L34:
            int r2 = r9.uid
            goto L4e
        L37:
            java.lang.String r9 = "Could not find package: "
            int r4 = r10.length()
            if (r4 == 0) goto L45
            java.lang.String r9 = r9.concat(r10)
            goto L4b
        L45:
            java.lang.String r4 = new java.lang.String
            r4.<init>(r9)
            r9 = r4
        L4b:
            android.util.Log.e(r1, r9)
        L4e:
            if (r2 >= 0) goto L51
            return r0
        L51:
            android.os.WorkSource r9 = new android.os.WorkSource
            r9.<init>()
            java.lang.reflect.Method r0 = com.google.android.gms.common.util.WorkSourceUtil.zzg
            if (r0 == 0) goto L8d
            java.lang.reflect.Method r4 = com.google.android.gms.common.util.WorkSourceUtil.zzh
            if (r4 != 0) goto L5f
            goto L8d
        L5f:
            java.lang.Object[] r5 = new java.lang.Object[r3]     // Catch: java.lang.Exception -> L86
            java.lang.Object r0 = r0.invoke(r9, r5)     // Catch: java.lang.Exception -> L86
            int r5 = com.google.android.gms.common.util.WorkSourceUtil.zza     // Catch: java.lang.Exception -> L86
            r6 = 1
            r7 = 2
            if (r2 == r5) goto L78
            java.lang.Object[] r8 = new java.lang.Object[r7]     // Catch: java.lang.Exception -> L86
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Exception -> L86
            r8[r3] = r2     // Catch: java.lang.Exception -> L86
            r8[r6] = r10     // Catch: java.lang.Exception -> L86
            r4.invoke(r0, r8)     // Catch: java.lang.Exception -> L86
        L78:
            java.lang.Object[] r10 = new java.lang.Object[r7]     // Catch: java.lang.Exception -> L86
            java.lang.Integer r2 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Exception -> L86
            r10[r3] = r2     // Catch: java.lang.Exception -> L86
            r10[r6] = r11     // Catch: java.lang.Exception -> L86
            r4.invoke(r0, r10)     // Catch: java.lang.Exception -> L86
            goto L90
        L86:
            r10 = move-exception
            java.lang.String r11 = "Unable to assign chained blame through WorkSource"
            android.util.Log.w(r1, r11, r10)
            goto L90
        L8d:
            add(r9, r2, r10)
        L90:
            return r9
        L91:
            java.lang.String r9 = "Unexpected null arguments"
            android.util.Log.w(r1, r9)
            return r0
    }

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public static java.util.List<java.lang.String> getNames(@androidx.annotation.NonNull android.os.WorkSource r8) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            if (r8 != 0) goto La
            r2 = 0
            goto Le
        La:
            int r2 = zza(r8)
        Le:
            if (r2 == 0) goto L40
            r3 = 0
        L11:
            if (r3 >= r2) goto L40
            java.lang.reflect.Method r4 = com.google.android.gms.common.util.WorkSourceUtil.zzf
            r5 = 0
            if (r4 == 0) goto L31
            r6 = 1
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch: java.lang.Exception -> L29
            java.lang.Integer r7 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Exception -> L29
            r6[r1] = r7     // Catch: java.lang.Exception -> L29
            java.lang.Object r4 = r4.invoke(r8, r6)     // Catch: java.lang.Exception -> L29
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Exception -> L29
            r5 = r4
            goto L31
        L29:
            r4 = move-exception
            java.lang.String r6 = "WorkSourceUtil"
            java.lang.String r7 = "Unable to assign blame through WorkSource"
            android.util.Log.wtf(r6, r7, r4)
        L31:
            boolean r4 = com.google.android.gms.common.util.Strings.isEmptyOrWhitespace(r5)
            if (r4 != 0) goto L3d
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r5)
            r0.add(r5)
        L3d:
            int r3 = r3 + 1
            goto L11
        L40:
            return r0
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public static boolean hasWorkSourcePermission(@androidx.annotation.NonNull android.content.Context r3) {
            r0 = 0
            if (r3 != 0) goto L4
            return r0
        L4:
            android.content.pm.PackageManager r1 = r3.getPackageManager()
            if (r1 != 0) goto Lb
            return r0
        Lb:
            com.google.android.gms.common.wrappers.PackageManagerWrapper r1 = com.google.android.gms.common.wrappers.Wrappers.packageManager(r3)
            java.lang.String r3 = r3.getPackageName()
            java.lang.String r2 = "android.permission.UPDATE_DEVICE_STATS"
            int r3 = r1.checkPermission(r2, r3)
            if (r3 != 0) goto L1d
            r3 = 1
            return r3
        L1d:
            return r0
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public static boolean isEmpty(@androidx.annotation.NonNull android.os.WorkSource r4) {
            java.lang.reflect.Method r0 = com.google.android.gms.common.util.WorkSourceUtil.zzi
            r1 = 0
            if (r0 == 0) goto L1d
            java.lang.Object[] r2 = new java.lang.Object[r1]     // Catch: java.lang.Exception -> L15
            java.lang.Object r0 = r0.invoke(r4, r2)     // Catch: java.lang.Exception -> L15
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)     // Catch: java.lang.Exception -> L15
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Exception -> L15
            boolean r4 = r0.booleanValue()     // Catch: java.lang.Exception -> L15
            return r4
        L15:
            r0 = move-exception
            java.lang.String r2 = "WorkSourceUtil"
            java.lang.String r3 = "Unable to check WorkSource emptiness"
            android.util.Log.e(r2, r3, r0)
        L1d:
            int r4 = zza(r4)
            if (r4 != 0) goto L25
            r4 = 1
            return r4
        L25:
            return r1
    }

    public static int zza(@androidx.annotation.NonNull android.os.WorkSource r3) {
            java.lang.reflect.Method r0 = com.google.android.gms.common.util.WorkSourceUtil.zzd
            r1 = 0
            if (r0 == 0) goto L1d
            java.lang.Object[] r2 = new java.lang.Object[r1]     // Catch: java.lang.Exception -> L15
            java.lang.Object r3 = r0.invoke(r3, r2)     // Catch: java.lang.Exception -> L15
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r3)     // Catch: java.lang.Exception -> L15
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch: java.lang.Exception -> L15
            int r3 = r3.intValue()     // Catch: java.lang.Exception -> L15
            return r3
        L15:
            r3 = move-exception
            java.lang.String r0 = "WorkSourceUtil"
            java.lang.String r2 = "Unable to assign blame through WorkSource"
            android.util.Log.wtf(r0, r2, r3)
        L1d:
            return r1
    }
}
