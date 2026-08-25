package com.google.android.play.core.internal;

/* JADX INFO: compiled from: com.google.android.play:core@@1.10.3 */
/* JADX INFO: loaded from: classes.dex */
class zzh extends java.security.cert.X509Certificate {
    private final java.security.cert.X509Certificate zza;

    public zzh(java.security.cert.X509Certificate r1) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            return
    }

    @Override // java.security.cert.X509Certificate
    public final void checkValidity() throws java.security.cert.CertificateExpiredException, java.security.cert.CertificateNotYetValidException {
            r1 = this;
            java.security.cert.X509Certificate r0 = r1.zza
            r0.checkValidity()
            return
    }

    @Override // java.security.cert.X509Certificate
    public final void checkValidity(java.util.Date r2) throws java.security.cert.CertificateExpiredException, java.security.cert.CertificateNotYetValidException {
            r1 = this;
            java.security.cert.X509Certificate r0 = r1.zza
            r0.checkValidity(r2)
            return
    }

    @Override // java.security.cert.X509Certificate
    public final int getBasicConstraints() {
            r1 = this;
            java.security.cert.X509Certificate r0 = r1.zza
            int r0 = r0.getBasicConstraints()
            return r0
    }

    @Override // java.security.cert.X509Extension
    public final java.util.Set getCriticalExtensionOIDs() {
            r1 = this;
            java.security.cert.X509Certificate r0 = r1.zza
            java.util.Set r0 = r0.getCriticalExtensionOIDs()
            return r0
    }

    @Override // java.security.cert.Certificate
    public byte[] getEncoded() throws java.security.cert.CertificateEncodingException {
            r1 = this;
            java.security.cert.X509Certificate r0 = r1.zza
            byte[] r0 = r0.getEncoded()
            return r0
    }

    @Override // java.security.cert.X509Extension
    public final byte[] getExtensionValue(java.lang.String r2) {
            r1 = this;
            java.security.cert.X509Certificate r0 = r1.zza
            byte[] r2 = r0.getExtensionValue(r2)
            return r2
    }

    @Override // java.security.cert.X509Certificate
    public final java.security.Principal getIssuerDN() {
            r1 = this;
            java.security.cert.X509Certificate r0 = r1.zza
            java.security.Principal r0 = r0.getIssuerDN()
            return r0
    }

    @Override // java.security.cert.X509Certificate
    public final boolean[] getIssuerUniqueID() {
            r1 = this;
            java.security.cert.X509Certificate r0 = r1.zza
            boolean[] r0 = r0.getIssuerUniqueID()
            return r0
    }

    @Override // java.security.cert.X509Certificate
    public final boolean[] getKeyUsage() {
            r1 = this;
            java.security.cert.X509Certificate r0 = r1.zza
            boolean[] r0 = r0.getKeyUsage()
            return r0
    }

    @Override // java.security.cert.X509Extension
    public final java.util.Set getNonCriticalExtensionOIDs() {
            r1 = this;
            java.security.cert.X509Certificate r0 = r1.zza
            java.util.Set r0 = r0.getNonCriticalExtensionOIDs()
            return r0
    }

    @Override // java.security.cert.X509Certificate
    public final java.util.Date getNotAfter() {
            r1 = this;
            java.security.cert.X509Certificate r0 = r1.zza
            java.util.Date r0 = r0.getNotAfter()
            return r0
    }

    @Override // java.security.cert.X509Certificate
    public final java.util.Date getNotBefore() {
            r1 = this;
            java.security.cert.X509Certificate r0 = r1.zza
            java.util.Date r0 = r0.getNotBefore()
            return r0
    }

    @Override // java.security.cert.Certificate
    public final java.security.PublicKey getPublicKey() {
            r1 = this;
            java.security.cert.X509Certificate r0 = r1.zza
            java.security.PublicKey r0 = r0.getPublicKey()
            return r0
    }

    @Override // java.security.cert.X509Certificate
    public final java.math.BigInteger getSerialNumber() {
            r1 = this;
            java.security.cert.X509Certificate r0 = r1.zza
            java.math.BigInteger r0 = r0.getSerialNumber()
            return r0
    }

    @Override // java.security.cert.X509Certificate
    public final java.lang.String getSigAlgName() {
            r1 = this;
            java.security.cert.X509Certificate r0 = r1.zza
            java.lang.String r0 = r0.getSigAlgName()
            return r0
    }

    @Override // java.security.cert.X509Certificate
    public final java.lang.String getSigAlgOID() {
            r1 = this;
            java.security.cert.X509Certificate r0 = r1.zza
            java.lang.String r0 = r0.getSigAlgOID()
            return r0
    }

    @Override // java.security.cert.X509Certificate
    public final byte[] getSigAlgParams() {
            r1 = this;
            java.security.cert.X509Certificate r0 = r1.zza
            byte[] r0 = r0.getSigAlgParams()
            return r0
    }

    @Override // java.security.cert.X509Certificate
    public final byte[] getSignature() {
            r1 = this;
            java.security.cert.X509Certificate r0 = r1.zza
            byte[] r0 = r0.getSignature()
            return r0
    }

    @Override // java.security.cert.X509Certificate
    public final java.security.Principal getSubjectDN() {
            r1 = this;
            java.security.cert.X509Certificate r0 = r1.zza
            java.security.Principal r0 = r0.getSubjectDN()
            return r0
    }

    @Override // java.security.cert.X509Certificate
    public final boolean[] getSubjectUniqueID() {
            r1 = this;
            java.security.cert.X509Certificate r0 = r1.zza
            boolean[] r0 = r0.getSubjectUniqueID()
            return r0
    }

    @Override // java.security.cert.X509Certificate
    public final byte[] getTBSCertificate() throws java.security.cert.CertificateEncodingException {
            r1 = this;
            java.security.cert.X509Certificate r0 = r1.zza
            byte[] r0 = r0.getTBSCertificate()
            return r0
    }

    @Override // java.security.cert.X509Certificate
    public final int getVersion() {
            r1 = this;
            java.security.cert.X509Certificate r0 = r1.zza
            int r0 = r0.getVersion()
            return r0
    }

    @Override // java.security.cert.X509Extension
    public final boolean hasUnsupportedCriticalExtension() {
            r1 = this;
            java.security.cert.X509Certificate r0 = r1.zza
            boolean r0 = r0.hasUnsupportedCriticalExtension()
            return r0
    }

    @Override // java.security.cert.Certificate
    public final java.lang.String toString() {
            r1 = this;
            java.security.cert.X509Certificate r0 = r1.zza
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // java.security.cert.Certificate
    public final void verify(java.security.PublicKey r2) throws java.security.cert.CertificateException, java.security.NoSuchAlgorithmException, java.security.InvalidKeyException, java.security.NoSuchProviderException, java.security.SignatureException {
            r1 = this;
            java.security.cert.X509Certificate r0 = r1.zza
            r0.verify(r2)
            return
    }

    @Override // java.security.cert.Certificate
    public final void verify(java.security.PublicKey r2, java.lang.String r3) throws java.security.cert.CertificateException, java.security.NoSuchAlgorithmException, java.security.InvalidKeyException, java.security.NoSuchProviderException, java.security.SignatureException {
            r1 = this;
            java.security.cert.X509Certificate r0 = r1.zza
            r0.verify(r2, r3)
            return
    }
}
