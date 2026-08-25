package com.google.common.net;

/* JADX INFO: loaded from: classes.dex */
@com.google.common.annotations.Beta
@com.google.common.annotations.GwtIncompatible
@com.google.common.net.ElementTypesAreNonnullByDefault
public final class InetAddresses {
    private static final java.net.Inet4Address ANY4 = null;
    private static final char IPV4_DELIMITER = '.';
    private static final com.google.common.base.CharMatcher IPV4_DELIMITER_MATCHER = null;
    private static final int IPV4_PART_COUNT = 4;
    private static final char IPV6_DELIMITER = ':';
    private static final com.google.common.base.CharMatcher IPV6_DELIMITER_MATCHER = null;
    private static final int IPV6_PART_COUNT = 8;
    private static final java.net.Inet4Address LOOPBACK4 = null;

    /* JADX INFO: loaded from: classes2.dex */
    @com.google.common.annotations.Beta
    public static final class TeredoInfo {
        private final java.net.Inet4Address client;
        private final int flags;
        private final int port;
        private final java.net.Inet4Address server;

        public TeredoInfo(@javax.annotation.CheckForNull java.net.Inet4Address r6, @javax.annotation.CheckForNull java.net.Inet4Address r7, int r8, int r9) {
                r5 = this;
                r5.<init>()
                r0 = 1
                r1 = 65535(0xffff, float:9.1834E-41)
                r2 = 0
                if (r8 < 0) goto Le
                if (r8 > r1) goto Le
                r3 = 1
                goto Lf
            Le:
                r3 = 0
            Lf:
                java.lang.String r4 = "port '%s' is out of range (0 <= port <= 0xffff)"
                com.google.common.base.Preconditions.checkArgument(r3, r4, r8)
                if (r9 < 0) goto L19
                if (r9 > r1) goto L19
                goto L1a
            L19:
                r0 = 0
            L1a:
                java.lang.String r1 = "flags '%s' is out of range (0 <= flags <= 0xffff)"
                com.google.common.base.Preconditions.checkArgument(r0, r1, r9)
                java.net.Inet4Address r0 = com.google.common.net.InetAddresses.access$000()
                java.lang.Object r6 = com.google.common.base.MoreObjects.firstNonNull(r6, r0)
                java.net.Inet4Address r6 = (java.net.Inet4Address) r6
                r5.server = r6
                java.net.Inet4Address r6 = com.google.common.net.InetAddresses.access$000()
                java.lang.Object r6 = com.google.common.base.MoreObjects.firstNonNull(r7, r6)
                java.net.Inet4Address r6 = (java.net.Inet4Address) r6
                r5.client = r6
                r5.port = r8
                r5.flags = r9
                return
        }

        public java.net.Inet4Address getClient() {
                r1 = this;
                java.net.Inet4Address r0 = r1.client
                return r0
        }

        public int getFlags() {
                r1 = this;
                int r0 = r1.flags
                return r0
        }

        public int getPort() {
                r1 = this;
                int r0 = r1.port
                return r0
        }

        public java.net.Inet4Address getServer() {
                r1 = this;
                java.net.Inet4Address r0 = r1.server
                return r0
        }
    }

    static {
            r0 = 46
            com.google.common.base.CharMatcher r0 = com.google.common.base.CharMatcher.is(r0)
            com.google.common.net.InetAddresses.IPV4_DELIMITER_MATCHER = r0
            r0 = 58
            com.google.common.base.CharMatcher r0 = com.google.common.base.CharMatcher.is(r0)
            com.google.common.net.InetAddresses.IPV6_DELIMITER_MATCHER = r0
            java.lang.String r0 = "127.0.0.1"
            java.net.InetAddress r0 = forString(r0)
            java.net.Inet4Address r0 = (java.net.Inet4Address) r0
            com.google.common.net.InetAddresses.LOOPBACK4 = r0
            java.lang.String r0 = "0.0.0.0"
            java.net.InetAddress r0 = forString(r0)
            java.net.Inet4Address r0 = (java.net.Inet4Address) r0
            com.google.common.net.InetAddresses.ANY4 = r0
            return
    }

    private InetAddresses() {
            r0 = this;
            r0.<init>()
            return
    }

    public static /* synthetic */ java.net.Inet4Address access$000() {
            java.net.Inet4Address r0 = com.google.common.net.InetAddresses.ANY4
            return r0
    }

    private static java.net.InetAddress bytesToInetAddress(byte[] r1) {
            java.net.InetAddress r1 = java.net.InetAddress.getByAddress(r1)     // Catch: java.net.UnknownHostException -> L5
            return r1
        L5:
            r1 = move-exception
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>(r1)
            throw r0
    }

    public static int coerceToInteger(java.net.InetAddress r0) {
            java.net.Inet4Address r0 = getCoercedIPv4Address(r0)
            byte[] r0 = r0.getAddress()
            com.google.common.io.ByteArrayDataInput r0 = com.google.common.io.ByteStreams.newDataInput(r0)
            int r0 = r0.readInt()
            return r0
    }

    private static void compressLongestRunOfZeroes(int[] r6) {
            r0 = -1
            r1 = 0
            r2 = -1
            r3 = -1
            r4 = -1
        L5:
            int r5 = r6.length
            int r5 = r5 + 1
            if (r1 >= r5) goto L21
            int r5 = r6.length
            if (r1 >= r5) goto L15
            r5 = r6[r1]
            if (r5 != 0) goto L15
            if (r4 >= 0) goto L1e
            r4 = r1
            goto L1e
        L15:
            if (r4 < 0) goto L1e
            int r5 = r1 - r4
            if (r5 <= r2) goto L1d
            r3 = r4
            r2 = r5
        L1d:
            r4 = -1
        L1e:
            int r1 = r1 + 1
            goto L5
        L21:
            r1 = 2
            if (r2 < r1) goto L28
            int r2 = r2 + r3
            java.util.Arrays.fill(r6, r3, r2, r0)
        L28:
            return
    }

    @javax.annotation.CheckForNull
    private static java.lang.String convertDottedQuadToHex(java.lang.String r5) {
            r0 = 58
            int r0 = r5.lastIndexOf(r0)
            r1 = 1
            int r0 = r0 + r1
            r2 = 0
            java.lang.String r3 = r5.substring(r2, r0)
            java.lang.String r5 = r5.substring(r0)
            byte[] r5 = textToNumericFormatV4(r5)
            if (r5 != 0) goto L19
            r5 = 0
            return r5
        L19:
            r0 = r5[r2]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = r0 << 8
            r2 = r5[r1]
            r2 = r2 & 255(0xff, float:3.57E-43)
            r0 = r0 | r2
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            r2 = 2
            r2 = r5[r2]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << 8
            r4 = 3
            r5 = r5[r4]
            r5 = r5 & 255(0xff, float:3.57E-43)
            r5 = r5 | r2
            java.lang.String r5 = java.lang.Integer.toHexString(r5)
            int r1 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r3, r1)
            int r1 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r0, r1)
            int r1 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r5, r1)
            java.lang.String r2 = ":"
            java.lang.String r5 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r1, r3, r0, r2, r5)
            return r5
    }

    public static java.net.InetAddress decrement(java.net.InetAddress r5) {
            byte[] r0 = r5.getAddress()
            int r1 = r0.length
            r2 = 1
            int r1 = r1 - r2
        L7:
            if (r1 < 0) goto L13
            r3 = r0[r1]
            if (r3 != 0) goto L13
            r3 = -1
            r0[r1] = r3
            int r1 = r1 + (-1)
            goto L7
        L13:
            if (r1 < 0) goto L17
            r3 = 1
            goto L18
        L17:
            r3 = 0
        L18:
            java.lang.String r4 = "Decrementing %s would wrap."
            com.google.common.base.Preconditions.checkArgument(r3, r4, r5)
            r5 = r0[r1]
            int r5 = r5 - r2
            byte r5 = (byte) r5
            r0[r1] = r5
            java.net.InetAddress r5 = bytesToInetAddress(r0)
            return r5
    }

    public static java.net.InetAddress forString(java.lang.String r2) {
            byte[] r0 = ipStringToBytes(r2)
            if (r0 == 0) goto Lb
            java.net.InetAddress r2 = bytesToInetAddress(r0)
            return r2
        Lb:
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r2
            java.lang.String r2 = "'%s' is not an IP string literal."
            java.lang.IllegalArgumentException r2 = formatIllegalArgumentException(r2, r0)
            throw r2
    }

    public static java.net.InetAddress forUriString(java.lang.String r2) {
            java.net.InetAddress r0 = forUriStringNoThrow(r2)
            if (r0 == 0) goto L7
            return r0
        L7:
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r2
            java.lang.String r2 = "Not a valid URI IP literal: '%s'"
            java.lang.IllegalArgumentException r2 = formatIllegalArgumentException(r2, r0)
            throw r2
    }

    @javax.annotation.CheckForNull
    private static java.net.InetAddress forUriStringNoThrow(java.lang.String r2) {
            com.google.common.base.Preconditions.checkNotNull(r2)
            java.lang.String r0 = "["
            boolean r0 = r2.startsWith(r0)
            if (r0 == 0) goto L20
            java.lang.String r0 = "]"
            boolean r0 = r2.endsWith(r0)
            if (r0 == 0) goto L20
            int r0 = r2.length()
            r1 = 1
            int r0 = r0 - r1
            java.lang.String r2 = r2.substring(r1, r0)
            r0 = 16
            goto L21
        L20:
            r0 = 4
        L21:
            byte[] r2 = ipStringToBytes(r2)
            if (r2 == 0) goto L30
            int r1 = r2.length
            if (r1 == r0) goto L2b
            goto L30
        L2b:
            java.net.InetAddress r2 = bytesToInetAddress(r2)
            return r2
        L30:
            r2 = 0
            return r2
    }

    private static java.lang.IllegalArgumentException formatIllegalArgumentException(java.lang.String r2, java.lang.Object... r3) {
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.util.Locale r1 = java.util.Locale.ROOT
            java.lang.String r2 = java.lang.String.format(r1, r2, r3)
            r0.<init>(r2)
            return r0
    }

    private static java.net.InetAddress fromBigInteger(java.math.BigInteger r9, boolean r10) {
            int r0 = r9.signum()
            r1 = 1
            r2 = 0
            if (r0 < 0) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            java.lang.String r3 = "BigInteger must be greater than or equal to 0"
            com.google.common.base.Preconditions.checkArgument(r0, r3)
            if (r10 == 0) goto L15
            r10 = 16
            goto L16
        L15:
            r10 = 4
        L16:
            byte[] r0 = r9.toByteArray()
            byte[] r3 = new byte[r10]
            int r4 = r0.length
            int r4 = r4 - r10
            int r4 = java.lang.Math.max(r2, r4)
            int r5 = r0.length
            int r5 = r5 - r4
            int r6 = r10 - r5
            r7 = 0
        L27:
            if (r7 >= r4) goto L42
            r8 = r0[r7]
            if (r8 != 0) goto L30
            int r7 = r7 + 1
            goto L27
        L30:
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r0[r2] = r10
            r0[r1] = r9
            java.lang.String r9 = "BigInteger cannot be converted to InetAddress because it has more than %d bytes: %s"
            java.lang.IllegalArgumentException r9 = formatIllegalArgumentException(r9, r0)
            throw r9
        L42:
            java.lang.System.arraycopy(r0, r4, r3, r6, r5)
            java.net.InetAddress r9 = java.net.InetAddress.getByAddress(r3)     // Catch: java.net.UnknownHostException -> L4a
            return r9
        L4a:
            r9 = move-exception
            java.lang.AssertionError r10 = new java.lang.AssertionError
            r10.<init>(r9)
            throw r10
    }

    public static java.net.Inet4Address fromIPv4BigInteger(java.math.BigInteger r1) {
            r0 = 0
            java.net.InetAddress r1 = fromBigInteger(r1, r0)
            java.net.Inet4Address r1 = (java.net.Inet4Address) r1
            return r1
    }

    public static java.net.Inet6Address fromIPv6BigInteger(java.math.BigInteger r1) {
            r0 = 1
            java.net.InetAddress r1 = fromBigInteger(r1, r0)
            java.net.Inet6Address r1 = (java.net.Inet6Address) r1
            return r1
    }

    public static java.net.Inet4Address fromInteger(int r0) {
            byte[] r0 = com.google.common.primitives.Ints.toByteArray(r0)
            java.net.Inet4Address r0 = getInet4Address(r0)
            return r0
    }

    public static java.net.InetAddress fromLittleEndianByteArray(byte[] r3) throws java.net.UnknownHostException {
            int r0 = r3.length
            byte[] r0 = new byte[r0]
            r1 = 0
        L4:
            int r2 = r3.length
            if (r1 >= r2) goto L12
            int r2 = r3.length
            int r2 = r2 - r1
            int r2 = r2 + (-1)
            r2 = r3[r2]
            r0[r1] = r2
            int r1 = r1 + 1
            goto L4
        L12:
            java.net.InetAddress r3 = java.net.InetAddress.getByAddress(r0)
            return r3
    }

    public static java.net.Inet4Address get6to4IPv4Address(java.net.Inet6Address r3) {
            boolean r0 = is6to4Address(r3)
            java.lang.String r1 = toAddrString(r3)
            java.lang.String r2 = "Address '%s' is not a 6to4 address."
            com.google.common.base.Preconditions.checkArgument(r0, r2, r1)
            byte[] r3 = r3.getAddress()
            r0 = 2
            r1 = 6
            byte[] r3 = java.util.Arrays.copyOfRange(r3, r0, r1)
            java.net.Inet4Address r3 = getInet4Address(r3)
            return r3
    }

    public static java.net.Inet4Address getCoercedIPv4Address(java.net.InetAddress r6) {
            boolean r0 = r6 instanceof java.net.Inet4Address
            if (r0 == 0) goto L7
            java.net.Inet4Address r6 = (java.net.Inet4Address) r6
            return r6
        L7:
            byte[] r0 = r6.getAddress()
            r1 = 0
            r2 = 0
        Ld:
            r3 = 15
            r4 = 1
            if (r2 >= r3) goto L1b
            r5 = r0[r2]
            if (r5 == 0) goto L18
            r2 = 0
            goto L1c
        L18:
            int r2 = r2 + 1
            goto Ld
        L1b:
            r2 = 1
        L1c:
            if (r2 == 0) goto L25
            r5 = r0[r3]
            if (r5 != r4) goto L25
            java.net.Inet4Address r6 = com.google.common.net.InetAddresses.LOOPBACK4
            return r6
        L25:
            if (r2 == 0) goto L2e
            r0 = r0[r3]
            if (r0 != 0) goto L2e
            java.net.Inet4Address r6 = com.google.common.net.InetAddresses.ANY4
            return r6
        L2e:
            java.net.Inet6Address r6 = (java.net.Inet6Address) r6
            boolean r0 = hasEmbeddedIPv4ClientAddress(r6)
            if (r0 == 0) goto L40
            java.net.Inet4Address r6 = getEmbeddedIPv4ClientAddress(r6)
            int r6 = r6.hashCode()
            long r0 = (long) r6
            goto L4e
        L40:
            byte[] r6 = r6.getAddress()
            r0 = 8
            java.nio.ByteBuffer r6 = java.nio.ByteBuffer.wrap(r6, r1, r0)
            long r0 = r6.getLong()
        L4e:
            com.google.common.hash.HashFunction r6 = com.google.common.hash.Hashing.murmur3_32_fixed()
            com.google.common.hash.HashCode r6 = r6.hashLong(r0)
            int r6 = r6.asInt()
            r0 = -536870912(0xffffffffe0000000, float:-3.689349E19)
            r6 = r6 | r0
            r0 = -1
            if (r6 != r0) goto L61
            r6 = -2
        L61:
            byte[] r6 = com.google.common.primitives.Ints.toByteArray(r6)
            java.net.Inet4Address r6 = getInet4Address(r6)
            return r6
    }

    public static java.net.Inet4Address getCompatIPv4Address(java.net.Inet6Address r3) {
            boolean r0 = isCompatIPv4Address(r3)
            java.lang.String r1 = toAddrString(r3)
            java.lang.String r2 = "Address '%s' is not IPv4-compatible."
            com.google.common.base.Preconditions.checkArgument(r0, r2, r1)
            byte[] r3 = r3.getAddress()
            r0 = 12
            r1 = 16
            byte[] r3 = java.util.Arrays.copyOfRange(r3, r0, r1)
            java.net.Inet4Address r3 = getInet4Address(r3)
            return r3
    }

    public static java.net.Inet4Address getEmbeddedIPv4ClientAddress(java.net.Inet6Address r2) {
            boolean r0 = isCompatIPv4Address(r2)
            if (r0 == 0) goto Lb
            java.net.Inet4Address r2 = getCompatIPv4Address(r2)
            return r2
        Lb:
            boolean r0 = is6to4Address(r2)
            if (r0 == 0) goto L16
            java.net.Inet4Address r2 = get6to4IPv4Address(r2)
            return r2
        L16:
            boolean r0 = isTeredoAddress(r2)
            if (r0 == 0) goto L25
            com.google.common.net.InetAddresses$TeredoInfo r2 = getTeredoInfo(r2)
            java.net.Inet4Address r2 = r2.getClient()
            return r2
        L25:
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            java.lang.String r2 = toAddrString(r2)
            r0[r1] = r2
            java.lang.String r2 = "'%s' has no embedded IPv4 address."
            java.lang.IllegalArgumentException r2 = formatIllegalArgumentException(r2, r0)
            throw r2
    }

    private static java.net.Inet4Address getInet4Address(byte[] r3) {
            int r0 = r3.length
            r1 = 4
            if (r0 != r1) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            int r1 = r3.length
            java.lang.String r2 = "Byte array has invalid length for an IPv4 address: %s != 4."
            com.google.common.base.Preconditions.checkArgument(r0, r2, r1)
            java.net.InetAddress r3 = bytesToInetAddress(r3)
            java.net.Inet4Address r3 = (java.net.Inet4Address) r3
            return r3
    }

    public static java.net.Inet4Address getIsatapIPv4Address(java.net.Inet6Address r3) {
            boolean r0 = isIsatapAddress(r3)
            java.lang.String r1 = toAddrString(r3)
            java.lang.String r2 = "Address '%s' is not an ISATAP address."
            com.google.common.base.Preconditions.checkArgument(r0, r2, r1)
            byte[] r3 = r3.getAddress()
            r0 = 12
            r1 = 16
            byte[] r3 = java.util.Arrays.copyOfRange(r3, r0, r1)
            java.net.Inet4Address r3 = getInet4Address(r3)
            return r3
    }

    public static com.google.common.net.InetAddresses.TeredoInfo getTeredoInfo(java.net.Inet6Address r5) {
            boolean r0 = isTeredoAddress(r5)
            java.lang.String r1 = toAddrString(r5)
            java.lang.String r2 = "Address '%s' is not a Teredo address."
            com.google.common.base.Preconditions.checkArgument(r0, r2, r1)
            byte[] r5 = r5.getAddress()
            r0 = 4
            r1 = 8
            byte[] r0 = java.util.Arrays.copyOfRange(r5, r0, r1)
            java.net.Inet4Address r0 = getInet4Address(r0)
            com.google.common.io.ByteArrayDataInput r1 = com.google.common.io.ByteStreams.newDataInput(r5, r1)
            short r1 = r1.readShort()
            r2 = 65535(0xffff, float:9.1834E-41)
            r1 = r1 & r2
            r3 = 10
            com.google.common.io.ByteArrayDataInput r3 = com.google.common.io.ByteStreams.newDataInput(r5, r3)
            short r3 = r3.readShort()
            int r3 = ~r3
            r2 = r2 & r3
            r3 = 12
            r4 = 16
            byte[] r5 = java.util.Arrays.copyOfRange(r5, r3, r4)
            r3 = 0
        L3d:
            int r4 = r5.length
            if (r3 >= r4) goto L49
            r4 = r5[r3]
            int r4 = ~r4
            byte r4 = (byte) r4
            r5[r3] = r4
            int r3 = r3 + 1
            goto L3d
        L49:
            java.net.Inet4Address r5 = getInet4Address(r5)
            com.google.common.net.InetAddresses$TeredoInfo r3 = new com.google.common.net.InetAddresses$TeredoInfo
            r3.<init>(r0, r5, r2, r1)
            return r3
    }

    public static boolean hasEmbeddedIPv4ClientAddress(java.net.Inet6Address r1) {
            boolean r0 = isCompatIPv4Address(r1)
            if (r0 != 0) goto L15
            boolean r0 = is6to4Address(r1)
            if (r0 != 0) goto L15
            boolean r1 = isTeredoAddress(r1)
            if (r1 == 0) goto L13
            goto L15
        L13:
            r1 = 0
            goto L16
        L15:
            r1 = 1
        L16:
            return r1
    }

    private static java.lang.String hextetsToIPv6String(int[] r5) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 39
            r0.<init>(r1)
            r1 = 0
            r2 = 0
            r3 = 0
        La:
            int r4 = r5.length
            if (r2 >= r4) goto L34
            r4 = r5[r2]
            if (r4 < 0) goto L13
            r4 = 1
            goto L14
        L13:
            r4 = 0
        L14:
            if (r4 == 0) goto L27
            if (r3 == 0) goto L1d
            r3 = 58
            r0.append(r3)
        L1d:
            r3 = r5[r2]
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            r0.append(r3)
            goto L30
        L27:
            if (r2 == 0) goto L2b
            if (r3 == 0) goto L30
        L2b:
            java.lang.String r3 = "::"
            r0.append(r3)
        L30:
            int r2 = r2 + 1
            r3 = r4
            goto La
        L34:
            java.lang.String r5 = r0.toString()
            return r5
    }

    public static java.net.InetAddress increment(java.net.InetAddress r6) {
            byte[] r0 = r6.getAddress()
            int r1 = r0.length
            r2 = 1
            int r1 = r1 - r2
        L7:
            r3 = 0
            if (r1 < 0) goto L14
            r4 = r0[r1]
            r5 = -1
            if (r4 != r5) goto L14
            r0[r1] = r3
            int r1 = r1 + (-1)
            goto L7
        L14:
            if (r1 < 0) goto L17
            r3 = 1
        L17:
            java.lang.String r4 = "Incrementing %s would wrap."
            com.google.common.base.Preconditions.checkArgument(r3, r4, r6)
            r6 = r0[r1]
            int r6 = r6 + r2
            byte r6 = (byte) r6
            r0[r1] = r6
            java.net.InetAddress r6 = bytesToInetAddress(r0)
            return r6
    }

    @javax.annotation.CheckForNull
    private static byte[] ipStringToBytes(java.lang.String r9) {
            r0 = 0
            r1 = 0
            r2 = 0
            r3 = 0
        L4:
            int r4 = r9.length()
            r5 = -1
            r6 = 0
            if (r1 >= r4) goto L31
            char r4 = r9.charAt(r1)
            r7 = 46
            r8 = 1
            if (r4 != r7) goto L17
            r2 = 1
            goto L2e
        L17:
            r7 = 58
            if (r4 != r7) goto L20
            if (r2 == 0) goto L1e
            return r6
        L1e:
            r3 = 1
            goto L2e
        L20:
            r7 = 37
            if (r4 != r7) goto L25
            goto L32
        L25:
            r7 = 16
            int r4 = java.lang.Character.digit(r4, r7)
            if (r4 != r5) goto L2e
            return r6
        L2e:
            int r1 = r1 + 1
            goto L4
        L31:
            r1 = -1
        L32:
            if (r3 == 0) goto L48
            if (r2 == 0) goto L3d
            java.lang.String r9 = convertDottedQuadToHex(r9)
            if (r9 != 0) goto L3d
            return r6
        L3d:
            if (r1 == r5) goto L43
            java.lang.String r9 = r9.substring(r0, r1)
        L43:
            byte[] r9 = textToNumericFormatV6(r9)
            return r9
        L48:
            if (r2 == 0) goto L52
            if (r1 == r5) goto L4d
            return r6
        L4d:
            byte[] r9 = textToNumericFormatV4(r9)
            return r9
        L52:
            return r6
    }

    public static boolean is6to4Address(java.net.Inet6Address r4) {
            byte[] r4 = r4.getAddress()
            r0 = 0
            r1 = r4[r0]
            r2 = 1
            r3 = 32
            if (r1 != r3) goto L12
            r4 = r4[r2]
            r1 = 2
            if (r4 != r1) goto L12
            r0 = 1
        L12:
            return r0
    }

    public static boolean isCompatIPv4Address(java.net.Inet6Address r4) {
            boolean r0 = r4.isIPv4CompatibleAddress()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            byte[] r4 = r4.getAddress()
            r0 = 12
            r0 = r4[r0]
            r2 = 1
            if (r0 != 0) goto L2a
            r0 = 13
            r0 = r4[r0]
            if (r0 != 0) goto L2a
            r0 = 14
            r0 = r4[r0]
            if (r0 != 0) goto L2a
            r0 = 15
            r3 = r4[r0]
            if (r3 == 0) goto L29
            r4 = r4[r0]
            if (r4 != r2) goto L2a
        L29:
            return r1
        L2a:
            return r2
    }

    public static boolean isInetAddress(java.lang.String r0) {
            byte[] r0 = ipStringToBytes(r0)
            if (r0 == 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    public static boolean isIsatapAddress(java.net.Inet6Address r3) {
            boolean r0 = isTeredoAddress(r3)
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            byte[] r3 = r3.getAddress()
            r0 = 8
            r0 = r3[r0]
            r2 = 3
            r0 = r0 | r2
            if (r0 == r2) goto L15
            return r1
        L15:
            r0 = 9
            r0 = r3[r0]
            if (r0 != 0) goto L2b
            r0 = 10
            r0 = r3[r0]
            r2 = 94
            if (r0 != r2) goto L2b
            r0 = 11
            r3 = r3[r0]
            r0 = -2
            if (r3 != r0) goto L2b
            r1 = 1
        L2b:
            return r1
    }

    public static boolean isMappedIPv4Address(java.lang.String r4) {
            byte[] r4 = ipStringToBytes(r4)
            r0 = 0
            if (r4 == 0) goto L28
            int r1 = r4.length
            r2 = 16
            if (r1 != r2) goto L28
            r1 = 0
        Ld:
            r2 = 10
            if (r1 >= r2) goto L19
            r2 = r4[r1]
            if (r2 == 0) goto L16
            return r0
        L16:
            int r1 = r1 + 1
            goto Ld
        L19:
            r1 = 12
            if (r2 >= r1) goto L26
            r1 = r4[r2]
            r3 = -1
            if (r1 == r3) goto L23
            return r0
        L23:
            int r2 = r2 + 1
            goto L19
        L26:
            r4 = 1
            return r4
        L28:
            return r0
    }

    public static boolean isMaximum(java.net.InetAddress r5) {
            byte[] r5 = r5.getAddress()
            int r0 = r5.length
            r1 = 0
            r2 = 0
        L7:
            if (r2 >= r0) goto L12
            r3 = r5[r2]
            r4 = -1
            if (r3 == r4) goto Lf
            return r1
        Lf:
            int r2 = r2 + 1
            goto L7
        L12:
            r5 = 1
            return r5
    }

    public static boolean isTeredoAddress(java.net.Inet6Address r4) {
            byte[] r4 = r4.getAddress()
            r0 = 0
            r1 = r4[r0]
            r2 = 1
            r3 = 32
            if (r1 != r3) goto L1b
            r1 = r4[r2]
            if (r1 != r2) goto L1b
            r1 = 2
            r1 = r4[r1]
            if (r1 != 0) goto L1b
            r1 = 3
            r4 = r4[r1]
            if (r4 != 0) goto L1b
            r0 = 1
        L1b:
            return r0
    }

    public static boolean isUriInetAddress(java.lang.String r0) {
            java.net.InetAddress r0 = forUriStringNoThrow(r0)
            if (r0 == 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    private static short parseHextet(java.lang.String r3, int r4, int r5) {
            int r0 = r5 - r4
            if (r0 <= 0) goto L1c
            r1 = 4
            if (r0 > r1) goto L1c
            r0 = 0
        L8:
            if (r4 >= r5) goto L1a
            int r0 = r0 << 4
            char r1 = r3.charAt(r4)
            r2 = 16
            int r1 = java.lang.Character.digit(r1, r2)
            r0 = r0 | r1
            int r4 = r4 + 1
            goto L8
        L1a:
            short r3 = (short) r0
            return r3
        L1c:
            java.lang.NumberFormatException r3 = new java.lang.NumberFormatException
            r3.<init>()
            throw r3
    }

    private static byte parseOctet(java.lang.String r3, int r4, int r5) {
            int r0 = r5 - r4
            if (r0 <= 0) goto L40
            r1 = 3
            if (r0 > r1) goto L40
            r1 = 1
            if (r0 <= r1) goto L19
            char r0 = r3.charAt(r4)
            r1 = 48
            if (r0 == r1) goto L13
            goto L19
        L13:
            java.lang.NumberFormatException r3 = new java.lang.NumberFormatException
            r3.<init>()
            throw r3
        L19:
            r0 = 0
        L1a:
            if (r4 >= r5) goto L34
            int r0 = r0 * 10
            char r1 = r3.charAt(r4)
            r2 = 10
            int r1 = java.lang.Character.digit(r1, r2)
            if (r1 < 0) goto L2e
            int r0 = r0 + r1
            int r4 = r4 + 1
            goto L1a
        L2e:
            java.lang.NumberFormatException r3 = new java.lang.NumberFormatException
            r3.<init>()
            throw r3
        L34:
            r3 = 255(0xff, float:3.57E-43)
            if (r0 > r3) goto L3a
            byte r3 = (byte) r0
            return r3
        L3a:
            java.lang.NumberFormatException r3 = new java.lang.NumberFormatException
            r3.<init>()
            throw r3
        L40:
            java.lang.NumberFormatException r3 = new java.lang.NumberFormatException
            r3.<init>()
            throw r3
    }

    @javax.annotation.CheckForNull
    private static byte[] textToNumericFormatV4(java.lang.String r7) {
            com.google.common.base.CharMatcher r0 = com.google.common.net.InetAddresses.IPV4_DELIMITER_MATCHER
            int r0 = r0.countIn(r7)
            int r0 = r0 + 1
            r1 = 0
            r2 = 4
            if (r0 == r2) goto Ld
            return r1
        Ld:
            byte[] r0 = new byte[r2]
            r3 = 0
            r4 = 0
        L11:
            if (r3 >= r2) goto L2c
            r5 = 46
            int r5 = r7.indexOf(r5, r4)
            r6 = -1
            if (r5 != r6) goto L20
            int r5 = r7.length()
        L20:
            byte r4 = parseOctet(r7, r4, r5)     // Catch: java.lang.NumberFormatException -> L2b
            r0[r3] = r4     // Catch: java.lang.NumberFormatException -> L2b
            int r4 = r5 + 1
            int r3 = r3 + 1
            goto L11
        L2b:
            return r1
        L2c:
            return r0
    }

    @javax.annotation.CheckForNull
    private static byte[] textToNumericFormatV6(java.lang.String r11) {
            com.google.common.base.CharMatcher r0 = com.google.common.net.InetAddresses.IPV6_DELIMITER_MATCHER
            int r0 = r0.countIn(r11)
            r1 = 2
            r2 = 0
            if (r0 < r1) goto Laf
            r3 = 8
            if (r0 <= r3) goto L10
            goto Laf
        L10:
            r4 = 1
            int r0 = r0 + r4
            int r5 = 8 - r0
            r6 = 0
            r7 = 0
            r8 = 0
        L17:
            int r9 = r11.length()
            int r9 = r9 - r4
            r10 = 58
            if (r7 >= r9) goto L44
            char r9 = r11.charAt(r7)
            if (r9 != r10) goto L41
            int r9 = r7 + 1
            char r9 = r11.charAt(r9)
            if (r9 != r10) goto L41
            if (r8 == 0) goto L31
            return r2
        L31:
            int r5 = r5 + 1
            if (r7 != 0) goto L37
            int r5 = r5 + 1
        L37:
            int r8 = r11.length()
            int r8 = r8 - r1
            if (r7 != r8) goto L40
            int r5 = r5 + 1
        L40:
            r8 = 1
        L41:
            int r7 = r7 + 1
            goto L17
        L44:
            char r7 = r11.charAt(r6)
            if (r7 != r10) goto L51
            char r7 = r11.charAt(r4)
            if (r7 == r10) goto L51
            return r2
        L51:
            int r7 = r11.length()
            int r7 = r7 - r4
            char r7 = r11.charAt(r7)
            if (r7 != r10) goto L68
            int r7 = r11.length()
            int r7 = r7 - r1
            char r1 = r11.charAt(r7)
            if (r1 == r10) goto L68
            return r2
        L68:
            if (r8 == 0) goto L6d
            if (r5 > 0) goto L6d
            return r2
        L6d:
            if (r8 != 0) goto L72
            if (r0 == r3) goto L72
            return r2
        L72:
            r0 = 16
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r0)
            char r1 = r11.charAt(r6)     // Catch: java.lang.NumberFormatException -> Laf
            if (r1 != r10) goto L7f
            goto L80
        L7f:
            r4 = 0
        L80:
            int r1 = r11.length()     // Catch: java.lang.NumberFormatException -> Laf
            if (r4 >= r1) goto Laa
            int r1 = r11.indexOf(r10, r4)     // Catch: java.lang.NumberFormatException -> Laf
            r3 = -1
            if (r1 != r3) goto L91
            int r1 = r11.length()     // Catch: java.lang.NumberFormatException -> Laf
        L91:
            char r3 = r11.charAt(r4)     // Catch: java.lang.NumberFormatException -> Laf
            if (r3 != r10) goto La0
            r3 = 0
        L98:
            if (r3 >= r5) goto La7
            r0.putShort(r6)     // Catch: java.lang.NumberFormatException -> Laf
            int r3 = r3 + 1
            goto L98
        La0:
            short r3 = parseHextet(r11, r4, r1)     // Catch: java.lang.NumberFormatException -> Laf
            r0.putShort(r3)     // Catch: java.lang.NumberFormatException -> Laf
        La7:
            int r4 = r1 + 1
            goto L80
        Laa:
            byte[] r11 = r0.array()
            return r11
        Laf:
            return r2
    }

    public static java.lang.String toAddrString(java.net.InetAddress r6) {
            com.google.common.base.Preconditions.checkNotNull(r6)
            boolean r0 = r6 instanceof java.net.Inet4Address
            if (r0 == 0) goto Lc
            java.lang.String r6 = r6.getHostAddress()
            return r6
        Lc:
            boolean r0 = r6 instanceof java.net.Inet6Address
            com.google.common.base.Preconditions.checkArgument(r0)
            byte[] r6 = r6.getAddress()
            r0 = 8
            int[] r1 = new int[r0]
            r2 = 0
            r3 = 0
        L1b:
            if (r3 >= r0) goto L2e
            int r4 = r3 * 2
            r5 = r6[r4]
            int r4 = r4 + 1
            r4 = r6[r4]
            int r4 = com.google.common.primitives.Ints.fromBytes(r2, r2, r5, r4)
            r1[r3] = r4
            int r3 = r3 + 1
            goto L1b
        L2e:
            compressLongestRunOfZeroes(r1)
            java.lang.String r6 = hextetsToIPv6String(r1)
            return r6
    }

    public static java.math.BigInteger toBigInteger(java.net.InetAddress r2) {
            java.math.BigInteger r0 = new java.math.BigInteger
            byte[] r2 = r2.getAddress()
            r1 = 1
            r0.<init>(r1, r2)
            return r0
    }

    public static java.lang.String toUriString(java.net.InetAddress r3) {
            boolean r0 = r3 instanceof java.net.Inet6Address
            if (r0 == 0) goto L16
            java.lang.String r3 = toAddrString(r3)
            r0 = 2
            int r0 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r3, r0)
            java.lang.String r1 = "["
            java.lang.String r2 = "]"
            java.lang.String r3 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r0, r1, r3, r2)
            return r3
        L16:
            java.lang.String r3 = toAddrString(r3)
            return r3
    }
}
