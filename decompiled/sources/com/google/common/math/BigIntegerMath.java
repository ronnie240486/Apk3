package com.google.common.math;

/* JADX INFO: loaded from: classes2.dex */
@com.google.common.math.ElementTypesAreNonnullByDefault
@com.google.common.annotations.GwtCompatible(emulated = true)
public final class BigIntegerMath {
    private static final double LN_10 = 0.0d;
    private static final double LN_2 = 0.0d;

    @com.google.common.annotations.VisibleForTesting
    public static final java.math.BigInteger SQRT2_PRECOMPUTED_BITS = null;

    /* JADX INFO: renamed from: com.google.common.math.BigIntegerMath$1, reason: invalid class name */
    /* JADX INFO: loaded from: classes3.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$java$math$RoundingMode = null;

        static {
                java.math.RoundingMode[] r0 = java.math.RoundingMode.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.google.common.math.BigIntegerMath.AnonymousClass1.$SwitchMap$java$math$RoundingMode = r0
                java.math.RoundingMode r1 = java.math.RoundingMode.UNNECESSARY     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = com.google.common.math.BigIntegerMath.AnonymousClass1.$SwitchMap$java$math$RoundingMode     // Catch: java.lang.NoSuchFieldError -> L1d
                java.math.RoundingMode r1 = java.math.RoundingMode.DOWN     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = com.google.common.math.BigIntegerMath.AnonymousClass1.$SwitchMap$java$math$RoundingMode     // Catch: java.lang.NoSuchFieldError -> L28
                java.math.RoundingMode r1 = java.math.RoundingMode.FLOOR     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = com.google.common.math.BigIntegerMath.AnonymousClass1.$SwitchMap$java$math$RoundingMode     // Catch: java.lang.NoSuchFieldError -> L33
                java.math.RoundingMode r1 = java.math.RoundingMode.UP     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                int[] r0 = com.google.common.math.BigIntegerMath.AnonymousClass1.$SwitchMap$java$math$RoundingMode     // Catch: java.lang.NoSuchFieldError -> L3e
                java.math.RoundingMode r1 = java.math.RoundingMode.CEILING     // Catch: java.lang.NoSuchFieldError -> L3e
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3e
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3e
            L3e:
                int[] r0 = com.google.common.math.BigIntegerMath.AnonymousClass1.$SwitchMap$java$math$RoundingMode     // Catch: java.lang.NoSuchFieldError -> L49
                java.math.RoundingMode r1 = java.math.RoundingMode.HALF_DOWN     // Catch: java.lang.NoSuchFieldError -> L49
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L49
                r2 = 6
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L49
            L49:
                int[] r0 = com.google.common.math.BigIntegerMath.AnonymousClass1.$SwitchMap$java$math$RoundingMode     // Catch: java.lang.NoSuchFieldError -> L54
                java.math.RoundingMode r1 = java.math.RoundingMode.HALF_UP     // Catch: java.lang.NoSuchFieldError -> L54
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L54
                r2 = 7
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L54
            L54:
                int[] r0 = com.google.common.math.BigIntegerMath.AnonymousClass1.$SwitchMap$java$math$RoundingMode     // Catch: java.lang.NoSuchFieldError -> L60
                java.math.RoundingMode r1 = java.math.RoundingMode.HALF_EVEN     // Catch: java.lang.NoSuchFieldError -> L60
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L60
                r2 = 8
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L60
            L60:
                return
        }
    }

    @com.google.common.annotations.GwtIncompatible
    public static class BigIntegerToDoubleRounder extends com.google.common.math.ToDoubleRounder<java.math.BigInteger> {
        public static final com.google.common.math.BigIntegerMath.BigIntegerToDoubleRounder INSTANCE = null;

        static {
                com.google.common.math.BigIntegerMath$BigIntegerToDoubleRounder r0 = new com.google.common.math.BigIntegerMath$BigIntegerToDoubleRounder
                r0.<init>()
                com.google.common.math.BigIntegerMath.BigIntegerToDoubleRounder.INSTANCE = r0
                return
        }

        private BigIntegerToDoubleRounder() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.google.common.math.ToDoubleRounder
        public final java.lang.Number minus(java.lang.Number r1, java.lang.Number r2) {
                r0 = this;
                java.math.BigInteger r1 = (java.math.BigInteger) r1
                java.math.BigInteger r2 = (java.math.BigInteger) r2
                java.math.BigInteger r1 = r1.subtract(r2)
                return r1
        }

        @Override // com.google.common.math.ToDoubleRounder
        public final double roundToDoubleArbitrarily(java.lang.Number r3) {
                r2 = this;
                java.math.BigInteger r3 = (java.math.BigInteger) r3
                double r0 = com.google.common.math.DoubleUtils.bigToDouble(r3)
                return r0
        }

        @Override // com.google.common.math.ToDoubleRounder
        public final int sign(java.lang.Number r1) {
                r0 = this;
                java.math.BigInteger r1 = (java.math.BigInteger) r1
                int r1 = r1.signum()
                return r1
        }

        @Override // com.google.common.math.ToDoubleRounder
        public final java.lang.Number toX(double r1, java.math.RoundingMode r3) {
                r0 = this;
                java.math.BigInteger r1 = com.google.common.math.DoubleMath.roundToBigInteger(r1, r3)
                return r1
        }
    }

    static {
            java.math.BigInteger r0 = new java.math.BigInteger
            java.lang.String r1 = "16a09e667f3bcc908b2fb1366ea957d3e3adec17512775099da2f590b0667322a"
            r2 = 16
            r0.<init>(r1, r2)
            com.google.common.math.BigIntegerMath.SQRT2_PRECOMPUTED_BITS = r0
            r0 = 4621819117588971520(0x4024000000000000, double:10.0)
            double r0 = java.lang.Math.log(r0)
            com.google.common.math.BigIntegerMath.LN_10 = r0
            r0 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r0 = java.lang.Math.log(r0)
            com.google.common.math.BigIntegerMath.LN_2 = r0
            return
    }

    private BigIntegerMath() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.math.BigInteger binomial(int r10, int r11) {
            java.lang.String r0 = "n"
            com.google.common.math.MathPreconditions.checkNonNegative(r0, r10)
            java.lang.String r0 = "k"
            com.google.common.math.MathPreconditions.checkNonNegative(r0, r11)
            r0 = 1
            if (r11 > r10) goto Lf
            r1 = 1
            goto L10
        Lf:
            r1 = 0
        L10:
            java.lang.String r2 = "k (%s) > n (%s)"
            com.google.common.base.Preconditions.checkArgument(r1, r2, r11, r10)
            int r1 = r10 >> 1
            if (r11 <= r1) goto L1b
            int r11 = r10 - r11
        L1b:
            int[] r1 = com.google.common.math.LongMath.biggestBinomials
            r2 = 34
            if (r11 >= r2) goto L2e
            r1 = r1[r11]
            if (r10 > r1) goto L2e
            long r10 = com.google.common.math.LongMath.binomial(r10, r11)
            java.math.BigInteger r10 = java.math.BigInteger.valueOf(r10)
            return r10
        L2e:
            java.math.BigInteger r1 = java.math.BigInteger.ONE
            long r2 = (long) r10
            r4 = 1
            java.math.RoundingMode r6 = java.math.RoundingMode.CEILING
            int r6 = com.google.common.math.LongMath.log2(r2, r6)
        L39:
            r7 = r6
        L3a:
            if (r0 >= r11) goto L5f
            int r8 = r10 - r0
            int r0 = r0 + 1
            int r7 = r7 + r6
            r9 = 63
            if (r7 < r9) goto L58
            java.math.BigInteger r2 = java.math.BigInteger.valueOf(r2)
            java.math.BigInteger r1 = r1.multiply(r2)
            java.math.BigInteger r2 = java.math.BigInteger.valueOf(r4)
            java.math.BigInteger r1 = r1.divide(r2)
            long r2 = (long) r8
            long r4 = (long) r0
            goto L39
        L58:
            long r8 = (long) r8
            long r2 = r2 * r8
            long r8 = (long) r0
            long r4 = r4 * r8
            goto L3a
        L5f:
            java.math.BigInteger r10 = java.math.BigInteger.valueOf(r2)
            java.math.BigInteger r10 = r1.multiply(r10)
            java.math.BigInteger r11 = java.math.BigInteger.valueOf(r4)
            java.math.BigInteger r10 = r10.divide(r11)
            return r10
    }

    @com.google.common.annotations.Beta
    public static java.math.BigInteger ceilingPowerOfTwo(java.math.BigInteger r2) {
            java.math.BigInteger r0 = java.math.BigInteger.ZERO
            java.math.RoundingMode r1 = java.math.RoundingMode.CEILING
            int r2 = log2(r2, r1)
            java.math.BigInteger r2 = r0.setBit(r2)
            return r2
    }

    @com.google.common.annotations.GwtIncompatible
    public static java.math.BigInteger divide(java.math.BigInteger r1, java.math.BigInteger r2, java.math.RoundingMode r3) {
            java.math.BigDecimal r0 = new java.math.BigDecimal
            r0.<init>(r1)
            java.math.BigDecimal r1 = new java.math.BigDecimal
            r1.<init>(r2)
            r2 = 0
            java.math.BigDecimal r1 = r0.divide(r1, r2, r3)
            java.math.BigInteger r1 = r1.toBigIntegerExact()
            return r1
    }

    public static java.math.BigInteger factorial(int r19) {
            r0 = r19
            java.lang.String r1 = "n"
            com.google.common.math.MathPreconditions.checkNonNegative(r1, r0)
            long[] r1 = com.google.common.math.LongMath.factorials
            r2 = 21
            if (r0 >= r2) goto L14
            r0 = r1[r0]
            java.math.BigInteger r0 = java.math.BigInteger.valueOf(r0)
            return r0
        L14:
            java.math.RoundingMode r3 = java.math.RoundingMode.CEILING
            int r3 = com.google.common.math.IntMath.log2(r0, r3)
            int r3 = r3 * r0
            java.math.RoundingMode r4 = java.math.RoundingMode.CEILING
            r5 = 64
            int r3 = com.google.common.math.IntMath.divide(r3, r5, r4)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r3)
            r3 = 20
            r6 = r1[r3]
            int r1 = java.lang.Long.numberOfTrailingZeros(r6)
            long r6 = r6 >> r1
            java.math.RoundingMode r3 = java.math.RoundingMode.FLOOR
            int r3 = com.google.common.math.LongMath.log2(r6, r3)
            r8 = 1
            int r3 = r3 + r8
            long r9 = (long) r2
            java.math.RoundingMode r2 = java.math.RoundingMode.FLOOR
            int r2 = com.google.common.math.LongMath.log2(r9, r2)
            int r2 = r2 + r8
            int r11 = r2 + (-1)
            int r11 = r8 << r11
        L46:
            long r12 = (long) r0
            r14 = 1
            int r16 = (r9 > r12 ? 1 : (r9 == r12 ? 0 : -1))
            if (r16 > 0) goto L78
            long r12 = (long) r11
            long r12 = r12 & r9
            r16 = 0
            int r18 = (r12 > r16 ? 1 : (r12 == r16 ? 0 : -1))
            if (r18 == 0) goto L59
            int r11 = r11 << 1
            int r2 = r2 + 1
        L59:
            int r12 = java.lang.Long.numberOfTrailingZeros(r9)
            long r16 = r9 >> r12
            int r1 = r1 + r12
            int r12 = r2 - r12
            int r12 = r12 + r3
            if (r12 < r5) goto L6d
            java.math.BigInteger r3 = java.math.BigInteger.valueOf(r6)
            r4.add(r3)
            r6 = r14
        L6d:
            long r6 = r6 * r16
            java.math.RoundingMode r3 = java.math.RoundingMode.FLOOR
            int r3 = com.google.common.math.LongMath.log2(r6, r3)
            int r3 = r3 + r8
            long r9 = r9 + r14
            goto L46
        L78:
            int r0 = (r6 > r14 ? 1 : (r6 == r14 ? 0 : -1))
            if (r0 <= 0) goto L83
            java.math.BigInteger r0 = java.math.BigInteger.valueOf(r6)
            r4.add(r0)
        L83:
            int r0 = r4.size()
            r2 = 0
            java.math.BigInteger r0 = listProduct(r4, r2, r0)
            java.math.BigInteger r0 = r0.shiftLeft(r1)
            return r0
    }

    @com.google.common.annotations.Beta
    public static java.math.BigInteger floorPowerOfTwo(java.math.BigInteger r2) {
            java.math.BigInteger r0 = java.math.BigInteger.ZERO
            java.math.RoundingMode r1 = java.math.RoundingMode.FLOOR
            int r2 = log2(r2, r1)
            java.math.BigInteger r2 = r0.setBit(r2)
            return r2
    }

    public static boolean isPowerOfTwo(java.math.BigInteger r2) {
            com.google.common.base.Preconditions.checkNotNull(r2)
            int r0 = r2.signum()
            r1 = 1
            if (r0 <= 0) goto L16
            int r0 = r2.getLowestSetBit()
            int r2 = r2.bitLength()
            int r2 = r2 - r1
            if (r0 != r2) goto L16
            goto L17
        L16:
            r1 = 0
        L17:
            return r1
    }

    public static java.math.BigInteger listProduct(java.util.List<java.math.BigInteger> r4, int r5, int r6) {
            int r0 = r6 - r5
            if (r0 == 0) goto L54
            r1 = 1
            if (r0 == r1) goto L4d
            r2 = 2
            if (r0 == r2) goto L3b
            r3 = 3
            if (r0 == r3) goto L1d
            int r0 = r6 + r5
            int r0 = r0 >>> r1
            java.math.BigInteger r5 = listProduct(r4, r5, r0)
            java.math.BigInteger r4 = listProduct(r4, r0, r6)
            java.math.BigInteger r4 = r5.multiply(r4)
            return r4
        L1d:
            java.lang.Object r6 = r4.get(r5)
            java.math.BigInteger r6 = (java.math.BigInteger) r6
            int r0 = r5 + 1
            java.lang.Object r0 = r4.get(r0)
            java.math.BigInteger r0 = (java.math.BigInteger) r0
            java.math.BigInteger r6 = r6.multiply(r0)
            int r5 = r5 + r2
            java.lang.Object r4 = r4.get(r5)
            java.math.BigInteger r4 = (java.math.BigInteger) r4
            java.math.BigInteger r4 = r6.multiply(r4)
            return r4
        L3b:
            java.lang.Object r6 = r4.get(r5)
            java.math.BigInteger r6 = (java.math.BigInteger) r6
            int r5 = r5 + r1
            java.lang.Object r4 = r4.get(r5)
            java.math.BigInteger r4 = (java.math.BigInteger) r4
            java.math.BigInteger r4 = r6.multiply(r4)
            return r4
        L4d:
            java.lang.Object r4 = r4.get(r5)
            java.math.BigInteger r4 = (java.math.BigInteger) r4
            return r4
        L54:
            java.math.BigInteger r4 = java.math.BigInteger.ONE
            return r4
    }

    @com.google.common.annotations.GwtIncompatible
    public static int log10(java.math.BigInteger r9, java.math.RoundingMode r10) {
            com.google.common.math.MathPreconditions.checkPositive(r9)
            int r0 = r9.bitLength()
            r1 = 0
            r2 = 1
            r3 = 63
            if (r0 > r3) goto Lf
            r0 = 1
            goto L10
        Lf:
            r0 = 0
        L10:
            if (r0 == 0) goto L1b
            long r0 = r9.longValue()
            int r9 = com.google.common.math.LongMath.log10(r0, r10)
            return r9
        L1b:
            java.math.RoundingMode r0 = java.math.RoundingMode.FLOOR
            int r0 = log2(r9, r0)
            double r3 = (double) r0
            double r5 = com.google.common.math.BigIntegerMath.LN_2
            double r3 = r3 * r5
            double r5 = com.google.common.math.BigIntegerMath.LN_10
            double r3 = r3 / r5
            int r0 = (int) r3
            java.math.BigInteger r3 = java.math.BigInteger.TEN
            java.math.BigInteger r3 = r3.pow(r0)
            int r4 = r3.compareTo(r9)
            if (r4 <= 0) goto L45
        L36:
            int r0 = r0 + (-1)
            java.math.BigInteger r4 = java.math.BigInteger.TEN
            java.math.BigInteger r3 = r3.divide(r4)
            int r4 = r3.compareTo(r9)
            if (r4 > 0) goto L36
            goto L6a
        L45:
            java.math.BigInteger r5 = java.math.BigInteger.TEN
            java.math.BigInteger r5 = r5.multiply(r3)
            int r6 = r5.compareTo(r9)
            r7 = r4
            r4 = r3
            r3 = r5
            r5 = r7
        L53:
            if (r6 > 0) goto L68
            int r0 = r0 + 1
            java.math.BigInteger r4 = java.math.BigInteger.TEN
            java.math.BigInteger r4 = r4.multiply(r3)
            int r5 = r4.compareTo(r9)
            r7 = r4
            r4 = r3
            r3 = r7
            r8 = r6
            r6 = r5
            r5 = r8
            goto L53
        L68:
            r3 = r4
            r4 = r5
        L6a:
            int[] r5 = com.google.common.math.BigIntegerMath.AnonymousClass1.$SwitchMap$java$math$RoundingMode
            int r10 = r10.ordinal()
            r10 = r5[r10]
            switch(r10) {
                case 1: goto L9e;
                case 2: goto La4;
                case 3: goto La4;
                case 4: goto L94;
                case 5: goto L94;
                case 6: goto L7b;
                case 7: goto L7b;
                case 8: goto L7b;
                default: goto L75;
            }
        L75:
            java.lang.AssertionError r9 = new java.lang.AssertionError
            r9.<init>()
            throw r9
        L7b:
            r10 = 2
            java.math.BigInteger r9 = r9.pow(r10)
            java.math.BigInteger r10 = r3.pow(r10)
            java.math.BigInteger r1 = java.math.BigInteger.TEN
            java.math.BigInteger r10 = r10.multiply(r1)
            int r9 = r9.compareTo(r10)
            if (r9 > 0) goto L91
            goto L93
        L91:
            int r0 = r0 + 1
        L93:
            return r0
        L94:
            boolean r9 = r3.equals(r9)
            if (r9 == 0) goto L9b
            goto L9d
        L9b:
            int r0 = r0 + 1
        L9d:
            return r0
        L9e:
            if (r4 != 0) goto La1
            r1 = 1
        La1:
            com.google.common.math.MathPreconditions.checkRoundingUnnecessary(r1)
        La4:
            return r0
    }

    public static int log2(java.math.BigInteger r2, java.math.RoundingMode r3) {
            java.lang.Object r0 = com.google.common.base.Preconditions.checkNotNull(r2)
            java.math.BigInteger r0 = (java.math.BigInteger) r0
            com.google.common.math.MathPreconditions.checkPositive(r0)
            int r0 = r2.bitLength()
            int r0 = r0 + (-1)
            int[] r1 = com.google.common.math.BigIntegerMath.AnonymousClass1.$SwitchMap$java$math$RoundingMode
            int r3 = r3.ordinal()
            r3 = r1[r3]
            switch(r3) {
                case 1: goto L55;
                case 2: goto L5c;
                case 3: goto L5c;
                case 4: goto L4b;
                case 5: goto L4b;
                case 6: goto L20;
                case 7: goto L20;
                case 8: goto L20;
                default: goto L1a;
            }
        L1a:
            java.lang.AssertionError r2 = new java.lang.AssertionError
            r2.<init>()
            throw r2
        L20:
            r3 = 256(0x100, float:3.59E-43)
            if (r0 >= r3) goto L36
            java.math.BigInteger r3 = com.google.common.math.BigIntegerMath.SQRT2_PRECOMPUTED_BITS
            int r1 = 256 - r0
            java.math.BigInteger r3 = r3.shiftRight(r1)
            int r2 = r2.compareTo(r3)
            if (r2 > 0) goto L33
            return r0
        L33:
            int r0 = r0 + 1
            return r0
        L36:
            r3 = 2
            java.math.BigInteger r2 = r2.pow(r3)
            int r2 = r2.bitLength()
            int r2 = r2 + (-1)
            int r3 = r0 * 2
            int r3 = r3 + 1
            if (r2 >= r3) goto L48
            goto L4a
        L48:
            int r0 = r0 + 1
        L4a:
            return r0
        L4b:
            boolean r2 = isPowerOfTwo(r2)
            if (r2 == 0) goto L52
            goto L54
        L52:
            int r0 = r0 + 1
        L54:
            return r0
        L55:
            boolean r2 = isPowerOfTwo(r2)
            com.google.common.math.MathPreconditions.checkRoundingUnnecessary(r2)
        L5c:
            return r0
    }

    @com.google.common.annotations.GwtIncompatible
    public static double roundToDouble(java.math.BigInteger r1, java.math.RoundingMode r2) {
            com.google.common.math.BigIntegerMath$BigIntegerToDoubleRounder r0 = com.google.common.math.BigIntegerMath.BigIntegerToDoubleRounder.INSTANCE
            double r1 = r0.roundToDouble(r1, r2)
            return r1
    }

    @com.google.common.annotations.GwtIncompatible
    public static java.math.BigInteger sqrt(java.math.BigInteger r4, java.math.RoundingMode r5) {
            int r0 = r4.signum()
            if (r0 < 0) goto L7b
            int r0 = r4.bitLength()
            r1 = 63
            r2 = 1
            if (r0 > r1) goto L11
            r0 = 1
            goto L12
        L11:
            r0 = 0
        L12:
            if (r0 == 0) goto L21
            long r0 = r4.longValue()
            long r4 = com.google.common.math.LongMath.sqrt(r0, r5)
            java.math.BigInteger r4 = java.math.BigInteger.valueOf(r4)
            return r4
        L21:
            java.math.BigInteger r0 = sqrtFloor(r4)
            int[] r1 = com.google.common.math.BigIntegerMath.AnonymousClass1.$SwitchMap$java$math$RoundingMode
            int r5 = r5.ordinal()
            r5 = r1[r5]
            r1 = 2
            switch(r5) {
                case 1: goto L6f;
                case 2: goto L7a;
                case 3: goto L7a;
                case 4: goto L4d;
                case 5: goto L4d;
                case 6: goto L37;
                case 7: goto L37;
                case 8: goto L37;
                default: goto L31;
            }
        L31:
            java.lang.AssertionError r4 = new java.lang.AssertionError
            r4.<init>()
            throw r4
        L37:
            java.math.BigInteger r5 = r0.pow(r1)
            java.math.BigInteger r5 = r5.add(r0)
            int r4 = r5.compareTo(r4)
            if (r4 < 0) goto L46
            goto L4c
        L46:
            java.math.BigInteger r4 = java.math.BigInteger.ONE
            java.math.BigInteger r0 = r0.add(r4)
        L4c:
            return r0
        L4d:
            int r5 = r0.intValue()
            int r5 = r5 * r5
            int r3 = r4.intValue()
            if (r5 != r3) goto L64
            java.math.BigInteger r5 = r0.pow(r1)
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L64
            goto L65
        L64:
            r2 = 0
        L65:
            if (r2 == 0) goto L68
            goto L6e
        L68:
            java.math.BigInteger r4 = java.math.BigInteger.ONE
            java.math.BigInteger r0 = r0.add(r4)
        L6e:
            return r0
        L6f:
            java.math.BigInteger r5 = r0.pow(r1)
            boolean r4 = r5.equals(r4)
            com.google.common.math.MathPreconditions.checkRoundingUnnecessary(r4)
        L7a:
            return r0
        L7b:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.String r0 = "x"
            int r1 = r0.length()
            int r1 = r1 + 16
            int r2 = r4.length()
            int r2 = r2 + r1
            java.lang.String r1 = " ("
            java.lang.String r3 = ") must be >= 0"
            java.lang.String r4 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r2, r0, r1, r4, r3)
            r5.<init>(r4)
            throw r5
    }

    @com.google.common.annotations.GwtIncompatible
    private static java.math.BigInteger sqrtApproxWithDoubles(java.math.BigInteger r2) {
            double r0 = com.google.common.math.DoubleUtils.bigToDouble(r2)
            double r0 = java.lang.Math.sqrt(r0)
            java.math.RoundingMode r2 = java.math.RoundingMode.HALF_EVEN
            java.math.BigInteger r2 = com.google.common.math.DoubleMath.roundToBigInteger(r0, r2)
            return r2
    }

    @com.google.common.annotations.GwtIncompatible
    private static java.math.BigInteger sqrtFloor(java.math.BigInteger r4) {
            java.math.RoundingMode r0 = java.math.RoundingMode.FLOOR
            int r0 = log2(r4, r0)
            r1 = 1
            r2 = 1023(0x3ff, float:1.434E-42)
            if (r0 >= r2) goto L10
            java.math.BigInteger r0 = sqrtApproxWithDoubles(r4)
            goto L21
        L10:
            int r0 = r0 + (-52)
            r0 = r0 & (-2)
            java.math.BigInteger r2 = r4.shiftRight(r0)
            java.math.BigInteger r2 = sqrtApproxWithDoubles(r2)
            int r0 = r0 >> r1
            java.math.BigInteger r0 = r2.shiftLeft(r0)
        L21:
            java.math.BigInteger r2 = r4.divide(r0)
            java.math.BigInteger r2 = r0.add(r2)
            java.math.BigInteger r2 = r2.shiftRight(r1)
            boolean r3 = r0.equals(r2)
            if (r3 == 0) goto L34
            return r0
        L34:
            java.math.BigInteger r0 = r4.divide(r2)
            java.math.BigInteger r0 = r2.add(r0)
            java.math.BigInteger r0 = r0.shiftRight(r1)
            int r3 = r0.compareTo(r2)
            if (r3 < 0) goto L47
            return r2
        L47:
            r2 = r0
            goto L34
    }
}
