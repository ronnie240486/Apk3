package com.google.android.play.core.splitcompat;

/* JADX INFO: compiled from: com.google.android.play:core@@1.10.3 */
/* JADX INFO: loaded from: classes.dex */
public final class zze {
    private final long zza;
    private final android.content.Context zzb;
    private java.io.File zzc;

    public zze(android.content.Context r3) throws android.content.pm.PackageManager.NameNotFoundException {
            r2 = this;
            r2.<init>()
            r2.zzb = r3
            android.content.pm.PackageManager r0 = r3.getPackageManager()
            java.lang.String r3 = r3.getPackageName()
            r1 = 0
            android.content.pm.PackageInfo r3 = r0.getPackageInfo(r3, r1)
            int r3 = r3.versionCode
            long r0 = (long) r3
            r2.zza = r0
            return
    }

    public static void zzl(java.io.File r5) throws java.io.IOException {
            boolean r0 = r5.isDirectory()
            r1 = 0
            if (r0 == 0) goto L19
            java.io.File[] r0 = r5.listFiles()
            if (r0 == 0) goto L19
            int r2 = r0.length
            r3 = 0
        Lf:
            if (r3 >= r2) goto L19
            r4 = r0[r3]
            zzl(r4)
            int r3 = r3 + 1
            goto Lf
        L19:
            boolean r0 = r5.exists()
            if (r0 == 0) goto L3b
            boolean r0 = r5.delete()
            if (r0 == 0) goto L26
            goto L3b
        L26:
            java.io.IOException r0 = new java.io.IOException
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r5 = r5.getAbsolutePath()
            r2[r1] = r5
            java.lang.String r5 = "Failed to delete '%s'"
            java.lang.String r5 = java.lang.String.format(r5, r2)
            r0.<init>(r5)
            throw r0
        L3b:
            return
    }

    public static void zzm(java.io.File r2) {
            r0 = 0
            r1 = 1
            r2.setWritable(r0, r1)
            r2.setWritable(r0, r0)
            return
    }

    public static boolean zzp(java.io.File r0) {
            boolean r0 = r0.canWrite()
            if (r0 != 0) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    private static java.io.File zzq(java.io.File r1, java.lang.String r2) throws java.io.IOException {
            java.io.File r0 = new java.io.File
            r0.<init>(r1, r2)
            java.lang.String r2 = r0.getCanonicalPath()
            java.lang.String r1 = r1.getCanonicalPath()
            boolean r1 = r2.startsWith(r1)
            if (r1 == 0) goto L14
            return r0
        L14:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "split ID cannot be placed in target directory"
            r1.<init>(r2)
            throw r1
    }

    private final java.io.File zzr() throws java.io.IOException {
            r3 = this;
            java.io.File r0 = new java.io.File
            java.io.File r1 = r3.zzw()
            java.lang.String r2 = "native-libraries"
            r0.<init>(r1, r2)
            zzu(r0)
            return r0
    }

    private final java.io.File zzs(java.lang.String r2) throws java.io.IOException {
            r1 = this;
            java.io.File r0 = r1.zzr()
            java.io.File r2 = zzq(r0, r2)
            zzu(r2)
            return r2
    }

    private final java.io.File zzt() throws java.io.IOException {
            r3 = this;
            java.io.File r0 = new java.io.File
            java.io.File r1 = r3.zzw()
            java.lang.String r2 = "verified-splits"
            r0.<init>(r1, r2)
            zzu(r0)
            return r0
    }

    private static java.io.File zzu(java.io.File r3) throws java.io.IOException {
            boolean r0 = r3.exists()
            if (r0 == 0) goto L15
            boolean r0 = r3.isDirectory()
            if (r0 == 0) goto Ld
            return r3
        Ld:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "File input must be directory when it exists."
            r3.<init>(r0)
            throw r3
        L15:
            r3.mkdirs()
            boolean r0 = r3.isDirectory()
            if (r0 != 0) goto L3e
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r3 = r3.getAbsolutePath()
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r1 = "Unable to create directory: "
            int r2 = r3.length()
            if (r2 == 0) goto L35
            java.lang.String r3 = r1.concat(r3)
            goto L3a
        L35:
            java.lang.String r3 = new java.lang.String
            r3.<init>(r1)
        L3a:
            r0.<init>(r3)
            throw r0
        L3e:
            return r3
    }

    private final java.io.File zzv() throws java.io.IOException {
            r3 = this;
            java.io.File r0 = r3.zzc
            if (r0 != 0) goto L17
            android.content.Context r0 = r3.zzb
            if (r0 == 0) goto Lf
            java.io.File r0 = r0.getFilesDir()
            r3.zzc = r0
            goto L17
        Lf:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "context must be non-null to populate null filesDir"
            r0.<init>(r1)
            throw r0
        L17:
            java.io.File r0 = new java.io.File
            java.io.File r1 = r3.zzc
            java.lang.String r2 = "splitcompat"
            r0.<init>(r1, r2)
            zzu(r0)
            return r0
    }

    private final java.io.File zzw() throws java.io.IOException {
            r4 = this;
            java.io.File r0 = new java.io.File
            java.io.File r1 = r4.zzv()
            long r2 = r4.zza
            java.lang.String r2 = java.lang.Long.toString(r2)
            r0.<init>(r1, r2)
            zzu(r0)
            return r0
    }

    private static java.lang.String zzx(java.lang.String r1) {
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r0 = ".apk"
            java.lang.String r1 = r1.concat(r0)
            return r1
    }

    public final java.io.File zza(java.lang.String r4) throws java.io.IOException {
            r3 = this;
            java.io.File r0 = new java.io.File
            java.io.File r1 = r3.zzw()
            java.lang.String r2 = "dex"
            r0.<init>(r1, r2)
            zzu(r0)
            java.io.File r4 = zzq(r0, r4)
            zzu(r4)
            return r4
    }

    public final java.io.File zzb() throws java.io.IOException {
            r3 = this;
            java.io.File r0 = new java.io.File
            java.io.File r1 = r3.zzw()
            java.lang.String r2 = "unverified-splits"
            r0.<init>(r1, r2)
            zzu(r0)
            return r0
    }

    public final java.io.File zzc(java.lang.String r1, java.lang.String r2) throws java.io.IOException {
            r0 = this;
            java.io.File r1 = r0.zzs(r1)
            java.io.File r1 = zzq(r1, r2)
            return r1
    }

    public final java.io.File zzd() throws java.io.IOException {
            r3 = this;
            java.io.File r0 = new java.io.File
            java.io.File r1 = r3.zzw()
            java.lang.String r2 = "lock.tmp"
            r0.<init>(r1, r2)
            return r0
    }

    public final java.io.File zze(java.lang.String r2) throws java.io.IOException {
            r1 = this;
            java.io.File r0 = r1.zzb()
            java.lang.String r2 = zzx(r2)
            java.io.File r2 = zzq(r0, r2)
            return r2
    }

    public final java.io.File zzf(java.io.File r2) throws java.io.IOException {
            r1 = this;
            java.io.File r0 = r1.zzt()
            java.lang.String r2 = r2.getName()
            java.io.File r2 = zzq(r0, r2)
            return r2
    }

    public final java.io.File zzg(java.lang.String r2) throws java.io.IOException {
            r1 = this;
            java.io.File r0 = r1.zzt()
            java.lang.String r2 = zzx(r2)
            java.io.File r2 = zzq(r0, r2)
            return r2
    }

    public final java.util.List zzh() throws java.io.IOException {
            r6 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.io.File r1 = r6.zzr()
            java.io.File[] r1 = r1.listFiles()
            if (r1 == 0) goto L25
            int r2 = r1.length
            r3 = 0
        L11:
            if (r3 >= r2) goto L25
            r4 = r1[r3]
            boolean r5 = r4.isDirectory()
            if (r5 == 0) goto L22
            java.lang.String r4 = r4.getName()
            r0.add(r4)
        L22:
            int r3 = r3 + 1
            goto L11
        L25:
            return r0
    }

    public final java.util.Set zzi(java.lang.String r6) throws java.io.IOException {
            r5 = this;
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            java.io.File r6 = r5.zzs(r6)
            java.io.File[] r6 = r6.listFiles()
            if (r6 == 0) goto L21
            int r1 = r6.length
            r2 = 0
        L11:
            if (r2 >= r1) goto L21
            r3 = r6[r2]
            boolean r4 = r3.isFile()
            if (r4 == 0) goto L1e
            r0.add(r3)
        L1e:
            int r2 = r2 + 1
            goto L11
        L21:
            return r0
    }

    public final java.util.Set zzj() throws java.io.IOException {
            r8 = this;
            java.io.File r0 = r8.zzt()
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            java.io.File[] r0 = r0.listFiles()
            if (r0 == 0) goto L47
            int r2 = r0.length
            r3 = 0
            r4 = 0
        L12:
            if (r4 >= r2) goto L47
            r5 = r0[r4]
            boolean r6 = r5.isFile()
            if (r6 == 0) goto L44
            java.lang.String r6 = r5.getName()
            java.lang.String r7 = ".apk"
            boolean r6 = r6.endsWith(r7)
            if (r6 == 0) goto L44
            boolean r6 = zzp(r5)
            if (r6 == 0) goto L44
            java.lang.String r6 = r5.getName()
            int r7 = r6.length()
            int r7 = r7 + (-4)
            java.lang.String r6 = r6.substring(r3, r7)
            com.google.android.play.core.splitcompat.zzb r7 = new com.google.android.play.core.splitcompat.zzb
            r7.<init>(r5, r6)
            r1.add(r7)
        L44:
            int r4 = r4 + 1
            goto L12
        L47:
            return r1
    }

    public final void zzk() throws java.io.IOException {
            r10 = this;
            java.io.File r0 = r10.zzv()
            java.lang.String[] r1 = r0.list()
            if (r1 == 0) goto L56
            int r2 = r1.length
            r3 = 0
        Lc:
            if (r3 >= r2) goto L56
            r4 = r1[r3]
            long r5 = r10.zza
            java.lang.String r5 = java.lang.Long.toString(r5)
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L53
            java.io.File r5 = new java.io.File
            r5.<init>(r0, r4)
            java.lang.String r4 = r5.toString()
            long r6 = r10.zza
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            int r9 = r4.length()
            int r9 = r9 + 118
            r8.<init>(r9)
            java.lang.String r9 = "FileStorage: removing directory for different version code (directory = "
            r8.append(r9)
            r8.append(r4)
            java.lang.String r4 = ", current version code = "
            r8.append(r4)
            r8.append(r6)
            java.lang.String r4 = ")"
            r8.append(r4)
            java.lang.String r4 = r8.toString()
            java.lang.String r6 = "SplitCompat"
            android.util.Log.d(r6, r4)
            zzl(r5)
        L53:
            int r3 = r3 + 1
            goto Lc
        L56:
            return
    }

    public final void zzn(java.lang.String r1) throws java.io.IOException {
            r0 = this;
            java.io.File r1 = r0.zzs(r1)
            zzl(r1)
            return
    }

    public final void zzo(java.io.File r3) throws java.io.IOException {
            r2 = this;
            java.io.File r0 = r3.getParentFile()
            java.io.File r0 = r0.getParentFile()
            java.io.File r1 = r2.zzr()
            boolean r0 = r0.equals(r1)
            java.lang.String r1 = "File to remove is not a native library"
            com.google.android.play.core.internal.zzci.zzb(r0, r1)
            zzl(r3)
            return
    }
}
