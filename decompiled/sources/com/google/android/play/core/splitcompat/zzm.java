package com.google.android.play.core.splitcompat;

/* JADX INFO: compiled from: com.google.android.play:core@@1.10.3 */
/* JADX INFO: loaded from: classes.dex */
public final class zzm {
    private static final java.util.regex.Pattern zza = null;
    private final com.google.android.play.core.splitcompat.zze zzb;

    static {
            java.lang.String r0 = "lib/([^/]+)/(.*\\.so)$"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            com.google.android.play.core.splitcompat.zzm.zza = r0
            return
    }

    public zzm(com.google.android.play.core.splitcompat.zze r1) throws java.io.IOException {
            r0 = this;
            r0.<init>()
            r0.zzb = r1
            return
    }

    public static /* bridge */ /* synthetic */ java.util.Set zza(com.google.android.play.core.splitcompat.zzm r2, java.util.Set r3, com.google.android.play.core.splitcompat.zzs r4, java.util.zip.ZipFile r5) {
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            com.google.android.play.core.splitcompat.zzi r1 = new com.google.android.play.core.splitcompat.zzi
            r1.<init>(r0, r4, r5)
            r2.zzf(r4, r3, r1)
            return r0
    }

    public static /* bridge */ /* synthetic */ void zzd(com.google.android.play.core.splitcompat.zzm r0, com.google.android.play.core.splitcompat.zzs r1, java.util.Set r2, com.google.android.play.core.splitcompat.zzk r3) {
            r0.zzf(r1, r2, r3)
            return
    }

    @androidx.annotation.RequiresApi(21)
    private static void zze(com.google.android.play.core.splitcompat.zzs r13, com.google.android.play.core.splitcompat.zzj r14) throws java.io.IOException {
            java.util.zip.ZipFile r0 = new java.util.zip.ZipFile     // Catch: java.io.IOException -> Lf3
            java.io.File r1 = r13.zza()     // Catch: java.io.IOException -> Lf3
            r0.<init>(r1)     // Catch: java.io.IOException -> Lf3
            java.lang.String r13 = r13.zzb()     // Catch: java.io.IOException -> Lf1
            java.util.HashMap r1 = new java.util.HashMap     // Catch: java.io.IOException -> Lf1
            r1.<init>()     // Catch: java.io.IOException -> Lf1
            java.util.Enumeration r2 = r0.entries()     // Catch: java.io.IOException -> Lf1
        L16:
            boolean r3 = r2.hasMoreElements()     // Catch: java.io.IOException -> Lf1
            r4 = 2
            java.lang.String r5 = "SplitCompat"
            r6 = 0
            r7 = 1
            if (r3 == 0) goto L6a
            java.lang.Object r3 = r2.nextElement()     // Catch: java.io.IOException -> Lf1
            java.util.zip.ZipEntry r3 = (java.util.zip.ZipEntry) r3     // Catch: java.io.IOException -> Lf1
            java.lang.String r8 = r3.getName()     // Catch: java.io.IOException -> Lf1
            java.util.regex.Pattern r9 = com.google.android.play.core.splitcompat.zzm.zza     // Catch: java.io.IOException -> Lf1
            java.util.regex.Matcher r8 = r9.matcher(r8)     // Catch: java.io.IOException -> Lf1
            boolean r9 = r8.matches()     // Catch: java.io.IOException -> Lf1
            if (r9 == 0) goto L16
            java.lang.String r9 = r8.group(r7)     // Catch: java.io.IOException -> Lf1
            java.lang.String r8 = r8.group(r4)     // Catch: java.io.IOException -> Lf1
            r10 = 3
            java.lang.Object[] r10 = new java.lang.Object[r10]     // Catch: java.io.IOException -> Lf1
            r10[r6] = r13     // Catch: java.io.IOException -> Lf1
            r10[r7] = r8     // Catch: java.io.IOException -> Lf1
            r10[r4] = r9     // Catch: java.io.IOException -> Lf1
            java.lang.String r4 = "NativeLibraryExtractor: split '%s' has native library '%s' for ABI '%s'"
            java.lang.String r4 = java.lang.String.format(r4, r10)     // Catch: java.io.IOException -> Lf1
            android.util.Log.d(r5, r4)     // Catch: java.io.IOException -> Lf1
            java.lang.Object r4 = r1.get(r9)     // Catch: java.io.IOException -> Lf1
            java.util.Set r4 = (java.util.Set) r4     // Catch: java.io.IOException -> Lf1
            if (r4 != 0) goto L61
            java.util.HashSet r4 = new java.util.HashSet     // Catch: java.io.IOException -> Lf1
            r4.<init>()     // Catch: java.io.IOException -> Lf1
            r1.put(r9, r4)     // Catch: java.io.IOException -> Lf1
        L61:
            com.google.android.play.core.splitcompat.zzl r5 = new com.google.android.play.core.splitcompat.zzl     // Catch: java.io.IOException -> Lf1
            r5.<init>(r3, r8)     // Catch: java.io.IOException -> Lf1
            r4.add(r5)     // Catch: java.io.IOException -> Lf1
            goto L16
        L6a:
            java.util.HashMap r13 = new java.util.HashMap     // Catch: java.io.IOException -> Lf1
            r13.<init>()     // Catch: java.io.IOException -> Lf1
            java.lang.String[] r2 = android.os.Build.SUPPORTED_ABIS     // Catch: java.io.IOException -> Lf1
            int r3 = r2.length     // Catch: java.io.IOException -> Lf1
            r8 = 0
        L73:
            if (r8 >= r3) goto Le1
            r9 = r2[r8]     // Catch: java.io.IOException -> Lf1
            boolean r10 = r1.containsKey(r9)     // Catch: java.io.IOException -> Lf1
            if (r10 == 0) goto Ld1
            java.lang.Object[] r10 = new java.lang.Object[r7]     // Catch: java.io.IOException -> Lf1
            r10[r6] = r9     // Catch: java.io.IOException -> Lf1
            java.lang.String r11 = "NativeLibraryExtractor: there are native libraries for supported ABI %s; will use this ABI"
            java.lang.String r10 = java.lang.String.format(r11, r10)     // Catch: java.io.IOException -> Lf1
            android.util.Log.d(r5, r10)     // Catch: java.io.IOException -> Lf1
            java.lang.Object r10 = r1.get(r9)     // Catch: java.io.IOException -> Lf1
            java.util.Set r10 = (java.util.Set) r10     // Catch: java.io.IOException -> Lf1
            java.util.Iterator r10 = r10.iterator()     // Catch: java.io.IOException -> Lf1
        L94:
            boolean r11 = r10.hasNext()     // Catch: java.io.IOException -> Lf1
            if (r11 == 0) goto Lde
            java.lang.Object r11 = r10.next()     // Catch: java.io.IOException -> Lf1
            com.google.android.play.core.splitcompat.zzl r11 = (com.google.android.play.core.splitcompat.zzl) r11     // Catch: java.io.IOException -> Lf1
            java.lang.String r12 = r11.zza     // Catch: java.io.IOException -> Lf1
            boolean r12 = r13.containsKey(r12)     // Catch: java.io.IOException -> Lf1
            if (r12 == 0) goto Lba
            java.lang.Object[] r12 = new java.lang.Object[r4]     // Catch: java.io.IOException -> Lf1
            java.lang.String r11 = r11.zza     // Catch: java.io.IOException -> Lf1
            r12[r6] = r11     // Catch: java.io.IOException -> Lf1
            r12[r7] = r9     // Catch: java.io.IOException -> Lf1
            java.lang.String r11 = "NativeLibraryExtractor: skipping library %s for ABI %s; already present for a better ABI"
            java.lang.String r11 = java.lang.String.format(r11, r12)     // Catch: java.io.IOException -> Lf1
            android.util.Log.d(r5, r11)     // Catch: java.io.IOException -> Lf1
            goto L94
        Lba:
            java.lang.String r12 = r11.zza     // Catch: java.io.IOException -> Lf1
            r13.put(r12, r11)     // Catch: java.io.IOException -> Lf1
            java.lang.Object[] r12 = new java.lang.Object[r4]     // Catch: java.io.IOException -> Lf1
            java.lang.String r11 = r11.zza     // Catch: java.io.IOException -> Lf1
            r12[r6] = r11     // Catch: java.io.IOException -> Lf1
            r12[r7] = r9     // Catch: java.io.IOException -> Lf1
            java.lang.String r11 = "NativeLibraryExtractor: using library %s for ABI %s"
            java.lang.String r11 = java.lang.String.format(r11, r12)     // Catch: java.io.IOException -> Lf1
            android.util.Log.d(r5, r11)     // Catch: java.io.IOException -> Lf1
            goto L94
        Ld1:
            java.lang.Object[] r10 = new java.lang.Object[r7]     // Catch: java.io.IOException -> Lf1
            r10[r6] = r9     // Catch: java.io.IOException -> Lf1
            java.lang.String r9 = "NativeLibraryExtractor: there are no native libraries for supported ABI %s"
            java.lang.String r9 = java.lang.String.format(r9, r10)     // Catch: java.io.IOException -> Lf1
            android.util.Log.d(r5, r9)     // Catch: java.io.IOException -> Lf1
        Lde:
            int r8 = r8 + 1
            goto L73
        Le1:
            java.util.HashSet r1 = new java.util.HashSet     // Catch: java.io.IOException -> Lf1
            java.util.Collection r13 = r13.values()     // Catch: java.io.IOException -> Lf1
            r1.<init>(r13)     // Catch: java.io.IOException -> Lf1
            r14.zza(r0, r1)     // Catch: java.io.IOException -> Lf1
            r0.close()     // Catch: java.io.IOException -> Lf1
            return
        Lf1:
            r13 = move-exception
            goto Lf5
        Lf3:
            r13 = move-exception
            r0 = 0
        Lf5:
            if (r0 == 0) goto Lfa
            r0.close()     // Catch: java.io.IOException -> Lfa
        Lfa:
            throw r13
    }

    private final void zzf(com.google.android.play.core.splitcompat.zzs r9, java.util.Set r10, com.google.android.play.core.splitcompat.zzk r11) throws java.io.IOException {
            r8 = this;
            java.util.Iterator r10 = r10.iterator()
        L4:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L3c
            java.lang.Object r0 = r10.next()
            com.google.android.play.core.splitcompat.zzl r0 = (com.google.android.play.core.splitcompat.zzl) r0
            com.google.android.play.core.splitcompat.zze r1 = r8.zzb
            java.lang.String r2 = r9.zzb()
            java.lang.String r3 = r0.zza
            java.io.File r1 = r1.zzc(r2, r3)
            boolean r2 = r1.exists()
            r3 = 0
            if (r2 == 0) goto L38
            long r4 = r1.length()
            java.util.zip.ZipEntry r2 = r0.zzb
            long r6 = r2.getSize()
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 != 0) goto L38
            boolean r2 = com.google.android.play.core.splitcompat.zze.zzp(r1)
            if (r2 == 0) goto L38
            r3 = 1
        L38:
            r11.zza(r0, r1, r3)
            goto L4
        L3c:
            return
    }

    @androidx.annotation.Nullable
    @androidx.annotation.RequiresApi(21)
    public final java.util.Set zzb(com.google.android.play.core.splitcompat.zzs r4) throws java.io.IOException {
            r3 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 1
            r0.<init>(r1)
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            com.google.android.play.core.splitcompat.zzg r2 = new com.google.android.play.core.splitcompat.zzg
            r2.<init>(r3, r4, r1, r0)
            zze(r4, r2)
            boolean r4 = r0.get()
            if (r4 == 0) goto L1a
            return r1
        L1a:
            r4 = 0
            return r4
    }

    @androidx.annotation.RequiresApi(21)
    public final java.util.Set zzc() throws java.io.IOException {
            r12 = this;
            java.lang.String r0 = "SplitCompat"
            java.lang.String r1 = "NativeLibraryExtractor: synchronizing native libraries"
            android.util.Log.d(r0, r1)
            com.google.android.play.core.splitcompat.zze r1 = r12.zzb
            java.util.Set r1 = r1.zzj()
            com.google.android.play.core.splitcompat.zze r2 = r12.zzb
            java.util.List r2 = r2.zzh()
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            java.util.Iterator r2 = r2.iterator()
        L19:
            boolean r3 = r2.hasNext()
            r4 = 0
            r5 = 1
            if (r3 == 0) goto L58
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            r6 = r1
            java.util.HashSet r6 = (java.util.HashSet) r6
            java.util.Iterator r6 = r6.iterator()
        L2e:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L45
            java.lang.Object r7 = r6.next()
            com.google.android.play.core.splitcompat.zzs r7 = (com.google.android.play.core.splitcompat.zzs) r7
            java.lang.String r7 = r7.zzb()
            boolean r7 = r7.equals(r3)
            if (r7 == 0) goto L2e
            goto L19
        L45:
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r5[r4] = r3
            java.lang.String r4 = "NativeLibraryExtractor: extracted split '%s' has no corresponding split; deleting"
            java.lang.String r4 = java.lang.String.format(r4, r5)
            android.util.Log.i(r0, r4)
            com.google.android.play.core.splitcompat.zze r4 = r12.zzb
            r4.zzn(r3)
            goto L19
        L58:
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            java.util.HashSet r1 = (java.util.HashSet) r1
            java.util.Iterator r1 = r1.iterator()
        L63:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto Lcb
            java.lang.Object r3 = r1.next()
            com.google.android.play.core.splitcompat.zzs r3 = (com.google.android.play.core.splitcompat.zzs) r3
            java.util.HashSet r6 = new java.util.HashSet
            r6.<init>()
            com.google.android.play.core.splitcompat.zzh r7 = new com.google.android.play.core.splitcompat.zzh
            r7.<init>(r12, r6, r3)
            zze(r3, r7)
            com.google.android.play.core.splitcompat.zze r7 = r12.zzb
            java.lang.String r8 = r3.zzb()
            java.util.Set r7 = r7.zzi(r8)
            java.util.HashSet r7 = (java.util.HashSet) r7
            java.util.Iterator r7 = r7.iterator()
        L8c:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto Lc7
            java.lang.Object r8 = r7.next()
            java.io.File r8 = (java.io.File) r8
            boolean r9 = r6.contains(r8)
            if (r9 != 0) goto L8c
            r9 = 3
            java.lang.Object[] r9 = new java.lang.Object[r9]
            java.lang.String r10 = r8.getAbsolutePath()
            r9[r4] = r10
            java.lang.String r10 = r3.zzb()
            r9[r5] = r10
            r10 = 2
            java.io.File r11 = r3.zza()
            java.lang.String r11 = r11.getAbsolutePath()
            r9[r10] = r11
            java.lang.String r10 = "NativeLibraryExtractor: file '%s' found in split '%s' that is not in the split file '%s'; removing"
            java.lang.String r9 = java.lang.String.format(r10, r9)
            android.util.Log.i(r0, r9)
            com.google.android.play.core.splitcompat.zze r9 = r12.zzb
            r9.zzo(r8)
            goto L8c
        Lc7:
            r2.addAll(r6)
            goto L63
        Lcb:
            return r2
    }
}
