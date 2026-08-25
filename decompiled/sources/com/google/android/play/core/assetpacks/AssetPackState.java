package com.google.android.play.core.assetpacks;

/* JADX INFO: compiled from: com.google.android.play:core@@1.10.3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AssetPackState {
    public AssetPackState() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.google.android.play.core.assetpacks.AssetPackState zzb(@androidx.annotation.NonNull java.lang.String r13, @com.google.android.play.core.assetpacks.model.AssetPackStatus int r14, @com.google.android.play.core.assetpacks.model.AssetPackErrorCode int r15, long r16, long r18, double r20, int r22, java.lang.String r23, java.lang.String r24) {
            com.google.android.play.core.assetpacks.zzbn r12 = new com.google.android.play.core.assetpacks.zzbn
            r0 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r0 = r0 * r20
            double r0 = java.lang.Math.rint(r0)
            int r8 = (int) r0
            r0 = r12
            r1 = r13
            r2 = r14
            r3 = r15
            r4 = r16
            r6 = r18
            r9 = r22
            r10 = r23
            r11 = r24
            r0.<init>(r1, r2, r3, r4, r6, r8, r9, r10, r11)
            return r12
    }

    public static com.google.android.play.core.assetpacks.AssetPackState zzc(android.os.Bundle r18, java.lang.String r19, com.google.android.play.core.assetpacks.zzco r20, com.google.android.play.core.assetpacks.zzeb r21, com.google.android.play.core.assetpacks.zzbe r22) {
            r0 = r18
            r1 = r19
            java.lang.String r2 = "status"
            java.lang.String r2 = com.google.android.play.core.assetpacks.model.zzb.zza(r2, r1)
            int r2 = r0.getInt(r2)
            r3 = r22
            int r2 = r3.zza(r2, r1)
            java.lang.String r3 = "error_code"
            java.lang.String r3 = com.google.android.play.core.assetpacks.model.zzb.zza(r3, r1)
            int r3 = r0.getInt(r3)
            java.lang.String r4 = "bytes_downloaded"
            java.lang.String r4 = com.google.android.play.core.assetpacks.model.zzb.zza(r4, r1)
            long r4 = r0.getLong(r4)
            java.lang.String r6 = "total_bytes_to_download"
            java.lang.String r6 = com.google.android.play.core.assetpacks.model.zzb.zza(r6, r1)
            long r6 = r0.getLong(r6)
            r8 = r20
            double r8 = r8.zza(r1)
            java.lang.String r10 = "pack_version"
            java.lang.String r10 = com.google.android.play.core.assetpacks.model.zzb.zza(r10, r1)
            long r10 = r0.getLong(r10)
            java.lang.String r12 = "pack_base_version"
            java.lang.String r12 = com.google.android.play.core.assetpacks.model.zzb.zza(r12, r1)
            long r12 = r0.getLong(r12)
            r14 = 1
            r15 = 4
            if (r2 != r15) goto L5f
            r16 = 0
            int r2 = (r12 > r16 ? 1 : (r12 == r16 ? 0 : -1))
            if (r2 == 0) goto L60
            int r2 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r2 == 0) goto L60
            r2 = 2
            r14 = 2
            goto L60
        L5f:
            r15 = r2
        L60:
            java.lang.String r2 = "pack_version_tag"
            java.lang.String r2 = com.google.android.play.core.assetpacks.model.zzb.zza(r2, r1)
            java.lang.String r10 = "app_version_code"
            int r10 = r0.getInt(r10)
            java.lang.String r10 = java.lang.String.valueOf(r10)
            java.lang.String r10 = r0.getString(r2, r10)
            r0 = r21
            java.lang.String r11 = r0.zza(r1)
            r0 = r19
            r1 = r15
            r2 = r3
            r3 = r4
            r5 = r6
            r7 = r8
            r9 = r14
            com.google.android.play.core.assetpacks.AssetPackState r0 = zzb(r0, r1, r2, r3, r5, r7, r9, r10, r11)
            return r0
    }

    public abstract long bytesDownloaded();

    @com.google.android.play.core.assetpacks.model.AssetPackErrorCode
    public abstract int errorCode();

    public abstract java.lang.String name();

    @com.google.android.play.core.assetpacks.model.AssetPackStatus
    public abstract int status();

    public abstract long totalBytesToDownload();

    public abstract int transferProgressPercentage();

    public abstract int zza();

    public abstract java.lang.String zzd();

    public abstract java.lang.String zze();
}
