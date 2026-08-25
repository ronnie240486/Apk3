package com.google.common.math;

/* JADX INFO: loaded from: classes2.dex */
@com.google.common.math.ElementTypesAreNonnullByDefault
@com.google.common.annotations.Beta
@com.google.common.annotations.GwtIncompatible
public final class Stats implements java.io.Serializable {
    private static final long serialVersionUID = 0;
    private final long count;
    private final double max;
    private final double mean;
    private final double min;
    private final double sumOfSquaresOfDeltas;

    public Stats(long r1, double r3, double r5, double r7, double r9) {
            r0 = this;
            r0.<init>()
            r0.count = r1
            r0.mean = r3
            r0.sumOfSquaresOfDeltas = r5
            r0.min = r7
            r0.max = r9
            return
    }

    public static com.google.common.math.Stats fromByteArray(byte[] r4) {
            com.google.common.base.Preconditions.checkNotNull(r4)
            int r0 = r4.length
            r1 = 40
            if (r0 != r1) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            int r2 = r4.length
            java.lang.String r3 = "Expected Stats.BYTES = %s remaining , got %s"
            com.google.common.base.Preconditions.checkArgument(r0, r3, r1, r2)
            java.nio.ByteBuffer r4 = java.nio.ByteBuffer.wrap(r4)
            java.nio.ByteOrder r0 = java.nio.ByteOrder.LITTLE_ENDIAN
            java.nio.ByteBuffer r4 = r4.order(r0)
            com.google.common.math.Stats r4 = readFrom(r4)
            return r4
    }

    public static double meanOf(java.lang.Iterable<? extends java.lang.Number> r2) {
            java.util.Iterator r2 = r2.iterator()
            double r0 = meanOf(r2)
            return r0
    }

    public static double meanOf(java.util.Iterator<? extends java.lang.Number> r10) {
            boolean r0 = r10.hasNext()
            com.google.common.base.Preconditions.checkArgument(r0)
            java.lang.Object r0 = r10.next()
            java.lang.Number r0 = (java.lang.Number) r0
            double r0 = r0.doubleValue()
            r2 = 1
            r4 = r2
        L14:
            boolean r6 = r10.hasNext()
            if (r6 == 0) goto L3c
            java.lang.Object r6 = r10.next()
            java.lang.Number r6 = (java.lang.Number) r6
            double r6 = r6.doubleValue()
            long r4 = r4 + r2
            boolean r8 = com.google.common.primitives.Doubles.isFinite(r6)
            if (r8 == 0) goto L37
            boolean r8 = com.google.common.primitives.Doubles.isFinite(r0)
            if (r8 == 0) goto L37
            double r6 = r6 - r0
            double r8 = (double) r4
            double r6 = r6 / r8
            double r6 = r6 + r0
            r0 = r6
            goto L14
        L37:
            double r0 = com.google.common.math.StatsAccumulator.calculateNewMeanNonFinite(r0, r6)
            goto L14
        L3c:
            return r0
    }

    public static double meanOf(double... r7) {
            int r0 = r7.length
            r1 = 0
            r2 = 1
            if (r0 <= 0) goto L7
            r0 = 1
            goto L8
        L7:
            r0 = 0
        L8:
            com.google.common.base.Preconditions.checkArgument(r0)
            r0 = r7[r1]
        Ld:
            int r3 = r7.length
            if (r2 >= r3) goto L2d
            r3 = r7[r2]
            boolean r5 = com.google.common.primitives.Doubles.isFinite(r3)
            if (r5 == 0) goto L26
            boolean r5 = com.google.common.primitives.Doubles.isFinite(r0)
            if (r5 == 0) goto L26
            double r3 = r3 - r0
            int r5 = r2 + 1
            double r5 = (double) r5
            double r3 = r3 / r5
            double r3 = r3 + r0
            r0 = r3
            goto L2a
        L26:
            double r0 = com.google.common.math.StatsAccumulator.calculateNewMeanNonFinite(r0, r3)
        L2a:
            int r2 = r2 + 1
            goto Ld
        L2d:
            return r0
    }

    public static double meanOf(int... r7) {
            int r0 = r7.length
            r1 = 0
            r2 = 1
            if (r0 <= 0) goto L7
            r0 = 1
            goto L8
        L7:
            r0 = 0
        L8:
            com.google.common.base.Preconditions.checkArgument(r0)
            r0 = r7[r1]
            double r0 = (double) r0
        Le:
            int r3 = r7.length
            if (r2 >= r3) goto L2f
            r3 = r7[r2]
            double r3 = (double) r3
            boolean r5 = com.google.common.primitives.Doubles.isFinite(r3)
            if (r5 == 0) goto L28
            boolean r5 = com.google.common.primitives.Doubles.isFinite(r0)
            if (r5 == 0) goto L28
            double r3 = r3 - r0
            int r5 = r2 + 1
            double r5 = (double) r5
            double r3 = r3 / r5
            double r3 = r3 + r0
            r0 = r3
            goto L2c
        L28:
            double r0 = com.google.common.math.StatsAccumulator.calculateNewMeanNonFinite(r0, r3)
        L2c:
            int r2 = r2 + 1
            goto Le
        L2f:
            return r0
    }

    public static double meanOf(long... r7) {
            int r0 = r7.length
            r1 = 0
            r2 = 1
            if (r0 <= 0) goto L7
            r0 = 1
            goto L8
        L7:
            r0 = 0
        L8:
            com.google.common.base.Preconditions.checkArgument(r0)
            r0 = r7[r1]
            double r0 = (double) r0
        Le:
            int r3 = r7.length
            if (r2 >= r3) goto L2f
            r3 = r7[r2]
            double r3 = (double) r3
            boolean r5 = com.google.common.primitives.Doubles.isFinite(r3)
            if (r5 == 0) goto L28
            boolean r5 = com.google.common.primitives.Doubles.isFinite(r0)
            if (r5 == 0) goto L28
            double r3 = r3 - r0
            int r5 = r2 + 1
            double r5 = (double) r5
            double r3 = r3 / r5
            double r3 = r3 + r0
            r0 = r3
            goto L2c
        L28:
            double r0 = com.google.common.math.StatsAccumulator.calculateNewMeanNonFinite(r0, r3)
        L2c:
            int r2 = r2 + 1
            goto Le
        L2f:
            return r0
    }

    public static com.google.common.math.Stats of(java.lang.Iterable<? extends java.lang.Number> r1) {
            com.google.common.math.StatsAccumulator r0 = new com.google.common.math.StatsAccumulator
            r0.<init>()
            r0.addAll(r1)
            com.google.common.math.Stats r1 = r0.snapshot()
            return r1
    }

    public static com.google.common.math.Stats of(java.util.Iterator<? extends java.lang.Number> r1) {
            com.google.common.math.StatsAccumulator r0 = new com.google.common.math.StatsAccumulator
            r0.<init>()
            r0.addAll(r1)
            com.google.common.math.Stats r1 = r0.snapshot()
            return r1
    }

    public static com.google.common.math.Stats of(double... r1) {
            com.google.common.math.StatsAccumulator r0 = new com.google.common.math.StatsAccumulator
            r0.<init>()
            r0.addAll(r1)
            com.google.common.math.Stats r1 = r0.snapshot()
            return r1
    }

    public static com.google.common.math.Stats of(int... r1) {
            com.google.common.math.StatsAccumulator r0 = new com.google.common.math.StatsAccumulator
            r0.<init>()
            r0.addAll(r1)
            com.google.common.math.Stats r1 = r0.snapshot()
            return r1
    }

    public static com.google.common.math.Stats of(long... r1) {
            com.google.common.math.StatsAccumulator r0 = new com.google.common.math.StatsAccumulator
            r0.<init>()
            r0.addAll(r1)
            com.google.common.math.Stats r1 = r0.snapshot()
            return r1
    }

    public static com.google.common.math.Stats readFrom(java.nio.ByteBuffer r15) {
            com.google.common.base.Preconditions.checkNotNull(r15)
            int r0 = r15.remaining()
            r1 = 40
            if (r0 < r1) goto Ld
            r0 = 1
            goto Le
        Ld:
            r0 = 0
        Le:
            int r2 = r15.remaining()
            java.lang.String r3 = "Expected at least Stats.BYTES = %s remaining , got %s"
            com.google.common.base.Preconditions.checkArgument(r0, r3, r1, r2)
            com.google.common.math.Stats r0 = new com.google.common.math.Stats
            long r5 = r15.getLong()
            double r7 = r15.getDouble()
            double r9 = r15.getDouble()
            double r11 = r15.getDouble()
            double r13 = r15.getDouble()
            r4 = r0
            r4.<init>(r5, r7, r9, r11, r13)
            return r0
    }

    public long count() {
            r2 = this;
            long r0 = r2.count
            return r0
    }

    public boolean equals(@javax.annotation.CheckForNull java.lang.Object r7) {
            r6 = this;
            r0 = 0
            if (r7 != 0) goto L4
            return r0
        L4:
            java.lang.Class<com.google.common.math.Stats> r1 = com.google.common.math.Stats.class
            java.lang.Class r2 = r7.getClass()
            if (r1 == r2) goto Ld
            return r0
        Ld:
            com.google.common.math.Stats r7 = (com.google.common.math.Stats) r7
            long r1 = r6.count
            long r3 = r7.count
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L58
            double r1 = r6.mean
            long r1 = java.lang.Double.doubleToLongBits(r1)
            double r3 = r7.mean
            long r3 = java.lang.Double.doubleToLongBits(r3)
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L58
            double r1 = r6.sumOfSquaresOfDeltas
            long r1 = java.lang.Double.doubleToLongBits(r1)
            double r3 = r7.sumOfSquaresOfDeltas
            long r3 = java.lang.Double.doubleToLongBits(r3)
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L58
            double r1 = r6.min
            long r1 = java.lang.Double.doubleToLongBits(r1)
            double r3 = r7.min
            long r3 = java.lang.Double.doubleToLongBits(r3)
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L58
            double r1 = r6.max
            long r1 = java.lang.Double.doubleToLongBits(r1)
            double r3 = r7.max
            long r3 = java.lang.Double.doubleToLongBits(r3)
            int r7 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r7 != 0) goto L58
            r0 = 1
        L58:
            return r0
    }

    public int hashCode() {
            r3 = this;
            r0 = 5
            java.lang.Object[] r0 = new java.lang.Object[r0]
            long r1 = r3.count
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r2 = 0
            r0[r2] = r1
            double r1 = r3.mean
            java.lang.Double r1 = java.lang.Double.valueOf(r1)
            r2 = 1
            r0[r2] = r1
            double r1 = r3.sumOfSquaresOfDeltas
            java.lang.Double r1 = java.lang.Double.valueOf(r1)
            r2 = 2
            r0[r2] = r1
            double r1 = r3.min
            java.lang.Double r1 = java.lang.Double.valueOf(r1)
            r2 = 3
            r0[r2] = r1
            double r1 = r3.max
            java.lang.Double r1 = java.lang.Double.valueOf(r1)
            r2 = 4
            r0[r2] = r1
            int r0 = com.google.common.base.Objects.hashCode(r0)
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

    public double populationStandardDeviation() {
            r2 = this;
            double r0 = r2.populationVariance()
            double r0 = java.lang.Math.sqrt(r0)
            return r0
    }

    public double populationVariance() {
            r5 = this;
            long r0 = r5.count
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto La
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
            long r2 = r5.count()
            double r2 = (double) r2
            double r0 = r0 / r2
            return r0
    }

    public double sampleStandardDeviation() {
            r2 = this;
            double r0 = r2.sampleVariance()
            double r0 = java.lang.Math.sqrt(r0)
            return r0
    }

    public double sampleVariance() {
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

    public double sum() {
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

    public byte[] toByteArray() {
            r2 = this;
            r0 = 40
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r0)
            java.nio.ByteOrder r1 = java.nio.ByteOrder.LITTLE_ENDIAN
            java.nio.ByteBuffer r0 = r0.order(r1)
            r2.writeTo(r0)
            byte[] r0 = r0.array()
            return r0
    }

    public java.lang.String toString() {
            r6 = this;
            long r0 = r6.count()
            java.lang.String r2 = "count"
            r3 = 0
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 <= 0) goto L3d
            com.google.common.base.MoreObjects$ToStringHelper r0 = com.google.common.base.MoreObjects.toStringHelper(r6)
            long r3 = r6.count
            com.google.common.base.MoreObjects$ToStringHelper r0 = r0.add(r2, r3)
            double r1 = r6.mean
            java.lang.String r3 = "mean"
            com.google.common.base.MoreObjects$ToStringHelper r0 = r0.add(r3, r1)
            double r1 = r6.populationStandardDeviation()
            java.lang.String r3 = "populationStandardDeviation"
            com.google.common.base.MoreObjects$ToStringHelper r0 = r0.add(r3, r1)
            double r1 = r6.min
            java.lang.String r3 = "min"
            com.google.common.base.MoreObjects$ToStringHelper r0 = r0.add(r3, r1)
            double r1 = r6.max
            java.lang.String r3 = "max"
            com.google.common.base.MoreObjects$ToStringHelper r0 = r0.add(r3, r1)
            java.lang.String r0 = r0.toString()
            return r0
        L3d:
            com.google.common.base.MoreObjects$ToStringHelper r0 = com.google.common.base.MoreObjects.toStringHelper(r6)
            long r3 = r6.count
            com.google.common.base.MoreObjects$ToStringHelper r0 = r0.add(r2, r3)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public final void writeTo(java.nio.ByteBuffer r5) {
            r4 = this;
            com.google.common.base.Preconditions.checkNotNull(r5)
            int r0 = r5.remaining()
            r1 = 40
            if (r0 < r1) goto Ld
            r0 = 1
            goto Le
        Ld:
            r0 = 0
        Le:
            int r2 = r5.remaining()
            java.lang.String r3 = "Expected at least Stats.BYTES = %s remaining , got %s"
            com.google.common.base.Preconditions.checkArgument(r0, r3, r1, r2)
            long r0 = r4.count
            java.nio.ByteBuffer r5 = r5.putLong(r0)
            double r0 = r4.mean
            java.nio.ByteBuffer r5 = r5.putDouble(r0)
            double r0 = r4.sumOfSquaresOfDeltas
            java.nio.ByteBuffer r5 = r5.putDouble(r0)
            double r0 = r4.min
            java.nio.ByteBuffer r5 = r5.putDouble(r0)
            double r0 = r4.max
            r5.putDouble(r0)
            return
    }
}
