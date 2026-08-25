package com.google.android.play.core.splitcompat;

/* JADX INFO: compiled from: com.google.android.play:core@@1.10.3 */
/* JADX INFO: loaded from: classes.dex */
final class zzi implements com.google.android.play.core.splitcompat.zzk {
    public final /* synthetic */ java.util.Set zza;
    public final /* synthetic */ com.google.android.play.core.splitcompat.zzs zzb;
    public final /* synthetic */ java.util.zip.ZipFile zzc;

    public zzi(java.util.Set r1, com.google.android.play.core.splitcompat.zzs r2, java.util.zip.ZipFile r3) {
            r0 = this;
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r3
            r0.<init>()
            return
    }

    @Override // com.google.android.play.core.splitcompat.zzk
    public final void zza(com.google.android.play.core.splitcompat.zzl r4, java.io.File r5, boolean r6) throws java.io.IOException {
            r3 = this;
            java.util.Set r0 = r3.zza
            r0.add(r5)
            if (r6 != 0) goto L7a
            r6 = 5
            java.lang.Object[] r6 = new java.lang.Object[r6]
            com.google.android.play.core.splitcompat.zzs r0 = r3.zzb
            java.lang.String r0 = r0.zzb()
            r1 = 0
            r6[r1] = r0
            r0 = 1
            java.lang.String r2 = r4.zza
            r6[r0] = r2
            r0 = 2
            com.google.android.play.core.splitcompat.zzs r2 = r3.zzb
            java.io.File r2 = r2.zza()
            java.lang.String r2 = r2.getAbsolutePath()
            r6[r0] = r2
            r0 = 3
            java.util.zip.ZipEntry r2 = r4.zzb
            java.lang.String r2 = r2.getName()
            r6[r0] = r2
            r0 = 4
            java.lang.String r2 = r5.getAbsolutePath()
            r6[r0] = r2
            java.lang.String r0 = "NativeLibraryExtractor: split '%s' has native library '%s' that does not exist; extracting from '%s!%s' to '%s'"
            java.lang.String r6 = java.lang.String.format(r0, r6)
            java.lang.String r0 = "SplitCompat"
            android.util.Log.i(r0, r6)
            java.util.zip.ZipFile r6 = r3.zzc
            java.util.zip.ZipEntry r4 = r4.zzb
            r0 = 4096(0x1000, float:5.74E-42)
            byte[] r0 = new byte[r0]
            boolean r2 = r5.exists()
            if (r2 == 0) goto L51
            r5.delete()
        L51:
            java.io.InputStream r4 = r6.getInputStream(r4)
            java.io.FileOutputStream r6 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L73
            r6.<init>(r5)     // Catch: java.lang.Throwable -> L73
            com.google.android.play.core.splitcompat.zze.zzm(r5)     // Catch: java.lang.Throwable -> L6e
        L5d:
            int r5 = r4.read(r0)     // Catch: java.lang.Throwable -> L6e
            if (r5 <= 0) goto L67
            r6.write(r0, r1, r5)     // Catch: java.lang.Throwable -> L6e
            goto L5d
        L67:
            r6.close()     // Catch: java.lang.Throwable -> L73
            r4.close()
            return
        L6e:
            r5 = move-exception
            r6.close()     // Catch: java.lang.Throwable -> L72
        L72:
            throw r5     // Catch: java.lang.Throwable -> L73
        L73:
            r5 = move-exception
            if (r4 == 0) goto L79
            r4.close()     // Catch: java.lang.Throwable -> L79
        L79:
            throw r5
        L7a:
            return
    }
}
