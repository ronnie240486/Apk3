package com.google.common.hash;

/* JADX INFO: loaded from: classes2.dex */
@com.google.common.annotations.Beta
@com.google.common.hash.ElementTypesAreNonnullByDefault
public final class BloomFilter<T> implements com.google.common.base.Predicate<T>, java.io.Serializable {
    private final com.google.common.hash.BloomFilterStrategies.LockFreeBitArray bits;
    private final com.google.common.hash.Funnel<? super T> funnel;
    private final int numHashFunctions;
    private final com.google.common.hash.BloomFilter.Strategy strategy;

    /* JADX INFO: renamed from: com.google.common.hash.BloomFilter$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    /* JADX INFO: loaded from: classes.dex */
    public static class SerialForm<T> implements java.io.Serializable {
        private static final long serialVersionUID = 1;
        public final com.google.common.hash.Funnel<? super T> funnel;
        public final com.google.common.hash.BloomFilter.Strategy strategy;

        public SerialForm(com.google.common.hash.BloomFilter<T> r2) {
                r1 = this;
                r1.<init>()
                com.google.common.hash.BloomFilterStrategies$LockFreeBitArray r0 = com.google.common.hash.BloomFilter.access$000(r2)
                java.util.concurrent.atomic.AtomicLongArray r0 = r0.data
                com.google.common.hash.BloomFilterStrategies.LockFreeBitArray.toPlainArray(r0)
                com.google.common.hash.BloomFilter.access$100(r2)
                com.google.common.hash.Funnel r0 = com.google.common.hash.BloomFilter.access$200(r2)
                r1.funnel = r0
                com.google.common.hash.BloomFilter$Strategy r2 = com.google.common.hash.BloomFilter.access$300(r2)
                r1.strategy = r2
                return
        }
    }

    public interface Strategy extends java.io.Serializable {
        <T> boolean mightContain(@com.google.common.hash.ParametricNullness T r1, com.google.common.hash.Funnel<? super T> r2, int r3, com.google.common.hash.BloomFilterStrategies.LockFreeBitArray r4);

        int ordinal();

        <T> boolean put(@com.google.common.hash.ParametricNullness T r1, com.google.common.hash.Funnel<? super T> r2, int r3, com.google.common.hash.BloomFilterStrategies.LockFreeBitArray r4);
    }

    private BloomFilter(com.google.common.hash.BloomFilterStrategies.LockFreeBitArray r5, int r6, com.google.common.hash.Funnel<? super T> r7, com.google.common.hash.BloomFilter.Strategy r8) {
            r4 = this;
            r4.<init>()
            r0 = 1
            r1 = 0
            if (r6 <= 0) goto L9
            r2 = 1
            goto La
        L9:
            r2 = 0
        La:
            java.lang.String r3 = "numHashFunctions (%s) must be > 0"
            com.google.common.base.Preconditions.checkArgument(r2, r3, r6)
            r2 = 255(0xff, float:3.57E-43)
            if (r6 > r2) goto L14
            goto L15
        L14:
            r0 = 0
        L15:
            java.lang.String r1 = "numHashFunctions (%s) must be <= 255"
            com.google.common.base.Preconditions.checkArgument(r0, r1, r6)
            java.lang.Object r5 = com.google.common.base.Preconditions.checkNotNull(r5)
            com.google.common.hash.BloomFilterStrategies$LockFreeBitArray r5 = (com.google.common.hash.BloomFilterStrategies.LockFreeBitArray) r5
            r4.bits = r5
            r4.numHashFunctions = r6
            java.lang.Object r5 = com.google.common.base.Preconditions.checkNotNull(r7)
            com.google.common.hash.Funnel r5 = (com.google.common.hash.Funnel) r5
            r4.funnel = r5
            java.lang.Object r5 = com.google.common.base.Preconditions.checkNotNull(r8)
            com.google.common.hash.BloomFilter$Strategy r5 = (com.google.common.hash.BloomFilter.Strategy) r5
            r4.strategy = r5
            return
    }

    public static /* synthetic */ com.google.common.hash.BloomFilterStrategies.LockFreeBitArray access$000(com.google.common.hash.BloomFilter r0) {
            com.google.common.hash.BloomFilterStrategies$LockFreeBitArray r0 = r0.bits
            return r0
    }

    public static /* synthetic */ int access$100(com.google.common.hash.BloomFilter r0) {
            int r0 = r0.numHashFunctions
            return r0
    }

    public static /* synthetic */ com.google.common.hash.Funnel access$200(com.google.common.hash.BloomFilter r0) {
            com.google.common.hash.Funnel<? super T> r0 = r0.funnel
            return r0
    }

    public static /* synthetic */ com.google.common.hash.BloomFilter.Strategy access$300(com.google.common.hash.BloomFilter r0) {
            com.google.common.hash.BloomFilter$Strategy r0 = r0.strategy
            return r0
    }

    public static <T> com.google.common.hash.BloomFilter<T> create(com.google.common.hash.Funnel<? super T> r2, int r3) {
            long r0 = (long) r3
            com.google.common.hash.BloomFilter r2 = create(r2, r0)
            return r2
    }

    public static <T> com.google.common.hash.BloomFilter<T> create(com.google.common.hash.Funnel<? super T> r2, int r3, double r4) {
            long r0 = (long) r3
            com.google.common.hash.BloomFilter r2 = create(r2, r0, r4)
            return r2
    }

    public static <T> com.google.common.hash.BloomFilter<T> create(com.google.common.hash.Funnel<? super T> r2, long r3) {
            r0 = 4584304132692975288(0x3f9eb851eb851eb8, double:0.03)
            com.google.common.hash.BloomFilter r2 = create(r2, r3, r0)
            return r2
    }

    public static <T> com.google.common.hash.BloomFilter<T> create(com.google.common.hash.Funnel<? super T> r9, long r10, double r12) {
            com.google.common.hash.BloomFilterStrategies r0 = com.google.common.hash.BloomFilterStrategies.MURMUR128_MITZ_64
            com.google.common.base.Preconditions.checkNotNull(r9)
            r1 = 0
            r3 = 0
            r4 = 1
            int r5 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r5 < 0) goto Lf
            r1 = 1
            goto L10
        Lf:
            r1 = 0
        L10:
            java.lang.String r2 = "Expected insertions (%s) must be >= 0"
            com.google.common.base.Preconditions.checkArgument(r1, r2, r10)
            r1 = 0
            int r6 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r6 <= 0) goto L1d
            r1 = 1
            goto L1e
        L1d:
            r1 = 0
        L1e:
            java.lang.Double r2 = java.lang.Double.valueOf(r12)
            java.lang.String r7 = "False positive probability (%s) must be > 0.0"
            com.google.common.base.Preconditions.checkArgument(r1, r7, r2)
            r1 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r7 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r7 >= 0) goto L2e
            r3 = 1
        L2e:
            java.lang.Double r1 = java.lang.Double.valueOf(r12)
            java.lang.String r2 = "False positive probability (%s) must be < 1.0"
            com.google.common.base.Preconditions.checkArgument(r3, r2, r1)
            com.google.common.base.Preconditions.checkNotNull(r0)
            if (r5 != 0) goto L3e
            r10 = 1
        L3e:
            if (r6 != 0) goto L42
            r12 = 1
        L42:
            long r1 = -r10
            double r1 = (double) r1
            double r12 = java.lang.Math.log(r12)
            double r12 = r12 * r1
            r1 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r5 = java.lang.Math.log(r1)
            double r7 = java.lang.Math.log(r1)
            double r7 = r7 * r5
            double r12 = r12 / r7
            long r12 = (long) r12
            double r5 = (double) r12
            double r10 = (double) r10
            double r5 = r5 / r10
            double r10 = java.lang.Math.log(r1)
            double r10 = r10 * r5
            long r10 = java.lang.Math.round(r10)
            int r11 = (int) r10
            int r10 = java.lang.Math.max(r4, r11)
            com.google.common.hash.BloomFilter r11 = new com.google.common.hash.BloomFilter     // Catch: java.lang.IllegalArgumentException -> L75
            com.google.common.hash.BloomFilterStrategies$LockFreeBitArray r1 = new com.google.common.hash.BloomFilterStrategies$LockFreeBitArray     // Catch: java.lang.IllegalArgumentException -> L75
            r1.<init>(r12)     // Catch: java.lang.IllegalArgumentException -> L75
            r11.<init>(r1, r10, r9, r0)     // Catch: java.lang.IllegalArgumentException -> L75
            return r11
        L75:
            r9 = move-exception
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            r11 = 57
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r11)
            java.lang.String r11 = "Could not create BloomFilter of "
            r0.append(r11)
            r0.append(r12)
            java.lang.String r11 = " bits"
            r0.append(r11)
            java.lang.String r11 = r0.toString()
            r10.<init>(r11, r9)
            throw r10
    }

    public static <T> com.google.common.hash.BloomFilter<T> readFrom(java.io.InputStream r9, com.google.common.hash.Funnel<? super T> r10) throws java.io.IOException {
            java.lang.String r0 = "InputStream"
            com.google.common.base.Preconditions.checkNotNull(r9, r0)
            java.lang.String r0 = "Funnel"
            com.google.common.base.Preconditions.checkNotNull(r10, r0)
            r0 = -1
            java.io.DataInputStream r1 = new java.io.DataInputStream     // Catch: java.lang.RuntimeException -> L4b
            r1.<init>(r9)     // Catch: java.lang.RuntimeException -> L4b
            byte r9 = r1.readByte()     // Catch: java.lang.RuntimeException -> L4b
            byte r2 = r1.readByte()     // Catch: java.lang.RuntimeException -> L46
            int r2 = com.google.common.primitives.UnsignedBytes.toInt(r2)     // Catch: java.lang.RuntimeException -> L46
            int r0 = r1.readInt()     // Catch: java.lang.RuntimeException -> L44
            com.google.common.hash.BloomFilterStrategies[] r3 = com.google.common.hash.BloomFilterStrategies.values()     // Catch: java.lang.RuntimeException -> L3f
            r3 = r3[r9]     // Catch: java.lang.RuntimeException -> L3f
            long[] r4 = new long[r0]     // Catch: java.lang.RuntimeException -> L3f
            r5 = 0
        L29:
            if (r5 >= r0) goto L34
            long r6 = r1.readLong()     // Catch: java.lang.RuntimeException -> L3f
            r4[r5] = r6     // Catch: java.lang.RuntimeException -> L3f
            int r5 = r5 + 1
            goto L29
        L34:
            com.google.common.hash.BloomFilter r1 = new com.google.common.hash.BloomFilter     // Catch: java.lang.RuntimeException -> L3f
            com.google.common.hash.BloomFilterStrategies$LockFreeBitArray r5 = new com.google.common.hash.BloomFilterStrategies$LockFreeBitArray     // Catch: java.lang.RuntimeException -> L3f
            r5.<init>(r4)     // Catch: java.lang.RuntimeException -> L3f
            r1.<init>(r5, r2, r10, r3)     // Catch: java.lang.RuntimeException -> L3f
            return r1
        L3f:
            r10 = move-exception
            r8 = r0
            r0 = r9
            r9 = r8
            goto L4e
        L44:
            r10 = move-exception
            goto L48
        L46:
            r10 = move-exception
            r2 = -1
        L48:
            r0 = r9
            r9 = -1
            goto L4e
        L4b:
            r10 = move-exception
            r9 = -1
            r2 = -1
        L4e:
            r1 = 134(0x86, float:1.88E-43)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r1)
            java.lang.String r1 = "Unable to deserialize BloomFilter from InputStream. strategyOrdinal: "
            r3.append(r1)
            r3.append(r0)
            java.lang.String r0 = " numHashFunctions: "
            r3.append(r0)
            r3.append(r2)
            java.lang.String r0 = " dataLength: "
            r3.append(r0)
            r3.append(r9)
            java.lang.String r9 = r3.toString()
            java.io.IOException r0 = new java.io.IOException
            r0.<init>(r9, r10)
            throw r0
    }

    private java.lang.Object writeReplace() {
            r1 = this;
            com.google.common.hash.BloomFilter$SerialForm r0 = new com.google.common.hash.BloomFilter$SerialForm
            r0.<init>(r1)
            return r0
    }

    @Override // com.google.common.base.Predicate
    @java.lang.Deprecated
    public boolean apply(@com.google.common.hash.ParametricNullness T r1) {
            r0 = this;
            boolean r1 = r0.mightContain(r1)
            return r1
    }

    public long approximateElementCount() {
            r4 = this;
            com.google.common.hash.BloomFilterStrategies$LockFreeBitArray r0 = r4.bits
            long r0 = r0.bitSize()
            com.google.common.hash.BloomFilterStrategies$LockFreeBitArray r2 = r4.bits
            long r2 = r2.bitCount()
            double r2 = (double) r2
            double r0 = (double) r0
            double r2 = r2 / r0
            double r2 = -r2
            double r2 = java.lang.Math.log1p(r2)
            double r2 = -r2
            double r2 = r2 * r0
            int r0 = r4.numHashFunctions
            double r0 = (double) r0
            double r2 = r2 / r0
            java.math.RoundingMode r0 = java.math.RoundingMode.HALF_UP
            long r0 = com.google.common.math.DoubleMath.roundToLong(r2, r0)
            return r0
    }

    @com.google.common.annotations.VisibleForTesting
    public final long bitSize() {
            r2 = this;
            com.google.common.hash.BloomFilterStrategies$LockFreeBitArray r0 = r2.bits
            long r0 = r0.bitSize()
            return r0
    }

    public com.google.common.hash.BloomFilter<T> copy() {
            r5 = this;
            com.google.common.hash.BloomFilter r0 = new com.google.common.hash.BloomFilter
            com.google.common.hash.BloomFilterStrategies$LockFreeBitArray r1 = r5.bits
            com.google.common.hash.BloomFilterStrategies$LockFreeBitArray r2 = new com.google.common.hash.BloomFilterStrategies$LockFreeBitArray
            java.util.concurrent.atomic.AtomicLongArray r1 = r1.data
            long[] r1 = com.google.common.hash.BloomFilterStrategies.LockFreeBitArray.toPlainArray(r1)
            r2.<init>(r1)
            int r1 = r5.numHashFunctions
            com.google.common.hash.Funnel<? super T> r3 = r5.funnel
            com.google.common.hash.BloomFilter$Strategy r4 = r5.strategy
            r0.<init>(r2, r1, r3, r4)
            return r0
    }

    @Override // com.google.common.base.Predicate
    public boolean equals(@javax.annotation.CheckForNull java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof com.google.common.hash.BloomFilter
            r2 = 0
            if (r1 == 0) goto L32
            com.google.common.hash.BloomFilter r5 = (com.google.common.hash.BloomFilter) r5
            int r1 = r4.numHashFunctions
            int r3 = r5.numHashFunctions
            if (r1 != r3) goto L30
            com.google.common.hash.Funnel<? super T> r1 = r4.funnel
            com.google.common.hash.Funnel<? super T> r3 = r5.funnel
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L30
            com.google.common.hash.BloomFilterStrategies$LockFreeBitArray r1 = r4.bits
            com.google.common.hash.BloomFilterStrategies$LockFreeBitArray r3 = r5.bits
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L30
            com.google.common.hash.BloomFilter$Strategy r1 = r4.strategy
            com.google.common.hash.BloomFilter$Strategy r5 = r5.strategy
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L30
            goto L31
        L30:
            r0 = 0
        L31:
            return r0
        L32:
            return r2
    }

    public double expectedFpp() {
            r4 = this;
            com.google.common.hash.BloomFilterStrategies$LockFreeBitArray r0 = r4.bits
            long r0 = r0.bitCount()
            double r0 = (double) r0
            long r2 = r4.bitSize()
            double r2 = (double) r2
            double r0 = r0 / r2
            int r2 = r4.numHashFunctions
            double r2 = (double) r2
            double r0 = java.lang.Math.pow(r0, r2)
            return r0
    }

    public int hashCode() {
            r3 = this;
            r0 = 4
            java.lang.Object[] r0 = new java.lang.Object[r0]
            int r1 = r3.numHashFunctions
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 0
            r0[r2] = r1
            com.google.common.hash.Funnel<? super T> r1 = r3.funnel
            r2 = 1
            r0[r2] = r1
            com.google.common.hash.BloomFilter$Strategy r1 = r3.strategy
            r2 = 2
            r0[r2] = r1
            com.google.common.hash.BloomFilterStrategies$LockFreeBitArray r1 = r3.bits
            r2 = 3
            r0[r2] = r1
            int r0 = com.google.common.base.Objects.hashCode(r0)
            return r0
    }

    public boolean isCompatible(com.google.common.hash.BloomFilter<T> r6) {
            r5 = this;
            com.google.common.base.Preconditions.checkNotNull(r6)
            if (r5 == r6) goto L2d
            int r0 = r5.numHashFunctions
            int r1 = r6.numHashFunctions
            if (r0 != r1) goto L2d
            long r0 = r5.bitSize()
            long r2 = r6.bitSize()
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L2d
            com.google.common.hash.BloomFilter$Strategy r0 = r5.strategy
            com.google.common.hash.BloomFilter$Strategy r1 = r6.strategy
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L2d
            com.google.common.hash.Funnel<? super T> r0 = r5.funnel
            com.google.common.hash.Funnel<? super T> r6 = r6.funnel
            boolean r6 = r0.equals(r6)
            if (r6 == 0) goto L2d
            r6 = 1
            goto L2e
        L2d:
            r6 = 0
        L2e:
            return r6
    }

    public boolean mightContain(@com.google.common.hash.ParametricNullness T r5) {
            r4 = this;
            com.google.common.hash.BloomFilter$Strategy r0 = r4.strategy
            com.google.common.hash.Funnel<? super T> r1 = r4.funnel
            int r2 = r4.numHashFunctions
            com.google.common.hash.BloomFilterStrategies$LockFreeBitArray r3 = r4.bits
            boolean r5 = r0.mightContain(r5, r1, r2, r3)
            return r5
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public boolean put(@com.google.common.hash.ParametricNullness T r5) {
            r4 = this;
            com.google.common.hash.BloomFilter$Strategy r0 = r4.strategy
            com.google.common.hash.Funnel<? super T> r1 = r4.funnel
            int r2 = r4.numHashFunctions
            com.google.common.hash.BloomFilterStrategies$LockFreeBitArray r3 = r4.bits
            boolean r5 = r0.put(r5, r1, r2, r3)
            return r5
    }

    public void putAll(com.google.common.hash.BloomFilter<T> r14) {
            r13 = this;
            com.google.common.base.Preconditions.checkNotNull(r14)
            r0 = 1
            r1 = 0
            if (r13 == r14) goto L9
            r2 = 1
            goto La
        L9:
            r2 = 0
        La:
            java.lang.String r3 = "Cannot combine a BloomFilter with itself."
            com.google.common.base.Preconditions.checkArgument(r2, r3)
            int r2 = r13.numHashFunctions
            int r3 = r14.numHashFunctions
            if (r2 != r3) goto L17
            r4 = 1
            goto L18
        L17:
            r4 = 0
        L18:
            java.lang.String r5 = "BloomFilters must have the same number of hash functions (%s != %s)"
            com.google.common.base.Preconditions.checkArgument(r4, r5, r2, r3)
            long r2 = r13.bitSize()
            long r4 = r14.bitSize()
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto L2b
            r7 = 1
            goto L2c
        L2b:
            r7 = 0
        L2c:
            long r9 = r13.bitSize()
            long r11 = r14.bitSize()
            java.lang.String r8 = "BloomFilters must have the same size underlying bit arrays (%s != %s)"
            com.google.common.base.Preconditions.checkArgument(r7, r8, r9, r11)
            com.google.common.hash.BloomFilter$Strategy r0 = r13.strategy
            com.google.common.hash.BloomFilter$Strategy r1 = r14.strategy
            boolean r0 = r0.equals(r1)
            com.google.common.hash.BloomFilter$Strategy r1 = r13.strategy
            com.google.common.hash.BloomFilter$Strategy r2 = r14.strategy
            java.lang.String r3 = "BloomFilters must have equal strategies (%s != %s)"
            com.google.common.base.Preconditions.checkArgument(r0, r3, r1, r2)
            com.google.common.hash.Funnel<? super T> r0 = r13.funnel
            com.google.common.hash.Funnel<? super T> r1 = r14.funnel
            boolean r0 = r0.equals(r1)
            com.google.common.hash.Funnel<? super T> r1 = r13.funnel
            com.google.common.hash.Funnel<? super T> r2 = r14.funnel
            java.lang.String r3 = "BloomFilters must have equal funnels (%s != %s)"
            com.google.common.base.Preconditions.checkArgument(r0, r3, r1, r2)
            com.google.common.hash.BloomFilterStrategies$LockFreeBitArray r0 = r13.bits
            com.google.common.hash.BloomFilterStrategies$LockFreeBitArray r14 = r14.bits
            r0.putAll(r14)
            return
    }

    public void writeTo(java.io.OutputStream r4) throws java.io.IOException {
            r3 = this;
            java.io.DataOutputStream r0 = new java.io.DataOutputStream
            r0.<init>(r4)
            com.google.common.hash.BloomFilter$Strategy r4 = r3.strategy
            int r4 = r4.ordinal()
            long r1 = (long) r4
            byte r4 = com.google.common.primitives.SignedBytes.checkedCast(r1)
            r0.writeByte(r4)
            int r4 = r3.numHashFunctions
            long r1 = (long) r4
            byte r4 = com.google.common.primitives.UnsignedBytes.checkedCast(r1)
            r0.writeByte(r4)
            com.google.common.hash.BloomFilterStrategies$LockFreeBitArray r4 = r3.bits
            java.util.concurrent.atomic.AtomicLongArray r4 = r4.data
            int r4 = r4.length()
            r0.writeInt(r4)
            r4 = 0
        L29:
            com.google.common.hash.BloomFilterStrategies$LockFreeBitArray r1 = r3.bits
            java.util.concurrent.atomic.AtomicLongArray r1 = r1.data
            int r1 = r1.length()
            if (r4 >= r1) goto L41
            com.google.common.hash.BloomFilterStrategies$LockFreeBitArray r1 = r3.bits
            java.util.concurrent.atomic.AtomicLongArray r1 = r1.data
            long r1 = r1.get(r4)
            r0.writeLong(r1)
            int r4 = r4 + 1
            goto L29
        L41:
            return
    }
}
