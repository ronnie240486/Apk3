package com.google.android.play.core.internal;

/* JADX INFO: compiled from: com.google.android.play:core@@1.10.3 */
/* JADX INFO: loaded from: classes.dex */
public final class zzcn extends com.google.android.play.core.internal.zzcm {
    private final com.google.android.play.core.internal.zzcm zza;
    private final long zzb;
    private final long zzc;

    public zzcn(com.google.android.play.core.internal.zzcm r1, long r2, long r4) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            long r1 = r0.zzd(r2)
            r0.zzb = r1
            long r1 = r1 + r4
            long r1 = r0.zzd(r1)
            r0.zzc = r1
            return
    }

    private final long zzd(long r4) {
            r3 = this;
            r0 = 0
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 >= 0) goto L7
            return r0
        L7:
            com.google.android.play.core.internal.zzcm r0 = r3.zza
            long r0 = r0.zza()
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 <= 0) goto L17
            com.google.android.play.core.internal.zzcm r4 = r3.zza
            long r4 = r4.zza()
        L17:
            return r4
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws java.io.IOException {
            r0 = this;
            return
    }

    @Override // com.google.android.play.core.internal.zzcm
    public final long zza() {
            r4 = this;
            long r0 = r4.zzc
            long r2 = r4.zzb
            long r0 = r0 - r2
            return r0
    }

    @Override // com.google.android.play.core.internal.zzcm
    public final java.io.InputStream zzb(long r2, long r4) throws java.io.IOException {
            r1 = this;
            long r2 = r1.zzb
            long r2 = r1.zzd(r2)
            long r4 = r4 + r2
            long r4 = r1.zzd(r4)
            com.google.android.play.core.internal.zzcm r0 = r1.zza
            long r4 = r4 - r2
            java.io.InputStream r2 = r0.zzb(r2, r4)
            return r2
    }
}
