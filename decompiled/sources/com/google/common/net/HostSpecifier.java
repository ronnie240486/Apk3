package com.google.common.net;

/* JADX INFO: loaded from: classes3.dex */
@com.google.common.annotations.Beta
@com.google.common.annotations.GwtIncompatible
@com.google.common.net.ElementTypesAreNonnullByDefault
public final class HostSpecifier {
    private final java.lang.String canonicalForm;

    private HostSpecifier(java.lang.String r1) {
            r0 = this;
            r0.<init>()
            r0.canonicalForm = r1
            return
    }

    public static com.google.common.net.HostSpecifier from(java.lang.String r4) throws java.text.ParseException {
            com.google.common.net.HostSpecifier r4 = fromValid(r4)     // Catch: java.lang.IllegalArgumentException -> L5
            return r4
        L5:
            r0 = move-exception
            java.text.ParseException r1 = new java.text.ParseException
            java.lang.String r2 = "Invalid host specifier: "
            java.lang.String r4 = java.lang.String.valueOf(r4)
            int r3 = r4.length()
            if (r3 == 0) goto L19
            java.lang.String r4 = r2.concat(r4)
            goto L1e
        L19:
            java.lang.String r4 = new java.lang.String
            r4.<init>(r2)
        L1e:
            r2 = 0
            r1.<init>(r4, r2)
            r1.initCause(r0)
            throw r1
    }

    public static com.google.common.net.HostSpecifier fromValid(java.lang.String r3) {
            com.google.common.net.HostAndPort r3 = com.google.common.net.HostAndPort.fromString(r3)
            boolean r0 = r3.hasPort()
            r0 = r0 ^ 1
            com.google.common.base.Preconditions.checkArgument(r0)
            java.lang.String r3 = r3.getHost()
            r0 = 0
            java.net.InetAddress r0 = com.google.common.net.InetAddresses.forString(r3)     // Catch: java.lang.IllegalArgumentException -> L17
            goto L18
        L17:
        L18:
            if (r0 == 0) goto L24
            com.google.common.net.HostSpecifier r3 = new com.google.common.net.HostSpecifier
            java.lang.String r0 = com.google.common.net.InetAddresses.toUriString(r0)
            r3.<init>(r0)
            return r3
        L24:
            com.google.common.net.InternetDomainName r0 = com.google.common.net.InternetDomainName.from(r3)
            boolean r1 = r0.hasPublicSuffix()
            if (r1 == 0) goto L38
            com.google.common.net.HostSpecifier r3 = new com.google.common.net.HostSpecifier
            java.lang.String r0 = r0.toString()
            r3.<init>(r0)
            return r3
        L38:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Domain name does not have a recognized public suffix: "
            java.lang.String r3 = java.lang.String.valueOf(r3)
            int r2 = r3.length()
            if (r2 == 0) goto L4b
            java.lang.String r3 = r1.concat(r3)
            goto L50
        L4b:
            java.lang.String r3 = new java.lang.String
            r3.<init>(r1)
        L50:
            r0.<init>(r3)
            throw r0
    }

    public static boolean isValid(java.lang.String r0) {
            fromValid(r0)     // Catch: java.lang.IllegalArgumentException -> L5
            r0 = 1
            return r0
        L5:
            r0 = 0
            return r0
    }

    public boolean equals(@javax.annotation.CheckForNull java.lang.Object r2) {
            r1 = this;
            if (r1 != r2) goto L4
            r2 = 1
            return r2
        L4:
            boolean r0 = r2 instanceof com.google.common.net.HostSpecifier
            if (r0 == 0) goto L13
            com.google.common.net.HostSpecifier r2 = (com.google.common.net.HostSpecifier) r2
            java.lang.String r0 = r1.canonicalForm
            java.lang.String r2 = r2.canonicalForm
            boolean r2 = r0.equals(r2)
            return r2
        L13:
            r2 = 0
            return r2
    }

    public int hashCode() {
            r1 = this;
            java.lang.String r0 = r1.canonicalForm
            int r0 = r0.hashCode()
            return r0
    }

    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = r1.canonicalForm
            return r0
    }
}
