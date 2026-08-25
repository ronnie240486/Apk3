package com.google.android.play.core.assetpacks;

/* JADX INFO: compiled from: com.google.android.play:core@@1.10.3 */
/* JADX INFO: loaded from: classes.dex */
final class zzbp extends com.google.android.play.core.assetpacks.zzem {
    private final int zza;
    private final java.lang.String zzb;
    private final long zzc;
    private final long zzd;
    private final int zze;

    public zzbp(int r1, @androidx.annotation.Nullable java.lang.String r2, long r3, long r5, int r7) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r3
            r0.zzd = r5
            r0.zze = r7
            return
    }

    public final boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r8 != r7) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof com.google.android.play.core.assetpacks.zzem
            r2 = 0
            if (r1 == 0) goto L46
            com.google.android.play.core.assetpacks.zzem r8 = (com.google.android.play.core.assetpacks.zzem) r8
            int r1 = r7.zza
            int r3 = r8.zza()
            if (r1 != r3) goto L46
            java.lang.String r1 = r7.zzb
            if (r1 != 0) goto L1e
            java.lang.String r1 = r8.zze()
            if (r1 != 0) goto L46
            goto L29
        L1e:
            java.lang.String r3 = r8.zze()
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L29
            goto L46
        L29:
            long r3 = r7.zzc
            long r5 = r8.zzc()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L46
            long r3 = r7.zzd
            long r5 = r8.zzd()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L46
            int r1 = r7.zze
            int r8 = r8.zzb()
            if (r1 != r8) goto L46
            return r0
        L46:
            return r2
    }

    public final int hashCode() {
            r9 = this;
            int r0 = r9.zza
            r1 = 1000003(0xf4243, float:1.401303E-39)
            r0 = r0 ^ r1
            int r0 = r0 * r1
            java.lang.String r2 = r9.zzb
            if (r2 != 0) goto Le
            r2 = 0
            goto L12
        Le:
            int r2 = r2.hashCode()
        L12:
            long r3 = r9.zzc
            long r5 = r9.zzd
            r0 = r0 ^ r2
            int r0 = r0 * r1
            r2 = 32
            long r7 = r3 >>> r2
            long r3 = r3 ^ r7
            int r4 = (int) r3
            r0 = r0 ^ r4
            int r0 = r0 * r1
            long r2 = r5 >>> r2
            long r2 = r2 ^ r5
            int r3 = (int) r2
            r0 = r0 ^ r3
            int r0 = r0 * r1
            int r1 = r9.zze
            r0 = r0 ^ r1
            return r0
    }

    public final java.lang.String toString() {
            r9 = this;
            int r0 = r9.zza
            java.lang.String r1 = r9.zzb
            long r2 = r9.zzc
            long r4 = r9.zzd
            int r6 = r9.zze
            java.lang.String r7 = java.lang.String.valueOf(r1)
            int r7 = r7.length()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            int r7 = r7 + 157
            r8.<init>(r7)
            java.lang.String r7 = "SliceCheckpoint{fileExtractionStatus="
            r8.append(r7)
            r8.append(r0)
            java.lang.String r0 = ", filePath="
            r8.append(r0)
            r8.append(r1)
            java.lang.String r0 = ", fileOffset="
            r8.append(r0)
            r8.append(r2)
            java.lang.String r0 = ", remainingBytes="
            r8.append(r0)
            r8.append(r4)
            java.lang.String r0 = ", previousChunk="
            r8.append(r0)
            r8.append(r6)
            java.lang.String r0 = "}"
            r8.append(r0)
            java.lang.String r0 = r8.toString()
            return r0
    }

    @Override // com.google.android.play.core.assetpacks.zzem
    public final int zza() {
            r1 = this;
            int r0 = r1.zza
            return r0
    }

    @Override // com.google.android.play.core.assetpacks.zzem
    public final int zzb() {
            r1 = this;
            int r0 = r1.zze
            return r0
    }

    @Override // com.google.android.play.core.assetpacks.zzem
    public final long zzc() {
            r2 = this;
            long r0 = r2.zzc
            return r0
    }

    @Override // com.google.android.play.core.assetpacks.zzem
    public final long zzd() {
            r2 = this;
            long r0 = r2.zzd
            return r0
    }

    @Override // com.google.android.play.core.assetpacks.zzem
    @androidx.annotation.Nullable
    public final java.lang.String zze() {
            r1 = this;
            java.lang.String r0 = r1.zzb
            return r0
    }
}
