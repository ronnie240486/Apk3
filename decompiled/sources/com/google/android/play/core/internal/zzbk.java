package com.google.android.play.core.internal;

/* JADX INFO: compiled from: com.google.android.play:core@@1.10.3 */
/* JADX INFO: loaded from: classes.dex */
final class zzbk implements com.google.android.play.core.internal.zzaz {
    public zzbk() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void zzc(java.lang.ClassLoader r4, java.util.Set r5, com.google.android.play.core.internal.zzbj r6) {
            java.lang.Class<com.google.android.play.core.splitinstall.zzn> r0 = com.google.android.play.core.splitinstall.zzn.class
            boolean r1 = r5.isEmpty()
            if (r1 == 0) goto L9
            return
        L9:
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            java.util.Iterator r5 = r5.iterator()
        L12:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L26
            java.lang.Object r2 = r5.next()
            java.io.File r2 = (java.io.File) r2
            java.io.File r2 = r2.getParentFile()
            r1.add(r2)
            goto L12
        L26:
            java.lang.Object r4 = com.google.android.play.core.internal.zzbf.zzc(r4)
            java.lang.String r5 = "nativeLibraryDirectories"
            java.lang.Class<java.util.List> r2 = java.util.List.class
            com.google.android.play.core.internal.zzbv r5 = com.google.android.play.core.internal.zzbw.zzb(r4, r5, r2)
            monitor-enter(r0)
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L8a
            java.lang.Object r3 = r5.zzc()     // Catch: java.lang.Throwable -> L8a
            java.util.Collection r3 = (java.util.Collection) r3     // Catch: java.lang.Throwable -> L8a
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L8a
            r1.removeAll(r2)     // Catch: java.lang.Throwable -> L8a
            r2.addAll(r1)     // Catch: java.lang.Throwable -> L8a
            r5.zze(r2)     // Catch: java.lang.Throwable -> L8a
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L8a
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r1)
            r1 = 0
            java.lang.Object[] r6 = r6.zza(r4, r2, r1, r5)
            boolean r1 = r5.isEmpty()
            if (r1 != 0) goto L75
            com.google.android.play.core.internal.zzbt r4 = new com.google.android.play.core.internal.zzbt
            java.lang.String r6 = "Error in makePathElements"
            r4.<init>(r6)
            int r6 = r5.size()
            r0 = 0
        L69:
            if (r0 >= r6) goto L74
            java.lang.Object r1 = r5.get(r0)
            java.io.IOException r1 = (java.io.IOException) r1
            int r0 = r0 + 1
            goto L69
        L74:
            throw r4
        L75:
            monitor-enter(r0)
            java.lang.String r5 = "nativeLibraryPathElements"
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            com.google.android.play.core.internal.zzbu r4 = com.google.android.play.core.internal.zzbw.zza(r4, r5, r1)     // Catch: java.lang.Throwable -> L87
            java.util.List r5 = java.util.Arrays.asList(r6)     // Catch: java.lang.Throwable -> L87
            r4.zzb(r5)     // Catch: java.lang.Throwable -> L87
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L87
            return
        L87:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L87
            throw r4
        L8a:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L8a
            throw r4
    }

    public static boolean zzd(java.lang.ClassLoader r7, java.io.File r8, java.io.File r9, boolean r10, java.lang.String r11) {
            com.google.android.play.core.internal.zzbh r4 = new com.google.android.play.core.internal.zzbh
            r4.<init>()
            com.google.android.play.core.internal.zzbc r6 = new com.google.android.play.core.internal.zzbc
            r6.<init>()
            java.lang.String r5 = "zip"
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            boolean r7 = com.google.android.play.core.internal.zzbf.zze(r0, r1, r2, r3, r4, r5, r6)
            return r7
    }

    @Override // com.google.android.play.core.internal.zzaz
    public final void zza(java.lang.ClassLoader r2, java.util.Set r3) {
            r1 = this;
            com.google.android.play.core.internal.zzbi r0 = new com.google.android.play.core.internal.zzbi
            r0.<init>()
            zzc(r2, r3, r0)
            return
    }

    @Override // com.google.android.play.core.internal.zzaz
    public final boolean zzb(java.lang.ClassLoader r2, java.io.File r3, java.io.File r4, boolean r5) {
            r1 = this;
            java.lang.String r0 = "zip"
            boolean r2 = zzd(r2, r3, r4, r5, r0)
            return r2
    }
}
