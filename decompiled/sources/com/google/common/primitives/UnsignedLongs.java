package com.google.common.primitives;

/* JADX INFO: loaded from: classes3.dex */
@com.google.common.primitives.ElementTypesAreNonnullByDefault
@com.google.common.annotations.Beta
@com.google.common.annotations.GwtCompatible
public final class UnsignedLongs {
    public static final long MAX_VALUE = -1;

    /* JADX INFO: loaded from: classes.dex */
    public static final enum LexicographicalComparator extends java.lang.Enum<com.google.common.primitives.UnsignedLongs.LexicographicalComparator> implements java.util.Comparator<long[]> {
        private static final /* synthetic */ com.google.common.primitives.UnsignedLongs.LexicographicalComparator[] $VALUES = null;
        public static final com.google.common.primitives.UnsignedLongs.LexicographicalComparator INSTANCE = null;

        private static /* synthetic */ com.google.common.primitives.UnsignedLongs.LexicographicalComparator[] $values() {
                r0 = 1
                com.google.common.primitives.UnsignedLongs$LexicographicalComparator[] r0 = new com.google.common.primitives.UnsignedLongs.LexicographicalComparator[r0]
                com.google.common.primitives.UnsignedLongs$LexicographicalComparator r1 = com.google.common.primitives.UnsignedLongs.LexicographicalComparator.INSTANCE
                r2 = 0
                r0[r2] = r1
                return r0
        }

        static {
                com.google.common.primitives.UnsignedLongs$LexicographicalComparator r0 = new com.google.common.primitives.UnsignedLongs$LexicographicalComparator
                java.lang.String r1 = "INSTANCE"
                r2 = 0
                r0.<init>(r1, r2)
                com.google.common.primitives.UnsignedLongs.LexicographicalComparator.INSTANCE = r0
                com.google.common.primitives.UnsignedLongs$LexicographicalComparator[] r0 = $values()
                com.google.common.primitives.UnsignedLongs.LexicographicalComparator.$VALUES = r0
                return
        }

        private LexicographicalComparator(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.google.common.primitives.UnsignedLongs.LexicographicalComparator valueOf(java.lang.String r1) {
                java.lang.Class<com.google.common.primitives.UnsignedLongs$LexicographicalComparator> r0 = com.google.common.primitives.UnsignedLongs.LexicographicalComparator.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.google.common.primitives.UnsignedLongs$LexicographicalComparator r1 = (com.google.common.primitives.UnsignedLongs.LexicographicalComparator) r1
                return r1
        }

        public static com.google.common.primitives.UnsignedLongs.LexicographicalComparator[] values() {
                com.google.common.primitives.UnsignedLongs$LexicographicalComparator[] r0 = com.google.common.primitives.UnsignedLongs.LexicographicalComparator.$VALUES
                java.lang.Object r0 = r0.clone()
                com.google.common.primitives.UnsignedLongs$LexicographicalComparator[] r0 = (com.google.common.primitives.UnsignedLongs.LexicographicalComparator[]) r0
                return r0
        }

        @Override // java.util.Comparator
        public /* bridge */ /* synthetic */ int compare(long[] r1, long[] r2) {
                r0 = this;
                long[] r1 = (long[]) r1
                long[] r2 = (long[]) r2
                int r1 = r0.compare2(r1, r2)
                return r1
        }

        /* JADX INFO: renamed from: compare, reason: avoid collision after fix types in other method */
        public int compare2(long[] r8, long[] r9) {
                r7 = this;
                int r0 = r8.length
                int r1 = r9.length
                int r0 = java.lang.Math.min(r0, r1)
                r1 = 0
            L7:
                if (r1 >= r0) goto L1d
                r2 = r8[r1]
                r4 = r9[r1]
                int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r6 == 0) goto L1a
                r2 = r8[r1]
                r8 = r9[r1]
                int r8 = com.google.common.primitives.UnsignedLongs.compare(r2, r8)
                return r8
            L1a:
                int r1 = r1 + 1
                goto L7
            L1d:
                int r8 = r8.length
                int r9 = r9.length
                int r8 = r8 - r9
                return r8
        }

        @Override // java.lang.Enum
        public java.lang.String toString() {
                r1 = this;
                java.lang.String r0 = "UnsignedLongs.lexicographicalComparator()"
                return r0
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static final class ParseOverflowDetection {
        public static final int[] maxSafeDigits = null;
        public static final long[] maxValueDivs = null;
        public static final int[] maxValueMods = null;

        static {
                r0 = 37
                long[] r1 = new long[r0]
                com.google.common.primitives.UnsignedLongs.ParseOverflowDetection.maxValueDivs = r1
                int[] r1 = new int[r0]
                com.google.common.primitives.UnsignedLongs.ParseOverflowDetection.maxValueMods = r1
                int[] r0 = new int[r0]
                com.google.common.primitives.UnsignedLongs.ParseOverflowDetection.maxSafeDigits = r0
                java.math.BigInteger r0 = new java.math.BigInteger
                java.lang.String r1 = "10000000000000000"
                r2 = 16
                r0.<init>(r1, r2)
                r1 = 2
            L18:
                r2 = 36
                if (r1 > r2) goto L41
                long[] r2 = com.google.common.primitives.UnsignedLongs.ParseOverflowDetection.maxValueDivs
                long r3 = (long) r1
                r5 = -1
                long r7 = com.google.common.primitives.UnsignedLongs.divide(r5, r3)
                r2[r1] = r7
                int[] r2 = com.google.common.primitives.UnsignedLongs.ParseOverflowDetection.maxValueMods
                long r3 = com.google.common.primitives.UnsignedLongs.remainder(r5, r3)
                int r4 = (int) r3
                r2[r1] = r4
                int[] r2 = com.google.common.primitives.UnsignedLongs.ParseOverflowDetection.maxSafeDigits
                java.lang.String r3 = r0.toString(r1)
                int r3 = r3.length()
                int r3 = r3 + (-1)
                r2[r1] = r3
                int r1 = r1 + 1
                goto L18
            L41:
                return
        }

        private ParseOverflowDetection() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    private UnsignedLongs() {
            r0 = this;
            r0.<init>()
            return
    }

    public static int compare(long r0, long r2) {
            long r0 = flip(r0)
            long r2 = flip(r2)
            int r0 = com.google.common.primitives.Longs.compare(r0, r2)
            return r0
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public static long decode(java.lang.String r4) {
            com.google.common.primitives.ParseRequest r0 = com.google.common.primitives.ParseRequest.fromString(r4)
            java.lang.String r1 = r0.rawValue     // Catch: java.lang.NumberFormatException -> Ld
            int r0 = r0.radix     // Catch: java.lang.NumberFormatException -> Ld
            long r0 = parseUnsignedLong(r1, r0)     // Catch: java.lang.NumberFormatException -> Ld
            return r0
        Ld:
            r0 = move-exception
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.String r2 = "Error parsing value: "
            int r3 = r4.length()
            if (r3 == 0) goto L1d
            java.lang.String r4 = r2.concat(r4)
            goto L22
        L1d:
            java.lang.String r4 = new java.lang.String
            r4.<init>(r2)
        L22:
            r1.<init>(r4)
            r1.initCause(r0)
            throw r1
    }

    public static long divide(long r5, long r7) {
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

    private static long flip(long r2) {
            r0 = -9223372036854775808
            long r2 = r2 ^ r0
            return r2
    }

    public static java.lang.String join(java.lang.String r4, long... r5) {
            com.google.common.base.Preconditions.checkNotNull(r4)
            int r0 = r5.length
            if (r0 != 0) goto L9
            java.lang.String r4 = ""
            return r4
        L9:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r1 = r5.length
            int r1 = r1 * 5
            r0.<init>(r1)
            r1 = 0
            r1 = r5[r1]
            java.lang.String r1 = toString(r1)
            r0.append(r1)
            r1 = 1
        L1c:
            int r2 = r5.length
            if (r1 >= r2) goto L2e
            r0.append(r4)
            r2 = r5[r1]
            java.lang.String r2 = toString(r2)
            r0.append(r2)
            int r1 = r1 + 1
            goto L1c
        L2e:
            java.lang.String r4 = r0.toString()
            return r4
    }

    public static java.util.Comparator<long[]> lexicographicalComparator() {
            com.google.common.primitives.UnsignedLongs$LexicographicalComparator r0 = com.google.common.primitives.UnsignedLongs.LexicographicalComparator.INSTANCE
            return r0
    }

    public static long max(long... r6) {
            int r0 = r6.length
            r1 = 0
            r2 = 1
            if (r0 <= 0) goto L7
            r0 = 1
            goto L8
        L7:
            r0 = 0
        L8:
            com.google.common.base.Preconditions.checkArgument(r0)
            r0 = r6[r1]
            long r0 = flip(r0)
        L11:
            int r3 = r6.length
            if (r2 >= r3) goto L22
            r3 = r6[r2]
            long r3 = flip(r3)
            int r5 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r5 <= 0) goto L1f
            r0 = r3
        L1f:
            int r2 = r2 + 1
            goto L11
        L22:
            long r0 = flip(r0)
            return r0
    }

    public static long min(long... r6) {
            int r0 = r6.length
            r1 = 0
            r2 = 1
            if (r0 <= 0) goto L7
            r0 = 1
            goto L8
        L7:
            r0 = 0
        L8:
            com.google.common.base.Preconditions.checkArgument(r0)
            r0 = r6[r1]
            long r0 = flip(r0)
        L11:
            int r3 = r6.length
            if (r2 >= r3) goto L22
            r3 = r6[r2]
            long r3 = flip(r3)
            int r5 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r5 >= 0) goto L1f
            r0 = r3
        L1f:
            int r2 = r2 + 1
            goto L11
        L22:
            long r0 = flip(r0)
            return r0
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public static long parseUnsignedLong(java.lang.String r2) {
            r0 = 10
            long r0 = parseUnsignedLong(r2, r0)
            return r0
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public static long parseUnsignedLong(java.lang.String r11, int r12) {
            com.google.common.base.Preconditions.checkNotNull(r11)
            int r0 = r11.length()
            if (r0 == 0) goto L82
            r0 = 2
            if (r12 < r0) goto L74
            r0 = 36
            if (r12 > r0) goto L74
            int[] r0 = com.google.common.primitives.UnsignedLongs.ParseOverflowDetection.maxSafeDigits
            r0 = r0[r12]
            int r0 = r0 + (-1)
            r1 = 0
            r3 = 0
            r4 = r1
        L1a:
            int r6 = r11.length()
            if (r3 >= r6) goto L73
            char r6 = r11.charAt(r3)
            int r6 = java.lang.Character.digit(r6, r12)
            r7 = -1
            if (r6 == r7) goto L6d
            if (r3 <= r0) goto L65
            int r7 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r7 < 0) goto L4a
            long[] r7 = com.google.common.primitives.UnsignedLongs.ParseOverflowDetection.maxValueDivs
            r8 = r7[r12]
            int r10 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r10 >= 0) goto L3a
            goto L48
        L3a:
            r8 = r7[r12]
            int r7 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r7 <= 0) goto L41
            goto L4a
        L41:
            int[] r7 = com.google.common.primitives.UnsignedLongs.ParseOverflowDetection.maxValueMods
            r7 = r7[r12]
            if (r6 <= r7) goto L48
            goto L4a
        L48:
            r7 = 0
            goto L4b
        L4a:
            r7 = 1
        L4b:
            if (r7 == 0) goto L65
            java.lang.NumberFormatException r12 = new java.lang.NumberFormatException
            java.lang.String r0 = "Too large for unsigned long: "
            int r1 = r11.length()
            if (r1 == 0) goto L5c
            java.lang.String r11 = r0.concat(r11)
            goto L61
        L5c:
            java.lang.String r11 = new java.lang.String
            r11.<init>(r0)
        L61:
            r12.<init>(r11)
            throw r12
        L65:
            long r7 = (long) r12
            long r4 = r4 * r7
            long r6 = (long) r6
            long r4 = r4 + r6
            int r3 = r3 + 1
            goto L1a
        L6d:
            java.lang.NumberFormatException r12 = new java.lang.NumberFormatException
            r12.<init>(r11)
            throw r12
        L73:
            return r4
        L74:
            java.lang.NumberFormatException r11 = new java.lang.NumberFormatException
            r0 = 26
            java.lang.String r1 = "illegal radix: "
            java.lang.String r12 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r0, r1, r12)
            r11.<init>(r12)
            throw r11
        L82:
            java.lang.NumberFormatException r11 = new java.lang.NumberFormatException
            java.lang.String r12 = "empty string"
            r11.<init>(r12)
            throw r11
    }

    public static long remainder(long r5, long r7) {
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

    public static void sort(long[] r2) {
            com.google.common.base.Preconditions.checkNotNull(r2)
            int r0 = r2.length
            r1 = 0
            sort(r2, r1, r0)
            return
    }

    public static void sort(long[] r3, int r4, int r5) {
            com.google.common.base.Preconditions.checkNotNull(r3)
            int r0 = r3.length
            com.google.common.base.Preconditions.checkPositionIndexes(r4, r5, r0)
            r0 = r4
        L8:
            if (r0 >= r5) goto L15
            r1 = r3[r0]
            long r1 = flip(r1)
            r3[r0] = r1
            int r0 = r0 + 1
            goto L8
        L15:
            java.util.Arrays.sort(r3, r4, r5)
        L18:
            if (r4 >= r5) goto L25
            r0 = r3[r4]
            long r0 = flip(r0)
            r3[r4] = r0
            int r4 = r4 + 1
            goto L18
        L25:
            return
    }

    public static void sortDescending(long[] r2) {
            com.google.common.base.Preconditions.checkNotNull(r2)
            int r0 = r2.length
            r1 = 0
            sortDescending(r2, r1, r0)
            return
    }

    public static void sortDescending(long[] r5, int r6, int r7) {
            com.google.common.base.Preconditions.checkNotNull(r5)
            int r0 = r5.length
            com.google.common.base.Preconditions.checkPositionIndexes(r6, r7, r0)
            r0 = r6
        L8:
            r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r0 >= r7) goto L17
            r3 = r5[r0]
            long r1 = r1 ^ r3
            r5[r0] = r1
            int r0 = r0 + 1
            goto L8
        L17:
            java.util.Arrays.sort(r5, r6, r7)
        L1a:
            if (r6 >= r7) goto L24
            r3 = r5[r6]
            long r3 = r3 ^ r1
            r5[r6] = r3
            int r6 = r6 + 1
            goto L1a
        L24:
            return
    }

    public static java.lang.String toString(long r1) {
            r0 = 10
            java.lang.String r1 = toString(r1, r0)
            return r1
    }

    public static java.lang.String toString(long r11, int r13) {
            r0 = 1
            r1 = 2
            if (r13 < r1) goto La
            r1 = 36
            if (r13 > r1) goto La
            r1 = 1
            goto Lb
        La:
            r1 = 0
        Lb:
            java.lang.String r2 = "radix (%s) must be between Character.MIN_RADIX and Character.MAX_RADIX"
            com.google.common.base.Preconditions.checkArgument(r1, r2, r13)
            r1 = 0
            int r3 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r3 != 0) goto L19
            java.lang.String r11 = "0"
            return r11
        L19:
            if (r3 <= 0) goto L20
            java.lang.String r11 = java.lang.Long.toString(r11, r13)
            return r11
        L20:
            r3 = 64
            char[] r4 = new char[r3]
            int r5 = r13 + (-1)
            r6 = r13 & r5
            if (r6 != 0) goto L3e
            int r6 = java.lang.Integer.numberOfTrailingZeros(r13)
        L2e:
            int r3 = r3 + (-1)
            int r0 = (int) r11
            r0 = r0 & r5
            char r0 = java.lang.Character.forDigit(r0, r13)
            r4[r3] = r0
            long r11 = r11 >>> r6
            int r0 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r0 != 0) goto L2e
            goto L6e
        L3e:
            r3 = r13 & 1
            if (r3 != 0) goto L49
            long r5 = r11 >>> r0
            int r0 = r13 >>> 1
            long r7 = (long) r0
            long r5 = r5 / r7
            goto L4e
        L49:
            long r5 = (long) r13
            long r5 = divide(r11, r5)
        L4e:
            long r7 = (long) r13
            long r9 = r5 * r7
            long r11 = r11 - r9
            r0 = 63
            int r12 = (int) r11
            char r11 = java.lang.Character.forDigit(r12, r13)
            r4[r0] = r11
            r3 = 63
        L5d:
            int r11 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r11 <= 0) goto L6e
            int r3 = r3 + (-1)
            long r11 = r5 % r7
            int r12 = (int) r11
            char r11 = java.lang.Character.forDigit(r12, r13)
            r4[r3] = r11
            long r5 = r5 / r7
            goto L5d
        L6e:
            java.lang.String r11 = new java.lang.String
            int r12 = 64 - r3
            r11.<init>(r4, r3, r12)
            return r11
    }
}
