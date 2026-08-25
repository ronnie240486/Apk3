package com.google.android.gms.common;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
abstract class zzk extends com.google.android.gms.common.zzi {
    private static final java.lang.ref.WeakReference<byte[]> zza = null;
    private java.lang.ref.WeakReference<byte[]> zzb;

    static {
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r1 = 0
            r0.<init>(r1)
            com.google.android.gms.common.zzk.zza = r0
            return
    }

    public zzk(byte[] r1) {
            r0 = this;
            r0.<init>(r1)
            java.lang.ref.WeakReference<byte[]> r1 = com.google.android.gms.common.zzk.zza
            r0.zzb = r1
            return
    }

    public abstract byte[] zzb();

    @Override // com.google.android.gms.common.zzi
    public final byte[] zzf() {
            r2 = this;
            monitor-enter(r2)
            java.lang.ref.WeakReference<byte[]> r0 = r2.zzb     // Catch: java.lang.Throwable -> L18
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> L18
            byte[] r0 = (byte[]) r0     // Catch: java.lang.Throwable -> L18
            if (r0 != 0) goto L16
            byte[] r0 = r2.zzb()     // Catch: java.lang.Throwable -> L18
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference     // Catch: java.lang.Throwable -> L18
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L18
            r2.zzb = r1     // Catch: java.lang.Throwable -> L18
        L16:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L18
            return r0
        L18:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L18
            throw r0
    }
}
