package com.google.android.play.core.internal;

/* JADX INFO: compiled from: com.google.android.play:core@@1.10.3 */
/* JADX INFO: loaded from: classes.dex */
public final class zzag {
    private final java.lang.String zza;

    public zzag(java.lang.String r5) {
            r4 = this;
            r4.<init>()
            int r0 = android.os.Process.myUid()
            int r1 = android.os.Process.myPid()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = 39
            r2.<init>(r3)
            java.lang.String r3 = "UID: ["
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = "]  PID: ["
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = "] "
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            java.lang.String r5 = java.lang.String.valueOf(r5)
            int r1 = r5.length()
            if (r1 == 0) goto L3a
            java.lang.String r5 = r0.concat(r5)
            goto L3f
        L3a:
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0)
        L3f:
            r4.zza = r5
            return
    }

    private static java.lang.String zzf(java.lang.String r4, java.lang.String r5, @androidx.annotation.Nullable java.lang.Object... r6) {
            int r0 = r6.length
            if (r0 <= 0) goto L4c
            java.util.Locale r0 = java.util.Locale.US     // Catch: java.util.IllegalFormatException -> La
            java.lang.String r5 = java.lang.String.format(r0, r5, r6)     // Catch: java.util.IllegalFormatException -> La
            goto L4c
        La:
            r0 = move-exception
            java.lang.String r1 = java.lang.String.valueOf(r5)
            java.lang.String r2 = "Unable to format "
            int r3 = r1.length()
            if (r3 == 0) goto L1c
            java.lang.String r1 = r2.concat(r1)
            goto L21
        L1c:
            java.lang.String r1 = new java.lang.String
            r1.<init>(r2)
        L21:
            java.lang.String r2 = "PlayCore"
            android.util.Log.e(r2, r1, r0)
            java.lang.String r0 = ", "
            java.lang.String r6 = android.text.TextUtils.join(r0, r6)
            java.lang.String r0 = java.lang.String.valueOf(r5)
            int r0 = r0.length()
            java.lang.String r1 = java.lang.String.valueOf(r6)
            int r1 = r1.length()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            int r0 = r0 + 3
            int r0 = r0 + r1
            r2.<init>(r0)
            java.lang.String r0 = " ["
            java.lang.String r1 = "]"
            java.lang.String r5 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r2, r5, r0, r6, r1)
        L4c:
            java.lang.String r6 = java.lang.String.valueOf(r4)
            int r6 = r6.length()
            java.lang.String r0 = java.lang.String.valueOf(r5)
            int r0 = r0.length()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            int r6 = r6 + 3
            int r6 = r6 + r0
            r1.<init>(r6)
            java.lang.String r6 = " : "
            java.lang.String r4 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r4, r6, r5)
            return r4
    }

    public final int zza(java.lang.String r3, @androidx.annotation.Nullable java.lang.Object... r4) {
            r2 = this;
            java.lang.String r0 = "PlayCore"
            r1 = 3
            boolean r1 = android.util.Log.isLoggable(r0, r1)
            if (r1 == 0) goto L14
            java.lang.String r1 = r2.zza
            java.lang.String r3 = zzf(r1, r3, r4)
            int r3 = android.util.Log.d(r0, r3)
            return r3
        L14:
            r3 = 0
            return r3
    }

    public final int zzb(java.lang.String r3, @androidx.annotation.Nullable java.lang.Object... r4) {
            r2 = this;
            java.lang.String r0 = "PlayCore"
            r1 = 6
            boolean r1 = android.util.Log.isLoggable(r0, r1)
            if (r1 == 0) goto L14
            java.lang.String r1 = r2.zza
            java.lang.String r3 = zzf(r1, r3, r4)
            int r3 = android.util.Log.e(r0, r3)
            return r3
        L14:
            r3 = 0
            return r3
    }

    public final int zzc(java.lang.Throwable r3, java.lang.String r4, @androidx.annotation.Nullable java.lang.Object... r5) {
            r2 = this;
            java.lang.String r0 = "PlayCore"
            r1 = 6
            boolean r1 = android.util.Log.isLoggable(r0, r1)
            if (r1 == 0) goto L14
            java.lang.String r1 = r2.zza
            java.lang.String r4 = zzf(r1, r4, r5)
            int r3 = android.util.Log.e(r0, r4, r3)
            return r3
        L14:
            r3 = 0
            return r3
    }

    public final int zzd(java.lang.String r3, @androidx.annotation.Nullable java.lang.Object... r4) {
            r2 = this;
            java.lang.String r0 = "PlayCore"
            r1 = 4
            boolean r1 = android.util.Log.isLoggable(r0, r1)
            if (r1 == 0) goto L14
            java.lang.String r1 = r2.zza
            java.lang.String r3 = zzf(r1, r3, r4)
            int r3 = android.util.Log.i(r0, r3)
            return r3
        L14:
            r3 = 0
            return r3
    }

    public final int zze(java.lang.String r3, @androidx.annotation.Nullable java.lang.Object... r4) {
            r2 = this;
            java.lang.String r0 = "PlayCore"
            r1 = 5
            boolean r1 = android.util.Log.isLoggable(r0, r1)
            if (r1 == 0) goto L14
            java.lang.String r1 = r2.zza
            java.lang.String r3 = zzf(r1, r3, r4)
            int r3 = android.util.Log.w(r0, r3)
            return r3
        L14:
            r3 = 0
            return r3
    }
}
