package com.google.android.gms.common;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
class zzw {
    private static final com.google.android.gms.common.zzw zzd = null;
    public final boolean zza;

    @javax.annotation.Nullable
    public final java.lang.String zzb;

    @javax.annotation.Nullable
    public final java.lang.Throwable zzc;

    static {
            com.google.android.gms.common.zzw r0 = new com.google.android.gms.common.zzw
            r1 = 1
            r2 = 0
            r0.<init>(r1, r2, r2)
            com.google.android.gms.common.zzw.zzd = r0
            return
    }

    public zzw(boolean r1, @javax.annotation.Nullable java.lang.String r2, @javax.annotation.Nullable java.lang.Throwable r3) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r3
            return
    }

    public static com.google.android.gms.common.zzw zzb() {
            com.google.android.gms.common.zzw r0 = com.google.android.gms.common.zzw.zzd
            return r0
    }

    public static com.google.android.gms.common.zzw zzc(@androidx.annotation.NonNull java.lang.String r3) {
            com.google.android.gms.common.zzw r0 = new com.google.android.gms.common.zzw
            r1 = 0
            r2 = 0
            r0.<init>(r1, r3, r2)
            return r0
    }

    public static com.google.android.gms.common.zzw zzd(@androidx.annotation.NonNull java.lang.String r2, @androidx.annotation.NonNull java.lang.Throwable r3) {
            com.google.android.gms.common.zzw r0 = new com.google.android.gms.common.zzw
            r1 = 0
            r0.<init>(r1, r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public java.lang.String zza() {
            r1 = this;
            java.lang.String r0 = r1.zzb
            return r0
    }

    public final void zze() {
            r3 = this;
            boolean r0 = r3.zza
            if (r0 != 0) goto L22
            r0 = 3
            java.lang.String r1 = "GoogleCertificatesRslt"
            boolean r0 = android.util.Log.isLoggable(r1, r0)
            if (r0 == 0) goto L22
            java.lang.Throwable r0 = r3.zzc
            if (r0 == 0) goto L1b
            java.lang.String r0 = r3.zza()
            java.lang.Throwable r2 = r3.zzc
            android.util.Log.d(r1, r0, r2)
            return
        L1b:
            java.lang.String r0 = r3.zza()
            android.util.Log.d(r1, r0)
        L22:
            return
    }
}
