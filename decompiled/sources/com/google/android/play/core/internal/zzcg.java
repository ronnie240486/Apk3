package com.google.android.play.core.internal;

/* JADX INFO: compiled from: com.google.android.play:core@@1.10.3 */
/* JADX INFO: loaded from: classes.dex */
public final class zzcg {
    public static java.lang.String zza(byte[] r1) {
            java.lang.String r0 = "SHA-256"
            java.security.MessageDigest r0 = java.security.MessageDigest.getInstance(r0)     // Catch: java.security.NoSuchAlgorithmException -> L14
            r0.update(r1)
            byte[] r1 = r0.digest()
            r0 = 11
            java.lang.String r1 = android.util.Base64.encodeToString(r1, r0)
            return r1
        L14:
            java.lang.String r1 = ""
            return r1
    }
}
