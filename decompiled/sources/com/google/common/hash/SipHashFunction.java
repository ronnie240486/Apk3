package com.google.common.hash;

/* JADX INFO: loaded from: classes2.dex */
@com.google.errorprone.annotations.Immutable
@com.google.common.hash.ElementTypesAreNonnullByDefault
final class SipHashFunction extends com.google.common.hash.AbstractHashFunction implements java.io.Serializable {
    public static final com.google.common.hash.HashFunction SIP_HASH_24 = null;
    private static final long serialVersionUID = 0;
    private final int c;
    private final int d;
    private final long k0;
    private final long k1;

    public static final class SipHasher extends com.google.common.hash.AbstractStreamingHasher {
        private static final int CHUNK_SIZE = 8;
        private long b;
        private final int c;
        private final int d;
        private long finalM;
        private long v0;
        private long v1;
        private long v2;
        private long v3;

        public SipHasher(int r3, int r4, long r5, long r7) {
                r2 = this;
                r0 = 8
                r2.<init>(r0)
                r0 = 0
                r2.b = r0
                r2.finalM = r0
                r2.c = r3
                r2.d = r4
                r3 = 8317987319222330741(0x736f6d6570736575, double:1.0986868386607877E248)
                long r3 = r3 ^ r5
                r2.v0 = r3
                r3 = 7237128888997146477(0x646f72616e646f6d, double:6.222199573468475E175)
                long r3 = r3 ^ r7
                r2.v1 = r3
                r3 = 7816392313619706465(0x6c7967656e657261, double:3.4208747916531402E214)
                long r3 = r3 ^ r5
                r2.v2 = r3
                r3 = 8387220255154660723(0x7465646279746573, double:4.901176695720602E252)
                long r3 = r3 ^ r7
                r2.v3 = r3
                return
        }

        private void processM(long r3) {
                r2 = this;
                long r0 = r2.v3
                long r0 = r0 ^ r3
                r2.v3 = r0
                int r0 = r2.c
                r2.sipRound(r0)
                long r0 = r2.v0
                long r3 = r3 ^ r0
                r2.v0 = r3
                return
        }

        private void sipRound(int r9) {
                r8 = this;
                r0 = 0
            L1:
                if (r0 >= r9) goto L64
                long r1 = r8.v0
                long r3 = r8.v1
                long r1 = r1 + r3
                r8.v0 = r1
                long r1 = r8.v2
                long r5 = r8.v3
                long r1 = r1 + r5
                r8.v2 = r1
                r1 = 13
                long r1 = java.lang.Long.rotateLeft(r3, r1)
                r8.v1 = r1
                long r1 = r8.v3
                r3 = 16
                long r1 = java.lang.Long.rotateLeft(r1, r3)
                long r3 = r8.v1
                long r5 = r8.v0
                long r3 = r3 ^ r5
                r8.v1 = r3
                long r3 = r8.v2
                long r1 = r1 ^ r3
                r8.v3 = r1
                r1 = 32
                long r2 = java.lang.Long.rotateLeft(r5, r1)
                long r4 = r8.v2
                long r6 = r8.v1
                long r4 = r4 + r6
                r8.v2 = r4
                long r4 = r8.v3
                long r2 = r2 + r4
                r8.v0 = r2
                r2 = 17
                long r2 = java.lang.Long.rotateLeft(r6, r2)
                r8.v1 = r2
                long r2 = r8.v3
                r4 = 21
                long r2 = java.lang.Long.rotateLeft(r2, r4)
                long r4 = r8.v1
                long r6 = r8.v2
                long r4 = r4 ^ r6
                r8.v1 = r4
                long r4 = r8.v0
                long r2 = r2 ^ r4
                r8.v3 = r2
                long r1 = java.lang.Long.rotateLeft(r6, r1)
                r8.v2 = r1
                int r0 = r0 + 1
                goto L1
            L64:
                return
        }

        @Override // com.google.common.hash.AbstractStreamingHasher
        public final com.google.common.hash.HashCode makeHash() {
                r5 = this;
                long r0 = r5.finalM
                long r2 = r5.b
                r4 = 56
                long r2 = r2 << r4
                long r0 = r0 ^ r2
                r5.finalM = r0
                r5.processM(r0)
                long r0 = r5.v2
                r2 = 255(0xff, double:1.26E-321)
                long r0 = r0 ^ r2
                r5.v2 = r0
                int r0 = r5.d
                r5.sipRound(r0)
                long r0 = r5.v0
                long r2 = r5.v1
                long r0 = r0 ^ r2
                long r2 = r5.v2
                long r0 = r0 ^ r2
                long r2 = r5.v3
                long r0 = r0 ^ r2
                com.google.common.hash.HashCode r0 = com.google.common.hash.HashCode.fromLong(r0)
                return r0
        }

        @Override // com.google.common.hash.AbstractStreamingHasher
        public final void process(java.nio.ByteBuffer r5) {
                r4 = this;
                long r0 = r4.b
                r2 = 8
                long r0 = r0 + r2
                r4.b = r0
                long r0 = r5.getLong()
                r4.processM(r0)
                return
        }

        @Override // com.google.common.hash.AbstractStreamingHasher
        public final void processRemaining(java.nio.ByteBuffer r8) {
                r7 = this;
                long r0 = r7.b
                int r2 = r8.remaining()
                long r2 = (long) r2
                long r0 = r0 + r2
                r7.b = r0
                r0 = 0
            Lb:
                boolean r1 = r8.hasRemaining()
                if (r1 == 0) goto L22
                long r1 = r7.finalM
                byte r3 = r8.get()
                long r3 = (long) r3
                r5 = 255(0xff, double:1.26E-321)
                long r3 = r3 & r5
                long r3 = r3 << r0
                long r1 = r1 ^ r3
                r7.finalM = r1
                int r0 = r0 + 8
                goto Lb
            L22:
                return
        }
    }

    static {
            com.google.common.hash.SipHashFunction r0 = new com.google.common.hash.SipHashFunction
            r1 = 506097522914230528(0x706050403020100, double:7.949928895127363E-275)
            r3 = 1084818905618843912(0xf0e0d0c0b0a0908, double:3.6919162048650923E-236)
            r0.<init>(r1, r3)
            com.google.common.hash.SipHashFunction.SIP_HASH_24 = r0
            return
    }

    public SipHashFunction(long r5, long r7) {
            r4 = this;
            r4.<init>()
            r0 = 1
            java.lang.String r1 = "The number of SipRound iterations (c=%s) during Compression must be positive."
            r2 = 2
            com.google.common.base.Preconditions.checkArgument(r0, r1, r2)
            java.lang.String r1 = "The number of SipRound iterations (d=%s) during Finalization must be positive."
            r3 = 4
            com.google.common.base.Preconditions.checkArgument(r0, r1, r3)
            r4.c = r2
            r4.d = r3
            r4.k0 = r5
            r4.k1 = r7
            return
    }

    @Override // com.google.common.hash.HashFunction
    public int bits() {
            r1 = this;
            r0 = 64
            return r0
    }

    public boolean equals(@javax.annotation.CheckForNull java.lang.Object r7) {
            r6 = this;
            boolean r0 = r7 instanceof com.google.common.hash.SipHashFunction
            r1 = 0
            if (r0 == 0) goto L24
            com.google.common.hash.SipHashFunction r7 = (com.google.common.hash.SipHashFunction) r7
            int r0 = r6.c
            int r2 = r7.c
            if (r0 != r2) goto L24
            int r0 = r6.d
            int r2 = r7.d
            if (r0 != r2) goto L24
            long r2 = r6.k0
            long r4 = r7.k0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 != 0) goto L24
            long r2 = r6.k1
            long r4 = r7.k1
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 != 0) goto L24
            r1 = 1
        L24:
            return r1
    }

    public int hashCode() {
            r4 = this;
            java.lang.Class<com.google.common.hash.SipHashFunction> r0 = com.google.common.hash.SipHashFunction.class
            int r0 = r0.hashCode()
            int r1 = r4.c
            r0 = r0 ^ r1
            int r1 = r4.d
            r0 = r0 ^ r1
            long r0 = (long) r0
            long r2 = r4.k0
            long r0 = r0 ^ r2
            long r2 = r4.k1
            long r0 = r0 ^ r2
            int r1 = (int) r0
            return r1
    }

    @Override // com.google.common.hash.HashFunction
    public com.google.common.hash.Hasher newHasher() {
            r8 = this;
            com.google.common.hash.SipHashFunction$SipHasher r7 = new com.google.common.hash.SipHashFunction$SipHasher
            int r1 = r8.c
            int r2 = r8.d
            long r3 = r8.k0
            long r5 = r8.k1
            r0 = r7
            r0.<init>(r1, r2, r3, r5)
            return r7
    }

    public java.lang.String toString() {
            r8 = this;
            int r0 = r8.c
            int r1 = r8.d
            long r2 = r8.k0
            long r4 = r8.k1
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r7 = 81
            r6.<init>(r7)
            java.lang.String r7 = "Hashing.sipHash"
            r6.append(r7)
            r6.append(r0)
            r6.append(r1)
            java.lang.String r0 = "("
            r6.append(r0)
            r6.append(r2)
            java.lang.String r0 = ", "
            r6.append(r0)
            r6.append(r4)
            java.lang.String r0 = ")"
            r6.append(r0)
            java.lang.String r0 = r6.toString()
            return r0
    }
}
