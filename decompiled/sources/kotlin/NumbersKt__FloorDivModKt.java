package kotlin;

/* JADX INFO: compiled from: FloorDivMod.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\b\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\t\n\u0002\u0010\n\n\u0000\n\u0002\u0010\u0006\n\u0002\u0010\u0007\n\u0000\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0087\b\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0001H\u0087\b\u001a\u0015\u0010\u0000\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0087\b\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0005H\u0087\b\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0087\b\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0087\b\u001a\u0015\u0010\u0000\u001a\u00020\u0004*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0087\b\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0005H\u0087\b\u001a\u0015\u0010\u0000\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0087\b\u001a\u0015\u0010\u0000\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0001H\u0087\b\u001a\u0015\u0010\u0000\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004H\u0087\b\u001a\u0015\u0010\u0000\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0005H\u0087\b\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0002H\u0087\b\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0001H\u0087\b\u001a\u0015\u0010\u0000\u001a\u00020\u0004*\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0004H\u0087\b\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0005H\u0087\b\u001a\u0015\u0010\u0006\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0087\b\u001a\u0015\u0010\u0006\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0001H\u0087\b\u001a\u0015\u0010\u0006\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0087\b\u001a\u0015\u0010\u0006\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0005H\u0087\b\u001a\u0015\u0010\u0006\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0007H\u0087\b\u001a\u0015\u0010\u0006\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\u0003\u001a\u00020\bH\u0087\b\u001a\u0015\u0010\u0006\u001a\u00020\u0007*\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0007H\u0087\b\u001a\u0015\u0010\u0006\u001a\u00020\b*\u00020\b2\u0006\u0010\u0003\u001a\u00020\bH\u0087\b\u001a\u0015\u0010\u0006\u001a\u00020\u0002*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0087\b\u001a\u0015\u0010\u0006\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0087\b\u001a\u0015\u0010\u0006\u001a\u00020\u0004*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0087\b\u001a\u0015\u0010\u0006\u001a\u00020\u0005*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0005H\u0087\b\u001a\u0015\u0010\u0006\u001a\u00020\u0002*\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0087\b\u001a\u0015\u0010\u0006\u001a\u00020\u0001*\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0001H\u0087\b\u001a\u0015\u0010\u0006\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004H\u0087\b\u001a\u0015\u0010\u0006\u001a\u00020\u0005*\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0005H\u0087\b\u001a\u0015\u0010\u0006\u001a\u00020\u0002*\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0002H\u0087\b\u001a\u0015\u0010\u0006\u001a\u00020\u0001*\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0001H\u0087\b\u001a\u0015\u0010\u0006\u001a\u00020\u0004*\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0004H\u0087\b\u001a\u0015\u0010\u0006\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0005H\u0087\b¨\u0006\t"}, d2 = {"floorDiv", "", "", "other", "", "", "mod", "", "", "kotlin-stdlib"}, k = 5, mv = {1, 7, 1}, xi = 49, xs = "kotlin/NumbersKt")
class NumbersKt__FloorDivModKt extends kotlin.NumbersKt__BigIntegersKt {
    public NumbersKt__FloorDivModKt() {
            r0 = this;
            r0.<init>()
            return
    }

    @kotlin.SinceKotlin(version = "1.5")
    @kotlin.internal.InlineOnly
    private static final int floorDiv(byte r2, byte r3) {
            int r0 = r2 / r3
            r1 = r2 ^ r3
            if (r1 >= 0) goto Lc
            int r3 = r3 * r0
            if (r3 == r2) goto Lc
            int r0 = r0 + (-1)
        Lc:
            return r0
    }

    @kotlin.SinceKotlin(version = "1.5")
    @kotlin.internal.InlineOnly
    private static final int floorDiv(byte r2, int r3) {
            int r0 = r2 / r3
            r1 = r2 ^ r3
            if (r1 >= 0) goto Lc
            int r3 = r3 * r0
            if (r3 == r2) goto Lc
            int r0 = r0 + (-1)
        Lc:
            return r0
    }

    @kotlin.SinceKotlin(version = "1.5")
    @kotlin.internal.InlineOnly
    private static final int floorDiv(byte r2, short r3) {
            int r0 = r2 / r3
            r1 = r2 ^ r3
            if (r1 >= 0) goto Lc
            int r3 = r3 * r0
            if (r3 == r2) goto Lc
            int r0 = r0 + (-1)
        Lc:
            return r0
    }

    @kotlin.SinceKotlin(version = "1.5")
    @kotlin.internal.InlineOnly
    private static final int floorDiv(int r2, byte r3) {
            int r0 = r2 / r3
            r1 = r2 ^ r3
            if (r1 >= 0) goto Lc
            int r3 = r3 * r0
            if (r3 == r2) goto Lc
            int r0 = r0 + (-1)
        Lc:
            return r0
    }

    @kotlin.SinceKotlin(version = "1.5")
    @kotlin.internal.InlineOnly
    private static final int floorDiv(int r2, int r3) {
            int r0 = r2 / r3
            r1 = r2 ^ r3
            if (r1 >= 0) goto Lc
            int r3 = r3 * r0
            if (r3 == r2) goto Lc
            int r0 = r0 + (-1)
        Lc:
            return r0
    }

    @kotlin.SinceKotlin(version = "1.5")
    @kotlin.internal.InlineOnly
    private static final int floorDiv(int r2, short r3) {
            int r0 = r2 / r3
            r1 = r2 ^ r3
            if (r1 >= 0) goto Lc
            int r3 = r3 * r0
            if (r3 == r2) goto Lc
            int r0 = r0 + (-1)
        Lc:
            return r0
    }

    @kotlin.SinceKotlin(version = "1.5")
    @kotlin.internal.InlineOnly
    private static final int floorDiv(short r2, byte r3) {
            int r0 = r2 / r3
            r1 = r2 ^ r3
            if (r1 >= 0) goto Lc
            int r3 = r3 * r0
            if (r3 == r2) goto Lc
            int r0 = r0 + (-1)
        Lc:
            return r0
    }

    @kotlin.SinceKotlin(version = "1.5")
    @kotlin.internal.InlineOnly
    private static final int floorDiv(short r2, int r3) {
            int r0 = r2 / r3
            r1 = r2 ^ r3
            if (r1 >= 0) goto Lc
            int r3 = r3 * r0
            if (r3 == r2) goto Lc
            int r0 = r0 + (-1)
        Lc:
            return r0
    }

    @kotlin.SinceKotlin(version = "1.5")
    @kotlin.internal.InlineOnly
    private static final int floorDiv(short r2, short r3) {
            int r0 = r2 / r3
            r1 = r2 ^ r3
            if (r1 >= 0) goto Lc
            int r3 = r3 * r0
            if (r3 == r2) goto Lc
            int r0 = r0 + (-1)
        Lc:
            return r0
    }

    @kotlin.SinceKotlin(version = "1.5")
    @kotlin.internal.InlineOnly
    private static final long floorDiv(byte r8, long r9) {
            long r0 = (long) r8
            long r2 = r0 / r9
            long r4 = r0 ^ r9
            r6 = 0
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 >= 0) goto L14
            long r9 = r9 * r2
            int r8 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r8 == 0) goto L14
            r8 = -1
            long r2 = r2 + r8
        L14:
            return r2
    }

    @kotlin.SinceKotlin(version = "1.5")
    @kotlin.internal.InlineOnly
    private static final long floorDiv(int r8, long r9) {
            long r0 = (long) r8
            long r2 = r0 / r9
            long r4 = r0 ^ r9
            r6 = 0
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 >= 0) goto L14
            long r9 = r9 * r2
            int r8 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r8 == 0) goto L14
            r8 = -1
            long r2 = r2 + r8
        L14:
            return r2
    }

    @kotlin.SinceKotlin(version = "1.5")
    @kotlin.internal.InlineOnly
    private static final long floorDiv(long r8, byte r10) {
            long r0 = (long) r10
            long r2 = r8 / r0
            long r4 = r8 ^ r0
            r6 = 0
            int r10 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r10 >= 0) goto L14
            long r0 = r0 * r2
            int r10 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r10 == 0) goto L14
            r8 = -1
            long r2 = r2 + r8
        L14:
            return r2
    }

    @kotlin.SinceKotlin(version = "1.5")
    @kotlin.internal.InlineOnly
    private static final long floorDiv(long r8, int r10) {
            long r0 = (long) r10
            long r2 = r8 / r0
            long r4 = r8 ^ r0
            r6 = 0
            int r10 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r10 >= 0) goto L14
            long r0 = r0 * r2
            int r10 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r10 == 0) goto L14
            r8 = -1
            long r2 = r2 + r8
        L14:
            return r2
    }

    @kotlin.SinceKotlin(version = "1.5")
    @kotlin.internal.InlineOnly
    private static final long floorDiv(long r7, long r9) {
            long r0 = r7 / r9
            long r2 = r7 ^ r9
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 >= 0) goto L13
            long r9 = r9 * r0
            int r2 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r2 == 0) goto L13
            r7 = -1
            long r0 = r0 + r7
        L13:
            return r0
    }

    @kotlin.SinceKotlin(version = "1.5")
    @kotlin.internal.InlineOnly
    private static final long floorDiv(long r8, short r10) {
            long r0 = (long) r10
            long r2 = r8 / r0
            long r4 = r8 ^ r0
            r6 = 0
            int r10 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r10 >= 0) goto L14
            long r0 = r0 * r2
            int r10 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r10 == 0) goto L14
            r8 = -1
            long r2 = r2 + r8
        L14:
            return r2
    }

    @kotlin.SinceKotlin(version = "1.5")
    @kotlin.internal.InlineOnly
    private static final long floorDiv(short r8, long r9) {
            long r0 = (long) r8
            long r2 = r0 / r9
            long r4 = r0 ^ r9
            r6 = 0
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 >= 0) goto L14
            long r9 = r9 * r2
            int r8 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r8 == 0) goto L14
            r8 = -1
            long r2 = r2 + r8
        L14:
            return r2
    }

    @kotlin.SinceKotlin(version = "1.5")
    @kotlin.internal.InlineOnly
    private static final byte mod(byte r2, byte r3) {
            int r2 = r2 % r3
            r0 = r2 ^ r3
            int r1 = -r2
            r1 = r1 | r2
            r0 = r0 & r1
            int r0 = r0 >> 31
            r3 = r3 & r0
            int r2 = r2 + r3
            byte r2 = (byte) r2
            return r2
    }

    @kotlin.SinceKotlin(version = "1.5")
    @kotlin.internal.InlineOnly
    private static final byte mod(int r2, byte r3) {
            int r2 = r2 % r3
            r0 = r2 ^ r3
            int r1 = -r2
            r1 = r1 | r2
            r0 = r0 & r1
            int r0 = r0 >> 31
            r3 = r3 & r0
            int r2 = r2 + r3
            byte r2 = (byte) r2
            return r2
    }

    @kotlin.SinceKotlin(version = "1.5")
    @kotlin.internal.InlineOnly
    private static final byte mod(long r6, byte r8) {
            long r0 = (long) r8
            long r6 = r6 % r0
            long r2 = r6 ^ r0
            long r4 = -r6
            long r4 = r4 | r6
            long r2 = r2 & r4
            r8 = 63
            long r2 = r2 >> r8
            long r0 = r0 & r2
            long r6 = r6 + r0
            int r7 = (int) r6
            byte r6 = (byte) r7
            return r6
    }

    @kotlin.SinceKotlin(version = "1.5")
    @kotlin.internal.InlineOnly
    private static final byte mod(short r2, byte r3) {
            int r2 = r2 % r3
            r0 = r2 ^ r3
            int r1 = -r2
            r1 = r1 | r2
            r0 = r0 & r1
            int r0 = r0 >> 31
            r3 = r3 & r0
            int r2 = r2 + r3
            byte r2 = (byte) r2
            return r2
    }

    @kotlin.SinceKotlin(version = "1.5")
    @kotlin.internal.InlineOnly
    private static final double mod(double r7, double r9) {
            double r7 = r7 % r9
            r0 = 1
            r1 = 0
            r2 = 0
            int r4 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r4 != 0) goto Lb
            r2 = 1
            goto Lc
        Lb:
            r2 = 0
        Lc:
            if (r2 != 0) goto L1f
            double r2 = java.lang.Math.signum(r7)
            double r4 = java.lang.Math.signum(r9)
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto L1b
            goto L1c
        L1b:
            r0 = 0
        L1c:
            if (r0 != 0) goto L1f
            double r7 = r7 + r9
        L1f:
            return r7
    }

    @kotlin.SinceKotlin(version = "1.5")
    @kotlin.internal.InlineOnly
    private static final double mod(double r8, float r10) {
            double r0 = (double) r10
            double r8 = r8 % r0
            r10 = 1
            r2 = 0
            r3 = 0
            int r5 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r5 != 0) goto Lc
            r3 = 1
            goto Ld
        Lc:
            r3 = 0
        Ld:
            if (r3 != 0) goto L20
            double r3 = java.lang.Math.signum(r8)
            double r5 = java.lang.Math.signum(r0)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L1c
            goto L1d
        L1c:
            r10 = 0
        L1d:
            if (r10 != 0) goto L20
            double r8 = r8 + r0
        L20:
            return r8
    }

    @kotlin.SinceKotlin(version = "1.5")
    @kotlin.internal.InlineOnly
    private static final double mod(float r8, double r9) {
            double r0 = (double) r8
            double r0 = r0 % r9
            r8 = 1
            r2 = 0
            r3 = 0
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 != 0) goto Lc
            r3 = 1
            goto Ld
        Lc:
            r3 = 0
        Ld:
            if (r3 != 0) goto L20
            double r3 = java.lang.Math.signum(r0)
            double r5 = java.lang.Math.signum(r9)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L1c
            goto L1d
        L1c:
            r8 = 0
        L1d:
            if (r8 != 0) goto L20
            double r0 = r0 + r9
        L20:
            return r0
    }

    @kotlin.SinceKotlin(version = "1.5")
    @kotlin.internal.InlineOnly
    private static final float mod(float r4, float r5) {
            float r4 = r4 % r5
            r0 = 1
            r1 = 0
            r2 = 0
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 != 0) goto La
            r2 = 1
            goto Lb
        La:
            r2 = 0
        Lb:
            if (r2 != 0) goto L1e
            float r2 = java.lang.Math.signum(r4)
            float r3 = java.lang.Math.signum(r5)
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 != 0) goto L1a
            goto L1b
        L1a:
            r0 = 0
        L1b:
            if (r0 != 0) goto L1e
            float r4 = r4 + r5
        L1e:
            return r4
    }

    @kotlin.SinceKotlin(version = "1.5")
    @kotlin.internal.InlineOnly
    private static final int mod(byte r2, int r3) {
            int r2 = r2 % r3
            r0 = r2 ^ r3
            int r1 = -r2
            r1 = r1 | r2
            r0 = r0 & r1
            int r0 = r0 >> 31
            r3 = r3 & r0
            int r2 = r2 + r3
            return r2
    }

    @kotlin.SinceKotlin(version = "1.5")
    @kotlin.internal.InlineOnly
    private static final int mod(int r2, int r3) {
            int r2 = r2 % r3
            r0 = r2 ^ r3
            int r1 = -r2
            r1 = r1 | r2
            r0 = r0 & r1
            int r0 = r0 >> 31
            r3 = r3 & r0
            int r2 = r2 + r3
            return r2
    }

    @kotlin.SinceKotlin(version = "1.5")
    @kotlin.internal.InlineOnly
    private static final int mod(long r6, int r8) {
            long r0 = (long) r8
            long r6 = r6 % r0
            long r2 = r6 ^ r0
            long r4 = -r6
            long r4 = r4 | r6
            long r2 = r2 & r4
            r8 = 63
            long r2 = r2 >> r8
            long r0 = r0 & r2
            long r6 = r6 + r0
            int r7 = (int) r6
            return r7
    }

    @kotlin.SinceKotlin(version = "1.5")
    @kotlin.internal.InlineOnly
    private static final int mod(short r2, int r3) {
            int r2 = r2 % r3
            r0 = r2 ^ r3
            int r1 = -r2
            r1 = r1 | r2
            r0 = r0 & r1
            int r0 = r0 >> 31
            r3 = r3 & r0
            int r2 = r2 + r3
            return r2
    }

    @kotlin.SinceKotlin(version = "1.5")
    @kotlin.internal.InlineOnly
    private static final long mod(byte r6, long r7) {
            long r0 = (long) r6
            long r0 = r0 % r7
            long r2 = r0 ^ r7
            long r4 = -r0
            long r4 = r4 | r0
            long r2 = r2 & r4
            r6 = 63
            long r2 = r2 >> r6
            long r6 = r7 & r2
            long r0 = r0 + r6
            return r0
    }

    @kotlin.SinceKotlin(version = "1.5")
    @kotlin.internal.InlineOnly
    private static final long mod(int r6, long r7) {
            long r0 = (long) r6
            long r0 = r0 % r7
            long r2 = r0 ^ r7
            long r4 = -r0
            long r4 = r4 | r0
            long r2 = r2 & r4
            r6 = 63
            long r2 = r2 >> r6
            long r6 = r7 & r2
            long r0 = r0 + r6
            return r0
    }

    @kotlin.SinceKotlin(version = "1.5")
    @kotlin.internal.InlineOnly
    private static final long mod(long r4, long r6) {
            long r4 = r4 % r6
            long r0 = r4 ^ r6
            long r2 = -r4
            long r2 = r2 | r4
            long r0 = r0 & r2
            r2 = 63
            long r0 = r0 >> r2
            long r6 = r6 & r0
            long r4 = r4 + r6
            return r4
    }

    @kotlin.SinceKotlin(version = "1.5")
    @kotlin.internal.InlineOnly
    private static final long mod(short r6, long r7) {
            long r0 = (long) r6
            long r0 = r0 % r7
            long r2 = r0 ^ r7
            long r4 = -r0
            long r4 = r4 | r0
            long r2 = r2 & r4
            r6 = 63
            long r2 = r2 >> r6
            long r6 = r7 & r2
            long r0 = r0 + r6
            return r0
    }

    @kotlin.SinceKotlin(version = "1.5")
    @kotlin.internal.InlineOnly
    private static final short mod(byte r2, short r3) {
            int r2 = r2 % r3
            r0 = r2 ^ r3
            int r1 = -r2
            r1 = r1 | r2
            r0 = r0 & r1
            int r0 = r0 >> 31
            r3 = r3 & r0
            int r2 = r2 + r3
            short r2 = (short) r2
            return r2
    }

    @kotlin.SinceKotlin(version = "1.5")
    @kotlin.internal.InlineOnly
    private static final short mod(int r2, short r3) {
            int r2 = r2 % r3
            r0 = r2 ^ r3
            int r1 = -r2
            r1 = r1 | r2
            r0 = r0 & r1
            int r0 = r0 >> 31
            r3 = r3 & r0
            int r2 = r2 + r3
            short r2 = (short) r2
            return r2
    }

    @kotlin.SinceKotlin(version = "1.5")
    @kotlin.internal.InlineOnly
    private static final short mod(long r6, short r8) {
            long r0 = (long) r8
            long r6 = r6 % r0
            long r2 = r6 ^ r0
            long r4 = -r6
            long r4 = r4 | r6
            long r2 = r2 & r4
            r8 = 63
            long r2 = r2 >> r8
            long r0 = r0 & r2
            long r6 = r6 + r0
            int r7 = (int) r6
            short r6 = (short) r7
            return r6
    }

    @kotlin.SinceKotlin(version = "1.5")
    @kotlin.internal.InlineOnly
    private static final short mod(short r2, short r3) {
            int r2 = r2 % r3
            r0 = r2 ^ r3
            int r1 = -r2
            r1 = r1 | r2
            r0 = r0 & r1
            int r0 = r0 >> 31
            r3 = r3 & r0
            int r2 = r2 + r3
            short r2 = (short) r2
            return r2
    }
}
