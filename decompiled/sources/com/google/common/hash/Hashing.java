package com.google.common.hash;

/* JADX INFO: loaded from: classes3.dex */
@com.google.common.annotations.Beta
@com.google.common.hash.ElementTypesAreNonnullByDefault
public final class Hashing {
    public static final int GOOD_FAST_HASH_SEED = 0;

    /* JADX INFO: renamed from: com.google.common.hash.Hashing$1, reason: invalid class name */
    /* JADX INFO: loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass1 {
    }

    /* JADX INFO: loaded from: classes.dex */
    @com.google.errorprone.annotations.Immutable
    public static abstract enum ChecksumType extends java.lang.Enum<com.google.common.hash.Hashing.ChecksumType> implements com.google.common.hash.ImmutableSupplier<java.util.zip.Checksum> {
        private static final /* synthetic */ com.google.common.hash.Hashing.ChecksumType[] $VALUES = null;
        public static final com.google.common.hash.Hashing.ChecksumType ADLER_32 = null;
        public static final com.google.common.hash.Hashing.ChecksumType CRC_32 = null;
        public final com.google.common.hash.HashFunction hashFunction;



        private static /* synthetic */ com.google.common.hash.Hashing.ChecksumType[] $values() {
                r0 = 2
                com.google.common.hash.Hashing$ChecksumType[] r0 = new com.google.common.hash.Hashing.ChecksumType[r0]
                com.google.common.hash.Hashing$ChecksumType r1 = com.google.common.hash.Hashing.ChecksumType.CRC_32
                r2 = 0
                r0[r2] = r1
                com.google.common.hash.Hashing$ChecksumType r1 = com.google.common.hash.Hashing.ChecksumType.ADLER_32
                r2 = 1
                r0[r2] = r1
                return r0
        }

        static {
                com.google.common.hash.Hashing$ChecksumType$1 r0 = new com.google.common.hash.Hashing$ChecksumType$1
                r0.<init>()
                com.google.common.hash.Hashing.ChecksumType.CRC_32 = r0
                com.google.common.hash.Hashing$ChecksumType$2 r0 = new com.google.common.hash.Hashing$ChecksumType$2
                r0.<init>()
                com.google.common.hash.Hashing.ChecksumType.ADLER_32 = r0
                com.google.common.hash.Hashing$ChecksumType[] r0 = $values()
                com.google.common.hash.Hashing.ChecksumType.$VALUES = r0
                return
        }

        private ChecksumType(java.lang.String r1, int r2, java.lang.String r3) {
                r0 = this;
                r0.<init>(r1, r2)
                com.google.common.hash.ChecksumHashFunction r1 = new com.google.common.hash.ChecksumHashFunction
                r1.<init>(r0, r3)
                r0.hashFunction = r1
                return
        }

        public /* synthetic */ ChecksumType(java.lang.String r1, int r2, java.lang.String r3, com.google.common.hash.Hashing.AnonymousClass1 r4) {
                r0 = this;
                r0.<init>(r1, r2, r3)
                return
        }

        public static com.google.common.hash.Hashing.ChecksumType valueOf(java.lang.String r1) {
                java.lang.Class<com.google.common.hash.Hashing$ChecksumType> r0 = com.google.common.hash.Hashing.ChecksumType.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.google.common.hash.Hashing$ChecksumType r1 = (com.google.common.hash.Hashing.ChecksumType) r1
                return r1
        }

        public static com.google.common.hash.Hashing.ChecksumType[] values() {
                com.google.common.hash.Hashing$ChecksumType[] r0 = com.google.common.hash.Hashing.ChecksumType.$VALUES
                java.lang.Object r0 = r0.clone()
                com.google.common.hash.Hashing$ChecksumType[] r0 = (com.google.common.hash.Hashing.ChecksumType[]) r0
                return r0
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static final class ConcatenatedHashFunction extends com.google.common.hash.AbstractCompositeHashFunction {
        private ConcatenatedHashFunction(com.google.common.hash.HashFunction... r8) {
                r7 = this;
                r7.<init>(r8)
                int r0 = r8.length
                r1 = 0
                r2 = 0
            L6:
                if (r2 >= r0) goto L22
                r3 = r8[r2]
                int r4 = r3.bits()
                int r4 = r4 % 8
                if (r4 != 0) goto L14
                r4 = 1
                goto L15
            L14:
                r4 = 0
            L15:
                int r5 = r3.bits()
                java.lang.String r6 = "the number of bits (%s) in hashFunction (%s) must be divisible by 8"
                com.google.common.base.Preconditions.checkArgument(r4, r6, r5, r3)
                int r2 = r2 + 1
                goto L6
            L22:
                return
        }

        public /* synthetic */ ConcatenatedHashFunction(com.google.common.hash.HashFunction[] r1, com.google.common.hash.Hashing.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // com.google.common.hash.HashFunction
        public int bits() {
                r5 = this;
                com.google.common.hash.HashFunction[] r0 = r5.functions
                int r1 = r0.length
                r2 = 0
                r3 = 0
            L5:
                if (r2 >= r1) goto L11
                r4 = r0[r2]
                int r4 = r4.bits()
                int r3 = r3 + r4
                int r2 = r2 + 1
                goto L5
            L11:
                return r3
        }

        public boolean equals(@javax.annotation.CheckForNull java.lang.Object r2) {
                r1 = this;
                boolean r0 = r2 instanceof com.google.common.hash.Hashing.ConcatenatedHashFunction
                if (r0 == 0) goto Lf
                com.google.common.hash.Hashing$ConcatenatedHashFunction r2 = (com.google.common.hash.Hashing.ConcatenatedHashFunction) r2
                com.google.common.hash.HashFunction[] r0 = r1.functions
                com.google.common.hash.HashFunction[] r2 = r2.functions
                boolean r2 = java.util.Arrays.equals(r0, r2)
                return r2
            Lf:
                r2 = 0
                return r2
        }

        public int hashCode() {
                r1 = this;
                com.google.common.hash.HashFunction[] r0 = r1.functions
                int r0 = java.util.Arrays.hashCode(r0)
                return r0
        }

        @Override // com.google.common.hash.AbstractCompositeHashFunction
        public final com.google.common.hash.HashCode makeHash(com.google.common.hash.Hasher[] r7) {
                r6 = this;
                int r0 = r6.bits()
                int r0 = r0 / 8
                byte[] r0 = new byte[r0]
                int r1 = r7.length
                r2 = 0
                r3 = 0
            Lb:
                if (r2 >= r1) goto L21
                r4 = r7[r2]
                com.google.common.hash.HashCode r4 = r4.hash()
                int r5 = r4.bits()
                int r5 = r5 / 8
                int r4 = r4.writeBytesTo(r0, r3, r5)
                int r3 = r3 + r4
                int r2 = r2 + 1
                goto Lb
            L21:
                int r7 = com.google.common.hash.HashCode.$r8$clinit
                com.google.common.hash.HashCode$BytesHashCode r7 = new com.google.common.hash.HashCode$BytesHashCode
                r7.<init>(r0)
                return r7
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static final class LinearCongruentialGenerator {
        private long state;

        public LinearCongruentialGenerator(long r1) {
                r0 = this;
                r0.<init>()
                r0.state = r1
                return
        }

        public double nextDouble() {
                r4 = this;
                long r0 = r4.state
                r2 = 2862933555777941757(0x27bb2ee687b0b0fd, double:2.694898184339827E-117)
                long r0 = r0 * r2
                r2 = 1
                long r0 = r0 + r2
                r4.state = r0
                r2 = 33
                long r0 = r0 >>> r2
                int r1 = (int) r0
                int r1 = r1 + 1
                double r0 = (double) r1
                r2 = 4746794007248502784(0x41e0000000000000, double:2.147483648E9)
                double r0 = r0 / r2
                return r0
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static class Md5Holder {
        public static final com.google.common.hash.HashFunction MD5 = null;

        static {
                com.google.common.hash.MessageDigestHashFunction r0 = new com.google.common.hash.MessageDigestHashFunction
                java.lang.String r1 = "MD5"
                java.lang.String r2 = "Hashing.md5()"
                r0.<init>(r1, r2)
                com.google.common.hash.Hashing.Md5Holder.MD5 = r0
                return
        }

        private Md5Holder() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static class Sha1Holder {
        public static final com.google.common.hash.HashFunction SHA_1 = null;

        static {
                com.google.common.hash.MessageDigestHashFunction r0 = new com.google.common.hash.MessageDigestHashFunction
                java.lang.String r1 = "SHA-1"
                java.lang.String r2 = "Hashing.sha1()"
                r0.<init>(r1, r2)
                com.google.common.hash.Hashing.Sha1Holder.SHA_1 = r0
                return
        }

        private Sha1Holder() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static class Sha256Holder {
        public static final com.google.common.hash.HashFunction SHA_256 = null;

        static {
                com.google.common.hash.MessageDigestHashFunction r0 = new com.google.common.hash.MessageDigestHashFunction
                java.lang.String r1 = "SHA-256"
                java.lang.String r2 = "Hashing.sha256()"
                r0.<init>(r1, r2)
                com.google.common.hash.Hashing.Sha256Holder.SHA_256 = r0
                return
        }

        private Sha256Holder() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    public static class Sha384Holder {
        public static final com.google.common.hash.HashFunction SHA_384 = null;

        static {
                com.google.common.hash.MessageDigestHashFunction r0 = new com.google.common.hash.MessageDigestHashFunction
                java.lang.String r1 = "SHA-384"
                java.lang.String r2 = "Hashing.sha384()"
                r0.<init>(r1, r2)
                com.google.common.hash.Hashing.Sha384Holder.SHA_384 = r0
                return
        }

        private Sha384Holder() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    public static class Sha512Holder {
        public static final com.google.common.hash.HashFunction SHA_512 = null;

        static {
                com.google.common.hash.MessageDigestHashFunction r0 = new com.google.common.hash.MessageDigestHashFunction
                java.lang.String r1 = "SHA-512"
                java.lang.String r2 = "Hashing.sha512()"
                r0.<init>(r1, r2)
                com.google.common.hash.Hashing.Sha512Holder.SHA_512 = r0
                return
        }

        private Sha512Holder() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    static {
            long r0 = java.lang.System.currentTimeMillis()
            int r1 = (int) r0
            com.google.common.hash.Hashing.GOOD_FAST_HASH_SEED = r1
            return
    }

    private Hashing() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.google.common.hash.HashFunction adler32() {
            com.google.common.hash.Hashing$ChecksumType r0 = com.google.common.hash.Hashing.ChecksumType.ADLER_32
            com.google.common.hash.HashFunction r0 = r0.hashFunction
            return r0
    }

    public static com.google.common.hash.HashCode combineOrdered(java.lang.Iterable<com.google.common.hash.HashCode> r6) {
            java.util.Iterator r0 = r6.iterator()
            boolean r1 = r0.hasNext()
            java.lang.String r2 = "Must be at least 1 hash code to combine."
            com.google.common.base.Preconditions.checkArgument(r1, r2)
            java.lang.Object r0 = r0.next()
            com.google.common.hash.HashCode r0 = (com.google.common.hash.HashCode) r0
            int r0 = r0.bits()
            int r0 = r0 / 8
            byte[] r1 = new byte[r0]
            java.util.Iterator r6 = r6.iterator()
        L1f:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L4b
            java.lang.Object r2 = r6.next()
            com.google.common.hash.HashCode r2 = (com.google.common.hash.HashCode) r2
            byte[] r2 = r2.asBytes()
            int r3 = r2.length
            r4 = 0
            if (r3 != r0) goto L35
            r3 = 1
            goto L36
        L35:
            r3 = 0
        L36:
            java.lang.String r5 = "All hashcodes must have the same bit length."
            com.google.common.base.Preconditions.checkArgument(r3, r5)
        L3b:
            int r3 = r2.length
            if (r4 >= r3) goto L1f
            r3 = r1[r4]
            int r3 = r3 * 37
            r5 = r2[r4]
            r3 = r3 ^ r5
            byte r3 = (byte) r3
            r1[r4] = r3
            int r4 = r4 + 1
            goto L3b
        L4b:
            com.google.common.hash.HashCode$BytesHashCode r6 = new com.google.common.hash.HashCode$BytesHashCode
            r6.<init>(r1)
            return r6
    }

    public static com.google.common.hash.HashCode combineUnordered(java.lang.Iterable<com.google.common.hash.HashCode> r6) {
            java.util.Iterator r0 = r6.iterator()
            boolean r1 = r0.hasNext()
            java.lang.String r2 = "Must be at least 1 hash code to combine."
            com.google.common.base.Preconditions.checkArgument(r1, r2)
            java.lang.Object r0 = r0.next()
            com.google.common.hash.HashCode r0 = (com.google.common.hash.HashCode) r0
            int r0 = r0.bits()
            int r0 = r0 / 8
            byte[] r1 = new byte[r0]
            java.util.Iterator r6 = r6.iterator()
        L1f:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L49
            java.lang.Object r2 = r6.next()
            com.google.common.hash.HashCode r2 = (com.google.common.hash.HashCode) r2
            byte[] r2 = r2.asBytes()
            int r3 = r2.length
            r4 = 0
            if (r3 != r0) goto L35
            r3 = 1
            goto L36
        L35:
            r3 = 0
        L36:
            java.lang.String r5 = "All hashcodes must have the same bit length."
            com.google.common.base.Preconditions.checkArgument(r3, r5)
        L3b:
            int r3 = r2.length
            if (r4 >= r3) goto L1f
            r3 = r1[r4]
            r5 = r2[r4]
            int r3 = r3 + r5
            byte r3 = (byte) r3
            r1[r4] = r3
            int r4 = r4 + 1
            goto L3b
        L49:
            com.google.common.hash.HashCode$BytesHashCode r6 = new com.google.common.hash.HashCode$BytesHashCode
            r6.<init>(r1)
            return r6
    }

    public static com.google.common.hash.HashFunction concatenating(com.google.common.hash.HashFunction r1, com.google.common.hash.HashFunction r2, com.google.common.hash.HashFunction... r3) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r0.add(r1)
            r0.add(r2)
            java.util.List r1 = java.util.Arrays.asList(r3)
            r0.addAll(r1)
            com.google.common.hash.Hashing$ConcatenatedHashFunction r1 = new com.google.common.hash.Hashing$ConcatenatedHashFunction
            r2 = 0
            com.google.common.hash.HashFunction[] r2 = new com.google.common.hash.HashFunction[r2]
            java.lang.Object[] r2 = r0.toArray(r2)
            com.google.common.hash.HashFunction[] r2 = (com.google.common.hash.HashFunction[]) r2
            r3 = 0
            r1.<init>(r2, r3)
            return r1
    }

    public static com.google.common.hash.HashFunction concatenating(java.lang.Iterable<com.google.common.hash.HashFunction> r4) {
            com.google.common.base.Preconditions.checkNotNull(r4)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r4 = r4.iterator()
        Lc:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L1c
            java.lang.Object r1 = r4.next()
            com.google.common.hash.HashFunction r1 = (com.google.common.hash.HashFunction) r1
            r0.add(r1)
            goto Lc
        L1c:
            int r4 = r0.size()
            r1 = 0
            if (r4 <= 0) goto L25
            r4 = 1
            goto L26
        L25:
            r4 = 0
        L26:
            int r2 = r0.size()
            java.lang.String r3 = "number of hash functions (%s) must be > 0"
            com.google.common.base.Preconditions.checkArgument(r4, r3, r2)
            com.google.common.hash.Hashing$ConcatenatedHashFunction r4 = new com.google.common.hash.Hashing$ConcatenatedHashFunction
            com.google.common.hash.HashFunction[] r1 = new com.google.common.hash.HashFunction[r1]
            java.lang.Object[] r0 = r0.toArray(r1)
            com.google.common.hash.HashFunction[] r0 = (com.google.common.hash.HashFunction[]) r0
            r1 = 0
            r4.<init>(r0, r1)
            return r4
    }

    public static int consistentHash(long r4, int r6) {
            r0 = 0
            if (r6 <= 0) goto L5
            r1 = 1
            goto L6
        L5:
            r1 = 0
        L6:
            java.lang.String r2 = "buckets must be positive: %s"
            com.google.common.base.Preconditions.checkArgument(r1, r2, r6)
            com.google.common.hash.Hashing$LinearCongruentialGenerator r1 = new com.google.common.hash.Hashing$LinearCongruentialGenerator
            r1.<init>(r4)
        L10:
            int r4 = r0 + 1
            double r4 = (double) r4
            double r2 = r1.nextDouble()
            double r4 = r4 / r2
            int r4 = (int) r4
            if (r4 < 0) goto L1f
            if (r4 >= r6) goto L1f
            r0 = r4
            goto L10
        L1f:
            return r0
    }

    public static int consistentHash(com.google.common.hash.HashCode r2, int r3) {
            long r0 = r2.padToLong()
            int r2 = consistentHash(r0, r3)
            return r2
    }

    public static com.google.common.hash.HashFunction crc32() {
            com.google.common.hash.Hashing$ChecksumType r0 = com.google.common.hash.Hashing.ChecksumType.CRC_32
            com.google.common.hash.HashFunction r0 = r0.hashFunction
            return r0
    }

    public static com.google.common.hash.HashFunction crc32c() {
            com.google.common.hash.HashFunction r0 = com.google.common.hash.Crc32cHashFunction.CRC_32_C
            return r0
    }

    public static com.google.common.hash.HashFunction farmHashFingerprint64() {
            com.google.common.hash.HashFunction r0 = com.google.common.hash.FarmHashFingerprint64.FARMHASH_FINGERPRINT_64
            return r0
    }

    public static com.google.common.hash.HashFunction goodFastHash(int r4) {
            r0 = 0
            r1 = 1
            if (r4 <= 0) goto L6
            r2 = 1
            goto L7
        L6:
            r2 = 0
        L7:
            java.lang.String r3 = "Number of bits must be positive"
            com.google.common.base.Preconditions.checkArgument(r2, r3)
            int r4 = r4 + 31
            r4 = r4 & (-32)
            r2 = 32
            if (r4 != r2) goto L17
            com.google.common.hash.HashFunction r4 = com.google.common.hash.Murmur3_32HashFunction.GOOD_FAST_HASH_32
            return r4
        L17:
            r2 = 128(0x80, float:1.8E-43)
            if (r4 > r2) goto L1e
            com.google.common.hash.HashFunction r4 = com.google.common.hash.Murmur3_128HashFunction.GOOD_FAST_HASH_128
            return r4
        L1e:
            int r4 = r4 + 127
            int r4 = r4 / r2
            com.google.common.hash.HashFunction[] r2 = new com.google.common.hash.HashFunction[r4]
            com.google.common.hash.HashFunction r3 = com.google.common.hash.Murmur3_128HashFunction.GOOD_FAST_HASH_128
            r2[r0] = r3
            int r0 = com.google.common.hash.Hashing.GOOD_FAST_HASH_SEED
        L29:
            if (r1 >= r4) goto L38
            r3 = 1500450271(0x596f0ddf, float:4.2054857E15)
            int r0 = r0 + r3
            com.google.common.hash.HashFunction r3 = murmur3_128(r0)
            r2[r1] = r3
            int r1 = r1 + 1
            goto L29
        L38:
            com.google.common.hash.Hashing$ConcatenatedHashFunction r4 = new com.google.common.hash.Hashing$ConcatenatedHashFunction
            r0 = 0
            r4.<init>(r2, r0)
            return r4
    }

    public static com.google.common.hash.HashFunction hmacMd5(java.security.Key r3) {
            com.google.common.hash.MacHashFunction r0 = new com.google.common.hash.MacHashFunction
            java.lang.String r1 = "hmacMd5"
            java.lang.String r1 = hmacToString(r1, r3)
            java.lang.String r2 = "HmacMD5"
            r0.<init>(r2, r3, r1)
            return r0
    }

    public static com.google.common.hash.HashFunction hmacMd5(byte[] r2) {
            javax.crypto.spec.SecretKeySpec r0 = new javax.crypto.spec.SecretKeySpec
            java.lang.Object r2 = com.google.common.base.Preconditions.checkNotNull(r2)
            byte[] r2 = (byte[]) r2
            java.lang.String r1 = "HmacMD5"
            r0.<init>(r2, r1)
            com.google.common.hash.HashFunction r2 = hmacMd5(r0)
            return r2
    }

    public static com.google.common.hash.HashFunction hmacSha1(java.security.Key r3) {
            com.google.common.hash.MacHashFunction r0 = new com.google.common.hash.MacHashFunction
            java.lang.String r1 = "hmacSha1"
            java.lang.String r1 = hmacToString(r1, r3)
            java.lang.String r2 = "HmacSHA1"
            r0.<init>(r2, r3, r1)
            return r0
    }

    public static com.google.common.hash.HashFunction hmacSha1(byte[] r2) {
            javax.crypto.spec.SecretKeySpec r0 = new javax.crypto.spec.SecretKeySpec
            java.lang.Object r2 = com.google.common.base.Preconditions.checkNotNull(r2)
            byte[] r2 = (byte[]) r2
            java.lang.String r1 = "HmacSHA1"
            r0.<init>(r2, r1)
            com.google.common.hash.HashFunction r2 = hmacSha1(r0)
            return r2
    }

    public static com.google.common.hash.HashFunction hmacSha256(java.security.Key r3) {
            com.google.common.hash.MacHashFunction r0 = new com.google.common.hash.MacHashFunction
            java.lang.String r1 = "hmacSha256"
            java.lang.String r1 = hmacToString(r1, r3)
            java.lang.String r2 = "HmacSHA256"
            r0.<init>(r2, r3, r1)
            return r0
    }

    public static com.google.common.hash.HashFunction hmacSha256(byte[] r2) {
            javax.crypto.spec.SecretKeySpec r0 = new javax.crypto.spec.SecretKeySpec
            java.lang.Object r2 = com.google.common.base.Preconditions.checkNotNull(r2)
            byte[] r2 = (byte[]) r2
            java.lang.String r1 = "HmacSHA256"
            r0.<init>(r2, r1)
            com.google.common.hash.HashFunction r2 = hmacSha256(r0)
            return r2
    }

    public static com.google.common.hash.HashFunction hmacSha512(java.security.Key r3) {
            com.google.common.hash.MacHashFunction r0 = new com.google.common.hash.MacHashFunction
            java.lang.String r1 = "hmacSha512"
            java.lang.String r1 = hmacToString(r1, r3)
            java.lang.String r2 = "HmacSHA512"
            r0.<init>(r2, r3, r1)
            return r0
    }

    public static com.google.common.hash.HashFunction hmacSha512(byte[] r2) {
            javax.crypto.spec.SecretKeySpec r0 = new javax.crypto.spec.SecretKeySpec
            java.lang.Object r2 = com.google.common.base.Preconditions.checkNotNull(r2)
            byte[] r2 = (byte[]) r2
            java.lang.String r1 = "HmacSHA512"
            r0.<init>(r2, r1)
            com.google.common.hash.HashFunction r2 = hmacSha512(r0)
            return r2
    }

    private static java.lang.String hmacToString(java.lang.String r2, java.security.Key r3) {
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r2
            java.lang.String r2 = r3.getAlgorithm()
            r1 = 1
            r0[r1] = r2
            java.lang.String r2 = r3.getFormat()
            r3 = 2
            r0[r3] = r2
            java.lang.String r2 = "Hashing.%s(Key[algorithm=%s, format=%s])"
            java.lang.String r2 = java.lang.String.format(r2, r0)
            return r2
    }

    @java.lang.Deprecated
    public static com.google.common.hash.HashFunction md5() {
            com.google.common.hash.HashFunction r0 = com.google.common.hash.Hashing.Md5Holder.MD5
            return r0
    }

    public static com.google.common.hash.HashFunction murmur3_128() {
            com.google.common.hash.HashFunction r0 = com.google.common.hash.Murmur3_128HashFunction.MURMUR3_128
            return r0
    }

    public static com.google.common.hash.HashFunction murmur3_128(int r1) {
            com.google.common.hash.Murmur3_128HashFunction r0 = new com.google.common.hash.Murmur3_128HashFunction
            r0.<init>(r1)
            return r0
    }

    @java.lang.Deprecated
    public static com.google.common.hash.HashFunction murmur3_32() {
            com.google.common.hash.HashFunction r0 = com.google.common.hash.Murmur3_32HashFunction.MURMUR3_32
            return r0
    }

    @java.lang.Deprecated
    public static com.google.common.hash.HashFunction murmur3_32(int r2) {
            com.google.common.hash.Murmur3_32HashFunction r0 = new com.google.common.hash.Murmur3_32HashFunction
            r1 = 0
            r0.<init>(r2, r1)
            return r0
    }

    public static com.google.common.hash.HashFunction murmur3_32_fixed() {
            com.google.common.hash.HashFunction r0 = com.google.common.hash.Murmur3_32HashFunction.MURMUR3_32_FIXED
            return r0
    }

    public static com.google.common.hash.HashFunction murmur3_32_fixed(int r2) {
            com.google.common.hash.Murmur3_32HashFunction r0 = new com.google.common.hash.Murmur3_32HashFunction
            r1 = 1
            r0.<init>(r2, r1)
            return r0
    }

    @java.lang.Deprecated
    public static com.google.common.hash.HashFunction sha1() {
            com.google.common.hash.HashFunction r0 = com.google.common.hash.Hashing.Sha1Holder.SHA_1
            return r0
    }

    public static com.google.common.hash.HashFunction sha256() {
            com.google.common.hash.HashFunction r0 = com.google.common.hash.Hashing.Sha256Holder.SHA_256
            return r0
    }

    public static com.google.common.hash.HashFunction sha384() {
            com.google.common.hash.HashFunction r0 = com.google.common.hash.Hashing.Sha384Holder.SHA_384
            return r0
    }

    public static com.google.common.hash.HashFunction sha512() {
            com.google.common.hash.HashFunction r0 = com.google.common.hash.Hashing.Sha512Holder.SHA_512
            return r0
    }

    public static com.google.common.hash.HashFunction sipHash24() {
            com.google.common.hash.HashFunction r0 = com.google.common.hash.SipHashFunction.SIP_HASH_24
            return r0
    }

    public static com.google.common.hash.HashFunction sipHash24(long r1, long r3) {
            com.google.common.hash.SipHashFunction r0 = new com.google.common.hash.SipHashFunction
            r0.<init>(r1, r3)
            return r0
    }
}
