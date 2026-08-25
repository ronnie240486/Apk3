package com.google.android.play.core.assetpacks;

/* JADX INFO: compiled from: com.google.android.play:core@@1.10.3 */
/* JADX INFO: loaded from: classes.dex */
final class zzen {
    private static final com.google.android.play.core.internal.zzag zza = null;
    private final byte[] zzb;
    private final com.google.android.play.core.assetpacks.zzbh zzc;
    private final java.lang.String zzd;
    private final int zze;
    private final long zzf;
    private final java.lang.String zzg;
    private int zzh;

    static {
            com.google.android.play.core.internal.zzag r0 = new com.google.android.play.core.internal.zzag
            java.lang.String r1 = "SliceMetadataManager"
            r0.<init>(r1)
            com.google.android.play.core.assetpacks.zzen.zza = r0
            return
    }

    public zzen(com.google.android.play.core.assetpacks.zzbh r2, java.lang.String r3, int r4, long r5, java.lang.String r7) {
            r1 = this;
            r1.<init>()
            r0 = 8192(0x2000, float:1.148E-41)
            byte[] r0 = new byte[r0]
            r1.zzb = r0
            r1.zzc = r2
            r1.zzd = r3
            r1.zze = r4
            r1.zzf = r5
            r1.zzg = r7
            r2 = -1
            r1.zzh = r2
            return
    }

    private final java.io.File zzn() {
            r6 = this;
            com.google.android.play.core.assetpacks.zzbh r0 = r6.zzc
            java.lang.String r1 = r6.zzd
            int r2 = r6.zze
            long r3 = r6.zzf
            java.lang.String r5 = r6.zzg
            java.io.File r0 = r0.zzo(r1, r2, r3, r5)
            boolean r1 = r0.exists()
            if (r1 != 0) goto L17
            r0.mkdirs()
        L17:
            return r0
    }

    private final java.io.File zzo() throws java.io.IOException {
            r6 = this;
            com.google.android.play.core.assetpacks.zzbh r0 = r6.zzc
            java.lang.String r1 = r6.zzd
            int r2 = r6.zze
            long r3 = r6.zzf
            java.lang.String r5 = r6.zzg
            java.io.File r0 = r0.zzn(r1, r2, r3, r5)
            java.io.File r1 = r0.getParentFile()
            r1.mkdirs()
            r0.createNewFile()
            return r0
    }

    public final int zza() throws java.io.IOException {
            r6 = this;
            com.google.android.play.core.assetpacks.zzbh r0 = r6.zzc
            java.lang.String r1 = r6.zzd
            int r2 = r6.zze
            long r3 = r6.zzf
            java.lang.String r5 = r6.zzg
            java.io.File r0 = r0.zzn(r1, r2, r3, r5)
            boolean r1 = r0.exists()
            if (r1 != 0) goto L16
            r0 = 0
            return r0
        L16:
            java.io.FileInputStream r1 = new java.io.FileInputStream
            r1.<init>(r0)
            java.util.Properties r0 = new java.util.Properties     // Catch: java.lang.Throwable -> L52
            r0.<init>()     // Catch: java.lang.Throwable -> L52
            r0.load(r1)     // Catch: java.lang.Throwable -> L52
            r1.close()
            java.lang.String r1 = "fileStatus"
            java.lang.String r2 = "-1"
            java.lang.String r1 = r0.getProperty(r1, r2)
            int r1 = java.lang.Integer.parseInt(r1)
            r2 = 4
            if (r1 != r2) goto L37
            r0 = -1
            return r0
        L37:
            java.lang.String r1 = "previousChunk"
            java.lang.String r2 = r0.getProperty(r1)
            if (r2 == 0) goto L4a
            java.lang.String r0 = r0.getProperty(r1)
            int r0 = java.lang.Integer.parseInt(r0)
            int r0 = r0 + 1
            return r0
        L4a:
            com.google.android.play.core.assetpacks.zzck r0 = new com.google.android.play.core.assetpacks.zzck
            java.lang.String r1 = "Slice checkpoint file corrupt."
            r0.<init>(r1)
            throw r0
        L52:
            r0 = move-exception
            r1.close()     // Catch: java.lang.Throwable -> L56
        L56:
            throw r0
    }

    public final com.google.android.play.core.assetpacks.zzem zzb() throws java.io.IOException {
            r13 = this;
            java.lang.String r0 = "-1"
            com.google.android.play.core.assetpacks.zzbh r1 = r13.zzc
            java.lang.String r2 = r13.zzd
            int r3 = r13.zze
            long r4 = r13.zzf
            java.lang.String r6 = r13.zzg
            java.io.File r1 = r1.zzn(r2, r3, r4, r6)
            boolean r2 = r1.exists()
            if (r2 == 0) goto L89
            java.util.Properties r2 = new java.util.Properties
            r2.<init>()
            java.io.FileInputStream r3 = new java.io.FileInputStream
            r3.<init>(r1)
            r2.load(r3)     // Catch: java.lang.Throwable -> L84
            r3.close()
            java.lang.String r1 = "fileStatus"
            java.lang.String r3 = r2.getProperty(r1)
            java.lang.String r4 = "Slice checkpoint file corrupt."
            if (r3 == 0) goto L7e
            java.lang.String r3 = "previousChunk"
            java.lang.String r5 = r2.getProperty(r3)
            if (r5 == 0) goto L7e
            java.lang.String r1 = r2.getProperty(r1)     // Catch: java.lang.NumberFormatException -> L77
            int r6 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.NumberFormatException -> L77
            java.lang.String r1 = "fileName"
            java.lang.String r7 = r2.getProperty(r1)     // Catch: java.lang.NumberFormatException -> L77
            java.lang.String r1 = "fileOffset"
            java.lang.String r1 = r2.getProperty(r1, r0)     // Catch: java.lang.NumberFormatException -> L77
            long r8 = java.lang.Long.parseLong(r1)     // Catch: java.lang.NumberFormatException -> L77
            java.lang.String r1 = "remainingBytes"
            java.lang.String r0 = r2.getProperty(r1, r0)     // Catch: java.lang.NumberFormatException -> L77
            long r10 = java.lang.Long.parseLong(r0)     // Catch: java.lang.NumberFormatException -> L77
            java.lang.String r0 = r2.getProperty(r3)     // Catch: java.lang.NumberFormatException -> L77
            int r12 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.NumberFormatException -> L77
            java.lang.String r0 = "metadataFileCounter"
            java.lang.String r1 = "0"
            java.lang.String r0 = r2.getProperty(r0, r1)     // Catch: java.lang.NumberFormatException -> L77
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.NumberFormatException -> L77
            r13.zzh = r0     // Catch: java.lang.NumberFormatException -> L77
            com.google.android.play.core.assetpacks.zzbp r0 = new com.google.android.play.core.assetpacks.zzbp
            r5 = r0
            r5.<init>(r6, r7, r8, r10, r12)
            return r0
        L77:
            r0 = move-exception
            com.google.android.play.core.assetpacks.zzck r1 = new com.google.android.play.core.assetpacks.zzck
            r1.<init>(r4, r0)
            throw r1
        L7e:
            com.google.android.play.core.assetpacks.zzck r0 = new com.google.android.play.core.assetpacks.zzck
            r0.<init>(r4)
            throw r0
        L84:
            r0 = move-exception
            r3.close()     // Catch: java.lang.Throwable -> L88
        L88:
            throw r0
        L89:
            com.google.android.play.core.assetpacks.zzck r0 = new com.google.android.play.core.assetpacks.zzck
            java.lang.String r1 = "Slice checkpoint file does not exist."
            r0.<init>(r1)
            throw r0
    }

    public final java.io.File zzc() {
            r5 = this;
            java.io.File r0 = new java.io.File
            java.io.File r1 = r5.zzn()
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            int r3 = r5.zzh
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4 = 0
            r2[r4] = r3
            java.lang.String r3 = "%s-NAM.dat"
            java.lang.String r2 = java.lang.String.format(r3, r2)
            r0.<init>(r1, r2)
            return r0
    }

    public final void zzd(java.io.InputStream r4, long r5) throws java.io.IOException {
            r3 = this;
            java.io.File r0 = r3.zzc()
            java.io.RandomAccessFile r1 = new java.io.RandomAccessFile
            java.lang.String r2 = "rw"
            r1.<init>(r0, r2)
            r1.seek(r5)     // Catch: java.lang.Throwable -> L25
        Lf:
            byte[] r5 = r3.zzb     // Catch: java.lang.Throwable -> L25
            int r5 = r4.read(r5)     // Catch: java.lang.Throwable -> L25
            if (r5 <= 0) goto L1d
            byte[] r6 = r3.zzb     // Catch: java.lang.Throwable -> L25
            r0 = 0
            r1.write(r6, r0, r5)     // Catch: java.lang.Throwable -> L25
        L1d:
            r6 = 8192(0x2000, float:1.148E-41)
            if (r5 == r6) goto Lf
            r1.close()
            return
        L25:
            r4 = move-exception
            r1.close()     // Catch: java.lang.Throwable -> L29
        L29:
            throw r4
    }

    public final void zze(long r4, byte[] r6, int r7, int r8) throws java.io.IOException {
            r3 = this;
            java.io.File r0 = r3.zzc()
            java.io.RandomAccessFile r1 = new java.io.RandomAccessFile
            java.lang.String r2 = "rw"
            r1.<init>(r0, r2)
            r1.seek(r4)     // Catch: java.lang.Throwable -> L16
            r1.write(r6, r7, r8)     // Catch: java.lang.Throwable -> L16
            r1.close()
            return
        L16:
            r4 = move-exception
            r1.close()     // Catch: java.lang.Throwable -> L1a
        L1a:
            throw r4
    }

    public final void zzf(int r4) throws java.io.IOException {
            r3 = this;
            java.util.Properties r0 = new java.util.Properties
            r0.<init>()
            java.lang.String r1 = "fileStatus"
            java.lang.String r2 = "3"
            r0.put(r1, r2)
            java.io.File r1 = r3.zzc()
            long r1 = r1.length()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r2 = "fileOffset"
            r0.put(r2, r1)
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.String r1 = "previousChunk"
            r0.put(r1, r4)
            int r4 = r3.zzh
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.String r1 = "metadataFileCounter"
            r0.put(r1, r4)
            java.io.FileOutputStream r4 = new java.io.FileOutputStream
            java.io.File r1 = r3.zzo()
            r4.<init>(r1)
            r1 = 0
            r0.store(r4, r1)     // Catch: java.lang.Throwable -> L42
            r4.close()
            return
        L42:
            r0 = move-exception
            r4.close()     // Catch: java.lang.Throwable -> L46
        L46:
            throw r0
    }

    public final void zzg(java.lang.String r4, long r5, long r7, int r9) throws java.io.IOException {
            r3 = this;
            java.util.Properties r0 = new java.util.Properties
            r0.<init>()
            java.lang.String r1 = "fileStatus"
            java.lang.String r2 = "1"
            r0.put(r1, r2)
            java.lang.String r1 = "fileName"
            r0.put(r1, r4)
            java.lang.String r4 = java.lang.String.valueOf(r5)
            java.lang.String r5 = "fileOffset"
            r0.put(r5, r4)
            java.lang.String r4 = java.lang.String.valueOf(r7)
            java.lang.String r5 = "remainingBytes"
            r0.put(r5, r4)
            java.lang.String r4 = java.lang.String.valueOf(r9)
            java.lang.String r5 = "previousChunk"
            r0.put(r5, r4)
            int r4 = r3.zzh
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.String r5 = "metadataFileCounter"
            r0.put(r5, r4)
            java.io.FileOutputStream r4 = new java.io.FileOutputStream
            java.io.File r5 = r3.zzo()
            r4.<init>(r5)
            r5 = 0
            r0.store(r4, r5)     // Catch: java.lang.Throwable -> L48
            r4.close()
            return
        L48:
            r5 = move-exception
            r4.close()     // Catch: java.lang.Throwable -> L4c
        L4c:
            throw r5
    }

    public final void zzh(byte[] r9, int r10) throws java.io.IOException {
            r8 = this;
            java.util.Properties r0 = new java.util.Properties
            r0.<init>()
            java.lang.String r1 = "fileStatus"
            java.lang.String r2 = "2"
            r0.put(r1, r2)
            java.lang.String r10 = java.lang.String.valueOf(r10)
            java.lang.String r1 = "previousChunk"
            r0.put(r1, r10)
            int r10 = r8.zzh
            java.lang.String r10 = java.lang.String.valueOf(r10)
            java.lang.String r1 = "metadataFileCounter"
            r0.put(r1, r10)
            java.io.FileOutputStream r10 = new java.io.FileOutputStream
            java.io.File r1 = r8.zzo()
            r10.<init>(r1)
            r1 = 0
            r0.store(r10, r1)     // Catch: java.lang.Throwable -> L62
            r10.close()
            com.google.android.play.core.assetpacks.zzbh r2 = r8.zzc
            java.lang.String r3 = r8.zzd
            int r4 = r8.zze
            long r5 = r8.zzf
            java.lang.String r7 = r8.zzg
            java.util.Objects.requireNonNull(r2)
            java.io.File r10 = new java.io.File
            java.io.File r0 = r2.zzo(r3, r4, r5, r7)
            java.lang.String r1 = "checkpoint_ext.dat"
            r10.<init>(r0, r1)
            boolean r0 = r10.exists()
            if (r0 == 0) goto L51
            r10.delete()
        L51:
            java.io.FileOutputStream r0 = new java.io.FileOutputStream
            r0.<init>(r10)
            r0.write(r9)     // Catch: java.lang.Throwable -> L5d
            r0.close()
            return
        L5d:
            r9 = move-exception
            r0.close()     // Catch: java.lang.Throwable -> L61
        L61:
            throw r9
        L62:
            r9 = move-exception
            r10.close()     // Catch: java.lang.Throwable -> L66
        L66:
            throw r9
    }

    public final void zzi(int r4) throws java.io.IOException {
            r3 = this;
            java.util.Properties r0 = new java.util.Properties
            r0.<init>()
            java.lang.String r1 = "fileStatus"
            java.lang.String r2 = "4"
            r0.put(r1, r2)
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.String r1 = "previousChunk"
            r0.put(r1, r4)
            int r4 = r3.zzh
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.String r1 = "metadataFileCounter"
            r0.put(r1, r4)
            java.io.FileOutputStream r4 = new java.io.FileOutputStream
            java.io.File r1 = r3.zzo()
            r4.<init>(r1)
            r1 = 0
            r0.store(r4, r1)     // Catch: java.lang.Throwable -> L31
            r4.close()
            return
        L31:
            r0 = move-exception
            r4.close()     // Catch: java.lang.Throwable -> L35
        L35:
            throw r0
    }

    public final void zzj(byte[] r6) throws java.io.IOException {
            r5 = this;
            int r0 = r5.zzh
            r1 = 1
            int r0 = r0 + r1
            r5.zzh = r0
            java.io.File r0 = new java.io.File
            java.io.File r2 = r5.zzn()
            java.lang.Object[] r1 = new java.lang.Object[r1]
            int r3 = r5.zzh
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4 = 0
            r1[r4] = r3
            java.lang.String r3 = "%s-LFH.dat"
            java.lang.String r1 = java.lang.String.format(r3, r1)
            r0.<init>(r2, r1)
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch: java.io.IOException -> L31
            r1.<init>(r0)     // Catch: java.io.IOException -> L31
            r1.write(r6)     // Catch: java.lang.Throwable -> L2c
            r1.close()     // Catch: java.io.IOException -> L31
            return
        L2c:
            r6 = move-exception
            r1.close()     // Catch: java.lang.Throwable -> L30
        L30:
            throw r6     // Catch: java.io.IOException -> L31
        L31:
            r6 = move-exception
            com.google.android.play.core.assetpacks.zzck r0 = new com.google.android.play.core.assetpacks.zzck
            java.lang.String r1 = "Could not write metadata file."
            r0.<init>(r1, r6)
            throw r0
    }

    public final void zzk(byte[] r4, java.io.InputStream r5) throws java.io.IOException {
            r3 = this;
            int r0 = r3.zzh
            int r0 = r0 + 1
            r3.zzh = r0
            java.io.File r0 = r3.zzc()
            java.io.FileOutputStream r1 = new java.io.FileOutputStream
            r1.<init>(r0)
            r1.write(r4)     // Catch: java.lang.Throwable -> L2b
            byte[] r4 = r3.zzb     // Catch: java.lang.Throwable -> L2b
            int r4 = r5.read(r4)     // Catch: java.lang.Throwable -> L2b
        L18:
            if (r4 <= 0) goto L27
            byte[] r0 = r3.zzb     // Catch: java.lang.Throwable -> L2b
            r2 = 0
            r1.write(r0, r2, r4)     // Catch: java.lang.Throwable -> L2b
            byte[] r4 = r3.zzb     // Catch: java.lang.Throwable -> L2b
            int r4 = r5.read(r4)     // Catch: java.lang.Throwable -> L2b
            goto L18
        L27:
            r1.close()
            return
        L2b:
            r4 = move-exception
            r1.close()     // Catch: java.lang.Throwable -> L2f
        L2f:
            throw r4
    }

    public final void zzl(byte[] r3, int r4) throws java.io.IOException {
            r2 = this;
            int r0 = r2.zzh
            int r0 = r0 + 1
            r2.zzh = r0
            java.io.File r0 = r2.zzc()
            java.io.FileOutputStream r1 = new java.io.FileOutputStream
            r1.<init>(r0)
            r0 = 0
            r1.write(r3, r0, r4)     // Catch: java.lang.Throwable -> L17
            r1.close()
            return
        L17:
            r3 = move-exception
            r1.close()     // Catch: java.lang.Throwable -> L1b
        L1b:
            throw r3
    }

    public final boolean zzm() {
            r6 = this;
            com.google.android.play.core.assetpacks.zzbh r0 = r6.zzc
            java.lang.String r1 = r6.zzd
            int r2 = r6.zze
            long r3 = r6.zzf
            java.lang.String r5 = r6.zzg
            java.io.File r0 = r0.zzn(r1, r2, r3, r5)
            boolean r1 = r0.exists()
            r2 = 0
            if (r1 != 0) goto L16
            return r2
        L16:
            r1 = 1
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch: java.io.IOException -> L4b
            r3.<init>(r0)     // Catch: java.io.IOException -> L4b
            java.util.Properties r0 = new java.util.Properties     // Catch: java.lang.Throwable -> L46
            r0.<init>()     // Catch: java.lang.Throwable -> L46
            r0.load(r3)     // Catch: java.lang.Throwable -> L46
            r3.close()     // Catch: java.io.IOException -> L4b
            java.lang.String r3 = "fileStatus"
            java.lang.String r4 = r0.getProperty(r3)
            if (r4 != 0) goto L39
            com.google.android.play.core.internal.zzag r0 = com.google.android.play.core.assetpacks.zzen.zza
            java.lang.Object[] r1 = new java.lang.Object[r2]
            java.lang.String r3 = "Slice checkpoint file corrupt while checking if extraction finished."
            r0.zzb(r3, r1)
            return r2
        L39:
            java.lang.String r0 = r0.getProperty(r3)
            int r0 = java.lang.Integer.parseInt(r0)
            r3 = 4
            if (r0 != r3) goto L45
            return r1
        L45:
            return r2
        L46:
            r0 = move-exception
            r3.close()     // Catch: java.lang.Throwable -> L4a
        L4a:
            throw r0     // Catch: java.io.IOException -> L4b
        L4b:
            r0 = move-exception
            com.google.android.play.core.internal.zzag r3 = com.google.android.play.core.assetpacks.zzen.zza
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r2] = r0
            java.lang.String r0 = "Could not read checkpoint while checking if extraction finished. %s"
            r3.zzb(r0, r1)
            return r2
    }
}
