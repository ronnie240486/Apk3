package com.google.android.play.core.assetpacks;

/* JADX INFO: compiled from: com.google.android.play:core@@1.10.3 */
/* JADX INFO: loaded from: classes.dex */
final class zzcn extends java.io.OutputStream {
    private final com.google.android.play.core.assetpacks.zzds zza;
    private final java.io.File zzb;
    private final com.google.android.play.core.assetpacks.zzen zzc;
    private long zzd;
    private long zze;
    private java.io.FileOutputStream zzf;
    private com.google.android.play.core.assetpacks.zzet zzg;

    public zzcn(java.io.File r2, com.google.android.play.core.assetpacks.zzen r3) {
            r1 = this;
            r1.<init>()
            com.google.android.play.core.assetpacks.zzds r0 = new com.google.android.play.core.assetpacks.zzds
            r0.<init>()
            r1.zza = r0
            r1.zzb = r2
            r1.zzc = r3
            return
    }

    @Override // java.io.OutputStream
    public final void write(int r4) throws java.io.IOException {
            r3 = this;
            r0 = 1
            byte[] r1 = new byte[r0]
            byte r4 = (byte) r4
            r2 = 0
            r1[r2] = r4
            r3.write(r1, r2, r0)
            return
    }

    @Override // java.io.OutputStream
    public final void write(byte[] r3) throws java.io.IOException {
            r2 = this;
            int r0 = r3.length
            r1 = 0
            r2.write(r3, r1, r0)
            return
    }

    @Override // java.io.OutputStream
    public final void write(byte[] r11, int r12, int r13) throws java.io.IOException {
            r10 = this;
        L0:
            if (r13 <= 0) goto L115
            long r0 = r10.zzd
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L9d
            long r0 = r10.zze
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L9d
            com.google.android.play.core.assetpacks.zzds r0 = r10.zza
            int r0 = r0.zzb(r11, r12, r13)
            r1 = -1
            if (r0 != r1) goto L1a
            return
        L1a:
            int r12 = r12 + r0
            int r13 = r13 - r0
            com.google.android.play.core.assetpacks.zzds r0 = r10.zza
            com.google.android.play.core.assetpacks.zzet r0 = r0.zzc()
            r10.zzg = r0
            boolean r0 = r0.zzd()
            if (r0 == 0) goto L49
            r10.zzd = r2
            com.google.android.play.core.assetpacks.zzen r0 = r10.zzc
            com.google.android.play.core.assetpacks.zzet r1 = r10.zzg
            byte[] r1 = r1.zzf()
            com.google.android.play.core.assetpacks.zzet r4 = r10.zzg
            byte[] r4 = r4.zzf()
            int r4 = r4.length
            r0.zzl(r1, r4)
            com.google.android.play.core.assetpacks.zzet r0 = r10.zzg
            byte[] r0 = r0.zzf()
            int r0 = r0.length
            long r0 = (long) r0
            r10.zze = r0
            goto L9d
        L49:
            com.google.android.play.core.assetpacks.zzet r0 = r10.zzg
            boolean r0 = r0.zzh()
            if (r0 == 0) goto L89
            com.google.android.play.core.assetpacks.zzet r0 = r10.zzg
            boolean r0 = r0.zzg()
            if (r0 == 0) goto L5a
            goto L89
        L5a:
            com.google.android.play.core.assetpacks.zzen r0 = r10.zzc
            com.google.android.play.core.assetpacks.zzet r1 = r10.zzg
            byte[] r1 = r1.zzf()
            r0.zzj(r1)
            java.io.File r0 = new java.io.File
            java.io.File r1 = r10.zzb
            com.google.android.play.core.assetpacks.zzet r4 = r10.zzg
            java.lang.String r4 = r4.zzc()
            r0.<init>(r1, r4)
            java.io.File r1 = r0.getParentFile()
            r1.mkdirs()
            com.google.android.play.core.assetpacks.zzet r1 = r10.zzg
            long r4 = r1.zzb()
            r10.zzd = r4
            java.io.FileOutputStream r1 = new java.io.FileOutputStream
            r1.<init>(r0)
            r10.zzf = r1
            goto L9d
        L89:
            com.google.android.play.core.assetpacks.zzet r0 = r10.zzg
            byte[] r0 = r0.zzf()
            com.google.android.play.core.assetpacks.zzen r1 = r10.zzc
            int r4 = r0.length
            r1.zzl(r0, r4)
            com.google.android.play.core.assetpacks.zzet r0 = r10.zzg
            long r0 = r0.zzb()
            r10.zzd = r0
        L9d:
            com.google.android.play.core.assetpacks.zzet r0 = r10.zzg
            boolean r0 = r0.zzg()
            if (r0 == 0) goto La7
            goto L0
        La7:
            com.google.android.play.core.assetpacks.zzet r0 = r10.zzg
            boolean r0 = r0.zzd()
            if (r0 == 0) goto Lc1
            com.google.android.play.core.assetpacks.zzen r4 = r10.zzc
            long r5 = r10.zze
            r7 = r11
            r8 = r12
            r9 = r13
            r4.zze(r5, r7, r8, r9)
            long r0 = r10.zze
            long r2 = (long) r13
            long r0 = r0 + r2
            r10.zze = r0
            r1 = r13
            goto L111
        Lc1:
            com.google.android.play.core.assetpacks.zzet r0 = r10.zzg
            boolean r0 = r0.zzh()
            if (r0 == 0) goto Le6
            long r0 = (long) r13
            long r4 = r10.zzd
            long r0 = java.lang.Math.min(r0, r4)
            int r1 = (int) r0
            java.io.FileOutputStream r0 = r10.zzf
            r0.write(r11, r12, r1)
            long r4 = r10.zzd
            long r6 = (long) r1
            long r4 = r4 - r6
            r10.zzd = r4
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 != 0) goto L111
            java.io.FileOutputStream r0 = r10.zzf
            r0.close()
            goto L111
        Le6:
            long r0 = (long) r13
            long r2 = r10.zzd
            long r0 = java.lang.Math.min(r0, r2)
            int r1 = (int) r0
            com.google.android.play.core.assetpacks.zzet r0 = r10.zzg
            byte[] r0 = r0.zzf()
            int r0 = r0.length
            com.google.android.play.core.assetpacks.zzet r2 = r10.zzg
            long r2 = r2.zzb()
            long r4 = r10.zzd
            com.google.android.play.core.assetpacks.zzen r6 = r10.zzc
            long r7 = (long) r0
            long r7 = r7 + r2
            long r2 = r7 - r4
            r4 = r6
            r5 = r2
            r7 = r11
            r8 = r12
            r9 = r1
            r4.zze(r5, r7, r8, r9)
            long r2 = r10.zzd
            long r4 = (long) r1
            long r2 = r2 - r4
            r10.zzd = r2
        L111:
            int r12 = r12 + r1
            int r13 = r13 - r1
            goto L0
        L115:
            return
    }
}
