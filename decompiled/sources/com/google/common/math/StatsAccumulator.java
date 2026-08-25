package com.google.common.math;

/* JADX INFO: loaded from: classes2.dex */
@com.google.common.math.ElementTypesAreNonnullByDefault
@com.google.common.annotations.Beta
@com.google.common.annotations.GwtIncompatible
public final class StatsAccumulator {
    private long count;
    private double max;
    private double mean;
    private double min;
    private double sumOfSquaresOfDeltas;

    public StatsAccumulator() {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.count = r0
            r0 = 0
            r2.mean = r0
            r2.sumOfSquaresOfDeltas = r0
            r0 = 9221120237041090560(0x7ff8000000000000, double:NaN)
            r2.min = r0
            r2.max = r0
            return
    }

    public static double calculateNewMeanNonFinite(double r1, double r3) {
            boolean r0 = com.google.common.primitives.Doubles.isFinite(r1)
            if (r0 == 0) goto L7
            return r3
        L7:
            boolean r0 = com.google.common.primitives.Doubles.isFinite(r3)
            if (r0 != 0) goto L14
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 != 0) goto L12
            goto L14
        L12:
            r1 = 9221120237041090560(0x7ff8000000000000, double:NaN)
        L14:
            return r1
    }

    private void merge(long r18, double r20, double r22, double r24, double r26) {
            r17 = this;
            r0 = r17
            r1 = r18
            r3 = r20
            r5 = r22
            r7 = r24
            r9 = r26
            long r11 = r0.count
            r13 = 0
            int r15 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r15 != 0) goto L1f
            r0.count = r1
            r0.mean = r3
            r0.sumOfSquaresOfDeltas = r5
            r0.min = r7
            r0.max = r9
            goto L69
        L1f:
            long r11 = r11 + r1
            r0.count = r11
            double r11 = r0.mean
            boolean r11 = com.google.common.primitives.Doubles.isFinite(r11)
            if (r11 == 0) goto L4b
            boolean r11 = com.google.common.primitives.Doubles.isFinite(r20)
            if (r11 == 0) goto L4b
            double r11 = r0.mean
            double r13 = r3 - r11
            double r1 = (double) r1
            double r15 = r13 * r1
            long r9 = r0.count
            double r9 = (double) r9
            double r15 = r15 / r9
            double r9 = r15 + r11
            r0.mean = r9
            double r11 = r0.sumOfSquaresOfDeltas
            double r3 = r3 - r9
            double r3 = r3 * r13
            double r3 = r3 * r1
            double r3 = r3 + r5
            double r3 = r3 + r11
            r0.sumOfSquaresOfDeltas = r3
            goto L57
        L4b:
            double r1 = r0.mean
            double r1 = calculateNewMeanNonFinite(r1, r3)
            r0.mean = r1
            r1 = 9221120237041090560(0x7ff8000000000000, double:NaN)
            r0.sumOfSquaresOfDeltas = r1
        L57:
            double r1 = r0.min
            double r1 = java.lang.Math.min(r1, r7)
            r0.min = r1
            double r1 = r0.max
            r3 = r26
            double r1 = java.lang.Math.max(r1, r3)
            r0.max = r1
        L69:
            return
    }

    public void add(double r10) {
            r9 = this;
            long r0 = r9.count
            r2 = 9221120237041090560(0x7ff8000000000000, double:NaN)
            r4 = 1
            r6 = 0
            int r8 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r8 != 0) goto L1d
            r9.count = r4
            r9.mean = r10
            r9.min = r10
            r9.max = r10
            boolean r10 = com.google.common.primitives.Doubles.isFinite(r10)
            if (r10 != 0) goto L5e
            r9.sumOfSquaresOfDeltas = r2
            goto L5e
        L1d:
            long r0 = r0 + r4
            r9.count = r0
            boolean r0 = com.google.common.primitives.Doubles.isFinite(r10)
            if (r0 == 0) goto L44
            double r0 = r9.mean
            boolean r0 = com.google.common.primitives.Doubles.isFinite(r0)
            if (r0 == 0) goto L44
            double r0 = r9.mean
            double r2 = r10 - r0
            long r4 = r9.count
            double r4 = (double) r4
            double r4 = r2 / r4
            double r4 = r4 + r0
            r9.mean = r4
            double r0 = r9.sumOfSquaresOfDeltas
            double r4 = r10 - r4
            double r4 = r4 * r2
            double r4 = r4 + r0
            r9.sumOfSquaresOfDeltas = r4
            goto L4e
        L44:
            double r0 = r9.mean
            double r0 = calculateNewMeanNonFinite(r0, r10)
            r9.mean = r0
            r9.sumOfSquaresOfDeltas = r2
        L4e:
            double r0 = r9.min
            double r0 = java.lang.Math.min(r0, r10)
            r9.min = r0
            double r0 = r9.max
            double r10 = java.lang.Math.max(r0, r10)
            r9.max = r10
        L5e:
            return
    }

    public void addAll(com.google.common.math.Stats r17) {
            r16 = this;
            long r0 = r17.count()
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto Lb
            return
        Lb:
            long r6 = r17.count()
            double r8 = r17.mean()
            double r10 = r17.sumOfSquaresOfDeltas()
            double r12 = r17.min()
            double r14 = r17.max()
            r5 = r16
            r5.merge(r6, r8, r10, r12, r14)
            return
    }

    public void addAll(com.google.common.math.StatsAccumulator r17) {
            r16 = this;
            long r0 = r17.count()
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto Lb
            return
        Lb:
            long r6 = r17.count()
            double r8 = r17.mean()
            r0 = r17
            double r10 = r0.sumOfSquaresOfDeltas
            double r12 = r17.min()
            double r14 = r17.max()
            r5 = r16
            r5.merge(r6, r8, r10, r12, r14)
            return
    }

    public void addAll(java.lang.Iterable<? extends java.lang.Number> r3) {
            r2 = this;
            java.util.Iterator r3 = r3.iterator()
        L4:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L18
            java.lang.Object r0 = r3.next()
            java.lang.Number r0 = (java.lang.Number) r0
            double r0 = r0.doubleValue()
            r2.add(r0)
            goto L4
        L18:
            return
    }

    public void addAll(java.util.Iterator<? extends java.lang.Number> r3) {
            r2 = this;
        L0:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L14
            java.lang.Object r0 = r3.next()
            java.lang.Number r0 = (java.lang.Number) r0
            double r0 = r0.doubleValue()
            r2.add(r0)
            goto L0
        L14:
            return
    }

    public void addAll(double... r5) {
            r4 = this;
            int r0 = r5.length
            r1 = 0
        L2:
            if (r1 >= r0) goto Lc
            r2 = r5[r1]
            r4.add(r2)
            int r1 = r1 + 1
            goto L2
        Lc:
            return
    }

    public void addAll(int... r5) {
            r4 = this;
            int r0 = r5.length
            r1 = 0
        L2:
            if (r1 >= r0) goto Ld
            r2 = r5[r1]
            double r2 = (double) r2
            r4.add(r2)
            int r1 = r1 + 1
            goto L2
        Ld:
            return
    }

    public void addAll(long... r5) {
            r4 = this;
            int r0 = r5.length
            r1 = 0
        L2:
            if (r1 >= r0) goto Ld
            r2 = r5[r1]
            double r2 = (double) r2
            r4.add(r2)
            int r1 = r1 + 1
            goto L2
        Ld:
            return
    }

    public long count() {
            r2 = this;
            long r0 = r2.count
            return r0
    }

    public double max() {
            r5 = this;
            long r0 = r5.count
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            com.google.common.base.Preconditions.checkState(r0)
            double r0 = r5.max
            return r0
    }

    public double mean() {
            r5 = this;
            long r0 = r5.count
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            com.google.common.base.Preconditions.checkState(r0)
            double r0 = r5.mean
            return r0
    }

    public double min() {
            r5 = this;
            long r0 = r5.count
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            com.google.common.base.Preconditions.checkState(r0)
            double r0 = r5.min
            return r0
    }

    public final double populationStandardDeviation() {
            r2 = this;
            double r0 = r2.populationVariance()
            double r0 = java.lang.Math.sqrt(r0)
            return r0
    }

    public final double populationVariance() {
            r5 = this;
            long r0 = r5.count
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            com.google.common.base.Preconditions.checkState(r0)
            double r0 = r5.sumOfSquaresOfDeltas
            boolean r0 = java.lang.Double.isNaN(r0)
            if (r0 == 0) goto L19
            r0 = 9221120237041090560(0x7ff8000000000000, double:NaN)
            return r0
        L19:
            long r0 = r5.count
            r2 = 1
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L24
            r0 = 0
            return r0
        L24:
            double r0 = r5.sumOfSquaresOfDeltas
            double r0 = com.google.common.math.DoubleUtils.ensureNonNegative(r0)
            long r2 = r5.count
            double r2 = (double) r2
            double r0 = r0 / r2
            return r0
    }

    public final double sampleStandardDeviation() {
            r2 = this;
            double r0 = r2.sampleVariance()
            double r0 = java.lang.Math.sqrt(r0)
            return r0
    }

    public final double sampleVariance() {
            r6 = this;
            long r0 = r6.count
            r2 = 1
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            com.google.common.base.Preconditions.checkState(r0)
            double r0 = r6.sumOfSquaresOfDeltas
            boolean r0 = java.lang.Double.isNaN(r0)
            if (r0 == 0) goto L19
            r0 = 9221120237041090560(0x7ff8000000000000, double:NaN)
            return r0
        L19:
            double r0 = r6.sumOfSquaresOfDeltas
            double r0 = com.google.common.math.DoubleUtils.ensureNonNegative(r0)
            long r4 = r6.count
            long r4 = r4 - r2
            double r2 = (double) r4
            double r0 = r0 / r2
            return r0
    }

    public com.google.common.math.Stats snapshot() {
            r12 = this;
            com.google.common.math.Stats r11 = new com.google.common.math.Stats
            long r1 = r12.count
            double r3 = r12.mean
            double r5 = r12.sumOfSquaresOfDeltas
            double r7 = r12.min
            double r9 = r12.max
            r0 = r11
            r0.<init>(r1, r3, r5, r7, r9)
            return r11
    }

    public final double sum() {
            r4 = this;
            double r0 = r4.mean
            long r2 = r4.count
            double r2 = (double) r2
            double r0 = r0 * r2
            return r0
    }

    public final double sumOfSquaresOfDeltas() {
            r2 = this;
            double r0 = r2.sumOfSquaresOfDeltas
            return r0
    }
}
