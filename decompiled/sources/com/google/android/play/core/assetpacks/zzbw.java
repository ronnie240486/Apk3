package com.google.android.play.core.assetpacks;

/* JADX INFO: compiled from: com.google.android.play:core@@1.10.3 */
/* JADX INFO: loaded from: classes.dex */
final class zzbw extends java.io.FilterInputStream {
    private final com.google.android.play.core.assetpacks.zzds zza;
    private byte[] zzb;
    private long zzc;
    private boolean zzd;
    private boolean zze;

    public zzbw(java.io.InputStream r1) {
            r0 = this;
            r0.<init>(r1)
            com.google.android.play.core.assetpacks.zzds r1 = new com.google.android.play.core.assetpacks.zzds
            r1.<init>()
            r0.zza = r1
            r1 = 4096(0x1000, float:5.74E-42)
            byte[] r1 = new byte[r1]
            r0.zzb = r1
            r1 = 0
            r0.zzd = r1
            r0.zze = r1
            return
    }

    private final int zze(byte[] r1, int r2, int r3) throws java.io.IOException {
            r0 = this;
            int r1 = super.read(r1, r2, r3)
            r2 = 0
            int r1 = java.lang.Math.max(r2, r1)
            return r1
    }

    private final boolean zzf(int r5) throws java.io.IOException {
            r4 = this;
            byte[] r0 = r4.zzb
            r1 = 0
            int r0 = r4.zze(r0, r1, r5)
            if (r0 == r5) goto L1c
            int r2 = r5 - r0
            byte[] r3 = r4.zzb
            int r3 = r4.zze(r3, r0, r2)
            if (r3 != r2) goto L14
            goto L1c
        L14:
            com.google.android.play.core.assetpacks.zzds r5 = r4.zza
            byte[] r2 = r4.zzb
            r5.zzb(r2, r1, r0)
            return r1
        L1c:
            com.google.android.play.core.assetpacks.zzds r0 = r4.zza
            byte[] r2 = r4.zzb
            r0.zzb(r2, r1, r5)
            r5 = 1
            return r5
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] r3) throws java.io.IOException {
            r2 = this;
            int r0 = r3.length
            r1 = 0
            int r3 = r2.read(r3, r1, r0)
            return r3
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] r6, int r7, int r8) throws java.io.IOException {
            r5 = this;
            long r0 = r5.zzc
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L24
            boolean r2 = r5.zzd
            if (r2 == 0) goto Ld
            goto L24
        Ld:
            long r2 = (long) r8
            long r0 = java.lang.Math.min(r0, r2)
            int r8 = (int) r0
            int r6 = r5.zze(r6, r7, r8)
            long r7 = r5.zzc
            long r0 = (long) r6
            long r7 = r7 - r0
            r5.zzc = r7
            if (r6 != 0) goto L23
            r6 = 1
            r5.zzd = r6
            r6 = 0
        L23:
            return r6
        L24:
            r6 = -1
            return r6
    }

    public final long zza() {
            r2 = this;
            long r0 = r2.zzc
            return r0
    }

    public final com.google.android.play.core.assetpacks.zzet zzb() throws java.io.IOException {
            r10 = this;
            long r0 = r10.zzc
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L13
        L8:
            byte[] r0 = r10.zzb
            r1 = 0
            int r2 = r0.length
            int r0 = r10.read(r0, r1, r2)
            r1 = -1
            if (r0 != r1) goto L8
        L13:
            boolean r0 = r10.zzd
            if (r0 != 0) goto L8d
            boolean r0 = r10.zze
            if (r0 == 0) goto L1c
            goto L8d
        L1c:
            r0 = 30
            boolean r0 = r10.zzf(r0)
            r1 = 1
            if (r0 != 0) goto L2e
            r10.zzd = r1
            com.google.android.play.core.assetpacks.zzds r0 = r10.zza
            com.google.android.play.core.assetpacks.zzet r0 = r0.zzc()
            return r0
        L2e:
            com.google.android.play.core.assetpacks.zzds r0 = r10.zza
            com.google.android.play.core.assetpacks.zzet r0 = r0.zzc()
            boolean r2 = r0.zzd()
            if (r2 == 0) goto L3d
            r10.zze = r1
            return r0
        L3d:
            long r2 = r0.zzb()
            r4 = 4294967295(0xffffffff, double:2.1219957905E-314)
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L85
            com.google.android.play.core.assetpacks.zzds r0 = r10.zza
            int r0 = r0.zza()
            int r0 = r0 + (-30)
            long r2 = (long) r0
            byte[] r4 = r10.zzb
            int r4 = r4.length
            long r5 = (long) r4
            int r7 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r7 <= 0) goto L69
        L5b:
            int r4 = r4 + r4
            long r5 = (long) r4
            int r7 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r7 < 0) goto L5b
            byte[] r2 = r10.zzb
            byte[] r2 = java.util.Arrays.copyOf(r2, r4)
            r10.zzb = r2
        L69:
            boolean r0 = r10.zzf(r0)
            if (r0 != 0) goto L78
            r10.zzd = r1
            com.google.android.play.core.assetpacks.zzds r0 = r10.zza
            com.google.android.play.core.assetpacks.zzet r0 = r0.zzc()
            return r0
        L78:
            com.google.android.play.core.assetpacks.zzds r0 = r10.zza
            com.google.android.play.core.assetpacks.zzet r0 = r0.zzc()
            long r1 = r0.zzb()
            r10.zzc = r1
            return r0
        L85:
            com.google.android.play.core.assetpacks.zzck r0 = new com.google.android.play.core.assetpacks.zzck
            java.lang.String r1 = "Files bigger than 4GiB are not supported."
            r0.<init>(r1)
            throw r0
        L8d:
            com.google.android.play.core.assetpacks.zzbq r0 = new com.google.android.play.core.assetpacks.zzbq
            r3 = 0
            r4 = -1
            r6 = -1
            r7 = 0
            r8 = 0
            r9 = 0
            r2 = r0
            r2.<init>(r3, r4, r6, r7, r8, r9)
            return r0
    }

    public final boolean zzc() {
            r1 = this;
            boolean r0 = r1.zze
            return r0
    }

    public final boolean zzd() {
            r1 = this;
            boolean r0 = r1.zzd
            return r0
    }
}
