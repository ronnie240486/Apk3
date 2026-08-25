package com.google.android.play.core.internal;

/* JADX INFO: compiled from: com.google.android.play:core@@1.10.3 */
/* JADX INFO: loaded from: classes.dex */
final class zzbf implements com.google.android.play.core.internal.zzaz {
    public zzbf() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.Object zzc(java.lang.ClassLoader r2) {
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            java.lang.String r1 = "pathList"
            com.google.android.play.core.internal.zzbv r2 = com.google.android.play.core.internal.zzbw.zzb(r2, r1, r0)
            java.lang.Object r2 = r2.zzc()
            return r2
    }

    public static void zzd(java.lang.ClassLoader r5, java.util.Set r6) {
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L7
            return
        L7:
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            java.util.Iterator r6 = r6.iterator()
        L10:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L47
            java.lang.Object r1 = r6.next()
            java.io.File r1 = (java.io.File) r1
            java.io.File r2 = r1.getParentFile()
            java.lang.String r2 = r2.getAbsolutePath()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r3 = "Adding native library parent directory: "
            int r4 = r2.length()
            if (r4 == 0) goto L35
            java.lang.String r2 = r3.concat(r2)
            goto L3a
        L35:
            java.lang.String r2 = new java.lang.String
            r2.<init>(r3)
        L3a:
            java.lang.String r3 = "Splitcompat"
            android.util.Log.d(r3, r2)
            java.io.File r1 = r1.getParentFile()
            r0.add(r1)
            goto L10
        L47:
            java.lang.Object r5 = zzc(r5)
            java.lang.String r6 = "nativeLibraryDirectories"
            java.lang.Class<java.io.File> r1 = java.io.File.class
            com.google.android.play.core.internal.zzbu r5 = com.google.android.play.core.internal.zzbw.zza(r5, r6, r1)
            java.lang.Object r6 = r5.zzc()
            java.io.File[] r6 = (java.io.File[]) r6
            java.util.List r6 = java.util.Arrays.asList(r6)
            r0.removeAll(r6)
            java.lang.Class<com.google.android.play.core.splitinstall.zzn> r6 = com.google.android.play.core.splitinstall.zzn.class
            monitor-enter(r6)
            int r1 = r0.size()     // Catch: java.lang.Throwable -> L84
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L84
            r3 = 30
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L84
            java.lang.String r3 = "Adding directories "
            r2.append(r3)     // Catch: java.lang.Throwable -> L84
            r2.append(r1)     // Catch: java.lang.Throwable -> L84
            java.lang.String r1 = "Splitcompat"
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L84
            android.util.Log.d(r1, r2)     // Catch: java.lang.Throwable -> L84
            r5.zzb(r0)     // Catch: java.lang.Throwable -> L84
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L84
            return
        L84:
            r5 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L84
            throw r5
    }

    public static boolean zze(java.lang.ClassLoader r6, java.io.File r7, java.io.File r8, boolean r9, com.google.android.play.core.internal.zzbe r10, java.lang.String r11, com.google.android.play.core.internal.zzbd r12) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.Object r6 = zzc(r6)
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            java.lang.String r2 = "dexElements"
            com.google.android.play.core.internal.zzbu r1 = com.google.android.play.core.internal.zzbw.zza(r6, r2, r1)
            java.lang.Object r2 = r1.zzc()
            java.lang.Object[] r2 = (java.lang.Object[]) r2
            java.util.List r2 = java.util.Arrays.asList(r2)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r2 = r2.iterator()
        L24:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L3e
            java.lang.Object r4 = r2.next()
            java.lang.Class<java.io.File> r5 = java.io.File.class
            com.google.android.play.core.internal.zzbv r4 = com.google.android.play.core.internal.zzbw.zzb(r4, r11, r5)
            java.lang.Object r4 = r4.zzc()
            java.io.File r4 = (java.io.File) r4
            r3.add(r4)
            goto L24
        L3e:
            boolean r11 = r3.contains(r8)
            r2 = 1
            if (r11 == 0) goto L46
            return r2
        L46:
            java.lang.String r11 = "SplitCompat"
            r3 = 0
            if (r9 != 0) goto L6f
            boolean r9 = r12.zza(r6, r8, r7)
            if (r9 != 0) goto L6f
            java.lang.String r6 = r8.getPath()
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.String r7 = "Should be optimized "
            int r8 = r6.length()
            if (r8 == 0) goto L66
            java.lang.String r6 = r7.concat(r6)
            goto L6b
        L66:
            java.lang.String r6 = new java.lang.String
            r6.<init>(r7)
        L6b:
            android.util.Log.w(r11, r6)
            return r3
        L6f:
            java.util.ArrayList r9 = new java.util.ArrayList
            java.util.Set r8 = java.util.Collections.singleton(r8)
            r9.<init>(r8)
            java.lang.Object[] r7 = r10.zza(r6, r9, r7, r0)
            java.util.List r7 = java.util.Arrays.asList(r7)
            r1.zza(r7)
            boolean r7 = r0.isEmpty()
            if (r7 != 0) goto Lae
            com.google.android.play.core.internal.zzbt r7 = new com.google.android.play.core.internal.zzbt
            java.lang.String r8 = "DexPathList.makeDexElement failed"
            r7.<init>(r8)
            int r9 = r0.size()
        L94:
            if (r3 >= r9) goto La2
            java.lang.Object r10 = r0.get(r3)
            java.io.IOException r10 = (java.io.IOException) r10
            android.util.Log.e(r11, r8, r10)
            int r3 = r3 + 1
            goto L94
        La2:
            java.lang.Class<java.io.IOException> r8 = java.io.IOException.class
            java.lang.String r9 = "dexElementsSuppressedExceptions"
            com.google.android.play.core.internal.zzbu r6 = com.google.android.play.core.internal.zzbw.zza(r6, r9, r8)
            r6.zza(r0)
            throw r7
        Lae:
            return r2
    }

    @Override // com.google.android.play.core.internal.zzaz
    public final void zza(java.lang.ClassLoader r1, java.util.Set r2) {
            r0 = this;
            zzd(r1, r2)
            return
    }

    @Override // com.google.android.play.core.internal.zzaz
    public final boolean zzb(java.lang.ClassLoader r8, java.io.File r9, java.io.File r10, boolean r11) {
            r7 = this;
            com.google.android.play.core.internal.zzbb r4 = new com.google.android.play.core.internal.zzbb
            r4.<init>()
            com.google.android.play.core.internal.zzbc r6 = new com.google.android.play.core.internal.zzbc
            r6.<init>()
            java.lang.String r5 = "zip"
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            boolean r8 = zze(r0, r1, r2, r3, r4, r5, r6)
            return r8
    }
}
