package com.google.android.play.core.assetpacks;

/* JADX INFO: compiled from: com.google.android.play:core@@1.10.3 */
/* JADX INFO: loaded from: classes.dex */
final class zzbq extends com.google.android.play.core.assetpacks.zzet {
    private final java.lang.String zza;
    private final long zzb;
    private final int zzc;
    private final boolean zzd;
    private final boolean zze;
    private final byte[] zzf;

    public zzbq(@androidx.annotation.Nullable java.lang.String r1, long r2, int r4, boolean r5, boolean r6, @androidx.annotation.Nullable byte[] r7) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r4
            r0.zzd = r5
            r0.zze = r6
            r0.zzf = r7
            return
    }

    public final boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r8 != r7) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof com.google.android.play.core.assetpacks.zzet
            r2 = 0
            if (r1 == 0) goto L58
            com.google.android.play.core.assetpacks.zzet r8 = (com.google.android.play.core.assetpacks.zzet) r8
            java.lang.String r1 = r7.zza
            if (r1 != 0) goto L16
            java.lang.String r1 = r8.zzc()
            if (r1 != 0) goto L58
            goto L20
        L16:
            java.lang.String r3 = r8.zzc()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L58
        L20:
            long r3 = r7.zzb
            long r5 = r8.zzb()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L58
            int r1 = r7.zzc
            int r3 = r8.zza()
            if (r1 != r3) goto L58
            boolean r1 = r7.zzd
            boolean r3 = r8.zze()
            if (r1 != r3) goto L58
            boolean r1 = r7.zze
            boolean r3 = r8.zzd()
            if (r1 != r3) goto L58
            byte[] r1 = r7.zzf
            boolean r3 = r8 instanceof com.google.android.play.core.assetpacks.zzbq
            if (r3 == 0) goto L4d
            com.google.android.play.core.assetpacks.zzbq r8 = (com.google.android.play.core.assetpacks.zzbq) r8
            byte[] r8 = r8.zzf
            goto L51
        L4d:
            byte[] r8 = r8.zzf()
        L51:
            boolean r8 = java.util.Arrays.equals(r1, r8)
            if (r8 == 0) goto L58
            return r0
        L58:
            return r2
    }

    public final int hashCode() {
            r6 = this;
            java.lang.String r0 = r6.zza
            if (r0 != 0) goto L6
            r0 = 0
            goto La
        L6:
            int r0 = r0.hashCode()
        La:
            long r1 = r6.zzb
            r3 = 1000003(0xf4243, float:1.401303E-39)
            r0 = r0 ^ r3
            int r0 = r0 * r3
            r4 = 32
            long r4 = r1 >>> r4
            long r1 = r1 ^ r4
            int r2 = (int) r1
            r0 = r0 ^ r2
            int r0 = r0 * r3
            int r1 = r6.zzc
            r0 = r0 ^ r1
            int r0 = r0 * r3
            boolean r1 = r6.zzd
            r2 = 1237(0x4d5, float:1.733E-42)
            r4 = 1231(0x4cf, float:1.725E-42)
            r5 = 1
            if (r5 == r1) goto L2c
            r1 = 1237(0x4d5, float:1.733E-42)
            goto L2e
        L2c:
            r1 = 1231(0x4cf, float:1.725E-42)
        L2e:
            r0 = r0 ^ r1
            int r0 = r0 * r3
            boolean r1 = r6.zze
            if (r5 == r1) goto L36
            goto L38
        L36:
            r2 = 1231(0x4cf, float:1.725E-42)
        L38:
            r0 = r0 ^ r2
            int r0 = r0 * r3
            byte[] r1 = r6.zzf
            int r1 = java.util.Arrays.hashCode(r1)
            r0 = r0 ^ r1
            return r0
    }

    public final java.lang.String toString() {
            r10 = this;
            java.lang.String r0 = r10.zza
            long r1 = r10.zzb
            int r3 = r10.zzc
            boolean r4 = r10.zzd
            boolean r5 = r10.zze
            byte[] r6 = r10.zzf
            java.lang.String r6 = java.util.Arrays.toString(r6)
            java.lang.String r7 = java.lang.String.valueOf(r0)
            int r7 = r7.length()
            java.lang.String r8 = java.lang.String.valueOf(r6)
            int r8 = r8.length()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            int r7 = r7 + 126
            int r7 = r7 + r8
            r9.<init>(r7)
            java.lang.String r7 = "ZipEntry{name="
            r9.append(r7)
            r9.append(r0)
            java.lang.String r0 = ", size="
            r9.append(r0)
            r9.append(r1)
            java.lang.String r0 = ", compressionMethod="
            r9.append(r0)
            r9.append(r3)
            java.lang.String r0 = ", isPartial="
            r9.append(r0)
            r9.append(r4)
            java.lang.String r0 = ", isEndOfArchive="
            r9.append(r0)
            r9.append(r5)
            java.lang.String r0 = ", headerBytes="
            java.lang.String r1 = "}"
            java.lang.String r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r9, r0, r6, r1)
            return r0
    }

    @Override // com.google.android.play.core.assetpacks.zzet
    public final int zza() {
            r1 = this;
            int r0 = r1.zzc
            return r0
    }

    @Override // com.google.android.play.core.assetpacks.zzet
    public final long zzb() {
            r2 = this;
            long r0 = r2.zzb
            return r0
    }

    @Override // com.google.android.play.core.assetpacks.zzet
    @androidx.annotation.Nullable
    public final java.lang.String zzc() {
            r1 = this;
            java.lang.String r0 = r1.zza
            return r0
    }

    @Override // com.google.android.play.core.assetpacks.zzet
    public final boolean zzd() {
            r1 = this;
            boolean r0 = r1.zze
            return r0
    }

    @Override // com.google.android.play.core.assetpacks.zzet
    public final boolean zze() {
            r1 = this;
            boolean r0 = r1.zzd
            return r0
    }

    @Override // com.google.android.play.core.assetpacks.zzet
    @androidx.annotation.Nullable
    public final byte[] zzf() {
            r1 = this;
            byte[] r0 = r1.zzf
            return r0
    }
}
