package com.google.common.net;

/* JADX INFO: loaded from: classes2.dex */
@com.google.errorprone.annotations.Immutable
@com.google.common.annotations.Beta
@com.google.common.annotations.GwtCompatible
@com.google.common.net.ElementTypesAreNonnullByDefault
public final class HostAndPort implements java.io.Serializable {
    private static final int NO_PORT = -1;
    private static final long serialVersionUID = 0;
    private final boolean hasBracketlessColons;
    private final java.lang.String host;
    private final int port;

    private HostAndPort(java.lang.String r1, int r2, boolean r3) {
            r0 = this;
            r0.<init>()
            r0.host = r1
            r0.port = r2
            r0.hasBracketlessColons = r3
            return
    }

    public static com.google.common.net.HostAndPort fromHost(java.lang.String r3) {
            com.google.common.net.HostAndPort r0 = fromString(r3)
            boolean r1 = r0.hasPort()
            r1 = r1 ^ 1
            java.lang.String r2 = "Host has a port: %s"
            com.google.common.base.Preconditions.checkArgument(r1, r2, r3)
            return r0
    }

    public static com.google.common.net.HostAndPort fromParts(java.lang.String r3, int r4) {
            boolean r0 = isValidPort(r4)
            java.lang.String r1 = "Port out of range: %s"
            com.google.common.base.Preconditions.checkArgument(r0, r1, r4)
            com.google.common.net.HostAndPort r0 = fromString(r3)
            boolean r1 = r0.hasPort()
            r1 = r1 ^ 1
            java.lang.String r2 = "Host has a port: %s"
            com.google.common.base.Preconditions.checkArgument(r1, r2, r3)
            com.google.common.net.HostAndPort r3 = new com.google.common.net.HostAndPort
            java.lang.String r1 = r0.host
            boolean r0 = r0.hasBracketlessColons
            r3.<init>(r1, r4, r0)
            return r3
    }

    public static com.google.common.net.HostAndPort fromString(java.lang.String r8) {
            com.google.common.base.Preconditions.checkNotNull(r8)
            java.lang.String r0 = "["
            boolean r0 = r8.startsWith(r0)
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L19
            java.lang.String[] r0 = getHostAndPortFromBracketedHost(r8)
            r4 = r0[r3]
            r0 = r0[r2]
        L16:
            r5 = r4
            r4 = 0
            goto L3c
        L19:
            r0 = 58
            int r4 = r8.indexOf(r0)
            if (r4 < 0) goto L32
            int r5 = r4 + 1
            int r0 = r8.indexOf(r0, r5)
            if (r0 != r1) goto L32
            java.lang.String r4 = r8.substring(r3, r4)
            java.lang.String r0 = r8.substring(r5)
            goto L16
        L32:
            if (r4 < 0) goto L36
            r0 = 1
            goto L37
        L36:
            r0 = 0
        L37:
            r4 = 0
            r5 = r8
            r7 = r4
            r4 = r0
            r0 = r7
        L3c:
            boolean r6 = com.google.common.base.Strings.isNullOrEmpty(r0)
            if (r6 != 0) goto L81
            java.lang.String r1 = "+"
            boolean r1 = r0.startsWith(r1)
            if (r1 != 0) goto L55
            com.google.common.base.CharMatcher r1 = com.google.common.base.CharMatcher.ascii()
            boolean r1 = r1.matchesAllOf(r0)
            if (r1 == 0) goto L55
            goto L56
        L55:
            r2 = 0
        L56:
            java.lang.String r1 = "Unparseable port number: %s"
            com.google.common.base.Preconditions.checkArgument(r2, r1, r8)
            int r1 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.NumberFormatException -> L69
            boolean r0 = isValidPort(r1)
            java.lang.String r2 = "Port number out of range: %s"
            com.google.common.base.Preconditions.checkArgument(r0, r2, r8)
            goto L81
        L69:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Unparseable port number: "
            int r2 = r8.length()
            if (r2 == 0) goto L78
            java.lang.String r8 = r1.concat(r8)
            goto L7d
        L78:
            java.lang.String r8 = new java.lang.String
            r8.<init>(r1)
        L7d:
            r0.<init>(r8)
            throw r0
        L81:
            com.google.common.net.HostAndPort r8 = new com.google.common.net.HostAndPort
            r8.<init>(r5, r1, r4)
            return r8
    }

    private static java.lang.String[] getHostAndPortFromBracketedHost(java.lang.String r8) {
            r0 = 0
            char r1 = r8.charAt(r0)
            r2 = 1
            r3 = 91
            if (r1 != r3) goto Lc
            r1 = 1
            goto Ld
        Lc:
            r1 = 0
        Ld:
            java.lang.String r3 = "Bracketed host-port string must start with a bracket: %s"
            com.google.common.base.Preconditions.checkArgument(r1, r3, r8)
            r1 = 58
            int r3 = r8.indexOf(r1)
            r4 = 93
            int r4 = r8.lastIndexOf(r4)
            r5 = -1
            if (r3 <= r5) goto L25
            if (r4 <= r3) goto L25
            r3 = 1
            goto L26
        L25:
            r3 = 0
        L26:
            java.lang.String r5 = "Invalid bracketed host/port: %s"
            com.google.common.base.Preconditions.checkArgument(r3, r5, r8)
            java.lang.String r3 = r8.substring(r2, r4)
            int r5 = r4 + 1
            int r6 = r8.length()
            r7 = 2
            if (r5 != r6) goto L41
            java.lang.String[] r8 = new java.lang.String[r7]
            r8[r0] = r3
            java.lang.String r0 = ""
            r8[r2] = r0
            return r8
        L41:
            char r5 = r8.charAt(r5)
            if (r5 != r1) goto L49
            r1 = 1
            goto L4a
        L49:
            r1 = 0
        L4a:
            java.lang.String r5 = "Only a colon may follow a close bracket: %s"
            com.google.common.base.Preconditions.checkArgument(r1, r5, r8)
            int r4 = r4 + r7
            r1 = r4
        L51:
            int r5 = r8.length()
            if (r1 >= r5) goto L67
            char r5 = r8.charAt(r1)
            boolean r5 = java.lang.Character.isDigit(r5)
            java.lang.String r6 = "Port must be numeric: %s"
            com.google.common.base.Preconditions.checkArgument(r5, r6, r8)
            int r1 = r1 + 1
            goto L51
        L67:
            java.lang.String[] r1 = new java.lang.String[r7]
            r1[r0] = r3
            java.lang.String r8 = r8.substring(r4)
            r1[r2] = r8
            return r1
    }

    private static boolean isValidPort(int r1) {
            if (r1 < 0) goto L9
            r0 = 65535(0xffff, float:9.1834E-41)
            if (r1 > r0) goto L9
            r1 = 1
            goto La
        L9:
            r1 = 0
        La:
            return r1
    }

    public boolean equals(@javax.annotation.CheckForNull java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof com.google.common.net.HostAndPort
            r2 = 0
            if (r1 == 0) goto L1e
            com.google.common.net.HostAndPort r5 = (com.google.common.net.HostAndPort) r5
            java.lang.String r1 = r4.host
            java.lang.String r3 = r5.host
            boolean r1 = com.google.common.base.Objects.equal(r1, r3)
            if (r1 == 0) goto L1c
            int r1 = r4.port
            int r5 = r5.port
            if (r1 != r5) goto L1c
            goto L1d
        L1c:
            r0 = 0
        L1d:
            return r0
        L1e:
            return r2
    }

    public java.lang.String getHost() {
            r1 = this;
            java.lang.String r0 = r1.host
            return r0
    }

    public int getPort() {
            r1 = this;
            boolean r0 = r1.hasPort()
            com.google.common.base.Preconditions.checkState(r0)
            int r0 = r1.port
            return r0
    }

    public int getPortOrDefault(int r2) {
            r1 = this;
            boolean r0 = r1.hasPort()
            if (r0 == 0) goto L8
            int r2 = r1.port
        L8:
            return r2
    }

    public boolean hasPort() {
            r1 = this;
            int r0 = r1.port
            if (r0 < 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    public int hashCode() {
            r3 = this;
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = r3.host
            r2 = 0
            r0[r2] = r1
            int r1 = r3.port
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 1
            r0[r2] = r1
            int r0 = com.google.common.base.Objects.hashCode(r0)
            return r0
    }

    public com.google.common.net.HostAndPort requireBracketsForIPv6() {
            r3 = this;
            boolean r0 = r3.hasBracketlessColons
            r0 = r0 ^ 1
            java.lang.String r1 = r3.host
            java.lang.String r2 = "Possible bracketless IPv6 literal: %s"
            com.google.common.base.Preconditions.checkArgument(r0, r2, r1)
            return r3
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = r3.host
            int r1 = r1.length()
            int r1 = r1 + 8
            r0.<init>(r1)
            java.lang.String r1 = r3.host
            r2 = 58
            int r1 = r1.indexOf(r2)
            if (r1 < 0) goto L27
            r1 = 91
            r0.append(r1)
            java.lang.String r1 = r3.host
            r0.append(r1)
            r1 = 93
            r0.append(r1)
            goto L2c
        L27:
            java.lang.String r1 = r3.host
            r0.append(r1)
        L2c:
            boolean r1 = r3.hasPort()
            if (r1 == 0) goto L3a
            r0.append(r2)
            int r1 = r3.port
            r0.append(r1)
        L3a:
            java.lang.String r0 = r0.toString()
            return r0
    }

    public com.google.common.net.HostAndPort withDefaultPort(int r4) {
            r3 = this;
            boolean r0 = isValidPort(r4)
            com.google.common.base.Preconditions.checkArgument(r0)
            boolean r0 = r3.hasPort()
            if (r0 == 0) goto Le
            return r3
        Le:
            com.google.common.net.HostAndPort r0 = new com.google.common.net.HostAndPort
            java.lang.String r1 = r3.host
            boolean r2 = r3.hasBracketlessColons
            r0.<init>(r1, r4, r2)
            return r0
    }
}
