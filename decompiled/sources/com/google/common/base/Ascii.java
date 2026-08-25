package com.google.common.base;

/* JADX INFO: loaded from: classes.dex */
@com.google.common.annotations.GwtCompatible
@com.google.common.base.ElementTypesAreNonnullByDefault
public final class Ascii {
    public static final byte ACK = 6;
    public static final byte BEL = 7;
    public static final byte BS = 8;
    public static final byte CAN = 24;
    private static final char CASE_MASK = ' ';
    public static final byte CR = 13;
    public static final byte DC1 = 17;
    public static final byte DC2 = 18;
    public static final byte DC3 = 19;
    public static final byte DC4 = 20;
    public static final byte DEL = 127;
    public static final byte DLE = 16;
    public static final byte EM = 25;
    public static final byte ENQ = 5;
    public static final byte EOT = 4;
    public static final byte ESC = 27;
    public static final byte ETB = 23;
    public static final byte ETX = 3;
    public static final byte FF = 12;
    public static final byte FS = 28;
    public static final byte GS = 29;
    public static final byte HT = 9;
    public static final byte LF = 10;
    public static final char MAX = 127;
    public static final char MIN = 0;
    public static final byte NAK = 21;
    public static final byte NL = 10;
    public static final byte NUL = 0;
    public static final byte RS = 30;
    public static final byte SI = 15;
    public static final byte SO = 14;
    public static final byte SOH = 1;
    public static final byte SP = 32;
    public static final byte SPACE = 32;
    public static final byte STX = 2;
    public static final byte SUB = 26;
    public static final byte SYN = 22;
    public static final byte US = 31;
    public static final byte VT = 11;
    public static final byte XOFF = 19;
    public static final byte XON = 17;

    private Ascii() {
            r0 = this;
            r0.<init>()
            return
    }

    public static boolean equalsIgnoreCase(java.lang.CharSequence r7, java.lang.CharSequence r8) {
            int r0 = r7.length()
            r1 = 1
            if (r7 != r8) goto L8
            return r1
        L8:
            int r2 = r8.length()
            r3 = 0
            if (r0 == r2) goto L10
            return r3
        L10:
            r2 = 0
        L11:
            if (r2 >= r0) goto L30
            char r4 = r7.charAt(r2)
            char r5 = r8.charAt(r2)
            if (r4 != r5) goto L1e
            goto L2c
        L1e:
            int r4 = getAlphaIndex(r4)
            r6 = 26
            if (r4 >= r6) goto L2f
            int r5 = getAlphaIndex(r5)
            if (r4 != r5) goto L2f
        L2c:
            int r2 = r2 + 1
            goto L11
        L2f:
            return r3
        L30:
            return r1
    }

    private static int getAlphaIndex(char r0) {
            r0 = r0 | 32
            int r0 = r0 + (-97)
            char r0 = (char) r0
            return r0
    }

    public static boolean isLowerCase(char r1) {
            r0 = 97
            if (r1 < r0) goto La
            r0 = 122(0x7a, float:1.71E-43)
            if (r1 > r0) goto La
            r1 = 1
            goto Lb
        La:
            r1 = 0
        Lb:
            return r1
    }

    public static boolean isUpperCase(char r1) {
            r0 = 65
            if (r1 < r0) goto La
            r0 = 90
            if (r1 > r0) goto La
            r1 = 1
            goto Lb
        La:
            r1 = 0
        Lb:
            return r1
    }

    public static char toLowerCase(char r1) {
            boolean r0 = isUpperCase(r1)
            if (r0 == 0) goto L9
            r1 = r1 ^ 32
            char r1 = (char) r1
        L9:
            return r1
    }

    public static java.lang.String toLowerCase(java.lang.CharSequence r4) {
            boolean r0 = r4 instanceof java.lang.String
            if (r0 == 0) goto Lb
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r4 = toLowerCase(r4)
            return r4
        Lb:
            int r0 = r4.length()
            char[] r1 = new char[r0]
            r2 = 0
        L12:
            if (r2 >= r0) goto L21
            char r3 = r4.charAt(r2)
            char r3 = toLowerCase(r3)
            r1[r2] = r3
            int r2 = r2 + 1
            goto L12
        L21:
            java.lang.String r4 = java.lang.String.valueOf(r1)
            return r4
    }

    public static java.lang.String toLowerCase(java.lang.String r4) {
            int r0 = r4.length()
            r1 = 0
        L5:
            if (r1 >= r0) goto L2f
            char r2 = r4.charAt(r1)
            boolean r2 = isUpperCase(r2)
            if (r2 == 0) goto L2c
            char[] r4 = r4.toCharArray()
        L15:
            if (r1 >= r0) goto L27
            char r2 = r4[r1]
            boolean r3 = isUpperCase(r2)
            if (r3 == 0) goto L24
            r2 = r2 ^ 32
            char r2 = (char) r2
            r4[r1] = r2
        L24:
            int r1 = r1 + 1
            goto L15
        L27:
            java.lang.String r4 = java.lang.String.valueOf(r4)
            return r4
        L2c:
            int r1 = r1 + 1
            goto L5
        L2f:
            return r4
    }

    public static char toUpperCase(char r1) {
            boolean r0 = isLowerCase(r1)
            if (r0 == 0) goto L9
            r1 = r1 ^ 32
            char r1 = (char) r1
        L9:
            return r1
    }

    public static java.lang.String toUpperCase(java.lang.CharSequence r4) {
            boolean r0 = r4 instanceof java.lang.String
            if (r0 == 0) goto Lb
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r4 = toUpperCase(r4)
            return r4
        Lb:
            int r0 = r4.length()
            char[] r1 = new char[r0]
            r2 = 0
        L12:
            if (r2 >= r0) goto L21
            char r3 = r4.charAt(r2)
            char r3 = toUpperCase(r3)
            r1[r2] = r3
            int r2 = r2 + 1
            goto L12
        L21:
            java.lang.String r4 = java.lang.String.valueOf(r1)
            return r4
    }

    public static java.lang.String toUpperCase(java.lang.String r4) {
            int r0 = r4.length()
            r1 = 0
        L5:
            if (r1 >= r0) goto L2f
            char r2 = r4.charAt(r1)
            boolean r2 = isLowerCase(r2)
            if (r2 == 0) goto L2c
            char[] r4 = r4.toCharArray()
        L15:
            if (r1 >= r0) goto L27
            char r2 = r4[r1]
            boolean r3 = isLowerCase(r2)
            if (r3 == 0) goto L24
            r2 = r2 ^ 32
            char r2 = (char) r2
            r4[r1] = r2
        L24:
            int r1 = r1 + 1
            goto L15
        L27:
            java.lang.String r4 = java.lang.String.valueOf(r4)
            return r4
        L2c:
            int r1 = r1 + 1
            goto L5
        L2f:
            return r4
    }

    public static java.lang.String truncate(java.lang.CharSequence r5, int r6, java.lang.String r7) {
            com.google.common.base.Preconditions.checkNotNull(r5)
            int r0 = r7.length()
            int r0 = r6 - r0
            r1 = 0
            if (r0 < 0) goto Le
            r2 = 1
            goto Lf
        Le:
            r2 = 0
        Lf:
            int r3 = r7.length()
            java.lang.String r4 = "maxLength (%s) must be >= length of the truncation indicator (%s)"
            com.google.common.base.Preconditions.checkArgument(r2, r4, r6, r3)
            int r2 = r5.length()
            if (r2 > r6) goto L29
            java.lang.String r5 = r5.toString()
            int r2 = r5.length()
            if (r2 > r6) goto L29
            return r5
        L29:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r6)
            r2.append(r5, r1, r0)
            r2.append(r7)
            java.lang.String r5 = r2.toString()
            return r5
    }
}
