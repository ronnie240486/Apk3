package com.google.common.net;

/* JADX INFO: loaded from: classes2.dex */
@com.google.common.annotations.Beta
@com.google.common.annotations.GwtCompatible
@com.google.common.net.ElementTypesAreNonnullByDefault
public final class PercentEscaper extends com.google.common.escape.UnicodeEscaper {
    private static final char[] PLUS_SIGN = null;
    private static final char[] UPPER_HEX_DIGITS = null;
    private final boolean plusForSpace;
    private final boolean[] safeOctets;

    static {
            r0 = 1
            char[] r0 = new char[r0]
            r1 = 0
            r2 = 43
            r0[r1] = r2
            com.google.common.net.PercentEscaper.PLUS_SIGN = r0
            java.lang.String r0 = "0123456789ABCDEF"
            char[] r0 = r0.toCharArray()
            com.google.common.net.PercentEscaper.UPPER_HEX_DIGITS = r0
            return
    }

    public PercentEscaper(java.lang.String r2, boolean r3) {
            r1 = this;
            r1.<init>()
            com.google.common.base.Preconditions.checkNotNull(r2)
            java.lang.String r0 = ".*[0-9A-Za-z].*"
            boolean r0 = r2.matches(r0)
            if (r0 != 0) goto L30
            java.lang.String r0 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789"
            java.lang.String r2 = r2.concat(r0)
            if (r3 == 0) goto L27
            java.lang.String r0 = " "
            boolean r0 = r2.contains(r0)
            if (r0 != 0) goto L1f
            goto L27
        L1f:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "plusForSpace cannot be specified when space is a 'safe' character"
            r2.<init>(r3)
            throw r2
        L27:
            r1.plusForSpace = r3
            boolean[] r2 = createSafeOctets(r2)
            r1.safeOctets = r2
            return
        L30:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Alphanumeric characters are always 'safe' and should not be explicitly specified"
            r2.<init>(r3)
            throw r2
    }

    private static boolean[] createSafeOctets(java.lang.String r5) {
            char[] r5 = r5.toCharArray()
            int r0 = r5.length
            r1 = 0
            r2 = -1
            r3 = 0
        L8:
            if (r3 >= r0) goto L13
            char r4 = r5[r3]
            int r2 = java.lang.Math.max(r4, r2)
            int r3 = r3 + 1
            goto L8
        L13:
            r0 = 1
            int r2 = r2 + r0
            boolean[] r2 = new boolean[r2]
            int r3 = r5.length
        L18:
            if (r1 >= r3) goto L21
            char r4 = r5[r1]
            r2[r4] = r0
            int r1 = r1 + 1
            goto L18
        L21:
            return r2
    }

    @Override // com.google.common.escape.UnicodeEscaper, com.google.common.escape.Escaper
    public java.lang.String escape(java.lang.String r6) {
            r5 = this;
            com.google.common.base.Preconditions.checkNotNull(r6)
            int r0 = r6.length()
            r1 = 0
        L8:
            if (r1 >= r0) goto L1f
            char r2 = r6.charAt(r1)
            boolean[] r3 = r5.safeOctets
            int r4 = r3.length
            if (r2 >= r4) goto L1b
            boolean r2 = r3[r2]
            if (r2 != 0) goto L18
            goto L1b
        L18:
            int r1 = r1 + 1
            goto L8
        L1b:
            java.lang.String r6 = r5.escapeSlow(r6, r1)
        L1f:
            return r6
    }

    @Override // com.google.common.escape.UnicodeEscaper
    @javax.annotation.CheckForNull
    public final char[] escape(int r14) {
            r13 = this;
            boolean[] r0 = r13.safeOctets
            int r1 = r0.length
            if (r14 >= r1) goto Lb
            boolean r0 = r0[r14]
            if (r0 == 0) goto Lb
            r14 = 0
            return r14
        Lb:
            r0 = 32
            if (r14 != r0) goto L16
            boolean r0 = r13.plusForSpace
            if (r0 == 0) goto L16
            char[] r14 = com.google.common.net.PercentEscaper.PLUS_SIGN
            return r14
        L16:
            r0 = 127(0x7f, float:1.78E-43)
            r1 = 1
            r2 = 0
            r3 = 2
            r4 = 37
            r5 = 3
            r6 = 4
            if (r14 > r0) goto L33
            char[] r0 = new char[r5]
            r0[r2] = r4
            char[] r2 = com.google.common.net.PercentEscaper.UPPER_HEX_DIGITS
            r4 = r14 & 15
            char r4 = r2[r4]
            r0[r3] = r4
            int r14 = r14 >>> r6
            char r14 = r2[r14]
            r0[r1] = r14
            return r0
        L33:
            r0 = 2047(0x7ff, float:2.868E-42)
            r7 = 12
            r8 = 5
            r9 = 6
            r10 = 8
            if (r14 > r0) goto L61
            char[] r0 = new char[r9]
            r0[r2] = r4
            r0[r5] = r4
            char[] r2 = com.google.common.net.PercentEscaper.UPPER_HEX_DIGITS
            r4 = r14 & 15
            char r4 = r2[r4]
            r0[r8] = r4
            int r14 = r14 >>> r6
            r4 = r14 & 3
            r4 = r4 | r10
            char r4 = r2[r4]
            r0[r6] = r4
            int r14 = r14 >>> r3
            r4 = r14 & 15
            char r4 = r2[r4]
            r0[r3] = r4
            int r14 = r14 >>> r6
            r14 = r14 | r7
            char r14 = r2[r14]
            r0[r1] = r14
            return r0
        L61:
            r0 = 65535(0xffff, float:9.1834E-41)
            r11 = 9
            r12 = 7
            if (r14 > r0) goto L9a
            char[] r0 = new char[r11]
            r0[r2] = r4
            r2 = 69
            r0[r1] = r2
            r0[r5] = r4
            r0[r9] = r4
            char[] r1 = com.google.common.net.PercentEscaper.UPPER_HEX_DIGITS
            r2 = r14 & 15
            char r2 = r1[r2]
            r0[r10] = r2
            int r14 = r14 >>> r6
            r2 = r14 & 3
            r2 = r2 | r10
            char r2 = r1[r2]
            r0[r12] = r2
            int r14 = r14 >>> r3
            r2 = r14 & 15
            char r2 = r1[r2]
            r0[r8] = r2
            int r14 = r14 >>> r6
            r2 = r14 & 3
            r2 = r2 | r10
            char r2 = r1[r2]
            r0[r6] = r2
            int r14 = r14 >>> r3
            char r14 = r1[r14]
            r0[r3] = r14
            return r0
        L9a:
            r0 = 1114111(0x10ffff, float:1.561202E-39)
            if (r14 > r0) goto Le6
            char[] r0 = new char[r7]
            r0[r2] = r4
            r2 = 70
            r0[r1] = r2
            r0[r5] = r4
            r0[r9] = r4
            r0[r11] = r4
            r1 = 11
            char[] r2 = com.google.common.net.PercentEscaper.UPPER_HEX_DIGITS
            r4 = r14 & 15
            char r4 = r2[r4]
            r0[r1] = r4
            int r14 = r14 >>> r6
            r1 = 10
            r4 = r14 & 3
            r4 = r4 | r10
            char r4 = r2[r4]
            r0[r1] = r4
            int r14 = r14 >>> r3
            r1 = r14 & 15
            char r1 = r2[r1]
            r0[r10] = r1
            int r14 = r14 >>> r6
            r1 = r14 & 3
            r1 = r1 | r10
            char r1 = r2[r1]
            r0[r12] = r1
            int r14 = r14 >>> r3
            r1 = r14 & 15
            char r1 = r2[r1]
            r0[r8] = r1
            int r14 = r14 >>> r6
            r1 = r14 & 3
            r1 = r1 | r10
            char r1 = r2[r1]
            r0[r6] = r1
            int r14 = r14 >>> r3
            r14 = r14 & r12
            char r14 = r2[r14]
            r0[r3] = r14
            return r0
        Le6:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = 43
            java.lang.String r2 = "Invalid unicode character value "
            java.lang.String r14 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r1, r2, r14)
            r0.<init>(r14)
            throw r0
    }

    @Override // com.google.common.escape.UnicodeEscaper
    public final int nextEscapeIndex(java.lang.CharSequence r4, int r5, int r6) {
            r3 = this;
            com.google.common.base.Preconditions.checkNotNull(r4)
        L3:
            if (r5 >= r6) goto L16
            char r0 = r4.charAt(r5)
            boolean[] r1 = r3.safeOctets
            int r2 = r1.length
            if (r0 >= r2) goto L16
            boolean r0 = r1[r0]
            if (r0 != 0) goto L13
            goto L16
        L13:
            int r5 = r5 + 1
            goto L3
        L16:
            return r5
    }
}
