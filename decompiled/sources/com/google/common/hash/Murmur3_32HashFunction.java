package com.google.common.hash;

/* JADX INFO: loaded from: classes3.dex */
@com.google.errorprone.annotations.Immutable
@com.google.common.hash.ElementTypesAreNonnullByDefault
final class Murmur3_32HashFunction extends com.google.common.hash.AbstractHashFunction implements java.io.Serializable {
    private static final int C1 = -862048943;
    private static final int C2 = 461845907;
    private static final int CHUNK_SIZE = 4;
    public static final com.google.common.hash.HashFunction GOOD_FAST_HASH_32 = null;
    public static final com.google.common.hash.HashFunction MURMUR3_32 = null;
    public static final com.google.common.hash.HashFunction MURMUR3_32_FIXED = null;
    private static final long serialVersionUID = 0;
    private final int seed;
    private final boolean supplementaryPlaneFix;

    /* JADX INFO: loaded from: classes.dex */
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public static final class Murmur3_32Hasher extends com.google.common.hash.AbstractHasher {
        private long buffer;
        private int h1;
        private boolean isDone;
        private int length;
        private int shift;

        public Murmur3_32Hasher(int r1) {
                r0 = this;
                r0.<init>()
                r0.h1 = r1
                r1 = 0
                r0.length = r1
                r0.isDone = r1
                return
        }

        private void update(int r5, long r6) {
                r4 = this;
                long r0 = r4.buffer
                r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
                long r6 = r6 & r2
                int r2 = r4.shift
                long r6 = r6 << r2
                long r6 = r6 | r0
                r4.buffer = r6
                int r0 = r5 * 8
                int r0 = r0 + r2
                r4.shift = r0
                int r1 = r4.length
                int r1 = r1 + r5
                r4.length = r1
                r5 = 32
                if (r0 < r5) goto L33
                int r0 = r4.h1
                int r7 = (int) r6
                int r6 = com.google.common.hash.Murmur3_32HashFunction.access$000(r7)
                int r6 = com.google.common.hash.Murmur3_32HashFunction.access$100(r0, r6)
                r4.h1 = r6
                long r6 = r4.buffer
                long r6 = r6 >>> r5
                r4.buffer = r6
                int r6 = r4.shift
                int r6 = r6 - r5
                r4.shift = r6
            L33:
                return
        }

        @Override // com.google.common.hash.Hasher
        public com.google.common.hash.HashCode hash() {
                r3 = this;
                boolean r0 = r3.isDone
                r1 = 1
                r0 = r0 ^ r1
                com.google.common.base.Preconditions.checkState(r0)
                r3.isDone = r1
                int r0 = r3.h1
                long r1 = r3.buffer
                int r2 = (int) r1
                int r1 = com.google.common.hash.Murmur3_32HashFunction.access$000(r2)
                r0 = r0 ^ r1
                r3.h1 = r0
                int r1 = r3.length
                com.google.common.hash.HashCode r0 = com.google.common.hash.Murmur3_32HashFunction.access$600(r0, r1)
                return r0
        }

        @Override // com.google.common.hash.AbstractHasher, com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
        public com.google.common.hash.Hasher putByte(byte r3) {
                r2 = this;
                r3 = r3 & 255(0xff, float:3.57E-43)
                long r0 = (long) r3
                r3 = 1
                r2.update(r3, r0)
                return r2
        }

        @Override // com.google.common.hash.AbstractHasher, com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
        public /* bridge */ /* synthetic */ com.google.common.hash.PrimitiveSink putByte(byte r1) {
                r0 = this;
                com.google.common.hash.Hasher r1 = r0.putByte(r1)
                return r1
        }

        @Override // com.google.common.hash.AbstractHasher, com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
        public com.google.common.hash.Hasher putBytes(java.nio.ByteBuffer r4) {
                r3 = this;
                java.nio.ByteOrder r0 = r4.order()
                java.nio.ByteOrder r1 = java.nio.ByteOrder.LITTLE_ENDIAN
                r4.order(r1)
            L9:
                int r1 = r4.remaining()
                r2 = 4
                if (r1 < r2) goto L18
                int r1 = r4.getInt()
                r3.putInt(r1)
                goto L9
            L18:
                boolean r1 = r4.hasRemaining()
                if (r1 == 0) goto L26
                byte r1 = r4.get()
                r3.putByte(r1)
                goto L18
            L26:
                r4.order(r0)
                return r3
        }

        @Override // com.google.common.hash.AbstractHasher, com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
        public com.google.common.hash.Hasher putBytes(byte[] r5, int r6, int r7) {
                r4 = this;
                int r0 = r6 + r7
                int r1 = r5.length
                com.google.common.base.Preconditions.checkPositionIndexes(r6, r0, r1)
                r0 = 0
            L7:
                int r1 = r0 + 4
                if (r1 > r7) goto L17
                int r0 = r0 + r6
                int r0 = com.google.common.hash.Murmur3_32HashFunction.access$200(r5, r0)
                long r2 = (long) r0
                r0 = 4
                r4.update(r0, r2)
                r0 = r1
                goto L7
            L17:
                if (r0 >= r7) goto L23
                int r1 = r6 + r0
                r1 = r5[r1]
                r4.putByte(r1)
                int r0 = r0 + 1
                goto L17
            L23:
                return r4
        }

        @Override // com.google.common.hash.AbstractHasher, com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
        public /* bridge */ /* synthetic */ com.google.common.hash.PrimitiveSink putBytes(java.nio.ByteBuffer r1) {
                r0 = this;
                com.google.common.hash.Hasher r1 = r0.putBytes(r1)
                return r1
        }

        @Override // com.google.common.hash.AbstractHasher, com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
        public /* bridge */ /* synthetic */ com.google.common.hash.PrimitiveSink putBytes(byte[] r1, int r2, int r3) {
                r0 = this;
                com.google.common.hash.Hasher r1 = r0.putBytes(r1, r2, r3)
                return r1
        }

        @Override // com.google.common.hash.AbstractHasher, com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
        public com.google.common.hash.Hasher putChar(char r3) {
                r2 = this;
                long r0 = (long) r3
                r3 = 2
                r2.update(r3, r0)
                return r2
        }

        @Override // com.google.common.hash.AbstractHasher, com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
        public /* bridge */ /* synthetic */ com.google.common.hash.PrimitiveSink putChar(char r1) {
                r0 = this;
                com.google.common.hash.Hasher r1 = r0.putChar(r1)
                return r1
        }

        @Override // com.google.common.hash.AbstractHasher, com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
        public com.google.common.hash.Hasher putInt(int r3) {
                r2 = this;
                long r0 = (long) r3
                r3 = 4
                r2.update(r3, r0)
                return r2
        }

        @Override // com.google.common.hash.AbstractHasher, com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
        public /* bridge */ /* synthetic */ com.google.common.hash.PrimitiveSink putInt(int r1) {
                r0 = this;
                com.google.common.hash.Hasher r1 = r0.putInt(r1)
                return r1
        }

        @Override // com.google.common.hash.AbstractHasher, com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
        public com.google.common.hash.Hasher putLong(long r4) {
                r3 = this;
                int r0 = (int) r4
                long r0 = (long) r0
                r2 = 4
                r3.update(r2, r0)
                r0 = 32
                long r4 = r4 >>> r0
                r3.update(r2, r4)
                return r3
        }

        @Override // com.google.common.hash.AbstractHasher, com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
        public /* bridge */ /* synthetic */ com.google.common.hash.PrimitiveSink putLong(long r1) {
                r0 = this;
                com.google.common.hash.Hasher r1 = r0.putLong(r1)
                return r1
        }

        @Override // com.google.common.hash.AbstractHasher, com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
        public com.google.common.hash.Hasher putString(java.lang.CharSequence r10, java.nio.charset.Charset r11) {
                r9 = this;
                java.nio.charset.Charset r0 = com.google.common.base.Charsets.UTF_8
                boolean r0 = r0.equals(r11)
                if (r0 == 0) goto L92
                int r0 = r10.length()
                r1 = 0
            Ld:
                int r2 = r1 + 4
                r3 = 4
                r4 = 128(0x80, float:1.8E-43)
                if (r2 > r0) goto L41
                char r5 = r10.charAt(r1)
                int r6 = r1 + 1
                char r6 = r10.charAt(r6)
                int r7 = r1 + 2
                char r7 = r10.charAt(r7)
                int r8 = r1 + 3
                char r8 = r10.charAt(r8)
                if (r5 >= r4) goto L41
                if (r6 >= r4) goto L41
                if (r7 >= r4) goto L41
                if (r8 >= r4) goto L41
                int r1 = r6 << 8
                r1 = r1 | r5
                int r4 = r7 << 16
                r1 = r1 | r4
                int r4 = r8 << 24
                r1 = r1 | r4
                long r4 = (long) r1
                r9.update(r3, r4)
                r1 = r2
                goto Ld
            L41:
                if (r1 >= r0) goto L91
                char r2 = r10.charAt(r1)
                r5 = 1
                if (r2 >= r4) goto L4f
                long r6 = (long) r2
                r9.update(r5, r6)
                goto L8f
            L4f:
                r6 = 2048(0x800, float:2.87E-42)
                if (r2 >= r6) goto L5c
                long r6 = com.google.common.hash.Murmur3_32HashFunction.access$300(r2)
                r2 = 2
                r9.update(r2, r6)
                goto L8f
            L5c:
                r6 = 55296(0xd800, float:7.7486E-41)
                if (r2 < r6) goto L87
                r6 = 57343(0xdfff, float:8.0355E-41)
                if (r2 <= r6) goto L67
                goto L87
            L67:
                int r6 = java.lang.Character.codePointAt(r10, r1)
                if (r6 != r2) goto L7d
                java.lang.CharSequence r10 = r10.subSequence(r1, r0)
                java.lang.String r10 = r10.toString()
                byte[] r10 = r10.getBytes(r11)
                r9.putBytes(r10)
                return r9
            L7d:
                int r1 = r1 + 1
                long r6 = com.google.common.hash.Murmur3_32HashFunction.access$500(r6)
                r9.update(r3, r6)
                goto L8f
            L87:
                long r6 = com.google.common.hash.Murmur3_32HashFunction.access$400(r2)
                r2 = 3
                r9.update(r2, r6)
            L8f:
                int r1 = r1 + r5
                goto L41
            L91:
                return r9
            L92:
                com.google.common.hash.Hasher r10 = super.putString(r10, r11)
                return r10
        }

        @Override // com.google.common.hash.AbstractHasher, com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
        public /* bridge */ /* synthetic */ com.google.common.hash.PrimitiveSink putString(java.lang.CharSequence r1, java.nio.charset.Charset r2) {
                r0 = this;
                com.google.common.hash.Hasher r1 = r0.putString(r1, r2)
                return r1
        }
    }

    static {
            com.google.common.hash.Murmur3_32HashFunction r0 = new com.google.common.hash.Murmur3_32HashFunction
            r1 = 0
            r0.<init>(r1, r1)
            com.google.common.hash.Murmur3_32HashFunction.MURMUR3_32 = r0
            com.google.common.hash.Murmur3_32HashFunction r0 = new com.google.common.hash.Murmur3_32HashFunction
            r2 = 1
            r0.<init>(r1, r2)
            com.google.common.hash.Murmur3_32HashFunction.MURMUR3_32_FIXED = r0
            com.google.common.hash.Murmur3_32HashFunction r0 = new com.google.common.hash.Murmur3_32HashFunction
            int r1 = com.google.common.hash.Hashing.GOOD_FAST_HASH_SEED
            r0.<init>(r1, r2)
            com.google.common.hash.Murmur3_32HashFunction.GOOD_FAST_HASH_32 = r0
            return
    }

    public Murmur3_32HashFunction(int r1, boolean r2) {
            r0 = this;
            r0.<init>()
            r0.seed = r1
            r0.supplementaryPlaneFix = r2
            return
    }

    public static /* synthetic */ int access$000(int r0) {
            int r0 = mixK1(r0)
            return r0
    }

    public static /* synthetic */ int access$100(int r0, int r1) {
            int r0 = mixH1(r0, r1)
            return r0
    }

    public static /* synthetic */ int access$200(byte[] r0, int r1) {
            int r0 = getIntLittleEndian(r0, r1)
            return r0
    }

    public static /* synthetic */ long access$300(char r2) {
            long r0 = charToTwoUtf8Bytes(r2)
            return r0
    }

    public static /* synthetic */ long access$400(char r2) {
            long r0 = charToThreeUtf8Bytes(r2)
            return r0
    }

    public static /* synthetic */ long access$500(int r2) {
            long r0 = codePointToFourUtf8Bytes(r2)
            return r0
    }

    public static /* synthetic */ com.google.common.hash.HashCode access$600(int r0, int r1) {
            com.google.common.hash.HashCode r0 = fmix(r0, r1)
            return r0
    }

    private static long charToThreeUtf8Bytes(char r4) {
            int r0 = r4 >>> 12
            long r0 = (long) r0
            r2 = 224(0xe0, double:1.107E-321)
            long r0 = r0 | r2
            int r2 = r4 >>> 6
            r2 = r2 & 63
            r2 = r2 | 128(0x80, float:1.8E-43)
            int r2 = r2 << 8
            long r2 = (long) r2
            long r0 = r0 | r2
            r4 = r4 & 63
            r4 = r4 | 128(0x80, float:1.8E-43)
            int r4 = r4 << 16
            long r2 = (long) r4
            long r0 = r0 | r2
            return r0
    }

    private static long charToTwoUtf8Bytes(char r4) {
            int r0 = r4 >>> 6
            long r0 = (long) r0
            r2 = 192(0xc0, double:9.5E-322)
            long r0 = r0 | r2
            r4 = r4 & 63
            r4 = r4 | 128(0x80, float:1.8E-43)
            int r4 = r4 << 8
            long r2 = (long) r4
            long r0 = r0 | r2
            return r0
    }

    private static long codePointToFourUtf8Bytes(int r7) {
            int r0 = r7 >>> 18
            long r0 = (long) r0
            r2 = 240(0xf0, double:1.186E-321)
            long r0 = r0 | r2
            int r2 = r7 >>> 12
            r2 = r2 & 63
            long r2 = (long) r2
            r4 = 128(0x80, double:6.3E-322)
            long r2 = r2 | r4
            r6 = 8
            long r2 = r2 << r6
            long r0 = r0 | r2
            int r2 = r7 >>> 6
            r2 = r2 & 63
            long r2 = (long) r2
            long r2 = r2 | r4
            r6 = 16
            long r2 = r2 << r6
            long r0 = r0 | r2
            r7 = r7 & 63
            long r2 = (long) r7
            long r2 = r2 | r4
            r7 = 24
            long r2 = r2 << r7
            long r0 = r0 | r2
            return r0
    }

    private static com.google.common.hash.HashCode fmix(int r0, int r1) {
            r0 = r0 ^ r1
            int r1 = r0 >>> 16
            r0 = r0 ^ r1
            r1 = -2048144789(0xffffffff85ebca6b, float:-2.217365E-35)
            int r0 = r0 * r1
            int r1 = r0 >>> 13
            r0 = r0 ^ r1
            r1 = -1028477387(0xffffffffc2b2ae35, float:-89.34025)
            int r0 = r0 * r1
            int r1 = r0 >>> 16
            r0 = r0 ^ r1
            com.google.common.hash.HashCode r0 = com.google.common.hash.HashCode.fromInt(r0)
            return r0
    }

    private static int getIntLittleEndian(byte[] r3, int r4) {
            int r0 = r4 + 3
            r0 = r3[r0]
            int r1 = r4 + 2
            r1 = r3[r1]
            int r2 = r4 + 1
            r2 = r3[r2]
            r3 = r3[r4]
            int r3 = com.google.common.primitives.Ints.fromBytes(r0, r1, r2, r3)
            return r3
    }

    private static int mixH1(int r0, int r1) {
            r0 = r0 ^ r1
            r1 = 13
            int r0 = java.lang.Integer.rotateLeft(r0, r1)
            int r0 = r0 * 5
            r1 = -430675100(0xffffffffe6546b64, float:-2.5078068E23)
            int r0 = r0 + r1
            return r0
    }

    private static int mixK1(int r1) {
            r0 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r1 = r1 * r0
            r0 = 15
            int r1 = java.lang.Integer.rotateLeft(r1, r0)
            r0 = 461845907(0x1b873593, float:2.2368498E-22)
            int r1 = r1 * r0
            return r1
    }

    @Override // com.google.common.hash.HashFunction
    public int bits() {
            r1 = this;
            r0 = 32
            return r0
    }

    public boolean equals(@javax.annotation.CheckForNull java.lang.Object r4) {
            r3 = this;
            boolean r0 = r4 instanceof com.google.common.hash.Murmur3_32HashFunction
            r1 = 0
            if (r0 == 0) goto L14
            com.google.common.hash.Murmur3_32HashFunction r4 = (com.google.common.hash.Murmur3_32HashFunction) r4
            int r0 = r3.seed
            int r2 = r4.seed
            if (r0 != r2) goto L14
            boolean r0 = r3.supplementaryPlaneFix
            boolean r4 = r4.supplementaryPlaneFix
            if (r0 != r4) goto L14
            r1 = 1
        L14:
            return r1
    }

    @Override // com.google.common.hash.AbstractHashFunction, com.google.common.hash.HashFunction
    public com.google.common.hash.HashCode hashBytes(byte[] r6, int r7, int r8) {
            r5 = this;
            int r0 = r7 + r8
            int r1 = r6.length
            com.google.common.base.Preconditions.checkPositionIndexes(r7, r0, r1)
            int r0 = r5.seed
            r1 = 0
            r2 = 0
        La:
            int r3 = r2 + 4
            if (r3 > r8) goto L1d
            int r2 = r2 + r7
            int r2 = getIntLittleEndian(r6, r2)
            int r2 = mixK1(r2)
            int r0 = mixH1(r0, r2)
            r2 = r3
            goto La
        L1d:
            r3 = r2
            r2 = 0
        L1f:
            if (r3 >= r8) goto L30
            int r4 = r7 + r3
            r4 = r6[r4]
            int r4 = com.google.common.primitives.UnsignedBytes.toInt(r4)
            int r4 = r4 << r2
            r1 = r1 ^ r4
            int r3 = r3 + 1
            int r2 = r2 + 8
            goto L1f
        L30:
            int r6 = mixK1(r1)
            r6 = r6 ^ r0
            com.google.common.hash.HashCode r6 = fmix(r6, r8)
            return r6
    }

    public int hashCode() {
            r2 = this;
            java.lang.Class<com.google.common.hash.Murmur3_32HashFunction> r0 = com.google.common.hash.Murmur3_32HashFunction.class
            int r0 = r0.hashCode()
            int r1 = r2.seed
            r0 = r0 ^ r1
            return r0
    }

    @Override // com.google.common.hash.AbstractHashFunction, com.google.common.hash.HashFunction
    public com.google.common.hash.HashCode hashInt(int r2) {
            r1 = this;
            int r2 = mixK1(r2)
            int r0 = r1.seed
            int r2 = mixH1(r0, r2)
            r0 = 4
            com.google.common.hash.HashCode r2 = fmix(r2, r0)
            return r2
    }

    @Override // com.google.common.hash.AbstractHashFunction, com.google.common.hash.HashFunction
    public com.google.common.hash.HashCode hashLong(long r3) {
            r2 = this;
            int r0 = (int) r3
            r1 = 32
            long r3 = r3 >>> r1
            int r4 = (int) r3
            int r3 = mixK1(r0)
            int r0 = r2.seed
            int r3 = mixH1(r0, r3)
            int r4 = mixK1(r4)
            int r3 = mixH1(r3, r4)
            r4 = 8
            com.google.common.hash.HashCode r3 = fmix(r3, r4)
            return r3
    }

    @Override // com.google.common.hash.AbstractHashFunction, com.google.common.hash.HashFunction
    public com.google.common.hash.HashCode hashString(java.lang.CharSequence r12, java.nio.charset.Charset r13) {
            r11 = this;
            java.nio.charset.Charset r0 = com.google.common.base.Charsets.UTF_8
            boolean r0 = r0.equals(r13)
            if (r0 == 0) goto Lc2
            int r0 = r12.length()
            int r1 = r11.seed
            r2 = 0
            r3 = 0
            r4 = 0
        L11:
            int r5 = r3 + 4
            r6 = 128(0x80, float:1.8E-43)
            if (r5 > r0) goto L4a
            char r7 = r12.charAt(r3)
            int r8 = r3 + 1
            char r8 = r12.charAt(r8)
            int r9 = r3 + 2
            char r9 = r12.charAt(r9)
            int r10 = r3 + 3
            char r10 = r12.charAt(r10)
            if (r7 >= r6) goto L4a
            if (r8 >= r6) goto L4a
            if (r9 >= r6) goto L4a
            if (r10 >= r6) goto L4a
            int r3 = r8 << 8
            r3 = r3 | r7
            int r6 = r9 << 16
            r3 = r3 | r6
            int r6 = r10 << 24
            r3 = r3 | r6
            int r3 = mixK1(r3)
            int r1 = mixH1(r1, r3)
            int r4 = r4 + 4
            r3 = r5
            goto L11
        L4a:
            r7 = 0
        L4c:
            if (r3 >= r0) goto Lb7
            char r5 = r12.charAt(r3)
            if (r5 >= r6) goto L5c
            long r9 = (long) r5
            long r9 = r9 << r2
            long r7 = r7 | r9
            int r2 = r2 + 8
            int r4 = r4 + 1
            goto La4
        L5c:
            r9 = 2048(0x800, float:2.87E-42)
            if (r5 >= r9) goto L6b
            long r9 = charToTwoUtf8Bytes(r5)
            long r9 = r9 << r2
            long r7 = r7 | r9
            int r2 = r2 + 16
            int r4 = r4 + 2
            goto La4
        L6b:
            r9 = 55296(0xd800, float:7.7486E-41)
            if (r5 < r9) goto L9a
            r9 = 57343(0xdfff, float:8.0355E-41)
            if (r5 <= r9) goto L76
            goto L9a
        L76:
            int r9 = java.lang.Character.codePointAt(r12, r3)
            if (r9 != r5) goto L89
            java.lang.String r12 = r12.toString()
            byte[] r12 = r12.getBytes(r13)
            com.google.common.hash.HashCode r12 = r11.hashBytes(r12)
            return r12
        L89:
            int r3 = r3 + 1
            long r9 = codePointToFourUtf8Bytes(r9)
            long r9 = r9 << r2
            long r7 = r7 | r9
            boolean r5 = r11.supplementaryPlaneFix
            if (r5 == 0) goto L97
            int r2 = r2 + 32
        L97:
            int r4 = r4 + 4
            goto La4
        L9a:
            long r9 = charToThreeUtf8Bytes(r5)
            long r9 = r9 << r2
            long r7 = r7 | r9
            int r2 = r2 + 24
            int r4 = r4 + 3
        La4:
            r5 = 32
            if (r2 < r5) goto Lb4
            int r9 = (int) r7
            int r9 = mixK1(r9)
            int r1 = mixH1(r1, r9)
            long r7 = r7 >>> r5
            int r2 = r2 + (-32)
        Lb4:
            int r3 = r3 + 1
            goto L4c
        Lb7:
            int r12 = (int) r7
            int r12 = mixK1(r12)
            r12 = r12 ^ r1
            com.google.common.hash.HashCode r12 = fmix(r12, r4)
            return r12
        Lc2:
            java.lang.String r12 = r12.toString()
            byte[] r12 = r12.getBytes(r13)
            com.google.common.hash.HashCode r12 = r11.hashBytes(r12)
            return r12
    }

    @Override // com.google.common.hash.AbstractHashFunction, com.google.common.hash.HashFunction
    public com.google.common.hash.HashCode hashUnencodedChars(java.lang.CharSequence r6) {
            r5 = this;
            int r0 = r5.seed
            r1 = 1
            r2 = 1
        L4:
            int r3 = r6.length()
            if (r2 >= r3) goto L22
            int r3 = r2 + (-1)
            char r3 = r6.charAt(r3)
            char r4 = r6.charAt(r2)
            int r4 = r4 << 16
            r3 = r3 | r4
            int r3 = mixK1(r3)
            int r0 = mixH1(r0, r3)
            int r2 = r2 + 2
            goto L4
        L22:
            int r2 = r6.length()
            r2 = r2 & r1
            if (r2 != r1) goto L37
            int r2 = r6.length()
            int r2 = r2 - r1
            char r1 = r6.charAt(r2)
            int r1 = mixK1(r1)
            r0 = r0 ^ r1
        L37:
            int r6 = r6.length()
            int r6 = r6 * 2
            com.google.common.hash.HashCode r6 = fmix(r0, r6)
            return r6
    }

    @Override // com.google.common.hash.HashFunction
    public com.google.common.hash.Hasher newHasher() {
            r2 = this;
            com.google.common.hash.Murmur3_32HashFunction$Murmur3_32Hasher r0 = new com.google.common.hash.Murmur3_32HashFunction$Murmur3_32Hasher
            int r1 = r2.seed
            r0.<init>(r1)
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            int r0 = r3.seed
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = 31
            r1.<init>(r2)
            java.lang.String r2 = "Hashing.murmur3_32("
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = ")"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
    }
}
