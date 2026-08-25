package com.google.android.play.core.assetpacks;

/* JADX INFO: compiled from: com.google.android.play:core@@1.10.3 */
/* JADX INFO: loaded from: classes.dex */
final class zzds {
    private byte[] zza;
    private int zzb;
    private long zzc;
    private long zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private boolean zzh;

    @androidx.annotation.Nullable
    private java.lang.String zzi;

    public zzds() {
            r1 = this;
            r1.<init>()
            r0 = 4096(0x1000, float:5.74E-42)
            byte[] r0 = new byte[r0]
            r1.zza = r0
            r1.zzd()
            return
    }

    private final int zze(int r3, byte[] r4, int r5, int r6) {
            r2 = this;
            int r0 = r2.zzb
            if (r0 >= r3) goto L1b
            int r0 = r3 - r0
            int r6 = java.lang.Math.min(r6, r0)
            byte[] r0 = r2.zza
            int r1 = r2.zzb
            java.lang.System.arraycopy(r4, r5, r0, r1, r6)
            int r4 = r2.zzb
            int r4 = r4 + r6
            r2.zzb = r4
            if (r4 >= r3) goto L1a
            r3 = -1
            return r3
        L1a:
            return r6
        L1b:
            r3 = 0
            return r3
    }

    public final int zza() {
            r1 = this;
            int r0 = r1.zzf
            return r0
    }

    public final int zzb(byte[] r10, int r11, int r12) {
            r9 = this;
            r0 = 30
            int r1 = r9.zze(r0, r10, r11, r12)
            r2 = -1
            if (r1 == r2) goto L84
            long r3 = r9.zzc
            r5 = -1
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L64
            byte[] r3 = r9.zza
            r4 = 0
            long r5 = com.google.android.play.core.assetpacks.zzbr.zzc(r3, r4)
            r9.zzc = r5
            r7 = 67324752(0x4034b50, double:3.3262847E-316)
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 != 0) goto L61
            r9.zzh = r4
            byte[] r3 = r9.zza
            r4 = 18
            long r3 = com.google.android.play.core.assetpacks.zzbr.zzc(r3, r4)
            r9.zzd = r3
            byte[] r3 = r9.zza
            r4 = 8
            int r3 = com.google.android.play.core.assetpacks.zzbr.zza(r3, r4)
            r9.zzg = r3
            byte[] r3 = r9.zza
            r4 = 26
            int r3 = com.google.android.play.core.assetpacks.zzbr.zza(r3, r4)
            r9.zze = r3
            byte[] r3 = r9.zza
            r4 = 28
            int r3 = com.google.android.play.core.assetpacks.zzbr.zza(r3, r4)
            int r4 = r9.zze
            int r4 = r4 + r0
            int r4 = r4 + r3
            r9.zzf = r4
            byte[] r3 = r9.zza
            int r3 = r3.length
            if (r3 >= r4) goto L64
        L54:
            int r3 = r3 + r3
            if (r3 >= r4) goto L58
            goto L54
        L58:
            byte[] r4 = r9.zza
            byte[] r3 = java.util.Arrays.copyOf(r4, r3)
            r9.zza = r3
            goto L64
        L61:
            r3 = 1
            r9.zzh = r3
        L64:
            int r3 = r9.zzf
            int r11 = r11 + r1
            int r12 = r12 - r1
            int r10 = r9.zze(r3, r10, r11, r12)
            if (r10 != r2) goto L6f
            return r2
        L6f:
            int r1 = r1 + r10
            boolean r10 = r9.zzh
            if (r10 != 0) goto L83
            java.lang.String r10 = r9.zzi
            if (r10 != 0) goto L83
            java.lang.String r10 = new java.lang.String
            byte[] r11 = r9.zza
            int r12 = r9.zze
            r10.<init>(r11, r0, r12)
            r9.zzi = r10
        L83:
            return r1
        L84:
            return r2
    }

    public final com.google.android.play.core.assetpacks.zzet zzc() {
            r19 = this;
            r0 = r19
            int r1 = r0.zzb
            int r2 = r0.zzf
            if (r1 >= r2) goto L1e
            java.lang.String r4 = r0.zzi
            long r5 = r0.zzd
            int r7 = r0.zzg
            byte[] r2 = r0.zza
            byte[] r10 = java.util.Arrays.copyOf(r2, r1)
            boolean r9 = r0.zzh
            com.google.android.play.core.assetpacks.zzbq r1 = new com.google.android.play.core.assetpacks.zzbq
            r8 = 1
            r3 = r1
            r3.<init>(r4, r5, r7, r8, r9, r10)
            return r1
        L1e:
            java.lang.String r12 = r0.zzi
            long r13 = r0.zzd
            int r15 = r0.zzg
            byte[] r1 = r0.zza
            byte[] r18 = java.util.Arrays.copyOf(r1, r2)
            boolean r1 = r0.zzh
            com.google.android.play.core.assetpacks.zzbq r2 = new com.google.android.play.core.assetpacks.zzbq
            r16 = 0
            r11 = r2
            r17 = r1
            r11.<init>(r12, r13, r15, r16, r17, r18)
            r19.zzd()
            return r2
    }

    public final void zzd() {
            r4 = this;
            r0 = 0
            r4.zzb = r0
            r1 = -1
            r4.zze = r1
            r2 = -1
            r4.zzc = r2
            r4.zzh = r0
            r0 = 30
            r4.zzf = r0
            r4.zzd = r2
            r4.zzg = r1
            r0 = 0
            r4.zzi = r0
            return
    }
}
