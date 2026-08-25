package com.google.android.play.core.assetpacks;

/* JADX INFO: compiled from: com.google.android.play:core@@1.10.3 */
/* JADX INFO: loaded from: classes.dex */
final class zzeg {
    private static final com.google.android.play.core.internal.zzag zza = null;
    private final com.google.android.play.core.assetpacks.zzbh zzb;
    private final com.google.android.play.core.internal.zzco zzc;

    static {
            com.google.android.play.core.internal.zzag r0 = new com.google.android.play.core.internal.zzag
            java.lang.String r1 = "PatchSliceTaskHandler"
            r0.<init>(r1)
            com.google.android.play.core.assetpacks.zzeg.zza = r0
            return
    }

    public zzeg(com.google.android.play.core.assetpacks.zzbh r1, com.google.android.play.core.internal.zzco r2) {
            r0 = this;
            r0.<init>()
            r0.zzb = r1
            r0.zzc = r2
            return
    }

    public final void zza(com.google.android.play.core.assetpacks.zzef r15) {
            r14 = this;
            com.google.android.play.core.assetpacks.zzbh r0 = r14.zzb
            java.lang.String r1 = r15.zzl
            int r2 = r15.zza
            long r3 = r15.zzb
            java.io.File r0 = r0.zzh(r1, r2, r3)
            com.google.android.play.core.assetpacks.zzbh r1 = r14.zzb
            java.lang.String r2 = r15.zzl
            int r3 = r15.zza
            long r4 = r15.zzb
            java.lang.String r6 = r15.zzf
            java.io.File r7 = new java.io.File
            java.io.File r1 = r1.zzi(r2, r3, r4)
            r7.<init>(r1, r6)
            r1 = 2
            r2 = 1
            r3 = 0
            java.io.InputStream r4 = r15.zzh     // Catch: java.io.IOException -> Lac
            int r5 = r15.zze     // Catch: java.io.IOException -> Lac
            if (r5 == r1) goto L29
            goto L31
        L29:
            java.util.zip.GZIPInputStream r5 = new java.util.zip.GZIPInputStream     // Catch: java.io.IOException -> Lac
            r6 = 8192(0x2000, float:1.148E-41)
            r5.<init>(r4, r6)     // Catch: java.io.IOException -> Lac
            r4 = r5
        L31:
            com.google.android.play.core.assetpacks.zzbk r5 = new com.google.android.play.core.assetpacks.zzbk     // Catch: java.lang.Throwable -> La7
            r5.<init>(r0, r7)     // Catch: java.lang.Throwable -> La7
            com.google.android.play.core.assetpacks.zzbh r8 = r14.zzb     // Catch: java.lang.Throwable -> La7
            java.lang.String r9 = r15.zzl     // Catch: java.lang.Throwable -> La7
            int r10 = r15.zzc     // Catch: java.lang.Throwable -> La7
            long r11 = r15.zzd     // Catch: java.lang.Throwable -> La7
            java.lang.String r13 = r15.zzf     // Catch: java.lang.Throwable -> La7
            java.io.File r0 = r8.zzp(r9, r10, r11, r13)     // Catch: java.lang.Throwable -> La7
            boolean r6 = r0.exists()     // Catch: java.lang.Throwable -> La7
            if (r6 != 0) goto L4d
            r0.mkdirs()     // Catch: java.lang.Throwable -> La7
        L4d:
            com.google.android.play.core.assetpacks.zzen r13 = new com.google.android.play.core.assetpacks.zzen     // Catch: java.lang.Throwable -> La7
            com.google.android.play.core.assetpacks.zzbh r7 = r14.zzb     // Catch: java.lang.Throwable -> La7
            java.lang.String r8 = r15.zzl     // Catch: java.lang.Throwable -> La7
            int r9 = r15.zzc     // Catch: java.lang.Throwable -> La7
            long r10 = r15.zzd     // Catch: java.lang.Throwable -> La7
            java.lang.String r12 = r15.zzf     // Catch: java.lang.Throwable -> La7
            r6 = r13
            r6.<init>(r7, r8, r9, r10, r12)     // Catch: java.lang.Throwable -> La7
            com.google.android.play.core.assetpacks.zzcn r6 = new com.google.android.play.core.assetpacks.zzcn     // Catch: java.lang.Throwable -> La7
            r6.<init>(r0, r13)     // Catch: java.lang.Throwable -> La7
            long r7 = r15.zzg     // Catch: java.lang.Throwable -> La7
            com.google.android.play.core.internal.zzcl.zza(r5, r4, r6, r7)     // Catch: java.lang.Throwable -> La7
            r13.zzi(r3)     // Catch: java.lang.Throwable -> La7
            r4.close()     // Catch: java.io.IOException -> Lac
            com.google.android.play.core.internal.zzag r0 = com.google.android.play.core.assetpacks.zzeg.zza
            java.lang.Object[] r4 = new java.lang.Object[r1]
            java.lang.String r5 = r15.zzf
            r4[r3] = r5
            java.lang.String r5 = r15.zzl
            r4[r2] = r5
            java.lang.String r5 = "Patching and extraction finished for slice %s of pack %s."
            r0.zzd(r5, r4)
            com.google.android.play.core.internal.zzco r0 = r14.zzc
            java.lang.Object r0 = r0.zza()
            com.google.android.play.core.assetpacks.zzy r0 = (com.google.android.play.core.assetpacks.zzy) r0
            int r4 = r15.zzk
            java.lang.String r5 = r15.zzl
            java.lang.String r6 = r15.zzf
            r0.zzg(r4, r5, r6, r3)
            java.io.InputStream r0 = r15.zzh     // Catch: java.io.IOException -> L95
            r0.close()     // Catch: java.io.IOException -> L95
            return
        L95:
            com.google.android.play.core.internal.zzag r0 = com.google.android.play.core.assetpacks.zzeg.zza
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r4 = r15.zzf
            r1[r3] = r4
            java.lang.String r15 = r15.zzl
            r1[r2] = r15
            java.lang.String r15 = "Could not close file for slice %s of pack %s."
            r0.zze(r15, r1)
            return
        La7:
            r0 = move-exception
            r4.close()     // Catch: java.lang.Throwable -> Lab
        Lab:
            throw r0     // Catch: java.io.IOException -> Lac
        Lac:
            r0 = move-exception
            com.google.android.play.core.internal.zzag r4 = com.google.android.play.core.assetpacks.zzeg.zza
            java.lang.Object[] r5 = new java.lang.Object[r2]
            java.lang.String r6 = r0.getMessage()
            r5[r3] = r6
            java.lang.String r6 = "IOException during patching %s."
            r4.zzb(r6, r5)
            com.google.android.play.core.assetpacks.zzck r4 = new com.google.android.play.core.assetpacks.zzck
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r5 = r15.zzf
            r1[r3] = r5
            java.lang.String r3 = r15.zzl
            r1[r2] = r3
            java.lang.String r2 = "Error patching slice %s of pack %s."
            java.lang.String r1 = java.lang.String.format(r2, r1)
            int r15 = r15.zzk
            r4.<init>(r1, r0, r15)
            throw r4
    }
}
