package com.google.android.gms.common.logging;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
@com.google.android.gms.common.annotation.KeepForSdk
public class Logger {
    private final java.lang.String zza;
    private final java.lang.String zzb;
    private final com.google.android.gms.common.internal.GmsLogger zzc;
    private final int zzd;

    @com.google.android.gms.common.annotation.KeepForSdk
    public Logger(@androidx.annotation.NonNull java.lang.String r7, @androidx.annotation.NonNull java.lang.String... r8) {
            r6 = this;
            int r0 = r8.length
            if (r0 != 0) goto L6
            java.lang.String r8 = ""
            goto L30
        L6:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r2 = 91
            r1.append(r2)
            r2 = 0
        L11:
            if (r2 >= r0) goto L27
            r3 = r8[r2]
            int r4 = r1.length()
            r5 = 1
            if (r4 <= r5) goto L21
            java.lang.String r4 = ","
            r1.append(r4)
        L21:
            r1.append(r3)
            int r2 = r2 + 1
            goto L11
        L27:
            java.lang.String r8 = "] "
            r1.append(r8)
            java.lang.String r8 = r1.toString()
        L30:
            r6.<init>()
            r6.zzb = r8
            r6.zza = r7
            com.google.android.gms.common.internal.GmsLogger r8 = new com.google.android.gms.common.internal.GmsLogger
            r8.<init>(r7)
            r6.zzc = r8
            r7 = 2
        L3f:
            r8 = 7
            if (r7 > r8) goto L4d
            java.lang.String r8 = r6.zza
            boolean r8 = android.util.Log.isLoggable(r8, r7)
            if (r8 != 0) goto L4d
            int r7 = r7 + 1
            goto L3f
        L4d:
            r6.zzd = r7
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public void d(@androidx.annotation.NonNull java.lang.String r2, @androidx.annotation.Nullable java.lang.Object... r3) {
            r1 = this;
            r0 = 3
            boolean r0 = r1.isLoggable(r0)
            if (r0 == 0) goto L10
            java.lang.String r0 = r1.zza
            java.lang.String r2 = r1.format(r2, r3)
            android.util.Log.d(r0, r2)
        L10:
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public void e(@androidx.annotation.NonNull java.lang.String r2, @androidx.annotation.NonNull java.lang.Throwable r3, @androidx.annotation.Nullable java.lang.Object... r4) {
            r1 = this;
            java.lang.String r0 = r1.zza
            java.lang.String r2 = r1.format(r2, r4)
            android.util.Log.e(r0, r2, r3)
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public void e(@androidx.annotation.NonNull java.lang.String r2, @androidx.annotation.Nullable java.lang.Object... r3) {
            r1 = this;
            java.lang.String r0 = r1.zza
            java.lang.String r2 = r1.format(r2, r3)
            android.util.Log.e(r0, r2)
            return
    }

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public final java.lang.String format(@androidx.annotation.NonNull java.lang.String r2, @androidx.annotation.Nullable java.lang.Object... r3) {
            r1 = this;
            if (r3 == 0) goto Lb
            int r0 = r3.length
            if (r0 <= 0) goto Lb
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r2 = java.lang.String.format(r0, r2, r3)
        Lb:
            java.lang.String r3 = r1.zzb
            java.lang.String r2 = r3.concat(r2)
            return r2
    }

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public java.lang.String getTag() {
            r1 = this;
            java.lang.String r0 = r1.zza
            return r0
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public void i(@androidx.annotation.NonNull java.lang.String r2, @androidx.annotation.Nullable java.lang.Object... r3) {
            r1 = this;
            java.lang.String r0 = r1.zza
            java.lang.String r2 = r1.format(r2, r3)
            android.util.Log.i(r0, r2)
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public boolean isLoggable(int r2) {
            r1 = this;
            int r0 = r1.zzd
            if (r0 > r2) goto L6
            r2 = 1
            return r2
        L6:
            r2 = 0
            return r2
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public void v(@androidx.annotation.NonNull java.lang.String r2, @androidx.annotation.NonNull java.lang.Throwable r3, @androidx.annotation.Nullable java.lang.Object... r4) {
            r1 = this;
            r0 = 2
            boolean r0 = r1.isLoggable(r0)
            if (r0 == 0) goto L10
            java.lang.String r0 = r1.zza
            java.lang.String r2 = r1.format(r2, r4)
            android.util.Log.v(r0, r2, r3)
        L10:
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public void v(@androidx.annotation.NonNull java.lang.String r2, @androidx.annotation.Nullable java.lang.Object... r3) {
            r1 = this;
            r0 = 2
            boolean r0 = r1.isLoggable(r0)
            if (r0 == 0) goto L10
            java.lang.String r0 = r1.zza
            java.lang.String r2 = r1.format(r2, r3)
            android.util.Log.v(r0, r2)
        L10:
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public void w(@androidx.annotation.NonNull java.lang.String r2, @androidx.annotation.Nullable java.lang.Object... r3) {
            r1 = this;
            java.lang.String r0 = r1.zza
            java.lang.String r2 = r1.format(r2, r3)
            android.util.Log.w(r0, r2)
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public void wtf(@androidx.annotation.NonNull java.lang.String r2, @androidx.annotation.NonNull java.lang.Throwable r3, @androidx.annotation.Nullable java.lang.Object... r4) {
            r1 = this;
            java.lang.String r0 = r1.zza
            java.lang.String r2 = r1.format(r2, r4)
            android.util.Log.wtf(r0, r2, r3)
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public void wtf(@androidx.annotation.NonNull java.lang.Throwable r2) {
            r1 = this;
            java.lang.String r0 = r1.zza
            android.util.Log.wtf(r0, r2)
            return
    }
}
