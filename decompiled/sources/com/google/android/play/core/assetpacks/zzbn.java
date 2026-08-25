package com.google.android.play.core.assetpacks;

/* JADX INFO: compiled from: com.google.android.play:core@@1.10.3 */
/* JADX INFO: loaded from: classes.dex */
final class zzbn extends com.google.android.play.core.assetpacks.AssetPackState {
    private final java.lang.String zza;
    private final int zzb;
    private final int zzc;
    private final long zzd;
    private final long zze;
    private final int zzf;
    private final int zzg;
    private final java.lang.String zzh;
    private final java.lang.String zzi;

    public zzbn(java.lang.String r2, int r3, int r4, long r5, long r7, int r9, int r10, java.lang.String r11, java.lang.String r12) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "Null name"
            java.util.Objects.requireNonNull(r2, r0)
            r1.zza = r2
            r1.zzb = r3
            r1.zzc = r4
            r1.zzd = r5
            r1.zze = r7
            r1.zzf = r9
            r1.zzg = r10
            java.lang.String r2 = "Null availableVersionTag"
            java.util.Objects.requireNonNull(r11, r2)
            r1.zzh = r11
            java.lang.String r2 = "Null installedVersionTag"
            java.util.Objects.requireNonNull(r12, r2)
            r1.zzi = r12
            return
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackState
    public final long bytesDownloaded() {
            r2 = this;
            long r0 = r2.zzd
            return r0
    }

    public final boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r8 != r7) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof com.google.android.play.core.assetpacks.AssetPackState
            r2 = 0
            if (r1 == 0) goto L64
            com.google.android.play.core.assetpacks.AssetPackState r8 = (com.google.android.play.core.assetpacks.AssetPackState) r8
            java.lang.String r1 = r7.zza
            java.lang.String r3 = r8.name()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L64
            int r1 = r7.zzb
            int r3 = r8.status()
            if (r1 != r3) goto L64
            int r1 = r7.zzc
            int r3 = r8.errorCode()
            if (r1 != r3) goto L64
            long r3 = r7.zzd
            long r5 = r8.bytesDownloaded()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L64
            long r3 = r7.zze
            long r5 = r8.totalBytesToDownload()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L64
            int r1 = r7.zzf
            int r3 = r8.transferProgressPercentage()
            if (r1 != r3) goto L64
            int r1 = r7.zzg
            int r3 = r8.zza()
            if (r1 != r3) goto L64
            java.lang.String r1 = r7.zzh
            java.lang.String r3 = r8.zzd()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L64
            java.lang.String r1 = r7.zzi
            java.lang.String r8 = r8.zze()
            boolean r8 = r1.equals(r8)
            if (r8 == 0) goto L64
            return r0
        L64:
            return r2
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackState
    @com.google.android.play.core.assetpacks.model.AssetPackErrorCode
    public final int errorCode() {
            r1 = this;
            int r0 = r1.zzc
            return r0
    }

    public final int hashCode() {
            r10 = this;
            java.lang.String r0 = r10.zza
            int r0 = r0.hashCode()
            int r1 = r10.zzb
            int r2 = r10.zzc
            long r3 = r10.zzd
            long r5 = r10.zze
            r7 = 1000003(0xf4243, float:1.401303E-39)
            r0 = r0 ^ r7
            int r0 = r0 * r7
            r0 = r0 ^ r1
            int r0 = r0 * r7
            r0 = r0 ^ r2
            int r0 = r0 * r7
            r1 = 32
            long r8 = r3 >>> r1
            long r2 = r8 ^ r3
            int r3 = (int) r2
            r0 = r0 ^ r3
            int r0 = r0 * r7
            long r1 = r5 >>> r1
            long r1 = r1 ^ r5
            int r2 = (int) r1
            r0 = r0 ^ r2
            int r0 = r0 * r7
            int r1 = r10.zzf
            r0 = r0 ^ r1
            int r0 = r0 * r7
            int r1 = r10.zzg
            r0 = r0 ^ r1
            int r0 = r0 * r7
            java.lang.String r1 = r10.zzh
            int r1 = r1.hashCode()
            r0 = r0 ^ r1
            int r0 = r0 * r7
            java.lang.String r1 = r10.zzi
            int r1 = r1.hashCode()
            r0 = r0 ^ r1
            return r0
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackState
    public final java.lang.String name() {
            r1 = this;
            java.lang.String r0 = r1.zza
            return r0
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackState
    @com.google.android.play.core.assetpacks.model.AssetPackStatus
    public final int status() {
            r1 = this;
            int r0 = r1.zzb
            return r0
    }

    public final java.lang.String toString() {
            r14 = this;
            java.lang.String r0 = r14.zza
            int r1 = r14.zzb
            int r2 = r14.zzc
            long r3 = r14.zzd
            long r5 = r14.zze
            int r7 = r14.zzf
            int r8 = r14.zzg
            java.lang.String r9 = r14.zzh
            java.lang.String r10 = r14.zzi
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            int r12 = r0.length()
            int r12 = r12 + 261
            int r13 = r9.length()
            int r13 = r13 + r12
            int r12 = r10.length()
            int r12 = r12 + r13
            r11.<init>(r12)
            java.lang.String r12 = "AssetPackState{name="
            r11.append(r12)
            r11.append(r0)
            java.lang.String r0 = ", status="
            r11.append(r0)
            r11.append(r1)
            java.lang.String r0 = ", errorCode="
            r11.append(r0)
            r11.append(r2)
            java.lang.String r0 = ", bytesDownloaded="
            r11.append(r0)
            r11.append(r3)
            java.lang.String r0 = ", totalBytesToDownload="
            r11.append(r0)
            r11.append(r5)
            java.lang.String r0 = ", transferProgressPercentage="
            r11.append(r0)
            r11.append(r7)
            java.lang.String r0 = ", updateAvailability="
            r11.append(r0)
            r11.append(r8)
            java.lang.String r0 = ", availableVersionTag="
            r11.append(r0)
            java.lang.String r0 = ", installedVersionTag="
            java.lang.String r1 = "}"
            java.lang.String r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r11, r9, r0, r10, r1)
            return r0
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackState
    public final long totalBytesToDownload() {
            r2 = this;
            long r0 = r2.zze
            return r0
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackState
    public final int transferProgressPercentage() {
            r1 = this;
            int r0 = r1.zzf
            return r0
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackState
    public final int zza() {
            r1 = this;
            int r0 = r1.zzg
            return r0
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackState
    public final java.lang.String zzd() {
            r1 = this;
            java.lang.String r0 = r1.zzh
            return r0
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackState
    public final java.lang.String zze() {
            r1 = this;
            java.lang.String r0 = r1.zzi
            return r0
    }
}
