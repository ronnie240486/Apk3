package com.google.android.play.core.assetpacks;

/* JADX INFO: compiled from: com.google.android.play:core@@1.10.3 */
/* JADX INFO: loaded from: classes.dex */
final class zzdh {
    private static final com.google.android.play.core.internal.zzag zza = null;
    private final com.google.android.play.core.assetpacks.zzde zzb;
    private final com.google.android.play.core.assetpacks.zzbh zzc;
    private final com.google.android.play.core.assetpacks.zzbu zzd;
    private final com.google.android.play.core.common.zza zze;

    static {
            com.google.android.play.core.internal.zzag r0 = new com.google.android.play.core.internal.zzag
            java.lang.String r1 = "ExtractorTaskFinder"
            r0.<init>(r1)
            com.google.android.play.core.assetpacks.zzdh.zza = r0
            return
    }

    public zzdh(com.google.android.play.core.assetpacks.zzde r1, com.google.android.play.core.assetpacks.zzbh r2, com.google.android.play.core.assetpacks.zzbu r3, com.google.android.play.core.common.zza r4) {
            r0 = this;
            r0.<init>()
            r0.zzb = r1
            r0.zzc = r2
            r0.zzd = r3
            r0.zze = r4
            return
    }

    private final boolean zzb(com.google.android.play.core.assetpacks.zzdb r9, com.google.android.play.core.assetpacks.zzdc r10) {
            r8 = this;
            com.google.android.play.core.assetpacks.zzen r7 = new com.google.android.play.core.assetpacks.zzen
            com.google.android.play.core.assetpacks.zzbh r1 = r8.zzc
            com.google.android.play.core.assetpacks.zzda r0 = r9.zzc
            java.lang.String r2 = r0.zza
            int r3 = r9.zzb
            long r4 = r0.zzb
            java.lang.String r6 = r10.zza
            r0 = r7
            r0.<init>(r1, r2, r3, r4, r6)
            boolean r9 = r7.zzm()
            return r9
    }

    private static boolean zzc(com.google.android.play.core.assetpacks.zzdc r2) {
            int r2 = r2.zzf
            r0 = 1
            if (r2 == r0) goto Lb
            r1 = 2
            if (r2 != r1) goto L9
            goto Lb
        L9:
            r2 = 0
            return r2
        Lb:
            return r0
    }

    @androidx.annotation.Nullable
    public final com.google.android.play.core.assetpacks.zzdg zza() {
            r34 = this;
            r1 = r34
            com.google.android.play.core.assetpacks.zzde r0 = r1.zzb     // Catch: java.lang.Throwable -> L3ff
            r0.zzj()     // Catch: java.lang.Throwable -> L3ff
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L3ff
            r2.<init>()     // Catch: java.lang.Throwable -> L3ff
            com.google.android.play.core.assetpacks.zzde r0 = r1.zzb     // Catch: java.lang.Throwable -> L3ff
            java.util.Map r0 = r0.zzg()     // Catch: java.lang.Throwable -> L3ff
            java.util.Collection r0 = r0.values()     // Catch: java.lang.Throwable -> L3ff
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L3ff
        L1a:
            boolean r3 = r0.hasNext()     // Catch: java.lang.Throwable -> L3ff
            if (r3 == 0) goto L34
            java.lang.Object r3 = r0.next()     // Catch: java.lang.Throwable -> L3ff
            com.google.android.play.core.assetpacks.zzdb r3 = (com.google.android.play.core.assetpacks.zzdb) r3     // Catch: java.lang.Throwable -> L3ff
            com.google.android.play.core.assetpacks.zzda r4 = r3.zzc     // Catch: java.lang.Throwable -> L3ff
            int r4 = r4.zzd     // Catch: java.lang.Throwable -> L3ff
            boolean r4 = com.google.android.play.core.assetpacks.zzbg.zzb(r4)     // Catch: java.lang.Throwable -> L3ff
            if (r4 == 0) goto L1a
            r2.add(r3)     // Catch: java.lang.Throwable -> L3ff
            goto L1a
        L34:
            boolean r0 = r2.isEmpty()     // Catch: java.lang.Throwable -> L3ff
            if (r0 == 0) goto L3f
            com.google.android.play.core.assetpacks.zzde r0 = r1.zzb
            r3 = 0
            goto L3f5
        L3f:
            com.google.android.play.core.common.zza r0 = r1.zze     // Catch: java.lang.Throwable -> L3ff
            java.lang.String r4 = "assetOnlyUpdates"
            boolean r0 = r0.zza(r4)     // Catch: java.lang.Throwable -> L3ff
            r4 = 0
            r5 = 1
            r6 = 2
            if (r0 == 0) goto Lb1
            com.google.android.play.core.assetpacks.zzbh r0 = r1.zzc     // Catch: java.lang.Throwable -> L3ff
            java.util.Map r0 = r0.zzt()     // Catch: java.lang.Throwable -> L3ff
            java.util.Iterator r7 = r2.iterator()     // Catch: java.lang.Throwable -> L3ff
        L56:
            boolean r8 = r7.hasNext()     // Catch: java.lang.Throwable -> L3ff
            if (r8 == 0) goto Lae
            java.lang.Object r8 = r7.next()     // Catch: java.lang.Throwable -> L3ff
            com.google.android.play.core.assetpacks.zzdb r8 = (com.google.android.play.core.assetpacks.zzdb) r8     // Catch: java.lang.Throwable -> L3ff
            com.google.android.play.core.assetpacks.zzda r9 = r8.zzc     // Catch: java.lang.Throwable -> L3ff
            java.lang.String r9 = r9.zza     // Catch: java.lang.Throwable -> L3ff
            r10 = r0
            java.util.HashMap r10 = (java.util.HashMap) r10     // Catch: java.lang.Throwable -> L3ff
            java.lang.Object r9 = r10.get(r9)     // Catch: java.lang.Throwable -> L3ff
            java.lang.Long r9 = (java.lang.Long) r9     // Catch: java.lang.Throwable -> L3ff
            if (r9 == 0) goto L56
            com.google.android.play.core.assetpacks.zzda r10 = r8.zzc     // Catch: java.lang.Throwable -> L3ff
            long r10 = r10.zzb     // Catch: java.lang.Throwable -> L3ff
            long r12 = r9.longValue()     // Catch: java.lang.Throwable -> L3ff
            int r9 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r9 != 0) goto L56
            com.google.android.play.core.internal.zzag r0 = com.google.android.play.core.assetpacks.zzdh.zza     // Catch: java.lang.Throwable -> L3ff
            java.lang.Object[] r7 = new java.lang.Object[r6]     // Catch: java.lang.Throwable -> L3ff
            int r9 = r8.zza     // Catch: java.lang.Throwable -> L3ff
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> L3ff
            r7[r4] = r9     // Catch: java.lang.Throwable -> L3ff
            com.google.android.play.core.assetpacks.zzda r9 = r8.zzc     // Catch: java.lang.Throwable -> L3ff
            java.lang.String r9 = r9.zza     // Catch: java.lang.Throwable -> L3ff
            r7[r5] = r9     // Catch: java.lang.Throwable -> L3ff
            java.lang.String r9 = "Found promote pack task for session %s with pack %s."
            r0.zza(r9, r7)     // Catch: java.lang.Throwable -> L3ff
            com.google.android.play.core.assetpacks.zzei r0 = new com.google.android.play.core.assetpacks.zzei     // Catch: java.lang.Throwable -> L3ff
            int r11 = r8.zza     // Catch: java.lang.Throwable -> L3ff
            com.google.android.play.core.assetpacks.zzda r7 = r8.zzc     // Catch: java.lang.Throwable -> L3ff
            java.lang.String r12 = r7.zza     // Catch: java.lang.Throwable -> L3ff
            com.google.android.play.core.assetpacks.zzbh r7 = r1.zzc     // Catch: java.lang.Throwable -> L3ff
            int r13 = r7.zza(r12)     // Catch: java.lang.Throwable -> L3ff
            int r14 = r8.zzb     // Catch: java.lang.Throwable -> L3ff
            com.google.android.play.core.assetpacks.zzda r7 = r8.zzc     // Catch: java.lang.Throwable -> L3ff
            long r7 = r7.zzb     // Catch: java.lang.Throwable -> L3ff
            r10 = r0
            r15 = r7
            r10.<init>(r11, r12, r13, r14, r15)     // Catch: java.lang.Throwable -> L3ff
            goto Laf
        Lae:
            r0 = 0
        Laf:
            if (r0 != 0) goto L3f9
        Lb1:
            java.util.Iterator r0 = r2.iterator()     // Catch: java.lang.Throwable -> L3ff
        Lb5:
            boolean r7 = r0.hasNext()     // Catch: java.lang.Throwable -> L3ff
            if (r7 == 0) goto L124
            java.lang.Object r7 = r0.next()     // Catch: java.lang.Throwable -> L3ff
            com.google.android.play.core.assetpacks.zzdb r7 = (com.google.android.play.core.assetpacks.zzdb) r7     // Catch: java.lang.Throwable -> L3ff
            com.google.android.play.core.assetpacks.zzbh r8 = r1.zzc     // Catch: java.io.IOException -> L105 java.lang.Throwable -> L3ff
            com.google.android.play.core.assetpacks.zzda r9 = r7.zzc     // Catch: java.io.IOException -> L105 java.lang.Throwable -> L3ff
            java.lang.String r10 = r9.zza     // Catch: java.io.IOException -> L105 java.lang.Throwable -> L3ff
            int r11 = r7.zzb     // Catch: java.io.IOException -> L105 java.lang.Throwable -> L3ff
            long r12 = r9.zzb     // Catch: java.io.IOException -> L105 java.lang.Throwable -> L3ff
            int r8 = r8.zzb(r10, r11, r12)     // Catch: java.io.IOException -> L105 java.lang.Throwable -> L3ff
            com.google.android.play.core.assetpacks.zzda r9 = r7.zzc     // Catch: java.io.IOException -> L105 java.lang.Throwable -> L3ff
            java.util.List r9 = r9.zzf     // Catch: java.io.IOException -> L105 java.lang.Throwable -> L3ff
            int r9 = r9.size()     // Catch: java.io.IOException -> L105 java.lang.Throwable -> L3ff
            if (r8 != r9) goto Lb5
            com.google.android.play.core.internal.zzag r0 = com.google.android.play.core.assetpacks.zzdh.zza     // Catch: java.lang.Throwable -> L3ff
            java.lang.Object[] r8 = new java.lang.Object[r6]     // Catch: java.lang.Throwable -> L3ff
            int r9 = r7.zza     // Catch: java.lang.Throwable -> L3ff
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> L3ff
            r8[r4] = r9     // Catch: java.lang.Throwable -> L3ff
            com.google.android.play.core.assetpacks.zzda r9 = r7.zzc     // Catch: java.lang.Throwable -> L3ff
            java.lang.String r9 = r9.zza     // Catch: java.lang.Throwable -> L3ff
            r8[r5] = r9     // Catch: java.lang.Throwable -> L3ff
            java.lang.String r9 = "Found final move task for session %s with pack %s."
            r0.zza(r9, r8)     // Catch: java.lang.Throwable -> L3ff
            com.google.android.play.core.assetpacks.zzdw r0 = new com.google.android.play.core.assetpacks.zzdw     // Catch: java.lang.Throwable -> L3ff
            int r11 = r7.zza     // Catch: java.lang.Throwable -> L3ff
            com.google.android.play.core.assetpacks.zzda r8 = r7.zzc     // Catch: java.lang.Throwable -> L3ff
            java.lang.String r12 = r8.zza     // Catch: java.lang.Throwable -> L3ff
            int r13 = r7.zzb     // Catch: java.lang.Throwable -> L3ff
            long r14 = r8.zzb     // Catch: java.lang.Throwable -> L3ff
            java.lang.String r7 = r8.zzc     // Catch: java.lang.Throwable -> L3ff
            r10 = r0
            r16 = r7
            r10.<init>(r11, r12, r13, r14, r16)     // Catch: java.lang.Throwable -> L3ff
            goto L125
        L105:
            r0 = move-exception
            com.google.android.play.core.assetpacks.zzck r2 = new com.google.android.play.core.assetpacks.zzck     // Catch: java.lang.Throwable -> L3ff
            java.lang.Object[] r3 = new java.lang.Object[r6]     // Catch: java.lang.Throwable -> L3ff
            int r6 = r7.zza     // Catch: java.lang.Throwable -> L3ff
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Throwable -> L3ff
            r3[r4] = r6     // Catch: java.lang.Throwable -> L3ff
            com.google.android.play.core.assetpacks.zzda r4 = r7.zzc     // Catch: java.lang.Throwable -> L3ff
            java.lang.String r4 = r4.zza     // Catch: java.lang.Throwable -> L3ff
            r3[r5] = r4     // Catch: java.lang.Throwable -> L3ff
            java.lang.String r4 = "Failed to check number of completed merges for session %s, pack %s"
            java.lang.String r3 = java.lang.String.format(r4, r3)     // Catch: java.lang.Throwable -> L3ff
            int r4 = r7.zza     // Catch: java.lang.Throwable -> L3ff
            r2.<init>(r3, r0, r4)     // Catch: java.lang.Throwable -> L3ff
            throw r2     // Catch: java.lang.Throwable -> L3ff
        L124:
            r0 = 0
        L125:
            if (r0 != 0) goto L3f9
            java.util.Iterator r0 = r2.iterator()     // Catch: java.lang.Throwable -> L3ff
        L12b:
            boolean r7 = r0.hasNext()     // Catch: java.lang.Throwable -> L3ff
            r8 = 3
            if (r7 == 0) goto L1ad
            java.lang.Object r7 = r0.next()     // Catch: java.lang.Throwable -> L3ff
            com.google.android.play.core.assetpacks.zzdb r7 = (com.google.android.play.core.assetpacks.zzdb) r7     // Catch: java.lang.Throwable -> L3ff
            com.google.android.play.core.assetpacks.zzda r9 = r7.zzc     // Catch: java.lang.Throwable -> L3ff
            int r10 = r9.zzd     // Catch: java.lang.Throwable -> L3ff
            boolean r10 = com.google.android.play.core.assetpacks.zzbg.zzb(r10)     // Catch: java.lang.Throwable -> L3ff
            if (r10 == 0) goto L12b
            java.util.List r9 = r9.zzf     // Catch: java.lang.Throwable -> L3ff
            java.util.Iterator r9 = r9.iterator()     // Catch: java.lang.Throwable -> L3ff
        L148:
            boolean r10 = r9.hasNext()     // Catch: java.lang.Throwable -> L3ff
            if (r10 == 0) goto L12b
            java.lang.Object r10 = r9.next()     // Catch: java.lang.Throwable -> L3ff
            com.google.android.play.core.assetpacks.zzdc r10 = (com.google.android.play.core.assetpacks.zzdc) r10     // Catch: java.lang.Throwable -> L3ff
            com.google.android.play.core.assetpacks.zzbh r11 = r1.zzc     // Catch: java.lang.Throwable -> L3ff
            com.google.android.play.core.assetpacks.zzda r12 = r7.zzc     // Catch: java.lang.Throwable -> L3ff
            java.lang.String r13 = r12.zza     // Catch: java.lang.Throwable -> L3ff
            int r14 = r7.zzb     // Catch: java.lang.Throwable -> L3ff
            long r5 = r12.zzb     // Catch: java.lang.Throwable -> L3ff
            java.lang.String r15 = r10.zza     // Catch: java.lang.Throwable -> L3ff
            r12 = r13
            r13 = r14
            r16 = r15
            r14 = r5
            java.io.File r5 = r11.zzq(r12, r13, r14, r16)     // Catch: java.lang.Throwable -> L3ff
            boolean r5 = r5.exists()     // Catch: java.lang.Throwable -> L3ff
            if (r5 == 0) goto L1aa
            com.google.android.play.core.internal.zzag r0 = com.google.android.play.core.assetpacks.zzdh.zza     // Catch: java.lang.Throwable -> L3ff
            java.lang.Object[] r5 = new java.lang.Object[r8]     // Catch: java.lang.Throwable -> L3ff
            int r6 = r7.zza     // Catch: java.lang.Throwable -> L3ff
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Throwable -> L3ff
            r5[r4] = r6     // Catch: java.lang.Throwable -> L3ff
            com.google.android.play.core.assetpacks.zzda r6 = r7.zzc     // Catch: java.lang.Throwable -> L3ff
            java.lang.String r6 = r6.zza     // Catch: java.lang.Throwable -> L3ff
            r9 = 1
            r5[r9] = r6     // Catch: java.lang.Throwable -> L3ff
            java.lang.String r6 = r10.zza     // Catch: java.lang.Throwable -> L3ff
            r9 = 2
            r5[r9] = r6     // Catch: java.lang.Throwable -> L3ff
            java.lang.String r6 = "Found merge task for session %s with pack %s and slice %s."
            r0.zza(r6, r5)     // Catch: java.lang.Throwable -> L3ff
            com.google.android.play.core.assetpacks.zzdt r0 = new com.google.android.play.core.assetpacks.zzdt     // Catch: java.lang.Throwable -> L3ff
            int r5 = r7.zza     // Catch: java.lang.Throwable -> L3ff
            com.google.android.play.core.assetpacks.zzda r6 = r7.zzc     // Catch: java.lang.Throwable -> L3ff
            java.lang.String r9 = r6.zza     // Catch: java.lang.Throwable -> L3ff
            int r7 = r7.zzb     // Catch: java.lang.Throwable -> L3ff
            long r11 = r6.zzb     // Catch: java.lang.Throwable -> L3ff
            java.lang.String r6 = r10.zza     // Catch: java.lang.Throwable -> L3ff
            r19 = r0
            r20 = r5
            r21 = r9
            r22 = r7
            r23 = r11
            r25 = r6
            r19.<init>(r20, r21, r22, r23, r25)     // Catch: java.lang.Throwable -> L3ff
            goto L1ae
        L1aa:
            r5 = 1
            r6 = 2
            goto L148
        L1ad:
            r0 = 0
        L1ae:
            if (r0 != 0) goto L3f9
            java.util.Iterator r0 = r2.iterator()     // Catch: java.lang.Throwable -> L3ff
        L1b4:
            boolean r5 = r0.hasNext()     // Catch: java.lang.Throwable -> L3ff
            if (r5 == 0) goto L237
            java.lang.Object r5 = r0.next()     // Catch: java.lang.Throwable -> L3ff
            com.google.android.play.core.assetpacks.zzdb r5 = (com.google.android.play.core.assetpacks.zzdb) r5     // Catch: java.lang.Throwable -> L3ff
            com.google.android.play.core.assetpacks.zzda r6 = r5.zzc     // Catch: java.lang.Throwable -> L3ff
            int r7 = r6.zzd     // Catch: java.lang.Throwable -> L3ff
            boolean r7 = com.google.android.play.core.assetpacks.zzbg.zzb(r7)     // Catch: java.lang.Throwable -> L3ff
            if (r7 == 0) goto L1b4
            java.util.List r6 = r6.zzf     // Catch: java.lang.Throwable -> L3ff
            java.util.Iterator r6 = r6.iterator()     // Catch: java.lang.Throwable -> L3ff
        L1d0:
            boolean r7 = r6.hasNext()     // Catch: java.lang.Throwable -> L3ff
            if (r7 == 0) goto L1b4
            java.lang.Object r7 = r6.next()     // Catch: java.lang.Throwable -> L3ff
            com.google.android.play.core.assetpacks.zzdc r7 = (com.google.android.play.core.assetpacks.zzdc) r7     // Catch: java.lang.Throwable -> L3ff
            boolean r9 = r1.zzb(r5, r7)     // Catch: java.lang.Throwable -> L3ff
            if (r9 == 0) goto L1d0
            com.google.android.play.core.assetpacks.zzbh r10 = r1.zzc     // Catch: java.lang.Throwable -> L3ff
            com.google.android.play.core.assetpacks.zzda r9 = r5.zzc     // Catch: java.lang.Throwable -> L3ff
            java.lang.String r11 = r9.zza     // Catch: java.lang.Throwable -> L3ff
            int r12 = r5.zzb     // Catch: java.lang.Throwable -> L3ff
            long r13 = r9.zzb     // Catch: java.lang.Throwable -> L3ff
            java.lang.String r15 = r7.zza     // Catch: java.lang.Throwable -> L3ff
            java.io.File r9 = r10.zzp(r11, r12, r13, r15)     // Catch: java.lang.Throwable -> L3ff
            boolean r9 = r9.exists()     // Catch: java.lang.Throwable -> L3ff
            if (r9 == 0) goto L1d0
            com.google.android.play.core.internal.zzag r0 = com.google.android.play.core.assetpacks.zzdh.zza     // Catch: java.lang.Throwable -> L3ff
            java.lang.Object[] r6 = new java.lang.Object[r8]     // Catch: java.lang.Throwable -> L3ff
            int r9 = r5.zza     // Catch: java.lang.Throwable -> L3ff
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> L3ff
            r6[r4] = r9     // Catch: java.lang.Throwable -> L3ff
            com.google.android.play.core.assetpacks.zzda r9 = r5.zzc     // Catch: java.lang.Throwable -> L3ff
            java.lang.String r9 = r9.zza     // Catch: java.lang.Throwable -> L3ff
            r10 = 1
            r6[r10] = r9     // Catch: java.lang.Throwable -> L3ff
            java.lang.String r9 = r7.zza     // Catch: java.lang.Throwable -> L3ff
            r10 = 2
            r6[r10] = r9     // Catch: java.lang.Throwable -> L3ff
            java.lang.String r9 = "Found verify task for session %s with pack %s and slice %s."
            r0.zza(r9, r6)     // Catch: java.lang.Throwable -> L3ff
            com.google.android.play.core.assetpacks.zzeq r0 = new com.google.android.play.core.assetpacks.zzeq     // Catch: java.lang.Throwable -> L3ff
            int r6 = r5.zza     // Catch: java.lang.Throwable -> L3ff
            com.google.android.play.core.assetpacks.zzda r9 = r5.zzc     // Catch: java.lang.Throwable -> L3ff
            java.lang.String r10 = r9.zza     // Catch: java.lang.Throwable -> L3ff
            int r5 = r5.zzb     // Catch: java.lang.Throwable -> L3ff
            long r11 = r9.zzb     // Catch: java.lang.Throwable -> L3ff
            java.lang.String r9 = r7.zza     // Catch: java.lang.Throwable -> L3ff
            java.lang.String r7 = r7.zzb     // Catch: java.lang.Throwable -> L3ff
            r19 = r0
            r20 = r6
            r21 = r10
            r22 = r5
            r23 = r11
            r25 = r9
            r26 = r7
            r19.<init>(r20, r21, r22, r23, r25, r26)     // Catch: java.lang.Throwable -> L3ff
            goto L238
        L237:
            r0 = 0
        L238:
            if (r0 != 0) goto L3f9
            java.util.Iterator r5 = r2.iterator()     // Catch: java.lang.Throwable -> L3ff
        L23e:
            boolean r0 = r5.hasNext()     // Catch: java.lang.Throwable -> L3ff
            r6 = 4
            if (r0 == 0) goto L32e
            java.lang.Object r0 = r5.next()     // Catch: java.lang.Throwable -> L3ff
            r7 = r0
            com.google.android.play.core.assetpacks.zzdb r7 = (com.google.android.play.core.assetpacks.zzdb) r7     // Catch: java.lang.Throwable -> L3ff
            com.google.android.play.core.assetpacks.zzda r0 = r7.zzc     // Catch: java.lang.Throwable -> L3ff
            int r9 = r0.zzd     // Catch: java.lang.Throwable -> L3ff
            boolean r9 = com.google.android.play.core.assetpacks.zzbg.zzb(r9)     // Catch: java.lang.Throwable -> L3ff
            if (r9 == 0) goto L23e
            java.util.List r0 = r0.zzf     // Catch: java.lang.Throwable -> L3ff
            java.util.Iterator r9 = r0.iterator()     // Catch: java.lang.Throwable -> L3ff
        L25c:
            boolean r0 = r9.hasNext()     // Catch: java.lang.Throwable -> L3ff
            if (r0 == 0) goto L23e
            java.lang.Object r0 = r9.next()     // Catch: java.lang.Throwable -> L3ff
            r10 = r0
            com.google.android.play.core.assetpacks.zzdc r10 = (com.google.android.play.core.assetpacks.zzdc) r10     // Catch: java.lang.Throwable -> L3ff
            boolean r0 = zzc(r10)     // Catch: java.lang.Throwable -> L3ff
            if (r0 != 0) goto L25c
            com.google.android.play.core.assetpacks.zzen r0 = new com.google.android.play.core.assetpacks.zzen     // Catch: java.lang.Throwable -> L3ff
            com.google.android.play.core.assetpacks.zzbh r11 = r1.zzc     // Catch: java.lang.Throwable -> L3ff
            com.google.android.play.core.assetpacks.zzda r12 = r7.zzc     // Catch: java.lang.Throwable -> L3ff
            java.lang.String r13 = r12.zza     // Catch: java.lang.Throwable -> L3ff
            int r14 = r7.zzb     // Catch: java.lang.Throwable -> L3ff
            r16 = r9
            long r8 = r12.zzb     // Catch: java.lang.Throwable -> L3ff
            java.lang.String r12 = r10.zza     // Catch: java.lang.Throwable -> L3ff
            r19 = r0
            r20 = r11
            r21 = r13
            r22 = r14
            r23 = r8
            r25 = r12
            r19.<init>(r20, r21, r22, r23, r25)     // Catch: java.lang.Throwable -> L3ff
            int r0 = r0.zza()     // Catch: java.io.IOException -> L293 java.lang.Throwable -> L3ff
            goto L2a2
        L293:
            r0 = move-exception
            r8 = r0
            com.google.android.play.core.internal.zzag r0 = com.google.android.play.core.assetpacks.zzdh.zza     // Catch: java.lang.Throwable -> L3ff
            r9 = 1
            java.lang.Object[] r11 = new java.lang.Object[r9]     // Catch: java.lang.Throwable -> L3ff
            r11[r4] = r8     // Catch: java.lang.Throwable -> L3ff
            java.lang.String r8 = "Slice checkpoint corrupt, restarting extraction. %s"
            r0.zzb(r8, r11)     // Catch: java.lang.Throwable -> L3ff
            r0 = 0
        L2a2:
            r8 = -1
            if (r0 == r8) goto L328
            java.util.List r8 = r10.zzd     // Catch: java.lang.Throwable -> L3ff
            java.lang.Object r8 = r8.get(r0)     // Catch: java.lang.Throwable -> L3ff
            com.google.android.play.core.assetpacks.zzcz r8 = (com.google.android.play.core.assetpacks.zzcz) r8     // Catch: java.lang.Throwable -> L3ff
            boolean r8 = r8.zza     // Catch: java.lang.Throwable -> L3ff
            if (r8 == 0) goto L328
            com.google.android.play.core.internal.zzag r5 = com.google.android.play.core.assetpacks.zzdh.zza     // Catch: java.lang.Throwable -> L3ff
            r8 = 5
            java.lang.Object[] r8 = new java.lang.Object[r8]     // Catch: java.lang.Throwable -> L3ff
            int r9 = r10.zze     // Catch: java.lang.Throwable -> L3ff
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> L3ff
            r8[r4] = r9     // Catch: java.lang.Throwable -> L3ff
            int r9 = r7.zza     // Catch: java.lang.Throwable -> L3ff
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> L3ff
            r11 = 1
            r8[r11] = r9     // Catch: java.lang.Throwable -> L3ff
            com.google.android.play.core.assetpacks.zzda r9 = r7.zzc     // Catch: java.lang.Throwable -> L3ff
            java.lang.String r9 = r9.zza     // Catch: java.lang.Throwable -> L3ff
            r11 = 2
            r8[r11] = r9     // Catch: java.lang.Throwable -> L3ff
            java.lang.String r9 = r10.zza     // Catch: java.lang.Throwable -> L3ff
            r11 = 3
            r8[r11] = r9     // Catch: java.lang.Throwable -> L3ff
            java.lang.Integer r9 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L3ff
            r8[r6] = r9     // Catch: java.lang.Throwable -> L3ff
            java.lang.String r9 = "Found extraction task using compression format %s for session %s, pack %s, slice %s, chunk %s."
            r5.zza(r9, r8)     // Catch: java.lang.Throwable -> L3ff
            com.google.android.play.core.assetpacks.zzbu r5 = r1.zzd     // Catch: java.lang.Throwable -> L3ff
            int r8 = r7.zza     // Catch: java.lang.Throwable -> L3ff
            com.google.android.play.core.assetpacks.zzda r9 = r7.zzc     // Catch: java.lang.Throwable -> L3ff
            java.lang.String r9 = r9.zza     // Catch: java.lang.Throwable -> L3ff
            java.lang.String r11 = r10.zza     // Catch: java.lang.Throwable -> L3ff
            java.io.InputStream r33 = r5.zza(r8, r9, r11, r0)     // Catch: java.lang.Throwable -> L3ff
            com.google.android.play.core.assetpacks.zzce r5 = new com.google.android.play.core.assetpacks.zzce     // Catch: java.lang.Throwable -> L3ff
            int r8 = r7.zza     // Catch: java.lang.Throwable -> L3ff
            com.google.android.play.core.assetpacks.zzda r9 = r7.zzc     // Catch: java.lang.Throwable -> L3ff
            java.lang.String r11 = r9.zza     // Catch: java.lang.Throwable -> L3ff
            int r12 = r7.zzb     // Catch: java.lang.Throwable -> L3ff
            long r13 = r9.zzb     // Catch: java.lang.Throwable -> L3ff
            java.lang.String r9 = r9.zzc     // Catch: java.lang.Throwable -> L3ff
            java.lang.String r15 = r10.zza     // Catch: java.lang.Throwable -> L3ff
            int r3 = r10.zze     // Catch: java.lang.Throwable -> L3ff
            java.util.List r10 = r10.zzd     // Catch: java.lang.Throwable -> L3ff
            int r29 = r10.size()     // Catch: java.lang.Throwable -> L3ff
            com.google.android.play.core.assetpacks.zzda r7 = r7.zzc     // Catch: java.lang.Throwable -> L3ff
            r16 = r5
            long r4 = r7.zze     // Catch: java.lang.Throwable -> L3ff
            int r7 = r7.zzd     // Catch: java.lang.Throwable -> L3ff
            r19 = r16
            r20 = r8
            r21 = r11
            r22 = r12
            r23 = r13
            r25 = r9
            r26 = r15
            r27 = r3
            r28 = r0
            r30 = r4
            r32 = r7
            r19.<init>(r20, r21, r22, r23, r25, r26, r27, r28, r29, r30, r32, r33)     // Catch: java.lang.Throwable -> L3ff
            r5 = r16
            goto L32f
        L328:
            r9 = r16
            r4 = 0
            r8 = 3
            goto L25c
        L32e:
            r5 = 0
        L32f:
            if (r5 != 0) goto L3f2
            java.util.Iterator r0 = r2.iterator()     // Catch: java.lang.Throwable -> L3ff
        L335:
            boolean r2 = r0.hasNext()     // Catch: java.lang.Throwable -> L3ff
            if (r2 == 0) goto L3e5
            java.lang.Object r2 = r0.next()     // Catch: java.lang.Throwable -> L3ff
            com.google.android.play.core.assetpacks.zzdb r2 = (com.google.android.play.core.assetpacks.zzdb) r2     // Catch: java.lang.Throwable -> L3ff
            com.google.android.play.core.assetpacks.zzda r3 = r2.zzc     // Catch: java.lang.Throwable -> L3ff
            int r4 = r3.zzd     // Catch: java.lang.Throwable -> L3ff
            boolean r4 = com.google.android.play.core.assetpacks.zzbg.zzb(r4)     // Catch: java.lang.Throwable -> L3ff
            if (r4 == 0) goto L3e2
            java.util.List r3 = r3.zzf     // Catch: java.lang.Throwable -> L3ff
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L3ff
        L351:
            boolean r4 = r3.hasNext()     // Catch: java.lang.Throwable -> L3ff
            if (r4 == 0) goto L3e2
            java.lang.Object r4 = r3.next()     // Catch: java.lang.Throwable -> L3ff
            com.google.android.play.core.assetpacks.zzdc r4 = (com.google.android.play.core.assetpacks.zzdc) r4     // Catch: java.lang.Throwable -> L3ff
            boolean r5 = zzc(r4)     // Catch: java.lang.Throwable -> L3ff
            if (r5 == 0) goto L3df
            java.util.List r5 = r4.zzd     // Catch: java.lang.Throwable -> L3ff
            r7 = 0
            java.lang.Object r5 = r5.get(r7)     // Catch: java.lang.Throwable -> L3ff
            com.google.android.play.core.assetpacks.zzcz r5 = (com.google.android.play.core.assetpacks.zzcz) r5     // Catch: java.lang.Throwable -> L3ff
            boolean r5 = r5.zza     // Catch: java.lang.Throwable -> L3ff
            if (r5 == 0) goto L3df
            boolean r5 = r1.zzb(r2, r4)     // Catch: java.lang.Throwable -> L3ff
            if (r5 != 0) goto L3df
            com.google.android.play.core.internal.zzag r0 = com.google.android.play.core.assetpacks.zzdh.zza     // Catch: java.lang.Throwable -> L3ff
            java.lang.Object[] r3 = new java.lang.Object[r6]     // Catch: java.lang.Throwable -> L3ff
            int r5 = r4.zzf     // Catch: java.lang.Throwable -> L3ff
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Throwable -> L3ff
            r6 = 0
            r3[r6] = r5     // Catch: java.lang.Throwable -> L3ff
            int r5 = r2.zza     // Catch: java.lang.Throwable -> L3ff
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Throwable -> L3ff
            r7 = 1
            r3[r7] = r5     // Catch: java.lang.Throwable -> L3ff
            com.google.android.play.core.assetpacks.zzda r5 = r2.zzc     // Catch: java.lang.Throwable -> L3ff
            java.lang.String r5 = r5.zza     // Catch: java.lang.Throwable -> L3ff
            r8 = 2
            r3[r8] = r5     // Catch: java.lang.Throwable -> L3ff
            java.lang.String r5 = r4.zza     // Catch: java.lang.Throwable -> L3ff
            r9 = 3
            r3[r9] = r5     // Catch: java.lang.Throwable -> L3ff
            java.lang.String r5 = "Found patch slice task using patch format %s for session %s, pack %s, slice %s."
            r0.zza(r5, r3)     // Catch: java.lang.Throwable -> L3ff
            com.google.android.play.core.assetpacks.zzbu r0 = r1.zzd     // Catch: java.lang.Throwable -> L3ff
            int r3 = r2.zza     // Catch: java.lang.Throwable -> L3ff
            com.google.android.play.core.assetpacks.zzda r5 = r2.zzc     // Catch: java.lang.Throwable -> L3ff
            java.lang.String r5 = r5.zza     // Catch: java.lang.Throwable -> L3ff
            java.lang.String r6 = r4.zza     // Catch: java.lang.Throwable -> L3ff
            r10 = 0
            java.io.InputStream r24 = r0.zza(r3, r5, r6, r10)     // Catch: java.lang.Throwable -> L3ff
            com.google.android.play.core.assetpacks.zzef r0 = new com.google.android.play.core.assetpacks.zzef     // Catch: java.lang.Throwable -> L3ff
            int r12 = r2.zza     // Catch: java.lang.Throwable -> L3ff
            com.google.android.play.core.assetpacks.zzda r3 = r2.zzc     // Catch: java.lang.Throwable -> L3ff
            java.lang.String r13 = r3.zza     // Catch: java.lang.Throwable -> L3ff
            com.google.android.play.core.assetpacks.zzbh r3 = r1.zzc     // Catch: java.lang.Throwable -> L3ff
            int r14 = r3.zza(r13)     // Catch: java.lang.Throwable -> L3ff
            com.google.android.play.core.assetpacks.zzbh r3 = r1.zzc     // Catch: java.lang.Throwable -> L3ff
            com.google.android.play.core.assetpacks.zzda r5 = r2.zzc     // Catch: java.lang.Throwable -> L3ff
            java.lang.String r5 = r5.zza     // Catch: java.lang.Throwable -> L3ff
            long r15 = r3.zzc(r5)     // Catch: java.lang.Throwable -> L3ff
            int r3 = r2.zzb     // Catch: java.lang.Throwable -> L3ff
            com.google.android.play.core.assetpacks.zzda r2 = r2.zzc     // Catch: java.lang.Throwable -> L3ff
            long r5 = r2.zzb     // Catch: java.lang.Throwable -> L3ff
            int r2 = r4.zzf     // Catch: java.lang.Throwable -> L3ff
            java.lang.String r7 = r4.zza     // Catch: java.lang.Throwable -> L3ff
            long r8 = r4.zzc     // Catch: java.lang.Throwable -> L3ff
            r11 = r0
            r17 = r3
            r18 = r5
            r20 = r2
            r21 = r7
            r22 = r8
            r11.<init>(r12, r13, r14, r15, r17, r18, r20, r21, r22, r24)     // Catch: java.lang.Throwable -> L3ff
            goto L3e6
        L3df:
            r10 = 0
            goto L351
        L3e2:
            r10 = 0
            goto L335
        L3e5:
            r0 = 0
        L3e6:
            if (r0 == 0) goto L3eb
            com.google.android.play.core.assetpacks.zzde r2 = r1.zzb
            goto L3fb
        L3eb:
            com.google.android.play.core.assetpacks.zzde r0 = r1.zzb
            r0.zzl()
            r2 = 0
            return r2
        L3f2:
            com.google.android.play.core.assetpacks.zzde r0 = r1.zzb
            r3 = r5
        L3f5:
            r0.zzl()
            return r3
        L3f9:
            com.google.android.play.core.assetpacks.zzde r2 = r1.zzb
        L3fb:
            r2.zzl()
            return r0
        L3ff:
            r0 = move-exception
            com.google.android.play.core.assetpacks.zzde r2 = r1.zzb
            r2.zzl()
            throw r0
    }
}
