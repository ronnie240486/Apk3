package com.google.common.primitives;

/* JADX INFO: loaded from: classes2.dex */
@com.google.common.primitives.ElementTypesAreNonnullByDefault
@com.google.common.annotations.GwtCompatible
public final class Longs {
    public static final int BYTES = 8;
    public static final long MAX_POWER_OF_TWO = 4611686018427387904L;

    public static final class AsciiDigits {
        private static final byte[] asciiDigits = null;

        static {
                r0 = 128(0x80, float:1.8E-43)
                byte[] r0 = new byte[r0]
                r1 = -1
                java.util.Arrays.fill(r0, r1)
                r1 = 0
                r2 = 0
            La:
                r3 = 10
                if (r2 >= r3) goto L16
                int r3 = r2 + 48
                byte r4 = (byte) r2
                r0[r3] = r4
                int r2 = r2 + 1
                goto La
            L16:
                r2 = 26
                if (r1 >= r2) goto L28
                int r2 = r1 + 65
                int r3 = r1 + 10
                byte r3 = (byte) r3
                r0[r2] = r3
                int r2 = r1 + 97
                r0[r2] = r3
                int r1 = r1 + 1
                goto L16
            L28:
                com.google.common.primitives.Longs.AsciiDigits.asciiDigits = r0
                return
        }

        private AsciiDigits() {
                r0 = this;
                r0.<init>()
                return
        }

        public static int digit(char r1) {
                r0 = 128(0x80, float:1.8E-43)
                if (r1 >= r0) goto L9
                byte[] r0 = com.google.common.primitives.Longs.AsciiDigits.asciiDigits
                r1 = r0[r1]
                goto La
            L9:
                r1 = -1
            La:
                return r1
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static final enum LexicographicalComparator extends java.lang.Enum<com.google.common.primitives.Longs.LexicographicalComparator> implements java.util.Comparator<long[]> {
        private static final /* synthetic */ com.google.common.primitives.Longs.LexicographicalComparator[] $VALUES = null;
        public static final com.google.common.primitives.Longs.LexicographicalComparator INSTANCE = null;

        private static /* synthetic */ com.google.common.primitives.Longs.LexicographicalComparator[] $values() {
                r0 = 1
                com.google.common.primitives.Longs$LexicographicalComparator[] r0 = new com.google.common.primitives.Longs.LexicographicalComparator[r0]
                com.google.common.primitives.Longs$LexicographicalComparator r1 = com.google.common.primitives.Longs.LexicographicalComparator.INSTANCE
                r2 = 0
                r0[r2] = r1
                return r0
        }

        static {
                com.google.common.primitives.Longs$LexicographicalComparator r0 = new com.google.common.primitives.Longs$LexicographicalComparator
                java.lang.String r1 = "INSTANCE"
                r2 = 0
                r0.<init>(r1, r2)
                com.google.common.primitives.Longs.LexicographicalComparator.INSTANCE = r0
                com.google.common.primitives.Longs$LexicographicalComparator[] r0 = $values()
                com.google.common.primitives.Longs.LexicographicalComparator.$VALUES = r0
                return
        }

        private LexicographicalComparator(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.google.common.primitives.Longs.LexicographicalComparator valueOf(java.lang.String r1) {
                java.lang.Class<com.google.common.primitives.Longs$LexicographicalComparator> r0 = com.google.common.primitives.Longs.LexicographicalComparator.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.google.common.primitives.Longs$LexicographicalComparator r1 = (com.google.common.primitives.Longs.LexicographicalComparator) r1
                return r1
        }

        public static com.google.common.primitives.Longs.LexicographicalComparator[] values() {
                com.google.common.primitives.Longs$LexicographicalComparator[] r0 = com.google.common.primitives.Longs.LexicographicalComparator.$VALUES
                java.lang.Object r0 = r0.clone()
                com.google.common.primitives.Longs$LexicographicalComparator[] r0 = (com.google.common.primitives.Longs.LexicographicalComparator[]) r0
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
        public int compare2(long[] r7, long[] r8) {
                r6 = this;
                int r0 = r7.length
                int r1 = r8.length
                int r0 = java.lang.Math.min(r0, r1)
                r1 = 0
            L7:
                if (r1 >= r0) goto L17
                r2 = r7[r1]
                r4 = r8[r1]
                int r2 = com.google.common.primitives.Longs.compare(r2, r4)
                if (r2 == 0) goto L14
                return r2
            L14:
                int r1 = r1 + 1
                goto L7
            L17:
                int r7 = r7.length
                int r8 = r8.length
                int r7 = r7 - r8
                return r7
        }

        @Override // java.lang.Enum
        public java.lang.String toString() {
                r1 = this;
                java.lang.String r0 = "Longs.lexicographicalComparator()"
                return r0
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    @com.google.common.annotations.GwtCompatible
    public static class LongArrayAsList extends java.util.AbstractList<java.lang.Long> implements java.util.RandomAccess, java.io.Serializable {
        private static final long serialVersionUID = 0;
        public final long[] array;
        public final int end;
        public final int start;

        public LongArrayAsList(long[] r2) {
                r1 = this;
                int r0 = r2.length
                r1.<init>()
                r1.array = r2
                r2 = 0
                r1.start = r2
                r1.end = r0
                return
        }

        public LongArrayAsList(long[] r1, int r2, int r3) {
                r0 = this;
                r0.<init>()
                r0.array = r1
                r0.start = r2
                r0.end = r3
                return
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(@javax.annotation.CheckForNull java.lang.Object r5) {
                r4 = this;
                boolean r0 = r5 instanceof java.lang.Long
                if (r0 == 0) goto L19
                long[] r0 = r4.array
                java.lang.Long r5 = (java.lang.Long) r5
                long r1 = r5.longValue()
                int r5 = r4.start
                int r3 = r4.end
                int r5 = com.google.common.primitives.Longs.access$000(r0, r1, r5, r3)
                r0 = -1
                if (r5 == r0) goto L19
                r5 = 1
                goto L1a
            L19:
                r5 = 0
            L1a:
                return r5
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(@javax.annotation.CheckForNull java.lang.Object r10) {
                r9 = this;
                r0 = 1
                if (r10 != r9) goto L4
                return r0
            L4:
                boolean r1 = r10 instanceof com.google.common.primitives.Longs.LongArrayAsList
                if (r1 == 0) goto L30
                com.google.common.primitives.Longs$LongArrayAsList r10 = (com.google.common.primitives.Longs.LongArrayAsList) r10
                int r1 = r9.size()
                int r2 = r10.size()
                r3 = 0
                if (r2 == r1) goto L16
                return r3
            L16:
                r2 = 0
            L17:
                if (r2 >= r1) goto L2f
                long[] r4 = r9.array
                int r5 = r9.start
                int r5 = r5 + r2
                r5 = r4[r5]
                long[] r4 = r10.array
                int r7 = r10.start
                int r7 = r7 + r2
                r7 = r4[r7]
                int r4 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                if (r4 == 0) goto L2c
                return r3
            L2c:
                int r2 = r2 + 1
                goto L17
            L2f:
                return r0
            L30:
                boolean r10 = super.equals(r10)
                return r10
        }

        @Override // java.util.AbstractList, java.util.List
        public java.lang.Long get(int r4) {
                r3 = this;
                int r0 = r3.size()
                com.google.common.base.Preconditions.checkElementIndex(r4, r0)
                long[] r0 = r3.array
                int r1 = r3.start
                int r1 = r1 + r4
                r1 = r0[r1]
                java.lang.Long r4 = java.lang.Long.valueOf(r1)
                return r4
        }

        @Override // java.util.AbstractList, java.util.List
        public /* bridge */ /* synthetic */ java.lang.Object get(int r1) {
                r0 = this;
                java.lang.Long r1 = r0.get(r1)
                return r1
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
                r5 = this;
                int r0 = r5.start
                r1 = 1
            L3:
                int r2 = r5.end
                if (r0 >= r2) goto L15
                int r1 = r1 * 31
                long[] r2 = r5.array
                r3 = r2[r0]
                int r2 = com.google.common.primitives.Longs.hashCode(r3)
                int r1 = r1 + r2
                int r0 = r0 + 1
                goto L3
            L15:
                return r1
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(@javax.annotation.CheckForNull java.lang.Object r5) {
                r4 = this;
                boolean r0 = r5 instanceof java.lang.Long
                if (r0 == 0) goto L1a
                long[] r0 = r4.array
                java.lang.Long r5 = (java.lang.Long) r5
                long r1 = r5.longValue()
                int r5 = r4.start
                int r3 = r4.end
                int r5 = com.google.common.primitives.Longs.access$000(r0, r1, r5, r3)
                if (r5 < 0) goto L1a
                int r0 = r4.start
                int r5 = r5 - r0
                return r5
            L1a:
                r5 = -1
                return r5
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(@javax.annotation.CheckForNull java.lang.Object r5) {
                r4 = this;
                boolean r0 = r5 instanceof java.lang.Long
                if (r0 == 0) goto L1a
                long[] r0 = r4.array
                java.lang.Long r5 = (java.lang.Long) r5
                long r1 = r5.longValue()
                int r5 = r4.start
                int r3 = r4.end
                int r5 = com.google.common.primitives.Longs.access$100(r0, r1, r5, r3)
                if (r5 < 0) goto L1a
                int r0 = r4.start
                int r5 = r5 - r0
                return r5
            L1a:
                r5 = -1
                return r5
        }

        public java.lang.Long set(int r5, java.lang.Long r6) {
                r4 = this;
                int r0 = r4.size()
                com.google.common.base.Preconditions.checkElementIndex(r5, r0)
                long[] r0 = r4.array
                int r1 = r4.start
                int r2 = r1 + r5
                r2 = r0[r2]
                int r1 = r1 + r5
                java.lang.Object r5 = com.google.common.base.Preconditions.checkNotNull(r6)
                java.lang.Long r5 = (java.lang.Long) r5
                long r5 = r5.longValue()
                r0[r1] = r5
                java.lang.Long r5 = java.lang.Long.valueOf(r2)
                return r5
        }

        @Override // java.util.AbstractList, java.util.List
        public /* bridge */ /* synthetic */ java.lang.Object set(int r1, java.lang.Object r2) {
                r0 = this;
                java.lang.Long r2 = (java.lang.Long) r2
                java.lang.Long r1 = r0.set(r1, r2)
                return r1
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
                r2 = this;
                int r0 = r2.end
                int r1 = r2.start
                int r0 = r0 - r1
                return r0
        }

        @Override // java.util.AbstractList, java.util.List
        public java.util.List<java.lang.Long> subList(int r4, int r5) {
                r3 = this;
                int r0 = r3.size()
                com.google.common.base.Preconditions.checkPositionIndexes(r4, r5, r0)
                if (r4 != r5) goto Le
                java.util.List r4 = java.util.Collections.emptyList()
                return r4
            Le:
                com.google.common.primitives.Longs$LongArrayAsList r0 = new com.google.common.primitives.Longs$LongArrayAsList
                long[] r1 = r3.array
                int r2 = r3.start
                int r4 = r4 + r2
                int r2 = r2 + r5
                r0.<init>(r1, r4, r2)
                return r0
        }

        @Override // java.util.AbstractCollection
        public java.lang.String toString() {
                r5 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                int r1 = r5.size()
                int r1 = r1 * 10
                r0.<init>(r1)
                r1 = 91
                r0.append(r1)
                long[] r1 = r5.array
                int r2 = r5.start
                r2 = r1[r2]
                r0.append(r2)
                int r1 = r5.start
            L1b:
                int r1 = r1 + 1
                int r2 = r5.end
                if (r1 >= r2) goto L2e
                java.lang.String r2 = ", "
                r0.append(r2)
                long[] r2 = r5.array
                r3 = r2[r1]
                r0.append(r3)
                goto L1b
            L2e:
                r1 = 93
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    public static final class LongConverter extends com.google.common.base.Converter<java.lang.String, java.lang.Long> implements java.io.Serializable {
        public static final com.google.common.primitives.Longs.LongConverter INSTANCE = null;
        private static final long serialVersionUID = 1;

        static {
                com.google.common.primitives.Longs$LongConverter r0 = new com.google.common.primitives.Longs$LongConverter
                r0.<init>()
                com.google.common.primitives.Longs.LongConverter.INSTANCE = r0
                return
        }

        private LongConverter() {
                r0 = this;
                r0.<init>()
                return
        }

        private java.lang.Object readResolve() {
                r1 = this;
                com.google.common.primitives.Longs$LongConverter r0 = com.google.common.primitives.Longs.LongConverter.INSTANCE
                return r0
        }

        @Override // com.google.common.base.Converter
        public final java.lang.String doBackward(java.lang.Long r1) {
                r0 = this;
                java.lang.Long r1 = (java.lang.Long) r1
                java.lang.String r1 = r1.toString()
                return r1
        }

        @Override // com.google.common.base.Converter
        public final java.lang.Long doForward(java.lang.String r1) {
                r0 = this;
                java.lang.String r1 = (java.lang.String) r1
                java.lang.Long r1 = java.lang.Long.decode(r1)
                return r1
        }

        public java.lang.String toString() {
                r1 = this;
                java.lang.String r0 = "Longs.stringConverter()"
                return r0
        }
    }

    private Longs() {
            r0 = this;
            r0.<init>()
            return
    }

    public static /* synthetic */ int access$000(long[] r0, long r1, int r3, int r4) {
            int r0 = indexOf(r0, r1, r3, r4)
            return r0
    }

    public static /* synthetic */ int access$100(long[] r0, long r1, int r3, int r4) {
            int r0 = lastIndexOf(r0, r1, r3, r4)
            return r0
    }

    public static java.util.List<java.lang.Long> asList(long... r1) {
            int r0 = r1.length
            if (r0 != 0) goto L8
            java.util.List r1 = java.util.Collections.emptyList()
            return r1
        L8:
            com.google.common.primitives.Longs$LongArrayAsList r0 = new com.google.common.primitives.Longs$LongArrayAsList
            r0.<init>(r1)
            return r0
    }

    public static int compare(long r1, long r3) {
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 >= 0) goto L6
            r1 = -1
            goto Lb
        L6:
            if (r0 <= 0) goto La
            r1 = 1
            goto Lb
        La:
            r1 = 0
        Lb:
            return r1
    }

    public static long[] concat(long[]... r7) {
            int r0 = r7.length
            r1 = 0
            r2 = 0
            r3 = 0
        L4:
            if (r2 >= r0) goto Ld
            r4 = r7[r2]
            int r4 = r4.length
            int r3 = r3 + r4
            int r2 = r2 + 1
            goto L4
        Ld:
            long[] r0 = new long[r3]
            int r2 = r7.length
            r3 = 0
            r4 = 0
        L12:
            if (r3 >= r2) goto L1f
            r5 = r7[r3]
            int r6 = r5.length
            java.lang.System.arraycopy(r5, r1, r0, r4, r6)
            int r5 = r5.length
            int r4 = r4 + r5
            int r3 = r3 + 1
            goto L12
        L1f:
            return r0
    }

    @com.google.common.annotations.Beta
    public static long constrainToRange(long r7, long r9, long r11) {
            int r0 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r0 > 0) goto L7
            r0 = 1
            r1 = 1
            goto L9
        L7:
            r0 = 0
            r1 = 0
        L9:
            java.lang.String r2 = "min (%s) must be less than or equal to max (%s)"
            r3 = r9
            r5 = r11
            com.google.common.base.Preconditions.checkArgument(r1, r2, r3, r5)
            long r7 = java.lang.Math.max(r7, r9)
            long r7 = java.lang.Math.min(r7, r11)
            return r7
    }

    public static boolean contains(long[] r6, long r7) {
            int r0 = r6.length
            r1 = 0
            r2 = 0
        L3:
            if (r2 >= r0) goto L10
            r3 = r6[r2]
            int r5 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r5 != 0) goto Ld
            r6 = 1
            return r6
        Ld:
            int r2 = r2 + 1
            goto L3
        L10:
            return r1
    }

    public static long[] ensureCapacity(long[] r4, int r5, int r6) {
            r0 = 1
            r1 = 0
            if (r5 < 0) goto L6
            r2 = 1
            goto L7
        L6:
            r2 = 0
        L7:
            java.lang.String r3 = "Invalid minLength: %s"
            com.google.common.base.Preconditions.checkArgument(r2, r3, r5)
            if (r6 < 0) goto Lf
            goto L10
        Lf:
            r0 = 0
        L10:
            java.lang.String r1 = "Invalid padding: %s"
            com.google.common.base.Preconditions.checkArgument(r0, r1, r6)
            int r0 = r4.length
            if (r0 >= r5) goto L1d
            int r5 = r5 + r6
            long[] r4 = java.util.Arrays.copyOf(r4, r5)
        L1d:
            return r4
    }

    public static long fromByteArray(byte[] r14) {
            int r0 = r14.length
            r1 = 1
            r2 = 0
            r3 = 8
            if (r0 < r3) goto L9
            r0 = 1
            goto La
        L9:
            r0 = 0
        La:
            int r4 = r14.length
            java.lang.String r5 = "array too small: %s < %s"
            com.google.common.base.Preconditions.checkArgument(r0, r5, r4, r3)
            r6 = r14[r2]
            r7 = r14[r1]
            r0 = 2
            r8 = r14[r0]
            r0 = 3
            r9 = r14[r0]
            r0 = 4
            r10 = r14[r0]
            r0 = 5
            r11 = r14[r0]
            r0 = 6
            r12 = r14[r0]
            r0 = 7
            r13 = r14[r0]
            long r0 = fromBytes(r6, r7, r8, r9, r10, r11, r12, r13)
            return r0
    }

    public static long fromBytes(byte r5, byte r6, byte r7, byte r8, byte r9, byte r10, byte r11, byte r12) {
            long r0 = (long) r5
            r2 = 255(0xff, double:1.26E-321)
            long r0 = r0 & r2
            r5 = 56
            long r0 = r0 << r5
            long r5 = (long) r6
            long r5 = r5 & r2
            r4 = 48
            long r5 = r5 << r4
            long r5 = r5 | r0
            long r0 = (long) r7
            long r0 = r0 & r2
            r7 = 40
            long r0 = r0 << r7
            long r5 = r5 | r0
            long r7 = (long) r8
            long r7 = r7 & r2
            r0 = 32
            long r7 = r7 << r0
            long r5 = r5 | r7
            long r7 = (long) r9
            long r7 = r7 & r2
            r9 = 24
            long r7 = r7 << r9
            long r5 = r5 | r7
            long r7 = (long) r10
            long r7 = r7 & r2
            r9 = 16
            long r7 = r7 << r9
            long r5 = r5 | r7
            long r7 = (long) r11
            long r7 = r7 & r2
            r9 = 8
            long r7 = r7 << r9
            long r5 = r5 | r7
            long r7 = (long) r12
            long r7 = r7 & r2
            long r5 = r5 | r7
            return r5
    }

    public static int hashCode(long r2) {
            r0 = 32
            long r0 = r2 >>> r0
            long r2 = r2 ^ r0
            int r3 = (int) r2
            return r3
    }

    public static int indexOf(long[] r2, long r3) {
            int r0 = r2.length
            r1 = 0
            int r2 = indexOf(r2, r3, r1, r0)
            return r2
    }

    private static int indexOf(long[] r3, long r4, int r6, int r7) {
        L0:
            if (r6 >= r7) goto Lc
            r0 = r3[r6]
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 != 0) goto L9
            return r6
        L9:
            int r6 = r6 + 1
            goto L0
        Lc:
            r3 = -1
            return r3
    }

    public static int indexOf(long[] r8, long[] r9) {
            java.lang.String r0 = "array"
            com.google.common.base.Preconditions.checkNotNull(r8, r0)
            java.lang.String r0 = "target"
            com.google.common.base.Preconditions.checkNotNull(r9, r0)
            int r0 = r9.length
            r1 = 0
            if (r0 != 0) goto L10
            return r1
        L10:
            r0 = 0
        L11:
            int r2 = r8.length
            int r3 = r9.length
            int r2 = r2 - r3
            int r2 = r2 + 1
            if (r0 >= r2) goto L2d
            r2 = 0
        L19:
            int r3 = r9.length
            if (r2 >= r3) goto L2c
            int r3 = r0 + r2
            r3 = r8[r3]
            r5 = r9[r2]
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 == 0) goto L29
            int r0 = r0 + 1
            goto L11
        L29:
            int r2 = r2 + 1
            goto L19
        L2c:
            return r0
        L2d:
            r8 = -1
            return r8
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
            int r1 = r1 * 10
            r0.<init>(r1)
            r1 = 0
            r1 = r5[r1]
            r0.append(r1)
            r1 = 1
        L18:
            int r2 = r5.length
            if (r1 >= r2) goto L26
            r0.append(r4)
            r2 = r5[r1]
            r0.append(r2)
            int r1 = r1 + 1
            goto L18
        L26:
            java.lang.String r4 = r0.toString()
            return r4
    }

    public static int lastIndexOf(long[] r2, long r3) {
            int r0 = r2.length
            r1 = 0
            int r2 = lastIndexOf(r2, r3, r1, r0)
            return r2
    }

    private static int lastIndexOf(long[] r3, long r4, int r6, int r7) {
            int r7 = r7 + (-1)
        L2:
            if (r7 < r6) goto Le
            r0 = r3[r7]
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 != 0) goto Lb
            return r7
        Lb:
            int r7 = r7 + (-1)
            goto L2
        Le:
            r3 = -1
            return r3
    }

    public static java.util.Comparator<long[]> lexicographicalComparator() {
            com.google.common.primitives.Longs$LexicographicalComparator r0 = com.google.common.primitives.Longs.LexicographicalComparator.INSTANCE
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
        Ld:
            int r3 = r6.length
            if (r2 >= r3) goto L1b
            r3 = r6[r2]
            int r5 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r5 <= 0) goto L18
            r0 = r6[r2]
        L18:
            int r2 = r2 + 1
            goto Ld
        L1b:
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
        Ld:
            int r3 = r6.length
            if (r2 >= r3) goto L1b
            r3 = r6[r2]
            int r5 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r5 >= 0) goto L18
            r0 = r6[r2]
        L18:
            int r2 = r2 + 1
            goto Ld
        L1b:
            return r0
    }

    public static void reverse(long[] r2) {
            com.google.common.base.Preconditions.checkNotNull(r2)
            int r0 = r2.length
            r1 = 0
            reverse(r2, r1, r0)
            return
    }

    public static void reverse(long[] r4, int r5, int r6) {
            com.google.common.base.Preconditions.checkNotNull(r4)
            int r0 = r4.length
            com.google.common.base.Preconditions.checkPositionIndexes(r5, r6, r0)
            int r6 = r6 + (-1)
        L9:
            if (r5 >= r6) goto L18
            r0 = r4[r5]
            r2 = r4[r6]
            r4[r5] = r2
            r4[r6] = r0
            int r5 = r5 + 1
            int r6 = r6 + (-1)
            goto L9
        L18:
            return
    }

    public static void sortDescending(long[] r2) {
            com.google.common.base.Preconditions.checkNotNull(r2)
            int r0 = r2.length
            r1 = 0
            sortDescending(r2, r1, r0)
            return
    }

    public static void sortDescending(long[] r1, int r2, int r3) {
            com.google.common.base.Preconditions.checkNotNull(r1)
            int r0 = r1.length
            com.google.common.base.Preconditions.checkPositionIndexes(r2, r3, r0)
            java.util.Arrays.sort(r1, r2, r3)
            reverse(r1, r2, r3)
            return
    }

    @com.google.common.annotations.Beta
    public static com.google.common.base.Converter<java.lang.String, java.lang.Long> stringConverter() {
            com.google.common.primitives.Longs$LongConverter r0 = com.google.common.primitives.Longs.LongConverter.INSTANCE
            return r0
    }

    public static long[] toArray(java.util.Collection<? extends java.lang.Number> r5) {
            boolean r0 = r5 instanceof com.google.common.primitives.Longs.LongArrayAsList
            if (r0 == 0) goto L11
            com.google.common.primitives.Longs$LongArrayAsList r5 = (com.google.common.primitives.Longs.LongArrayAsList) r5
            long[] r0 = r5.array
            int r1 = r5.start
            int r5 = r5.end
            long[] r5 = java.util.Arrays.copyOfRange(r0, r1, r5)
            return r5
        L11:
            java.lang.Object[] r5 = r5.toArray()
            int r0 = r5.length
            long[] r1 = new long[r0]
            r2 = 0
        L19:
            if (r2 >= r0) goto L2c
            r3 = r5[r2]
            java.lang.Object r3 = com.google.common.base.Preconditions.checkNotNull(r3)
            java.lang.Number r3 = (java.lang.Number) r3
            long r3 = r3.longValue()
            r1[r2] = r3
            int r2 = r2 + 1
            goto L19
        L2c:
            return r1
    }

    public static byte[] toByteArray(long r5) {
            r0 = 8
            byte[] r1 = new byte[r0]
            r2 = 7
        L5:
            if (r2 < 0) goto L12
            r3 = 255(0xff, double:1.26E-321)
            long r3 = r3 & r5
            int r4 = (int) r3
            byte r3 = (byte) r4
            r1[r2] = r3
            long r5 = r5 >> r0
            int r2 = r2 + (-1)
            goto L5
        L12:
            return r1
    }

    @com.google.common.annotations.Beta
    @javax.annotation.CheckForNull
    public static java.lang.Long tryParse(java.lang.String r1) {
            r0 = 10
            java.lang.Long r1 = tryParse(r1, r0)
            return r1
    }

    @com.google.common.annotations.Beta
    @javax.annotation.CheckForNull
    public static java.lang.Long tryParse(java.lang.String r18, int r19) {
            r0 = r18
            r1 = r19
            java.lang.Object r2 = com.google.common.base.Preconditions.checkNotNull(r18)
            java.lang.String r2 = (java.lang.String) r2
            boolean r2 = r2.isEmpty()
            r3 = 0
            if (r2 == 0) goto L12
            return r3
        L12:
            r2 = 2
            if (r1 < r2) goto L7a
            r2 = 36
            if (r1 > r2) goto L7a
            r2 = 0
            char r4 = r0.charAt(r2)
            r5 = 45
            if (r4 != r5) goto L23
            r2 = 1
        L23:
            int r4 = r18.length()
            if (r2 != r4) goto L2a
            return r3
        L2a:
            int r4 = r2 + 1
            char r5 = r0.charAt(r2)
            int r5 = com.google.common.primitives.Longs.AsciiDigits.digit(r5)
            if (r5 < 0) goto L79
            if (r5 < r1) goto L39
            goto L79
        L39:
            int r5 = -r5
            long r5 = (long) r5
            long r7 = (long) r1
            r9 = -9223372036854775808
            long r11 = r9 / r7
        L40:
            int r13 = r18.length()
            if (r4 >= r13) goto L67
            int r13 = r4 + 1
            char r4 = r0.charAt(r4)
            int r4 = com.google.common.primitives.Longs.AsciiDigits.digit(r4)
            if (r4 < 0) goto L66
            if (r4 >= r1) goto L66
            int r14 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r14 >= 0) goto L59
            goto L66
        L59:
            long r5 = r5 * r7
            long r14 = (long) r4
            long r16 = r14 + r9
            int r4 = (r5 > r16 ? 1 : (r5 == r16 ? 0 : -1))
            if (r4 >= 0) goto L63
            return r3
        L63:
            long r5 = r5 - r14
            r4 = r13
            goto L40
        L66:
            return r3
        L67:
            if (r2 == 0) goto L6e
            java.lang.Long r0 = java.lang.Long.valueOf(r5)
            return r0
        L6e:
            int r0 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r0 != 0) goto L73
            return r3
        L73:
            long r0 = -r5
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            return r0
        L79:
            return r3
        L7a:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r2 = 65
            java.lang.String r3 = "radix must be between MIN_RADIX and MAX_RADIX but was "
            java.lang.String r1 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r2, r3, r1)
            r0.<init>(r1)
            throw r0
    }
}
