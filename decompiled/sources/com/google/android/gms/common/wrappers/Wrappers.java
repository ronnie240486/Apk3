package com.google.android.gms.common.wrappers;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
@com.google.android.gms.common.annotation.KeepForSdk
public class Wrappers {
    private static com.google.android.gms.common.wrappers.Wrappers zza;

    @androidx.annotation.Nullable
    private com.google.android.gms.common.wrappers.PackageManagerWrapper zzb;

    static {
            com.google.android.gms.common.wrappers.Wrappers r0 = new com.google.android.gms.common.wrappers.Wrappers
            r0.<init>()
            com.google.android.gms.common.wrappers.Wrappers.zza = r0
            return
    }

    public Wrappers() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.zzb = r0
            return
    }

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public static com.google.android.gms.common.wrappers.PackageManagerWrapper packageManager(@androidx.annotation.NonNull android.content.Context r1) {
            com.google.android.gms.common.wrappers.Wrappers r0 = com.google.android.gms.common.wrappers.Wrappers.zza
            com.google.android.gms.common.wrappers.PackageManagerWrapper r1 = r0.zza(r1)
            return r1
    }

    @androidx.annotation.NonNull
    @com.google.android.gms.common.util.VisibleForTesting
    public final synchronized com.google.android.gms.common.wrappers.PackageManagerWrapper zza(@androidx.annotation.NonNull android.content.Context r2) {
            r1 = this;
            monitor-enter(r1)
            com.google.android.gms.common.wrappers.PackageManagerWrapper r0 = r1.zzb     // Catch: java.lang.Throwable -> L1a
            if (r0 != 0) goto L16
            android.content.Context r0 = r2.getApplicationContext()     // Catch: java.lang.Throwable -> L1a
            if (r0 == 0) goto Lf
            android.content.Context r2 = r2.getApplicationContext()     // Catch: java.lang.Throwable -> L1a
        Lf:
            com.google.android.gms.common.wrappers.PackageManagerWrapper r0 = new com.google.android.gms.common.wrappers.PackageManagerWrapper     // Catch: java.lang.Throwable -> L1a
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L1a
            r1.zzb = r0     // Catch: java.lang.Throwable -> L1a
        L16:
            com.google.android.gms.common.wrappers.PackageManagerWrapper r2 = r1.zzb     // Catch: java.lang.Throwable -> L1a
            monitor-exit(r1)
            return r2
        L1a:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }
}
