package com.google.android.play.core.assetpacks;

/* JADX INFO: compiled from: com.google.android.play:core@@1.10.3 */
/* JADX INFO: loaded from: classes.dex */
final class zzbh {
    private static final com.google.android.play.core.internal.zzag zza = null;
    private static final long zzb = 0;
    private static final long zzc = 0;
    private final android.content.Context zzd;
    private final com.google.android.play.core.assetpacks.zzed zze;

    static {
            com.google.android.play.core.internal.zzag r0 = new com.google.android.play.core.internal.zzag
            java.lang.String r1 = "AssetPackStorage"
            r0.<init>(r1)
            com.google.android.play.core.assetpacks.zzbh.zza = r0
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.DAYS
            r1 = 14
            long r1 = r0.toMillis(r1)
            com.google.android.play.core.assetpacks.zzbh.zzb = r1
            r1 = 28
            long r0 = r0.toMillis(r1)
            com.google.android.play.core.assetpacks.zzbh.zzc = r0
            return
    }

    public zzbh(android.content.Context r1, com.google.android.play.core.assetpacks.zzed r2) {
            r0 = this;
            r0.<init>()
            r0.zzd = r1
            r0.zze = r2
            return
    }

    private static long zzH(java.io.File r8, boolean r9) {
            boolean r0 = r8.exists()
            r1 = -1
            if (r0 != 0) goto L9
            return r1
        L9:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3 = 0
            if (r9 == 0) goto L22
            java.io.File[] r9 = r8.listFiles()
            int r9 = r9.length
            r4 = 1
            if (r9 <= r4) goto L22
            com.google.android.play.core.internal.zzag r9 = com.google.android.play.core.assetpacks.zzbh.zza
            java.lang.Object[] r4 = new java.lang.Object[r3]
            java.lang.String r5 = "Multiple pack versions found, using highest version code."
            r9.zze(r5, r4)
        L22:
            java.io.File[] r8 = r8.listFiles()     // Catch: java.lang.NumberFormatException -> L47
            int r9 = r8.length     // Catch: java.lang.NumberFormatException -> L47
            r4 = 0
        L28:
            if (r4 >= r9) goto L51
            r5 = r8[r4]     // Catch: java.lang.NumberFormatException -> L47
            java.lang.String r6 = r5.getName()     // Catch: java.lang.NumberFormatException -> L47
            java.lang.String r7 = "stale.tmp"
            boolean r6 = r6.equals(r7)     // Catch: java.lang.NumberFormatException -> L47
            if (r6 != 0) goto L44
            java.lang.String r5 = r5.getName()     // Catch: java.lang.NumberFormatException -> L47
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch: java.lang.NumberFormatException -> L47
            r0.add(r5)     // Catch: java.lang.NumberFormatException -> L47
        L44:
            int r4 = r4 + 1
            goto L28
        L47:
            r8 = move-exception
            com.google.android.play.core.internal.zzag r9 = com.google.android.play.core.assetpacks.zzbh.zza
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r4 = "Corrupt asset pack directories."
            r9.zzc(r8, r4, r3)
        L51:
            boolean r8 = r0.isEmpty()
            if (r8 == 0) goto L58
            return r1
        L58:
            java.util.Collections.sort(r0)
            int r8 = r0.size()
            int r8 = r8 + (-1)
            java.lang.Object r8 = r0.get(r8)
            java.lang.Long r8 = (java.lang.Long) r8
            long r8 = r8.longValue()
            return r8
    }

    private final java.io.File zzI(java.lang.String r3) {
            r2 = this;
            java.io.File r0 = new java.io.File
            java.io.File r1 = r2.zzL()
            r0.<init>(r1, r3)
            return r0
    }

    private final java.io.File zzJ(java.lang.String r2, int r3, long r4) {
            r1 = this;
            java.io.File r0 = new java.io.File
            java.io.File r2 = r1.zzj(r2, r3, r4)
            java.lang.String r3 = "merge.tmp"
            r0.<init>(r2, r3)
            return r0
    }

    private final java.io.File zzK(java.lang.String r5, int r6, long r7) {
            r4 = this;
            java.io.File r0 = new java.io.File
            java.io.File r1 = new java.io.File
            java.io.File r2 = new java.io.File
            java.io.File r3 = r4.zzM()
            r2.<init>(r3, r5)
            java.lang.String r5 = java.lang.String.valueOf(r6)
            r1.<init>(r2, r5)
            java.lang.String r5 = java.lang.String.valueOf(r7)
            r0.<init>(r1, r5)
            return r0
    }

    private final java.io.File zzL() {
            r3 = this;
            java.io.File r0 = new java.io.File
            android.content.Context r1 = r3.zzd
            java.io.File r1 = r1.getFilesDir()
            java.lang.String r2 = "assetpacks"
            r0.<init>(r1, r2)
            return r0
    }

    private final java.io.File zzM() {
            r3 = this;
            java.io.File r0 = new java.io.File
            java.io.File r1 = r3.zzL()
            java.lang.String r2 = "_tmp"
            r0.<init>(r1, r2)
            return r0
    }

    @androidx.annotation.RequiresApi(21)
    private static java.util.List zzN(android.content.pm.PackageInfo r4, java.lang.String r5) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.String[] r1 = r4.splitNames
            if (r1 != 0) goto La
            return r0
        La:
            int r1 = java.util.Arrays.binarySearch(r1, r5)
            int r1 = -r1
            int r1 = r1 + (-1)
        L11:
            java.lang.String[] r2 = r4.splitNames
            int r3 = r2.length
            if (r1 >= r3) goto L2a
            r2 = r2[r1]
            boolean r2 = r2.startsWith(r5)
            if (r2 == 0) goto L2a
            android.content.pm.ApplicationInfo r2 = r4.applicationInfo
            java.lang.String[] r2 = r2.splitSourceDirs
            r2 = r2[r1]
            r0.add(r2)
            int r1 = r1 + 1
            goto L11
        L2a:
            return r0
    }

    private final java.util.List zzO() {
            r8 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            java.io.File r2 = r8.zzL()     // Catch: java.io.IOException -> L42
            boolean r2 = r2.exists()     // Catch: java.io.IOException -> L42
            if (r2 == 0) goto L41
            java.io.File r2 = r8.zzL()     // Catch: java.io.IOException -> L42
            java.io.File[] r2 = r2.listFiles()     // Catch: java.io.IOException -> L42
            if (r2 != 0) goto L1b
            goto L41
        L1b:
            java.io.File r2 = r8.zzL()     // Catch: java.io.IOException -> L42
            java.io.File[] r2 = r2.listFiles()     // Catch: java.io.IOException -> L42
            int r3 = r2.length     // Catch: java.io.IOException -> L42
            r4 = 0
        L25:
            if (r4 >= r3) goto L4f
            r5 = r2[r4]     // Catch: java.io.IOException -> L42
            java.lang.String r6 = r5.getCanonicalPath()     // Catch: java.io.IOException -> L42
            java.io.File r7 = r8.zzM()     // Catch: java.io.IOException -> L42
            java.lang.String r7 = r7.getCanonicalPath()     // Catch: java.io.IOException -> L42
            boolean r6 = r6.equals(r7)     // Catch: java.io.IOException -> L42
            if (r6 != 0) goto L3e
            r0.add(r5)     // Catch: java.io.IOException -> L42
        L3e:
            int r4 = r4 + 1
            goto L25
        L41:
            return r0
        L42:
            r2 = move-exception
            com.google.android.play.core.internal.zzag r3 = com.google.android.play.core.assetpacks.zzbh.zza
            r4 = 1
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r1] = r2
            java.lang.String r1 = "Could not process directory while scanning installed packs. %s"
            r3.zzb(r1, r4)
        L4f:
            return r0
    }

    private static void zzP(java.io.File r7) {
            java.io.File[] r0 = r7.listFiles()
            if (r0 == 0) goto L3e
            java.io.File[] r0 = r7.listFiles()
            int r0 = r0.length
            r1 = 1
            if (r0 > r1) goto Lf
            goto L3e
        Lf:
            r0 = 0
            long r1 = zzH(r7, r0)
            java.io.File[] r7 = r7.listFiles()
            int r3 = r7.length
        L19:
            if (r0 >= r3) goto L3e
            r4 = r7[r0]
            java.lang.String r5 = r4.getName()
            java.lang.String r6 = java.lang.String.valueOf(r1)
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L3b
            java.lang.String r5 = r4.getName()
            java.lang.String r6 = "stale.tmp"
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L3b
            zzQ(r4)
        L3b:
            int r0 = r0 + 1
            goto L19
        L3e:
            return
    }

    private static boolean zzQ(java.io.File r6) {
            java.io.File[] r0 = r6.listFiles()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L16
            int r3 = r0.length
            r4 = 0
        La:
            if (r4 >= r3) goto L16
            r5 = r0[r4]
            boolean r5 = zzQ(r5)
            r2 = r2 & r5
            int r4 = r4 + 1
            goto La
        L16:
            boolean r6 = r6.delete()
            if (r6 != 0) goto L1d
            return r1
        L1d:
            return r2
    }

    public final void zzA(java.lang.String r1, int r2, long r3, int r5) throws java.io.IOException {
            r0 = this;
            java.io.File r1 = r0.zzJ(r1, r2, r3)
            java.util.Properties r2 = new java.util.Properties
            r2.<init>()
            java.lang.String r3 = java.lang.String.valueOf(r5)
            java.lang.String r4 = "numberOfMerges"
            r2.put(r4, r3)
            java.io.File r3 = r1.getParentFile()
            r3.mkdirs()
            r1.createNewFile()
            java.io.FileOutputStream r3 = new java.io.FileOutputStream
            r3.<init>(r1)
            r1 = 0
            r2.store(r3, r1)
            r3.close()
            return
    }

    public final void zzB(java.lang.String r10, int r11, long r12) {
            r9 = this;
            java.io.File r10 = r9.zzI(r10)
            boolean r0 = r10.exists()
            if (r0 != 0) goto Lb
            return
        Lb:
            java.io.File[] r10 = r10.listFiles()
            int r0 = r10.length
            r1 = 0
            r2 = 0
        L12:
            if (r2 >= r0) goto L64
            r3 = r10[r2]
            java.lang.String r4 = r3.getName()
            java.lang.String r5 = java.lang.String.valueOf(r11)
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L35
            java.lang.String r4 = r3.getName()
            java.lang.String r5 = "stale.tmp"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L35
            zzQ(r3)
            goto L61
        L35:
            java.lang.String r4 = r3.getName()
            java.lang.String r5 = java.lang.String.valueOf(r11)
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L61
            java.io.File[] r3 = r3.listFiles()
            int r4 = r3.length
            r5 = 0
        L49:
            if (r5 >= r4) goto L61
            r6 = r3[r5]
            java.lang.String r7 = r6.getName()
            java.lang.String r8 = java.lang.String.valueOf(r12)
            boolean r7 = r7.equals(r8)
            if (r7 != 0) goto L5e
            zzQ(r6)
        L5e:
            int r5 = r5 + 1
            goto L49
        L61:
            int r2 = r2 + 1
            goto L12
        L64:
            return
    }

    public final void zzC(java.util.List r9) {
            r8 = this;
            com.google.android.play.core.assetpacks.zzed r0 = r8.zze
            int r0 = r0.zza()
            java.util.List r1 = r8.zzO()
            java.util.Iterator r1 = r1.iterator()
        Le:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L32
            java.lang.Object r2 = r1.next()
            java.io.File r2 = (java.io.File) r2
            java.lang.String r3 = r2.getName()
            boolean r3 = r9.contains(r3)
            if (r3 != 0) goto Le
            r3 = 1
            long r3 = zzH(r2, r3)
            long r5 = (long) r0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 == 0) goto Le
            zzQ(r2)
            goto Le
        L32:
            return
    }

    public final boolean zzD(java.lang.String r2) {
            r1 = this;
            java.io.File r0 = r1.zzI(r2)
            boolean r0 = r0.exists()
            if (r0 != 0) goto Lc
            r2 = 1
            return r2
        Lc:
            java.io.File r2 = r1.zzI(r2)
            boolean r2 = zzQ(r2)
            return r2
    }

    public final boolean zzE(java.lang.String r2, int r3, long r4) {
            r1 = this;
            java.io.File r0 = r1.zzK(r2, r3, r4)
            boolean r0 = r0.exists()
            if (r0 != 0) goto Lc
            r2 = 1
            return r2
        Lc:
            java.io.File r2 = r1.zzK(r2, r3, r4)
            boolean r2 = zzQ(r2)
            return r2
    }

    public final boolean zzF(java.lang.String r2, int r3, long r4) {
            r1 = this;
            java.io.File r0 = r1.zzh(r2, r3, r4)
            boolean r0 = r0.exists()
            if (r0 != 0) goto Lc
            r2 = 1
            return r2
        Lc:
            java.io.File r2 = r1.zzh(r2, r3, r4)
            boolean r2 = zzQ(r2)
            return r2
    }

    public final boolean zzG(java.lang.String r1) {
            r0 = this;
            java.lang.String r1 = r0.zzr(r1)     // Catch: java.io.IOException -> L8
            if (r1 == 0) goto L8
            r1 = 1
            return r1
        L8:
            r1 = 0
            return r1
    }

    public final int zza(java.lang.String r3) {
            r2 = this;
            java.io.File r3 = r2.zzI(r3)
            r0 = 1
            long r0 = zzH(r3, r0)
            int r3 = (int) r0
            return r3
    }

    public final int zzb(java.lang.String r1, int r2, long r3) throws java.io.IOException {
            r0 = this;
            java.io.File r1 = r0.zzJ(r1, r2, r3)
            boolean r2 = r1.exists()
            if (r2 != 0) goto Lc
            r1 = 0
            return r1
        Lc:
            java.util.Properties r2 = new java.util.Properties
            r2.<init>()
            java.io.FileInputStream r3 = new java.io.FileInputStream
            r3.<init>(r1)
            r2.load(r3)     // Catch: java.lang.Throwable -> L3c
            r3.close()
            java.lang.String r1 = "numberOfMerges"
            java.lang.String r3 = r2.getProperty(r1)
            java.lang.String r4 = "Merge checkpoint file corrupt."
            if (r3 == 0) goto L36
            java.lang.String r1 = r2.getProperty(r1)     // Catch: java.lang.NumberFormatException -> L2f
            int r1 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.NumberFormatException -> L2f
            return r1
        L2f:
            r1 = move-exception
            com.google.android.play.core.assetpacks.zzck r2 = new com.google.android.play.core.assetpacks.zzck
            r2.<init>(r4, r1)
            throw r2
        L36:
            com.google.android.play.core.assetpacks.zzck r1 = new com.google.android.play.core.assetpacks.zzck
            r1.<init>(r4)
            throw r1
        L3c:
            r1 = move-exception
            r3.close()     // Catch: java.lang.Throwable -> L40
        L40:
            throw r1
    }

    public final long zzc(java.lang.String r5) {
            r4 = this;
            java.io.File r0 = r4.zzI(r5)
            r1 = 1
            long r2 = zzH(r0, r1)
            int r0 = (int) r2
            java.io.File r5 = r4.zzg(r5, r0)
            long r0 = zzH(r5, r1)
            return r0
    }

    @androidx.annotation.Nullable
    @androidx.annotation.VisibleForTesting
    public final com.google.android.play.core.assetpacks.AssetLocation zzd(java.lang.String r8, java.lang.String r9, java.util.List r10) {
            r7 = this;
            r0 = 0
            if (r10 != 0) goto L4
            return r0
        L4:
            java.io.File r1 = new java.io.File
            java.lang.String r2 = "assets"
            r1.<init>(r2, r9)
            java.lang.String r1 = r1.getPath()
            r2 = r10
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            java.util.Iterator r2 = r2.iterator()
        L16:
            boolean r3 = r2.hasNext()
            r4 = 2
            r5 = 1
            r6 = 0
            if (r3 == 0) goto L3b
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            com.google.android.play.core.assetpacks.AssetLocation r3 = com.google.android.play.core.assetpacks.zzbt.zza(r3, r1)     // Catch: java.io.IOException -> L2c
            if (r3 == 0) goto L16
            return r3
        L2c:
            r8 = move-exception
            com.google.android.play.core.internal.zzag r10 = com.google.android.play.core.assetpacks.zzbh.zza
            java.lang.Object[] r1 = new java.lang.Object[r4]
            r1[r6] = r3
            r1[r5] = r9
            java.lang.String r9 = "Failed to parse APK file '%s' looking for asset '%s'."
            r10.zzc(r8, r9, r1)
            return r0
        L3b:
            com.google.android.play.core.internal.zzag r1 = com.google.android.play.core.assetpacks.zzbh.zza
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r6] = r9
            r2[r5] = r8
            r2[r4] = r10
            java.lang.String r8 = "The asset %s is not present in Asset Pack %s. Searched in APKs: %s"
            r1.zza(r8, r2)
            return r0
    }

    @androidx.annotation.Nullable
    public final com.google.android.play.core.assetpacks.AssetLocation zze(java.lang.String r9, java.lang.String r10, com.google.android.play.core.assetpacks.AssetPackLocation r11) {
            r8 = this;
            java.io.File r0 = new java.io.File
            java.lang.String r1 = r11.assetsPath()
            r0.<init>(r1, r10)
            boolean r1 = r0.exists()
            if (r1 == 0) goto L20
            java.lang.String r3 = r0.getPath()
            long r6 = r0.length()
            com.google.android.play.core.assetpacks.zzbl r9 = new com.google.android.play.core.assetpacks.zzbl
            r4 = 0
            r2 = r9
            r2.<init>(r3, r4, r6)
            return r9
        L20:
            com.google.android.play.core.internal.zzag r0 = com.google.android.play.core.assetpacks.zzbh.zza
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r10
            r10 = 1
            r1[r10] = r9
            r9 = 2
            java.lang.String r10 = r11.assetsPath()
            r1[r9] = r10
            java.lang.String r9 = "The asset %s is not present in Asset Pack %s. Searched in folder: %s"
            r0.zza(r9, r1)
            r9 = 0
            return r9
    }

    @androidx.annotation.Nullable
    public final com.google.android.play.core.assetpacks.AssetPackLocation zzf(java.lang.String r5) throws java.io.IOException {
            r4 = this;
            java.lang.String r5 = r4.zzr(r5)
            r0 = 0
            if (r5 != 0) goto L8
            return r0
        L8:
            java.io.File r1 = new java.io.File
            java.lang.String r2 = "assets"
            r1.<init>(r5, r2)
            boolean r2 = r1.isDirectory()
            r3 = 0
            if (r2 != 0) goto L23
            com.google.android.play.core.internal.zzag r5 = com.google.android.play.core.assetpacks.zzbh.zza
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r3] = r1
            java.lang.String r1 = "Failed to find assets directory: %s"
            r5.zzb(r1, r2)
            return r0
        L23:
            java.lang.String r0 = r1.getCanonicalPath()
            com.google.android.play.core.assetpacks.zzbm r1 = new com.google.android.play.core.assetpacks.zzbm
            r1.<init>(r3, r5, r0)
            return r1
    }

    public final java.io.File zzg(java.lang.String r2, int r3) {
            r1 = this;
            java.io.File r0 = new java.io.File
            java.io.File r2 = r1.zzI(r2)
            java.lang.String r3 = java.lang.String.valueOf(r3)
            r0.<init>(r2, r3)
            return r0
    }

    public final java.io.File zzh(java.lang.String r2, int r3, long r4) {
            r1 = this;
            java.io.File r0 = new java.io.File
            java.io.File r2 = r1.zzg(r2, r3)
            java.lang.String r3 = java.lang.String.valueOf(r4)
            r0.<init>(r2, r3)
            return r0
    }

    public final java.io.File zzi(java.lang.String r2, int r3, long r4) {
            r1 = this;
            java.io.File r0 = new java.io.File
            java.io.File r2 = r1.zzh(r2, r3, r4)
            java.lang.String r3 = "_metadata"
            r0.<init>(r2, r3)
            return r0
    }

    public final java.io.File zzj(java.lang.String r2, int r3, long r4) {
            r1 = this;
            java.io.File r0 = new java.io.File
            java.io.File r2 = r1.zzK(r2, r3, r4)
            java.lang.String r3 = "_packs"
            r0.<init>(r2, r3)
            return r0
    }

    public final java.io.File zzl(java.lang.String r3, int r4, long r5) {
            r2 = this;
            java.io.File r0 = new java.io.File
            java.io.File r1 = new java.io.File
            java.io.File r3 = r2.zzK(r3, r4, r5)
            java.lang.String r4 = "_slices"
            r1.<init>(r3, r4)
            java.lang.String r3 = "_metadata"
            r0.<init>(r1, r3)
            return r0
    }

    public final java.io.File zzn(java.lang.String r2, int r3, long r4, java.lang.String r6) {
            r1 = this;
            java.io.File r0 = new java.io.File
            java.io.File r2 = r1.zzo(r2, r3, r4, r6)
            java.lang.String r3 = "checkpoint.dat"
            r0.<init>(r2, r3)
            return r0
    }

    public final java.io.File zzo(java.lang.String r4, int r5, long r6, java.lang.String r8) {
            r3 = this;
            java.io.File r0 = new java.io.File
            java.io.File r1 = new java.io.File
            java.io.File r2 = new java.io.File
            java.io.File r4 = r3.zzK(r4, r5, r6)
            java.lang.String r5 = "_slices"
            r2.<init>(r4, r5)
            java.lang.String r4 = "_metadata"
            r1.<init>(r2, r4)
            r0.<init>(r1, r8)
            return r0
    }

    public final java.io.File zzp(java.lang.String r4, int r5, long r6, java.lang.String r8) {
            r3 = this;
            java.io.File r0 = new java.io.File
            java.io.File r1 = new java.io.File
            java.io.File r2 = new java.io.File
            java.io.File r4 = r3.zzK(r4, r5, r6)
            java.lang.String r5 = "_slices"
            r2.<init>(r4, r5)
            java.lang.String r4 = "_unverified"
            r1.<init>(r2, r4)
            r0.<init>(r1, r8)
            return r0
    }

    public final java.io.File zzq(java.lang.String r4, int r5, long r6, java.lang.String r8) {
            r3 = this;
            java.io.File r0 = new java.io.File
            java.io.File r1 = new java.io.File
            java.io.File r2 = new java.io.File
            java.io.File r4 = r3.zzK(r4, r5, r6)
            java.lang.String r5 = "_slices"
            r2.<init>(r4, r5)
            java.lang.String r4 = "_verified"
            r1.<init>(r2, r4)
            r0.<init>(r1, r8)
            return r0
    }

    @androidx.annotation.Nullable
    public final java.lang.String zzr(java.lang.String r7) throws java.io.IOException {
            r6 = this;
            java.io.File r0 = new java.io.File
            java.io.File r1 = r6.zzL()
            r0.<init>(r1, r7)
            boolean r1 = r0.exists()
            r2 = 0
            r3 = 0
            r4 = 1
            if (r1 != 0) goto L1e
            com.google.android.play.core.internal.zzag r0 = com.google.android.play.core.assetpacks.zzbh.zza
            java.lang.Object[] r1 = new java.lang.Object[r4]
            r1[r3] = r7
            java.lang.String r7 = "Pack not found with pack name: %s"
            r0.zza(r7, r1)
            return r2
        L1e:
            java.io.File r1 = new java.io.File
            com.google.android.play.core.assetpacks.zzed r5 = r6.zze
            int r5 = r5.zza()
            java.lang.String r5 = java.lang.String.valueOf(r5)
            r1.<init>(r0, r5)
            boolean r0 = r1.exists()
            r5 = 2
            if (r0 != 0) goto L4c
            com.google.android.play.core.internal.zzag r0 = com.google.android.play.core.assetpacks.zzbh.zza
            java.lang.Object[] r1 = new java.lang.Object[r5]
            r1[r3] = r7
            com.google.android.play.core.assetpacks.zzed r7 = r6.zze
            int r7 = r7.zza()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r1[r4] = r7
            java.lang.String r7 = "Pack not found with pack name: %s app version: %s"
            r0.zza(r7, r1)
            return r2
        L4c:
            java.io.File[] r0 = r1.listFiles()
            if (r0 == 0) goto L77
            int r1 = r0.length
            if (r1 != 0) goto L56
            goto L77
        L56:
            if (r1 <= r4) goto L70
            com.google.android.play.core.internal.zzag r0 = com.google.android.play.core.assetpacks.zzbh.zza
            java.lang.Object[] r1 = new java.lang.Object[r5]
            r1[r3] = r7
            com.google.android.play.core.assetpacks.zzed r7 = r6.zze
            int r7 = r7.zza()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r1[r4] = r7
            java.lang.String r7 = "Multiple pack versions found for pack name: %s app version: %s"
            r0.zzb(r7, r1)
            return r2
        L70:
            r7 = r0[r3]
            java.lang.String r7 = r7.getCanonicalPath()
            return r7
        L77:
            com.google.android.play.core.internal.zzag r0 = com.google.android.play.core.assetpacks.zzbh.zza
            java.lang.Object[] r1 = new java.lang.Object[r5]
            r1[r3] = r7
            com.google.android.play.core.assetpacks.zzed r7 = r6.zze
            int r7 = r7.zza()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r1[r4] = r7
            java.lang.String r7 = "No pack version found for pack name: %s app version: %s"
            r0.zza(r7, r1)
            return r2
    }

    @androidx.annotation.Nullable
    public final java.util.List zzs(java.lang.String r8) {
            r7 = this;
            r0 = 0
            r1 = 0
            android.content.Context r2 = r7.zzd     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L13
            android.content.pm.PackageManager r2 = r2.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L13
            android.content.Context r3 = r7.zzd     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L13
            java.lang.String r3 = r3.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L13
            android.content.pm.PackageInfo r2 = r2.getPackageInfo(r3, r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L13
            goto L1d
        L13:
            com.google.android.play.core.internal.zzag r2 = com.google.android.play.core.assetpacks.zzbh.zza
            java.lang.Object[] r3 = new java.lang.Object[r1]
            java.lang.String r4 = "Could not find PackageInfo."
            r2.zzb(r4, r3)
            r2 = r0
        L1d:
            if (r2 != 0) goto L20
            return r0
        L20:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.lang.String[] r4 = r2.splitNames
            r5 = 1
            if (r4 == 0) goto L4a
            android.content.pm.ApplicationInfo r6 = r2.applicationInfo
            java.lang.String[] r6 = r6.splitSourceDirs
            if (r6 != 0) goto L31
            goto L4a
        L31:
            int r4 = java.util.Arrays.binarySearch(r4, r8)
            if (r4 >= 0) goto L43
            com.google.android.play.core.internal.zzag r4 = com.google.android.play.core.assetpacks.zzbh.zza
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r5[r1] = r8
            java.lang.String r1 = "Asset Pack '%s' is not installed."
            r4.zza(r1, r5)
            goto L55
        L43:
            android.content.pm.ApplicationInfo r0 = r2.applicationInfo
            java.lang.String[] r0 = r0.splitSourceDirs
            r0 = r0[r4]
            goto L55
        L4a:
            com.google.android.play.core.internal.zzag r4 = com.google.android.play.core.assetpacks.zzbh.zza
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r5[r1] = r8
            java.lang.String r1 = "No splits present for package %s."
            r4.zza(r1, r5)
        L55:
            if (r0 != 0) goto L68
            android.content.pm.ApplicationInfo r8 = r2.applicationInfo
            java.lang.String r8 = r8.sourceDir
            r3.add(r8)
            java.lang.String r8 = "config."
            java.util.List r8 = zzN(r2, r8)
            r3.addAll(r8)
            return r3
        L68:
            r3.add(r0)
            java.lang.String r8 = java.lang.String.valueOf(r8)
            java.lang.String r0 = ".config."
            java.lang.String r8 = r8.concat(r0)
            java.util.List r8 = zzN(r2, r8)
            r3.addAll(r8)
            return r3
    }

    public final java.util.Map zzt() {
            r7 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.List r1 = r7.zzO()
            java.util.Iterator r1 = r1.iterator()
        Ld:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L41
            java.lang.Object r2 = r1.next()
            java.io.File r2 = (java.io.File) r2
            java.lang.String r2 = r2.getName()
            java.io.File r3 = r7.zzI(r2)
            r4 = 1
            long r5 = zzH(r3, r4)
            int r3 = (int) r5
            java.io.File r5 = r7.zzg(r2, r3)
            long r4 = zzH(r5, r4)
            java.io.File r3 = r7.zzh(r2, r3, r4)
            boolean r3 = r3.exists()
            if (r3 == 0) goto Ld
            java.lang.Long r3 = java.lang.Long.valueOf(r4)
            r0.put(r2, r3)
            goto Ld
        L41:
            return r0
    }

    public final java.util.Map zzu() {
            r5 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.Map r1 = r5.zzv()
            java.util.HashMap r1 = (java.util.HashMap) r1
            java.util.Set r1 = r1.keySet()
            java.util.Iterator r1 = r1.iterator()
        L13:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L2b
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            long r3 = r5.zzc(r2)
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r0.put(r2, r3)
            goto L13
        L2b:
            return r0
    }

    public final java.util.Map zzv() {
            r5 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.List r1 = r5.zzO()     // Catch: java.io.IOException -> L2b
            java.util.Iterator r1 = r1.iterator()     // Catch: java.io.IOException -> L2b
        Ld:
            boolean r2 = r1.hasNext()     // Catch: java.io.IOException -> L2b
            if (r2 == 0) goto L39
            java.lang.Object r2 = r1.next()     // Catch: java.io.IOException -> L2b
            java.io.File r2 = (java.io.File) r2     // Catch: java.io.IOException -> L2b
            java.lang.String r3 = r2.getName()     // Catch: java.io.IOException -> L2b
            com.google.android.play.core.assetpacks.AssetPackLocation r3 = r5.zzf(r3)     // Catch: java.io.IOException -> L2b
            if (r3 == 0) goto Ld
            java.lang.String r2 = r2.getName()     // Catch: java.io.IOException -> L2b
            r0.put(r2, r3)     // Catch: java.io.IOException -> L2b
            goto Ld
        L2b:
            r1 = move-exception
            com.google.android.play.core.internal.zzag r2 = com.google.android.play.core.assetpacks.zzbh.zza
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = 0
            r3[r4] = r1
            java.lang.String r1 = "Could not process directory while scanning installed packs: %s"
            r2.zzb(r1, r3)
        L39:
            return r0
    }

    public final void zzw() {
            r8 = this;
            java.util.List r0 = r8.zzO()
            java.util.Iterator r0 = r0.iterator()
        L8:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L5a
            java.lang.Object r1 = r0.next()
            java.io.File r1 = (java.io.File) r1
            java.io.File[] r2 = r1.listFiles()
            if (r2 == 0) goto L8
            zzP(r1)
            r2 = 0
            long r3 = zzH(r1, r2)
            com.google.android.play.core.assetpacks.zzed r5 = r8.zze
            int r5 = r5.zza()
            long r5 = (long) r5
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 == 0) goto L4b
            java.io.File r5 = new java.io.File
            java.io.File r6 = new java.io.File
            java.lang.String r3 = java.lang.String.valueOf(r3)
            r6.<init>(r1, r3)
            java.lang.String r3 = "stale.tmp"
            r5.<init>(r6, r3)
            r5.createNewFile()     // Catch: java.io.IOException -> L42
            goto L4b
        L42:
            com.google.android.play.core.internal.zzag r3 = com.google.android.play.core.assetpacks.zzbh.zza
            java.lang.Object[] r4 = new java.lang.Object[r2]
            java.lang.String r5 = "Could not write staleness marker."
            r3.zzb(r5, r4)
        L4b:
            java.io.File[] r1 = r1.listFiles()
            int r3 = r1.length
        L50:
            if (r2 >= r3) goto L8
            r4 = r1[r2]
            zzP(r4)
            int r2 = r2 + 1
            goto L50
        L5a:
            return
    }

    public final void zzx() {
            r9 = this;
            java.io.File r0 = r9.zzM()
            boolean r0 = r0.exists()
            if (r0 != 0) goto Lb
            return
        Lb:
            java.io.File r0 = r9.zzM()
            java.io.File[] r0 = r0.listFiles()
            int r1 = r0.length
            r2 = 0
        L15:
            if (r2 >= r1) goto L32
            r3 = r0[r2]
            long r4 = java.lang.System.currentTimeMillis()
            long r6 = r3.lastModified()
            long r4 = r4 - r6
            long r6 = com.google.android.play.core.assetpacks.zzbh.zzb
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 <= 0) goto L2c
            zzQ(r3)
            goto L2f
        L2c:
            zzP(r3)
        L2f:
            int r2 = r2 + 1
            goto L15
        L32:
            return
    }

    public final void zzy() {
            r10 = this;
            java.util.List r0 = r10.zzO()
            java.util.Iterator r0 = r0.iterator()
        L8:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L47
            java.lang.Object r1 = r0.next()
            java.io.File r1 = (java.io.File) r1
            java.io.File[] r2 = r1.listFiles()
            if (r2 == 0) goto L8
            java.io.File[] r1 = r1.listFiles()
            int r2 = r1.length
            r3 = 0
        L20:
            if (r3 >= r2) goto L8
            r4 = r1[r3]
            java.io.File r5 = new java.io.File
            java.lang.String r6 = "stale.tmp"
            r5.<init>(r4, r6)
            boolean r6 = r5.exists()
            if (r6 == 0) goto L44
            long r6 = java.lang.System.currentTimeMillis()
            long r8 = r5.lastModified()
            long r6 = r6 - r8
            long r8 = com.google.android.play.core.assetpacks.zzbh.zzc
            int r5 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r5 <= 0) goto L44
            zzQ(r4)
        L44:
            int r3 = r3 + 1
            goto L20
        L47:
            return
    }

    public final void zzz() {
            r1 = this;
            java.io.File r0 = r1.zzL()
            zzQ(r0)
            return
    }
}
