package com.google.android.play.core.splitcompat;

/* JADX INFO: compiled from: com.google.android.play:core@@1.10.3 */
/* JADX INFO: loaded from: classes.dex */
public final class zzd {

    @androidx.annotation.Nullable
    private static java.util.concurrent.ThreadPoolExecutor zza;

    public static java.util.concurrent.Executor zza() {
            java.util.concurrent.ThreadPoolExecutor r0 = com.google.android.play.core.splitcompat.zzd.zza
            if (r0 != 0) goto L20
            java.util.concurrent.ThreadPoolExecutor r0 = new java.util.concurrent.ThreadPoolExecutor
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.SECONDS
            java.util.concurrent.LinkedBlockingQueue r7 = new java.util.concurrent.LinkedBlockingQueue
            r7.<init>()
            com.google.android.play.core.splitcompat.zzc r8 = new com.google.android.play.core.splitcompat.zzc
            r8.<init>()
            r2 = 1
            r3 = 1
            r4 = 10
            r1 = r0
            r1.<init>(r2, r3, r4, r6, r7, r8)
            com.google.android.play.core.splitcompat.zzd.zza = r0
            r1 = 1
            r0.allowCoreThreadTimeOut(r1)
        L20:
            java.util.concurrent.ThreadPoolExecutor r0 = com.google.android.play.core.splitcompat.zzd.zza
            return r0
    }
}
