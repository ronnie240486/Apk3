package com.google.android.play.core.assetpacks;

/* JADX INFO: compiled from: com.google.android.play:core@@1.10.3 */
/* JADX INFO: loaded from: classes.dex */
final class zzcl {
    private static final com.google.android.play.core.internal.zzag zza = null;
    private final com.google.android.play.core.assetpacks.zzde zzb;
    private final com.google.android.play.core.assetpacks.zzcf zzc;
    private final com.google.android.play.core.assetpacks.zzer zzd;
    private final com.google.android.play.core.assetpacks.zzdu zze;
    private final com.google.android.play.core.assetpacks.zzdz zzf;
    private final com.google.android.play.core.assetpacks.zzeg zzg;
    private final com.google.android.play.core.assetpacks.zzek zzh;
    private final com.google.android.play.core.internal.zzco zzi;
    private final com.google.android.play.core.assetpacks.zzdh zzj;
    private final java.util.concurrent.atomic.AtomicBoolean zzk;

    static {
            com.google.android.play.core.internal.zzag r0 = new com.google.android.play.core.internal.zzag
            java.lang.String r1 = "ExtractorLooper"
            r0.<init>(r1)
            com.google.android.play.core.assetpacks.zzcl.zza = r0
            return
    }

    public zzcl(com.google.android.play.core.assetpacks.zzde r1, com.google.android.play.core.internal.zzco r2, com.google.android.play.core.assetpacks.zzcf r3, com.google.android.play.core.assetpacks.zzer r4, com.google.android.play.core.assetpacks.zzdu r5, com.google.android.play.core.assetpacks.zzdz r6, com.google.android.play.core.assetpacks.zzeg r7, com.google.android.play.core.assetpacks.zzek r8, com.google.android.play.core.assetpacks.zzdh r9) {
            r0 = this;
            r0.<init>()
            r0.zzb = r1
            r0.zzi = r2
            r0.zzc = r3
            r0.zzd = r4
            r0.zze = r5
            r0.zzf = r6
            r0.zzg = r7
            r0.zzh = r8
            r0.zzj = r9
            java.util.concurrent.atomic.AtomicBoolean r1 = new java.util.concurrent.atomic.AtomicBoolean
            r2 = 0
            r1.<init>(r2)
            r0.zzk = r1
            return
    }

    private final void zzb(int r3, java.lang.Exception r4) {
            r2 = this;
            com.google.android.play.core.assetpacks.zzde r0 = r2.zzb     // Catch: com.google.android.play.core.assetpacks.zzck -> Lb
            r0.zzm(r3)     // Catch: com.google.android.play.core.assetpacks.zzck -> Lb
            com.google.android.play.core.assetpacks.zzde r0 = r2.zzb     // Catch: com.google.android.play.core.assetpacks.zzck -> Lb
            r0.zzn(r3)     // Catch: com.google.android.play.core.assetpacks.zzck -> Lb
            return
        Lb:
            com.google.android.play.core.internal.zzag r3 = com.google.android.play.core.assetpacks.zzcl.zza
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            java.lang.String r4 = r4.getMessage()
            r0[r1] = r4
            java.lang.String r4 = "Error during error handling: %s"
            r3.zzb(r4, r0)
            return
    }

    public final void zza() {
            r7 = this;
            com.google.android.play.core.internal.zzag r0 = com.google.android.play.core.assetpacks.zzcl.zza
            r1 = 0
            java.lang.Object[] r2 = new java.lang.Object[r1]
            java.lang.String r3 = "Run extractor loop"
            r0.zza(r3, r2)
            java.util.concurrent.atomic.AtomicBoolean r2 = r7.zzk
            r3 = 1
            boolean r2 = r2.compareAndSet(r1, r3)
            if (r2 == 0) goto Ld0
        L13:
            r0 = 0
            com.google.android.play.core.assetpacks.zzdh r2 = r7.zzj     // Catch: com.google.android.play.core.assetpacks.zzck -> L1b
            com.google.android.play.core.assetpacks.zzdg r0 = r2.zza()     // Catch: com.google.android.play.core.assetpacks.zzck -> L1b
            goto L41
        L1b:
            r2 = move-exception
            com.google.android.play.core.internal.zzag r4 = com.google.android.play.core.assetpacks.zzcl.zza
            java.lang.Object[] r5 = new java.lang.Object[r3]
            java.lang.String r6 = r2.getMessage()
            r5[r1] = r6
            java.lang.String r6 = "Error while getting next extraction task: %s"
            r4.zzb(r6, r5)
            int r4 = r2.zza
            if (r4 < 0) goto L41
            com.google.android.play.core.internal.zzco r4 = r7.zzi
            java.lang.Object r4 = r4.zza()
            com.google.android.play.core.assetpacks.zzy r4 = (com.google.android.play.core.assetpacks.zzy) r4
            int r5 = r2.zza
            r4.zzi(r5)
            int r4 = r2.zza
            r7.zzb(r4, r2)
        L41:
            if (r0 == 0) goto Lca
            boolean r2 = r0 instanceof com.google.android.play.core.assetpacks.zzce     // Catch: java.lang.Exception -> La6
            if (r2 == 0) goto L50
            com.google.android.play.core.assetpacks.zzcf r2 = r7.zzc     // Catch: java.lang.Exception -> La6
            r4 = r0
            com.google.android.play.core.assetpacks.zzce r4 = (com.google.android.play.core.assetpacks.zzce) r4     // Catch: java.lang.Exception -> La6
            r2.zza(r4)     // Catch: java.lang.Exception -> La6
            goto L13
        L50:
            boolean r2 = r0 instanceof com.google.android.play.core.assetpacks.zzeq     // Catch: java.lang.Exception -> La6
            if (r2 == 0) goto L5d
            com.google.android.play.core.assetpacks.zzer r2 = r7.zzd     // Catch: java.lang.Exception -> La6
            r4 = r0
            com.google.android.play.core.assetpacks.zzeq r4 = (com.google.android.play.core.assetpacks.zzeq) r4     // Catch: java.lang.Exception -> La6
            r2.zza(r4)     // Catch: java.lang.Exception -> La6
            goto L13
        L5d:
            boolean r2 = r0 instanceof com.google.android.play.core.assetpacks.zzdt     // Catch: java.lang.Exception -> La6
            if (r2 == 0) goto L6a
            com.google.android.play.core.assetpacks.zzdu r2 = r7.zze     // Catch: java.lang.Exception -> La6
            r4 = r0
            com.google.android.play.core.assetpacks.zzdt r4 = (com.google.android.play.core.assetpacks.zzdt) r4     // Catch: java.lang.Exception -> La6
            r2.zza(r4)     // Catch: java.lang.Exception -> La6
            goto L13
        L6a:
            boolean r2 = r0 instanceof com.google.android.play.core.assetpacks.zzdw     // Catch: java.lang.Exception -> La6
            if (r2 == 0) goto L77
            com.google.android.play.core.assetpacks.zzdz r2 = r7.zzf     // Catch: java.lang.Exception -> La6
            r4 = r0
            com.google.android.play.core.assetpacks.zzdw r4 = (com.google.android.play.core.assetpacks.zzdw) r4     // Catch: java.lang.Exception -> La6
            r2.zza(r4)     // Catch: java.lang.Exception -> La6
            goto L13
        L77:
            boolean r2 = r0 instanceof com.google.android.play.core.assetpacks.zzef     // Catch: java.lang.Exception -> La6
            if (r2 == 0) goto L84
            com.google.android.play.core.assetpacks.zzeg r2 = r7.zzg     // Catch: java.lang.Exception -> La6
            r4 = r0
            com.google.android.play.core.assetpacks.zzef r4 = (com.google.android.play.core.assetpacks.zzef) r4     // Catch: java.lang.Exception -> La6
            r2.zza(r4)     // Catch: java.lang.Exception -> La6
            goto L13
        L84:
            boolean r2 = r0 instanceof com.google.android.play.core.assetpacks.zzei     // Catch: java.lang.Exception -> La6
            if (r2 == 0) goto L91
            com.google.android.play.core.assetpacks.zzek r2 = r7.zzh     // Catch: java.lang.Exception -> La6
            r4 = r0
            com.google.android.play.core.assetpacks.zzei r4 = (com.google.android.play.core.assetpacks.zzei) r4     // Catch: java.lang.Exception -> La6
            r2.zza(r4)     // Catch: java.lang.Exception -> La6
            goto L13
        L91:
            com.google.android.play.core.internal.zzag r2 = com.google.android.play.core.assetpacks.zzcl.zza     // Catch: java.lang.Exception -> La6
            java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch: java.lang.Exception -> La6
            java.lang.Class r5 = r0.getClass()     // Catch: java.lang.Exception -> La6
            java.lang.String r5 = r5.getName()     // Catch: java.lang.Exception -> La6
            r4[r1] = r5     // Catch: java.lang.Exception -> La6
            java.lang.String r5 = "Unknown task type: %s"
            r2.zzb(r5, r4)     // Catch: java.lang.Exception -> La6
            goto L13
        La6:
            r2 = move-exception
            com.google.android.play.core.internal.zzag r4 = com.google.android.play.core.assetpacks.zzcl.zza
            java.lang.Object[] r5 = new java.lang.Object[r3]
            java.lang.String r6 = r2.getMessage()
            r5[r1] = r6
            java.lang.String r6 = "Error during extraction task: %s"
            r4.zzb(r6, r5)
            com.google.android.play.core.internal.zzco r4 = r7.zzi
            java.lang.Object r4 = r4.zza()
            com.google.android.play.core.assetpacks.zzy r4 = (com.google.android.play.core.assetpacks.zzy) r4
            int r5 = r0.zzk
            r4.zzi(r5)
            int r0 = r0.zzk
            r7.zzb(r0, r2)
            goto L13
        Lca:
            java.util.concurrent.atomic.AtomicBoolean r0 = r7.zzk
            r0.set(r1)
            return
        Ld0:
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = "runLoop already looping; return"
            r0.zze(r2, r1)
            return
    }
}
