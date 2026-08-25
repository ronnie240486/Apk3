package com.google.common.primitives;

/* JADX INFO: loaded from: classes2.dex */
@com.google.common.primitives.ElementTypesAreNonnullByDefault
@com.google.common.annotations.Beta
@com.google.common.annotations.GwtCompatible
public final class UnsignedInts {

    public static final enum LexicographicalComparator extends java.lang.Enum<com.google.common.primitives.UnsignedInts.LexicographicalComparator> implements java.util.Comparator<int[]> {
        private static final /* synthetic */ com.google.common.primitives.UnsignedInts.LexicographicalComparator[] $VALUES = null;
        public static final com.google.common.primitives.UnsignedInts.LexicographicalComparator INSTANCE = null;

        private static /* synthetic */ com.google.common.primitives.UnsignedInts.LexicographicalComparator[] $values() {
                r0 = 1
                com.google.common.primitives.UnsignedInts$LexicographicalComparator[] r0 = new com.google.common.primitives.UnsignedInts.LexicographicalComparator[r0]
                com.google.common.primitives.UnsignedInts$LexicographicalComparator r1 = com.google.common.primitives.UnsignedInts.LexicographicalComparator.INSTANCE
                r2 = 0
                r0[r2] = r1
                return r0
        }

        static {
                com.google.common.primitives.UnsignedInts$LexicographicalComparator r0 = new com.google.common.primitives.UnsignedInts$LexicographicalComparator
                java.lang.String r1 = "INSTANCE"
                r2 = 0
                r0.<init>(r1, r2)
                com.google.common.primitives.UnsignedInts.LexicographicalComparator.INSTANCE = r0
                com.google.common.primitives.UnsignedInts$LexicographicalComparator[] r0 = $values()
                com.google.common.primitives.UnsignedInts.LexicographicalComparator.$VALUES = r0
                return
        }

        private LexicographicalComparator(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.google.common.primitives.UnsignedInts.LexicographicalComparator valueOf(java.lang.String r1) {
                java.lang.Class<com.google.common.primitives.UnsignedInts$LexicographicalComparator> r0 = com.google.common.primitives.UnsignedInts.LexicographicalComparator.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.google.common.primitives.UnsignedInts$LexicographicalComparator r1 = (com.google.common.primitives.UnsignedInts.LexicographicalComparator) r1
                return r1
        }

        public static com.google.common.primitives.UnsignedInts.LexicographicalComparator[] values() {
                com.google.common.primitives.UnsignedInts$LexicographicalComparator[] r0 = com.google.common.primitives.UnsignedInts.LexicographicalComparator.$VALUES
                java.lang.Object r0 = r0.clone()
                com.google.common.primitives.UnsignedInts$LexicographicalComparator[] r0 = (com.google.common.primitives.UnsignedInts.LexicographicalComparator[]) r0
                return r0
        }

        @Override // java.util.Comparator
        public /* bridge */ /* synthetic */ int compare(int[] r1, int[] r2) {
                r0 = this;
                int[] r1 = (int[]) r1
                int[] r2 = (int[]) r2
                int r1 = r0.compare2(r1, r2)
                return r1
        }

        /* JADX INFO: renamed from: compare, reason: avoid collision after fix types in other method */
        public int compare2(int[] r5, int[] r6) {
                r4 = this;
                int r0 = r5.length
                int r1 = r6.length
                int r0 = java.lang.Math.min(r0, r1)
                r1 = 0
            L7:
                if (r1 >= r0) goto L1b
                r2 = r5[r1]
                r3 = r6[r1]
                if (r2 == r3) goto L18
                r5 = r5[r1]
                r6 = r6[r1]
                int r5 = com.google.common.primitives.UnsignedInts.compare(r5, r6)
                return r5
            L18:
                int r1 = r1 + 1
                goto L7
            L1b:
                int r5 = r5.length
                int r6 = r6.length
                int r5 = r5 - r6
                return r5
        }

        @Override // java.lang.Enum
        public java.lang.String toString() {
                r1 = this;
                java.lang.String r0 = "UnsignedInts.lexicographicalComparator()"
                return r0
        }
    }

    private UnsignedInts() {
            r0 = this;
            r0.<init>()
            return
    }

    public static int checkedCast(long r5) {
            r0 = 32
            long r0 = r5 >> r0
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            java.lang.String r1 = "out of range: %s"
            com.google.common.base.Preconditions.checkArgument(r0, r1, r5)
            int r6 = (int) r5
            return r6
    }

    public static int compare(int r1, int r2) {
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 ^ r0
            r2 = r2 ^ r0
            int r1 = com.google.common.primitives.Ints.compare(r1, r2)
            return r1
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public static int decode(java.lang.String r4) {
            com.google.common.primitives.ParseRequest r0 = com.google.common.primitives.ParseRequest.fromString(r4)
            java.lang.String r1 = r0.rawValue     // Catch: java.lang.NumberFormatException -> Ld
            int r0 = r0.radix     // Catch: java.lang.NumberFormatException -> Ld
            int r4 = parseUnsignedInt(r1, r0)     // Catch: java.lang.NumberFormatException -> Ld
            return r4
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

    public static int divide(int r2, int r3) {
            long r0 = toLong(r2)
            long r2 = toLong(r3)
            long r0 = r0 / r2
            int r2 = (int) r0
            return r2
    }

    public static java.lang.String join(java.lang.String r3, int... r4) {
            com.google.common.base.Preconditions.checkNotNull(r3)
            int r0 = r4.length
            if (r0 != 0) goto L9
            java.lang.String r3 = ""
            return r3
        L9:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r1 = r4.length
            int r1 = r1 * 5
            r0.<init>(r1)
            r1 = 0
            r1 = r4[r1]
            java.lang.String r1 = toString(r1)
            r0.append(r1)
            r1 = 1
        L1c:
            int r2 = r4.length
            if (r1 >= r2) goto L2e
            r0.append(r3)
            r2 = r4[r1]
            java.lang.String r2 = toString(r2)
            r0.append(r2)
            int r1 = r1 + 1
            goto L1c
        L2e:
            java.lang.String r3 = r0.toString()
            return r3
    }

    public static java.util.Comparator<int[]> lexicographicalComparator() {
            com.google.common.primitives.UnsignedInts$LexicographicalComparator r0 = com.google.common.primitives.UnsignedInts.LexicographicalComparator.INSTANCE
            return r0
    }

    public static int max(int... r4) {
            int r0 = r4.length
            r1 = 0
            r2 = 1
            if (r0 <= 0) goto L7
            r0 = 1
            goto L8
        L7:
            r0 = 0
        L8:
            com.google.common.base.Preconditions.checkArgument(r0)
            r0 = r4[r1]
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 ^ r1
        L10:
            int r3 = r4.length
            if (r2 >= r3) goto L1c
            r3 = r4[r2]
            r3 = r3 ^ r1
            if (r3 <= r0) goto L19
            r0 = r3
        L19:
            int r2 = r2 + 1
            goto L10
        L1c:
            r4 = r0 ^ r1
            return r4
    }

    public static int min(int... r4) {
            int r0 = r4.length
            r1 = 0
            r2 = 1
            if (r0 <= 0) goto L7
            r0 = 1
            goto L8
        L7:
            r0 = 0
        L8:
            com.google.common.base.Preconditions.checkArgument(r0)
            r0 = r4[r1]
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 ^ r1
        L10:
            int r3 = r4.length
            if (r2 >= r3) goto L1c
            r3 = r4[r2]
            r3 = r3 ^ r1
            if (r3 >= r0) goto L19
            r0 = r3
        L19:
            int r2 = r2 + 1
            goto L10
        L1c:
            r4 = r0 ^ r1
            return r4
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public static int parseUnsignedInt(java.lang.String r1) {
            r0 = 10
            int r1 = parseUnsignedInt(r1, r0)
            return r1
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public static int parseUnsignedInt(java.lang.String r5, int r6) {
            com.google.common.base.Preconditions.checkNotNull(r5)
            long r0 = java.lang.Long.parseLong(r5, r6)
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r2 & r0
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 != 0) goto L13
            int r5 = (int) r0
            return r5
        L13:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            r1 = 69
            int r1 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r5, r1)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r1)
            java.lang.String r1 = "Input "
            r2.append(r1)
            r2.append(r5)
            java.lang.String r5 = " in base "
            r2.append(r5)
            r2.append(r6)
            java.lang.String r5 = " is not in the range of an unsigned integer"
            r2.append(r5)
            java.lang.String r5 = r2.toString()
            r0.<init>(r5)
            throw r0
    }

    public static int remainder(int r2, int r3) {
            long r0 = toLong(r2)
            long r2 = toLong(r3)
            long r0 = r0 % r2
            int r2 = (int) r0
            return r2
    }

    public static int saturatedCast(long r3) {
            r0 = 0
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 > 0) goto L8
            r3 = 0
            return r3
        L8:
            r0 = 4294967296(0x100000000, double:2.121995791E-314)
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 < 0) goto L13
            r3 = -1
            return r3
        L13:
            int r4 = (int) r3
            return r4
    }

    public static void sort(int[] r2) {
            com.google.common.base.Preconditions.checkNotNull(r2)
            int r0 = r2.length
            r1 = 0
            sort(r2, r1, r0)
            return
    }

    public static void sort(int[] r3, int r4, int r5) {
            com.google.common.base.Preconditions.checkNotNull(r3)
            int r0 = r3.length
            com.google.common.base.Preconditions.checkPositionIndexes(r4, r5, r0)
            r0 = r4
        L8:
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 >= r5) goto L14
            r2 = r3[r0]
            r1 = r1 ^ r2
            r3[r0] = r1
            int r0 = r0 + 1
            goto L8
        L14:
            java.util.Arrays.sort(r3, r4, r5)
        L17:
            if (r4 >= r5) goto L21
            r0 = r3[r4]
            r0 = r0 ^ r1
            r3[r4] = r0
            int r4 = r4 + 1
            goto L17
        L21:
            return
    }

    public static void sortDescending(int[] r2) {
            com.google.common.base.Preconditions.checkNotNull(r2)
            int r0 = r2.length
            r1 = 0
            sortDescending(r2, r1, r0)
            return
    }

    public static void sortDescending(int[] r3, int r4, int r5) {
            com.google.common.base.Preconditions.checkNotNull(r3)
            int r0 = r3.length
            com.google.common.base.Preconditions.checkPositionIndexes(r4, r5, r0)
            r0 = r4
        L8:
            r1 = 2147483647(0x7fffffff, float:NaN)
            if (r0 >= r5) goto L15
            r2 = r3[r0]
            r1 = r1 ^ r2
            r3[r0] = r1
            int r0 = r0 + 1
            goto L8
        L15:
            java.util.Arrays.sort(r3, r4, r5)
        L18:
            if (r4 >= r5) goto L22
            r0 = r3[r4]
            r0 = r0 ^ r1
            r3[r4] = r0
            int r4 = r4 + 1
            goto L18
        L22:
            return
    }

    public static long toLong(int r4) {
            long r0 = (long) r4
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r2
            return r0
    }

    public static java.lang.String toString(int r1) {
            r0 = 10
            java.lang.String r1 = toString(r1, r0)
            return r1
    }

    public static java.lang.String toString(int r4, int r5) {
            long r0 = (long) r4
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r2
            java.lang.String r4 = java.lang.Long.toString(r0, r5)
            return r4
    }
}
