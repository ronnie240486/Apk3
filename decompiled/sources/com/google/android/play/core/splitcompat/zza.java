package com.google.android.play.core.splitcompat;

/* JADX INFO: compiled from: com.google.android.play:core@@1.10.3 */
/* JADX INFO: loaded from: classes.dex */
public final class zza {
    private final com.google.android.play.core.splitcompat.zze zza;

    public zza(com.google.android.play.core.splitcompat.zze r1) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            return
    }

    public static final int zzc(android.content.res.AssetManager r3, java.io.File r4) {
            java.lang.Class<java.lang.Integer> r0 = java.lang.Integer.class
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            java.lang.String r4 = r4.getPath()
            java.lang.String r2 = "addAssetPath"
            java.lang.Object r3 = com.google.android.play.core.internal.zzbw.zzd(r3, r2, r0, r1, r4)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r0 = 39
            r4.<init>(r0)
            java.lang.String r0 = "addAssetPath completed with "
            r4.append(r0)
            r4.append(r3)
            java.lang.String r4 = r4.toString()
            java.lang.String r0 = "SplitCompat"
            android.util.Log.d(r0, r4)
            return r3
    }

    public final synchronized void zza(android.content.Context r2, java.util.Set r3) {
            r1 = this;
            monitor-enter(r1)
            android.content.res.AssetManager r2 = r2.getAssets()     // Catch: java.lang.Throwable -> L1b
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L1b
        L9:
            boolean r0 = r3.hasNext()     // Catch: java.lang.Throwable -> L1b
            if (r0 == 0) goto L19
            java.lang.Object r0 = r3.next()     // Catch: java.lang.Throwable -> L1b
            java.io.File r0 = (java.io.File) r0     // Catch: java.lang.Throwable -> L1b
            zzc(r2, r0)     // Catch: java.lang.Throwable -> L1b
            goto L9
        L19:
            monitor-exit(r1)
            return
        L1b:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    public final synchronized boolean zzb(android.content.Context r5, java.util.Set r6) {
            r4 = this;
            monitor-enter(r4)
            android.os.StrictMode$ThreadPolicy r0 = android.os.StrictMode.getThreadPolicy()     // Catch: java.lang.Throwable -> Le java.lang.Exception -> L10
            android.os.StrictMode.allowThreadDiskReads()     // Catch: java.lang.Exception -> Lc java.lang.Throwable -> Le
            android.os.StrictMode.allowThreadDiskWrites()     // Catch: java.lang.Exception -> Lc java.lang.Throwable -> Le
            goto L19
        Lc:
            r1 = move-exception
            goto L12
        Le:
            r5 = move-exception
            goto L5b
        L10:
            r1 = move-exception
            r0 = 0
        L12:
            java.lang.String r2 = "SplitCompat"
            java.lang.String r3 = "Unable to set up strict mode."
            android.util.Log.i(r2, r3, r1)     // Catch: java.lang.Throwable -> Le
        L19:
            java.util.HashSet r1 = new java.util.HashSet     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L44
            r1.<init>()     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L44
            java.util.Iterator r6 = r6.iterator()     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L44
        L22:
            boolean r2 = r6.hasNext()     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L44
            if (r2 == 0) goto L38
            java.lang.Object r2 = r6.next()     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L44
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L44
            com.google.android.play.core.splitcompat.zze r3 = r4.zza     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L44
            java.io.File r2 = r3.zzg(r2)     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L44
            r1.add(r2)     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L44
            goto L22
        L38:
            r4.zza(r5, r1)     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L44
            if (r0 == 0) goto L40
            android.os.StrictMode.setThreadPolicy(r0)     // Catch: java.lang.Throwable -> Le
        L40:
            r5 = 1
            goto L52
        L42:
            r5 = move-exception
            goto L54
        L44:
            r5 = move-exception
            java.lang.String r6 = "SplitCompat"
            java.lang.String r1 = "Error installing additional splits"
            android.util.Log.e(r6, r1, r5)     // Catch: java.lang.Throwable -> L42
            if (r0 == 0) goto L51
            android.os.StrictMode.setThreadPolicy(r0)     // Catch: java.lang.Throwable -> Le
        L51:
            r5 = 0
        L52:
            monitor-exit(r4)
            return r5
        L54:
            if (r0 != 0) goto L57
            goto L5a
        L57:
            android.os.StrictMode.setThreadPolicy(r0)     // Catch: java.lang.Throwable -> Le
        L5a:
            throw r5     // Catch: java.lang.Throwable -> Le
        L5b:
            monitor-exit(r4)
            throw r5
    }
}
