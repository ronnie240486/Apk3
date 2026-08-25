package com.google.common.primitives;

/* JADX INFO: loaded from: classes3.dex */
@com.google.common.primitives.ElementTypesAreNonnullByDefault
@com.google.common.annotations.GwtCompatible(emulated = true)
public final class Doubles extends com.google.common.primitives.DoublesMethodsForWeb {
    public static final int BYTES = 8;

    @com.google.common.annotations.GwtIncompatible
    public static final java.util.regex.Pattern FLOATING_POINT_PATTERN = null;

    /* JADX INFO: loaded from: classes2.dex */
    @com.google.common.annotations.GwtCompatible
    public static class DoubleArrayAsList extends java.util.AbstractList<java.lang.Double> implements java.util.RandomAccess, java.io.Serializable {
        private static final long serialVersionUID = 0;
        public final double[] array;
        public final int end;
        public final int start;

        public DoubleArrayAsList(double[] r2) {
                r1 = this;
                int r0 = r2.length
                r1.<init>()
                r1.array = r2
                r2 = 0
                r1.start = r2
                r1.end = r0
                return
        }

        public DoubleArrayAsList(double[] r1, int r2, int r3) {
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
                boolean r0 = r5 instanceof java.lang.Double
                if (r0 == 0) goto L19
                double[] r0 = r4.array
                java.lang.Double r5 = (java.lang.Double) r5
                double r1 = r5.doubleValue()
                int r5 = r4.start
                int r3 = r4.end
                int r5 = com.google.common.primitives.Doubles.access$000(r0, r1, r5, r3)
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
                boolean r1 = r10 instanceof com.google.common.primitives.Doubles.DoubleArrayAsList
                if (r1 == 0) goto L30
                com.google.common.primitives.Doubles$DoubleArrayAsList r10 = (com.google.common.primitives.Doubles.DoubleArrayAsList) r10
                int r1 = r9.size()
                int r2 = r10.size()
                r3 = 0
                if (r2 == r1) goto L16
                return r3
            L16:
                r2 = 0
            L17:
                if (r2 >= r1) goto L2f
                double[] r4 = r9.array
                int r5 = r9.start
                int r5 = r5 + r2
                r5 = r4[r5]
                double[] r4 = r10.array
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
        public java.lang.Double get(int r4) {
                r3 = this;
                int r0 = r3.size()
                com.google.common.base.Preconditions.checkElementIndex(r4, r0)
                double[] r0 = r3.array
                int r1 = r3.start
                int r1 = r1 + r4
                r1 = r0[r1]
                java.lang.Double r4 = java.lang.Double.valueOf(r1)
                return r4
        }

        @Override // java.util.AbstractList, java.util.List
        public /* bridge */ /* synthetic */ java.lang.Object get(int r1) {
                r0 = this;
                java.lang.Double r1 = r0.get(r1)
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
                double[] r2 = r5.array
                r3 = r2[r0]
                int r2 = com.google.common.primitives.Doubles.hashCode(r3)
                int r1 = r1 + r2
                int r0 = r0 + 1
                goto L3
            L15:
                return r1
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(@javax.annotation.CheckForNull java.lang.Object r5) {
                r4 = this;
                boolean r0 = r5 instanceof java.lang.Double
                if (r0 == 0) goto L1a
                double[] r0 = r4.array
                java.lang.Double r5 = (java.lang.Double) r5
                double r1 = r5.doubleValue()
                int r5 = r4.start
                int r3 = r4.end
                int r5 = com.google.common.primitives.Doubles.access$000(r0, r1, r5, r3)
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
                boolean r0 = r5 instanceof java.lang.Double
                if (r0 == 0) goto L1a
                double[] r0 = r4.array
                java.lang.Double r5 = (java.lang.Double) r5
                double r1 = r5.doubleValue()
                int r5 = r4.start
                int r3 = r4.end
                int r5 = com.google.common.primitives.Doubles.access$100(r0, r1, r5, r3)
                if (r5 < 0) goto L1a
                int r0 = r4.start
                int r5 = r5 - r0
                return r5
            L1a:
                r5 = -1
                return r5
        }

        public java.lang.Double set(int r5, java.lang.Double r6) {
                r4 = this;
                int r0 = r4.size()
                com.google.common.base.Preconditions.checkElementIndex(r5, r0)
                double[] r0 = r4.array
                int r1 = r4.start
                int r2 = r1 + r5
                r2 = r0[r2]
                int r1 = r1 + r5
                java.lang.Object r5 = com.google.common.base.Preconditions.checkNotNull(r6)
                java.lang.Double r5 = (java.lang.Double) r5
                double r5 = r5.doubleValue()
                r0[r1] = r5
                java.lang.Double r5 = java.lang.Double.valueOf(r2)
                return r5
        }

        @Override // java.util.AbstractList, java.util.List
        public /* bridge */ /* synthetic */ java.lang.Object set(int r1, java.lang.Object r2) {
                r0 = this;
                java.lang.Double r2 = (java.lang.Double) r2
                java.lang.Double r1 = r0.set(r1, r2)
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
        public java.util.List<java.lang.Double> subList(int r4, int r5) {
                r3 = this;
                int r0 = r3.size()
                com.google.common.base.Preconditions.checkPositionIndexes(r4, r5, r0)
                if (r4 != r5) goto Le
                java.util.List r4 = java.util.Collections.emptyList()
                return r4
            Le:
                com.google.common.primitives.Doubles$DoubleArrayAsList r0 = new com.google.common.primitives.Doubles$DoubleArrayAsList
                double[] r1 = r3.array
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
                int r1 = r1 * 12
                r0.<init>(r1)
                r1 = 91
                r0.append(r1)
                double[] r1 = r5.array
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
                double[] r2 = r5.array
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

    /* JADX INFO: loaded from: classes2.dex */
    public static final class DoubleConverter extends com.google.common.base.Converter<java.lang.String, java.lang.Double> implements java.io.Serializable {
        public static final com.google.common.primitives.Doubles.DoubleConverter INSTANCE = null;
        private static final long serialVersionUID = 1;

        static {
                com.google.common.primitives.Doubles$DoubleConverter r0 = new com.google.common.primitives.Doubles$DoubleConverter
                r0.<init>()
                com.google.common.primitives.Doubles.DoubleConverter.INSTANCE = r0
                return
        }

        private DoubleConverter() {
                r0 = this;
                r0.<init>()
                return
        }

        private java.lang.Object readResolve() {
                r1 = this;
                com.google.common.primitives.Doubles$DoubleConverter r0 = com.google.common.primitives.Doubles.DoubleConverter.INSTANCE
                return r0
        }

        @Override // com.google.common.base.Converter
        public final java.lang.String doBackward(java.lang.Double r1) {
                r0 = this;
                java.lang.Double r1 = (java.lang.Double) r1
                java.lang.String r1 = r1.toString()
                return r1
        }

        @Override // com.google.common.base.Converter
        public final java.lang.Double doForward(java.lang.String r1) {
                r0 = this;
                java.lang.String r1 = (java.lang.String) r1
                java.lang.Double r1 = java.lang.Double.valueOf(r1)
                return r1
        }

        public java.lang.String toString() {
                r1 = this;
                java.lang.String r0 = "Doubles.stringConverter()"
                return r0
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static final enum LexicographicalComparator extends java.lang.Enum<com.google.common.primitives.Doubles.LexicographicalComparator> implements java.util.Comparator<double[]> {
        private static final /* synthetic */ com.google.common.primitives.Doubles.LexicographicalComparator[] $VALUES = null;
        public static final com.google.common.primitives.Doubles.LexicographicalComparator INSTANCE = null;

        private static /* synthetic */ com.google.common.primitives.Doubles.LexicographicalComparator[] $values() {
                r0 = 1
                com.google.common.primitives.Doubles$LexicographicalComparator[] r0 = new com.google.common.primitives.Doubles.LexicographicalComparator[r0]
                com.google.common.primitives.Doubles$LexicographicalComparator r1 = com.google.common.primitives.Doubles.LexicographicalComparator.INSTANCE
                r2 = 0
                r0[r2] = r1
                return r0
        }

        static {
                com.google.common.primitives.Doubles$LexicographicalComparator r0 = new com.google.common.primitives.Doubles$LexicographicalComparator
                java.lang.String r1 = "INSTANCE"
                r2 = 0
                r0.<init>(r1, r2)
                com.google.common.primitives.Doubles.LexicographicalComparator.INSTANCE = r0
                com.google.common.primitives.Doubles$LexicographicalComparator[] r0 = $values()
                com.google.common.primitives.Doubles.LexicographicalComparator.$VALUES = r0
                return
        }

        private LexicographicalComparator(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.google.common.primitives.Doubles.LexicographicalComparator valueOf(java.lang.String r1) {
                java.lang.Class<com.google.common.primitives.Doubles$LexicographicalComparator> r0 = com.google.common.primitives.Doubles.LexicographicalComparator.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.google.common.primitives.Doubles$LexicographicalComparator r1 = (com.google.common.primitives.Doubles.LexicographicalComparator) r1
                return r1
        }

        public static com.google.common.primitives.Doubles.LexicographicalComparator[] values() {
                com.google.common.primitives.Doubles$LexicographicalComparator[] r0 = com.google.common.primitives.Doubles.LexicographicalComparator.$VALUES
                java.lang.Object r0 = r0.clone()
                com.google.common.primitives.Doubles$LexicographicalComparator[] r0 = (com.google.common.primitives.Doubles.LexicographicalComparator[]) r0
                return r0
        }

        @Override // java.util.Comparator
        public /* bridge */ /* synthetic */ int compare(double[] r1, double[] r2) {
                r0 = this;
                double[] r1 = (double[]) r1
                double[] r2 = (double[]) r2
                int r1 = r0.compare2(r1, r2)
                return r1
        }

        /* JADX INFO: renamed from: compare, reason: avoid collision after fix types in other method */
        public int compare2(double[] r7, double[] r8) {
                r6 = this;
                int r0 = r7.length
                int r1 = r8.length
                int r0 = java.lang.Math.min(r0, r1)
                r1 = 0
            L7:
                if (r1 >= r0) goto L17
                r2 = r7[r1]
                r4 = r8[r1]
                int r2 = java.lang.Double.compare(r2, r4)
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
                java.lang.String r0 = "Doubles.lexicographicalComparator()"
                return r0
        }
    }

    static {
            java.util.regex.Pattern r0 = fpPattern()
            com.google.common.primitives.Doubles.FLOATING_POINT_PATTERN = r0
            return
    }

    private Doubles() {
            r0 = this;
            r0.<init>()
            return
    }

    public static /* synthetic */ int access$000(double[] r0, double r1, int r3, int r4) {
            int r0 = indexOf(r0, r1, r3, r4)
            return r0
    }

    public static /* synthetic */ int access$100(double[] r0, double r1, int r3, int r4) {
            int r0 = lastIndexOf(r0, r1, r3, r4)
            return r0
    }

    public static java.util.List<java.lang.Double> asList(double... r1) {
            int r0 = r1.length
            if (r0 != 0) goto L8
            java.util.List r1 = java.util.Collections.emptyList()
            return r1
        L8:
            com.google.common.primitives.Doubles$DoubleArrayAsList r0 = new com.google.common.primitives.Doubles$DoubleArrayAsList
            r0.<init>(r1)
            return r0
    }

    public static int compare(double r0, double r2) {
            int r0 = java.lang.Double.compare(r0, r2)
            return r0
    }

    public static double[] concat(double[]... r7) {
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
            double[] r0 = new double[r3]
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
    public static double constrainToRange(double r1, double r3, double r5) {
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 > 0) goto Ld
            double r1 = java.lang.Math.max(r1, r3)
            double r1 = java.lang.Math.min(r1, r5)
            return r1
        Ld:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r0 = 0
            java.lang.Double r3 = java.lang.Double.valueOf(r3)
            r2[r0] = r3
            r3 = 1
            java.lang.Double r4 = java.lang.Double.valueOf(r5)
            r2[r3] = r4
            java.lang.String r3 = "min (%s) must be less than or equal to max (%s)"
            java.lang.String r2 = com.google.common.base.Strings.lenientFormat(r3, r2)
            r1.<init>(r2)
            throw r1
    }

    public static boolean contains(double[] r6, double r7) {
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

    public static double[] ensureCapacity(double[] r4, int r5, int r6) {
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
            double[] r4 = java.util.Arrays.copyOf(r4, r5)
        L1d:
            return r4
    }

    @com.google.common.annotations.GwtIncompatible
    private static java.util.regex.Pattern fpPattern() {
            java.lang.String r0 = "(?:\\d+#(?:\\.\\d*#)?|\\.\\d+#)"
            java.lang.String r1 = "(?:[eE][+-]?\\d+#)?[fFdD]?"
            java.lang.String r0 = r0.concat(r1)
            r1 = 23
            int r1 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r0, r1)
            java.lang.String r2 = "0[xX](?:[0-9a-fA-F]+#(?:\\.[0-9a-fA-F]*#)?|\\.[0-9a-fA-F]+#)[pP][+-]?\\d+#[fFdD]?"
            int r1 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r2, r1)
            java.lang.String r3 = "[+-]?(?:NaN|Infinity|"
            java.lang.String r4 = "|"
            java.lang.StringBuilder r0 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m1624m(r1, r3, r0, r4, r2)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "#"
            java.lang.String r2 = "+"
            java.lang.String r0 = r0.replace(r1, r2)
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            return r0
    }

    public static int hashCode(double r0) {
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            int r0 = r0.hashCode()
            return r0
    }

    public static int indexOf(double[] r2, double r3) {
            int r0 = r2.length
            r1 = 0
            int r2 = indexOf(r2, r3, r1, r0)
            return r2
    }

    private static int indexOf(double[] r3, double r4, int r6, int r7) {
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

    public static int indexOf(double[] r8, double[] r9) {
            java.lang.String r0 = "array"
            com.google.common.base.Preconditions.checkNotNull(r8, r0)
            java.lang.String r0 = "target"
            com.google.common.base.Preconditions.checkNotNull(r9, r0)
            int r0 = r9.length
            r1 = 0
            if (r0 != 0) goto Lf
            return r1
        Lf:
            r0 = 0
        L10:
            int r2 = r8.length
            int r3 = r9.length
            int r2 = r2 - r3
            int r2 = r2 + 1
            if (r0 >= r2) goto L2c
            r2 = 0
        L18:
            int r3 = r9.length
            if (r2 >= r3) goto L2b
            int r3 = r0 + r2
            r3 = r8[r3]
            r5 = r9[r2]
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 == 0) goto L28
            int r0 = r0 + 1
            goto L10
        L28:
            int r2 = r2 + 1
            goto L18
        L2b:
            return r0
        L2c:
            r8 = -1
            return r8
    }

    public static boolean isFinite(double r3) {
            r0 = -4503599627370496(0xfff0000000000000, double:-Infinity)
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 >= 0) goto Le
            r0 = 9218868437227405312(0x7ff0000000000000, double:Infinity)
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 >= 0) goto Le
            r3 = 1
            goto Lf
        Le:
            r3 = 0
        Lf:
            return r3
    }

    public static java.lang.String join(java.lang.String r4, double... r5) {
            com.google.common.base.Preconditions.checkNotNull(r4)
            int r0 = r5.length
            if (r0 != 0) goto L9
            java.lang.String r4 = ""
            return r4
        L9:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r1 = r5.length
            int r1 = r1 * 12
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

    public static int lastIndexOf(double[] r2, double r3) {
            int r0 = r2.length
            r1 = 0
            int r2 = lastIndexOf(r2, r3, r1, r0)
            return r2
    }

    private static int lastIndexOf(double[] r3, double r4, int r6, int r7) {
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

    public static java.util.Comparator<double[]> lexicographicalComparator() {
            com.google.common.primitives.Doubles$LexicographicalComparator r0 = com.google.common.primitives.Doubles.LexicographicalComparator.INSTANCE
            return r0
    }

    @com.google.common.annotations.GwtIncompatible("Available in GWT! Annotation is to avoid conflict with GWT specialization of base class.")
    public static double max(double... r5) {
            int r0 = r5.length
            r1 = 0
            r2 = 1
            if (r0 <= 0) goto L7
            r0 = 1
            goto L8
        L7:
            r0 = 0
        L8:
            com.google.common.base.Preconditions.checkArgument(r0)
            r0 = r5[r1]
        Ld:
            int r3 = r5.length
            if (r2 >= r3) goto L19
            r3 = r5[r2]
            double r0 = java.lang.Math.max(r0, r3)
            int r2 = r2 + 1
            goto Ld
        L19:
            return r0
    }

    @com.google.common.annotations.GwtIncompatible("Available in GWT! Annotation is to avoid conflict with GWT specialization of base class.")
    public static double min(double... r5) {
            int r0 = r5.length
            r1 = 0
            r2 = 1
            if (r0 <= 0) goto L7
            r0 = 1
            goto L8
        L7:
            r0 = 0
        L8:
            com.google.common.base.Preconditions.checkArgument(r0)
            r0 = r5[r1]
        Ld:
            int r3 = r5.length
            if (r2 >= r3) goto L19
            r3 = r5[r2]
            double r0 = java.lang.Math.min(r0, r3)
            int r2 = r2 + 1
            goto Ld
        L19:
            return r0
    }

    public static void reverse(double[] r2) {
            com.google.common.base.Preconditions.checkNotNull(r2)
            int r0 = r2.length
            r1 = 0
            reverse(r2, r1, r0)
            return
    }

    public static void reverse(double[] r4, int r5, int r6) {
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

    public static void sortDescending(double[] r2) {
            com.google.common.base.Preconditions.checkNotNull(r2)
            int r0 = r2.length
            r1 = 0
            sortDescending(r2, r1, r0)
            return
    }

    public static void sortDescending(double[] r1, int r2, int r3) {
            com.google.common.base.Preconditions.checkNotNull(r1)
            int r0 = r1.length
            com.google.common.base.Preconditions.checkPositionIndexes(r2, r3, r0)
            java.util.Arrays.sort(r1, r2, r3)
            reverse(r1, r2, r3)
            return
    }

    @com.google.common.annotations.Beta
    public static com.google.common.base.Converter<java.lang.String, java.lang.Double> stringConverter() {
            com.google.common.primitives.Doubles$DoubleConverter r0 = com.google.common.primitives.Doubles.DoubleConverter.INSTANCE
            return r0
    }

    public static double[] toArray(java.util.Collection<? extends java.lang.Number> r5) {
            boolean r0 = r5 instanceof com.google.common.primitives.Doubles.DoubleArrayAsList
            if (r0 == 0) goto L11
            com.google.common.primitives.Doubles$DoubleArrayAsList r5 = (com.google.common.primitives.Doubles.DoubleArrayAsList) r5
            double[] r0 = r5.array
            int r1 = r5.start
            int r5 = r5.end
            double[] r5 = java.util.Arrays.copyOfRange(r0, r1, r5)
            return r5
        L11:
            java.lang.Object[] r5 = r5.toArray()
            int r0 = r5.length
            double[] r1 = new double[r0]
            r2 = 0
        L19:
            if (r2 >= r0) goto L2c
            r3 = r5[r2]
            java.lang.Object r3 = com.google.common.base.Preconditions.checkNotNull(r3)
            java.lang.Number r3 = (java.lang.Number) r3
            double r3 = r3.doubleValue()
            r1[r2] = r3
            int r2 = r2 + 1
            goto L19
        L2c:
            return r1
    }

    @com.google.common.annotations.Beta
    @javax.annotation.CheckForNull
    @com.google.common.annotations.GwtIncompatible
    public static java.lang.Double tryParse(java.lang.String r2) {
            java.util.regex.Pattern r0 = com.google.common.primitives.Doubles.FLOATING_POINT_PATTERN
            java.util.regex.Matcher r0 = r0.matcher(r2)
            boolean r0 = r0.matches()
            if (r0 == 0) goto L15
            double r0 = java.lang.Double.parseDouble(r2)     // Catch: java.lang.NumberFormatException -> L15
            java.lang.Double r2 = java.lang.Double.valueOf(r0)     // Catch: java.lang.NumberFormatException -> L15
            return r2
        L15:
            r2 = 0
            return r2
    }
}
