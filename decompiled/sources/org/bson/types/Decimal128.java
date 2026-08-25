package org.bson.types;

/* JADX INFO: loaded from: classes3.dex */
public final class Decimal128 extends java.lang.Number implements java.lang.Comparable<org.bson.types.Decimal128> {
    private static final java.math.BigInteger BIG_INT_ONE = null;
    private static final java.math.BigInteger BIG_INT_TEN = null;
    private static final java.math.BigInteger BIG_INT_ZERO = null;
    private static final int EXPONENT_OFFSET = 6176;
    private static final long INFINITY_MASK = 8646911284551352320L;
    private static final int MAX_BIT_LENGTH = 113;
    private static final int MAX_EXPONENT = 6111;
    private static final int MIN_EXPONENT = -6176;
    public static final org.bson.types.Decimal128 NEGATIVE_INFINITY = null;
    private static final java.util.Set<java.lang.String> NEGATIVE_INFINITY_STRINGS = null;
    public static final org.bson.types.Decimal128 NEGATIVE_NaN = null;
    private static final java.util.Set<java.lang.String> NEGATIVE_NaN_STRINGS = null;
    public static final org.bson.types.Decimal128 NEGATIVE_ZERO = null;
    public static final org.bson.types.Decimal128 NaN = null;
    private static final long NaN_MASK = 8935141660703064064L;
    private static final java.util.Set<java.lang.String> NaN_STRINGS = null;
    public static final org.bson.types.Decimal128 POSITIVE_INFINITY = null;
    private static final java.util.Set<java.lang.String> POSITIVE_INFINITY_STRINGS = null;
    public static final org.bson.types.Decimal128 POSITIVE_ZERO = null;
    private static final long SIGN_BIT_MASK = Long.MIN_VALUE;
    private static final long serialVersionUID = 4570973266503637887L;
    private final long high;
    private final long low;

    static {
            java.math.BigInteger r0 = new java.math.BigInteger
            java.lang.String r1 = "10"
            r0.<init>(r1)
            org.bson.types.Decimal128.BIG_INT_TEN = r0
            java.math.BigInteger r0 = new java.math.BigInteger
            java.lang.String r1 = "1"
            r0.<init>(r1)
            org.bson.types.Decimal128.BIG_INT_ONE = r0
            java.math.BigInteger r0 = new java.math.BigInteger
            java.lang.String r1 = "0"
            r0.<init>(r1)
            org.bson.types.Decimal128.BIG_INT_ZERO = r0
            java.util.HashSet r0 = new java.util.HashSet
            java.lang.String r1 = "nan"
            java.util.List r1 = java.util.Collections.singletonList(r1)
            r0.<init>(r1)
            org.bson.types.Decimal128.NaN_STRINGS = r0
            java.util.HashSet r0 = new java.util.HashSet
            java.lang.String r1 = "-nan"
            java.util.List r1 = java.util.Collections.singletonList(r1)
            r0.<init>(r1)
            org.bson.types.Decimal128.NEGATIVE_NaN_STRINGS = r0
            java.util.HashSet r0 = new java.util.HashSet
            java.lang.String r1 = "inf"
            java.lang.String r2 = "+inf"
            java.lang.String r3 = "infinity"
            java.lang.String r4 = "+infinity"
            java.lang.String[] r1 = new java.lang.String[]{r1, r2, r3, r4}
            java.util.List r1 = java.util.Arrays.asList(r1)
            r0.<init>(r1)
            org.bson.types.Decimal128.POSITIVE_INFINITY_STRINGS = r0
            java.util.HashSet r0 = new java.util.HashSet
            java.lang.String r1 = "-inf"
            java.lang.String r2 = "-infinity"
            java.lang.String[] r1 = new java.lang.String[]{r1, r2}
            java.util.List r1 = java.util.Arrays.asList(r1)
            r0.<init>(r1)
            org.bson.types.Decimal128.NEGATIVE_INFINITY_STRINGS = r0
            r0 = 8646911284551352320(0x7800000000000000, double:1.0565890622713305E270)
            r2 = 0
            org.bson.types.Decimal128 r0 = fromIEEE754BIDEncoding(r0, r2)
            org.bson.types.Decimal128.POSITIVE_INFINITY = r0
            r0 = -576460752303423488(0xf800000000000000, double:-1.0565890622713305E270)
            org.bson.types.Decimal128 r0 = fromIEEE754BIDEncoding(r0, r2)
            org.bson.types.Decimal128.NEGATIVE_INFINITY = r0
            r0 = -288230376151711744(0xfc00000000000000, double:-1.94906280228E289)
            org.bson.types.Decimal128 r0 = fromIEEE754BIDEncoding(r0, r2)
            org.bson.types.Decimal128.NEGATIVE_NaN = r0
            r0 = 8935141660703064064(0x7c00000000000000, double:1.94906280228E289)
            org.bson.types.Decimal128 r0 = fromIEEE754BIDEncoding(r0, r2)
            org.bson.types.Decimal128.NaN = r0
            r0 = 3476778912330022912(0x3040000000000000, double:2.7635739376302223E-76)
            org.bson.types.Decimal128 r0 = fromIEEE754BIDEncoding(r0, r2)
            org.bson.types.Decimal128.POSITIVE_ZERO = r0
            r0 = -5746593124524752896(0xb040000000000000, double:-2.7635739376302223E-76)
            org.bson.types.Decimal128 r0 = fromIEEE754BIDEncoding(r0, r2)
            org.bson.types.Decimal128.NEGATIVE_ZERO = r0
            return
    }

    public Decimal128(long r3) {
            r2 = this;
            java.math.BigDecimal r0 = new java.math.BigDecimal
            java.math.MathContext r1 = java.math.MathContext.DECIMAL128
            r0.<init>(r3, r1)
            r2.<init>(r0)
            return
    }

    private Decimal128(long r1, long r3) {
            r0 = this;
            r0.<init>()
            r0.high = r1
            r0.low = r3
            return
    }

    public Decimal128(java.math.BigDecimal r3) {
            r2 = this;
            int r0 = r3.signum()
            r1 = -1
            if (r0 != r1) goto L9
            r0 = 1
            goto La
        L9:
            r0 = 0
        La:
            r2.<init>(r3, r0)
            return
    }

    private Decimal128(java.math.BigDecimal r18, boolean r19) {
            r17 = this;
            r0 = r17
            r17.<init>()
            java.math.BigDecimal r1 = r17.clampAndRound(r18)
            int r2 = r1.scale()
            int r2 = -r2
            long r2 = (long) r2
            r4 = -6176(0xffffffffffffe7e0, double:NaN)
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 < 0) goto L8e
            r4 = 6111(0x17df, double:3.019E-320)
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 > 0) goto L8e
            java.math.BigInteger r4 = r1.unscaledValue()
            int r4 = r4.bitLength()
            r5 = 113(0x71, float:1.58E-43)
            if (r4 > r5) goto L77
            java.math.BigInteger r4 = r1.unscaledValue()
            java.math.BigInteger r4 = r4.abs()
            int r5 = r4.bitLength()
            r6 = 0
            r7 = 0
            r9 = r7
        L37:
            r11 = 64
            int r12 = java.lang.Math.min(r11, r5)
            r13 = 1
            if (r6 >= r12) goto L4d
            boolean r11 = r4.testBit(r6)
            if (r11 == 0) goto L4a
            long r11 = r13 << r6
            long r9 = r9 | r11
        L4a:
            int r6 = r6 + 1
            goto L37
        L4d:
            if (r11 >= r5) goto L5f
            boolean r6 = r4.testBit(r11)
            if (r6 == 0) goto L5c
            int r6 = r11 + (-64)
            long r15 = r13 << r6
            long r6 = r7 | r15
            r7 = r6
        L5c:
            int r11 = r11 + 1
            goto L4d
        L5f:
            r4 = 6176(0x1820, double:3.0513E-320)
            long r2 = r2 + r4
            r4 = 49
            long r2 = r2 << r4
            long r2 = r2 | r7
            int r1 = r1.signum()
            r4 = -1
            if (r1 == r4) goto L6f
            if (r19 == 0) goto L72
        L6f:
            r4 = -9223372036854775808
            long r2 = r2 | r4
        L72:
            r0.high = r2
            r0.low = r9
            return
        L77:
            java.lang.AssertionError r2 = new java.lang.AssertionError
            java.lang.String r3 = "Unscaled roundedValue is out of range for Decimal128 encoding:"
            java.lang.StringBuilder r3 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r3)
            java.math.BigInteger r1 = r1.unscaledValue()
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1)
            throw r2
        L8e:
            java.lang.AssertionError r1 = new java.lang.AssertionError
            java.lang.String r4 = "Exponent is out of range for Decimal128 encoding: "
            java.lang.String r2 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r4, r2)
            r1.<init>(r2)
            throw r1
    }

    private java.math.BigDecimal bigDecimalValueNoNegativeZeroCheck() {
            r5 = this;
            int r0 = r5.getExponent()
            int r0 = -r0
            boolean r1 = r5.twoHighestCombinationBitsAreSet()
            if (r1 == 0) goto L12
            r1 = 0
            java.math.BigDecimal r0 = java.math.BigDecimal.valueOf(r1, r0)
            return r0
        L12:
            java.math.BigDecimal r1 = new java.math.BigDecimal
            java.math.BigInteger r2 = new java.math.BigInteger
            boolean r3 = r5.isNegative()
            if (r3 == 0) goto L1e
            r3 = -1
            goto L1f
        L1e:
            r3 = 1
        L1f:
            byte[] r4 = r5.getBytes()
            r2.<init>(r3, r4)
            r1.<init>(r2, r0)
            return r1
    }

    private java.math.BigDecimal clampAndRound(java.math.BigDecimal r5) {
            r4 = this;
            int r0 = r5.scale()
            int r0 = -r0
            r1 = 6111(0x17df, float:8.563E-42)
            if (r0 <= r1) goto L61
            int r0 = r5.scale()
            int r0 = -r0
            int r0 = r0 - r1
            java.math.BigInteger r1 = r5.unscaledValue()
            java.math.BigInteger r2 = org.bson.types.Decimal128.BIG_INT_ZERO
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L28
            java.math.BigDecimal r0 = new java.math.BigDecimal
            java.math.BigInteger r5 = r5.unscaledValue()
            r1 = -6111(0xffffffffffffe821, float:NaN)
            r0.<init>(r5, r1)
            goto La6
        L28:
            int r1 = r5.precision()
            int r1 = r1 + r0
            r2 = 34
            if (r1 > r2) goto L4a
            java.math.BigInteger r1 = org.bson.types.Decimal128.BIG_INT_TEN
            java.math.BigInteger r1 = r1.pow(r0)
            java.math.BigDecimal r2 = new java.math.BigDecimal
            java.math.BigInteger r3 = r5.unscaledValue()
            java.math.BigInteger r1 = r3.multiply(r1)
            int r5 = r5.scale()
            int r5 = r5 + r0
            r2.<init>(r1, r5)
            goto L90
        L4a:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Exponent is out of range for Decimal128 encoding of "
            r1.append(r2)
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            r0.<init>(r5)
            throw r0
        L61:
            int r0 = r5.scale()
            int r0 = -r0
            r1 = -6176(0xffffffffffffe7e0, float:NaN)
            if (r0 >= r1) goto L92
            int r0 = r5.scale()
            int r0 = r0 + r1
            int r1 = r4.ensureExactRounding(r5, r0)
            if (r1 != 0) goto L78
            java.math.BigInteger r1 = org.bson.types.Decimal128.BIG_INT_ONE
            goto L7e
        L78:
            java.math.BigInteger r1 = org.bson.types.Decimal128.BIG_INT_TEN
            java.math.BigInteger r1 = r1.pow(r0)
        L7e:
            java.math.BigDecimal r2 = new java.math.BigDecimal
            java.math.BigInteger r3 = r5.unscaledValue()
            java.math.BigInteger r1 = r3.divide(r1)
            int r5 = r5.scale()
            int r5 = r5 - r0
            r2.<init>(r1, r5)
        L90:
            r0 = r2
            goto La6
        L92:
            java.math.MathContext r0 = java.math.MathContext.DECIMAL128
            java.math.BigDecimal r0 = r5.round(r0)
            int r1 = r5.precision()
            int r2 = r0.precision()
            int r1 = r1 - r2
            if (r1 <= 0) goto La6
            r4.ensureExactRounding(r5, r1)
        La6:
            return r0
    }

    private int ensureExactRounding(java.math.BigDecimal r5, int r6) {
            r4 = this;
            java.math.BigInteger r0 = r5.unscaledValue()
            java.math.BigInteger r0 = r0.abs()
            java.lang.String r0 = r0.toString()
            int r1 = r0.length()
            int r1 = r1 - r6
            r6 = 0
            int r6 = java.lang.Math.max(r6, r1)
            r1 = r6
        L17:
            int r2 = r0.length()
            if (r1 >= r2) goto L3f
            char r2 = r0.charAt(r1)
            r3 = 48
            if (r2 != r3) goto L28
            int r1 = r1 + 1
            goto L17
        L28:
            java.lang.NumberFormatException r6 = new java.lang.NumberFormatException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Conversion to Decimal128 would require inexact rounding of "
            r0.append(r1)
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            r6.<init>(r5)
            throw r6
        L3f:
            return r6
    }

    public static org.bson.types.Decimal128 fromIEEE754BIDEncoding(long r1, long r3) {
            org.bson.types.Decimal128 r0 = new org.bson.types.Decimal128
            r0.<init>(r1, r3)
            return r0
    }

    private byte[] getBytes() {
            r10 = this;
            r0 = 15
            byte[] r0 = new byte[r0]
            r1 = 14
            r2 = 255(0xff, double:1.26E-321)
            r4 = r2
        L9:
            r6 = 7
            r7 = 8
            if (r1 < r6) goto L1e
            long r8 = r10.low
            long r8 = r8 & r4
            int r6 = 14 - r1
            int r6 = r6 << 3
            long r8 = r8 >>> r6
            int r6 = (int) r8
            byte r6 = (byte) r6
            r0[r1] = r6
            long r4 = r4 << r7
            int r1 = r1 + (-1)
            goto L9
        L1e:
            r1 = 6
        L1f:
            r4 = 1
            if (r1 < r4) goto L32
            long r4 = r10.high
            long r4 = r4 & r2
            int r6 = 6 - r1
            int r6 = r6 << 3
            long r4 = r4 >>> r6
            int r5 = (int) r4
            byte r4 = (byte) r5
            r0[r1] = r4
            long r2 = r2 << r7
            int r1 = r1 + (-1)
            goto L1f
        L32:
            r1 = 281474976710656(0x1000000000000, double:1.390671161567E-309)
            r3 = 0
            long r4 = r10.high
            long r1 = r1 & r4
            r4 = 48
            long r1 = r1 >>> r4
            int r2 = (int) r1
            byte r1 = (byte) r2
            r0[r3] = r1
            return r0
    }

    private int getExponent() {
            r4 = this;
            boolean r0 = r4.twoHighestCombinationBitsAreSet()
            if (r0 == 0) goto L15
            long r0 = r4.high
            r2 = 2305807824841605120(0x1fffe00000000000, double:1.4858413175437912E-154)
            long r0 = r0 & r2
            r2 = 47
        L10:
            long r0 = r0 >>> r2
            int r1 = (int) r0
            int r1 = r1 + (-6176)
            return r1
        L15:
            long r0 = r4.high
            r2 = 9223231299366420480(0x7fff800000000000, double:NaN)
            long r0 = r0 & r2
            r2 = 49
            goto L10
    }

    private boolean hasDifferentSign(java.math.BigDecimal r2) {
            r1 = this;
            boolean r0 = r1.isNegative()
            if (r0 == 0) goto Le
            int r2 = r2.signum()
            if (r2 != 0) goto Le
            r2 = 1
            goto Lf
        Le:
            r2 = 0
        Lf:
            return r2
    }

    private boolean isZero(java.math.BigDecimal r2) {
            r1 = this;
            boolean r0 = r1.isNaN()
            if (r0 != 0) goto L16
            boolean r0 = r1.isInfinite()
            if (r0 != 0) goto L16
            java.math.BigDecimal r0 = java.math.BigDecimal.ZERO
            int r2 = r2.compareTo(r0)
            if (r2 != 0) goto L16
            r2 = 1
            goto L17
        L16:
            r2 = 0
        L17:
            return r2
    }

    public static org.bson.types.Decimal128 parse(java.lang.String r4) {
            java.lang.String r0 = r4.toLowerCase()
            java.util.Set<java.lang.String> r1 = org.bson.types.Decimal128.NaN_STRINGS
            boolean r1 = r1.contains(r0)
            if (r1 == 0) goto Lf
            org.bson.types.Decimal128 r4 = org.bson.types.Decimal128.NaN
            return r4
        Lf:
            java.util.Set<java.lang.String> r1 = org.bson.types.Decimal128.NEGATIVE_NaN_STRINGS
            boolean r1 = r1.contains(r0)
            if (r1 == 0) goto L1a
            org.bson.types.Decimal128 r4 = org.bson.types.Decimal128.NEGATIVE_NaN
            return r4
        L1a:
            java.util.Set<java.lang.String> r1 = org.bson.types.Decimal128.POSITIVE_INFINITY_STRINGS
            boolean r1 = r1.contains(r0)
            if (r1 == 0) goto L25
            org.bson.types.Decimal128 r4 = org.bson.types.Decimal128.POSITIVE_INFINITY
            return r4
        L25:
            java.util.Set<java.lang.String> r1 = org.bson.types.Decimal128.NEGATIVE_INFINITY_STRINGS
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L30
            org.bson.types.Decimal128 r4 = org.bson.types.Decimal128.NEGATIVE_INFINITY
            return r4
        L30:
            org.bson.types.Decimal128 r0 = new org.bson.types.Decimal128
            java.math.BigDecimal r1 = new java.math.BigDecimal
            r1.<init>(r4)
            r2 = 0
            char r4 = r4.charAt(r2)
            r3 = 45
            if (r4 != r3) goto L41
            r2 = 1
        L41:
            r0.<init>(r1, r2)
            return r0
    }

    private java.lang.String toStringWithBigDecimal() {
            r8 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.math.BigDecimal r1 = r8.bigDecimalValueNoNegativeZeroCheck()
            java.math.BigInteger r2 = r1.unscaledValue()
            java.math.BigInteger r2 = r2.abs()
            java.lang.String r2 = r2.toString()
            boolean r3 = r8.isNegative()
            if (r3 == 0) goto L20
            r3 = 45
            r0.append(r3)
        L20:
            int r1 = r1.scale()
            int r1 = -r1
            int r3 = r2.length()
            r4 = 1
            int r3 = r3 - r4
            int r3 = r3 + r1
            r5 = 46
            r6 = 0
            if (r1 > 0) goto L68
            r7 = -6
            if (r3 < r7) goto L68
            if (r1 != 0) goto L3a
            r0.append(r2)
            goto L8e
        L3a:
            int r3 = -r1
            int r4 = r2.length()
            int r3 = r3 - r4
            if (r3 < 0) goto L5b
            r1 = 48
            r0.append(r1)
            r0.append(r5)
            r4 = 0
        L4b:
            if (r4 >= r3) goto L53
            r0.append(r1)
            int r4 = r4 + 1
            goto L4b
        L53:
            int r1 = r2.length()
            r0.append(r2, r6, r1)
            goto L8e
        L5b:
            int r3 = -r3
            r0.append(r2, r6, r3)
            r0.append(r5)
            int r1 = r3 - r1
            r0.append(r2, r3, r1)
            goto L8e
        L68:
            char r1 = r2.charAt(r6)
            r0.append(r1)
            int r1 = r2.length()
            if (r1 <= r4) goto L7f
            r0.append(r5)
            int r1 = r2.length()
            r0.append(r2, r4, r1)
        L7f:
            r1 = 69
            r0.append(r1)
            if (r3 <= 0) goto L8b
            r1 = 43
            r0.append(r1)
        L8b:
            r0.append(r3)
        L8e:
            java.lang.String r0 = r0.toString()
            return r0
    }

    private boolean twoHighestCombinationBitsAreSet() {
            r5 = this;
            long r0 = r5.high
            r2 = 6917529027641081856(0x6000000000000000, double:2.6815615859885194E154)
            long r0 = r0 & r2
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto Lb
            r0 = 1
            goto Lc
        Lb:
            r0 = 0
        Lc:
            return r0
    }

    public java.math.BigDecimal bigDecimalValue() {
            r2 = this;
            boolean r0 = r2.isNaN()
            if (r0 != 0) goto L2e
            boolean r0 = r2.isInfinite()
            if (r0 != 0) goto L26
            java.math.BigDecimal r0 = r2.bigDecimalValueNoNegativeZeroCheck()
            boolean r1 = r2.isNegative()
            if (r1 == 0) goto L25
            int r1 = r0.signum()
            if (r1 == 0) goto L1d
            goto L25
        L1d:
            java.lang.ArithmeticException r0 = new java.lang.ArithmeticException
            java.lang.String r1 = "Negative zero can not be converted to a BigDecimal"
            r0.<init>(r1)
            throw r0
        L25:
            return r0
        L26:
            java.lang.ArithmeticException r0 = new java.lang.ArithmeticException
            java.lang.String r1 = "Infinity can not be converted to a BigDecimal"
            r0.<init>(r1)
            throw r0
        L2e:
            java.lang.ArithmeticException r0 = new java.lang.ArithmeticException
            java.lang.String r1 = "NaN can not be converted to a BigDecimal"
            r0.<init>(r1)
            throw r0
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(org.bson.types.Decimal128 r1) {
            r0 = this;
            org.bson.types.Decimal128 r1 = (org.bson.types.Decimal128) r1
            int r1 = r0.compareTo2(r1)
            return r1
    }

    /* JADX INFO: renamed from: compareTo, reason: avoid collision after fix types in other method */
    public int compareTo2(org.bson.types.Decimal128 r7) {
            r6 = this;
            boolean r0 = r6.isNaN()
            r1 = 1
            if (r0 == 0) goto Ld
            boolean r7 = r7.isNaN()
            r7 = r7 ^ r1
            return r7
        Ld:
            boolean r0 = r6.isInfinite()
            r2 = 0
            r3 = -1
            if (r0 == 0) goto L3e
            boolean r0 = r6.isNegative()
            if (r0 == 0) goto L29
            boolean r0 = r7.isInfinite()
            if (r0 == 0) goto L28
            boolean r7 = r7.isNegative()
            if (r7 == 0) goto L28
            return r2
        L28:
            return r3
        L29:
            boolean r0 = r7.isNaN()
            if (r0 == 0) goto L30
            return r3
        L30:
            boolean r0 = r7.isInfinite()
            if (r0 == 0) goto L3d
            boolean r7 = r7.isNegative()
            if (r7 != 0) goto L3d
            return r2
        L3d:
            return r1
        L3e:
            java.math.BigDecimal r0 = r6.bigDecimalValueNoNegativeZeroCheck()
            java.math.BigDecimal r4 = r7.bigDecimalValueNoNegativeZeroCheck()
            boolean r5 = r6.isZero(r0)
            if (r5 == 0) goto L67
            boolean r5 = r7.isZero(r4)
            if (r5 == 0) goto L67
            boolean r5 = r6.hasDifferentSign(r0)
            if (r5 == 0) goto L60
            boolean r7 = r7.hasDifferentSign(r4)
            if (r7 == 0) goto L5f
            return r2
        L5f:
            return r3
        L60:
            boolean r2 = r7.hasDifferentSign(r4)
            if (r2 == 0) goto L67
            return r1
        L67:
            boolean r2 = r7.isNaN()
            if (r2 == 0) goto L6e
            return r3
        L6e:
            boolean r2 = r7.isInfinite()
            if (r2 == 0) goto L7c
            boolean r7 = r7.isNegative()
            if (r7 == 0) goto L7b
            return r1
        L7b:
            return r3
        L7c:
            int r7 = r0.compareTo(r4)
            return r7
    }

    @Override // java.lang.Number
    public double doubleValue() {
            r2 = this;
            boolean r0 = r2.isNaN()
            if (r0 == 0) goto L9
            r0 = 9221120237041090560(0x7ff8000000000000, double:NaN)
            return r0
        L9:
            boolean r0 = r2.isInfinite()
            if (r0 == 0) goto L1b
            boolean r0 = r2.isNegative()
            if (r0 == 0) goto L18
            r0 = -4503599627370496(0xfff0000000000000, double:-Infinity)
            return r0
        L18:
            r0 = 9218868437227405312(0x7ff0000000000000, double:Infinity)
            return r0
        L1b:
            java.math.BigDecimal r0 = r2.bigDecimalValueNoNegativeZeroCheck()
            boolean r1 = r2.hasDifferentSign(r0)
            if (r1 == 0) goto L28
            r0 = -9223372036854775808
            return r0
        L28:
            double r0 = r0.doubleValue()
            return r0
    }

    public boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            r1 = 0
            if (r8 == 0) goto L25
            java.lang.Class<org.bson.types.Decimal128> r2 = org.bson.types.Decimal128.class
            java.lang.Class r3 = r8.getClass()
            if (r2 == r3) goto L10
            goto L25
        L10:
            org.bson.types.Decimal128 r8 = (org.bson.types.Decimal128) r8
            long r2 = r7.high
            long r4 = r8.high
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 == 0) goto L1b
            return r1
        L1b:
            long r2 = r7.low
            long r4 = r8.low
            int r8 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r8 == 0) goto L24
            return r1
        L24:
            return r0
        L25:
            return r1
    }

    @Override // java.lang.Number
    public float floatValue() {
            r2 = this;
            double r0 = r2.doubleValue()
            float r0 = (float) r0
            return r0
    }

    public long getHigh() {
            r2 = this;
            long r0 = r2.high
            return r0
    }

    public long getLow() {
            r2 = this;
            long r0 = r2.low
            return r0
    }

    public int hashCode() {
            r7 = this;
            long r0 = r7.low
            r2 = 32
            long r3 = r0 >>> r2
            long r0 = r0 ^ r3
            int r1 = (int) r0
            int r1 = r1 * 31
            long r3 = r7.high
            long r5 = r3 >>> r2
            long r2 = r3 ^ r5
            int r0 = (int) r2
            int r1 = r1 + r0
            return r1
    }

    @Override // java.lang.Number
    public int intValue() {
            r2 = this;
            double r0 = r2.doubleValue()
            int r0 = (int) r0
            return r0
    }

    public boolean isFinite() {
            r1 = this;
            boolean r0 = r1.isInfinite()
            r0 = r0 ^ 1
            return r0
    }

    public boolean isInfinite() {
            r5 = this;
            long r0 = r5.high
            r2 = 8646911284551352320(0x7800000000000000, double:1.0565890622713305E270)
            long r0 = r0 & r2
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto Lb
            r0 = 1
            goto Lc
        Lb:
            r0 = 0
        Lc:
            return r0
    }

    public boolean isNaN() {
            r5 = this;
            long r0 = r5.high
            r2 = 8935141660703064064(0x7c00000000000000, double:1.94906280228E289)
            long r0 = r0 & r2
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto Lb
            r0 = 1
            goto Lc
        Lb:
            r0 = 0
        Lc:
            return r0
    }

    public boolean isNegative() {
            r5 = this;
            long r0 = r5.high
            r2 = -9223372036854775808
            long r0 = r0 & r2
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto Lb
            r0 = 1
            goto Lc
        Lb:
            r0 = 0
        Lc:
            return r0
    }

    @Override // java.lang.Number
    public long longValue() {
            r2 = this;
            double r0 = r2.doubleValue()
            long r0 = (long) r0
            return r0
    }

    public java.lang.String toString() {
            r1 = this;
            boolean r0 = r1.isNaN()
            if (r0 == 0) goto L9
            java.lang.String r0 = "NaN"
            return r0
        L9:
            boolean r0 = r1.isInfinite()
            if (r0 == 0) goto L1b
            boolean r0 = r1.isNegative()
            if (r0 == 0) goto L18
            java.lang.String r0 = "-Infinity"
            return r0
        L18:
            java.lang.String r0 = "Infinity"
            return r0
        L1b:
            java.lang.String r0 = r1.toStringWithBigDecimal()
            return r0
    }
}
