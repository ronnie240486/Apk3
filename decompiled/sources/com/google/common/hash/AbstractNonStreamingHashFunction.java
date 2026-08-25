package com.google.common.hash;

/* JADX INFO: loaded from: classes3.dex */
@com.google.errorprone.annotations.Immutable
@com.google.common.hash.ElementTypesAreNonnullByDefault
abstract class AbstractNonStreamingHashFunction extends com.google.common.hash.AbstractHashFunction {

    /* JADX INFO: loaded from: classes.dex */
    public final class BufferingHasher extends com.google.common.hash.AbstractHasher {
        public final com.google.common.hash.AbstractNonStreamingHashFunction.ExposedByteArrayOutputStream stream;
        public final /* synthetic */ com.google.common.hash.AbstractNonStreamingHashFunction this$0;

        public BufferingHasher(com.google.common.hash.AbstractNonStreamingHashFunction r1, int r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                com.google.common.hash.AbstractNonStreamingHashFunction$ExposedByteArrayOutputStream r1 = new com.google.common.hash.AbstractNonStreamingHashFunction$ExposedByteArrayOutputStream
                r1.<init>(r2)
                r0.stream = r1
                return
        }

        @Override // com.google.common.hash.Hasher
        public com.google.common.hash.HashCode hash() {
                r4 = this;
                com.google.common.hash.AbstractNonStreamingHashFunction r0 = r4.this$0
                com.google.common.hash.AbstractNonStreamingHashFunction$ExposedByteArrayOutputStream r1 = r4.stream
                byte[] r1 = r1.byteArray()
                com.google.common.hash.AbstractNonStreamingHashFunction$ExposedByteArrayOutputStream r2 = r4.stream
                int r2 = r2.length()
                r3 = 0
                com.google.common.hash.HashCode r0 = r0.hashBytes(r1, r3, r2)
                return r0
        }

        @Override // com.google.common.hash.AbstractHasher, com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
        public com.google.common.hash.Hasher putByte(byte r2) {
                r1 = this;
                com.google.common.hash.AbstractNonStreamingHashFunction$ExposedByteArrayOutputStream r0 = r1.stream
                r0.write(r2)
                return r1
        }

        @Override // com.google.common.hash.AbstractHasher, com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
        public /* bridge */ /* synthetic */ com.google.common.hash.PrimitiveSink putByte(byte r1) {
                r0 = this;
                com.google.common.hash.Hasher r1 = r0.putByte(r1)
                return r1
        }

        @Override // com.google.common.hash.AbstractHasher, com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
        public com.google.common.hash.Hasher putBytes(java.nio.ByteBuffer r2) {
                r1 = this;
                com.google.common.hash.AbstractNonStreamingHashFunction$ExposedByteArrayOutputStream r0 = r1.stream
                r0.write(r2)
                return r1
        }

        @Override // com.google.common.hash.AbstractHasher, com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
        public com.google.common.hash.Hasher putBytes(byte[] r2, int r3, int r4) {
                r1 = this;
                com.google.common.hash.AbstractNonStreamingHashFunction$ExposedByteArrayOutputStream r0 = r1.stream
                r0.write(r2, r3, r4)
                return r1
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
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static final class ExposedByteArrayOutputStream extends java.io.ByteArrayOutputStream {
        public ExposedByteArrayOutputStream(int r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        public final byte[] byteArray() {
                r1 = this;
                byte[] r0 = r1.buf
                return r0
        }

        public final int length() {
                r1 = this;
                int r0 = r1.count
                return r0
        }

        public final void write(java.nio.ByteBuffer r6) {
                r5 = this;
                int r0 = r6.remaining()
                int r1 = r5.count
                int r2 = r1 + r0
                byte[] r3 = r5.buf
                int r4 = r3.length
                if (r2 <= r4) goto L14
                int r1 = r1 + r0
                byte[] r1 = java.util.Arrays.copyOf(r3, r1)
                r5.buf = r1
            L14:
                byte[] r1 = r5.buf
                int r2 = r5.count
                r6.get(r1, r2, r0)
                int r6 = r5.count
                int r6 = r6 + r0
                r5.count = r6
                return
        }
    }

    public AbstractNonStreamingHashFunction() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.common.hash.AbstractHashFunction, com.google.common.hash.HashFunction
    public com.google.common.hash.HashCode hashBytes(java.nio.ByteBuffer r2) {
            r1 = this;
            int r0 = r2.remaining()
            com.google.common.hash.Hasher r0 = r1.newHasher(r0)
            com.google.common.hash.Hasher r2 = r0.putBytes(r2)
            com.google.common.hash.HashCode r2 = r2.hash()
            return r2
    }

    @Override // com.google.common.hash.AbstractHashFunction, com.google.common.hash.HashFunction
    public abstract com.google.common.hash.HashCode hashBytes(byte[] r1, int r2, int r3);

    @Override // com.google.common.hash.AbstractHashFunction, com.google.common.hash.HashFunction
    public com.google.common.hash.HashCode hashInt(int r3) {
            r2 = this;
            r0 = 4
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r0)
            java.nio.ByteOrder r1 = java.nio.ByteOrder.LITTLE_ENDIAN
            java.nio.ByteBuffer r0 = r0.order(r1)
            java.nio.ByteBuffer r3 = r0.putInt(r3)
            byte[] r3 = r3.array()
            com.google.common.hash.HashCode r3 = r2.hashBytes(r3)
            return r3
    }

    @Override // com.google.common.hash.AbstractHashFunction, com.google.common.hash.HashFunction
    public com.google.common.hash.HashCode hashLong(long r3) {
            r2 = this;
            r0 = 8
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r0)
            java.nio.ByteOrder r1 = java.nio.ByteOrder.LITTLE_ENDIAN
            java.nio.ByteBuffer r0 = r0.order(r1)
            java.nio.ByteBuffer r3 = r0.putLong(r3)
            byte[] r3 = r3.array()
            com.google.common.hash.HashCode r3 = r2.hashBytes(r3)
            return r3
    }

    @Override // com.google.common.hash.AbstractHashFunction, com.google.common.hash.HashFunction
    public com.google.common.hash.HashCode hashString(java.lang.CharSequence r1, java.nio.charset.Charset r2) {
            r0 = this;
            java.lang.String r1 = r1.toString()
            byte[] r1 = r1.getBytes(r2)
            com.google.common.hash.HashCode r1 = r0.hashBytes(r1)
            return r1
    }

    @Override // com.google.common.hash.AbstractHashFunction, com.google.common.hash.HashFunction
    public com.google.common.hash.HashCode hashUnencodedChars(java.lang.CharSequence r5) {
            r4 = this;
            int r0 = r5.length()
            int r1 = r0 * 2
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.allocate(r1)
            java.nio.ByteOrder r2 = java.nio.ByteOrder.LITTLE_ENDIAN
            java.nio.ByteBuffer r1 = r1.order(r2)
            r2 = 0
        L11:
            if (r2 >= r0) goto L1d
            char r3 = r5.charAt(r2)
            r1.putChar(r3)
            int r2 = r2 + 1
            goto L11
        L1d:
            byte[] r5 = r1.array()
            com.google.common.hash.HashCode r5 = r4.hashBytes(r5)
            return r5
    }

    @Override // com.google.common.hash.HashFunction
    public com.google.common.hash.Hasher newHasher() {
            r1 = this;
            r0 = 32
            com.google.common.hash.Hasher r0 = r1.newHasher(r0)
            return r0
    }

    @Override // com.google.common.hash.AbstractHashFunction, com.google.common.hash.HashFunction
    public com.google.common.hash.Hasher newHasher(int r2) {
            r1 = this;
            if (r2 < 0) goto L4
            r0 = 1
            goto L5
        L4:
            r0 = 0
        L5:
            com.google.common.base.Preconditions.checkArgument(r0)
            com.google.common.hash.AbstractNonStreamingHashFunction$BufferingHasher r0 = new com.google.common.hash.AbstractNonStreamingHashFunction$BufferingHasher
            r0.<init>(r1, r2)
            return r0
    }
}
