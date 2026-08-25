package com.google.common.math;

/* JADX INFO: loaded from: classes2.dex */
@com.google.common.math.ElementTypesAreNonnullByDefault
@com.google.common.annotations.GwtCompatible(emulated = true)
public final class LongMath {
    private static final int SIEVE_30 = -545925251;
    public static final int[] biggestBinomials = null;

    @com.google.common.annotations.VisibleForTesting
    public static final int[] biggestSimpleBinomials = null;
    public static final long[] factorials = null;

    @com.google.common.annotations.VisibleForTesting
    @com.google.common.annotations.GwtIncompatible
    public static final long[] halfPowersOf10 = null;

    @com.google.common.annotations.VisibleForTesting
    public static final byte[] maxLog10ForLeadingZeros = null;
    private static final long[][] millerRabinBaseSets = null;

    @com.google.common.annotations.VisibleForTesting
    @com.google.common.annotations.GwtIncompatible
    public static final long[] powersOf10 = null;

    /* JADX INFO: renamed from: com.google.common.math.LongMath$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$java$math$RoundingMode = null;

        static {
                java.math.RoundingMode[] r0 = java.math.RoundingMode.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.google.common.math.LongMath.AnonymousClass1.$SwitchMap$java$math$RoundingMode = r0
                java.math.RoundingMode r1 = java.math.RoundingMode.UNNECESSARY     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = com.google.common.math.LongMath.AnonymousClass1.$SwitchMap$java$math$RoundingMode     // Catch: java.lang.NoSuchFieldError -> L1d
                java.math.RoundingMode r1 = java.math.RoundingMode.DOWN     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = com.google.common.math.LongMath.AnonymousClass1.$SwitchMap$java$math$RoundingMode     // Catch: java.lang.NoSuchFieldError -> L28
                java.math.RoundingMode r1 = java.math.RoundingMode.FLOOR     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = com.google.common.math.LongMath.AnonymousClass1.$SwitchMap$java$math$RoundingMode     // Catch: java.lang.NoSuchFieldError -> L33
                java.math.RoundingMode r1 = java.math.RoundingMode.UP     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                int[] r0 = com.google.common.math.LongMath.AnonymousClass1.$SwitchMap$java$math$RoundingMode     // Catch: java.lang.NoSuchFieldError -> L3e
                java.math.RoundingMode r1 = java.math.RoundingMode.CEILING     // Catch: java.lang.NoSuchFieldError -> L3e
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3e
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3e
            L3e:
                int[] r0 = com.google.common.math.LongMath.AnonymousClass1.$SwitchMap$java$math$RoundingMode     // Catch: java.lang.NoSuchFieldError -> L49
                java.math.RoundingMode r1 = java.math.RoundingMode.HALF_DOWN     // Catch: java.lang.NoSuchFieldError -> L49
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L49
                r2 = 6
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L49
            L49:
                int[] r0 = com.google.common.math.LongMath.AnonymousClass1.$SwitchMap$java$math$RoundingMode     // Catch: java.lang.NoSuchFieldError -> L54
                java.math.RoundingMode r1 = java.math.RoundingMode.HALF_UP     // Catch: java.lang.NoSuchFieldError -> L54
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L54
                r2 = 7
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L54
            L54:
                int[] r0 = com.google.common.math.LongMath.AnonymousClass1.$SwitchMap$java$math$RoundingMode     // Catch: java.lang.NoSuchFieldError -> L60
                java.math.RoundingMode r1 = java.math.RoundingMode.HALF_EVEN     // Catch: java.lang.NoSuchFieldError -> L60
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L60
                r2 = 8
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L60
            L60:
                return
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    public static abstract enum MillerRabinTester extends java.lang.Enum<com.google.common.math.LongMath.MillerRabinTester> {
        private static final /* synthetic */ com.google.common.math.LongMath.MillerRabinTester[] $VALUES = null;
        public static final com.google.common.math.LongMath.MillerRabinTester LARGE = null;
        public static final com.google.common.math.LongMath.MillerRabinTester SMALL = null;



        private static /* synthetic */ com.google.common.math.LongMath.MillerRabinTester[] $values() {
                r0 = 2
                com.google.common.math.LongMath$MillerRabinTester[] r0 = new com.google.common.math.LongMath.MillerRabinTester[r0]
                com.google.common.math.LongMath$MillerRabinTester r1 = com.google.common.math.LongMath.MillerRabinTester.SMALL
                r2 = 0
                r0[r2] = r1
                com.google.common.math.LongMath$MillerRabinTester r1 = com.google.common.math.LongMath.MillerRabinTester.LARGE
                r2 = 1
                r0[r2] = r1
                return r0
        }

        static {
                com.google.common.math.LongMath$MillerRabinTester$1 r0 = new com.google.common.math.LongMath$MillerRabinTester$1
                r0.<init>()
                com.google.common.math.LongMath.MillerRabinTester.SMALL = r0
                com.google.common.math.LongMath$MillerRabinTester$2 r0 = new com.google.common.math.LongMath$MillerRabinTester$2
                r0.<init>()
                com.google.common.math.LongMath.MillerRabinTester.LARGE = r0
                com.google.common.math.LongMath$MillerRabinTester[] r0 = $values()
                com.google.common.math.LongMath.MillerRabinTester.$VALUES = r0
                return
        }

        private MillerRabinTester(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public /* synthetic */ MillerRabinTester(java.lang.String r1, int r2, com.google.common.math.LongMath.AnonymousClass1 r3) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        private long powMod(long r10, long r12, long r14) {
                r9 = this;
                r0 = 1
                r3 = r0
            L3:
                r5 = 0
                int r2 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
                if (r2 == 0) goto L1d
                long r7 = r12 & r0
                int r2 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
                if (r2 == 0) goto L16
                r2 = r9
                r5 = r10
                r7 = r14
                long r3 = r2.mulMod(r3, r5, r7)
            L16:
                long r10 = r9.squareMod(r10, r14)
                r2 = 1
                long r12 = r12 >> r2
                goto L3
            L1d:
                return r3
        }

        public static boolean test(long r3, long r5) {
                r0 = 3037000499(0xb504f333, double:1.500477613E-314)
                int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
                if (r2 > 0) goto Lc
                com.google.common.math.LongMath$MillerRabinTester r0 = com.google.common.math.LongMath.MillerRabinTester.SMALL
                goto Le
            Lc:
                com.google.common.math.LongMath$MillerRabinTester r0 = com.google.common.math.LongMath.MillerRabinTester.LARGE
            Le:
                boolean r3 = r0.testWitness(r3, r5)
                return r3
        }

        private boolean testWitness(long r16, long r18) {
                r15 = this;
                r7 = r18
                r9 = 1
                long r11 = r7 - r9
                int r13 = java.lang.Long.numberOfTrailingZeros(r11)
                long r3 = r11 >> r13
                long r1 = r16 % r7
                r14 = 1
                r5 = 0
                int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
                if (r0 != 0) goto L16
                return r14
            L16:
                r0 = r15
                r5 = r18
                long r0 = r0.powMod(r1, r3, r5)
                int r2 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
                if (r2 != 0) goto L22
                return r14
            L22:
                r2 = 0
                r3 = 0
            L24:
                int r4 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
                if (r4 == 0) goto L32
                int r3 = r3 + r14
                if (r3 != r13) goto L2c
                return r2
            L2c:
                r4 = r15
                long r0 = r15.squareMod(r0, r7)
                goto L24
            L32:
                r4 = r15
                return r14
        }

        public static com.google.common.math.LongMath.MillerRabinTester valueOf(java.lang.String r1) {
                java.lang.Class<com.google.common.math.LongMath$MillerRabinTester> r0 = com.google.common.math.LongMath.MillerRabinTester.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.google.common.math.LongMath$MillerRabinTester r1 = (com.google.common.math.LongMath.MillerRabinTester) r1
                return r1
        }

        public static com.google.common.math.LongMath.MillerRabinTester[] values() {
                com.google.common.math.LongMath$MillerRabinTester[] r0 = com.google.common.math.LongMath.MillerRabinTester.$VALUES
                java.lang.Object r0 = r0.clone()
                com.google.common.math.LongMath$MillerRabinTester[] r0 = (com.google.common.math.LongMath.MillerRabinTester[]) r0
                return r0
        }

        public abstract long mulMod(long r1, long r3, long r5);

        public abstract long squareMod(long r1, long r3);
    }

    static {
            r0 = 64
            byte[] r0 = new byte[r0]
            r0 = {x0074: FILL_ARRAY_DATA , data: [19, 18, 18, 18, 18, 17, 17, 17, 16, 16, 16, 15, 15, 15, 15, 14, 14, 14, 13, 13, 13, 12, 12, 12, 12, 11, 11, 11, 10, 10, 10, 9, 9, 9, 9, 8, 8, 8, 7, 7, 7, 6, 6, 6, 6, 5, 5, 5, 4, 4, 4, 3, 3, 3, 3, 2, 2, 2, 1, 1, 1, 0, 0, 0} // fill-array
            com.google.common.math.LongMath.maxLog10ForLeadingZeros = r0
            r0 = 19
            long[] r1 = new long[r0]
            r1 = {x0098: FILL_ARRAY_DATA , data: [1, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000, 10000000000, 100000000000, 1000000000000, 10000000000000, 100000000000000, 1000000000000000, 10000000000000000, 100000000000000000, 1000000000000000000} // fill-array
            com.google.common.math.LongMath.powersOf10 = r1
            long[] r0 = new long[r0]
            r0 = {x00e8: FILL_ARRAY_DATA , data: [3, 31, 316, 3162, 31622, 316227, 3162277, 31622776, 316227766, 3162277660, 31622776601, 316227766016, 3162277660168, 31622776601683, 316227766016837, 3162277660168379, 31622776601683793, 316227766016837933, 3162277660168379331} // fill-array
            com.google.common.math.LongMath.halfPowersOf10 = r0
            r0 = 21
            long[] r0 = new long[r0]
            r0 = {x0138: FILL_ARRAY_DATA , data: [1, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880, 3628800, 39916800, 479001600, 6227020800, 87178291200, 1307674368000, 20922789888000, 355687428096000, 6402373705728000, 121645100408832000, 2432902008176640000} // fill-array
            com.google.common.math.LongMath.factorials = r0
            r0 = 34
            int[] r0 = new int[r0]
            r0 = {x0190: FILL_ARRAY_DATA , data: [2147483647, 2147483647, 2147483647, 3810779, 121977, 16175, 4337, 1733, 887, 534, 361, 265, 206, 169, 143, 125, 111, 101, 94, 88, 83, 79, 76, 74, 72, 70, 69, 68, 67, 67, 66, 66, 66, 66} // fill-array
            com.google.common.math.LongMath.biggestBinomials = r0
            r0 = 31
            int[] r0 = new int[r0]
            r0 = {x01d8: FILL_ARRAY_DATA , data: [2147483647, 2147483647, 2147483647, 2642246, 86251, 11724, 3218, 1313, 684, 419, 287, 214, 169, 139, 119, 105, 95, 87, 81, 76, 73, 70, 68, 66, 64, 63, 62, 62, 61, 61, 61} // fill-array
            com.google.common.math.LongMath.biggestSimpleBinomials = r0
            r0 = 7
            long[][] r1 = new long[r0][]
            r2 = 2
            long[] r3 = new long[r2]
            r3 = {x021a: FILL_ARRAY_DATA , data: [291830, 126401071349994536} // fill-array
            r4 = 0
            r1[r4] = r3
            r3 = 3
            long[] r4 = new long[r3]
            r4 = {x0226: FILL_ARRAY_DATA , data: [885594168, 725270293939359937, 3569819667048198375} // fill-array
            r5 = 1
            r1[r5] = r4
            r4 = 4
            long[] r5 = new long[r4]
            r5 = {x0236: FILL_ARRAY_DATA , data: [273919523040, 15, 7363882082, 992620450144556} // fill-array
            r1[r2] = r5
            r2 = 5
            long[] r5 = new long[r2]
            r5 = {x024a: FILL_ARRAY_DATA , data: [47636622961200, 2, 2570940, 211991001, 3749873356} // fill-array
            r1[r3] = r5
            r3 = 6
            long[] r5 = new long[r3]
            r5 = {x0262: FILL_ARRAY_DATA , data: [7999252175582850, 2, 4130806001517, 149795463772692060, 186635894390467037, 3967304179347715805} // fill-array
            r1[r4] = r5
            long[] r0 = new long[r0]
            r0 = {x027e: FILL_ARRAY_DATA , data: [585226005592931976, 2, 123635709730000, 9233062284813009, 43835965440333360, 761179012939631437, 1263739024124850375} // fill-array
            r1[r2] = r0
            r0 = 8
            long[] r0 = new long[r0]
            r0 = {x029e: FILL_ARRAY_DATA , data: [9223372036854775807, 2, 325, 9375, 28178, 450775, 9780504, 1795265022} // fill-array
            r1[r3] = r0
            com.google.common.math.LongMath.millerRabinBaseSets = r1
            return
    }

    private LongMath() {
            r0 = this;
            r0.<init>()
            return
    }

    public static long binomial(int r13, int r14) {
            java.lang.String r0 = "n"
            com.google.common.math.MathPreconditions.checkNonNegative(r0, r13)
            java.lang.String r0 = "k"
            com.google.common.math.MathPreconditions.checkNonNegative(r0, r14)
            r0 = 1
            if (r14 > r13) goto Lf
            r1 = 1
            goto L10
        Lf:
            r1 = 0
        L10:
            java.lang.String r2 = "k (%s) > n (%s)"
            com.google.common.base.Preconditions.checkArgument(r1, r2, r14, r13)
            int r1 = r13 >> 1
            if (r14 <= r1) goto L1b
            int r14 = r13 - r14
        L1b:
            r1 = 1
            if (r14 == 0) goto La2
            if (r14 == r0) goto La0
            long[] r0 = com.google.common.math.LongMath.factorials
            r3 = 21
            if (r13 >= r3) goto L32
            r1 = r0[r13]
            r3 = r0[r14]
            int r13 = r13 - r14
            r13 = r0[r13]
            long r3 = r3 * r13
            long r1 = r1 / r3
            return r1
        L32:
            int[] r0 = com.google.common.math.LongMath.biggestBinomials
            r3 = 34
            if (r14 >= r3) goto L9a
            r0 = r0[r14]
            if (r13 <= r0) goto L3d
            goto L9a
        L3d:
            int[] r0 = com.google.common.math.LongMath.biggestSimpleBinomials
            r3 = 31
            r4 = 2
            if (r14 >= r3) goto L58
            r0 = r0[r14]
            if (r13 > r0) goto L58
            int r0 = r13 + (-1)
            long r1 = (long) r13
        L4b:
            if (r4 > r14) goto L57
            long r5 = (long) r0
            long r1 = r1 * r5
            long r5 = (long) r4
            long r1 = r1 / r5
            int r0 = r0 + (-1)
            int r4 = r4 + 1
            goto L4b
        L57:
            return r1
        L58:
            long r5 = (long) r13
            java.math.RoundingMode r0 = java.math.RoundingMode.CEILING
            int r0 = log2(r5, r0)
            int r13 = r13 + (-1)
            r3 = r0
            r7 = r1
            r9 = r7
        L64:
            if (r4 > r14) goto L8a
            int r3 = r3 + r0
            r11 = 63
            if (r3 >= r11) goto L72
            long r11 = (long) r13
            long r5 = r5 * r11
            long r11 = (long) r4
            long r9 = r9 * r11
            goto L85
        L72:
            int r3 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r3 != 0) goto L78
            long r5 = r5 / r9
            goto L81
        L78:
            long r11 = gcd(r7, r9)
            long r7 = r7 / r11
            long r9 = r9 / r11
            long r5 = r5 / r9
            long r5 = r5 * r7
        L81:
            r7 = r5
            long r5 = (long) r13
            long r9 = (long) r4
            r3 = r0
        L85:
            int r4 = r4 + 1
            int r13 = r13 + (-1)
            goto L64
        L8a:
            int r13 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r13 != 0) goto L90
            long r5 = r5 / r9
            goto L99
        L90:
            long r13 = gcd(r7, r9)
            long r7 = r7 / r13
            long r9 = r9 / r13
            long r5 = r5 / r9
            long r5 = r5 * r7
        L99:
            return r5
        L9a:
            r13 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            return r13
        La0:
            long r13 = (long) r13
            return r13
        La2:
            return r1
    }

    @com.google.common.annotations.Beta
    public static long ceilingPowerOfTwo(long r3) {
            com.google.common.math.MathPreconditions.checkPositive(r3)
            r0 = 4611686018427387904(0x4000000000000000, double:2.0)
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 > 0) goto L14
            r0 = 1
            long r3 = r3 - r0
            int r3 = java.lang.Long.numberOfLeadingZeros(r3)
            int r3 = -r3
            long r3 = r0 << r3
            return r3
        L14:
            java.lang.ArithmeticException r0 = new java.lang.ArithmeticException
            r1 = 70
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r1)
            java.lang.String r1 = "ceilingPowerOfTwo("
            r2.append(r1)
            r2.append(r3)
            java.lang.String r3 = ") is not representable as a long"
            r2.append(r3)
            java.lang.String r3 = r2.toString()
            r0.<init>(r3)
            throw r0
    }

    @com.google.common.annotations.GwtIncompatible
    public static long checkedAdd(long r11, long r13) {
            long r0 = r11 + r13
            long r2 = r11 ^ r13
            r4 = 1
            r5 = 0
            r6 = 0
            int r8 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r8 >= 0) goto Le
            r2 = 1
            goto Lf
        Le:
            r2 = 0
        Lf:
            long r8 = r11 ^ r0
            int r3 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r3 < 0) goto L16
            goto L17
        L16:
            r4 = 0
        L17:
            r5 = r2 | r4
            java.lang.String r6 = "checkedAdd"
            r7 = r11
            r9 = r13
            com.google.common.math.MathPreconditions.checkNoOverflow(r5, r6, r7, r9)
            return r0
    }

    public static long checkedMultiply(long r15, long r17) {
            r6 = r15
            r8 = r17
            int r0 = java.lang.Long.numberOfLeadingZeros(r15)
            long r1 = ~r6
            int r1 = java.lang.Long.numberOfLeadingZeros(r1)
            int r1 = r1 + r0
            int r0 = java.lang.Long.numberOfLeadingZeros(r17)
            int r0 = r0 + r1
            long r1 = ~r8
            int r1 = java.lang.Long.numberOfLeadingZeros(r1)
            int r1 = r1 + r0
            r0 = 65
            if (r1 <= r0) goto L1f
            long r0 = r6 * r8
            return r0
        L1f:
            r0 = 64
            r10 = 1
            r11 = 0
            if (r1 < r0) goto L27
            r0 = 1
            goto L28
        L27:
            r0 = 0
        L28:
            java.lang.String r1 = "checkedMultiply"
            r2 = r15
            r4 = r17
            com.google.common.math.MathPreconditions.checkNoOverflow(r0, r1, r2, r4)
            r0 = 0
            int r12 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r12 < 0) goto L38
            r0 = 1
            goto L39
        L38:
            r0 = 0
        L39:
            r1 = -9223372036854775808
            int r3 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r3 == 0) goto L41
            r1 = 1
            goto L42
        L41:
            r1 = 0
        L42:
            r0 = r0 | r1
            java.lang.String r1 = "checkedMultiply"
            r2 = r15
            r4 = r17
            com.google.common.math.MathPreconditions.checkNoOverflow(r0, r1, r2, r4)
            long r13 = r6 * r8
            if (r12 == 0) goto L58
            long r0 = r13 / r6
            int r2 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r2 != 0) goto L56
            goto L58
        L56:
            r0 = 0
            goto L59
        L58:
            r0 = 1
        L59:
            java.lang.String r1 = "checkedMultiply"
            r2 = r15
            r4 = r17
            com.google.common.math.MathPreconditions.checkNoOverflow(r0, r1, r2, r4)
            return r13
    }

    @com.google.common.annotations.GwtIncompatible
    public static long checkedPow(long r15, int r17) {
            r2 = r15
            r6 = r17
            java.lang.String r0 = "exponent"
            com.google.common.math.MathPreconditions.checkNonNegative(r0, r6)
            r0 = 0
            r1 = 1
            r4 = -2
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 < 0) goto L12
            r4 = 1
            goto L13
        L12:
            r4 = 0
        L13:
            r7 = 2
            int r5 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r5 > 0) goto L1b
            r5 = 1
            goto L1c
        L1b:
            r5 = 0
        L1c:
            r4 = r4 & r5
            r7 = 1
            if (r4 == 0) goto L6a
            int r4 = (int) r2
            r5 = -2
            r9 = -1
            if (r4 == r5) goto L54
            r5 = -1
            if (r4 == r5) goto L4d
            if (r4 == 0) goto L47
            if (r4 == r1) goto L46
            r5 = 2
            if (r4 != r5) goto L40
            r4 = 63
            if (r6 >= r4) goto L36
            r0 = 1
        L36:
            long r4 = (long) r6
            java.lang.String r1 = "checkedPow"
            r2 = r15
            com.google.common.math.MathPreconditions.checkNoOverflow(r0, r1, r2, r4)
            long r0 = r7 << r6
            return r0
        L40:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
        L46:
            return r7
        L47:
            if (r6 != 0) goto L4a
            goto L4c
        L4a:
            r7 = 0
        L4c:
            return r7
        L4d:
            r0 = r6 & 1
            if (r0 != 0) goto L52
            goto L53
        L52:
            r7 = r9
        L53:
            return r7
        L54:
            r4 = 64
            if (r6 >= r4) goto L59
            r0 = 1
        L59:
            long r4 = (long) r6
            java.lang.String r1 = "checkedPow"
            r2 = r15
            com.google.common.math.MathPreconditions.checkNoOverflow(r0, r1, r2, r4)
            r0 = r6 & 1
            if (r0 != 0) goto L67
            long r0 = r7 << r6
            goto L69
        L67:
            long r0 = r9 << r6
        L69:
            return r0
        L6a:
            r13 = r2
            r2 = r7
            r8 = r13
        L6d:
            if (r6 == 0) goto La4
            if (r6 == r1) goto L9f
            r4 = r6 & 1
            if (r4 == 0) goto L79
            long r2 = checkedMultiply(r2, r8)
        L79:
            r10 = r2
            int r12 = r6 >> 1
            if (r12 <= 0) goto L9c
            r2 = -3037000499(0xffffffff4afb0ccd, double:NaN)
            int r4 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r4 > 0) goto L92
            r2 = 3037000499(0xb504f333, double:1.500477613E-314)
            int r4 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r4 > 0) goto L92
            r2 = 1
            goto L93
        L92:
            r2 = 0
        L93:
            long r6 = (long) r12
            java.lang.String r3 = "checkedPow"
            r4 = r8
            com.google.common.math.MathPreconditions.checkNoOverflow(r2, r3, r4, r6)
            long r8 = r8 * r8
        L9c:
            r2 = r10
            r6 = r12
            goto L6d
        L9f:
            long r0 = checkedMultiply(r2, r8)
            return r0
        La4:
            return r2
    }

    @com.google.common.annotations.GwtIncompatible
    public static long checkedSubtract(long r11, long r13) {
            long r0 = r11 - r13
            long r2 = r11 ^ r13
            r4 = 1
            r5 = 0
            r6 = 0
            int r8 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r8 < 0) goto Le
            r2 = 1
            goto Lf
        Le:
            r2 = 0
        Lf:
            long r8 = r11 ^ r0
            int r3 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r3 < 0) goto L16
            goto L17
        L16:
            r4 = 0
        L17:
            r5 = r2 | r4
            java.lang.String r6 = "checkedSubtract"
            r7 = r11
            r9 = r13
            com.google.common.math.MathPreconditions.checkNoOverflow(r5, r6, r7, r9)
            return r0
    }

    @com.google.common.annotations.GwtIncompatible
    public static long divide(long r9, long r11, java.math.RoundingMode r13) {
            com.google.common.base.Preconditions.checkNotNull(r13)
            long r0 = r9 / r11
            long r2 = r11 * r0
            long r2 = r9 - r2
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto L10
            return r0
        L10:
            long r9 = r9 ^ r11
            r7 = 63
            long r9 = r9 >> r7
            int r10 = (int) r9
            r9 = 1
            r10 = r10 | r9
            int[] r7 = com.google.common.math.LongMath.AnonymousClass1.$SwitchMap$java$math$RoundingMode
            int r8 = r13.ordinal()
            r7 = r7[r8]
            r8 = 0
            switch(r7) {
                case 1: goto L5a;
                case 2: goto L61;
                case 3: goto L57;
                case 4: goto L62;
                case 5: goto L54;
                case 6: goto L29;
                case 7: goto L29;
                case 8: goto L29;
                default: goto L23;
            }
        L23:
            java.lang.AssertionError r9 = new java.lang.AssertionError
            r9.<init>()
            throw r9
        L29:
            long r2 = java.lang.Math.abs(r2)
            long r11 = java.lang.Math.abs(r11)
            long r11 = r11 - r2
            long r2 = r2 - r11
            int r11 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r11 != 0) goto L51
            java.math.RoundingMode r11 = java.math.RoundingMode.HALF_UP
            if (r13 != r11) goto L3d
            r11 = 1
            goto L3e
        L3d:
            r11 = 0
        L3e:
            java.math.RoundingMode r12 = java.math.RoundingMode.HALF_EVEN
            if (r13 != r12) goto L44
            r12 = 1
            goto L45
        L44:
            r12 = 0
        L45:
            r2 = 1
            long r2 = r2 & r0
            int r13 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r13 == 0) goto L4d
            goto L4e
        L4d:
            r9 = 0
        L4e:
            r9 = r9 & r12
            r9 = r9 | r11
            goto L62
        L51:
            if (r11 <= 0) goto L61
            goto L62
        L54:
            if (r10 <= 0) goto L61
            goto L62
        L57:
            if (r10 >= 0) goto L61
            goto L62
        L5a:
            if (r6 != 0) goto L5d
            goto L5e
        L5d:
            r9 = 0
        L5e:
            com.google.common.math.MathPreconditions.checkRoundingUnnecessary(r9)
        L61:
            r9 = 0
        L62:
            if (r9 == 0) goto L66
            long r9 = (long) r10
            long r0 = r0 + r9
        L66:
            return r0
    }

    @com.google.common.annotations.GwtIncompatible
    public static long factorial(int r3) {
            java.lang.String r0 = "n"
            com.google.common.math.MathPreconditions.checkNonNegative(r0, r3)
            long[] r0 = com.google.common.math.LongMath.factorials
            r1 = 21
            if (r3 >= r1) goto Le
            r1 = r0[r3]
            goto L13
        Le:
            r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L13:
            return r1
    }

    @com.google.common.annotations.Beta
    public static long floorPowerOfTwo(long r2) {
            com.google.common.math.MathPreconditions.checkPositive(r2)
            int r2 = java.lang.Long.numberOfLeadingZeros(r2)
            int r2 = 63 - r2
            r0 = 1
            long r2 = r0 << r2
            return r2
    }

    public static long gcd(long r4, long r6) {
            java.lang.String r0 = "a"
            com.google.common.math.MathPreconditions.checkNonNegative(r0, r4)
            java.lang.String r0 = "b"
            com.google.common.math.MathPreconditions.checkNonNegative(r0, r6)
            r0 = 0
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 != 0) goto L11
            return r6
        L11:
            int r2 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r2 != 0) goto L16
            return r4
        L16:
            int r0 = java.lang.Long.numberOfTrailingZeros(r4)
            long r4 = r4 >> r0
            int r1 = java.lang.Long.numberOfTrailingZeros(r6)
            long r6 = r6 >> r1
        L20:
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 == 0) goto L33
            long r4 = r4 - r6
            r2 = 63
            long r2 = r4 >> r2
            long r2 = r2 & r4
            long r4 = r4 - r2
            long r4 = r4 - r2
            long r6 = r6 + r2
            int r2 = java.lang.Long.numberOfTrailingZeros(r4)
            long r4 = r4 >> r2
            goto L20
        L33:
            int r6 = java.lang.Math.min(r0, r1)
            long r4 = r4 << r6
            return r4
    }

    public static boolean isPowerOfTwo(long r7) {
            r0 = 1
            r1 = 0
            r2 = 0
            int r4 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r4 <= 0) goto La
            r4 = 1
            goto Lb
        La:
            r4 = 0
        Lb:
            r5 = 1
            long r5 = r7 - r5
            long r7 = r7 & r5
            int r5 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r5 != 0) goto L15
            goto L16
        L15:
            r0 = 0
        L16:
            r7 = r4 & r0
            return r7
    }

    @com.google.common.annotations.Beta
    @com.google.common.annotations.GwtIncompatible
    public static boolean isPrime(long r9) {
            r0 = 0
            r1 = 2
            int r3 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r3 >= 0) goto Ld
            java.lang.String r1 = "n"
            com.google.common.math.MathPreconditions.checkNonNegative(r1, r9)
            return r0
        Ld:
            r1 = 66
            r3 = 0
            r5 = 1
            int r6 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r6 >= 0) goto L29
            r1 = 722865708377213483(0xa08228828228a2b, double:2.4526698060764222E-260)
            int r10 = (int) r9
            int r10 = r10 + (-2)
            long r9 = r1 >> r10
            r1 = 1
            long r9 = r9 & r1
            int r1 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r1 == 0) goto L28
            r0 = 1
        L28:
            return r0
        L29:
            r1 = -545925251(0xffffffffdf75d77d, float:-1.7714765E19)
            r6 = 30
            long r6 = r9 % r6
            int r2 = (int) r6
            int r2 = r5 << r2
            r1 = r1 & r2
            if (r1 == 0) goto L37
            return r0
        L37:
            r1 = 7
            long r1 = r9 % r1
            int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r6 == 0) goto L7f
            r1 = 11
            long r1 = r9 % r1
            int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r6 == 0) goto L7f
            r1 = 13
            long r1 = r9 % r1
            int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r6 != 0) goto L50
            goto L7f
        L50:
            r1 = 289(0x121, double:1.43E-321)
            int r3 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r3 >= 0) goto L57
            return r5
        L57:
            long[][] r1 = com.google.common.math.LongMath.millerRabinBaseSets
            int r2 = r1.length
            r3 = 0
        L5b:
            if (r3 >= r2) goto L79
            r4 = r1[r3]
            r6 = r4[r0]
            int r8 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r8 > 0) goto L76
            r1 = 1
        L66:
            int r2 = r4.length
            if (r1 >= r2) goto L75
            r2 = r4[r1]
            boolean r2 = com.google.common.math.LongMath.MillerRabinTester.test(r2, r9)
            if (r2 != 0) goto L72
            return r0
        L72:
            int r1 = r1 + 1
            goto L66
        L75:
            return r5
        L76:
            int r3 = r3 + 1
            goto L5b
        L79:
            java.lang.AssertionError r9 = new java.lang.AssertionError
            r9.<init>()
            throw r9
        L7f:
            return r0
    }

    @com.google.common.annotations.VisibleForTesting
    public static int lessThanBranchFree(long r0, long r2) {
            long r0 = r0 - r2
            long r0 = ~r0
            long r0 = ~r0
            r2 = 63
            long r0 = r0 >>> r2
            int r1 = (int) r0
            return r1
    }

    @com.google.common.annotations.GwtIncompatible
    public static int log10(long r4, java.math.RoundingMode r6) {
            com.google.common.math.MathPreconditions.checkPositive(r4)
            byte[] r0 = com.google.common.math.LongMath.maxLog10ForLeadingZeros
            int r1 = java.lang.Long.numberOfLeadingZeros(r4)
            r0 = r0[r1]
            long[] r1 = com.google.common.math.LongMath.powersOf10
            r2 = r1[r0]
            int r2 = lessThanBranchFree(r4, r2)
            int r0 = r0 - r2
            r2 = r1[r0]
            int[] r1 = com.google.common.math.LongMath.AnonymousClass1.$SwitchMap$java$math$RoundingMode
            int r6 = r6.ordinal()
            r6 = r1[r6]
            switch(r6) {
                case 1: goto L36;
                case 2: goto L40;
                case 3: goto L40;
                case 4: goto L30;
                case 5: goto L30;
                case 6: goto L27;
                case 7: goto L27;
                case 8: goto L27;
                default: goto L21;
            }
        L21:
            java.lang.AssertionError r4 = new java.lang.AssertionError
            r4.<init>()
            throw r4
        L27:
            long[] r6 = com.google.common.math.LongMath.halfPowersOf10
            r1 = r6[r0]
            int r4 = lessThanBranchFree(r1, r4)
            goto L34
        L30:
            int r4 = lessThanBranchFree(r2, r4)
        L34:
            int r4 = r4 + r0
            return r4
        L36:
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 != 0) goto L3c
            r4 = 1
            goto L3d
        L3c:
            r4 = 0
        L3d:
            com.google.common.math.MathPreconditions.checkRoundingUnnecessary(r4)
        L40:
            return r0
    }

    public static int log2(long r2, java.math.RoundingMode r4) {
            com.google.common.math.MathPreconditions.checkPositive(r2)
            int[] r0 = com.google.common.math.LongMath.AnonymousClass1.$SwitchMap$java$math$RoundingMode
            int r4 = r4.ordinal()
            r4 = r0[r4]
            switch(r4) {
                case 1: goto L32;
                case 2: goto L39;
                case 3: goto L39;
                case 4: goto L28;
                case 5: goto L28;
                case 6: goto L16;
                case 7: goto L16;
                case 8: goto L16;
                default: goto Le;
            }
        Le:
            java.lang.AssertionError r2 = new java.lang.AssertionError
            java.lang.String r3 = "impossible"
            r2.<init>(r3)
            throw r2
        L16:
            int r4 = java.lang.Long.numberOfLeadingZeros(r2)
            r0 = -5402926248376769404(0xb504f333f9de6484, double:-2.734104117489491E-53)
            long r0 = r0 >>> r4
            int r4 = 63 - r4
            int r2 = lessThanBranchFree(r0, r2)
            int r2 = r2 + r4
            return r2
        L28:
            r0 = 1
            long r2 = r2 - r0
            int r2 = java.lang.Long.numberOfLeadingZeros(r2)
            int r2 = 64 - r2
            return r2
        L32:
            boolean r4 = isPowerOfTwo(r2)
            com.google.common.math.MathPreconditions.checkRoundingUnnecessary(r4)
        L39:
            int r2 = java.lang.Long.numberOfLeadingZeros(r2)
            int r2 = 63 - r2
            return r2
    }

    public static long mean(long r2, long r4) {
            long r0 = r2 & r4
            long r2 = r2 ^ r4
            r4 = 1
            long r2 = r2 >> r4
            long r0 = r0 + r2
            return r0
    }

    @com.google.common.annotations.GwtIncompatible
    public static int mod(long r2, int r4) {
            long r0 = (long) r4
            long r2 = mod(r2, r0)
            int r3 = (int) r2
            return r3
    }

    @com.google.common.annotations.GwtIncompatible
    public static long mod(long r3, long r5) {
            r0 = 0
            int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r2 <= 0) goto Le
            long r3 = r3 % r5
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 < 0) goto Lc
            goto Ld
        Lc:
            long r3 = r3 + r5
        Ld:
            return r3
        Le:
            java.lang.ArithmeticException r3 = new java.lang.ArithmeticException
            java.lang.String r4 = "Modulus must be positive"
            r3.<init>(r4)
            throw r3
    }

    @com.google.common.annotations.GwtIncompatible
    public static long pow(long r7, int r9) {
            java.lang.String r0 = "exponent"
            com.google.common.math.MathPreconditions.checkNonNegative(r0, r9)
            r0 = 1
            r1 = 1
            r3 = -2
            int r5 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r5 > 0) goto L4d
            r3 = 2
            int r5 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r5 > 0) goto L4d
            int r8 = (int) r7
            r7 = -2
            r3 = 64
            r4 = 0
            if (r8 == r7) goto L3f
            r7 = -1
            if (r8 == r7) goto L37
            if (r8 == 0) goto L32
            if (r8 == r0) goto L31
            r7 = 2
            if (r8 != r7) goto L2b
            if (r9 >= r3) goto L2a
            long r4 = r1 << r9
        L2a:
            return r4
        L2b:
            java.lang.AssertionError r7 = new java.lang.AssertionError
            r7.<init>()
            throw r7
        L31:
            return r1
        L32:
            if (r9 != 0) goto L35
            goto L36
        L35:
            r1 = r4
        L36:
            return r1
        L37:
            r7 = r9 & 1
            if (r7 != 0) goto L3c
            goto L3e
        L3c:
            r1 = -1
        L3e:
            return r1
        L3f:
            if (r9 >= r3) goto L4c
            r7 = r9 & 1
            if (r7 != 0) goto L48
            long r7 = r1 << r9
            goto L4b
        L48:
            long r7 = r1 << r9
            long r7 = -r7
        L4b:
            return r7
        L4c:
            return r4
        L4d:
            r3 = r1
        L4e:
            if (r9 == 0) goto L62
            if (r9 == r0) goto L60
            r5 = r9 & 1
            if (r5 != 0) goto L58
            r5 = r1
            goto L59
        L58:
            r5 = r7
        L59:
            long r3 = r3 * r5
            long r7 = r7 * r7
            int r9 = r9 >> 1
            goto L4e
        L60:
            long r3 = r3 * r7
        L62:
            return r3
    }

    @com.google.common.annotations.GwtIncompatible
    public static double roundToDouble(long r22, java.math.RoundingMode r24) {
            r0 = r22
            double r2 = (double) r0
            long r4 = (long) r2
            r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 != 0) goto Lf
            r8 = -1
            goto L13
        Lf:
            int r8 = com.google.common.primitives.Longs.compare(r0, r4)
        L13:
            int[] r9 = com.google.common.math.LongMath.AnonymousClass1.$SwitchMap$java$math$RoundingMode
            int r10 = r24.ordinal()
            r10 = r9[r10]
            java.lang.String r11 = "impossible"
            switch(r10) {
                case 1: goto Lcc;
                case 2: goto Lb6;
                case 3: goto Lae;
                case 4: goto L98;
                case 5: goto L90;
                case 6: goto L26;
                case 7: goto L26;
                case 8: goto L26;
                default: goto L20;
            }
        L20:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>(r11)
            throw r0
        L26:
            if (r8 < 0) goto L32
            double r14 = java.lang.Math.nextUp(r2)
            double r12 = java.lang.Math.ceil(r14)
            long r12 = (long) r12
            goto L42
        L32:
            double r12 = com.google.common.math.DoubleUtils.nextDown(r2)
            double r14 = java.lang.Math.floor(r12)
            long r14 = (long) r14
            r20 = r4
            r4 = r14
            r14 = r2
            r2 = r12
            r12 = r20
        L42:
            long r4 = r0 - r4
            long r16 = r12 - r0
            r18 = 1
            int r8 = (r12 > r6 ? 1 : (r12 == r6 ? 0 : -1))
            if (r8 != 0) goto L4e
            long r16 = r16 + r18
        L4e:
            r6 = r16
            int r4 = com.google.common.primitives.Longs.compare(r4, r6)
            if (r4 >= 0) goto L57
            return r2
        L57:
            if (r4 <= 0) goto L5a
            return r14
        L5a:
            int r4 = r24.ordinal()
            r4 = r9[r4]
            r5 = 6
            if (r4 == r5) goto L87
            r5 = 7
            if (r4 == r5) goto L7f
            r0 = 8
            if (r4 != r0) goto L79
            long r0 = com.google.common.math.DoubleUtils.getSignificand(r2)
            long r0 = r0 & r18
            r4 = 0
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 != 0) goto L77
            goto L78
        L77:
            r2 = r14
        L78:
            return r2
        L79:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>(r11)
            throw r0
        L7f:
            r4 = 0
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 < 0) goto L86
            r2 = r14
        L86:
            return r2
        L87:
            r4 = 0
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 < 0) goto L8e
            goto L8f
        L8e:
            r2 = r14
        L8f:
            return r2
        L90:
            if (r8 > 0) goto L93
            goto L97
        L93:
            double r2 = java.lang.Math.nextUp(r2)
        L97:
            return r2
        L98:
            r4 = 0
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 < 0) goto La6
            if (r8 > 0) goto La1
            goto La5
        La1:
            double r2 = java.lang.Math.nextUp(r2)
        La5:
            return r2
        La6:
            if (r8 < 0) goto La9
            goto Lad
        La9:
            double r2 = com.google.common.math.DoubleUtils.nextDown(r2)
        Lad:
            return r2
        Lae:
            if (r8 < 0) goto Lb1
            goto Lb5
        Lb1:
            double r2 = com.google.common.math.DoubleUtils.nextDown(r2)
        Lb5:
            return r2
        Lb6:
            r4 = 0
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 < 0) goto Lc4
            if (r8 < 0) goto Lbf
            goto Lc3
        Lbf:
            double r2 = com.google.common.math.DoubleUtils.nextDown(r2)
        Lc3:
            return r2
        Lc4:
            if (r8 > 0) goto Lc7
            goto Lcb
        Lc7:
            double r2 = java.lang.Math.nextUp(r2)
        Lcb:
            return r2
        Lcc:
            if (r8 != 0) goto Ld0
            r0 = 1
            goto Ld1
        Ld0:
            r0 = 0
        Ld1:
            com.google.common.math.MathPreconditions.checkRoundingUnnecessary(r0)
            return r2
    }

    @com.google.common.annotations.Beta
    public static long saturatedAdd(long r7, long r9) {
            long r0 = r7 + r9
            long r9 = r9 ^ r7
            r2 = 1
            r3 = 0
            r4 = 0
            int r6 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r6 >= 0) goto Ld
            r9 = 1
            goto Le
        Ld:
            r9 = 0
        Le:
            long r7 = r7 ^ r0
            int r10 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r10 < 0) goto L14
            goto L15
        L14:
            r2 = 0
        L15:
            r7 = r9 | r2
            if (r7 == 0) goto L1a
            return r0
        L1a:
            r7 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r9 = 63
            long r9 = r0 >>> r9
            r0 = 1
            long r9 = r9 ^ r0
            long r9 = r9 + r7
            return r9
    }

    @com.google.common.annotations.Beta
    public static long saturatedMultiply(long r10, long r12) {
            int r0 = java.lang.Long.numberOfLeadingZeros(r10)
            long r1 = ~r10
            int r1 = java.lang.Long.numberOfLeadingZeros(r1)
            int r1 = r1 + r0
            int r0 = java.lang.Long.numberOfLeadingZeros(r12)
            int r0 = r0 + r1
            long r1 = ~r12
            int r1 = java.lang.Long.numberOfLeadingZeros(r1)
            int r1 = r1 + r0
            r0 = 65
            if (r1 <= r0) goto L1c
            long r10 = r10 * r12
            return r10
        L1c:
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            long r4 = r10 ^ r12
            r0 = 63
            long r4 = r4 >>> r0
            long r4 = r4 + r2
            r0 = 64
            r2 = 1
            r3 = 0
            if (r1 >= r0) goto L2f
            r0 = 1
            goto L30
        L2f:
            r0 = 0
        L30:
            r6 = 0
            int r1 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r1 >= 0) goto L38
            r6 = 1
            goto L39
        L38:
            r6 = 0
        L39:
            r7 = -9223372036854775808
            int r9 = (r12 > r7 ? 1 : (r12 == r7 ? 0 : -1))
            if (r9 != 0) goto L40
            goto L41
        L40:
            r2 = 0
        L41:
            r2 = r2 & r6
            r0 = r0 | r2
            if (r0 == 0) goto L46
            return r4
        L46:
            long r2 = r10 * r12
            if (r1 == 0) goto L52
            long r10 = r2 / r10
            int r0 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r0 != 0) goto L51
            goto L52
        L51:
            return r4
        L52:
            return r2
    }

    @com.google.common.annotations.Beta
    public static long saturatedPow(long r10, int r12) {
            java.lang.String r0 = "exponent"
            com.google.common.math.MathPreconditions.checkNonNegative(r0, r12)
            r0 = 0
            r1 = 1
            r2 = -2
            int r4 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r4 < 0) goto Lf
            r2 = 1
            goto L10
        Lf:
            r2 = 0
        L10:
            r3 = 2
            int r5 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r5 > 0) goto L18
            r3 = 1
            goto L19
        L18:
            r3 = 0
        L19:
            r2 = r2 & r3
            r3 = 63
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r6 = 1
            if (r2 == 0) goto L62
            int r11 = (int) r10
            r10 = -2
            r8 = -1
            if (r11 == r10) goto L4f
            r10 = -1
            if (r11 == r10) goto L48
            if (r11 == 0) goto L42
            if (r11 == r1) goto L41
            r10 = 2
            if (r11 != r10) goto L3b
            if (r12 < r3) goto L38
            return r4
        L38:
            long r10 = r6 << r12
            return r10
        L3b:
            java.lang.AssertionError r10 = new java.lang.AssertionError
            r10.<init>()
            throw r10
        L41:
            return r6
        L42:
            if (r12 != 0) goto L45
            goto L47
        L45:
            r6 = 0
        L47:
            return r6
        L48:
            r10 = r12 & 1
            if (r10 != 0) goto L4d
            goto L4e
        L4d:
            r6 = r8
        L4e:
            return r6
        L4f:
            r10 = 64
            if (r12 < r10) goto L58
            r10 = r12 & 1
            long r10 = (long) r10
            long r10 = r10 + r4
            return r10
        L58:
            r10 = r12 & 1
            if (r10 != 0) goto L5f
            long r10 = r6 << r12
            goto L61
        L5f:
            long r10 = r8 << r12
        L61:
            return r10
        L62:
            long r2 = r10 >>> r3
            r8 = r12 & 1
            long r8 = (long) r8
            long r2 = r2 & r8
            long r2 = r2 + r4
        L69:
            if (r12 == 0) goto L9e
            if (r12 == r1) goto L99
            r4 = r12 & 1
            if (r4 == 0) goto L76
            long r4 = saturatedMultiply(r6, r10)
            r6 = r4
        L76:
            int r12 = r12 >> 1
            if (r12 <= 0) goto L69
            r4 = -3037000499(0xffffffff4afb0ccd, double:NaN)
            int r8 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r8 <= 0) goto L85
            r4 = 1
            goto L86
        L85:
            r4 = 0
        L86:
            r8 = 3037000499(0xb504f333, double:1.500477613E-314)
            int r5 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r5 <= 0) goto L91
            r5 = 1
            goto L92
        L91:
            r5 = 0
        L92:
            r4 = r4 | r5
            if (r4 == 0) goto L96
            return r2
        L96:
            long r10 = r10 * r10
            goto L69
        L99:
            long r10 = saturatedMultiply(r6, r10)
            return r10
        L9e:
            return r6
    }

    @com.google.common.annotations.Beta
    public static long saturatedSubtract(long r7, long r9) {
            long r0 = r7 - r9
            long r9 = r9 ^ r7
            r2 = 1
            r3 = 0
            r4 = 0
            int r6 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r6 < 0) goto Ld
            r9 = 1
            goto Le
        Ld:
            r9 = 0
        Le:
            long r7 = r7 ^ r0
            int r10 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r10 < 0) goto L14
            goto L15
        L14:
            r2 = 0
        L15:
            r7 = r9 | r2
            if (r7 == 0) goto L1a
            return r0
        L1a:
            r7 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r9 = 63
            long r9 = r0 >>> r9
            r0 = 1
            long r9 = r9 ^ r0
            long r9 = r9 + r7
            return r9
    }

    @com.google.common.annotations.GwtIncompatible
    public static long sqrt(long r9, java.math.RoundingMode r11) {
            java.lang.String r0 = "x"
            com.google.common.math.MathPreconditions.checkNonNegative(r0, r9)
            int r0 = (int) r9
            long r1 = (long) r0
            r3 = 1
            r4 = 0
            int r5 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r5 != 0) goto L10
            r1 = 1
            goto L11
        L10:
            r1 = 0
        L11:
            if (r1 == 0) goto L19
            int r9 = com.google.common.math.IntMath.sqrt(r0, r11)
            long r9 = (long) r9
            return r9
        L19:
            double r0 = (double) r9
            double r0 = java.lang.Math.sqrt(r0)
            long r0 = (long) r0
            long r5 = r0 * r0
            int[] r2 = com.google.common.math.LongMath.AnonymousClass1.$SwitchMap$java$math$RoundingMode
            int r11 = r11.ordinal()
            r11 = r2[r11]
            r7 = 1
            switch(r11) {
                case 1: goto L52;
                case 2: goto L4c;
                case 3: goto L4c;
                case 4: goto L46;
                case 5: goto L46;
                case 6: goto L34;
                case 7: goto L34;
                case 8: goto L34;
                default: goto L2e;
            }
        L2e:
            java.lang.AssertionError r9 = new java.lang.AssertionError
            r9.<init>()
            throw r9
        L34:
            int r11 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r11 >= 0) goto L39
            goto L3a
        L39:
            r3 = 0
        L3a:
            long r2 = (long) r3
            long r0 = r0 - r2
            long r2 = r0 * r0
            long r2 = r2 + r0
            int r9 = lessThanBranchFree(r2, r9)
            long r9 = (long) r9
            long r0 = r0 + r9
            return r0
        L46:
            int r11 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r11 <= 0) goto L4b
            long r0 = r0 + r7
        L4b:
            return r0
        L4c:
            int r11 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r11 >= 0) goto L51
            long r0 = r0 - r7
        L51:
            return r0
        L52:
            int r11 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r11 != 0) goto L57
            goto L58
        L57:
            r3 = 0
        L58:
            com.google.common.math.MathPreconditions.checkRoundingUnnecessary(r3)
            return r0
    }
}
