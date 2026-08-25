package com.google.common.math;

/* JADX INFO: loaded from: classes2.dex */
@com.google.common.math.ElementTypesAreNonnullByDefault
@com.google.common.annotations.Beta
@com.google.common.annotations.GwtIncompatible
public final class Quantiles {

    /* JADX INFO: renamed from: com.google.common.math.Quantiles$1, reason: invalid class name */
    /* JADX INFO: loaded from: classes3.dex */
    public static /* synthetic */ class AnonymousClass1 {
    }

    public static final class Scale {
        private final int scale;

        private Scale(int r3) {
                r2 = this;
                r2.<init>()
                if (r3 <= 0) goto L7
                r0 = 1
                goto L8
            L7:
                r0 = 0
            L8:
                java.lang.String r1 = "Quantile scale must be positive"
                com.google.common.base.Preconditions.checkArgument(r0, r1)
                r2.scale = r3
                return
        }

        public /* synthetic */ Scale(int r1, com.google.common.math.Quantiles.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        public com.google.common.math.Quantiles.ScaleAndIndex index(int r4) {
                r3 = this;
                com.google.common.math.Quantiles$ScaleAndIndex r0 = new com.google.common.math.Quantiles$ScaleAndIndex
                int r1 = r3.scale
                r2 = 0
                r0.<init>(r1, r4, r2)
                return r0
        }

        public com.google.common.math.Quantiles.ScaleAndIndexes indexes(java.util.Collection<java.lang.Integer> r4) {
                r3 = this;
                com.google.common.math.Quantiles$ScaleAndIndexes r0 = new com.google.common.math.Quantiles$ScaleAndIndexes
                int r1 = r3.scale
                int[] r4 = com.google.common.primitives.Ints.toArray(r4)
                r2 = 0
                r0.<init>(r1, r4, r2)
                return r0
        }

        public com.google.common.math.Quantiles.ScaleAndIndexes indexes(int... r4) {
                r3 = this;
                com.google.common.math.Quantiles$ScaleAndIndexes r0 = new com.google.common.math.Quantiles$ScaleAndIndexes
                int r1 = r3.scale
                java.lang.Object r4 = r4.clone()
                int[] r4 = (int[]) r4
                r2 = 0
                r0.<init>(r1, r4, r2)
                return r0
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static final class ScaleAndIndex {
        private final int index;
        private final int scale;

        private ScaleAndIndex(int r1, int r2) {
                r0 = this;
                r0.<init>()
                com.google.common.math.Quantiles.access$300(r2, r1)
                r0.scale = r1
                r0.index = r2
                return
        }

        public /* synthetic */ ScaleAndIndex(int r1, int r2, com.google.common.math.Quantiles.AnonymousClass1 r3) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public double compute(java.util.Collection<? extends java.lang.Number> r3) {
                r2 = this;
                double[] r3 = com.google.common.primitives.Doubles.toArray(r3)
                double r0 = r2.computeInPlace(r3)
                return r0
        }

        public double compute(double... r3) {
                r2 = this;
                java.lang.Object r3 = r3.clone()
                double[] r3 = (double[]) r3
                double r0 = r2.computeInPlace(r3)
                return r0
        }

        public double compute(int... r3) {
                r2 = this;
                double[] r3 = com.google.common.math.Quantiles.access$500(r3)
                double r0 = r2.computeInPlace(r3)
                return r0
        }

        public double compute(long... r3) {
                r2 = this;
                double[] r3 = com.google.common.math.Quantiles.access$400(r3)
                double r0 = r2.computeInPlace(r3)
                return r0
        }

        public double computeInPlace(double... r14) {
                r13 = this;
                int r0 = r14.length
                r1 = 0
                r2 = 1
                if (r0 <= 0) goto L7
                r0 = 1
                goto L8
            L7:
                r0 = 0
            L8:
                java.lang.String r3 = "Cannot calculate quantiles of an empty dataset"
                com.google.common.base.Preconditions.checkArgument(r0, r3)
                boolean r0 = com.google.common.math.Quantiles.access$600(r14)
                if (r0 == 0) goto L16
                r0 = 9221120237041090560(0x7ff8000000000000, double:NaN)
                return r0
            L16:
                int r0 = r13.index
                long r3 = (long) r0
                int r0 = r14.length
                int r0 = r0 - r2
                long r5 = (long) r0
                long r3 = r3 * r5
                int r0 = r13.scale
                long r5 = (long) r0
                java.math.RoundingMode r0 = java.math.RoundingMode.DOWN
                long r5 = com.google.common.math.LongMath.divide(r3, r5, r0)
                int r0 = (int) r5
                long r5 = (long) r0
                int r7 = r13.scale
                long r7 = (long) r7
                long r5 = r5 * r7
                long r3 = r3 - r5
                int r4 = (int) r3
                int r3 = r14.length
                int r3 = r3 - r2
                com.google.common.math.Quantiles.access$700(r0, r14, r1, r3)
                if (r4 != 0) goto L3a
                r0 = r14[r0]
                return r0
            L3a:
                int r1 = r0 + 1
                int r3 = r14.length
                int r3 = r3 - r2
                com.google.common.math.Quantiles.access$700(r1, r14, r1, r3)
                r5 = r14[r0]
                r7 = r14[r1]
                double r9 = (double) r4
                int r14 = r13.scale
                double r11 = (double) r14
                double r0 = com.google.common.math.Quantiles.access$800(r5, r7, r9, r11)
                return r0
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static final class ScaleAndIndexes {
        private final int[] indexes;
        private final int scale;

        private ScaleAndIndexes(int r5, int[] r6) {
                r4 = this;
                r4.<init>()
                int r0 = r6.length
                r1 = 0
                r2 = 0
            L6:
                if (r2 >= r0) goto L10
                r3 = r6[r2]
                com.google.common.math.Quantiles.access$300(r3, r5)
                int r2 = r2 + 1
                goto L6
            L10:
                int r0 = r6.length
                if (r0 <= 0) goto L14
                r1 = 1
            L14:
                java.lang.String r0 = "Indexes must be a non empty array"
                com.google.common.base.Preconditions.checkArgument(r1, r0)
                r4.scale = r5
                r4.indexes = r6
                return
        }

        public /* synthetic */ ScaleAndIndexes(int r1, int[] r2, com.google.common.math.Quantiles.AnonymousClass1 r3) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public java.util.Map<java.lang.Integer, java.lang.Double> compute(java.util.Collection<? extends java.lang.Number> r1) {
                r0 = this;
                double[] r1 = com.google.common.primitives.Doubles.toArray(r1)
                java.util.Map r1 = r0.computeInPlace(r1)
                return r1
        }

        public java.util.Map<java.lang.Integer, java.lang.Double> compute(double... r1) {
                r0 = this;
                java.lang.Object r1 = r1.clone()
                double[] r1 = (double[]) r1
                java.util.Map r1 = r0.computeInPlace(r1)
                return r1
        }

        public java.util.Map<java.lang.Integer, java.lang.Double> compute(int... r1) {
                r0 = this;
                double[] r1 = com.google.common.math.Quantiles.access$500(r1)
                java.util.Map r1 = r0.computeInPlace(r1)
                return r1
        }

        public java.util.Map<java.lang.Integer, java.lang.Double> compute(long... r1) {
                r0 = this;
                double[] r1 = com.google.common.math.Quantiles.access$400(r1)
                java.util.Map r1 = r0.computeInPlace(r1)
                return r1
        }

        public java.util.Map<java.lang.Integer, java.lang.Double> computeInPlace(double... r18) {
                r17 = this;
                r0 = r17
                r1 = r18
                int r2 = r1.length
                r4 = 1
                if (r2 <= 0) goto La
                r2 = 1
                goto Lb
            La:
                r2 = 0
            Lb:
                java.lang.String r5 = "Cannot calculate quantiles of an empty dataset"
                com.google.common.base.Preconditions.checkArgument(r2, r5)
                boolean r2 = com.google.common.math.Quantiles.access$600(r18)
                if (r2 == 0) goto L38
                java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
                r1.<init>()
                int[] r2 = r0.indexes
                int r4 = r2.length
                r3 = 0
            L1f:
                if (r3 >= r4) goto L33
                r5 = r2[r3]
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                r6 = 9221120237041090560(0x7ff8000000000000, double:NaN)
                java.lang.Double r6 = java.lang.Double.valueOf(r6)
                r1.put(r5, r6)
                int r3 = r3 + 1
                goto L1f
            L33:
                java.util.Map r1 = java.util.Collections.unmodifiableMap(r1)
                return r1
            L38:
                int[] r2 = r0.indexes
                int r5 = r2.length
                int[] r5 = new int[r5]
                int r6 = r2.length
                int[] r6 = new int[r6]
                int r2 = r2.length
                int r2 = r2 * 2
                int[] r2 = new int[r2]
                r7 = 0
                r8 = 0
            L47:
                int[] r9 = r0.indexes
                int r10 = r9.length
                if (r7 >= r10) goto L7a
                r9 = r9[r7]
                long r9 = (long) r9
                int r11 = r1.length
                int r11 = r11 - r4
                long r11 = (long) r11
                long r9 = r9 * r11
                int r11 = r0.scale
                long r11 = (long) r11
                java.math.RoundingMode r13 = java.math.RoundingMode.DOWN
                long r11 = com.google.common.math.LongMath.divide(r9, r11, r13)
                int r12 = (int) r11
                long r13 = (long) r12
                int r11 = r0.scale
                long r3 = (long) r11
                long r13 = r13 * r3
                long r9 = r9 - r13
                int r3 = (int) r9
                r5[r7] = r12
                r6[r7] = r3
                r2[r8] = r12
                int r8 = r8 + 1
                if (r3 == 0) goto L76
                int r12 = r12 + 1
                r2[r8] = r12
                int r8 = r8 + 1
            L76:
                int r7 = r7 + 1
                r4 = 1
                goto L47
            L7a:
                r3 = 0
                java.util.Arrays.sort(r2, r3, r8)
                r4 = 1
                int r8 = r8 - r4
                int r7 = r1.length
                int r7 = r7 - r4
                com.google.common.math.Quantiles.access$900(r2, r8, r1, r7)
                java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
                r2.<init>()
            L8a:
                int[] r4 = r0.indexes
                int r7 = r4.length
                if (r3 >= r7) goto Lc4
                r7 = r5[r3]
                r8 = r6[r3]
                if (r8 != 0) goto La5
                r4 = r4[r3]
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                r7 = r1[r7]
                java.lang.Double r7 = java.lang.Double.valueOf(r7)
                r2.put(r4, r7)
                goto Lc1
            La5:
                r4 = r4[r3]
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                r9 = r1[r7]
                int r7 = r7 + 1
                r11 = r1[r7]
                double r13 = (double) r8
                int r7 = r0.scale
                double r7 = (double) r7
                r15 = r7
                double r7 = com.google.common.math.Quantiles.access$800(r9, r11, r13, r15)
                java.lang.Double r7 = java.lang.Double.valueOf(r7)
                r2.put(r4, r7)
            Lc1:
                int r3 = r3 + 1
                goto L8a
            Lc4:
                java.util.Map r1 = java.util.Collections.unmodifiableMap(r2)
                return r1
        }
    }

    public Quantiles() {
            r0 = this;
            r0.<init>()
            return
    }

    public static /* synthetic */ void access$300(int r0, int r1) {
            checkIndex(r0, r1)
            return
    }

    public static /* synthetic */ double[] access$400(long[] r0) {
            double[] r0 = longsToDoubles(r0)
            return r0
    }

    public static /* synthetic */ double[] access$500(int[] r0) {
            double[] r0 = intsToDoubles(r0)
            return r0
    }

    public static /* synthetic */ boolean access$600(double[] r0) {
            boolean r0 = containsNaN(r0)
            return r0
    }

    public static /* synthetic */ void access$700(int r0, double[] r1, int r2, int r3) {
            selectInPlace(r0, r1, r2, r3)
            return
    }

    public static /* synthetic */ double access$800(double r0, double r2, double r4, double r6) {
            double r0 = interpolate(r0, r2, r4, r6)
            return r0
    }

    public static /* synthetic */ void access$900(int[] r6, int r7, double[] r8, int r9) {
            r1 = 0
            r4 = 0
            r0 = r6
            r2 = r7
            r3 = r8
            r5 = r9
            selectAllInPlace(r0, r1, r2, r3, r4, r5)
            return
    }

    private static void checkIndex(int r2, int r3) {
            if (r2 < 0) goto L5
            if (r2 > r3) goto L5
            return
        L5:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            r0 = 70
            java.lang.String r1 = "Quantile indexes must be between 0 and the scale, which is "
            java.lang.String r3 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r0, r1, r3)
            r2.<init>(r3)
            throw r2
    }

    private static int chooseNextSelection(int[] r2, int r3, int r4, int r5, int r6) {
            if (r3 != r4) goto L3
            return r3
        L3:
            int r5 = r5 + r6
            int r6 = r5 >>> 1
        L6:
            int r0 = r3 + 1
            if (r4 <= r0) goto L1b
            int r0 = r3 + r4
            int r0 = r0 >>> 1
            r1 = r2[r0]
            if (r1 <= r6) goto L14
            r4 = r0
            goto L6
        L14:
            r3 = r2[r0]
            if (r3 >= r6) goto L1a
            r3 = r0
            goto L6
        L1a:
            return r0
        L1b:
            r6 = r2[r3]
            int r5 = r5 - r6
            r2 = r2[r4]
            int r5 = r5 - r2
            if (r5 <= 0) goto L24
            return r4
        L24:
            return r3
    }

    private static boolean containsNaN(double... r5) {
            int r0 = r5.length
            r1 = 0
            r2 = 0
        L3:
            if (r2 >= r0) goto L12
            r3 = r5[r2]
            boolean r3 = java.lang.Double.isNaN(r3)
            if (r3 == 0) goto Lf
            r5 = 1
            return r5
        Lf:
            int r2 = r2 + 1
            goto L3
        L12:
            return r1
    }

    private static double interpolate(double r5, double r7, double r9, double r11) {
            r0 = -4503599627370496(0xfff0000000000000, double:-Infinity)
            r2 = 9218868437227405312(0x7ff0000000000000, double:Infinity)
            int r4 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r4 != 0) goto L10
            int r5 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r5 != 0) goto Lf
            r5 = 9221120237041090560(0x7ff8000000000000, double:NaN)
            return r5
        Lf:
            return r0
        L10:
            int r0 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r0 != 0) goto L15
            return r2
        L15:
            double r7 = r7 - r5
            double r7 = r7 * r9
            double r7 = r7 / r11
            double r7 = r7 + r5
            return r7
    }

    private static double[] intsToDoubles(int[] r5) {
            int r0 = r5.length
            double[] r1 = new double[r0]
            r2 = 0
        L4:
            if (r2 >= r0) goto Le
            r3 = r5[r2]
            double r3 = (double) r3
            r1[r2] = r3
            int r2 = r2 + 1
            goto L4
        Le:
            return r1
    }

    private static double[] longsToDoubles(long[] r5) {
            int r0 = r5.length
            double[] r1 = new double[r0]
            r2 = 0
        L4:
            if (r2 >= r0) goto Le
            r3 = r5[r2]
            double r3 = (double) r3
            r1[r2] = r3
            int r2 = r2 + 1
            goto L4
        Le:
            return r1
    }

    public static com.google.common.math.Quantiles.ScaleAndIndex median() {
            r0 = 2
            com.google.common.math.Quantiles$Scale r0 = scale(r0)
            r1 = 1
            com.google.common.math.Quantiles$ScaleAndIndex r0 = r0.index(r1)
            return r0
    }

    private static void movePivotToStartOfSlice(double[] r10, int r11, int r12) {
            int r0 = r11 + r12
            r1 = 1
            int r0 = r0 >>> r1
            r2 = r10[r12]
            r4 = r10[r0]
            r6 = 0
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 >= 0) goto Lf
            r2 = 1
            goto L10
        Lf:
            r2 = 0
        L10:
            r3 = r10[r0]
            r7 = r10[r11]
            int r5 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r5 >= 0) goto L1a
            r3 = 1
            goto L1b
        L1a:
            r3 = 0
        L1b:
            r4 = r10[r12]
            r7 = r10[r11]
            int r9 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r9 >= 0) goto L24
            goto L25
        L24:
            r1 = 0
        L25:
            if (r2 != r3) goto L2b
            swap(r10, r0, r11)
            goto L30
        L2b:
            if (r2 == r1) goto L30
            swap(r10, r11, r12)
        L30:
            return
    }

    private static int partition(double[] r6, int r7, int r8) {
            movePivotToStartOfSlice(r6, r7, r8)
            r0 = r6[r7]
            r2 = r8
        L6:
            if (r8 <= r7) goto L16
            r3 = r6[r8]
            int r5 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r5 <= 0) goto L13
            swap(r6, r2, r8)
            int r2 = r2 + (-1)
        L13:
            int r8 = r8 + (-1)
            goto L6
        L16:
            swap(r6, r7, r2)
            return r2
    }

    public static com.google.common.math.Quantiles.Scale percentiles() {
            r0 = 100
            com.google.common.math.Quantiles$Scale r0 = scale(r0)
            return r0
    }

    public static com.google.common.math.Quantiles.Scale quartiles() {
            r0 = 4
            com.google.common.math.Quantiles$Scale r0 = scale(r0)
            return r0
    }

    public static com.google.common.math.Quantiles.Scale scale(int r2) {
            com.google.common.math.Quantiles$Scale r0 = new com.google.common.math.Quantiles$Scale
            r1 = 0
            r0.<init>(r2, r1)
            return r0
    }

    private static void selectAllInPlace(int[] r9, int r10, int r11, double[] r12, int r13, int r14) {
            int r0 = chooseNextSelection(r9, r10, r11, r13, r14)
            r1 = r9[r0]
            selectInPlace(r1, r12, r13, r14)
            int r2 = r0 + (-1)
            r5 = r2
        Lc:
            if (r5 < r10) goto L15
            r2 = r9[r5]
            if (r2 != r1) goto L15
            int r5 = r5 + (-1)
            goto Lc
        L15:
            if (r5 < r10) goto L20
            int r8 = r1 + (-1)
            r3 = r9
            r4 = r10
            r6 = r12
            r7 = r13
            selectAllInPlace(r3, r4, r5, r6, r7, r8)
        L20:
            int r0 = r0 + 1
            r3 = r0
        L23:
            if (r3 > r11) goto L2c
            r10 = r9[r3]
            if (r10 != r1) goto L2c
            int r3 = r3 + 1
            goto L23
        L2c:
            if (r3 > r11) goto L37
            int r6 = r1 + 1
            r2 = r9
            r4 = r11
            r5 = r12
            r7 = r14
            selectAllInPlace(r2, r3, r4, r5, r6, r7)
        L37:
            return
    }

    private static void selectInPlace(int r6, double[] r7, int r8, int r9) {
            if (r6 != r8) goto L19
            int r6 = r8 + 1
            r0 = r8
        L5:
            if (r6 > r9) goto L13
            r1 = r7[r0]
            r3 = r7[r6]
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto L10
            r0 = r6
        L10:
            int r6 = r6 + 1
            goto L5
        L13:
            if (r0 == r8) goto L18
            swap(r7, r0, r8)
        L18:
            return
        L19:
            if (r9 <= r8) goto L29
            int r0 = partition(r7, r8, r9)
            if (r0 < r6) goto L23
            int r9 = r0 + (-1)
        L23:
            if (r0 > r6) goto L19
            int r0 = r0 + 1
            r8 = r0
            goto L19
        L29:
            return
    }

    private static void swap(double[] r4, int r5, int r6) {
            r0 = r4[r5]
            r2 = r4[r6]
            r4[r5] = r2
            r4[r6] = r0
            return
    }
}
