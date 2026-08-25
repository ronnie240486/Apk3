package com.google.android.play.core.assetpacks;

/* JADX INFO: compiled from: com.google.android.play:core@@1.10.3 */
/* JADX INFO: loaded from: classes.dex */
final class zzdq {
    public static java.lang.String zza(java.util.List r5) throws java.security.NoSuchAlgorithmException, java.io.IOException {
            java.lang.String r0 = "SHA256"
            java.security.MessageDigest r0 = java.security.MessageDigest.getInstance(r0)
            r1 = 8192(0x2000, float:1.148E-41)
            byte[] r1 = new byte[r1]
            java.util.Iterator r5 = r5.iterator()
        Le:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L35
            java.lang.Object r2 = r5.next()
            java.io.File r2 = (java.io.File) r2
            java.io.FileInputStream r3 = new java.io.FileInputStream
            r3.<init>(r2)
        L1f:
            int r2 = r3.read(r1)     // Catch: java.lang.Throwable -> L30
            if (r2 <= 0) goto L29
            r4 = 0
            r0.update(r1, r4, r2)     // Catch: java.lang.Throwable -> L30
        L29:
            r4 = -1
            if (r2 != r4) goto L1f
            r3.close()
            goto Le
        L30:
            r5 = move-exception
            r3.close()     // Catch: java.lang.Throwable -> L34
        L34:
            throw r5
        L35:
            byte[] r5 = r0.digest()
            r0 = 11
            java.lang.String r5 = android.util.Base64.encodeToString(r5, r0)
            return r5
    }
}
