package org.bson.internal;

/* JADX INFO: loaded from: classes2.dex */
public final class UnsignedLongs {
    private static final int[] MAX_SAFE_DIGITS = null;
    private static final long MAX_VALUE = -1;
    private static final long[] MAX_VALUE_DIVS = null;
    private static final int[] MAX_VALUE_MODS = null;

    static {
            r0 = 37
            long[] r1 = new long[r0]
            org.bson.internal.UnsignedLongs.MAX_VALUE_DIVS = r1
            int[] r1 = new int[r0]
            org.bson.internal.UnsignedLongs.MAX_VALUE_MODS = r1
            int[] r0 = new int[r0]
            org.bson.internal.UnsignedLongs.MAX_SAFE_DIGITS = r0
            java.math.BigInteger r0 = new java.math.BigInteger
            java.lang.String r1 = "10000000000000000"
            r2 = 16
            r0.<init>(r1, r2)
            r1 = 2
        L18:
            r2 = 36
            if (r1 > r2) goto L41
            long[] r2 = org.bson.internal.UnsignedLongs.MAX_VALUE_DIVS
            long r3 = (long) r1
            r5 = -1
            long r7 = divide(r5, r3)
            r2[r1] = r7
            int[] r2 = org.bson.internal.UnsignedLongs.MAX_VALUE_MODS
            long r3 = remainder(r5, r3)
            int r4 = (int) r3
            r2[r1] = r4
            int[] r2 = org.bson.internal.UnsignedLongs.MAX_SAFE_DIGITS
            java.lang.String r3 = r0.toString(r1)
            int r3 = r3.length()
            int r3 = r3 + (-1)
            r2[r1] = r3
            int r1 = r1 + 1
            goto L18
        L41:
            return
    }

    private UnsignedLongs() {
            r0 = this;
            r0.<init>()
            return
    }

    public static int compare(long r2, long r4) {
            r0 = -9223372036854775808
            long r2 = r2 + r0
            long r4 = r4 + r0
            int r2 = compareLongs(r2, r4)
            return r2
    }

    private static int compareLongs(long r1, long r3) {
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 >= 0) goto L6
            r1 = -1
            goto Lb
        L6:
            if (r0 != 0) goto La
            r1 = 0
            goto Lb
        La:
            r1 = 1
        Lb:
            return r1
    }

    private static long divide(long r5, long r7) {
            r0 = 0
            int r2 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r2 >= 0) goto L10
            int r5 = compare(r5, r7)
            if (r5 >= 0) goto Ld
            return r0
        Ld:
            r5 = 1
            return r5
        L10:
            int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r2 < 0) goto L16
            long r5 = r5 / r7
            return r5
        L16:
            r0 = 1
            long r1 = r5 >>> r0
            long r1 = r1 / r7
            long r1 = r1 << r0
            long r3 = r1 * r7
            long r5 = r5 - r3
            int r5 = compare(r5, r7)
            if (r5 < 0) goto L25
            goto L26
        L25:
            r0 = 0
        L26:
            long r5 = (long) r0
            long r1 = r1 + r5
            return r1
    }

    private static boolean overflowInParse(long r6, int r8, int r9) {
            r0 = 1
            r1 = 0
            int r3 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r3 < 0) goto L20
            long[] r1 = org.bson.internal.UnsignedLongs.MAX_VALUE_DIVS
            r2 = r1[r9]
            r4 = 0
            int r5 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r5 >= 0) goto L11
            return r4
        L11:
            r2 = r1[r9]
            int r1 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r1 <= 0) goto L18
            return r0
        L18:
            int[] r6 = org.bson.internal.UnsignedLongs.MAX_VALUE_MODS
            r6 = r6[r9]
            if (r8 <= r6) goto L1f
            goto L20
        L1f:
            r0 = 0
        L20:
            return r0
    }

    public static long parse(java.lang.String r8) {
            int r0 = r8.length()
            if (r0 == 0) goto L46
            r0 = 10
            int[] r1 = org.bson.internal.UnsignedLongs.MAX_SAFE_DIGITS
            r1 = r1[r0]
            int r1 = r1 + (-1)
            r2 = 0
            r4 = 0
        L11:
            int r5 = r8.length()
            if (r4 >= r5) goto L45
            char r5 = r8.charAt(r4)
            int r5 = java.lang.Character.digit(r5, r0)
            r6 = -1
            if (r5 == r6) goto L3f
            if (r4 <= r1) goto L37
            boolean r6 = overflowInParse(r2, r5, r0)
            if (r6 != 0) goto L2b
            goto L37
        L2b:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.String r1 = "Too large for unsigned long: "
            java.lang.String r8 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r8)
            r0.<init>(r8)
            throw r0
        L37:
            long r6 = (long) r0
            long r2 = r2 * r6
            long r5 = (long) r5
            long r2 = r2 + r5
            int r4 = r4 + 1
            goto L11
        L3f:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            r0.<init>(r8)
            throw r0
        L45:
            return r2
        L46:
            java.lang.NumberFormatException r8 = new java.lang.NumberFormatException
            java.lang.String r0 = "empty string"
            r8.<init>(r0)
            throw r8
    }

    private static long remainder(long r5, long r7) {
            r0 = 0
            int r2 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r2 >= 0) goto Lf
            int r0 = compare(r5, r7)
            if (r0 >= 0) goto Ld
            return r5
        Ld:
            long r5 = r5 - r7
            return r5
        Lf:
            int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r2 < 0) goto L15
            long r5 = r5 % r7
            return r5
        L15:
            r2 = 1
            long r3 = r5 >>> r2
            long r3 = r3 / r7
            long r2 = r3 << r2
            long r2 = r2 * r7
            long r5 = r5 - r2
            int r2 = compare(r5, r7)
            if (r2 < 0) goto L25
            goto L26
        L25:
            r7 = r0
        L26:
            long r5 = r5 - r7
            return r5
    }

    public static java.lang.String toString(long r4) {
            r0 = 0
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 < 0) goto Lb
            java.lang.String r4 = java.lang.Long.toString(r4)
            return r4
        Lb:
            r0 = 1
            long r0 = r4 >>> r0
            r2 = 5
            long r0 = r0 / r2
            r2 = 10
            long r2 = r2 * r0
            long r4 = r4 - r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = java.lang.Long.toString(r0)
            r2.append(r0)
            r2.append(r4)
            java.lang.String r4 = r2.toString()
            return r4
    }
}
