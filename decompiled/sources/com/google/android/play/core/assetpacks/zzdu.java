package com.google.android.play.core.assetpacks;

/* JADX INFO: compiled from: com.google.android.play:core@@1.10.3 */
/* JADX INFO: loaded from: classes.dex */
final class zzdu {
    private static final com.google.android.play.core.internal.zzag zza = null;
    private final com.google.android.play.core.assetpacks.zzbh zzb;

    static {
            com.google.android.play.core.internal.zzag r0 = new com.google.android.play.core.internal.zzag
            java.lang.String r1 = "MergeSliceTaskHandler"
            r0.<init>(r1)
            com.google.android.play.core.assetpacks.zzdu.zza = r0
            return
    }

    public zzdu(com.google.android.play.core.assetpacks.zzbh r1) {
            r0 = this;
            r0.<init>()
            r0.zzb = r1
            return
    }

    private static void zzb(java.io.File r6, java.io.File r7) {
            boolean r0 = r6.isDirectory()
            if (r0 == 0) goto L39
            r7.mkdirs()
            java.io.File[] r0 = r6.listFiles()
            int r1 = r0.length
            r2 = 0
        Lf:
            if (r2 >= r1) goto L22
            r3 = r0[r2]
            java.io.File r4 = new java.io.File
            java.lang.String r5 = r3.getName()
            r4.<init>(r7, r5)
            zzb(r3, r4)
            int r2 = r2 + 1
            goto Lf
        L22:
            boolean r7 = r6.delete()
            if (r7 == 0) goto L29
            goto L45
        L29:
            com.google.android.play.core.assetpacks.zzck r7 = new com.google.android.play.core.assetpacks.zzck
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.String r0 = "Unable to delete directory: "
            java.lang.String r6 = r0.concat(r6)
            r7.<init>(r6)
            throw r7
        L39:
            boolean r0 = r7.exists()
            if (r0 != 0) goto L56
            boolean r7 = r6.renameTo(r7)
            if (r7 == 0) goto L46
        L45:
            return
        L46:
            com.google.android.play.core.assetpacks.zzck r7 = new com.google.android.play.core.assetpacks.zzck
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.String r0 = "Unable to move file: "
            java.lang.String r6 = r0.concat(r6)
            r7.<init>(r6)
            throw r7
        L56:
            com.google.android.play.core.assetpacks.zzck r6 = new com.google.android.play.core.assetpacks.zzck
            java.lang.String r7 = r7.toString()
            java.lang.String r0 = "File clashing with existing file from other slice: "
            java.lang.String r7 = r0.concat(r7)
            r6.<init>(r7)
            throw r6
    }

    public final void zza(com.google.android.play.core.assetpacks.zzdt r11) {
            r10 = this;
            com.google.android.play.core.assetpacks.zzbh r0 = r10.zzb
            java.lang.String r1 = r11.zzl
            int r2 = r11.zza
            long r3 = r11.zzb
            java.lang.String r5 = r11.zzc
            java.io.File r0 = r0.zzq(r1, r2, r3, r5)
            boolean r1 = r0.exists()
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L62
            com.google.android.play.core.assetpacks.zzbh r1 = r10.zzb
            java.lang.String r4 = r11.zzl
            int r5 = r11.zza
            long r6 = r11.zzb
            java.io.File r1 = r1.zzj(r4, r5, r6)
            boolean r4 = r1.exists()
            if (r4 != 0) goto L2b
            r1.mkdirs()
        L2b:
            zzb(r0, r1)
            com.google.android.play.core.assetpacks.zzbh r0 = r10.zzb     // Catch: java.io.IOException -> L48
            java.lang.String r1 = r11.zzl     // Catch: java.io.IOException -> L48
            int r4 = r11.zza     // Catch: java.io.IOException -> L48
            long r5 = r11.zzb     // Catch: java.io.IOException -> L48
            int r0 = r0.zzb(r1, r4, r5)     // Catch: java.io.IOException -> L48
            com.google.android.play.core.assetpacks.zzbh r4 = r10.zzb     // Catch: java.io.IOException -> L48
            java.lang.String r5 = r11.zzl     // Catch: java.io.IOException -> L48
            int r6 = r11.zza     // Catch: java.io.IOException -> L48
            long r7 = r11.zzb     // Catch: java.io.IOException -> L48
            int r9 = r0 + 1
            r4.zzA(r5, r6, r7, r9)     // Catch: java.io.IOException -> L48
            return
        L48:
            r0 = move-exception
            com.google.android.play.core.internal.zzag r1 = com.google.android.play.core.assetpacks.zzdu.zza
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r4 = r0.getMessage()
            r3[r2] = r4
            java.lang.String r2 = "Writing merge checkpoint failed with %s."
            r1.zzb(r2, r3)
            com.google.android.play.core.assetpacks.zzck r1 = new com.google.android.play.core.assetpacks.zzck
            int r11 = r11.zzk
            java.lang.String r2 = "Writing merge checkpoint failed."
            r1.<init>(r2, r0, r11)
            throw r1
        L62:
            com.google.android.play.core.assetpacks.zzck r0 = new com.google.android.play.core.assetpacks.zzck
            java.lang.Object[] r1 = new java.lang.Object[r3]
            java.lang.String r3 = r11.zzc
            r1[r2] = r3
            java.lang.String r2 = "Cannot find verified files for slice %s."
            java.lang.String r1 = java.lang.String.format(r2, r1)
            int r11 = r11.zzk
            r0.<init>(r1, r11)
            throw r0
    }
}
