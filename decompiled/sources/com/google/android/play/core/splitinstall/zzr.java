package com.google.android.play.core.splitinstall;

/* JADX INFO: compiled from: com.google.android.play:core@@1.10.3 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzr {
    private static final java.util.concurrent.atomic.AtomicReference zza = null;

    static {
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r1 = 0
            r0.<init>(r1)
            com.google.android.play.core.splitinstall.zzr.zza = r0
            return
    }

    @androidx.annotation.Nullable
    public static com.google.android.play.core.splitinstall.zzq zza() {
            java.util.concurrent.atomic.AtomicReference r0 = com.google.android.play.core.splitinstall.zzr.zza
            java.lang.Object r0 = r0.get()
            com.google.android.play.core.splitinstall.zzq r0 = (com.google.android.play.core.splitinstall.zzq) r0
            return r0
    }

    public static void zzb(com.google.android.play.core.splitinstall.zzq r2) {
            java.util.concurrent.atomic.AtomicReference r0 = com.google.android.play.core.splitinstall.zzr.zza
            r1 = 0
            r0.compareAndSet(r1, r2)
            return
    }
}
