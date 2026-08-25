package com.google.android.play.core.splitinstall.testing;

/* JADX INFO: compiled from: com.google.android.play:core@@1.10.3 */
/* JADX INFO: loaded from: classes.dex */
public final class FakeSplitInstallManagerFactory {

    @androidx.annotation.Nullable
    private static com.google.android.play.core.splitinstall.testing.FakeSplitInstallManager zza;

    private FakeSplitInstallManagerFactory() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.google.android.play.core.splitinstall.testing.FakeSplitInstallManager create(android.content.Context r3) {
            com.google.android.play.core.splitinstall.zzp r0 = com.google.android.play.core.splitinstall.zzu.zza(r3)     // Catch: java.lang.Exception -> L2f
            java.io.File r0 = r0.zzb()     // Catch: java.lang.Exception -> L2f
            if (r0 == 0) goto L27
            boolean r1 = r0.exists()     // Catch: java.lang.Exception -> L2f
            if (r1 == 0) goto L15
            com.google.android.play.core.splitinstall.testing.FakeSplitInstallManager r3 = create(r3, r0)     // Catch: java.lang.Exception -> L2f
            return r3
        L15:
            com.google.android.play.core.common.LocalTestingException r3 = new com.google.android.play.core.common.LocalTestingException     // Catch: java.lang.Exception -> L2f
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Exception -> L2f
            r2 = 0
            r1[r2] = r0     // Catch: java.lang.Exception -> L2f
            java.lang.String r0 = "Local testing directory not found: %s"
            java.lang.String r0 = java.lang.String.format(r0, r1)     // Catch: java.lang.Exception -> L2f
            r3.<init>(r0)     // Catch: java.lang.Exception -> L2f
            throw r3     // Catch: java.lang.Exception -> L2f
        L27:
            com.google.android.play.core.common.LocalTestingException r3 = new com.google.android.play.core.common.LocalTestingException     // Catch: java.lang.Exception -> L2f
            java.lang.String r0 = "Failed to retrieve local testing directory path"
            r3.<init>(r0)     // Catch: java.lang.Exception -> L2f
            throw r3     // Catch: java.lang.Exception -> L2f
        L2f:
            r3 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r3)
            throw r0
    }

    public static synchronized com.google.android.play.core.splitinstall.testing.FakeSplitInstallManager create(android.content.Context r4, java.io.File r5) {
            java.lang.Class<com.google.android.play.core.splitinstall.testing.FakeSplitInstallManagerFactory> r0 = com.google.android.play.core.splitinstall.testing.FakeSplitInstallManagerFactory.class
            monitor-enter(r0)
            com.google.android.play.core.splitinstall.testing.FakeSplitInstallManager r1 = com.google.android.play.core.splitinstall.testing.FakeSplitInstallManagerFactory.zza     // Catch: java.lang.Throwable -> L47
            if (r1 != 0) goto Le
            com.google.android.play.core.splitinstall.testing.FakeSplitInstallManager r4 = createNewInstance(r4, r5)     // Catch: java.lang.Throwable -> L47
            com.google.android.play.core.splitinstall.testing.FakeSplitInstallManagerFactory.zza = r4     // Catch: java.lang.Throwable -> L47
            goto L20
        Le:
            java.io.File r4 = r1.zzc()     // Catch: java.lang.Throwable -> L47
            java.lang.String r4 = r4.getAbsolutePath()     // Catch: java.lang.Throwable -> L47
            java.lang.String r1 = r5.getAbsolutePath()     // Catch: java.lang.Throwable -> L47
            boolean r4 = r4.equals(r1)     // Catch: java.lang.Throwable -> L47
            if (r4 == 0) goto L24
        L20:
            com.google.android.play.core.splitinstall.testing.FakeSplitInstallManager r4 = com.google.android.play.core.splitinstall.testing.FakeSplitInstallManagerFactory.zza     // Catch: java.lang.Throwable -> L47
            monitor-exit(r0)
            return r4
        L24:
            java.lang.RuntimeException r4 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> L47
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L47
            r2 = 0
            com.google.android.play.core.splitinstall.testing.FakeSplitInstallManager r3 = com.google.android.play.core.splitinstall.testing.FakeSplitInstallManagerFactory.zza     // Catch: java.lang.Throwable -> L47
            java.io.File r3 = r3.zzc()     // Catch: java.lang.Throwable -> L47
            java.lang.String r3 = r3.getAbsolutePath()     // Catch: java.lang.Throwable -> L47
            r1[r2] = r3     // Catch: java.lang.Throwable -> L47
            r2 = 1
            java.lang.String r5 = r5.getAbsolutePath()     // Catch: java.lang.Throwable -> L47
            r1[r2] = r5     // Catch: java.lang.Throwable -> L47
            java.lang.String r5 = "Different module directories used to initialize FakeSplitInstallManager: '%s' and '%s'"
            java.lang.String r5 = java.lang.String.format(r5, r1)     // Catch: java.lang.Throwable -> L47
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L47
            throw r4     // Catch: java.lang.Throwable -> L47
        L47:
            r4 = move-exception
            monitor-exit(r0)
            throw r4
    }

    public static com.google.android.play.core.splitinstall.testing.FakeSplitInstallManager createNewInstance(android.content.Context r3, java.io.File r4) {
            com.google.android.play.core.splitcompat.SplitCompat.install(r3)
            com.google.android.play.core.splitinstall.testing.FakeSplitInstallManager r0 = new com.google.android.play.core.splitinstall.testing.FakeSplitInstallManager
            com.google.android.play.core.splitinstall.zzs r1 = new com.google.android.play.core.splitinstall.zzs
            java.lang.String r2 = r3.getPackageName()
            r1.<init>(r3, r2)
            com.google.android.play.core.splitinstall.testing.zzq r2 = new com.google.android.play.core.splitinstall.testing.zzq
            r2.<init>(r4)
            r0.<init>(r3, r4, r1, r2)
            return r0
    }
}
