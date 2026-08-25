package com.google.android.gms.common.util;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* JADX INFO: loaded from: classes2.dex */
@com.google.android.gms.common.annotation.KeepForSdk
public final class CrashUtils {
    private static final java.lang.String[] zza = null;

    static {
            java.lang.String r0 = "android."
            java.lang.String r1 = "com.android."
            java.lang.String r2 = "dalvik."
            java.lang.String r3 = "java."
            java.lang.String r4 = "javax."
            java.lang.String[] r0 = new java.lang.String[]{r0, r1, r2, r3, r4}
            com.google.android.gms.common.util.CrashUtils.zza = r0
            return
    }

    public CrashUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public static boolean addDynamiteErrorToDropBox(@androidx.annotation.NonNull android.content.Context r1, @androidx.annotation.NonNull java.lang.Throwable r2) {
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r1)     // Catch: java.lang.Exception -> L7
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r2)     // Catch: java.lang.Exception -> L7
            goto Lf
        L7:
            r1 = move-exception
            java.lang.String r2 = "CrashUtils"
            java.lang.String r0 = "Error adding exception to DropBox!"
            android.util.Log.e(r2, r0, r1)
        Lf:
            r1 = 0
            return r1
    }
}
