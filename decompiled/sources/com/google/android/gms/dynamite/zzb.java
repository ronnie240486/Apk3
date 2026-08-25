package com.google.android.gms.dynamite;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzb {

    @androidx.annotation.Nullable
    @androidx.annotation.GuardedBy("DynamiteLoaderV2ClassLoader.class")
    private static volatile java.lang.ClassLoader zza;

    @androidx.annotation.Nullable
    @androidx.annotation.GuardedBy("DynamiteLoaderV2ClassLoader.class")
    private static volatile java.lang.Thread zzb;

    @androidx.annotation.Nullable
    public static synchronized java.lang.ClassLoader zza() {
            java.lang.Class<com.google.android.gms.dynamite.zzb> r0 = com.google.android.gms.dynamite.zzb.class
            monitor-enter(r0)
            java.lang.ClassLoader r1 = com.google.android.gms.dynamite.zzb.zza     // Catch: java.lang.Throwable -> L11
            if (r1 != 0) goto Ld
            java.lang.ClassLoader r1 = zzb()     // Catch: java.lang.Throwable -> L11
            com.google.android.gms.dynamite.zzb.zza = r1     // Catch: java.lang.Throwable -> L11
        Ld:
            java.lang.ClassLoader r1 = com.google.android.gms.dynamite.zzb.zza     // Catch: java.lang.Throwable -> L11
            monitor-exit(r0)
            return r1
        L11:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    @androidx.annotation.Nullable
    private static synchronized java.lang.ClassLoader zzb() {
            java.lang.Class<com.google.android.gms.dynamite.zzb> r0 = com.google.android.gms.dynamite.zzb.class
            monitor-enter(r0)
            java.lang.Thread r1 = com.google.android.gms.dynamite.zzb.zzb     // Catch: java.lang.Throwable -> L46
            r2 = 0
            if (r1 != 0) goto L15
            java.lang.Thread r1 = zzc()     // Catch: java.lang.Throwable -> L46
            com.google.android.gms.dynamite.zzb.zzb = r1     // Catch: java.lang.Throwable -> L46
            java.lang.Thread r1 = com.google.android.gms.dynamite.zzb.zzb     // Catch: java.lang.Throwable -> L46
            if (r1 == 0) goto L13
            goto L15
        L13:
            monitor-exit(r0)
            return r2
        L15:
            java.lang.Thread r1 = com.google.android.gms.dynamite.zzb.zzb     // Catch: java.lang.Throwable -> L46
            monitor-enter(r1)     // Catch: java.lang.Throwable -> L46
            java.lang.Thread r3 = com.google.android.gms.dynamite.zzb.zzb     // Catch: java.lang.Throwable -> L1f java.lang.SecurityException -> L21
            java.lang.ClassLoader r2 = r3.getContextClassLoader()     // Catch: java.lang.Throwable -> L1f java.lang.SecurityException -> L21
            goto L41
        L1f:
            r2 = move-exception
            goto L44
        L21:
            r3 = move-exception
            java.lang.String r4 = "DynamiteLoaderV2CL"
            java.lang.String r5 = "Failed to get thread context classloader "
            java.lang.String r3 = r3.getMessage()     // Catch: java.lang.Throwable -> L1f
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch: java.lang.Throwable -> L1f
            int r6 = r3.length()     // Catch: java.lang.Throwable -> L1f
            if (r6 == 0) goto L39
            java.lang.String r3 = r5.concat(r3)     // Catch: java.lang.Throwable -> L1f
            goto L3e
        L39:
            java.lang.String r3 = new java.lang.String     // Catch: java.lang.Throwable -> L1f
            r3.<init>(r5)     // Catch: java.lang.Throwable -> L1f
        L3e:
            android.util.Log.w(r4, r3)     // Catch: java.lang.Throwable -> L1f
        L41:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1f
            monitor-exit(r0)
            return r2
        L44:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1f
            throw r2     // Catch: java.lang.Throwable -> L46
        L46:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    @androidx.annotation.Nullable
    private static synchronized java.lang.Thread zzc() {
            java.lang.Class<com.google.android.gms.dynamite.zzb> r0 = com.google.android.gms.dynamite.zzb.class
            monitor-enter(r0)
            android.os.Looper r1 = android.os.Looper.getMainLooper()     // Catch: java.lang.Throwable -> L9d
            java.lang.Thread r1 = r1.getThread()     // Catch: java.lang.Throwable -> L9d
            java.lang.ThreadGroup r1 = r1.getThreadGroup()     // Catch: java.lang.Throwable -> L9d
            r2 = 0
            if (r1 != 0) goto L14
            monitor-exit(r0)
            return r2
        L14:
            java.lang.Class<java.lang.Void> r3 = java.lang.Void.class
            monitor-enter(r3)     // Catch: java.lang.Throwable -> L9d
            int r4 = r1.activeGroupCount()     // Catch: java.lang.Throwable -> L72 java.lang.SecurityException -> L74
            java.lang.ThreadGroup[] r5 = new java.lang.ThreadGroup[r4]     // Catch: java.lang.Throwable -> L72 java.lang.SecurityException -> L74
            r1.enumerate(r5)     // Catch: java.lang.Throwable -> L72 java.lang.SecurityException -> L74
            r6 = 0
            r7 = 0
        L22:
            if (r7 >= r4) goto L36
            r8 = r5[r7]     // Catch: java.lang.Throwable -> L72 java.lang.SecurityException -> L74
            java.lang.String r9 = "dynamiteLoader"
            java.lang.String r10 = r8.getName()     // Catch: java.lang.Throwable -> L72 java.lang.SecurityException -> L74
            boolean r9 = r9.equals(r10)     // Catch: java.lang.Throwable -> L72 java.lang.SecurityException -> L74
            if (r9 == 0) goto L33
            goto L37
        L33:
            int r7 = r7 + 1
            goto L22
        L36:
            r8 = r2
        L37:
            if (r8 != 0) goto L40
            java.lang.ThreadGroup r8 = new java.lang.ThreadGroup     // Catch: java.lang.Throwable -> L72 java.lang.SecurityException -> L74
            java.lang.String r4 = "dynamiteLoader"
            r8.<init>(r1, r4)     // Catch: java.lang.Throwable -> L72 java.lang.SecurityException -> L74
        L40:
            int r1 = r8.activeCount()     // Catch: java.lang.Throwable -> L72 java.lang.SecurityException -> L74
            java.lang.Thread[] r4 = new java.lang.Thread[r1]     // Catch: java.lang.Throwable -> L72 java.lang.SecurityException -> L74
            r8.enumerate(r4)     // Catch: java.lang.Throwable -> L72 java.lang.SecurityException -> L74
        L49:
            if (r6 >= r1) goto L5d
            r5 = r4[r6]     // Catch: java.lang.Throwable -> L72 java.lang.SecurityException -> L74
            java.lang.String r7 = "GmsDynamite"
            java.lang.String r9 = r5.getName()     // Catch: java.lang.Throwable -> L72 java.lang.SecurityException -> L74
            boolean r7 = r7.equals(r9)     // Catch: java.lang.Throwable -> L72 java.lang.SecurityException -> L74
            if (r7 == 0) goto L5a
            goto L5e
        L5a:
            int r6 = r6 + 1
            goto L49
        L5d:
            r5 = r2
        L5e:
            if (r5 != 0) goto L98
            com.google.android.gms.dynamite.zza r1 = new com.google.android.gms.dynamite.zza     // Catch: java.lang.SecurityException -> L6e java.lang.Throwable -> L72
            r1.<init>(r8)     // Catch: java.lang.SecurityException -> L6e java.lang.Throwable -> L72
            r1.setContextClassLoader(r2)     // Catch: java.lang.SecurityException -> L6c java.lang.Throwable -> L72
            r1.start()     // Catch: java.lang.SecurityException -> L6c java.lang.Throwable -> L72
            goto L97
        L6c:
            r2 = move-exception
            goto L78
        L6e:
            r1 = move-exception
            r2 = r1
            r1 = r5
            goto L78
        L72:
            r1 = move-exception
            goto L9b
        L74:
            r1 = move-exception
            r11 = r2
            r2 = r1
            r1 = r11
        L78:
            java.lang.String r4 = "DynamiteLoaderV2CL"
            java.lang.String r5 = "Failed to enumerate thread/threadgroup "
            java.lang.String r2 = r2.getMessage()     // Catch: java.lang.Throwable -> L72
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch: java.lang.Throwable -> L72
            int r6 = r2.length()     // Catch: java.lang.Throwable -> L72
            if (r6 == 0) goto L8f
            java.lang.String r2 = r5.concat(r2)     // Catch: java.lang.Throwable -> L72
            goto L94
        L8f:
            java.lang.String r2 = new java.lang.String     // Catch: java.lang.Throwable -> L72
            r2.<init>(r5)     // Catch: java.lang.Throwable -> L72
        L94:
            android.util.Log.w(r4, r2)     // Catch: java.lang.Throwable -> L72
        L97:
            r5 = r1
        L98:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L72
            monitor-exit(r0)
            return r5
        L9b:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L72
            throw r1     // Catch: java.lang.Throwable -> L9d
        L9d:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }
}
