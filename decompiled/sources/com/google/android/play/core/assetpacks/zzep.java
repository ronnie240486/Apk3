package com.google.android.play.core.assetpacks;

/* JADX INFO: compiled from: com.google.android.play:core@@1.10.3 */
/* JADX INFO: loaded from: classes.dex */
final class zzep {
    private static final java.util.regex.Pattern zza = null;

    static {
            java.lang.String r0 = "[0-9]+-(NAM|LFH)\\.dat"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            com.google.android.play.core.assetpacks.zzep.zza = r0
            return
    }

    public static java.util.List zza(java.io.File r8, java.io.File r9) throws java.io.IOException {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.google.android.play.core.assetpacks.zzeo r1 = com.google.android.play.core.assetpacks.zzeo.zza
            java.io.File[] r9 = r9.listFiles(r1)
            r1 = 0
            if (r9 != 0) goto L11
            java.io.File[] r9 = new java.io.File[r1]
            goto L3e
        L11:
            int r2 = r9.length
            java.io.File[] r3 = new java.io.File[r2]
            r4 = 0
        L15:
            if (r4 >= r2) goto L3d
            r5 = r9[r4]
            java.lang.String r6 = r5.getName()
            java.lang.String r7 = "-"
            java.lang.String[] r6 = r6.split(r7)
            r6 = r6[r1]
            int r6 = java.lang.Integer.parseInt(r6)
            int r7 = r9.length
            if (r6 > r7) goto L35
            r7 = r3[r6]
            if (r7 != 0) goto L35
            r3[r6] = r5
            int r4 = r4 + 1
            goto L15
        L35:
            com.google.android.play.core.assetpacks.zzck r8 = new com.google.android.play.core.assetpacks.zzck
            java.lang.String r9 = "Metadata folder ordering corrupt."
            r8.<init>(r9)
            throw r8
        L3d:
            r9 = r3
        L3e:
            int r2 = r9.length
            r3 = 0
        L40:
            if (r3 >= r2) goto La2
            r4 = r9[r3]
            r0.add(r4)
            java.lang.String r5 = r4.getName()
            java.lang.String r6 = "LFH"
            boolean r5 = r5.contains(r6)
            if (r5 == 0) goto L9f
            java.io.FileInputStream r5 = new java.io.FileInputStream
            r5.<init>(r4)
            com.google.android.play.core.assetpacks.zzbw r4 = new com.google.android.play.core.assetpacks.zzbw     // Catch: java.lang.Throwable -> L9a
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L9a
            com.google.android.play.core.assetpacks.zzet r4 = r4.zzb()     // Catch: java.lang.Throwable -> L9a
            java.lang.String r6 = r4.zzc()     // Catch: java.lang.Throwable -> L9a
            if (r6 == 0) goto L92
            java.io.File r6 = new java.io.File     // Catch: java.lang.Throwable -> L9a
            java.lang.String r4 = r4.zzc()     // Catch: java.lang.Throwable -> L9a
            r6.<init>(r8, r4)     // Catch: java.lang.Throwable -> L9a
            boolean r4 = r6.exists()     // Catch: java.lang.Throwable -> L9a
            if (r4 == 0) goto L7d
            r0.add(r6)     // Catch: java.lang.Throwable -> L9a
            r5.close()
            goto L9f
        L7d:
            com.google.android.play.core.assetpacks.zzck r8 = new com.google.android.play.core.assetpacks.zzck     // Catch: java.lang.Throwable -> L9a
            r9 = 1
            java.lang.Object[] r9 = new java.lang.Object[r9]     // Catch: java.lang.Throwable -> L9a
            java.lang.String r0 = r6.getCanonicalPath()     // Catch: java.lang.Throwable -> L9a
            r9[r1] = r0     // Catch: java.lang.Throwable -> L9a
            java.lang.String r0 = "Missing asset file %s during slice reconstruction."
            java.lang.String r9 = java.lang.String.format(r0, r9)     // Catch: java.lang.Throwable -> L9a
            r8.<init>(r9)     // Catch: java.lang.Throwable -> L9a
            throw r8     // Catch: java.lang.Throwable -> L9a
        L92:
            com.google.android.play.core.assetpacks.zzck r8 = new com.google.android.play.core.assetpacks.zzck     // Catch: java.lang.Throwable -> L9a
            java.lang.String r9 = "Metadata files corrupt. Could not read local file header."
            r8.<init>(r9)     // Catch: java.lang.Throwable -> L9a
            throw r8     // Catch: java.lang.Throwable -> L9a
        L9a:
            r8 = move-exception
            r5.close()     // Catch: java.lang.Throwable -> L9e
        L9e:
            throw r8
        L9f:
            int r3 = r3 + 1
            goto L40
        La2:
            return r0
    }

    public static /* synthetic */ boolean zzb(java.lang.String r1) {
            java.util.regex.Pattern r0 = com.google.android.play.core.assetpacks.zzep.zza
            java.util.regex.Matcher r1 = r0.matcher(r1)
            boolean r1 = r1.matches()
            return r1
    }
}
