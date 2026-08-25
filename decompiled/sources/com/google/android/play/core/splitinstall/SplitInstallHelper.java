package com.google.android.play.core.splitinstall;

/* JADX INFO: compiled from: com.google.android.play:core@@1.10.3 */
/* JADX INFO: loaded from: classes2.dex */
public class SplitInstallHelper {
    private static final com.google.android.play.core.internal.zzag zza = null;

    static {
            com.google.android.play.core.internal.zzag r0 = new com.google.android.play.core.internal.zzag
            java.lang.String r1 = "SplitInstallHelper"
            r0.<init>(r1)
            com.google.android.play.core.splitinstall.SplitInstallHelper.zza = r0
            return
    }

    private SplitInstallHelper() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void loadLibrary(@androidx.annotation.NonNull android.content.Context r4, @androidx.annotation.NonNull java.lang.String r5) throws java.lang.UnsatisfiedLinkError {
            java.lang.Class<com.google.android.play.core.splitinstall.zzn> r0 = com.google.android.play.core.splitinstall.zzn.class
            monitor-enter(r0)
            java.lang.System.loadLibrary(r5)     // Catch: java.lang.Throwable -> L7 java.lang.UnsatisfiedLinkError -> L9
            goto L49
        L7:
            r4 = move-exception
            goto L4c
        L9:
            r1 = move-exception
            android.content.pm.ApplicationInfo r4 = r4.getApplicationInfo()     // Catch: java.lang.Throwable -> L7
            java.lang.String r4 = r4.nativeLibraryDir     // Catch: java.lang.Throwable -> L7
            java.lang.String r5 = java.lang.System.mapLibraryName(r5)     // Catch: java.lang.Throwable -> L7
            java.lang.String r2 = java.lang.String.valueOf(r4)     // Catch: java.lang.Throwable -> L7
            int r2 = r2.length()     // Catch: java.lang.Throwable -> L7
            int r2 = r2 + 1
            java.lang.String r3 = java.lang.String.valueOf(r5)     // Catch: java.lang.Throwable -> L7
            int r3 = r3.length()     // Catch: java.lang.Throwable -> L7
            int r2 = r2 + r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L7
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L7
            r3.append(r4)     // Catch: java.lang.Throwable -> L7
            java.lang.String r4 = "/"
            r3.append(r4)     // Catch: java.lang.Throwable -> L7
            r3.append(r5)     // Catch: java.lang.Throwable -> L7
            java.lang.String r4 = r3.toString()     // Catch: java.lang.Throwable -> L7
            java.io.File r5 = new java.io.File     // Catch: java.lang.Throwable -> L7
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L7
            boolean r5 = r5.exists()     // Catch: java.lang.Throwable -> L7
            if (r5 == 0) goto L4b
            java.lang.System.load(r4)     // Catch: java.lang.Throwable -> L7
        L49:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            return
        L4b:
            throw r1     // Catch: java.lang.Throwable -> L7
        L4c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            throw r4
    }

    public static void updateAppInfo(@androidx.annotation.NonNull android.content.Context r8) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 25
            if (r0 <= r1) goto L78
            r1 = 28
            if (r0 < r1) goto Lb
            goto L78
        Lb:
            com.google.android.play.core.internal.zzag r0 = com.google.android.play.core.splitinstall.SplitInstallHelper.zza
            r1 = 0
            java.lang.Object[] r2 = new java.lang.Object[r1]
            java.lang.String r3 = "Calling dispatchPackageBroadcast"
            r0.zzd(r3, r2)
            java.lang.String r2 = "android.app.ActivityThread"
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch: java.lang.Exception -> L6e
            java.lang.String r3 = "currentActivityThread"
            java.lang.Class[] r4 = new java.lang.Class[r1]     // Catch: java.lang.Exception -> L6e
            java.lang.reflect.Method r3 = r2.getMethod(r3, r4)     // Catch: java.lang.Exception -> L6e
            r4 = 1
            r3.setAccessible(r4)     // Catch: java.lang.Exception -> L6e
            java.lang.Object[] r5 = new java.lang.Object[r1]     // Catch: java.lang.Exception -> L6e
            r6 = 0
            java.lang.Object r3 = r3.invoke(r6, r5)     // Catch: java.lang.Exception -> L6e
            java.lang.String r5 = "mAppThread"
            java.lang.reflect.Field r2 = r2.getDeclaredField(r5)     // Catch: java.lang.Exception -> L6e
            r2.setAccessible(r4)     // Catch: java.lang.Exception -> L6e
            java.lang.Object r2 = r2.get(r3)     // Catch: java.lang.Exception -> L6e
            java.lang.Class r3 = r2.getClass()     // Catch: java.lang.Exception -> L6e
            r5 = 2
            java.lang.Class[] r6 = new java.lang.Class[r5]     // Catch: java.lang.Exception -> L6e
            java.lang.Class r7 = java.lang.Integer.TYPE     // Catch: java.lang.Exception -> L6e
            r6[r1] = r7     // Catch: java.lang.Exception -> L6e
            java.lang.Class<java.lang.String[]> r7 = java.lang.String[].class
            r6[r4] = r7     // Catch: java.lang.Exception -> L6e
            java.lang.String r7 = "dispatchPackageBroadcast"
            java.lang.reflect.Method r3 = r3.getMethod(r7, r6)     // Catch: java.lang.Exception -> L6e
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch: java.lang.Exception -> L6e
            r6 = 3
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Exception -> L6e
            r5[r1] = r6     // Catch: java.lang.Exception -> L6e
            java.lang.String[] r6 = new java.lang.String[r4]     // Catch: java.lang.Exception -> L6e
            java.lang.String r8 = r8.getPackageName()     // Catch: java.lang.Exception -> L6e
            r6[r1] = r8     // Catch: java.lang.Exception -> L6e
            r5[r4] = r6     // Catch: java.lang.Exception -> L6e
            r3.invoke(r2, r5)     // Catch: java.lang.Exception -> L6e
            java.lang.String r8 = "Called dispatchPackageBroadcast"
            java.lang.Object[] r2 = new java.lang.Object[r1]     // Catch: java.lang.Exception -> L6e
            r0.zzd(r8, r2)     // Catch: java.lang.Exception -> L6e
            return
        L6e:
            r8 = move-exception
            com.google.android.play.core.internal.zzag r0 = com.google.android.play.core.splitinstall.SplitInstallHelper.zza
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = "Update app info with dispatchPackageBroadcast failed!"
            r0.zzc(r8, r2, r1)
        L78:
            return
    }
}
