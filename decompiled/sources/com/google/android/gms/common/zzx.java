package com.google.android.gms.common;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzx {

    @androidx.annotation.Nullable
    private java.lang.String zza;
    private long zzb;
    private com.google.android.gms.internal.common.zzag<byte[]> zzc;
    private com.google.android.gms.internal.common.zzag<byte[]> zzd;

    public zzx() {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.zza = r0
            r0 = -1
            r2.zzb = r0
            com.google.android.gms.internal.common.zzag r0 = com.google.android.gms.internal.common.zzag.zzl()
            r2.zzc = r0
            com.google.android.gms.internal.common.zzag r0 = com.google.android.gms.internal.common.zzag.zzl()
            r2.zzd = r0
            return
    }

    public final com.google.android.gms.common.zzx zza(long r1) {
            r0 = this;
            r0.zzb = r1
            return r0
    }

    public final com.google.android.gms.common.zzx zzb(java.util.List<byte[]> r1) {
            r0 = this;
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r1)
            com.google.android.gms.internal.common.zzag r1 = com.google.android.gms.internal.common.zzag.zzk(r1)
            r0.zzd = r1
            return r0
    }

    public final com.google.android.gms.common.zzx zzc(java.util.List<byte[]> r1) {
            r0 = this;
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r1)
            com.google.android.gms.internal.common.zzag r1 = com.google.android.gms.internal.common.zzag.zzk(r1)
            r0.zzc = r1
            return r0
    }

    public final com.google.android.gms.common.zzx zzd(java.lang.String r1) {
            r0 = this;
            r0.zza = r1
            return r0
    }

    public final com.google.android.gms.common.zzz zze() {
            r5 = this;
            java.lang.String r0 = r5.zza
            if (r0 == 0) goto L39
            long r0 = r5.zzb
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 < 0) goto L31
            com.google.android.gms.internal.common.zzag<byte[]> r0 = r5.zzc
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L25
            com.google.android.gms.internal.common.zzag<byte[]> r0 = r5.zzd
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L1d
            goto L25
        L1d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Either orderedTestCerts or orderedProdCerts must have at least one cert"
            r0.<init>(r1)
            throw r0
        L25:
            com.google.android.gms.common.zzz r0 = new com.google.android.gms.common.zzz
            java.lang.String r1 = r5.zza
            com.google.android.gms.internal.common.zzag<byte[]> r2 = r5.zzc
            com.google.android.gms.internal.common.zzag<byte[]> r3 = r5.zzd
            r0.<init>(r1, r2, r3)
            return r0
        L31:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "minimumStampedVersionNumber must be greater than or equal to 0"
            r0.<init>(r1)
            throw r0
        L39:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "packageName must be defined"
            r0.<init>(r1)
            throw r0
    }
}
