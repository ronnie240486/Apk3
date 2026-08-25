package com.google.android.play.core.assetpacks;

/* JADX INFO: compiled from: com.google.android.play:core@@1.10.3 */
/* JADX INFO: loaded from: classes.dex */
final class zzek {
    private final com.google.android.play.core.assetpacks.zzbh zza;
    private final com.google.android.play.core.internal.zzco zzb;
    private final com.google.android.play.core.assetpacks.zzde zzc;
    private final com.google.android.play.core.internal.zzco zzd;
    private final com.google.android.play.core.assetpacks.zzco zze;

    public zzek(com.google.android.play.core.assetpacks.zzbh r1, com.google.android.play.core.internal.zzco r2, com.google.android.play.core.assetpacks.zzde r3, com.google.android.play.core.internal.zzco r4, com.google.android.play.core.assetpacks.zzco r5) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r3
            r0.zzd = r4
            r0.zze = r5
            return
    }

    public final void zza(com.google.android.play.core.assetpacks.zzei r10) {
            r9 = this;
            com.google.android.play.core.assetpacks.zzbh r0 = r9.zza
            java.lang.String r1 = r10.zzl
            int r2 = r10.zza
            long r3 = r10.zzc
            java.io.File r0 = r0.zzh(r1, r2, r3)
            boolean r1 = r0.exists()
            r2 = 1
            r3 = 0
            r4 = 2
            if (r1 == 0) goto L7d
            com.google.android.play.core.assetpacks.zzbh r1 = r9.zza
            java.lang.String r5 = r10.zzl
            int r6 = r10.zzb
            long r7 = r10.zzc
            java.io.File r1 = r1.zzh(r5, r6, r7)
            r1.mkdirs()
            boolean r5 = r0.renameTo(r1)
            if (r5 == 0) goto L5c
            com.google.android.play.core.internal.zzco r0 = r9.zzd
            java.lang.Object r0 = r0.zza()
            java.util.concurrent.Executor r0 = (java.util.concurrent.Executor) r0
            com.google.android.play.core.assetpacks.zzej r1 = new com.google.android.play.core.assetpacks.zzej
            r1.<init>(r9, r10)
            r0.execute(r1)
            com.google.android.play.core.assetpacks.zzde r0 = r9.zzc
            java.lang.String r1 = r10.zzl
            int r2 = r10.zzb
            long r3 = r10.zzc
            r0.zzk(r1, r2, r3)
            com.google.android.play.core.assetpacks.zzco r0 = r9.zze
            java.lang.String r1 = r10.zzl
            r0.zzc(r1)
            com.google.android.play.core.internal.zzco r0 = r9.zzb
            java.lang.Object r0 = r0.zza()
            com.google.android.play.core.assetpacks.zzy r0 = (com.google.android.play.core.assetpacks.zzy) r0
            int r1 = r10.zzk
            java.lang.String r10 = r10.zzl
            r0.zzh(r1, r10)
            return
        L5c:
            com.google.android.play.core.assetpacks.zzck r5 = new com.google.android.play.core.assetpacks.zzck
            r6 = 3
            java.lang.Object[] r6 = new java.lang.Object[r6]
            java.lang.String r7 = r10.zzl
            r6[r3] = r7
            java.lang.String r0 = r0.getAbsolutePath()
            r6[r2] = r0
            java.lang.String r0 = r1.getAbsolutePath()
            r6[r4] = r0
            java.lang.String r0 = "Cannot promote pack %s from %s to %s"
            java.lang.String r0 = java.lang.String.format(r0, r6)
            int r10 = r10.zzk
            r5.<init>(r0, r10)
            throw r5
        L7d:
            com.google.android.play.core.assetpacks.zzck r1 = new com.google.android.play.core.assetpacks.zzck
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.String r5 = r10.zzl
            r4[r3] = r5
            java.lang.String r0 = r0.getAbsolutePath()
            r4[r2] = r0
            java.lang.String r0 = "Cannot find pack files to promote for pack %s at %s"
            java.lang.String r0 = java.lang.String.format(r0, r4)
            int r10 = r10.zzk
            r1.<init>(r0, r10)
            throw r1
    }

    public final /* synthetic */ void zzb(com.google.android.play.core.assetpacks.zzei r6) {
            r5 = this;
            com.google.android.play.core.assetpacks.zzbh r0 = r5.zza
            java.lang.String r1 = r6.zzl
            int r2 = r6.zzb
            long r3 = r6.zzc
            r0.zzB(r1, r2, r3)
            return
    }
}
