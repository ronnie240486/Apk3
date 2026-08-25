package com.google.common.hash;

/* JADX INFO: loaded from: classes.dex */
@com.google.common.hash.ElementTypesAreNonnullByDefault
abstract enum BloomFilterStrategies extends java.lang.Enum<com.google.common.hash.BloomFilterStrategies> implements com.google.common.hash.BloomFilter.Strategy {
    private static final /* synthetic */ com.google.common.hash.BloomFilterStrategies[] $VALUES = null;
    public static final com.google.common.hash.BloomFilterStrategies MURMUR128_MITZ_32 = null;
    public static final com.google.common.hash.BloomFilterStrategies MURMUR128_MITZ_64 = null;



    /* JADX INFO: loaded from: classes2.dex */
    public static final class LockFreeBitArray {
        private static final int LONG_ADDRESSABLE_BITS = 6;
        private final com.google.common.hash.LongAddable bitCount;
        public final java.util.concurrent.atomic.AtomicLongArray data;

        public LockFreeBitArray(long r5) {
                r4 = this;
                r4.<init>()
                r0 = 0
                int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
                if (r2 <= 0) goto Lb
                r0 = 1
                goto Lc
            Lb:
                r0 = 0
            Lc:
                java.lang.String r1 = "data length is zero!"
                com.google.common.base.Preconditions.checkArgument(r0, r1)
                java.util.concurrent.atomic.AtomicLongArray r0 = new java.util.concurrent.atomic.AtomicLongArray
                r1 = 64
                java.math.RoundingMode r3 = java.math.RoundingMode.CEILING
                long r5 = com.google.common.math.LongMath.divide(r5, r1, r3)
                int r5 = com.google.common.primitives.Ints.checkedCast(r5)
                r0.<init>(r5)
                r4.data = r0
                com.google.common.hash.LongAddable r5 = com.google.common.hash.LongAddables.create()
                r4.bitCount = r5
                return
        }

        public LockFreeBitArray(long[] r7) {
                r6 = this;
                r6.<init>()
                int r0 = r7.length
                r1 = 0
                if (r0 <= 0) goto L9
                r0 = 1
                goto La
            L9:
                r0 = 0
            La:
                java.lang.String r2 = "data length is zero!"
                com.google.common.base.Preconditions.checkArgument(r0, r2)
                java.util.concurrent.atomic.AtomicLongArray r0 = new java.util.concurrent.atomic.AtomicLongArray
                r0.<init>(r7)
                r6.data = r0
                com.google.common.hash.LongAddable r0 = com.google.common.hash.LongAddables.create()
                r6.bitCount = r0
                r2 = 0
                int r0 = r7.length
            L1f:
                if (r1 >= r0) goto L2c
                r4 = r7[r1]
                int r4 = java.lang.Long.bitCount(r4)
                long r4 = (long) r4
                long r2 = r2 + r4
                int r1 = r1 + 1
                goto L1f
            L2c:
                com.google.common.hash.LongAddable r7 = r6.bitCount
                r7.add(r2)
                return
        }

        public static long[] toPlainArray(java.util.concurrent.atomic.AtomicLongArray r5) {
                int r0 = r5.length()
                long[] r1 = new long[r0]
                r2 = 0
            L7:
                if (r2 >= r0) goto L12
                long r3 = r5.get(r2)
                r1[r2] = r3
                int r2 = r2 + 1
                goto L7
            L12:
                return r1
        }

        public final long bitCount() {
                r2 = this;
                com.google.common.hash.LongAddable r0 = r2.bitCount
                long r0 = r0.sum()
                return r0
        }

        public final long bitSize() {
                r4 = this;
                java.util.concurrent.atomic.AtomicLongArray r0 = r4.data
                int r0 = r0.length()
                long r0 = (long) r0
                r2 = 64
                long r0 = r0 * r2
                return r0
        }

        public boolean equals(@javax.annotation.CheckForNull java.lang.Object r2) {
                r1 = this;
                boolean r0 = r2 instanceof com.google.common.hash.BloomFilterStrategies.LockFreeBitArray
                if (r0 == 0) goto L17
                com.google.common.hash.BloomFilterStrategies$LockFreeBitArray r2 = (com.google.common.hash.BloomFilterStrategies.LockFreeBitArray) r2
                java.util.concurrent.atomic.AtomicLongArray r0 = r1.data
                long[] r0 = toPlainArray(r0)
                java.util.concurrent.atomic.AtomicLongArray r2 = r2.data
                long[] r2 = toPlainArray(r2)
                boolean r2 = java.util.Arrays.equals(r0, r2)
                return r2
            L17:
                r2 = 0
                return r2
        }

        public final boolean get(long r5) {
                r4 = this;
                java.util.concurrent.atomic.AtomicLongArray r0 = r4.data
                r1 = 6
                long r1 = r5 >>> r1
                int r2 = (int) r1
                long r0 = r0.get(r2)
                int r6 = (int) r5
                r2 = 1
                long r5 = r2 << r6
                long r5 = r5 & r0
                r0 = 0
                int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
                if (r2 == 0) goto L18
                r5 = 1
                goto L19
            L18:
                r5 = 0
            L19:
                return r5
        }

        public int hashCode() {
                r1 = this;
                java.util.concurrent.atomic.AtomicLongArray r0 = r1.data
                long[] r0 = toPlainArray(r0)
                int r0 = java.util.Arrays.hashCode(r0)
                return r0
        }

        public final void putAll(com.google.common.hash.BloomFilterStrategies.LockFreeBitArray r19) {
                r18 = this;
                r0 = r18
                r1 = r19
                java.util.concurrent.atomic.AtomicLongArray r2 = r0.data
                int r2 = r2.length()
                java.util.concurrent.atomic.AtomicLongArray r3 = r1.data
                int r3 = r3.length()
                r4 = 1
                r5 = 0
                if (r2 != r3) goto L16
                r2 = 1
                goto L17
            L16:
                r2 = 0
            L17:
                java.util.concurrent.atomic.AtomicLongArray r3 = r0.data
                int r3 = r3.length()
                java.util.concurrent.atomic.AtomicLongArray r6 = r1.data
                int r6 = r6.length()
                java.lang.String r7 = "BitArrays must be of equal length (%s != %s)"
                com.google.common.base.Preconditions.checkArgument(r2, r7, r3, r6)
                r2 = 0
            L29:
                java.util.concurrent.atomic.AtomicLongArray r3 = r0.data
                int r3 = r3.length()
                if (r2 >= r3) goto L66
                java.util.concurrent.atomic.AtomicLongArray r3 = r1.data
                long r6 = r3.get(r2)
            L37:
                java.util.concurrent.atomic.AtomicLongArray r3 = r0.data
                long r14 = r3.get(r2)
                long r16 = r14 | r6
                int r3 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
                if (r3 != 0) goto L45
                r3 = 0
                goto L52
            L45:
                java.util.concurrent.atomic.AtomicLongArray r8 = r0.data
                r9 = r2
                r10 = r14
                r12 = r16
                boolean r3 = r8.compareAndSet(r9, r10, r12)
                if (r3 == 0) goto L37
                r3 = 1
            L52:
                if (r3 == 0) goto L63
                int r3 = java.lang.Long.bitCount(r16)
                int r6 = java.lang.Long.bitCount(r14)
                int r3 = r3 - r6
                com.google.common.hash.LongAddable r6 = r0.bitCount
                long r7 = (long) r3
                r6.add(r7)
            L63:
                int r2 = r2 + 1
                goto L29
            L66:
                return
        }

        public final boolean set(long r11) {
                r10 = this;
                boolean r0 = r10.get(r11)
                r1 = 0
                if (r0 == 0) goto L8
                return r1
            L8:
                r0 = 6
                long r2 = r11 >>> r0
                int r0 = (int) r2
                r2 = 1
                int r12 = (int) r11
                long r11 = r2 << r12
            L11:
                java.util.concurrent.atomic.AtomicLongArray r2 = r10.data
                long r6 = r2.get(r0)
                long r8 = r6 | r11
                int r2 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
                if (r2 != 0) goto L1e
                return r1
            L1e:
                java.util.concurrent.atomic.AtomicLongArray r4 = r10.data
                r5 = r0
                boolean r2 = r4.compareAndSet(r5, r6, r8)
                if (r2 == 0) goto L11
                com.google.common.hash.LongAddable r11 = r10.bitCount
                r11.increment()
                r11 = 1
                return r11
        }
    }

    private static /* synthetic */ com.google.common.hash.BloomFilterStrategies[] $values() {
            r0 = 2
            com.google.common.hash.BloomFilterStrategies[] r0 = new com.google.common.hash.BloomFilterStrategies[r0]
            com.google.common.hash.BloomFilterStrategies r1 = com.google.common.hash.BloomFilterStrategies.MURMUR128_MITZ_32
            r2 = 0
            r0[r2] = r1
            com.google.common.hash.BloomFilterStrategies r1 = com.google.common.hash.BloomFilterStrategies.MURMUR128_MITZ_64
            r2 = 1
            r0[r2] = r1
            return r0
    }

    static {
            com.google.common.hash.BloomFilterStrategies$1 r0 = new com.google.common.hash.BloomFilterStrategies$1
            r0.<init>()
            com.google.common.hash.BloomFilterStrategies.MURMUR128_MITZ_32 = r0
            com.google.common.hash.BloomFilterStrategies$2 r0 = new com.google.common.hash.BloomFilterStrategies$2
            r0.<init>()
            com.google.common.hash.BloomFilterStrategies.MURMUR128_MITZ_64 = r0
            com.google.common.hash.BloomFilterStrategies[] r0 = $values()
            com.google.common.hash.BloomFilterStrategies.$VALUES = r0
            return
    }

    private BloomFilterStrategies(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public /* synthetic */ BloomFilterStrategies(java.lang.String r1, int r2, com.google.common.hash.BloomFilterStrategies.AnonymousClass1 r3) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static com.google.common.hash.BloomFilterStrategies valueOf(java.lang.String r1) {
            java.lang.Class<com.google.common.hash.BloomFilterStrategies> r0 = com.google.common.hash.BloomFilterStrategies.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            com.google.common.hash.BloomFilterStrategies r1 = (com.google.common.hash.BloomFilterStrategies) r1
            return r1
    }

    public static com.google.common.hash.BloomFilterStrategies[] values() {
            com.google.common.hash.BloomFilterStrategies[] r0 = com.google.common.hash.BloomFilterStrategies.$VALUES
            java.lang.Object r0 = r0.clone()
            com.google.common.hash.BloomFilterStrategies[] r0 = (com.google.common.hash.BloomFilterStrategies[]) r0
            return r0
    }
}
