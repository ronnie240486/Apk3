package com.google.android.gms.common.util;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* JADX INFO: loaded from: classes2.dex */
@com.google.android.gms.common.annotation.KeepForSdk
public class ProcessUtils {

    @javax.annotation.Nullable
    private static java.lang.String zza;
    private static int zzb;

    private ProcessUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.Nullable
    @com.google.android.gms.common.annotation.KeepForSdk
    public static java.lang.String getMyProcessName() {
            java.lang.String r0 = com.google.android.gms.common.util.ProcessUtils.zza
            if (r0 != 0) goto L5a
            int r0 = com.google.android.gms.common.util.ProcessUtils.zzb
            if (r0 != 0) goto Le
            int r0 = android.os.Process.myPid()
            com.google.android.gms.common.util.ProcessUtils.zzb = r0
        Le:
            r1 = 0
            if (r0 > 0) goto L12
            goto L58
        L12:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4f java.io.IOException -> L54
            r3 = 25
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L4f java.io.IOException -> L54
            java.lang.String r3 = "/proc/"
            r2.append(r3)     // Catch: java.lang.Throwable -> L4f java.io.IOException -> L54
            r2.append(r0)     // Catch: java.lang.Throwable -> L4f java.io.IOException -> L54
            java.lang.String r0 = "/cmdline"
            r2.append(r0)     // Catch: java.lang.Throwable -> L4f java.io.IOException -> L54
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Throwable -> L4f java.io.IOException -> L54
            android.os.StrictMode$ThreadPolicy r2 = android.os.StrictMode.allowThreadDiskReads()     // Catch: java.lang.Throwable -> L4f java.io.IOException -> L54
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L4a
            java.io.FileReader r4 = new java.io.FileReader     // Catch: java.lang.Throwable -> L4a
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L4a
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L4a
            android.os.StrictMode.setThreadPolicy(r2)     // Catch: java.lang.Throwable -> L4f java.io.IOException -> L54
            java.lang.String r0 = r3.readLine()     // Catch: java.lang.Throwable -> L47 java.io.IOException -> L55
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)     // Catch: java.lang.Throwable -> L47 java.io.IOException -> L55
            java.lang.String r1 = r0.trim()     // Catch: java.lang.Throwable -> L47 java.io.IOException -> L55
            goto L55
        L47:
            r0 = move-exception
            r1 = r3
            goto L50
        L4a:
            r0 = move-exception
            android.os.StrictMode.setThreadPolicy(r2)     // Catch: java.lang.Throwable -> L4f java.io.IOException -> L54
            throw r0     // Catch: java.lang.Throwable -> L4f java.io.IOException -> L54
        L4f:
            r0 = move-exception
        L50:
            com.google.android.gms.common.util.IOUtils.closeQuietly(r1)
            throw r0
        L54:
            r3 = r1
        L55:
            com.google.android.gms.common.util.IOUtils.closeQuietly(r3)
        L58:
            com.google.android.gms.common.util.ProcessUtils.zza = r1
        L5a:
            java.lang.String r0 = com.google.android.gms.common.util.ProcessUtils.zza
            return r0
    }
}
