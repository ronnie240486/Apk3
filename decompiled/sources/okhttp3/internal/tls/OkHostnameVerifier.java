package okhttp3.internal.tls;

/* JADX INFO: compiled from: OkHostnameVerifier.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\nJ\u001e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0004H\u0002J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0018\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\u001c\u0010\u0012\u001a\u00020\u000e2\b\u0010\u0013\u001a\u0004\u0018\u00010\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\bH\u0002J\u0018\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\f\u0010\u0017\u001a\u00020\b*\u00020\bH\u0002J\f\u0010\u0018\u001a\u00020\u000e*\u00020\bH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lokhttp3/internal/tls/OkHostnameVerifier;", "Ljavax/net/ssl/HostnameVerifier;", "()V", "ALT_DNS_NAME", "", "ALT_IPA_NAME", "allSubjectAltNames", "", "", "certificate", "Ljava/security/cert/X509Certificate;", "getSubjectAltNames", "type", "verify", "", "host", "session", "Ljavax/net/ssl/SSLSession;", "verifyHostname", "hostname", "pattern", "verifyIpAddress", "ipAddress", "asciiToLowercase", "isAscii", "okhttp"}, k = 1, mv = {1, 4, 1})
public final class OkHostnameVerifier implements javax.net.ssl.HostnameVerifier {
    private static final int ALT_DNS_NAME = 2;
    private static final int ALT_IPA_NAME = 7;

    @org.jetbrains.annotations.NotNull
    public static final okhttp3.internal.tls.OkHostnameVerifier INSTANCE = null;

    static {
            okhttp3.internal.tls.OkHostnameVerifier r0 = new okhttp3.internal.tls.OkHostnameVerifier
            r0.<init>()
            okhttp3.internal.tls.OkHostnameVerifier.INSTANCE = r0
            return
    }

    private OkHostnameVerifier() {
            r0 = this;
            r0.<init>()
            return
    }

    private final java.lang.String asciiToLowercase(java.lang.String r3) {
            r2 = this;
            boolean r0 = r2.isAscii(r3)
            if (r0 == 0) goto L1b
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r1 = "Locale.US"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            java.lang.String r1 = "null cannot be cast to non-null type java.lang.String"
            java.util.Objects.requireNonNull(r3, r1)
            java.lang.String r3 = r3.toLowerCase(r0)
            java.lang.String r0 = "(this as java.lang.String).toLowerCase(locale)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r0)
        L1b:
            return r3
    }

    private final java.util.List<java.lang.String> getSubjectAltNames(java.security.cert.X509Certificate r5, int r6) {
            r4 = this;
            java.util.Collection r5 = r5.getSubjectAlternativeNames()     // Catch: java.security.cert.CertificateParsingException -> L49
            if (r5 == 0) goto L44
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.security.cert.CertificateParsingException -> L49
            r0.<init>()     // Catch: java.security.cert.CertificateParsingException -> L49
            java.util.Iterator r5 = r5.iterator()     // Catch: java.security.cert.CertificateParsingException -> L49
        Lf:
            boolean r1 = r5.hasNext()     // Catch: java.security.cert.CertificateParsingException -> L49
            if (r1 == 0) goto L43
            java.lang.Object r1 = r5.next()     // Catch: java.security.cert.CertificateParsingException -> L49
            java.util.List r1 = (java.util.List) r1     // Catch: java.security.cert.CertificateParsingException -> L49
            if (r1 == 0) goto Lf
            int r2 = r1.size()     // Catch: java.security.cert.CertificateParsingException -> L49
            r3 = 2
            if (r2 >= r3) goto L25
            goto Lf
        L25:
            r2 = 0
            java.lang.Object r2 = r1.get(r2)     // Catch: java.security.cert.CertificateParsingException -> L49
            java.lang.Integer r3 = java.lang.Integer.valueOf(r6)     // Catch: java.security.cert.CertificateParsingException -> L49
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r3)     // Catch: java.security.cert.CertificateParsingException -> L49
            r3 = 1
            r2 = r2 ^ r3
            if (r2 == 0) goto L37
            goto Lf
        L37:
            java.lang.Object r1 = r1.get(r3)     // Catch: java.security.cert.CertificateParsingException -> L49
            if (r1 == 0) goto Lf
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.security.cert.CertificateParsingException -> L49
            r0.add(r1)     // Catch: java.security.cert.CertificateParsingException -> L49
            goto Lf
        L43:
            return r0
        L44:
            java.util.List r5 = kotlin.collections.CollectionsKt.emptyList()     // Catch: java.security.cert.CertificateParsingException -> L49
            return r5
        L49:
            java.util.List r5 = kotlin.collections.CollectionsKt.emptyList()
            return r5
    }

    private final boolean isAscii(java.lang.String r5) {
            r4 = this;
            int r0 = r5.length()
            r1 = 0
            r2 = 3
            r3 = 0
            long r2 = okio.Utf8.size$default(r5, r1, r1, r2, r3)
            int r5 = (int) r2
            if (r0 != r5) goto Lf
            r1 = 1
        Lf:
            return r1
    }

    private final boolean verifyHostname(java.lang.String r8, java.lang.String r9) {
            r7 = this;
            r0 = 0
            r1 = 1
            if (r8 == 0) goto Ld
            int r2 = r8.length()
            if (r2 != 0) goto Lb
            goto Ld
        Lb:
            r2 = 0
            goto Le
        Ld:
            r2 = 1
        Le:
            if (r2 != 0) goto Lad
            java.lang.String r2 = "."
            boolean r3 = kotlin.text.StringsKt.startsWith$default(r8, r2)
            if (r3 != 0) goto Lad
            java.lang.String r3 = ".."
            boolean r4 = kotlin.text.StringsKt.endsWith$default(r8, r3)
            if (r4 == 0) goto L22
            goto Lad
        L22:
            if (r9 == 0) goto L2d
            int r4 = r9.length()
            if (r4 != 0) goto L2b
            goto L2d
        L2b:
            r4 = 0
            goto L2e
        L2d:
            r4 = 1
        L2e:
            if (r4 != 0) goto Lad
            boolean r4 = kotlin.text.StringsKt.startsWith$default(r9, r2)
            if (r4 != 0) goto Lad
            boolean r3 = kotlin.text.StringsKt.endsWith$default(r9, r3)
            if (r3 == 0) goto L3d
            goto Lad
        L3d:
            boolean r3 = kotlin.text.StringsKt.endsWith$default(r8, r2)
            if (r3 != 0) goto L47
            java.lang.String r8 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r8, r2)
        L47:
            boolean r3 = kotlin.text.StringsKt.endsWith$default(r9, r2)
            if (r3 != 0) goto L51
            java.lang.String r9 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r9, r2)
        L51:
            java.lang.String r9 = r7.asciiToLowercase(r9)
            java.lang.String r2 = "*"
            boolean r2 = kotlin.text.StringsKt.contains$default(r9, r2)
            if (r2 != 0) goto L62
            boolean r8 = kotlin.jvm.internal.Intrinsics.areEqual(r8, r9)
            return r8
        L62:
            java.lang.String r2 = "*."
            boolean r3 = kotlin.text.StringsKt.startsWith$default(r9, r2)
            if (r3 == 0) goto Lad
            r3 = 42
            r4 = 4
            int r3 = kotlin.text.StringsKt.indexOf$default(r9, r3, r1, r4)
            r5 = -1
            if (r3 == r5) goto L75
            goto Lad
        L75:
            int r3 = r8.length()
            int r6 = r9.length()
            if (r3 >= r6) goto L80
            return r0
        L80:
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r9)
            if (r2 == 0) goto L87
            return r0
        L87:
            java.lang.String r9 = r9.substring(r1)
            java.lang.String r2 = "(this as java.lang.String).substring(startIndex)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r2)
            boolean r2 = kotlin.text.StringsKt.endsWith$default(r8, r9)
            if (r2 != 0) goto L97
            return r0
        L97:
            int r2 = r8.length()
            int r9 = r9.length()
            int r2 = r2 - r9
            if (r2 <= 0) goto Lac
            r9 = 46
            int r2 = r2 + r5
            int r8 = kotlin.text.StringsKt.lastIndexOf$default(r8, r9, r2, r4)
            if (r8 == r5) goto Lac
            return r0
        Lac:
            return r1
        Lad:
            return r0
    }

    private final boolean verifyHostname(java.lang.String r4, java.security.cert.X509Certificate r5) {
            r3 = this;
            java.lang.String r4 = r3.asciiToLowercase(r4)
            r0 = 2
            java.util.List r5 = r3.getSubjectAltNames(r5, r0)
            boolean r0 = r5 instanceof java.util.Collection
            r1 = 0
            if (r0 == 0) goto L15
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L15
            goto L2e
        L15:
            java.util.Iterator r5 = r5.iterator()
        L19:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L2e
            java.lang.Object r0 = r5.next()
            java.lang.String r0 = (java.lang.String) r0
            okhttp3.internal.tls.OkHostnameVerifier r2 = okhttp3.internal.tls.OkHostnameVerifier.INSTANCE
            boolean r0 = r2.verifyHostname(r4, r0)
            if (r0 == 0) goto L19
            r1 = 1
        L2e:
            return r1
    }

    private final boolean verifyIpAddress(java.lang.String r3, java.security.cert.X509Certificate r4) {
            r2 = this;
            java.lang.String r3 = okhttp3.internal.HostnamesKt.toCanonicalHost(r3)
            r0 = 7
            java.util.List r4 = r2.getSubjectAltNames(r4, r0)
            boolean r0 = r4 instanceof java.util.Collection
            r1 = 0
            if (r0 == 0) goto L15
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L15
            goto L30
        L15:
            java.util.Iterator r4 = r4.iterator()
        L19:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L30
            java.lang.Object r0 = r4.next()
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = okhttp3.internal.HostnamesKt.toCanonicalHost(r0)
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r0)
            if (r0 == 0) goto L19
            r1 = 1
        L30:
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.lang.String> allSubjectAltNames(@org.jetbrains.annotations.NotNull java.security.cert.X509Certificate r3) {
            r2 = this;
            java.lang.String r0 = "certificate"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = 7
            java.util.List r0 = r2.getSubjectAltNames(r3, r0)
            r1 = 2
            java.util.List r3 = r2.getSubjectAltNames(r3, r1)
            java.util.List r3 = kotlin.collections.CollectionsKt.plus(r0, r3)
            return r3
    }

    public final boolean verify(@org.jetbrains.annotations.NotNull java.lang.String r2, @org.jetbrains.annotations.NotNull java.security.cert.X509Certificate r3) {
            r1 = this;
            java.lang.String r0 = "host"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "certificate"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            boolean r0 = okhttp3.internal.Util.canParseAsIpAddress(r2)
            if (r0 == 0) goto L15
            boolean r2 = r1.verifyIpAddress(r2, r3)
            goto L19
        L15:
            boolean r2 = r1.verifyHostname(r2, r3)
        L19:
            return r2
    }

    @Override // javax.net.ssl.HostnameVerifier
    public boolean verify(@org.jetbrains.annotations.NotNull java.lang.String r3, @org.jetbrains.annotations.NotNull javax.net.ssl.SSLSession r4) {
            r2 = this;
            java.lang.String r0 = "host"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "session"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            boolean r0 = r2.isAscii(r3)
            r1 = 0
            if (r0 != 0) goto L13
            goto L2b
        L13:
            java.security.cert.Certificate[] r4 = r4.getPeerCertificates()     // Catch: javax.net.ssl.SSLException -> L2b
            r4 = r4[r1]     // Catch: javax.net.ssl.SSLException -> L2b
            if (r4 == 0) goto L23
            java.security.cert.X509Certificate r4 = (java.security.cert.X509Certificate) r4     // Catch: javax.net.ssl.SSLException -> L2b
            boolean r3 = r2.verify(r3, r4)     // Catch: javax.net.ssl.SSLException -> L2b
            r1 = r3
            goto L2b
        L23:
            java.lang.NullPointerException r3 = new java.lang.NullPointerException     // Catch: javax.net.ssl.SSLException -> L2b
            java.lang.String r4 = "null cannot be cast to non-null type java.security.cert.X509Certificate"
            r3.<init>(r4)     // Catch: javax.net.ssl.SSLException -> L2b
            throw r3     // Catch: javax.net.ssl.SSLException -> L2b
        L2b:
            return r1
    }
}
