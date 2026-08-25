package com.google.android.play.core.assetpacks;

/* JADX INFO: compiled from: com.google.android.play:core@@1.10.3 */
/* JADX INFO: loaded from: classes.dex */
final class zzbk extends com.google.android.play.core.internal.zzcm {
    private final java.io.File zza;
    private final java.io.File zzb;
    private final java.util.NavigableMap zzc;

    public zzbk(java.io.File r5, java.io.File r6) throws java.io.IOException {
            r4 = this;
            r4.<init>()
            r4.zza = r5
            r4.zzb = r6
            java.util.TreeMap r0 = new java.util.TreeMap
            r0.<init>()
            r4.zzc = r0
            java.util.List r0 = com.google.android.play.core.assetpacks.zzep.zza(r5, r6)
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L3c
            java.util.Iterator r5 = r0.iterator()
            r0 = 0
        L20:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L3b
            java.lang.Object r6 = r5.next()
            java.io.File r6 = (java.io.File) r6
            java.util.NavigableMap r2 = r4.zzc
            java.lang.Long r3 = java.lang.Long.valueOf(r0)
            r2.put(r3, r6)
            long r2 = r6.length()
            long r0 = r0 + r2
            goto L20
        L3b:
            return
        L3c:
            com.google.android.play.core.assetpacks.zzck r0 = new com.google.android.play.core.assetpacks.zzck
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r5
            r5 = 1
            r1[r5] = r6
            java.lang.String r5 = "Virtualized slice archive empty for %s, %s"
            java.lang.String r5 = java.lang.String.format(r5, r1)
            r0.<init>(r5)
            throw r0
    }

    private final java.io.InputStream zzd(long r6, java.lang.Long r8) throws java.io.IOException {
            r5 = this;
            java.io.FileInputStream r0 = new java.io.FileInputStream
            java.util.NavigableMap r1 = r5.zzc
            java.lang.Object r1 = r1.get(r8)
            java.io.File r1 = (java.io.File) r1
            r0.<init>(r1)
            long r1 = r8.longValue()
            long r1 = r6 - r1
            long r1 = r0.skip(r1)
            long r3 = r8.longValue()
            long r6 = r6 - r3
            int r3 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r3 != 0) goto L21
            return r0
        L21:
            com.google.android.play.core.assetpacks.zzck r6 = new com.google.android.play.core.assetpacks.zzck
            r7 = 1
            java.lang.Object[] r7 = new java.lang.Object[r7]
            r0 = 0
            r7[r0] = r8
            java.lang.String r8 = "Virtualized slice archive corrupt, could not skip in file with key %s"
            java.lang.String r7 = java.lang.String.format(r8, r7)
            r6.<init>(r7)
            throw r6
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
            r0 = this;
            return
    }

    @Override // com.google.android.play.core.internal.zzcm
    public final long zza() {
            r5 = this;
            java.util.NavigableMap r0 = r5.zzc
            java.util.Map$Entry r0 = r0.lastEntry()
            java.lang.Object r1 = r0.getKey()
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            java.lang.Object r0 = r0.getValue()
            java.io.File r0 = (java.io.File) r0
            long r3 = r0.length()
            long r3 = r3 + r1
            return r3
    }

    @Override // com.google.android.play.core.internal.zzcm
    public final java.io.InputStream zzb(long r9, long r11) throws java.io.IOException {
            r8 = this;
            r0 = 1
            r1 = 2
            r2 = 0
            r4 = 0
            int r5 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r5 < 0) goto Laa
            int r5 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r5 < 0) goto Laa
            long r2 = r9 + r11
            long r5 = r8.zza()
            int r7 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r7 > 0) goto L8c
            java.util.NavigableMap r0 = r8.zzc
            java.lang.Long r1 = java.lang.Long.valueOf(r9)
            java.lang.Object r0 = r0.floorKey(r1)
            java.lang.Long r0 = (java.lang.Long) r0
            java.util.NavigableMap r1 = r8.zzc
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            java.lang.Object r1 = r1.floorKey(r2)
            java.lang.Long r1 = (java.lang.Long) r1
            boolean r2 = r0.equals(r1)
            if (r2 == 0) goto L3f
            com.google.android.play.core.assetpacks.zzbj r1 = new com.google.android.play.core.assetpacks.zzbj
            java.io.InputStream r9 = r8.zzd(r9, r0)
            r1.<init>(r9, r11)
            return r1
        L3f:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.io.InputStream r3 = r8.zzd(r9, r0)
            r2.add(r3)
            java.util.NavigableMap r3 = r8.zzc
            java.util.NavigableMap r0 = r3.subMap(r0, r4, r1, r4)
            java.util.Collection r0 = r0.values()
            boolean r3 = r0.isEmpty()
            if (r3 != 0) goto L67
            com.google.android.play.core.assetpacks.zzdr r3 = new com.google.android.play.core.assetpacks.zzdr
            java.util.Enumeration r0 = java.util.Collections.enumeration(r0)
            r3.<init>(r0)
            r2.add(r3)
        L67:
            com.google.android.play.core.assetpacks.zzbj r0 = new com.google.android.play.core.assetpacks.zzbj
            java.io.FileInputStream r3 = new java.io.FileInputStream
            java.util.NavigableMap r4 = r8.zzc
            java.lang.Object r4 = r4.get(r1)
            java.io.File r4 = (java.io.File) r4
            r3.<init>(r4)
            long r4 = r1.longValue()
            long r4 = r4 - r9
            long r11 = r11 - r4
            r0.<init>(r3, r11)
            r2.add(r0)
            java.io.SequenceInputStream r9 = new java.io.SequenceInputStream
            java.util.Enumeration r10 = java.util.Collections.enumeration(r2)
            r9.<init>(r10)
            return r9
        L8c:
            com.google.android.play.core.assetpacks.zzck r9 = new com.google.android.play.core.assetpacks.zzck
            java.lang.Object[] r10 = new java.lang.Object[r1]
            long r11 = r8.zza()
            java.lang.Long r11 = java.lang.Long.valueOf(r11)
            r10[r4] = r11
            java.lang.Long r11 = java.lang.Long.valueOf(r2)
            r10[r0] = r11
            java.lang.String r11 = "Trying to access archive out of bounds. Archive ends at: %s. Tried accessing: %s"
            java.lang.String r10 = java.lang.String.format(r11, r10)
            r9.<init>(r10)
            throw r9
        Laa:
            com.google.android.play.core.assetpacks.zzck r2 = new com.google.android.play.core.assetpacks.zzck
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.Long r9 = java.lang.Long.valueOf(r9)
            r1[r4] = r9
            java.lang.Long r9 = java.lang.Long.valueOf(r11)
            r1[r0] = r9
            java.lang.String r9 = "Invalid input parameters %s, %s"
            java.lang.String r9 = java.lang.String.format(r9, r1)
            r2.<init>(r9)
            throw r2
    }
}
