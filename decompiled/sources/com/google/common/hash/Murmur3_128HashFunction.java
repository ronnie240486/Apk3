package com.google.common.hash;

/* JADX INFO: loaded from: classes.dex */
@com.google.errorprone.annotations.Immutable
@com.google.common.hash.ElementTypesAreNonnullByDefault
final class Murmur3_128HashFunction extends com.google.common.hash.AbstractHashFunction implements java.io.Serializable {
    public static final com.google.common.hash.HashFunction GOOD_FAST_HASH_128 = null;
    public static final com.google.common.hash.HashFunction MURMUR3_128 = null;
    private static final long serialVersionUID = 0;
    private final int seed;

    /* JADX INFO: loaded from: classes2.dex */
    public static final class Murmur3_128Hasher extends com.google.common.hash.AbstractStreamingHasher {
        private static final long C1 = -8663945395140668459L;
        private static final long C2 = 5545529020109919103L;
        private static final int CHUNK_SIZE = 16;
        private long h1;
        private long h2;
        private int length;

        public Murmur3_128Hasher(int r3) {
                r2 = this;
                r0 = 16
                r2.<init>(r0)
                long r0 = (long) r3
                r2.h1 = r0
                r2.h2 = r0
                r3 = 0
                r2.length = r3
                return
        }

        private void bmix64(long r7, long r9) {
                r6 = this;
                long r0 = r6.h1
                long r7 = mixK1(r7)
                long r7 = r7 ^ r0
                r6.h1 = r7
                r0 = 27
                long r7 = java.lang.Long.rotateLeft(r7, r0)
                long r0 = r6.h2
                long r7 = r7 + r0
                r2 = 5
                long r7 = r7 * r2
                r4 = 1390208809(0x52dce729, double:6.86854413E-315)
                long r7 = r7 + r4
                r6.h1 = r7
                long r7 = mixK2(r9)
                long r7 = r7 ^ r0
                r6.h2 = r7
                r9 = 31
                long r7 = java.lang.Long.rotateLeft(r7, r9)
                long r9 = r6.h1
                long r7 = r7 + r9
                long r7 = r7 * r2
                r9 = 944331445(0x38495ab5, double:4.665617253E-315)
                long r7 = r7 + r9
                r6.h2 = r7
                return
        }

        private static long fmix64(long r3) {
                r0 = 33
                long r1 = r3 >>> r0
                long r3 = r3 ^ r1
                r1 = -49064778989728563(0xff51afd7ed558ccd, double:-1.9406492979739223E305)
                long r3 = r3 * r1
                long r1 = r3 >>> r0
                long r3 = r3 ^ r1
                r1 = -4265267296055464877(0xc4ceb9fe1a85ec53, double:-2.902039044684214E23)
                long r3 = r3 * r1
                long r0 = r3 >>> r0
                long r3 = r3 ^ r0
                return r3
        }

        private static long mixK1(long r2) {
                r0 = -8663945395140668459(0x87c37b91114253d5, double:-2.8811287363897357E-271)
                long r2 = r2 * r0
                r0 = 31
                long r2 = java.lang.Long.rotateLeft(r2, r0)
                r0 = 5545529020109919103(0x4cf5ad432745937f, double:5.573325460219186E62)
                long r2 = r2 * r0
                return r2
        }

        private static long mixK2(long r2) {
                r0 = 5545529020109919103(0x4cf5ad432745937f, double:5.573325460219186E62)
                long r2 = r2 * r0
                r0 = 33
                long r2 = java.lang.Long.rotateLeft(r2, r0)
                r0 = -8663945395140668459(0x87c37b91114253d5, double:-2.8811287363897357E-271)
                long r2 = r2 * r0
                return r2
        }

        @Override // com.google.common.hash.AbstractStreamingHasher
        public final com.google.common.hash.HashCode makeHash() {
                r7 = this;
                long r0 = r7.h1
                int r2 = r7.length
                long r3 = (long) r2
                long r0 = r0 ^ r3
                long r3 = r7.h2
                long r5 = (long) r2
                long r2 = r3 ^ r5
                long r0 = r0 + r2
                r7.h1 = r0
                long r2 = r2 + r0
                r7.h2 = r2
                long r0 = fmix64(r0)
                r7.h1 = r0
                long r0 = r7.h2
                long r0 = fmix64(r0)
                long r2 = r7.h1
                long r2 = r2 + r0
                r7.h1 = r2
                long r0 = r0 + r2
                r7.h2 = r0
                r0 = 16
                byte[] r0 = new byte[r0]
                java.nio.ByteBuffer r0 = java.nio.ByteBuffer.wrap(r0)
                java.nio.ByteOrder r1 = java.nio.ByteOrder.LITTLE_ENDIAN
                java.nio.ByteBuffer r0 = r0.order(r1)
                long r1 = r7.h1
                java.nio.ByteBuffer r0 = r0.putLong(r1)
                long r1 = r7.h2
                java.nio.ByteBuffer r0 = r0.putLong(r1)
                byte[] r0 = r0.array()
                int r1 = com.google.common.hash.HashCode.$r8$clinit
                com.google.common.hash.HashCode$BytesHashCode r1 = new com.google.common.hash.HashCode$BytesHashCode
                r1.<init>(r0)
                return r1
        }

        @Override // com.google.common.hash.AbstractStreamingHasher
        public final void process(java.nio.ByteBuffer r5) {
                r4 = this;
                long r0 = r5.getLong()
                long r2 = r5.getLong()
                r4.bmix64(r0, r2)
                int r5 = r4.length
                int r5 = r5 + 16
                r4.length = r5
                return
        }

        @Override // com.google.common.hash.AbstractStreamingHasher
        public final void processRemaining(java.nio.ByteBuffer r12) {
                r11 = this;
                int r0 = r11.length
                int r1 = r12.remaining()
                int r1 = r1 + r0
                r11.length = r1
                int r0 = r12.remaining()
                r1 = 48
                r2 = 40
                r3 = 32
                r4 = 24
                r5 = 16
                r6 = 0
                r8 = 8
                switch(r0) {
                    case 1: goto Lea;
                    case 2: goto Ldc;
                    case 3: goto Lce;
                    case 4: goto Lc0;
                    case 5: goto Lb1;
                    case 6: goto La3;
                    case 7: goto L95;
                    case 8: goto L8d;
                    case 9: goto L81;
                    case 10: goto L72;
                    case 11: goto L63;
                    case 12: goto L54;
                    case 13: goto L44;
                    case 14: goto L35;
                    case 15: goto L26;
                    default: goto L1e;
                }
            L1e:
                java.lang.AssertionError r12 = new java.lang.AssertionError
                java.lang.String r0 = "Should never get here."
                r12.<init>(r0)
                throw r12
            L26:
                r0 = 14
                byte r0 = r12.get(r0)
                int r0 = com.google.common.primitives.UnsignedBytes.toInt(r0)
                long r9 = (long) r0
                long r0 = r9 << r1
                long r0 = r0 ^ r6
                goto L36
            L35:
                r0 = r6
            L36:
                r9 = 13
                byte r9 = r12.get(r9)
                int r9 = com.google.common.primitives.UnsignedBytes.toInt(r9)
                long r9 = (long) r9
                long r9 = r9 << r2
                long r0 = r0 ^ r9
                goto L45
            L44:
                r0 = r6
            L45:
                r2 = 12
                byte r2 = r12.get(r2)
                int r2 = com.google.common.primitives.UnsignedBytes.toInt(r2)
                long r9 = (long) r2
                long r2 = r9 << r3
                long r0 = r0 ^ r2
                goto L55
            L54:
                r0 = r6
            L55:
                r2 = 11
                byte r2 = r12.get(r2)
                int r2 = com.google.common.primitives.UnsignedBytes.toInt(r2)
                long r2 = (long) r2
                long r2 = r2 << r4
                long r0 = r0 ^ r2
                goto L64
            L63:
                r0 = r6
            L64:
                r2 = 10
                byte r2 = r12.get(r2)
                int r2 = com.google.common.primitives.UnsignedBytes.toInt(r2)
                long r2 = (long) r2
                long r2 = r2 << r5
                long r0 = r0 ^ r2
                goto L73
            L72:
                r0 = r6
            L73:
                r2 = 9
                byte r2 = r12.get(r2)
                int r2 = com.google.common.primitives.UnsignedBytes.toInt(r2)
                long r2 = (long) r2
                long r2 = r2 << r8
                long r0 = r0 ^ r2
                goto L82
            L81:
                r0 = r6
            L82:
                byte r2 = r12.get(r8)
                int r2 = com.google.common.primitives.UnsignedBytes.toInt(r2)
                long r2 = (long) r2
                long r0 = r0 ^ r2
                goto L8e
            L8d:
                r0 = r6
            L8e:
                long r2 = r12.getLong()
                long r2 = r2 ^ r6
                r6 = r0
                goto Lf6
            L95:
                r0 = 6
                byte r0 = r12.get(r0)
                int r0 = com.google.common.primitives.UnsignedBytes.toInt(r0)
                long r9 = (long) r0
                long r0 = r9 << r1
                long r0 = r0 ^ r6
                goto La4
            La3:
                r0 = r6
            La4:
                r9 = 5
                byte r9 = r12.get(r9)
                int r9 = com.google.common.primitives.UnsignedBytes.toInt(r9)
                long r9 = (long) r9
                long r9 = r9 << r2
                long r0 = r0 ^ r9
                goto Lb2
            Lb1:
                r0 = r6
            Lb2:
                r2 = 4
                byte r2 = r12.get(r2)
                int r2 = com.google.common.primitives.UnsignedBytes.toInt(r2)
                long r9 = (long) r2
                long r2 = r9 << r3
                long r0 = r0 ^ r2
                goto Lc1
            Lc0:
                r0 = r6
            Lc1:
                r2 = 3
                byte r2 = r12.get(r2)
                int r2 = com.google.common.primitives.UnsignedBytes.toInt(r2)
                long r2 = (long) r2
                long r2 = r2 << r4
                long r0 = r0 ^ r2
                goto Lcf
            Lce:
                r0 = r6
            Lcf:
                r2 = 2
                byte r2 = r12.get(r2)
                int r2 = com.google.common.primitives.UnsignedBytes.toInt(r2)
                long r2 = (long) r2
                long r2 = r2 << r5
                long r0 = r0 ^ r2
                goto Ldd
            Ldc:
                r0 = r6
            Ldd:
                r2 = 1
                byte r2 = r12.get(r2)
                int r2 = com.google.common.primitives.UnsignedBytes.toInt(r2)
                long r2 = (long) r2
                long r2 = r2 << r8
                long r0 = r0 ^ r2
                goto Leb
            Lea:
                r0 = r6
            Leb:
                r2 = 0
                byte r12 = r12.get(r2)
                int r12 = com.google.common.primitives.UnsignedBytes.toInt(r12)
                long r2 = (long) r12
                long r2 = r2 ^ r0
            Lf6:
                long r0 = r11.h1
                long r2 = mixK1(r2)
                long r0 = r0 ^ r2
                r11.h1 = r0
                long r0 = r11.h2
                long r2 = mixK2(r6)
                long r0 = r0 ^ r2
                r11.h2 = r0
                return
        }
    }

    static {
            com.google.common.hash.Murmur3_128HashFunction r0 = new com.google.common.hash.Murmur3_128HashFunction
            r1 = 0
            r0.<init>(r1)
            com.google.common.hash.Murmur3_128HashFunction.MURMUR3_128 = r0
            com.google.common.hash.Murmur3_128HashFunction r0 = new com.google.common.hash.Murmur3_128HashFunction
            int r1 = com.google.common.hash.Hashing.GOOD_FAST_HASH_SEED
            r0.<init>(r1)
            com.google.common.hash.Murmur3_128HashFunction.GOOD_FAST_HASH_128 = r0
            return
    }

    public Murmur3_128HashFunction(int r1) {
            r0 = this;
            r0.<init>()
            r0.seed = r1
            return
    }

    @Override // com.google.common.hash.HashFunction
    public int bits() {
            r1 = this;
            r0 = 128(0x80, float:1.8E-43)
            return r0
    }

    public boolean equals(@javax.annotation.CheckForNull java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof com.google.common.hash.Murmur3_128HashFunction
            r1 = 0
            if (r0 == 0) goto Le
            com.google.common.hash.Murmur3_128HashFunction r3 = (com.google.common.hash.Murmur3_128HashFunction) r3
            int r0 = r2.seed
            int r3 = r3.seed
            if (r0 != r3) goto Le
            r1 = 1
        Le:
            return r1
    }

    public int hashCode() {
            r2 = this;
            java.lang.Class<com.google.common.hash.Murmur3_128HashFunction> r0 = com.google.common.hash.Murmur3_128HashFunction.class
            int r0 = r0.hashCode()
            int r1 = r2.seed
            r0 = r0 ^ r1
            return r0
    }

    @Override // com.google.common.hash.HashFunction
    public com.google.common.hash.Hasher newHasher() {
            r2 = this;
            com.google.common.hash.Murmur3_128HashFunction$Murmur3_128Hasher r0 = new com.google.common.hash.Murmur3_128HashFunction$Murmur3_128Hasher
            int r1 = r2.seed
            r0.<init>(r1)
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            int r0 = r3.seed
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = 32
            r1.<init>(r2)
            java.lang.String r2 = "Hashing.murmur3_128("
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = ")"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
    }
}
