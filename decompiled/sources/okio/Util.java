package okio;

/* JADX INFO: renamed from: okio.-Util, reason: invalid class name */
/* JADX INFO: compiled from: -Util.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0002\b\u0004\n\u0002\u0010\n\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a0\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0005H\u0000\u001a \u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\fH\u0000\u001a\u0019\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0002\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\fH\u0080\b\u001a\u0019\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0002\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u0005H\u0080\b\u001a\u0015\u0010\u000f\u001a\u00020\u0005*\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005H\u0080\f\u001a\u0015\u0010\u000f\u001a\u00020\f*\u00020\u00102\u0006\u0010\u0011\u001a\u00020\fH\u0080\f\u001a\u0015\u0010\u000f\u001a\u00020\f*\u00020\u00052\u0006\u0010\u0011\u001a\u00020\fH\u0080\f\u001a\u0015\u0010\u0012\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0005H\u0080\f\u001a\f\u0010\u0014\u001a\u00020\u0005*\u00020\u0005H\u0000\u001a\f\u0010\u0014\u001a\u00020\f*\u00020\fH\u0000\u001a\f\u0010\u0014\u001a\u00020\u0015*\u00020\u0015H\u0000\u001a\u0015\u0010\u0016\u001a\u00020\f*\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0005H\u0080\f\u001a\u0015\u0010\u0017\u001a\u00020\u0005*\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005H\u0080\f\u001a\u0015\u0010\u0018\u001a\u00020\u0005*\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005H\u0080\f\u001a\f\u0010\u0019\u001a\u00020\u001a*\u00020\u0010H\u0000\u001a\f\u0010\u0019\u001a\u00020\u001a*\u00020\u0005H\u0000\u001a\f\u0010\u0019\u001a\u00020\u001a*\u00020\fH\u0000\u001a\u0015\u0010\u001b\u001a\u00020\u0010*\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0080\f¨\u0006\u001c"}, d2 = {"arrayRangeEquals", "", "a", "", "aOffset", "", "b", "bOffset", "byteCount", "checkOffsetAndCount", "", "size", "", "offset", "minOf", "and", "", "other", "leftRotate", "bitCount", "reverseBytes", "", "rightRotate", "shl", "shr", "toHexString", "", "xor", "okio"}, k = 2, mv = {1, 4, 1})
@kotlin.jvm.JvmName(name = "-Util")
public final class Util {
    public static final int and(byte r0, int r1) {
            r0 = r0 & r1
            return r0
    }

    public static final long and(byte r2, long r3) {
            long r0 = (long) r2
            long r2 = r0 & r3
            return r2
    }

    public static final long and(int r2, long r3) {
            long r0 = (long) r2
            long r2 = r0 & r3
            return r2
    }

    public static final boolean arrayRangeEquals(@org.jetbrains.annotations.NotNull byte[] r4, int r5, @org.jetbrains.annotations.NotNull byte[] r6, int r7, int r8) {
            java.lang.String r0 = "a"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "b"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            r0 = 0
            r1 = 0
        Lc:
            if (r1 >= r8) goto L1c
            int r2 = r1 + r5
            r2 = r4[r2]
            int r3 = r1 + r7
            r3 = r6[r3]
            if (r2 == r3) goto L19
            return r0
        L19:
            int r1 = r1 + 1
            goto Lc
        L1c:
            r4 = 1
            return r4
    }

    public static final void checkOffsetAndCount(long r5, long r7, long r9) {
            long r0 = r7 | r9
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 < 0) goto L13
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r0 > 0) goto L13
            long r0 = r5 - r7
            int r2 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r2 < 0) goto L13
            return
        L13:
            java.lang.ArrayIndexOutOfBoundsException r0 = new java.lang.ArrayIndexOutOfBoundsException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "size="
            r1.append(r2)
            r1.append(r5)
            java.lang.String r5 = " offset="
            r1.append(r5)
            r1.append(r7)
            java.lang.String r5 = " byteCount="
            r1.append(r5)
            r1.append(r9)
            java.lang.String r5 = r1.toString()
            r0.<init>(r5)
            throw r0
    }

    public static final int leftRotate(int r1, int r2) {
            int r0 = r1 << r2
            int r2 = 32 - r2
            int r1 = r1 >>> r2
            r1 = r1 | r0
            return r1
    }

    public static final long minOf(int r2, long r3) {
            long r0 = (long) r2
            long r2 = java.lang.Math.min(r0, r3)
            return r2
    }

    public static final long minOf(long r2, int r4) {
            long r0 = (long) r4
            long r2 = java.lang.Math.min(r2, r0)
            return r2
    }

    public static final int reverseBytes(int r2) {
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r0 = r0 & r2
            int r0 = r0 >>> 24
            r1 = 16711680(0xff0000, float:2.3418052E-38)
            r1 = r1 & r2
            int r1 = r1 >>> 8
            r0 = r0 | r1
            r1 = 65280(0xff00, float:9.1477E-41)
            r1 = r1 & r2
            int r1 = r1 << 8
            r0 = r0 | r1
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << 24
            r2 = r2 | r0
            return r2
    }

    public static final long reverseBytes(long r8) {
            r0 = -72057594037927936(0xff00000000000000, double:-5.486124068793689E303)
            long r0 = r0 & r8
            r2 = 56
            long r0 = r0 >>> r2
            r3 = 71776119061217280(0xff000000000000, double:7.06327445644526E-304)
            long r3 = r3 & r8
            r5 = 40
            long r3 = r3 >>> r5
            long r0 = r0 | r3
            r3 = 280375465082880(0xff0000000000, double:1.38523885234213E-309)
            long r3 = r3 & r8
            r6 = 24
            long r3 = r3 >>> r6
            long r0 = r0 | r3
            r3 = 1095216660480(0xff00000000, double:5.41108926696E-312)
            long r3 = r3 & r8
            r7 = 8
            long r3 = r3 >>> r7
            long r0 = r0 | r3
            r3 = 4278190080(0xff000000, double:2.113706745E-314)
            long r3 = r3 & r8
            long r3 = r3 << r7
            long r0 = r0 | r3
            r3 = 16711680(0xff0000, double:8.256667E-317)
            long r3 = r3 & r8
            long r3 = r3 << r6
            long r0 = r0 | r3
            r3 = 65280(0xff00, double:3.22526E-319)
            long r3 = r3 & r8
            long r3 = r3 << r5
            long r0 = r0 | r3
            r3 = 255(0xff, double:1.26E-321)
            long r8 = r8 & r3
            long r8 = r8 << r2
            long r8 = r8 | r0
            return r8
    }

    public static final short reverseBytes(short r1) {
            r0 = 65535(0xffff, float:9.1834E-41)
            r1 = r1 & r0
            r0 = 65280(0xff00, float:9.1477E-41)
            r0 = r0 & r1
            int r0 = r0 >>> 8
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 8
            r1 = r1 | r0
            short r1 = (short) r1
            return r1
    }

    public static final long rightRotate(long r2, int r4) {
            long r0 = r2 >>> r4
            int r4 = 64 - r4
            long r2 = r2 << r4
            long r2 = r2 | r0
            return r2
    }

    public static final int shl(byte r0, int r1) {
            int r0 = r0 << r1
            return r0
    }

    public static final int shr(byte r0, int r1) {
            int r0 = r0 >> r1
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String toHexString(byte r3) {
            r0 = 2
            char[] r0 = new char[r0]
            char[] r1 = okio.internal.ByteStringKt.getHEX_DIGIT_CHARS()
            int r2 = r3 >> 4
            r2 = r2 & 15
            char r1 = r1[r2]
            r2 = 0
            r0[r2] = r1
            char[] r1 = okio.internal.ByteStringKt.getHEX_DIGIT_CHARS()
            r3 = r3 & 15
            char r3 = r1[r3]
            r1 = 1
            r0[r1] = r3
            java.lang.String r3 = new java.lang.String
            r3.<init>(r0)
            return r3
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String toHexString(int r6) {
            if (r6 != 0) goto L5
            java.lang.String r6 = "0"
            return r6
        L5:
            r0 = 8
            char[] r1 = new char[r0]
            char[] r2 = okio.internal.ByteStringKt.getHEX_DIGIT_CHARS()
            int r3 = r6 >> 28
            r3 = r3 & 15
            char r2 = r2[r3]
            r3 = 0
            r1[r3] = r2
            char[] r2 = okio.internal.ByteStringKt.getHEX_DIGIT_CHARS()
            int r4 = r6 >> 24
            r4 = r4 & 15
            char r2 = r2[r4]
            r4 = 1
            r1[r4] = r2
            r2 = 2
            char[] r4 = okio.internal.ByteStringKt.getHEX_DIGIT_CHARS()
            int r5 = r6 >> 20
            r5 = r5 & 15
            char r4 = r4[r5]
            r1[r2] = r4
            r2 = 3
            char[] r4 = okio.internal.ByteStringKt.getHEX_DIGIT_CHARS()
            int r5 = r6 >> 16
            r5 = r5 & 15
            char r4 = r4[r5]
            r1[r2] = r4
            char[] r2 = okio.internal.ByteStringKt.getHEX_DIGIT_CHARS()
            int r4 = r6 >> 12
            r4 = r4 & 15
            char r2 = r2[r4]
            r4 = 4
            r1[r4] = r2
            r2 = 5
            char[] r4 = okio.internal.ByteStringKt.getHEX_DIGIT_CHARS()
            int r5 = r6 >> 8
            r5 = r5 & 15
            char r4 = r4[r5]
            r1[r2] = r4
            r2 = 6
            char[] r4 = okio.internal.ByteStringKt.getHEX_DIGIT_CHARS()
            int r5 = r6 >> 4
            r5 = r5 & 15
            char r4 = r4[r5]
            r1[r2] = r4
            r2 = 7
            char[] r4 = okio.internal.ByteStringKt.getHEX_DIGIT_CHARS()
            r6 = r6 & 15
            char r6 = r4[r6]
            r1[r2] = r6
        L6f:
            if (r3 >= r0) goto L7b
            char r6 = r1[r3]
            r2 = 48
            if (r6 == r2) goto L78
            goto L7b
        L78:
            int r3 = r3 + 1
            goto L6f
        L7b:
            int r6 = 8 - r3
            java.lang.String r0 = new java.lang.String
            r0.<init>(r1, r3, r6)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String toHexString(long r12) {
            r0 = 0
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r2 != 0) goto L9
            java.lang.String r12 = "0"
            return r12
        L9:
            r0 = 16
            char[] r1 = new char[r0]
            char[] r2 = okio.internal.ByteStringKt.getHEX_DIGIT_CHARS()
            r3 = 60
            long r3 = r12 >> r3
            r5 = 15
            long r3 = r3 & r5
            int r4 = (int) r3
            char r2 = r2[r4]
            r3 = 0
            r1[r3] = r2
            char[] r2 = okio.internal.ByteStringKt.getHEX_DIGIT_CHARS()
            r4 = 56
            long r7 = r12 >> r4
            long r7 = r7 & r5
            int r4 = (int) r7
            char r2 = r2[r4]
            r4 = 1
            r1[r4] = r2
            r2 = 2
            char[] r4 = okio.internal.ByteStringKt.getHEX_DIGIT_CHARS()
            r7 = 52
            long r7 = r12 >> r7
            long r7 = r7 & r5
            int r8 = (int) r7
            char r4 = r4[r8]
            r1[r2] = r4
            r2 = 3
            char[] r4 = okio.internal.ByteStringKt.getHEX_DIGIT_CHARS()
            r7 = 48
            long r8 = r12 >> r7
            long r8 = r8 & r5
            int r9 = (int) r8
            char r4 = r4[r9]
            r1[r2] = r4
            char[] r2 = okio.internal.ByteStringKt.getHEX_DIGIT_CHARS()
            r4 = 44
            long r8 = r12 >> r4
            long r8 = r8 & r5
            int r4 = (int) r8
            char r2 = r2[r4]
            r4 = 4
            r1[r4] = r2
            r2 = 5
            char[] r8 = okio.internal.ByteStringKt.getHEX_DIGIT_CHARS()
            r9 = 40
            long r9 = r12 >> r9
            long r9 = r9 & r5
            int r10 = (int) r9
            char r8 = r8[r10]
            r1[r2] = r8
            r2 = 6
            char[] r8 = okio.internal.ByteStringKt.getHEX_DIGIT_CHARS()
            r9 = 36
            long r9 = r12 >> r9
            long r9 = r9 & r5
            int r10 = (int) r9
            char r8 = r8[r10]
            r1[r2] = r8
            r2 = 7
            char[] r8 = okio.internal.ByteStringKt.getHEX_DIGIT_CHARS()
            r9 = 32
            long r9 = r12 >> r9
            long r9 = r9 & r5
            int r10 = (int) r9
            char r8 = r8[r10]
            r1[r2] = r8
            char[] r2 = okio.internal.ByteStringKt.getHEX_DIGIT_CHARS()
            r8 = 28
            long r8 = r12 >> r8
            long r8 = r8 & r5
            int r9 = (int) r8
            char r2 = r2[r9]
            r8 = 8
            r1[r8] = r2
            r2 = 9
            char[] r9 = okio.internal.ByteStringKt.getHEX_DIGIT_CHARS()
            r10 = 24
            long r10 = r12 >> r10
            long r10 = r10 & r5
            int r11 = (int) r10
            char r9 = r9[r11]
            r1[r2] = r9
            r2 = 10
            char[] r9 = okio.internal.ByteStringKt.getHEX_DIGIT_CHARS()
            r10 = 20
            long r10 = r12 >> r10
            long r10 = r10 & r5
            int r11 = (int) r10
            char r9 = r9[r11]
            r1[r2] = r9
            r2 = 11
            char[] r9 = okio.internal.ByteStringKt.getHEX_DIGIT_CHARS()
            long r10 = r12 >> r0
            long r10 = r10 & r5
            int r11 = (int) r10
            char r9 = r9[r11]
            r1[r2] = r9
            char[] r2 = okio.internal.ByteStringKt.getHEX_DIGIT_CHARS()
            r9 = 12
            long r10 = r12 >> r9
            long r10 = r10 & r5
            int r11 = (int) r10
            char r2 = r2[r11]
            r1[r9] = r2
            r2 = 13
            char[] r9 = okio.internal.ByteStringKt.getHEX_DIGIT_CHARS()
            long r10 = r12 >> r8
            long r10 = r10 & r5
            int r8 = (int) r10
            char r8 = r9[r8]
            r1[r2] = r8
            r2 = 14
            char[] r8 = okio.internal.ByteStringKt.getHEX_DIGIT_CHARS()
            long r9 = r12 >> r4
            long r9 = r9 & r5
            int r4 = (int) r9
            char r4 = r8[r4]
            r1[r2] = r4
            r2 = 15
            char[] r4 = okio.internal.ByteStringKt.getHEX_DIGIT_CHARS()
            long r12 = r12 & r5
            int r13 = (int) r12
            char r12 = r4[r13]
            r1[r2] = r12
        Lfb:
            if (r3 >= r0) goto L105
            char r12 = r1[r3]
            if (r12 == r7) goto L102
            goto L105
        L102:
            int r3 = r3 + 1
            goto Lfb
        L105:
            int r12 = 16 - r3
            java.lang.String r13 = new java.lang.String
            r13.<init>(r1, r3, r12)
            return r13
    }

    public static final byte xor(byte r0, byte r1) {
            r0 = r0 ^ r1
            byte r0 = (byte) r0
            return r0
    }
}
