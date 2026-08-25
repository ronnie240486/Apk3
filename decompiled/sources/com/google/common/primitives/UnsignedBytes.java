package com.google.common.primitives;

/* JADX INFO: loaded from: classes2.dex */
@com.google.common.primitives.ElementTypesAreNonnullByDefault
@com.google.common.annotations.GwtIncompatible
public final class UnsignedBytes {
    public static final byte MAX_POWER_OF_TWO = -128;
    public static final byte MAX_VALUE = -1;
    private static final int UNSIGNED_MASK = 255;

    /* JADX INFO: loaded from: classes.dex */
    @com.google.common.annotations.VisibleForTesting
    public static class LexicographicalComparatorHolder {
        public static final java.util.Comparator<byte[]> BEST_COMPARATOR = null;

        public static final enum PureJavaComparator extends java.lang.Enum<com.google.common.primitives.UnsignedBytes.LexicographicalComparatorHolder.PureJavaComparator> implements java.util.Comparator<byte[]> {
            private static final /* synthetic */ com.google.common.primitives.UnsignedBytes.LexicographicalComparatorHolder.PureJavaComparator[] $VALUES = null;
            public static final com.google.common.primitives.UnsignedBytes.LexicographicalComparatorHolder.PureJavaComparator INSTANCE = null;

            private static /* synthetic */ com.google.common.primitives.UnsignedBytes.LexicographicalComparatorHolder.PureJavaComparator[] $values() {
                    r0 = 1
                    com.google.common.primitives.UnsignedBytes$LexicographicalComparatorHolder$PureJavaComparator[] r0 = new com.google.common.primitives.UnsignedBytes.LexicographicalComparatorHolder.PureJavaComparator[r0]
                    com.google.common.primitives.UnsignedBytes$LexicographicalComparatorHolder$PureJavaComparator r1 = com.google.common.primitives.UnsignedBytes.LexicographicalComparatorHolder.PureJavaComparator.INSTANCE
                    r2 = 0
                    r0[r2] = r1
                    return r0
            }

            static {
                    com.google.common.primitives.UnsignedBytes$LexicographicalComparatorHolder$PureJavaComparator r0 = new com.google.common.primitives.UnsignedBytes$LexicographicalComparatorHolder$PureJavaComparator
                    java.lang.String r1 = "INSTANCE"
                    r2 = 0
                    r0.<init>(r1, r2)
                    com.google.common.primitives.UnsignedBytes.LexicographicalComparatorHolder.PureJavaComparator.INSTANCE = r0
                    com.google.common.primitives.UnsignedBytes$LexicographicalComparatorHolder$PureJavaComparator[] r0 = $values()
                    com.google.common.primitives.UnsignedBytes.LexicographicalComparatorHolder.PureJavaComparator.$VALUES = r0
                    return
            }

            private PureJavaComparator(java.lang.String r1, int r2) {
                    r0 = this;
                    r0.<init>(r1, r2)
                    return
            }

            public static com.google.common.primitives.UnsignedBytes.LexicographicalComparatorHolder.PureJavaComparator valueOf(java.lang.String r1) {
                    java.lang.Class<com.google.common.primitives.UnsignedBytes$LexicographicalComparatorHolder$PureJavaComparator> r0 = com.google.common.primitives.UnsignedBytes.LexicographicalComparatorHolder.PureJavaComparator.class
                    java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                    com.google.common.primitives.UnsignedBytes$LexicographicalComparatorHolder$PureJavaComparator r1 = (com.google.common.primitives.UnsignedBytes.LexicographicalComparatorHolder.PureJavaComparator) r1
                    return r1
            }

            public static com.google.common.primitives.UnsignedBytes.LexicographicalComparatorHolder.PureJavaComparator[] values() {
                    com.google.common.primitives.UnsignedBytes$LexicographicalComparatorHolder$PureJavaComparator[] r0 = com.google.common.primitives.UnsignedBytes.LexicographicalComparatorHolder.PureJavaComparator.$VALUES
                    java.lang.Object r0 = r0.clone()
                    com.google.common.primitives.UnsignedBytes$LexicographicalComparatorHolder$PureJavaComparator[] r0 = (com.google.common.primitives.UnsignedBytes.LexicographicalComparatorHolder.PureJavaComparator[]) r0
                    return r0
            }

            @Override // java.util.Comparator
            public /* bridge */ /* synthetic */ int compare(byte[] r1, byte[] r2) {
                    r0 = this;
                    byte[] r1 = (byte[]) r1
                    byte[] r2 = (byte[]) r2
                    int r1 = r0.compare2(r1, r2)
                    return r1
            }

            /* JADX INFO: renamed from: compare, reason: avoid collision after fix types in other method */
            public int compare2(byte[] r5, byte[] r6) {
                    r4 = this;
                    int r0 = r5.length
                    int r1 = r6.length
                    int r0 = java.lang.Math.min(r0, r1)
                    r1 = 0
                L7:
                    if (r1 >= r0) goto L17
                    r2 = r5[r1]
                    r3 = r6[r1]
                    int r2 = com.google.common.primitives.UnsignedBytes.compare(r2, r3)
                    if (r2 == 0) goto L14
                    return r2
                L14:
                    int r1 = r1 + 1
                    goto L7
                L17:
                    int r5 = r5.length
                    int r6 = r6.length
                    int r5 = r5 - r6
                    return r5
            }

            @Override // java.lang.Enum
            public java.lang.String toString() {
                    r1 = this;
                    java.lang.String r0 = "UnsignedBytes.lexicographicalComparator() (pure Java version)"
                    return r0
            }
        }

        @com.google.common.annotations.VisibleForTesting
        public static final enum UnsafeComparator extends java.lang.Enum<com.google.common.primitives.UnsignedBytes.LexicographicalComparatorHolder.UnsafeComparator> implements java.util.Comparator<byte[]> {
            private static final /* synthetic */ com.google.common.primitives.UnsignedBytes.LexicographicalComparatorHolder.UnsafeComparator[] $VALUES = null;
            public static final boolean BIG_ENDIAN = false;
            public static final int BYTE_ARRAY_BASE_OFFSET = 0;
            public static final com.google.common.primitives.UnsignedBytes.LexicographicalComparatorHolder.UnsafeComparator INSTANCE = null;
            public static final sun.misc.Unsafe theUnsafe = null;


            private static /* synthetic */ com.google.common.primitives.UnsignedBytes.LexicographicalComparatorHolder.UnsafeComparator[] $values() {
                    r0 = 1
                    com.google.common.primitives.UnsignedBytes$LexicographicalComparatorHolder$UnsafeComparator[] r0 = new com.google.common.primitives.UnsignedBytes.LexicographicalComparatorHolder.UnsafeComparator[r0]
                    com.google.common.primitives.UnsignedBytes$LexicographicalComparatorHolder$UnsafeComparator r1 = com.google.common.primitives.UnsignedBytes.LexicographicalComparatorHolder.UnsafeComparator.INSTANCE
                    r2 = 0
                    r0[r2] = r1
                    return r0
            }

            static {
                    java.lang.Class<byte[]> r0 = byte[].class
                    com.google.common.primitives.UnsignedBytes$LexicographicalComparatorHolder$UnsafeComparator r1 = new com.google.common.primitives.UnsignedBytes$LexicographicalComparatorHolder$UnsafeComparator
                    java.lang.String r2 = "INSTANCE"
                    r3 = 0
                    r1.<init>(r2, r3)
                    com.google.common.primitives.UnsignedBytes.LexicographicalComparatorHolder.UnsafeComparator.INSTANCE = r1
                    com.google.common.primitives.UnsignedBytes$LexicographicalComparatorHolder$UnsafeComparator[] r1 = $values()
                    com.google.common.primitives.UnsignedBytes.LexicographicalComparatorHolder.UnsafeComparator.$VALUES = r1
                    java.nio.ByteOrder r1 = java.nio.ByteOrder.nativeOrder()
                    java.nio.ByteOrder r2 = java.nio.ByteOrder.BIG_ENDIAN
                    boolean r1 = r1.equals(r2)
                    com.google.common.primitives.UnsignedBytes.LexicographicalComparatorHolder.UnsafeComparator.BIG_ENDIAN = r1
                    sun.misc.Unsafe r1 = getUnsafe()
                    com.google.common.primitives.UnsignedBytes.LexicographicalComparatorHolder.UnsafeComparator.theUnsafe = r1
                    int r2 = r1.arrayBaseOffset(r0)
                    com.google.common.primitives.UnsignedBytes.LexicographicalComparatorHolder.UnsafeComparator.BYTE_ARRAY_BASE_OFFSET = r2
                    java.lang.String r3 = "sun.arch.data.model"
                    java.lang.String r3 = java.lang.System.getProperty(r3)
                    java.lang.String r4 = "64"
                    boolean r3 = r4.equals(r3)
                    if (r3 == 0) goto L45
                    int r2 = r2 % 8
                    if (r2 != 0) goto L45
                    int r0 = r1.arrayIndexScale(r0)
                    r1 = 1
                    if (r0 != r1) goto L45
                    return
                L45:
                    java.lang.Error r0 = new java.lang.Error
                    r0.<init>()
                    throw r0
            }

            private UnsafeComparator(java.lang.String r1, int r2) {
                    r0 = this;
                    r0.<init>(r1, r2)
                    return
            }

            private static sun.misc.Unsafe getUnsafe() {
                    sun.misc.Unsafe r0 = sun.misc.Unsafe.getUnsafe()     // Catch: java.lang.SecurityException -> L5
                    return r0
                L5:
                    com.google.common.primitives.UnsignedBytes$LexicographicalComparatorHolder$UnsafeComparator$1 r0 = new com.google.common.primitives.UnsignedBytes$LexicographicalComparatorHolder$UnsafeComparator$1     // Catch: java.security.PrivilegedActionException -> L11
                    r0.<init>()     // Catch: java.security.PrivilegedActionException -> L11
                    java.lang.Object r0 = java.security.AccessController.doPrivileged(r0)     // Catch: java.security.PrivilegedActionException -> L11
                    sun.misc.Unsafe r0 = (sun.misc.Unsafe) r0     // Catch: java.security.PrivilegedActionException -> L11
                    return r0
                L11:
                    r0 = move-exception
                    java.lang.RuntimeException r1 = new java.lang.RuntimeException
                    java.lang.Throwable r0 = r0.getCause()
                    java.lang.String r2 = "Could not initialize intrinsics"
                    r1.<init>(r2, r0)
                    throw r1
            }

            public static com.google.common.primitives.UnsignedBytes.LexicographicalComparatorHolder.UnsafeComparator valueOf(java.lang.String r1) {
                    java.lang.Class<com.google.common.primitives.UnsignedBytes$LexicographicalComparatorHolder$UnsafeComparator> r0 = com.google.common.primitives.UnsignedBytes.LexicographicalComparatorHolder.UnsafeComparator.class
                    java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                    com.google.common.primitives.UnsignedBytes$LexicographicalComparatorHolder$UnsafeComparator r1 = (com.google.common.primitives.UnsignedBytes.LexicographicalComparatorHolder.UnsafeComparator) r1
                    return r1
            }

            public static com.google.common.primitives.UnsignedBytes.LexicographicalComparatorHolder.UnsafeComparator[] values() {
                    com.google.common.primitives.UnsignedBytes$LexicographicalComparatorHolder$UnsafeComparator[] r0 = com.google.common.primitives.UnsignedBytes.LexicographicalComparatorHolder.UnsafeComparator.$VALUES
                    java.lang.Object r0 = r0.clone()
                    com.google.common.primitives.UnsignedBytes$LexicographicalComparatorHolder$UnsafeComparator[] r0 = (com.google.common.primitives.UnsignedBytes.LexicographicalComparatorHolder.UnsafeComparator[]) r0
                    return r0
            }

            @Override // java.util.Comparator
            public /* bridge */ /* synthetic */ int compare(byte[] r1, byte[] r2) {
                    r0 = this;
                    byte[] r1 = (byte[]) r1
                    byte[] r2 = (byte[]) r2
                    int r1 = r0.compare2(r1, r2)
                    return r1
            }

            /* JADX INFO: renamed from: compare, reason: avoid collision after fix types in other method */
            public int compare2(byte[] r12, byte[] r13) {
                    r11 = this;
                    int r0 = r12.length
                    int r1 = r13.length
                    int r0 = java.lang.Math.min(r0, r1)
                    r1 = r0 & (-8)
                    r2 = 0
                L9:
                    if (r2 >= r1) goto L40
                    sun.misc.Unsafe r3 = com.google.common.primitives.UnsignedBytes.LexicographicalComparatorHolder.UnsafeComparator.theUnsafe
                    int r4 = com.google.common.primitives.UnsignedBytes.LexicographicalComparatorHolder.UnsafeComparator.BYTE_ARRAY_BASE_OFFSET
                    long r5 = (long) r4
                    long r7 = (long) r2
                    long r5 = r5 + r7
                    long r5 = r3.getLong(r12, r5)
                    long r9 = (long) r4
                    long r9 = r9 + r7
                    long r3 = r3.getLong(r13, r9)
                    int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
                    if (r7 == 0) goto L3d
                    boolean r12 = com.google.common.primitives.UnsignedBytes.LexicographicalComparatorHolder.UnsafeComparator.BIG_ENDIAN
                    if (r12 == 0) goto L29
                    int r12 = com.google.common.primitives.UnsignedLongs.compare(r5, r3)
                    return r12
                L29:
                    long r12 = r5 ^ r3
                    int r12 = java.lang.Long.numberOfTrailingZeros(r12)
                    r12 = r12 & (-8)
                    long r0 = r5 >>> r12
                    r5 = 255(0xff, double:1.26E-321)
                    long r0 = r0 & r5
                    int r13 = (int) r0
                    long r0 = r3 >>> r12
                    long r0 = r0 & r5
                    int r12 = (int) r0
                    int r13 = r13 - r12
                    return r13
                L3d:
                    int r2 = r2 + 8
                    goto L9
                L40:
                    if (r2 >= r0) goto L50
                    r1 = r12[r2]
                    r3 = r13[r2]
                    int r1 = com.google.common.primitives.UnsignedBytes.compare(r1, r3)
                    if (r1 == 0) goto L4d
                    return r1
                L4d:
                    int r2 = r2 + 1
                    goto L40
                L50:
                    int r12 = r12.length
                    int r13 = r13.length
                    int r12 = r12 - r13
                    return r12
            }

            @Override // java.lang.Enum
            public java.lang.String toString() {
                    r1 = this;
                    java.lang.String r0 = "UnsignedBytes.lexicographicalComparator() (sun.misc.Unsafe version)"
                    return r0
            }
        }

        static {
                java.lang.Class<com.google.common.primitives.UnsignedBytes$LexicographicalComparatorHolder> r0 = com.google.common.primitives.UnsignedBytes.LexicographicalComparatorHolder.class
                java.lang.String r0 = r0.getName()
                java.lang.String r1 = "$UnsafeComparator"
                java.lang.String r0 = r0.concat(r1)
                java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L1d
                java.lang.Object[] r0 = r0.getEnumConstants()     // Catch: java.lang.Throwable -> L1d
                java.util.Objects.requireNonNull(r0)     // Catch: java.lang.Throwable -> L1d
                r1 = 0
                r0 = r0[r1]     // Catch: java.lang.Throwable -> L1d
                java.util.Comparator r0 = (java.util.Comparator) r0     // Catch: java.lang.Throwable -> L1d
                goto L1f
            L1d:
                com.google.common.primitives.UnsignedBytes$LexicographicalComparatorHolder$PureJavaComparator r0 = com.google.common.primitives.UnsignedBytes.LexicographicalComparatorHolder.PureJavaComparator.INSTANCE
            L1f:
                com.google.common.primitives.UnsignedBytes.LexicographicalComparatorHolder.BEST_COMPARATOR = r0
                return
        }

        public LexicographicalComparatorHolder() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    private UnsignedBytes() {
            r0 = this;
            r0.<init>()
            return
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public static byte checkedCast(long r5) {
            r0 = 8
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
            byte r5 = (byte) r6
            return r5
    }

    public static int compare(byte r0, byte r1) {
            int r0 = toInt(r0)
            int r1 = toInt(r1)
            int r0 = r0 - r1
            return r0
    }

    private static byte flip(byte r0) {
            r0 = r0 ^ 128(0x80, float:1.8E-43)
            byte r0 = (byte) r0
            return r0
    }

    public static java.lang.String join(java.lang.String r3, byte... r4) {
            com.google.common.base.Preconditions.checkNotNull(r3)
            int r0 = r4.length
            if (r0 != 0) goto L9
            java.lang.String r3 = ""
            return r3
        L9:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r1 = r4.length
            int r2 = r3.length()
            int r2 = r2 + 3
            int r2 = r2 * r1
            r0.<init>(r2)
            r1 = 0
            r1 = r4[r1]
            int r1 = toInt(r1)
            r0.append(r1)
            r1 = 1
        L22:
            int r2 = r4.length
            if (r1 >= r2) goto L34
            r0.append(r3)
            r2 = r4[r1]
            java.lang.String r2 = toString(r2)
            r0.append(r2)
            int r1 = r1 + 1
            goto L22
        L34:
            java.lang.String r3 = r0.toString()
            return r3
    }

    public static java.util.Comparator<byte[]> lexicographicalComparator() {
            java.util.Comparator<byte[]> r0 = com.google.common.primitives.UnsignedBytes.LexicographicalComparatorHolder.BEST_COMPARATOR
            return r0
    }

    public static byte max(byte... r3) {
            int r0 = r3.length
            r1 = 0
            r2 = 1
            if (r0 <= 0) goto L7
            r0 = 1
            goto L8
        L7:
            r0 = 0
        L8:
            com.google.common.base.Preconditions.checkArgument(r0)
            r0 = r3[r1]
            int r0 = toInt(r0)
        L11:
            int r1 = r3.length
            if (r2 >= r1) goto L20
            r1 = r3[r2]
            int r1 = toInt(r1)
            if (r1 <= r0) goto L1d
            r0 = r1
        L1d:
            int r2 = r2 + 1
            goto L11
        L20:
            byte r3 = (byte) r0
            return r3
    }

    public static byte min(byte... r3) {
            int r0 = r3.length
            r1 = 0
            r2 = 1
            if (r0 <= 0) goto L7
            r0 = 1
            goto L8
        L7:
            r0 = 0
        L8:
            com.google.common.base.Preconditions.checkArgument(r0)
            r0 = r3[r1]
            int r0 = toInt(r0)
        L11:
            int r1 = r3.length
            if (r2 >= r1) goto L20
            r1 = r3[r2]
            int r1 = toInt(r1)
            if (r1 >= r0) goto L1d
            r0 = r1
        L1d:
            int r2 = r2 + 1
            goto L11
        L20:
            byte r3 = (byte) r0
            return r3
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    @com.google.common.annotations.Beta
    public static byte parseUnsignedByte(java.lang.String r1) {
            r0 = 10
            byte r1 = parseUnsignedByte(r1, r0)
            return r1
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    @com.google.common.annotations.Beta
    public static byte parseUnsignedByte(java.lang.String r2, int r3) {
            java.lang.Object r2 = com.google.common.base.Preconditions.checkNotNull(r2)
            java.lang.String r2 = (java.lang.String) r2
            int r2 = java.lang.Integer.parseInt(r2, r3)
            int r3 = r2 >> 8
            if (r3 != 0) goto L10
            byte r2 = (byte) r2
            return r2
        L10:
            java.lang.NumberFormatException r3 = new java.lang.NumberFormatException
            r0 = 25
            java.lang.String r1 = "out of range: "
            java.lang.String r2 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r0, r1, r2)
            r3.<init>(r2)
            throw r3
    }

    public static byte saturatedCast(long r4) {
            r0 = -1
            int r1 = toInt(r0)
            long r1 = (long) r1
            int r3 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r3 <= 0) goto Lb
            return r0
        Lb:
            r0 = 0
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 >= 0) goto L13
            r4 = 0
            return r4
        L13:
            int r5 = (int) r4
            byte r4 = (byte) r5
            return r4
    }

    public static void sort(byte[] r2) {
            com.google.common.base.Preconditions.checkNotNull(r2)
            int r0 = r2.length
            r1 = 0
            sort(r2, r1, r0)
            return
    }

    public static void sort(byte[] r2, int r3, int r4) {
            com.google.common.base.Preconditions.checkNotNull(r2)
            int r0 = r2.length
            com.google.common.base.Preconditions.checkPositionIndexes(r3, r4, r0)
            r0 = r3
        L8:
            if (r0 >= r4) goto L15
            r1 = r2[r0]
            byte r1 = flip(r1)
            r2[r0] = r1
            int r0 = r0 + 1
            goto L8
        L15:
            java.util.Arrays.sort(r2, r3, r4)
        L18:
            if (r3 >= r4) goto L25
            r0 = r2[r3]
            byte r0 = flip(r0)
            r2[r3] = r0
            int r3 = r3 + 1
            goto L18
        L25:
            return
    }

    public static void sortDescending(byte[] r2) {
            com.google.common.base.Preconditions.checkNotNull(r2)
            int r0 = r2.length
            r1 = 0
            sortDescending(r2, r1, r0)
            return
    }

    public static void sortDescending(byte[] r2, int r3, int r4) {
            com.google.common.base.Preconditions.checkNotNull(r2)
            int r0 = r2.length
            com.google.common.base.Preconditions.checkPositionIndexes(r3, r4, r0)
            r0 = r3
        L8:
            if (r0 >= r4) goto L14
            r1 = r2[r0]
            r1 = r1 ^ 127(0x7f, float:1.78E-43)
            byte r1 = (byte) r1
            r2[r0] = r1
            int r0 = r0 + 1
            goto L8
        L14:
            java.util.Arrays.sort(r2, r3, r4)
        L17:
            if (r3 >= r4) goto L23
            r0 = r2[r3]
            r0 = r0 ^ 127(0x7f, float:1.78E-43)
            byte r0 = (byte) r0
            r2[r3] = r0
            int r3 = r3 + 1
            goto L17
        L23:
            return
    }

    public static int toInt(byte r0) {
            r0 = r0 & 255(0xff, float:3.57E-43)
            return r0
    }

    @com.google.common.annotations.Beta
    public static java.lang.String toString(byte r1) {
            r0 = 10
            java.lang.String r1 = toString(r1, r0)
            return r1
    }

    @com.google.common.annotations.Beta
    public static java.lang.String toString(byte r2, int r3) {
            r0 = 2
            if (r3 < r0) goto L9
            r0 = 36
            if (r3 > r0) goto L9
            r0 = 1
            goto La
        L9:
            r0 = 0
        La:
            java.lang.String r1 = "radix (%s) must be between Character.MIN_RADIX and Character.MAX_RADIX"
            com.google.common.base.Preconditions.checkArgument(r0, r1, r3)
            int r2 = toInt(r2)
            java.lang.String r2 = java.lang.Integer.toString(r2, r3)
            return r2
    }
}
