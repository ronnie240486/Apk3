package kotlin;

/* JADX INFO: compiled from: UnsignedUtils.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0001ø\u0001\u0000¢\u0006\u0002\u0010\u0004\u001a\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u0003H\u0001ø\u0001\u0000¢\u0006\u0002\u0010\u0007\u001a\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0001\u001a\"\u0010\f\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u0001H\u0001ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\"\u0010\u000f\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u0001H\u0001ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u000e\u001a\u0010\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\tH\u0001\u001a\u0018\u0010\u0012\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00132\u0006\u0010\u000b\u001a\u00020\u0013H\u0001\u001a\"\u0010\u0014\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006H\u0001ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a\"\u0010\u0017\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006H\u0001ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0016\u001a\u0010\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0013H\u0001\u001a\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0002\u001a\u00020\u0013H\u0000\u001a\u0018\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0002\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\tH\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001d"}, d2 = {"doubleToUInt", "Lkotlin/UInt;", "v", "", "(D)I", "doubleToULong", "Lkotlin/ULong;", "(D)J", "uintCompare", "", "v1", "v2", "uintDivide", "uintDivide-J1ME1BU", "(II)I", "uintRemainder", "uintRemainder-J1ME1BU", "uintToDouble", "ulongCompare", "", "ulongDivide", "ulongDivide-eb3DHEI", "(JJ)J", "ulongRemainder", "ulongRemainder-eb3DHEI", "ulongToDouble", "ulongToString", "", "base", "kotlin-stdlib"}, k = 2, mv = {1, 7, 1}, xi = 48)
@kotlin.jvm.JvmName(name = "UnsignedKt")
public final class UnsignedKt {
    @kotlin.PublishedApi
    public static final int doubleToUInt(double r5) {
            boolean r0 = java.lang.Double.isNaN(r5)
            r1 = -1
            r2 = 0
            if (r0 == 0) goto La
        L8:
            r1 = 0
            goto L3e
        La:
            double r3 = uintToDouble(r2)
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 > 0) goto L13
            goto L8
        L13:
            double r2 = uintToDouble(r1)
            int r0 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r0 < 0) goto L1c
            goto L3e
        L1c:
            r0 = 4746794007244308480(0x41dfffffffc00000, double:2.147483647E9)
            int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r2 > 0) goto L2b
            int r5 = (int) r5
            int r1 = kotlin.UInt.m427constructorimpl(r5)
            goto L3e
        L2b:
            r0 = 2147483647(0x7fffffff, float:NaN)
            double r1 = (double) r0
            double r5 = r5 - r1
            int r5 = (int) r5
            int r5 = kotlin.UInt.m427constructorimpl(r5)
            int r6 = kotlin.UInt.m427constructorimpl(r0)
            int r6 = r6 + r5
            int r1 = kotlin.UInt.m427constructorimpl(r6)
        L3e:
            return r1
    }

    @kotlin.PublishedApi
    public static final long doubleToULong(double r7) {
            boolean r0 = java.lang.Double.isNaN(r7)
            r1 = -1
            r3 = 0
            if (r0 == 0) goto Lc
        La:
            r1 = r3
            goto L37
        Lc:
            double r5 = ulongToDouble(r3)
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r0 > 0) goto L15
            goto La
        L15:
            double r3 = ulongToDouble(r1)
            int r0 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r0 < 0) goto L1e
            goto L37
        L1e:
            r0 = 4890909195324358656(0x43e0000000000000, double:9.223372036854776E18)
            int r2 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r2 >= 0) goto L2a
            long r7 = (long) r7
            long r1 = kotlin.ULong.m505constructorimpl(r7)
            goto L37
        L2a:
            double r7 = r7 - r0
            long r7 = (long) r7
            long r7 = kotlin.ULong.m505constructorimpl(r7)
            r0 = -9223372036854775808
            long r7 = r7 + r0
            long r1 = kotlin.ULong.m505constructorimpl(r7)
        L37:
            return r1
    }

    @kotlin.PublishedApi
    public static final int uintCompare(int r1, int r2) {
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 ^ r0
            r2 = r2 ^ r0
            int r1 = kotlin.jvm.internal.Intrinsics.compare(r1, r2)
            return r1
    }

    @kotlin.PublishedApi
    /* JADX INFO: renamed from: uintDivide-J1ME1BU, reason: not valid java name */
    public static final int m680uintDivideJ1ME1BU(int r4, int r5) {
            long r0 = (long) r4
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r2
            long r4 = (long) r5
            long r4 = r4 & r2
            long r0 = r0 / r4
            int r4 = (int) r0
            int r4 = kotlin.UInt.m427constructorimpl(r4)
            return r4
    }

    @kotlin.PublishedApi
    /* JADX INFO: renamed from: uintRemainder-J1ME1BU, reason: not valid java name */
    public static final int m681uintRemainderJ1ME1BU(int r4, int r5) {
            long r0 = (long) r4
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r2
            long r4 = (long) r5
            long r4 = r4 & r2
            long r0 = r0 % r4
            int r4 = (int) r0
            int r4 = kotlin.UInt.m427constructorimpl(r4)
            return r4
    }

    @kotlin.PublishedApi
    public static final double uintToDouble(int r6) {
            r0 = 2147483647(0x7fffffff, float:NaN)
            r0 = r0 & r6
            double r0 = (double) r0
            int r6 = r6 >>> 31
            int r6 = r6 << 30
            double r2 = (double) r6
            r6 = 2
            double r4 = (double) r6
            double r2 = r2 * r4
            double r2 = r2 + r0
            return r2
    }

    @kotlin.PublishedApi
    public static final int ulongCompare(long r2, long r4) {
            r0 = -9223372036854775808
            long r2 = r2 ^ r0
            long r4 = r4 ^ r0
            int r2 = kotlin.jvm.internal.Intrinsics.compare(r2, r4)
            return r2
    }

    @kotlin.PublishedApi
    /* JADX INFO: renamed from: ulongDivide-eb3DHEI, reason: not valid java name */
    public static final long m682ulongDivideeb3DHEI(long r5, long r7) {
            r0 = 0
            int r2 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r2 >= 0) goto L18
            int r5 = ulongCompare(r5, r7)
            if (r5 >= 0) goto L11
            long r5 = kotlin.ULong.m505constructorimpl(r0)
            goto L17
        L11:
            r5 = 1
            long r5 = kotlin.ULong.m505constructorimpl(r5)
        L17:
            return r5
        L18:
            int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r2 < 0) goto L22
            long r5 = r5 / r7
            long r5 = kotlin.ULong.m505constructorimpl(r5)
            return r5
        L22:
            r0 = 1
            long r1 = r5 >>> r0
            long r1 = r1 / r7
            long r1 = r1 << r0
            long r3 = r1 * r7
            long r5 = r5 - r3
            long r5 = kotlin.ULong.m505constructorimpl(r5)
            long r7 = kotlin.ULong.m505constructorimpl(r7)
            int r5 = ulongCompare(r5, r7)
            if (r5 < 0) goto L39
            goto L3a
        L39:
            r0 = 0
        L3a:
            long r5 = (long) r0
            long r1 = r1 + r5
            long r5 = kotlin.ULong.m505constructorimpl(r1)
            return r5
    }

    @kotlin.PublishedApi
    /* JADX INFO: renamed from: ulongRemainder-eb3DHEI, reason: not valid java name */
    public static final long m683ulongRemaindereb3DHEI(long r6, long r8) {
            r0 = 0
            int r2 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r2 >= 0) goto L13
            int r0 = ulongCompare(r6, r8)
            if (r0 >= 0) goto Ld
            goto L12
        Ld:
            long r6 = r6 - r8
            long r6 = kotlin.ULong.m505constructorimpl(r6)
        L12:
            return r6
        L13:
            int r2 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r2 < 0) goto L1d
            long r6 = r6 % r8
            long r6 = kotlin.ULong.m505constructorimpl(r6)
            return r6
        L1d:
            r2 = 1
            long r3 = r6 >>> r2
            long r3 = r3 / r8
            long r2 = r3 << r2
            long r2 = r2 * r8
            long r6 = r6 - r2
            long r2 = kotlin.ULong.m505constructorimpl(r6)
            long r4 = kotlin.ULong.m505constructorimpl(r8)
            int r2 = ulongCompare(r2, r4)
            if (r2 < 0) goto L35
            goto L36
        L35:
            r8 = r0
        L36:
            long r6 = r6 - r8
            long r6 = kotlin.ULong.m505constructorimpl(r6)
            return r6
    }

    @kotlin.PublishedApi
    public static final double ulongToDouble(long r4) {
            r0 = 11
            long r0 = r4 >>> r0
            double r0 = (double) r0
            r2 = 2048(0x800, float:2.87E-42)
            double r2 = (double) r2
            double r0 = r0 * r2
            r2 = 2047(0x7ff, double:1.0114E-320)
            long r4 = r4 & r2
            double r4 = (double) r4
            double r0 = r0 + r4
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String ulongToString(long r1) {
            r0 = 10
            java.lang.String r1 = ulongToString(r1, r0)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String ulongToString(long r8, int r10) {
            java.lang.String r0 = "toString(this, checkRadix(radix))"
            r1 = 0
            int r3 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r3 < 0) goto L15
            int r10 = kotlin.text.CharsKt.checkRadix(r10)
            java.lang.String r8 = java.lang.Long.toString(r8, r10)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r0)
            return r8
        L15:
            r1 = 1
            long r2 = r8 >>> r1
            long r4 = (long) r10
            long r2 = r2 / r4
            long r1 = r2 << r1
            long r6 = r1 * r4
            long r8 = r8 - r6
            int r3 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r3 < 0) goto L27
            long r8 = r8 - r4
            r3 = 1
            long r1 = r1 + r3
        L27:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            int r4 = kotlin.text.CharsKt.checkRadix(r10)
            java.lang.String r1 = java.lang.Long.toString(r1, r4)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r0)
            r3.append(r1)
            int r10 = kotlin.text.CharsKt.checkRadix(r10)
            java.lang.String r8 = java.lang.Long.toString(r8, r10)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r0)
            r3.append(r8)
            java.lang.String r8 = r3.toString()
            return r8
    }
}
