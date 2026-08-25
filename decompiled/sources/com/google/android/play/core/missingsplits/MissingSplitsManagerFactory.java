package com.google.android.play.core.missingsplits;

/* JADX INFO: compiled from: com.google.android.play:core@@1.10.3 */
/* JADX INFO: loaded from: classes2.dex */
@java.lang.Deprecated
public final class MissingSplitsManagerFactory {
    private static final java.util.concurrent.atomic.AtomicReference zza = null;

    static {
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r1 = 0
            r0.<init>(r1)
            com.google.android.play.core.missingsplits.MissingSplitsManagerFactory.zza = r0
            return
    }

    private MissingSplitsManagerFactory() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.NonNull
    @java.lang.Deprecated
    public static com.google.android.play.core.missingsplits.MissingSplitsManager create(@androidx.annotation.NonNull android.content.Context r4) {
            com.google.android.play.core.missingsplits.zzb r0 = new com.google.android.play.core.missingsplits.zzb
            java.lang.Runtime r1 = java.lang.Runtime.getRuntime()
            com.google.android.play.core.missingsplits.zza r2 = new com.google.android.play.core.missingsplits.zza
            android.content.pm.PackageManager r3 = r4.getPackageManager()
            r2.<init>(r4, r3)
            java.util.concurrent.atomic.AtomicReference r3 = com.google.android.play.core.missingsplits.MissingSplitsManagerFactory.zza
            r0.<init>(r4, r1, r2, r3)
            return r0
    }
}
