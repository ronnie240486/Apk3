package com.google.common.math;

/* JADX INFO: loaded from: classes2.dex */
@com.google.common.math.ElementTypesAreNonnullByDefault
@com.google.common.annotations.Beta
@com.google.common.annotations.GwtIncompatible
public final class PairedStatsAccumulator {
    private double sumOfProductsOfDeltas;
    private final com.google.common.math.StatsAccumulator xStats;
    private final com.google.common.math.StatsAccumulator yStats;

    public PairedStatsAccumulator() {
            r2 = this;
            r2.<init>()
            com.google.common.math.StatsAccumulator r0 = new com.google.common.math.StatsAccumulator
            r0.<init>()
            r2.xStats = r0
            com.google.common.math.StatsAccumulator r0 = new com.google.common.math.StatsAccumulator
            r0.<init>()
            r2.yStats = r0
            r0 = 0
            r2.sumOfProductsOfDeltas = r0
            return
    }

    private static double ensureInUnitRange(double r6) {
            r2 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            r4 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r0 = r6
            double r6 = com.google.common.primitives.Doubles.constrainToRange(r0, r2, r4)
            return r6
    }

    private double ensurePositive(double r4) {
            r3 = this;
            r0 = 0
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 <= 0) goto L7
            return r4
        L7:
            r4 = 1
            return r4
    }

    public void add(double r6, double r8) {
            r5 = this;
            com.google.common.math.StatsAccumulator r0 = r5.xStats
            r0.add(r6)
            boolean r0 = com.google.common.primitives.Doubles.isFinite(r6)
            if (r0 == 0) goto L34
            boolean r0 = com.google.common.primitives.Doubles.isFinite(r8)
            if (r0 == 0) goto L34
            com.google.common.math.StatsAccumulator r0 = r5.xStats
            long r0 = r0.count()
            r2 = 1
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L38
            double r0 = r5.sumOfProductsOfDeltas
            com.google.common.math.StatsAccumulator r2 = r5.xStats
            double r2 = r2.mean()
            double r6 = r6 - r2
            com.google.common.math.StatsAccumulator r2 = r5.yStats
            double r2 = r2.mean()
            double r2 = r8 - r2
            double r2 = r2 * r6
            double r2 = r2 + r0
            r5.sumOfProductsOfDeltas = r2
            goto L38
        L34:
            r6 = 9221120237041090560(0x7ff8000000000000, double:NaN)
            r5.sumOfProductsOfDeltas = r6
        L38:
            com.google.common.math.StatsAccumulator r6 = r5.yStats
            r6.add(r8)
            return
    }

    public void addAll(com.google.common.math.PairedStats r11) {
            r10 = this;
            long r0 = r11.count()
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto Lb
            return
        Lb:
            com.google.common.math.StatsAccumulator r0 = r10.xStats
            com.google.common.math.Stats r1 = r11.xStats()
            r0.addAll(r1)
            com.google.common.math.StatsAccumulator r0 = r10.yStats
            long r0 = r0.count()
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L25
            double r0 = r11.sumOfProductsOfDeltas()
            r10.sumOfProductsOfDeltas = r0
            goto L56
        L25:
            double r0 = r10.sumOfProductsOfDeltas
            double r2 = r11.sumOfProductsOfDeltas()
            com.google.common.math.Stats r4 = r11.xStats()
            double r4 = r4.mean()
            com.google.common.math.StatsAccumulator r6 = r10.xStats
            double r6 = r6.mean()
            double r4 = r4 - r6
            com.google.common.math.Stats r6 = r11.yStats()
            double r6 = r6.mean()
            com.google.common.math.StatsAccumulator r8 = r10.yStats
            double r8 = r8.mean()
            double r6 = r6 - r8
            double r6 = r6 * r4
            long r4 = r11.count()
            double r4 = (double) r4
            double r6 = r6 * r4
            double r6 = r6 + r2
            double r6 = r6 + r0
            r10.sumOfProductsOfDeltas = r6
        L56:
            com.google.common.math.StatsAccumulator r0 = r10.yStats
            com.google.common.math.Stats r11 = r11.yStats()
            r0.addAll(r11)
            return
    }

    public long count() {
            r2 = this;
            com.google.common.math.StatsAccumulator r0 = r2.xStats
            long r0 = r0.count()
            return r0
    }

    public final com.google.common.math.LinearTransformation leastSquaresFit() {
            r7 = this;
            long r0 = r7.count()
            r2 = 1
            r3 = 0
            r4 = 1
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 <= 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            com.google.common.base.Preconditions.checkState(r0)
            double r0 = r7.sumOfProductsOfDeltas
            boolean r0 = java.lang.Double.isNaN(r0)
            if (r0 == 0) goto L1f
            com.google.common.math.LinearTransformation r0 = com.google.common.math.LinearTransformation.forNaN()
            return r0
        L1f:
            com.google.common.math.StatsAccumulator r0 = r7.xStats
            double r0 = r0.sumOfSquaresOfDeltas()
            r4 = 0
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 <= 0) goto L58
            com.google.common.math.StatsAccumulator r2 = r7.yStats
            double r2 = r2.sumOfSquaresOfDeltas()
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 <= 0) goto L4d
            com.google.common.math.StatsAccumulator r2 = r7.xStats
            double r2 = r2.mean()
            com.google.common.math.StatsAccumulator r4 = r7.yStats
            double r4 = r4.mean()
            com.google.common.math.LinearTransformation$LinearTransformationBuilder r2 = com.google.common.math.LinearTransformation.mapping(r2, r4)
            double r3 = r7.sumOfProductsOfDeltas
            double r3 = r3 / r0
            com.google.common.math.LinearTransformation r0 = r2.withSlope(r3)
            return r0
        L4d:
            com.google.common.math.StatsAccumulator r0 = r7.yStats
            double r0 = r0.mean()
            com.google.common.math.LinearTransformation r0 = com.google.common.math.LinearTransformation.horizontal(r0)
            return r0
        L58:
            com.google.common.math.StatsAccumulator r0 = r7.yStats
            double r0 = r0.sumOfSquaresOfDeltas()
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 <= 0) goto L63
            goto L64
        L63:
            r2 = 0
        L64:
            com.google.common.base.Preconditions.checkState(r2)
            com.google.common.math.StatsAccumulator r0 = r7.xStats
            double r0 = r0.mean()
            com.google.common.math.LinearTransformation r0 = com.google.common.math.LinearTransformation.vertical(r0)
            return r0
    }

    public final double pearsonsCorrelationCoefficient() {
            r9 = this;
            long r0 = r9.count()
            r2 = 1
            r3 = 0
            r4 = 1
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 <= 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            com.google.common.base.Preconditions.checkState(r0)
            double r0 = r9.sumOfProductsOfDeltas
            boolean r0 = java.lang.Double.isNaN(r0)
            if (r0 == 0) goto L1d
            r0 = 9221120237041090560(0x7ff8000000000000, double:NaN)
            return r0
        L1d:
            com.google.common.math.StatsAccumulator r0 = r9.xStats
            double r0 = r0.sumOfSquaresOfDeltas()
            com.google.common.math.StatsAccumulator r4 = r9.yStats
            double r4 = r4.sumOfSquaresOfDeltas()
            r6 = 0
            int r8 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r8 <= 0) goto L31
            r8 = 1
            goto L32
        L31:
            r8 = 0
        L32:
            com.google.common.base.Preconditions.checkState(r8)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 <= 0) goto L3a
            goto L3b
        L3a:
            r2 = 0
        L3b:
            com.google.common.base.Preconditions.checkState(r2)
            double r0 = r0 * r4
            double r0 = r9.ensurePositive(r0)
            double r2 = r9.sumOfProductsOfDeltas
            double r0 = java.lang.Math.sqrt(r0)
            double r2 = r2 / r0
            double r0 = ensureInUnitRange(r2)
            return r0
    }

    public double populationCovariance() {
            r5 = this;
            long r0 = r5.count()
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            com.google.common.base.Preconditions.checkState(r0)
            double r0 = r5.sumOfProductsOfDeltas
            long r2 = r5.count()
            double r2 = (double) r2
            double r0 = r0 / r2
            return r0
    }

    public final double sampleCovariance() {
            r6 = this;
            long r0 = r6.count()
            r2 = 1
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            com.google.common.base.Preconditions.checkState(r0)
            double r0 = r6.sumOfProductsOfDeltas
            long r4 = r6.count()
            long r4 = r4 - r2
            double r2 = (double) r4
            double r0 = r0 / r2
            return r0
    }

    public com.google.common.math.PairedStats snapshot() {
            r5 = this;
            com.google.common.math.PairedStats r0 = new com.google.common.math.PairedStats
            com.google.common.math.StatsAccumulator r1 = r5.xStats
            com.google.common.math.Stats r1 = r1.snapshot()
            com.google.common.math.StatsAccumulator r2 = r5.yStats
            com.google.common.math.Stats r2 = r2.snapshot()
            double r3 = r5.sumOfProductsOfDeltas
            r0.<init>(r1, r2, r3)
            return r0
    }

    public com.google.common.math.Stats xStats() {
            r1 = this;
            com.google.common.math.StatsAccumulator r0 = r1.xStats
            com.google.common.math.Stats r0 = r0.snapshot()
            return r0
    }

    public com.google.common.math.Stats yStats() {
            r1 = this;
            com.google.common.math.StatsAccumulator r0 = r1.yStats
            com.google.common.math.Stats r0 = r0.snapshot()
            return r0
    }
}
