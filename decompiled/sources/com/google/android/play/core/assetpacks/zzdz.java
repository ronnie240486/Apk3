package com.google.android.play.core.assetpacks;

/* JADX INFO: compiled from: com.google.android.play:core@@1.10.3 */
/* JADX INFO: loaded from: classes.dex */
final class zzdz {
    private final com.google.android.play.core.assetpacks.zzbh zza;
    private final com.google.android.play.core.internal.zzco zzb;
    private final com.google.android.play.core.assetpacks.zzde zzc;
    private final com.google.android.play.core.internal.zzco zzd;
    private final com.google.android.play.core.assetpacks.zzco zze;
    private final com.google.android.play.core.common.zza zzf;
    private final com.google.android.play.core.assetpacks.zzeb zzg;

    public zzdz(com.google.android.play.core.assetpacks.zzbh r1, com.google.android.play.core.internal.zzco r2, com.google.android.play.core.assetpacks.zzde r3, com.google.android.play.core.internal.zzco r4, com.google.android.play.core.assetpacks.zzco r5, com.google.android.play.core.common.zza r6, com.google.android.play.core.assetpacks.zzeb r7) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r3
            r0.zzd = r4
            r0.zze = r5
            r0.zzf = r6
            r0.zzg = r7
            return
    }

    public final void zza(com.google.android.play.core.assetpacks.zzdw r12) {
            r11 = this;
            com.google.android.play.core.assetpacks.zzbh r0 = r11.zza
            java.lang.String r1 = r12.zzl
            int r2 = r12.zza
            long r3 = r12.zzb
            java.io.File r0 = r0.zzj(r1, r2, r3)
            com.google.android.play.core.assetpacks.zzbh r1 = r11.zza
            java.lang.String r2 = r12.zzl
            int r3 = r12.zza
            long r4 = r12.zzb
            java.io.File r1 = r1.zzl(r2, r3, r4)
            boolean r2 = r0.exists()
            r3 = 0
            r4 = 1
            if (r2 == 0) goto Lf5
            boolean r2 = r1.exists()
            if (r2 == 0) goto Lf5
            com.google.android.play.core.assetpacks.zzbh r2 = r11.zza
            java.lang.String r5 = r12.zzl
            int r6 = r12.zza
            long r7 = r12.zzb
            java.io.File r2 = r2.zzh(r5, r6, r7)
            r2.mkdirs()
            boolean r0 = r0.renameTo(r2)
            if (r0 == 0) goto Leb
            com.google.android.play.core.assetpacks.zzbh r0 = r11.zza
            java.lang.String r2 = r12.zzl
            int r5 = r12.zza
            long r6 = r12.zzb
            java.io.File r8 = new java.io.File
            java.io.File r0 = r0.zzh(r2, r5, r6)
            java.lang.String r2 = "merge.tmp"
            r8.<init>(r0, r2)
            r8.delete()
            com.google.android.play.core.assetpacks.zzbh r0 = r11.zza
            java.lang.String r2 = r12.zzl
            int r5 = r12.zza
            long r6 = r12.zzb
            java.io.File r0 = r0.zzi(r2, r5, r6)
            r0.mkdirs()
            boolean r0 = r1.renameTo(r0)
            if (r0 == 0) goto Le1
            com.google.android.play.core.common.zza r0 = r11.zzf
            java.lang.String r1 = "assetOnlyUpdates"
            boolean r0 = r0.zza(r1)
            if (r0 == 0) goto Laa
            com.google.android.play.core.assetpacks.zzeb r5 = r11.zzg     // Catch: java.io.IOException -> L8e
            java.lang.String r6 = r12.zzl     // Catch: java.io.IOException -> L8e
            int r7 = r12.zza     // Catch: java.io.IOException -> L8e
            long r8 = r12.zzb     // Catch: java.io.IOException -> L8e
            java.lang.String r10 = r12.zzc     // Catch: java.io.IOException -> L8e
            r5.zzb(r6, r7, r8, r10)     // Catch: java.io.IOException -> L8e
            com.google.android.play.core.internal.zzco r0 = r11.zzd
            java.lang.Object r0 = r0.zza()
            java.util.concurrent.Executor r0 = (java.util.concurrent.Executor) r0
            com.google.android.play.core.assetpacks.zzdy r1 = new com.google.android.play.core.assetpacks.zzdy
            r1.<init>(r11, r12)
            r0.execute(r1)
            goto Lbf
        L8e:
            r0 = move-exception
            com.google.android.play.core.assetpacks.zzck r1 = new com.google.android.play.core.assetpacks.zzck
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r5 = r12.zzl
            r2[r3] = r5
            java.lang.String r0 = r0.getMessage()
            r2[r4] = r0
            java.lang.String r0 = "Could not write asset pack version tag for pack %s: %s"
            java.lang.String r0 = java.lang.String.format(r0, r2)
            int r12 = r12.zzk
            r1.<init>(r0, r12)
            throw r1
        Laa:
            com.google.android.play.core.internal.zzco r0 = r11.zzd
            java.lang.Object r0 = r0.zza()
            java.util.concurrent.Executor r0 = (java.util.concurrent.Executor) r0
            com.google.android.play.core.assetpacks.zzbh r1 = r11.zza
            java.util.Objects.requireNonNull(r1)
            com.google.android.play.core.assetpacks.zzdx r2 = new com.google.android.play.core.assetpacks.zzdx
            r2.<init>(r1)
            r0.execute(r2)
        Lbf:
            com.google.android.play.core.assetpacks.zzde r0 = r11.zzc
            java.lang.String r1 = r12.zzl
            int r2 = r12.zza
            long r3 = r12.zzb
            r0.zzk(r1, r2, r3)
            com.google.android.play.core.assetpacks.zzco r0 = r11.zze
            java.lang.String r1 = r12.zzl
            r0.zzc(r1)
            com.google.android.play.core.internal.zzco r0 = r11.zzb
            java.lang.Object r0 = r0.zza()
            com.google.android.play.core.assetpacks.zzy r0 = (com.google.android.play.core.assetpacks.zzy) r0
            int r1 = r12.zzk
            java.lang.String r12 = r12.zzl
            r0.zzh(r1, r12)
            return
        Le1:
            com.google.android.play.core.assetpacks.zzck r0 = new com.google.android.play.core.assetpacks.zzck
            int r12 = r12.zzk
            java.lang.String r1 = "Cannot move metadata files to final location."
            r0.<init>(r1, r12)
            throw r0
        Leb:
            com.google.android.play.core.assetpacks.zzck r0 = new com.google.android.play.core.assetpacks.zzck
            int r12 = r12.zzk
            java.lang.String r1 = "Cannot move merged pack files to final location."
            r0.<init>(r1, r12)
            throw r0
        Lf5:
            com.google.android.play.core.assetpacks.zzck r0 = new com.google.android.play.core.assetpacks.zzck
            java.lang.Object[] r1 = new java.lang.Object[r4]
            java.lang.String r2 = r12.zzl
            r1[r3] = r2
            java.lang.String r2 = "Cannot find pack files to move for pack %s."
            java.lang.String r1 = java.lang.String.format(r2, r1)
            int r12 = r12.zzk
            r0.<init>(r1, r12)
            throw r0
    }

    public final /* synthetic */ void zzb(com.google.android.play.core.assetpacks.zzdw r6) {
            r5 = this;
            com.google.android.play.core.assetpacks.zzbh r0 = r5.zza
            java.lang.String r1 = r6.zzl
            int r2 = r6.zza
            long r3 = r6.zzb
            r0.zzB(r1, r2, r3)
            return
    }
}
