package com.google.android.play.core.assetpacks;

/* JADX INFO: compiled from: com.google.android.play:core@@1.10.3 */
/* JADX INFO: loaded from: classes.dex */
final class zzer {
    private static final com.google.android.play.core.internal.zzag zza = null;
    private final com.google.android.play.core.assetpacks.zzbh zzb;

    static {
            com.google.android.play.core.internal.zzag r0 = new com.google.android.play.core.internal.zzag
            java.lang.String r1 = "VerifySliceTaskHandler"
            r0.<init>(r1)
            com.google.android.play.core.assetpacks.zzer.zza = r0
            return
    }

    public zzer(com.google.android.play.core.assetpacks.zzbh r1) {
            r0 = this;
            r0.<init>()
            r0.zzb = r1
            return
    }

    private final void zzb(com.google.android.play.core.assetpacks.zzeq r9, java.io.File r10) {
            r8 = this;
            r0 = 0
            r1 = 1
            com.google.android.play.core.assetpacks.zzbh r2 = r8.zzb     // Catch: java.io.IOException -> L81
            java.lang.String r3 = r9.zzl     // Catch: java.io.IOException -> L81
            int r4 = r9.zza     // Catch: java.io.IOException -> L81
            long r5 = r9.zzb     // Catch: java.io.IOException -> L81
            java.lang.String r7 = r9.zzc     // Catch: java.io.IOException -> L81
            java.io.File r2 = r2.zzo(r3, r4, r5, r7)     // Catch: java.io.IOException -> L81
            boolean r3 = r2.exists()     // Catch: java.io.IOException -> L81
            if (r3 == 0) goto L6d
            java.util.List r10 = com.google.android.play.core.assetpacks.zzep.zza(r10, r2)     // Catch: java.io.IOException -> L81
            java.lang.String r10 = com.google.android.play.core.assetpacks.zzdq.zza(r10)     // Catch: java.io.IOException -> L4d java.security.NoSuchAlgorithmException -> L62
            java.lang.String r2 = r9.zzd
            boolean r10 = r10.equals(r2)
            if (r10 == 0) goto L39
            com.google.android.play.core.internal.zzag r10 = com.google.android.play.core.assetpacks.zzer.zza
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r3 = r9.zzc
            r2[r0] = r3
            java.lang.String r9 = r9.zzl
            r2[r1] = r9
            java.lang.String r9 = "Verification of slice %s of pack %s successful."
            r10.zzd(r9, r2)
            return
        L39:
            com.google.android.play.core.assetpacks.zzck r10 = new com.google.android.play.core.assetpacks.zzck
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = r9.zzc
            r1[r0] = r2
            java.lang.String r0 = "Verification failed for slice %s."
            java.lang.String r0 = java.lang.String.format(r0, r1)
            int r9 = r9.zzk
            r10.<init>(r0, r9)
            throw r10
        L4d:
            r10 = move-exception
            com.google.android.play.core.assetpacks.zzck r2 = new com.google.android.play.core.assetpacks.zzck
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r3 = r9.zzc
            r1[r0] = r3
            java.lang.String r0 = "Could not digest file during verification for slice %s."
            java.lang.String r0 = java.lang.String.format(r0, r1)
            int r9 = r9.zzk
            r2.<init>(r0, r10, r9)
            throw r2
        L62:
            r10 = move-exception
            com.google.android.play.core.assetpacks.zzck r0 = new com.google.android.play.core.assetpacks.zzck
            int r9 = r9.zzk
            java.lang.String r1 = "SHA256 algorithm not supported."
            r0.<init>(r1, r10, r9)
            throw r0
        L6d:
            com.google.android.play.core.assetpacks.zzck r10 = new com.google.android.play.core.assetpacks.zzck     // Catch: java.io.IOException -> L81
            java.lang.Object[] r2 = new java.lang.Object[r1]     // Catch: java.io.IOException -> L81
            java.lang.String r3 = r9.zzc     // Catch: java.io.IOException -> L81
            r2[r0] = r3     // Catch: java.io.IOException -> L81
            java.lang.String r3 = "Cannot find metadata files for slice %s."
            java.lang.String r2 = java.lang.String.format(r3, r2)     // Catch: java.io.IOException -> L81
            int r3 = r9.zzk     // Catch: java.io.IOException -> L81
            r10.<init>(r2, r3)     // Catch: java.io.IOException -> L81
            throw r10     // Catch: java.io.IOException -> L81
        L81:
            r10 = move-exception
            com.google.android.play.core.assetpacks.zzck r2 = new com.google.android.play.core.assetpacks.zzck
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r3 = r9.zzc
            r1[r0] = r3
            java.lang.String r0 = "Could not reconstruct slice archive during verification for slice %s."
            java.lang.String r0 = java.lang.String.format(r0, r1)
            int r9 = r9.zzk
            r2.<init>(r0, r10, r9)
            throw r2
    }

    public final void zza(com.google.android.play.core.assetpacks.zzeq r11) {
            r10 = this;
            com.google.android.play.core.assetpacks.zzbh r0 = r10.zzb
            java.lang.String r1 = r11.zzl
            int r2 = r11.zza
            long r3 = r11.zzb
            java.lang.String r5 = r11.zzc
            java.io.File r0 = r0.zzp(r1, r2, r3, r5)
            boolean r1 = r0.exists()
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L4b
            r10.zzb(r11, r0)
            com.google.android.play.core.assetpacks.zzbh r4 = r10.zzb
            java.lang.String r5 = r11.zzl
            int r6 = r11.zza
            long r7 = r11.zzb
            java.lang.String r9 = r11.zzc
            java.io.File r1 = r4.zzq(r5, r6, r7, r9)
            boolean r4 = r1.exists()
            if (r4 != 0) goto L30
            r1.mkdirs()
        L30:
            boolean r0 = r0.renameTo(r1)
            if (r0 == 0) goto L37
            return
        L37:
            com.google.android.play.core.assetpacks.zzck r0 = new com.google.android.play.core.assetpacks.zzck
            java.lang.Object[] r1 = new java.lang.Object[r3]
            java.lang.String r3 = r11.zzc
            r1[r2] = r3
            java.lang.String r2 = "Failed to move slice %s after verification."
            java.lang.String r1 = java.lang.String.format(r2, r1)
            int r11 = r11.zzk
            r0.<init>(r1, r11)
            throw r0
        L4b:
            com.google.android.play.core.assetpacks.zzck r0 = new com.google.android.play.core.assetpacks.zzck
            java.lang.Object[] r1 = new java.lang.Object[r3]
            java.lang.String r3 = r11.zzc
            r1[r2] = r3
            java.lang.String r2 = "Cannot find unverified files for slice %s."
            java.lang.String r1 = java.lang.String.format(r2, r1)
            int r11 = r11.zzk
            r0.<init>(r1, r11)
            throw r0
    }
}
