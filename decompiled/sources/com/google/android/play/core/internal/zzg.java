package com.google.android.play.core.internal;

/* JADX INFO: compiled from: com.google.android.play:core@@1.10.3 */
/* JADX INFO: loaded from: classes.dex */
final class zzg extends com.google.android.play.core.internal.zzh {
    private final byte[] zza;

    public zzg(java.security.cert.X509Certificate r1, byte[] r2) {
            r0 = this;
            r0.<init>(r1)
            r0.zza = r2
            return
    }

    @Override // com.google.android.play.core.internal.zzh, java.security.cert.Certificate
    public final byte[] getEncoded() throws java.security.cert.CertificateEncodingException {
            r1 = this;
            byte[] r0 = r1.zza
            return r0
    }
}
