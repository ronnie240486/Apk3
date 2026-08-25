package com.google.android.play.core.assetpacks;

/* JADX INFO: compiled from: com.google.android.play:core@@1.10.3 */
/* JADX INFO: loaded from: classes.dex */
final class zzcf {
    private static final com.google.android.play.core.internal.zzag zza = null;
    private final byte[] zzb;
    private final com.google.android.play.core.assetpacks.zzbh zzc;
    private final com.google.android.play.core.internal.zzco zzd;
    private final com.google.android.play.core.internal.zzco zze;
    private final com.google.android.play.core.assetpacks.zzco zzf;
    private final com.google.android.play.core.assetpacks.zzeb zzg;

    static {
            com.google.android.play.core.internal.zzag r0 = new com.google.android.play.core.internal.zzag
            java.lang.String r1 = "ExtractChunkTaskHandler"
            r0.<init>(r1)
            com.google.android.play.core.assetpacks.zzcf.zza = r0
            return
    }

    public zzcf(com.google.android.play.core.assetpacks.zzbh r2, com.google.android.play.core.internal.zzco r3, com.google.android.play.core.internal.zzco r4, com.google.android.play.core.assetpacks.zzco r5, com.google.android.play.core.assetpacks.zzeb r6) {
            r1 = this;
            r1.<init>()
            r0 = 8192(0x2000, float:1.148E-41)
            byte[] r0 = new byte[r0]
            r1.zzb = r0
            r1.zzc = r2
            r1.zzd = r3
            r1.zze = r4
            r1.zzf = r5
            r1.zzg = r6
            return
    }

    private final java.io.File zzb(com.google.android.play.core.assetpacks.zzce r7) {
            r6 = this;
            com.google.android.play.core.assetpacks.zzbh r0 = r6.zzc
            java.lang.String r1 = r7.zzl
            int r2 = r7.zza
            long r3 = r7.zzb
            java.lang.String r5 = r7.zzd
            java.io.File r7 = r0.zzp(r1, r2, r3, r5)
            boolean r0 = r7.exists()
            if (r0 != 0) goto L17
            r7.mkdirs()
        L17:
            return r7
    }

    public final void zza(com.google.android.play.core.assetpacks.zzce r23) {
            r22 = this;
            r1 = r22
            r2 = r23
            com.google.android.play.core.assetpacks.zzen r0 = new com.google.android.play.core.assetpacks.zzen
            com.google.android.play.core.assetpacks.zzbh r10 = r1.zzc
            java.lang.String r11 = r2.zzl
            int r12 = r2.zza
            long r13 = r2.zzb
            java.lang.String r15 = r2.zzd
            r3 = r0
            r4 = r10
            r5 = r11
            r6 = r12
            r7 = r13
            r9 = r15
            r3.<init>(r4, r5, r6, r7, r9)
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            r8 = r15
            java.io.File r3 = r3.zzo(r4, r5, r6, r8)
            boolean r4 = r3.exists()
            if (r4 != 0) goto L2b
            r3.mkdirs()
        L2b:
            r11 = 3
            r12 = 2
            r13 = 1
            r14 = 0
            java.io.InputStream r3 = r2.zzj     // Catch: java.io.IOException -> L355
            int r4 = r2.zze     // Catch: java.io.IOException -> L355
            r15 = 8192(0x2000, float:1.148E-41)
            if (r4 == r13) goto L39
            r9 = r3
            goto L3f
        L39:
            java.util.zip.GZIPInputStream r4 = new java.util.zip.GZIPInputStream     // Catch: java.io.IOException -> L355
            r4.<init>(r3, r15)     // Catch: java.io.IOException -> L355
            r9 = r4
        L3f:
            int r3 = r2.zzf     // Catch: java.lang.Throwable -> L34f
            r16 = 0
            if (r3 <= 0) goto L18d
            com.google.android.play.core.assetpacks.zzem r3 = r0.zzb()     // Catch: java.lang.Throwable -> L34f
            int r4 = r3.zzb()     // Catch: java.lang.Throwable -> L34f
            int r5 = r2.zzf     // Catch: java.lang.Throwable -> L34f
            int r6 = r5 + (-1)
            if (r4 != r6) goto L16c
            int r4 = r3.zza()     // Catch: java.lang.Throwable -> L34f
            if (r4 == r13) goto Le5
            if (r4 == r12) goto L9c
            if (r4 != r11) goto L82
            com.google.android.play.core.internal.zzag r4 = com.google.android.play.core.assetpacks.zzcf.zza     // Catch: java.lang.Throwable -> L34f
            java.lang.String r5 = "Resuming central directory from last chunk."
            java.lang.Object[] r6 = new java.lang.Object[r14]     // Catch: java.lang.Throwable -> L34f
            r4.zza(r5, r6)     // Catch: java.lang.Throwable -> L34f
            long r3 = r3.zzc()     // Catch: java.lang.Throwable -> L34f
            r0.zzd(r9, r3)     // Catch: java.lang.Throwable -> L34f
            boolean r3 = r23.zza()     // Catch: java.lang.Throwable -> L34f
            if (r3 == 0) goto L78
            r10 = r9
        L74:
            r9 = r16
            goto L18f
        L78:
            com.google.android.play.core.assetpacks.zzck r0 = new com.google.android.play.core.assetpacks.zzck     // Catch: java.lang.Throwable -> L34f
            java.lang.String r3 = "Chunk has ended twice during central directory. This should not be possible with chunk sizes of 50MB."
            int r4 = r2.zzk     // Catch: java.lang.Throwable -> L34f
            r0.<init>(r3, r4)     // Catch: java.lang.Throwable -> L34f
            throw r0     // Catch: java.lang.Throwable -> L34f
        L82:
            com.google.android.play.core.assetpacks.zzck r0 = new com.google.android.play.core.assetpacks.zzck     // Catch: java.lang.Throwable -> L34f
            java.lang.Object[] r4 = new java.lang.Object[r13]     // Catch: java.lang.Throwable -> L34f
            int r3 = r3.zza()     // Catch: java.lang.Throwable -> L34f
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L34f
            r4[r14] = r3     // Catch: java.lang.Throwable -> L34f
            java.lang.String r3 = "Slice checkpoint file corrupt. Unexpected FileExtractionStatus %s."
            java.lang.String r3 = java.lang.String.format(r3, r4)     // Catch: java.lang.Throwable -> L34f
            int r4 = r2.zzk     // Catch: java.lang.Throwable -> L34f
            r0.<init>(r3, r4)     // Catch: java.lang.Throwable -> L34f
            throw r0     // Catch: java.lang.Throwable -> L34f
        L9c:
            com.google.android.play.core.internal.zzag r3 = com.google.android.play.core.assetpacks.zzcf.zza     // Catch: java.lang.Throwable -> L34f
            java.lang.String r4 = "Resuming zip entry from last chunk during local file header."
            java.lang.Object[] r5 = new java.lang.Object[r14]     // Catch: java.lang.Throwable -> L34f
            r3.zza(r4, r5)     // Catch: java.lang.Throwable -> L34f
            com.google.android.play.core.assetpacks.zzbh r3 = r1.zzc     // Catch: java.lang.Throwable -> L34f
            java.lang.String r4 = r2.zzl     // Catch: java.lang.Throwable -> L34f
            int r5 = r2.zza     // Catch: java.lang.Throwable -> L34f
            long r6 = r2.zzb     // Catch: java.lang.Throwable -> L34f
            java.lang.String r8 = r2.zzd     // Catch: java.lang.Throwable -> L34f
            java.util.Objects.requireNonNull(r3)     // Catch: java.lang.Throwable -> L34f
            java.io.File r11 = new java.io.File     // Catch: java.lang.Throwable -> L34f
            r16 = r3
            r17 = r4
            r18 = r5
            r19 = r6
            r21 = r8
            java.io.File r3 = r16.zzo(r17, r18, r19, r21)     // Catch: java.lang.Throwable -> L34f
            java.lang.String r4 = "checkpoint_ext.dat"
            r11.<init>(r3, r4)     // Catch: java.lang.Throwable -> L34f
            boolean r3 = r11.exists()     // Catch: java.lang.Throwable -> L34f
            if (r3 == 0) goto Ldb
            java.io.SequenceInputStream r3 = new java.io.SequenceInputStream     // Catch: java.lang.Throwable -> L34f
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L34f
            r4.<init>(r11)     // Catch: java.lang.Throwable -> L34f
            r3.<init>(r4, r9)     // Catch: java.lang.Throwable -> L34f
            r10 = r9
            r9 = r3
            goto L18f
        Ldb:
            com.google.android.play.core.assetpacks.zzck r0 = new com.google.android.play.core.assetpacks.zzck     // Catch: java.lang.Throwable -> L34f
            java.lang.String r3 = "Checkpoint extension file not found."
            int r4 = r2.zzk     // Catch: java.lang.Throwable -> L34f
            r0.<init>(r3, r4)     // Catch: java.lang.Throwable -> L34f
            throw r0     // Catch: java.lang.Throwable -> L34f
        Le5:
            com.google.android.play.core.internal.zzag r4 = com.google.android.play.core.assetpacks.zzcf.zza     // Catch: java.lang.Throwable -> L34f
            java.lang.Object[] r5 = new java.lang.Object[r13]     // Catch: java.lang.Throwable -> L34f
            java.lang.String r6 = r3.zze()     // Catch: java.lang.Throwable -> L34f
            r5[r14] = r6     // Catch: java.lang.Throwable -> L34f
            java.lang.String r6 = "Resuming zip entry from last chunk during file %s."
            r4.zza(r6, r5)     // Catch: java.lang.Throwable -> L34f
            java.io.File r4 = new java.io.File     // Catch: java.lang.Throwable -> L34f
            java.lang.String r5 = r3.zze()     // Catch: java.lang.Throwable -> L34f
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L34f
            boolean r5 = r4.exists()     // Catch: java.lang.Throwable -> L34f
            if (r5 == 0) goto L161
            java.io.RandomAccessFile r5 = new java.io.RandomAccessFile     // Catch: java.lang.Throwable -> L34f
            java.lang.String r6 = "rw"
            r5.<init>(r4, r6)     // Catch: java.lang.Throwable -> L34f
            long r6 = r3.zzc()     // Catch: java.lang.Throwable -> L34f
            r5.seek(r6)     // Catch: java.lang.Throwable -> L34f
            long r6 = r3.zzd()     // Catch: java.lang.Throwable -> L34f
        L116:
            r10 = 8192(0x2000, double:4.0474E-320)
            long r10 = java.lang.Math.min(r6, r10)     // Catch: java.lang.Throwable -> L34f
            int r3 = (int) r10     // Catch: java.lang.Throwable -> L34f
            byte[] r8 = r1.zzb     // Catch: java.lang.Throwable -> L34f
            int r8 = r9.read(r8, r14, r3)     // Catch: java.lang.Throwable -> L34f
            int r8 = java.lang.Math.max(r8, r14)     // Catch: java.lang.Throwable -> L34f
            if (r8 <= 0) goto L12e
            byte[] r10 = r1.zzb     // Catch: java.lang.Throwable -> L34f
            r5.write(r10, r14, r8)     // Catch: java.lang.Throwable -> L34f
        L12e:
            long r10 = (long) r8     // Catch: java.lang.Throwable -> L34f
            long r10 = r6 - r10
            r6 = 0
            int r18 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r18 <= 0) goto L13c
            if (r8 > 0) goto L13a
            goto L13c
        L13a:
            r6 = r10
            goto L116
        L13c:
            long r6 = r5.length()     // Catch: java.lang.Throwable -> L34f
            r5.close()     // Catch: java.lang.Throwable -> L34f
            if (r8 == r3) goto L18d
            com.google.android.play.core.internal.zzag r3 = com.google.android.play.core.assetpacks.zzcf.zza     // Catch: java.lang.Throwable -> L34f
            java.lang.String r5 = "Chunk has ended while resuming the previous chunks file content."
            java.lang.Object[] r8 = new java.lang.Object[r14]     // Catch: java.lang.Throwable -> L34f
            r3.zza(r5, r8)     // Catch: java.lang.Throwable -> L34f
            java.lang.String r4 = r4.getCanonicalPath()     // Catch: java.lang.Throwable -> L34f
            int r8 = r2.zzf     // Catch: java.lang.Throwable -> L34f
            r3 = r0
            r5 = r6
            r18 = r8
            r7 = r10
            r10 = r9
            r9 = r18
            r3.zzg(r4, r5, r7, r9)     // Catch: java.lang.Throwable -> L29d
            goto L74
        L161:
            r10 = r9
            com.google.android.play.core.assetpacks.zzck r0 = new com.google.android.play.core.assetpacks.zzck     // Catch: java.lang.Throwable -> L29d
            java.lang.String r3 = "Partial file specified in checkpoint does not exist. Corrupt directory."
            int r4 = r2.zzk     // Catch: java.lang.Throwable -> L29d
            r0.<init>(r3, r4)     // Catch: java.lang.Throwable -> L29d
            throw r0     // Catch: java.lang.Throwable -> L29d
        L16c:
            r10 = r9
            com.google.android.play.core.assetpacks.zzck r0 = new com.google.android.play.core.assetpacks.zzck     // Catch: java.lang.Throwable -> L29d
            java.lang.String r4 = "Trying to resume with chunk number %s when previously processed chunk was number %s."
            java.lang.Object[] r6 = new java.lang.Object[r12]     // Catch: java.lang.Throwable -> L29d
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Throwable -> L29d
            r6[r14] = r5     // Catch: java.lang.Throwable -> L29d
            int r3 = r3.zzb()     // Catch: java.lang.Throwable -> L29d
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L29d
            r6[r13] = r3     // Catch: java.lang.Throwable -> L29d
            java.lang.String r3 = java.lang.String.format(r4, r6)     // Catch: java.lang.Throwable -> L29d
            int r4 = r2.zzk     // Catch: java.lang.Throwable -> L29d
            r0.<init>(r3, r4)     // Catch: java.lang.Throwable -> L29d
            throw r0     // Catch: java.lang.Throwable -> L29d
        L18d:
            r10 = r9
            r9 = r10
        L18f:
            if (r9 == 0) goto L2a0
            com.google.android.play.core.assetpacks.zzbw r3 = new com.google.android.play.core.assetpacks.zzbw     // Catch: java.lang.Throwable -> L29d
            r3.<init>(r9)     // Catch: java.lang.Throwable -> L29d
            java.io.File r4 = r22.zzb(r23)     // Catch: java.lang.Throwable -> L29d
        L19a:
            com.google.android.play.core.assetpacks.zzet r5 = r3.zzb()     // Catch: java.lang.Throwable -> L29d
            boolean r6 = r5.zze()     // Catch: java.lang.Throwable -> L29d
            if (r6 != 0) goto L1f1
            boolean r6 = r3.zzc()     // Catch: java.lang.Throwable -> L29d
            if (r6 != 0) goto L1f1
            boolean r6 = r5.zzh()     // Catch: java.lang.Throwable -> L29d
            if (r6 == 0) goto L1ea
            boolean r6 = r5.zzg()     // Catch: java.lang.Throwable -> L29d
            if (r6 != 0) goto L1ea
            byte[] r6 = r5.zzf()     // Catch: java.lang.Throwable -> L29d
            r0.zzj(r6)     // Catch: java.lang.Throwable -> L29d
            java.io.File r6 = new java.io.File     // Catch: java.lang.Throwable -> L29d
            java.lang.String r7 = r5.zzc()     // Catch: java.lang.Throwable -> L29d
            r6.<init>(r4, r7)     // Catch: java.lang.Throwable -> L29d
            java.io.File r7 = r6.getParentFile()     // Catch: java.lang.Throwable -> L29d
            r7.mkdirs()     // Catch: java.lang.Throwable -> L29d
            java.io.FileOutputStream r7 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L29d
            r7.<init>(r6)     // Catch: java.lang.Throwable -> L29d
            byte[] r6 = r1.zzb     // Catch: java.lang.Throwable -> L29d
            int r6 = r3.read(r6, r14, r15)     // Catch: java.lang.Throwable -> L29d
        L1d8:
            if (r6 <= 0) goto L1e6
            byte[] r8 = r1.zzb     // Catch: java.lang.Throwable -> L29d
            r7.write(r8, r14, r6)     // Catch: java.lang.Throwable -> L29d
            byte[] r6 = r1.zzb     // Catch: java.lang.Throwable -> L29d
            int r6 = r3.read(r6, r14, r15)     // Catch: java.lang.Throwable -> L29d
            goto L1d8
        L1e6:
            r7.close()     // Catch: java.lang.Throwable -> L29d
            goto L1f1
        L1ea:
            byte[] r6 = r5.zzf()     // Catch: java.lang.Throwable -> L29d
            r0.zzk(r6, r3)     // Catch: java.lang.Throwable -> L29d
        L1f1:
            boolean r6 = r3.zzd()     // Catch: java.lang.Throwable -> L29d
            if (r6 != 0) goto L1fd
            boolean r6 = r3.zzc()     // Catch: java.lang.Throwable -> L29d
            if (r6 == 0) goto L19a
        L1fd:
            boolean r4 = r3.zzc()     // Catch: java.lang.Throwable -> L29d
            if (r4 == 0) goto L213
            com.google.android.play.core.internal.zzag r4 = com.google.android.play.core.assetpacks.zzcf.zza     // Catch: java.lang.Throwable -> L29d
            java.lang.String r6 = "Writing central directory metadata."
            java.lang.Object[] r7 = new java.lang.Object[r14]     // Catch: java.lang.Throwable -> L29d
            r4.zza(r6, r7)     // Catch: java.lang.Throwable -> L29d
            byte[] r4 = r5.zzf()     // Catch: java.lang.Throwable -> L29d
            r0.zzk(r4, r9)     // Catch: java.lang.Throwable -> L29d
        L213:
            boolean r4 = r23.zza()     // Catch: java.lang.Throwable -> L29d
            if (r4 != 0) goto L2a0
            boolean r4 = r5.zze()     // Catch: java.lang.Throwable -> L29d
            if (r4 == 0) goto L232
            com.google.android.play.core.internal.zzag r3 = com.google.android.play.core.assetpacks.zzcf.zza     // Catch: java.lang.Throwable -> L29d
            java.lang.String r4 = "Writing slice checkpoint for partial local file header."
            java.lang.Object[] r6 = new java.lang.Object[r14]     // Catch: java.lang.Throwable -> L29d
            r3.zza(r4, r6)     // Catch: java.lang.Throwable -> L29d
            byte[] r3 = r5.zzf()     // Catch: java.lang.Throwable -> L29d
            int r4 = r2.zzf     // Catch: java.lang.Throwable -> L29d
            r0.zzh(r3, r4)     // Catch: java.lang.Throwable -> L29d
            goto L2a0
        L232:
            boolean r4 = r3.zzc()     // Catch: java.lang.Throwable -> L29d
            if (r4 == 0) goto L247
            com.google.android.play.core.internal.zzag r3 = com.google.android.play.core.assetpacks.zzcf.zza     // Catch: java.lang.Throwable -> L29d
            java.lang.String r4 = "Writing slice checkpoint for central directory."
            java.lang.Object[] r5 = new java.lang.Object[r14]     // Catch: java.lang.Throwable -> L29d
            r3.zza(r4, r5)     // Catch: java.lang.Throwable -> L29d
            int r3 = r2.zzf     // Catch: java.lang.Throwable -> L29d
            r0.zzf(r3)     // Catch: java.lang.Throwable -> L29d
            goto L2a0
        L247:
            int r4 = r5.zza()     // Catch: java.lang.Throwable -> L29d
            if (r4 != 0) goto L27d
            com.google.android.play.core.internal.zzag r4 = com.google.android.play.core.assetpacks.zzcf.zza     // Catch: java.lang.Throwable -> L29d
            java.lang.String r6 = "Writing slice checkpoint for partial file."
            java.lang.Object[] r7 = new java.lang.Object[r14]     // Catch: java.lang.Throwable -> L29d
            r4.zza(r6, r7)     // Catch: java.lang.Throwable -> L29d
            java.io.File r4 = new java.io.File     // Catch: java.lang.Throwable -> L29d
            java.io.File r6 = r22.zzb(r23)     // Catch: java.lang.Throwable -> L29d
            java.lang.String r7 = r5.zzc()     // Catch: java.lang.Throwable -> L29d
            r4.<init>(r6, r7)     // Catch: java.lang.Throwable -> L29d
            long r5 = r5.zzb()     // Catch: java.lang.Throwable -> L29d
            long r7 = r3.zza()     // Catch: java.lang.Throwable -> L29d
            long r5 = r5 - r7
            long r7 = r4.length()     // Catch: java.lang.Throwable -> L29d
            int r9 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r9 != 0) goto L275
            goto L28e
        L275:
            com.google.android.play.core.assetpacks.zzck r0 = new com.google.android.play.core.assetpacks.zzck     // Catch: java.lang.Throwable -> L29d
            java.lang.String r3 = "Partial file is of unexpected size."
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L29d
            throw r0     // Catch: java.lang.Throwable -> L29d
        L27d:
            com.google.android.play.core.internal.zzag r4 = com.google.android.play.core.assetpacks.zzcf.zza     // Catch: java.lang.Throwable -> L29d
            java.lang.String r5 = "Writing slice checkpoint for partial unextractable file."
            java.lang.Object[] r6 = new java.lang.Object[r14]     // Catch: java.lang.Throwable -> L29d
            r4.zza(r5, r6)     // Catch: java.lang.Throwable -> L29d
            java.io.File r4 = r0.zzc()     // Catch: java.lang.Throwable -> L29d
            long r5 = r4.length()     // Catch: java.lang.Throwable -> L29d
        L28e:
            java.lang.String r4 = r4.getCanonicalPath()     // Catch: java.lang.Throwable -> L29d
            long r7 = r3.zza()     // Catch: java.lang.Throwable -> L29d
            int r9 = r2.zzf     // Catch: java.lang.Throwable -> L29d
            r3 = r0
            r3.zzg(r4, r5, r7, r9)     // Catch: java.lang.Throwable -> L29d
            goto L2a0
        L29d:
            r0 = move-exception
            goto L351
        L2a0:
            r10.close()     // Catch: java.io.IOException -> L355
            boolean r3 = r23.zza()
            if (r3 == 0) goto L2c9
            int r3 = r2.zzf     // Catch: java.io.IOException -> L2af
            r0.zzi(r3)     // Catch: java.io.IOException -> L2af
            goto L2c9
        L2af:
            r0 = move-exception
            com.google.android.play.core.internal.zzag r3 = com.google.android.play.core.assetpacks.zzcf.zza
            java.lang.Object[] r4 = new java.lang.Object[r13]
            java.lang.String r5 = r0.getMessage()
            r4[r14] = r5
            java.lang.String r5 = "Writing extraction finished checkpoint failed with %s."
            r3.zzb(r5, r4)
            com.google.android.play.core.assetpacks.zzck r3 = new com.google.android.play.core.assetpacks.zzck
            int r2 = r2.zzk
            java.lang.String r4 = "Writing extraction finished checkpoint failed."
            r3.<init>(r4, r0, r2)
            throw r3
        L2c9:
            com.google.android.play.core.internal.zzag r0 = com.google.android.play.core.assetpacks.zzcf.zza
            r3 = 4
            java.lang.Object[] r3 = new java.lang.Object[r3]
            int r4 = r2.zzf
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3[r14] = r4
            java.lang.String r4 = r2.zzd
            r3[r13] = r4
            java.lang.String r4 = r2.zzl
            r3[r12] = r4
            int r4 = r2.zzk
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r5 = 3
            r3[r5] = r4
            java.lang.String r4 = "Extraction finished for chunk %s of slice %s of pack %s of session %s."
            r0.zzd(r4, r3)
            com.google.android.play.core.internal.zzco r0 = r1.zzd
            java.lang.Object r0 = r0.zza()
            com.google.android.play.core.assetpacks.zzy r0 = (com.google.android.play.core.assetpacks.zzy) r0
            int r3 = r2.zzk
            java.lang.String r4 = r2.zzl
            java.lang.String r5 = r2.zzd
            int r6 = r2.zzf
            r0.zzg(r3, r4, r5, r6)
            java.io.InputStream r0 = r2.zzj     // Catch: java.io.IOException -> L305
            r0.close()     // Catch: java.io.IOException -> L305
            goto L31f
        L305:
            com.google.android.play.core.internal.zzag r0 = com.google.android.play.core.assetpacks.zzcf.zza
            r3 = 3
            java.lang.Object[] r4 = new java.lang.Object[r3]
            int r3 = r2.zzf
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4[r14] = r3
            java.lang.String r3 = r2.zzd
            r4[r13] = r3
            java.lang.String r3 = r2.zzl
            r4[r12] = r3
            java.lang.String r3 = "Could not close file for chunk %s of slice %s of pack %s."
            r0.zze(r3, r4)
        L31f:
            int r0 = r2.zzi
            r3 = 3
            if (r0 != r3) goto L34e
            com.google.android.play.core.internal.zzco r0 = r1.zze
            java.lang.Object r0 = r0.zza()
            com.google.android.play.core.assetpacks.zzbb r0 = (com.google.android.play.core.assetpacks.zzbb) r0
            java.lang.String r3 = r2.zzl
            long r7 = r2.zzh
            r4 = 3
            r5 = 0
            com.google.android.play.core.assetpacks.zzco r6 = r1.zzf
            double r9 = r6.zzb(r3, r2)
            r11 = 1
            java.lang.String r12 = r2.zzc
            com.google.android.play.core.assetpacks.zzeb r6 = r1.zzg
            java.lang.String r2 = r2.zzl
            java.lang.String r13 = r6.zza(r2)
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r7
            com.google.android.play.core.assetpacks.AssetPackState r2 = com.google.android.play.core.assetpacks.AssetPackState.zzb(r2, r3, r4, r5, r7, r9, r11, r12, r13)
            r0.zzd(r2)
        L34e:
            return
        L34f:
            r0 = move-exception
            r10 = r9
        L351:
            r10.close()     // Catch: java.lang.Throwable -> L354
        L354:
            throw r0     // Catch: java.io.IOException -> L355
        L355:
            r0 = move-exception
            com.google.android.play.core.internal.zzag r3 = com.google.android.play.core.assetpacks.zzcf.zza
            java.lang.Object[] r4 = new java.lang.Object[r13]
            java.lang.String r5 = r0.getMessage()
            r4[r14] = r5
            java.lang.String r5 = "IOException during extraction %s."
            r3.zzb(r5, r4)
            com.google.android.play.core.assetpacks.zzck r3 = new com.google.android.play.core.assetpacks.zzck
            r4 = 4
            java.lang.Object[] r4 = new java.lang.Object[r4]
            int r5 = r2.zzf
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r4[r14] = r5
            java.lang.String r5 = r2.zzd
            r4[r13] = r5
            java.lang.String r5 = r2.zzl
            r4[r12] = r5
            int r5 = r2.zzk
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r6 = 3
            r4[r6] = r5
            java.lang.String r5 = "Error extracting chunk %s of slice %s of pack %s of session %s."
            java.lang.String r4 = java.lang.String.format(r5, r4)
            int r2 = r2.zzk
            r3.<init>(r4, r0, r2)
            throw r3
    }
}
