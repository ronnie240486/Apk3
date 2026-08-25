package com.google.android.gms.common.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* JADX INFO: loaded from: classes2.dex */
@com.google.android.gms.common.annotation.KeepForSdk
public final class GmsLogger {
    private final java.lang.String zza;

    @androidx.annotation.Nullable
    private final java.lang.String zzb;

    @com.google.android.gms.common.annotation.KeepForSdk
    public GmsLogger(@androidx.annotation.NonNull java.lang.String r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public GmsLogger(@androidx.annotation.NonNull java.lang.String r6, @androidx.annotation.Nullable java.lang.String r7) {
            r5 = this;
            r5.<init>()
            java.lang.String r0 = "log tag cannot be null"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r6, r0)
            int r0 = r6.length()
            r1 = 1
            r2 = 0
            r3 = 23
            if (r0 > r3) goto L14
            r0 = 1
            goto L15
        L14:
            r0 = 0
        L15:
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r2] = r6
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            r4[r1] = r2
            java.lang.String r1 = "tag \"%s\" is longer than the %d character maximum"
            com.google.android.gms.common.internal.Preconditions.checkArgument(r0, r1, r4)
            r5.zza = r6
            if (r7 == 0) goto L34
            int r6 = r7.length()
            if (r6 > 0) goto L31
            goto L34
        L31:
            r5.zzb = r7
            return
        L34:
            r6 = 0
            r5.zzb = r6
            return
    }

    private final java.lang.String zza(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = r1.zzb
            if (r0 != 0) goto L5
            return r2
        L5:
            java.lang.String r2 = r0.concat(r2)
            return r2
    }

    private final java.lang.String zzb(java.lang.String r1, java.lang.Object... r2) {
            r0 = this;
            java.lang.String r1 = java.lang.String.format(r1, r2)
            java.lang.String r2 = r0.zzb
            if (r2 != 0) goto L9
            return r1
        L9:
            java.lang.String r1 = r2.concat(r1)
            return r1
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public boolean canLog(int r2) {
            r1 = this;
            java.lang.String r0 = r1.zza
            boolean r2 = android.util.Log.isLoggable(r0, r2)
            return r2
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public boolean canLogPii() {
            r1 = this;
            r0 = 0
            return r0
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public void d(@androidx.annotation.NonNull java.lang.String r2, @androidx.annotation.NonNull java.lang.String r3) {
            r1 = this;
            r0 = 3
            boolean r0 = r1.canLog(r0)
            if (r0 == 0) goto Le
            java.lang.String r3 = r1.zza(r3)
            android.util.Log.d(r2, r3)
        Le:
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public void d(@androidx.annotation.NonNull java.lang.String r2, @androidx.annotation.NonNull java.lang.String r3, @androidx.annotation.NonNull java.lang.Throwable r4) {
            r1 = this;
            r0 = 3
            boolean r0 = r1.canLog(r0)
            if (r0 == 0) goto Le
            java.lang.String r3 = r1.zza(r3)
            android.util.Log.d(r2, r3, r4)
        Le:
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public void e(@androidx.annotation.NonNull java.lang.String r2, @androidx.annotation.NonNull java.lang.String r3) {
            r1 = this;
            r0 = 6
            boolean r0 = r1.canLog(r0)
            if (r0 == 0) goto Le
            java.lang.String r3 = r1.zza(r3)
            android.util.Log.e(r2, r3)
        Le:
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public void e(@androidx.annotation.NonNull java.lang.String r2, @androidx.annotation.NonNull java.lang.String r3, @androidx.annotation.NonNull java.lang.Throwable r4) {
            r1 = this;
            r0 = 6
            boolean r0 = r1.canLog(r0)
            if (r0 == 0) goto Le
            java.lang.String r3 = r1.zza(r3)
            android.util.Log.e(r2, r3, r4)
        Le:
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public void efmt(@androidx.annotation.NonNull java.lang.String r2, @androidx.annotation.NonNull java.lang.String r3, @androidx.annotation.NonNull java.lang.Object... r4) {
            r1 = this;
            r0 = 6
            boolean r0 = r1.canLog(r0)
            if (r0 == 0) goto Le
            java.lang.String r3 = r1.zzb(r3, r4)
            android.util.Log.e(r2, r3)
        Le:
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public void i(@androidx.annotation.NonNull java.lang.String r2, @androidx.annotation.NonNull java.lang.String r3) {
            r1 = this;
            r0 = 4
            boolean r0 = r1.canLog(r0)
            if (r0 == 0) goto Le
            java.lang.String r3 = r1.zza(r3)
            android.util.Log.i(r2, r3)
        Le:
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public void i(@androidx.annotation.NonNull java.lang.String r2, @androidx.annotation.NonNull java.lang.String r3, @androidx.annotation.NonNull java.lang.Throwable r4) {
            r1 = this;
            r0 = 4
            boolean r0 = r1.canLog(r0)
            if (r0 == 0) goto Le
            java.lang.String r3 = r1.zza(r3)
            android.util.Log.i(r2, r3, r4)
        Le:
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public void pii(@androidx.annotation.NonNull java.lang.String r1, @androidx.annotation.NonNull java.lang.String r2) {
            r0 = this;
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public void pii(@androidx.annotation.NonNull java.lang.String r1, @androidx.annotation.NonNull java.lang.String r2, @androidx.annotation.NonNull java.lang.Throwable r3) {
            r0 = this;
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public void v(@androidx.annotation.NonNull java.lang.String r2, @androidx.annotation.NonNull java.lang.String r3) {
            r1 = this;
            r0 = 2
            boolean r0 = r1.canLog(r0)
            if (r0 == 0) goto Le
            java.lang.String r3 = r1.zza(r3)
            android.util.Log.v(r2, r3)
        Le:
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public void v(@androidx.annotation.NonNull java.lang.String r2, @androidx.annotation.NonNull java.lang.String r3, @androidx.annotation.NonNull java.lang.Throwable r4) {
            r1 = this;
            r0 = 2
            boolean r0 = r1.canLog(r0)
            if (r0 == 0) goto Le
            java.lang.String r3 = r1.zza(r3)
            android.util.Log.v(r2, r3, r4)
        Le:
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public void w(@androidx.annotation.NonNull java.lang.String r2, @androidx.annotation.NonNull java.lang.String r3) {
            r1 = this;
            r0 = 5
            boolean r0 = r1.canLog(r0)
            if (r0 == 0) goto Le
            java.lang.String r3 = r1.zza(r3)
            android.util.Log.w(r2, r3)
        Le:
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public void w(@androidx.annotation.NonNull java.lang.String r2, @androidx.annotation.NonNull java.lang.String r3, @androidx.annotation.NonNull java.lang.Throwable r4) {
            r1 = this;
            r0 = 5
            boolean r0 = r1.canLog(r0)
            if (r0 == 0) goto Le
            java.lang.String r3 = r1.zza(r3)
            android.util.Log.w(r2, r3, r4)
        Le:
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public void wfmt(@androidx.annotation.NonNull java.lang.String r1, @androidx.annotation.NonNull java.lang.String r2, @androidx.annotation.NonNull java.lang.Object... r3) {
            r0 = this;
            r1 = 5
            boolean r1 = r0.canLog(r1)
            if (r1 == 0) goto L10
            java.lang.String r1 = r0.zza
            java.lang.String r2 = r0.zzb(r2, r3)
            android.util.Log.w(r1, r2)
        L10:
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public void wtf(@androidx.annotation.NonNull java.lang.String r2, @androidx.annotation.NonNull java.lang.String r3, @androidx.annotation.NonNull java.lang.Throwable r4) {
            r1 = this;
            r0 = 7
            boolean r0 = r1.canLog(r0)
            if (r0 == 0) goto L15
            java.lang.String r0 = r1.zza(r3)
            android.util.Log.e(r2, r0, r4)
            java.lang.String r3 = r1.zza(r3)
            android.util.Log.wtf(r2, r3, r4)
        L15:
            return
    }
}
