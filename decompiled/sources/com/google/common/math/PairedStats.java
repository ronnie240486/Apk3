package com.google.common.math;

/* JADX INFO: loaded from: classes.dex */
@com.google.common.math.ElementTypesAreNonnullByDefault
@com.google.common.annotations.Beta
@com.google.common.annotations.GwtIncompatible
public final class PairedStats implements java.io.Serializable {
    private static final int BYTES = 88;
    private static final long serialVersionUID = 0;
    private final double sumOfProductsOfDeltas;
    private final com.google.common.math.Stats xStats;
    private final com.google.common.math.Stats yStats;

    public PairedStats(com.google.common.math.Stats r1, com.google.common.math.Stats r2, double r3) {
            r0 = this;
            r0.<init>()
            r0.xStats = r1
            r0.yStats = r2
            r0.sumOfProductsOfDeltas = r3
            return
    }

    private static double ensureInUnitRange(double r3) {
            r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 < 0) goto L7
            return r0
        L7:
            r0 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 > 0) goto Le
            return r0
        Le:
            return r3
    }

    private static double ensurePositive(double r3) {
            r0 = 0
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 <= 0) goto L7
            return r3
        L7:
            r3 = 1
            return r3
    }

    public static com.google.common.math.PairedStats fromByteArray(byte[] r4) {
            com.google.common.base.Preconditions.checkNotNull(r4)
            int r0 = r4.length
            r1 = 88
            if (r0 != r1) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            int r2 = r4.length
            java.lang.String r3 = "Expected PairedStats.BYTES = %s, got %s"
            com.google.common.base.Preconditions.checkArgument(r0, r3, r1, r2)
            java.nio.ByteBuffer r4 = java.nio.ByteBuffer.wrap(r4)
            java.nio.ByteOrder r0 = java.nio.ByteOrder.LITTLE_ENDIAN
            java.nio.ByteBuffer r4 = r4.order(r0)
            com.google.common.math.Stats r0 = com.google.common.math.Stats.readFrom(r4)
            com.google.common.math.Stats r1 = com.google.common.math.Stats.readFrom(r4)
            double r2 = r4.getDouble()
            com.google.common.math.PairedStats r4 = new com.google.common.math.PairedStats
            r4.<init>(r0, r1, r2)
            return r4
    }

    public long count() {
            r2 = this;
            com.google.common.math.Stats r0 = r2.xStats
            long r0 = r0.count()
            return r0
    }

    public boolean equals(@javax.annotation.CheckForNull java.lang.Object r6) {
            r5 = this;
            r0 = 0
            if (r6 != 0) goto L4
            return r0
        L4:
            java.lang.Class<com.google.common.math.PairedStats> r1 = com.google.common.math.PairedStats.class
            java.lang.Class r2 = r6.getClass()
            if (r1 == r2) goto Ld
            return r0
        Ld:
            com.google.common.math.PairedStats r6 = (com.google.common.math.PairedStats) r6
            com.google.common.math.Stats r1 = r5.xStats
            com.google.common.math.Stats r2 = r6.xStats
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L34
            com.google.common.math.Stats r1 = r5.yStats
            com.google.common.math.Stats r2 = r6.yStats
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L34
            double r1 = r5.sumOfProductsOfDeltas
            long r1 = java.lang.Double.doubleToLongBits(r1)
            double r3 = r6.sumOfProductsOfDeltas
            long r3 = java.lang.Double.doubleToLongBits(r3)
            int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r6 != 0) goto L34
            r0 = 1
        L34:
            return r0
    }

    public int hashCode() {
            r3 = this;
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            com.google.common.math.Stats r1 = r3.xStats
            r2 = 0
            r0[r2] = r1
            com.google.common.math.Stats r1 = r3.yStats
            r2 = 1
            r0[r2] = r1
            double r1 = r3.sumOfProductsOfDeltas
            java.lang.Double r1 = java.lang.Double.valueOf(r1)
            r2 = 2
            r0[r2] = r1
            int r0 = com.google.common.base.Objects.hashCode(r0)
            return r0
    }

    public com.google.common.math.LinearTransformation leastSquaresFit() {
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
            com.google.common.math.Stats r0 = r7.xStats
            double r0 = r0.sumOfSquaresOfDeltas()
            r4 = 0
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 <= 0) goto L58
            com.google.common.math.Stats r2 = r7.yStats
            double r2 = r2.sumOfSquaresOfDeltas()
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 <= 0) goto L4d
            com.google.common.math.Stats r2 = r7.xStats
            double r2 = r2.mean()
            com.google.common.math.Stats r4 = r7.yStats
            double r4 = r4.mean()
            com.google.common.math.LinearTransformation$LinearTransformationBuilder r2 = com.google.common.math.LinearTransformation.mapping(r2, r4)
            double r3 = r7.sumOfProductsOfDeltas
            double r3 = r3 / r0
            com.google.common.math.LinearTransformation r0 = r2.withSlope(r3)
            return r0
        L4d:
            com.google.common.math.Stats r0 = r7.yStats
            double r0 = r0.mean()
            com.google.common.math.LinearTransformation r0 = com.google.common.math.LinearTransformation.horizontal(r0)
            return r0
        L58:
            com.google.common.math.Stats r0 = r7.yStats
            double r0 = r0.sumOfSquaresOfDeltas()
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 <= 0) goto L63
            goto L64
        L63:
            r2 = 0
        L64:
            com.google.common.base.Preconditions.checkState(r2)
            com.google.common.math.Stats r0 = r7.xStats
            double r0 = r0.mean()
            com.google.common.math.LinearTransformation r0 = com.google.common.math.LinearTransformation.vertical(r0)
            return r0
    }

    public double pearsonsCorrelationCoefficient() {
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
            com.google.common.math.Stats r0 = r9.xStats()
            double r0 = r0.sumOfSquaresOfDeltas()
            com.google.common.math.Stats r4 = r9.yStats()
            double r4 = r4.sumOfSquaresOfDeltas()
            r6 = 0
            int r8 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r8 <= 0) goto L35
            r8 = 1
            goto L36
        L35:
            r8 = 0
        L36:
            com.google.common.base.Preconditions.checkState(r8)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 <= 0) goto L3e
            goto L3f
        L3e:
            r2 = 0
        L3f:
            com.google.common.base.Preconditions.checkState(r2)
            double r0 = r0 * r4
            double r0 = ensurePositive(r0)
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

    public double sampleCovariance() {
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

    public final double sumOfProductsOfDeltas() {
            r2 = this;
            double r0 = r2.sumOfProductsOfDeltas
            return r0
    }

    public byte[] toByteArray() {
            r3 = this;
            r0 = 88
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r0)
            java.nio.ByteOrder r1 = java.nio.ByteOrder.LITTLE_ENDIAN
            java.nio.ByteBuffer r0 = r0.order(r1)
            com.google.common.math.Stats r1 = r3.xStats
            r1.writeTo(r0)
            com.google.common.math.Stats r1 = r3.yStats
            r1.writeTo(r0)
            double r1 = r3.sumOfProductsOfDeltas
            r0.putDouble(r1)
            byte[] r0 = r0.array()
            return r0
    }

    public java.lang.String toString() {
            r7 = this;
            long r0 = r7.count()
            java.lang.String r2 = "yStats"
            java.lang.String r3 = "xStats"
            r4 = 0
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 <= 0) goto L2f
            com.google.common.base.MoreObjects$ToStringHelper r0 = com.google.common.base.MoreObjects.toStringHelper(r7)
            com.google.common.math.Stats r1 = r7.xStats
            com.google.common.base.MoreObjects$ToStringHelper r0 = r0.add(r3, r1)
            com.google.common.math.Stats r1 = r7.yStats
            com.google.common.base.MoreObjects$ToStringHelper r0 = r0.add(r2, r1)
            double r1 = r7.populationCovariance()
            java.lang.String r3 = "populationCovariance"
            com.google.common.base.MoreObjects$ToStringHelper r0 = r0.add(r3, r1)
            java.lang.String r0 = r0.toString()
            return r0
        L2f:
            com.google.common.base.MoreObjects$ToStringHelper r0 = com.google.common.base.MoreObjects.toStringHelper(r7)
            com.google.common.math.Stats r1 = r7.xStats
            com.google.common.base.MoreObjects$ToStringHelper r0 = r0.add(r3, r1)
            com.google.common.math.Stats r1 = r7.yStats
            com.google.common.base.MoreObjects$ToStringHelper r0 = r0.add(r2, r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public com.google.common.math.Stats xStats() {
            r1 = this;
            com.google.common.math.Stats r0 = r1.xStats
            return r0
    }

    public com.google.common.math.Stats yStats() {
            r1 = this;
            com.google.common.math.Stats r0 = r1.yStats
            return r0
    }
}
