package com.google.android.play.core.internal;

/* JADX INFO: compiled from: com.google.android.play:core@@1.10.3 */
/* JADX INFO: loaded from: classes.dex */
public final class zzaw implements com.google.android.play.core.splitinstall.zzh {
    private final android.content.Context zza;
    private final com.google.android.play.core.splitcompat.zze zzb;
    private final com.google.android.play.core.internal.zzay zzc;
    private final java.util.concurrent.Executor zzd;
    private final com.google.android.play.core.splitcompat.zzr zze;

    public zzaw(android.content.Context r1, java.util.concurrent.Executor r2, com.google.android.play.core.internal.zzay r3, com.google.android.play.core.splitcompat.zze r4, com.google.android.play.core.splitcompat.zzr r5, byte[] r6) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r4
            r0.zzc = r3
            r0.zzd = r2
            r0.zze = r5
            return
    }

    public static /* bridge */ /* synthetic */ com.google.android.play.core.internal.zzay zza(com.google.android.play.core.internal.zzaw r0) {
            com.google.android.play.core.internal.zzay r0 = r0.zzc
            return r0
    }

    public static /* bridge */ /* synthetic */ void zzb(com.google.android.play.core.internal.zzaw r0, java.util.List r1, com.google.android.play.core.splitinstall.zzf r2) {
            java.lang.Integer r0 = r0.zze(r1)
            if (r0 != 0) goto L7
            return
        L7:
            int r1 = r0.intValue()
            if (r1 != 0) goto L11
            r2.zzc()
            return
        L11:
            int r0 = r0.intValue()
            r2.zzb(r0)
            return
    }

    public static /* bridge */ /* synthetic */ void zzc(com.google.android.play.core.internal.zzaw r3, com.google.android.play.core.splitinstall.zzf r4) {
            java.lang.String r0 = "SplitCompat"
            r1 = -12
            android.content.Context r3 = r3.zza     // Catch: java.lang.Exception -> L22
            android.content.Context r3 = com.google.android.play.core.internal.zzce.zza(r3)     // Catch: java.lang.Exception -> L22
            boolean r3 = com.google.android.play.core.splitcompat.SplitCompat.zzd(r3)     // Catch: java.lang.Exception -> L22
            if (r3 != 0) goto L19
            java.lang.String r3 = "Emulating splits failed."
            android.util.Log.e(r0, r3)
            r4.zzb(r1)
            return
        L19:
            java.lang.String r3 = "Splits installed."
            android.util.Log.i(r0, r3)
            r4.zza()
            return
        L22:
            r3 = move-exception
            java.lang.String r2 = "Error emulating splits."
            android.util.Log.e(r0, r2, r3)
            r4.zzb(r1)
            return
    }

    @androidx.annotation.Nullable
    @com.google.android.play.core.splitinstall.model.SplitInstallErrorCode
    private final java.lang.Integer zze(java.util.List r15) {
            r14 = this;
            java.lang.String r0 = "SplitCompat"
            r1 = -13
            java.io.RandomAccessFile r2 = new java.io.RandomAccessFile     // Catch: java.lang.Exception -> L12a
            com.google.android.play.core.splitcompat.zze r3 = r14.zzb     // Catch: java.lang.Exception -> L12a
            java.io.File r3 = r3.zzd()     // Catch: java.lang.Exception -> L12a
            java.lang.String r4 = "rw"
            r2.<init>(r3, r4)     // Catch: java.lang.Exception -> L12a
            java.nio.channels.FileChannel r2 = r2.getChannel()     // Catch: java.lang.Exception -> L12a
            r3 = 0
            java.nio.channels.FileLock r4 = r2.tryLock()     // Catch: java.lang.Throwable -> L1c java.nio.channels.OverlappingFileLockException -> L1f
            goto L20
        L1c:
            r15 = move-exception
            goto L11e
        L1f:
            r4 = r3
        L20:
            if (r4 == 0) goto L124
            r3 = 0
            r5 = -11
            java.lang.String r6 = "Copying splits."
            android.util.Log.i(r0, r6)     // Catch: java.lang.Throwable -> L1c java.lang.Exception -> L10e
            java.util.Iterator r15 = r15.iterator()     // Catch: java.lang.Throwable -> L1c java.lang.Exception -> L10e
        L2e:
            boolean r6 = r15.hasNext()     // Catch: java.lang.Throwable -> L1c java.lang.Exception -> L10e
            if (r6 == 0) goto La9
            java.lang.Object r6 = r15.next()     // Catch: java.lang.Throwable -> L1c java.lang.Exception -> L10e
            android.content.Intent r6 = (android.content.Intent) r6     // Catch: java.lang.Throwable -> L1c java.lang.Exception -> L10e
            java.lang.String r7 = "split_id"
            java.lang.String r7 = r6.getStringExtra(r7)     // Catch: java.lang.Throwable -> L1c java.lang.Exception -> L10e
            android.content.Context r8 = r14.zza     // Catch: java.lang.Throwable -> L1c java.lang.Exception -> L10e
            android.content.ContentResolver r8 = r8.getContentResolver()     // Catch: java.lang.Throwable -> L1c java.lang.Exception -> L10e
            android.net.Uri r6 = r6.getData()     // Catch: java.lang.Throwable -> L1c java.lang.Exception -> L10e
            java.lang.String r9 = "r"
            android.content.res.AssetFileDescriptor r6 = r8.openAssetFileDescriptor(r6, r9)     // Catch: java.lang.Throwable -> L1c java.lang.Exception -> L10e
            com.google.android.play.core.splitcompat.zze r8 = r14.zzb     // Catch: java.lang.Throwable -> L1c java.lang.Exception -> L10e
            java.io.File r8 = r8.zze(r7)     // Catch: java.lang.Throwable -> L1c java.lang.Exception -> L10e
            boolean r9 = r8.exists()     // Catch: java.lang.Throwable -> L1c java.lang.Exception -> L10e
            if (r9 == 0) goto L6a
            long r9 = r8.length()     // Catch: java.lang.Throwable -> L1c java.lang.Exception -> L10e
            long r11 = r6.getLength()     // Catch: java.lang.Throwable -> L1c java.lang.Exception -> L10e
            int r13 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r13 == 0) goto L6a
            goto L70
        L6a:
            boolean r9 = r8.exists()     // Catch: java.lang.Throwable -> L1c java.lang.Exception -> L10e
            if (r9 != 0) goto L2e
        L70:
            com.google.android.play.core.splitcompat.zze r9 = r14.zzb     // Catch: java.lang.Throwable -> L1c java.lang.Exception -> L10e
            java.io.File r7 = r9.zzg(r7)     // Catch: java.lang.Throwable -> L1c java.lang.Exception -> L10e
            boolean r7 = r7.exists()     // Catch: java.lang.Throwable -> L1c java.lang.Exception -> L10e
            if (r7 != 0) goto L2e
            java.io.BufferedInputStream r7 = new java.io.BufferedInputStream     // Catch: java.lang.Throwable -> L1c java.lang.Exception -> L10e
            java.io.FileInputStream r6 = r6.createInputStream()     // Catch: java.lang.Throwable -> L1c java.lang.Exception -> L10e
            r7.<init>(r6)     // Catch: java.lang.Throwable -> L1c java.lang.Exception -> L10e
            java.io.FileOutputStream r6 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> La4
            r6.<init>(r8)     // Catch: java.lang.Throwable -> La4
            r8 = 4096(0x1000, float:5.74E-42)
            byte[] r8 = new byte[r8]     // Catch: java.lang.Throwable -> L9f
        L8e:
            int r9 = r7.read(r8)     // Catch: java.lang.Throwable -> L9f
            if (r9 <= 0) goto L98
            r6.write(r8, r3, r9)     // Catch: java.lang.Throwable -> L9f
            goto L8e
        L98:
            r6.close()     // Catch: java.lang.Throwable -> La4
            r7.close()     // Catch: java.lang.Throwable -> L1c java.lang.Exception -> L10e
            goto L2e
        L9f:
            r15 = move-exception
            r6.close()     // Catch: java.lang.Throwable -> La3
        La3:
            throw r15     // Catch: java.lang.Throwable -> La4
        La4:
            r15 = move-exception
            r7.close()     // Catch: java.lang.Throwable -> La8
        La8:
            throw r15     // Catch: java.lang.Throwable -> L1c java.lang.Exception -> L10e
        La9:
            java.lang.String r15 = "Splits copied."
            android.util.Log.i(r0, r15)     // Catch: java.lang.Throwable -> L1c java.lang.Exception -> L10e
            com.google.android.play.core.splitcompat.zze r15 = r14.zzb     // Catch: java.lang.Throwable -> L1c java.io.IOException -> L107
            java.io.File r15 = r15.zzb()     // Catch: java.lang.Throwable -> L1c java.io.IOException -> L107
            java.io.File[] r15 = r15.listFiles()     // Catch: java.lang.Throwable -> L1c java.io.IOException -> L107
            com.google.android.play.core.internal.zzay r6 = r14.zzc     // Catch: java.lang.Throwable -> L1c java.lang.Exception -> Lfe
            boolean r6 = r6.zzc(r15)     // Catch: java.lang.Throwable -> L1c java.lang.Exception -> Lfe
            if (r6 == 0) goto Lf8
            com.google.android.play.core.internal.zzay r6 = r14.zzc     // Catch: java.lang.Throwable -> L1c java.lang.Exception -> Lfe
            boolean r15 = r6.zza(r15)     // Catch: java.lang.Throwable -> L1c java.lang.Exception -> Lfe
            if (r15 == 0) goto Lf8
            com.google.android.play.core.splitcompat.zze r15 = r14.zzb     // Catch: java.lang.Throwable -> L1c java.io.IOException -> Lf1
            java.io.File r15 = r15.zzb()     // Catch: java.lang.Throwable -> L1c java.io.IOException -> Lf1
            java.io.File[] r15 = r15.listFiles()     // Catch: java.lang.Throwable -> L1c java.io.IOException -> Lf1
            java.util.Arrays.sort(r15)     // Catch: java.lang.Throwable -> L1c java.io.IOException -> Lf1
            int r5 = r15.length     // Catch: java.lang.Throwable -> L1c java.io.IOException -> Lf1
        Ld6:
            int r5 = r5 + (-1)
            if (r5 < 0) goto Leb
            r6 = r15[r5]     // Catch: java.lang.Throwable -> L1c java.io.IOException -> Lf1
            com.google.android.play.core.splitcompat.zze.zzm(r6)     // Catch: java.lang.Throwable -> L1c java.io.IOException -> Lf1
            r6 = r15[r5]     // Catch: java.lang.Throwable -> L1c java.io.IOException -> Lf1
            com.google.android.play.core.splitcompat.zze r7 = r14.zzb     // Catch: java.lang.Throwable -> L1c java.io.IOException -> Lf1
            java.io.File r7 = r7.zzf(r6)     // Catch: java.lang.Throwable -> L1c java.io.IOException -> Lf1
            r6.renameTo(r7)     // Catch: java.lang.Throwable -> L1c java.io.IOException -> Lf1
            goto Ld6
        Leb:
            java.lang.String r15 = "Splits verified."
            android.util.Log.i(r0, r15)     // Catch: java.lang.Throwable -> L1c
            goto L116
        Lf1:
            r15 = move-exception
            java.lang.String r3 = "Cannot write verified split."
            android.util.Log.e(r0, r3, r15)     // Catch: java.lang.Throwable -> L1c
            goto L114
        Lf8:
            java.lang.String r15 = "Split verification failed."
            android.util.Log.e(r0, r15)     // Catch: java.lang.Throwable -> L1c
            goto L104
        Lfe:
            r15 = move-exception
            java.lang.String r3 = "Error verifying splits."
            android.util.Log.e(r0, r3, r15)     // Catch: java.lang.Throwable -> L1c
        L104:
            r3 = -11
            goto L116
        L107:
            r15 = move-exception
            java.lang.String r3 = "Cannot access directory for unverified splits."
            android.util.Log.e(r0, r3, r15)     // Catch: java.lang.Throwable -> L1c
            goto L114
        L10e:
            r15 = move-exception
            java.lang.String r3 = "Error copying splits."
            android.util.Log.e(r0, r3, r15)     // Catch: java.lang.Throwable -> L1c
        L114:
            r3 = -13
        L116:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L1c
            r4.release()     // Catch: java.lang.Throwable -> L1c
            goto L124
        L11e:
            if (r2 == 0) goto L123
            r2.close()     // Catch: java.lang.Throwable -> L123
        L123:
            throw r15     // Catch: java.lang.Exception -> L12a
        L124:
            if (r2 == 0) goto L129
            r2.close()     // Catch: java.lang.Exception -> L12a
        L129:
            return r3
        L12a:
            r15 = move-exception
            java.lang.String r2 = "Error locking files."
            android.util.Log.e(r0, r2, r15)
            java.lang.Integer r15 = java.lang.Integer.valueOf(r1)
            return r15
    }

    @Override // com.google.android.play.core.splitinstall.zzh
    public final void zzd(java.util.List r3, com.google.android.play.core.splitinstall.zzf r4) {
            r2 = this;
            boolean r0 = com.google.android.play.core.splitcompat.SplitCompat.zze()
            if (r0 == 0) goto L11
            java.util.concurrent.Executor r0 = r2.zzd
            com.google.android.play.core.internal.zzav r1 = new com.google.android.play.core.internal.zzav
            r1.<init>(r2, r3, r4)
            r0.execute(r1)
            return
        L11:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "Ingestion should only be called in SplitCompat mode."
            r3.<init>(r4)
            throw r3
    }
}
