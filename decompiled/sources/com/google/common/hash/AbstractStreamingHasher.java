package com.google.common.hash;

/* JADX INFO: loaded from: classes.dex */
@com.google.errorprone.annotations.CanIgnoreReturnValue
@com.google.common.hash.ElementTypesAreNonnullByDefault
abstract class AbstractStreamingHasher extends com.google.common.hash.AbstractHasher {
    private final java.nio.ByteBuffer buffer;
    private final int bufferSize;
    private final int chunkSize;

    public AbstractStreamingHasher(int r3) {
            r2 = this;
            r2.<init>()
            int r0 = r3 % r3
            if (r0 != 0) goto L9
            r0 = 1
            goto La
        L9:
            r0 = 0
        La:
            com.google.common.base.Preconditions.checkArgument(r0)
            int r0 = r3 + 7
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r0)
            java.nio.ByteOrder r1 = java.nio.ByteOrder.LITTLE_ENDIAN
            java.nio.ByteBuffer r0 = r0.order(r1)
            r2.buffer = r0
            r2.bufferSize = r3
            r2.chunkSize = r3
            return
    }

    private void munch() {
            r2 = this;
            java.nio.ByteBuffer r0 = r2.buffer
            r0.flip()
        L5:
            java.nio.ByteBuffer r0 = r2.buffer
            int r0 = r0.remaining()
            int r1 = r2.chunkSize
            if (r0 < r1) goto L15
            java.nio.ByteBuffer r0 = r2.buffer
            r2.process(r0)
            goto L5
        L15:
            java.nio.ByteBuffer r0 = r2.buffer
            r0.compact()
            return
    }

    private void munchIfFull() {
            r2 = this;
            java.nio.ByteBuffer r0 = r2.buffer
            int r0 = r0.remaining()
            r1 = 8
            if (r0 >= r1) goto Ld
            r2.munch()
        Ld:
            return
    }

    private com.google.common.hash.Hasher putBytesInternal(java.nio.ByteBuffer r5) {
            r4 = this;
            int r0 = r5.remaining()
            java.nio.ByteBuffer r1 = r4.buffer
            int r1 = r1.remaining()
            if (r0 > r1) goto L15
            java.nio.ByteBuffer r0 = r4.buffer
            r0.put(r5)
            r4.munchIfFull()
            return r4
        L15:
            int r0 = r4.bufferSize
            java.nio.ByteBuffer r1 = r4.buffer
            int r1 = r1.position()
            int r0 = r0 - r1
            r1 = 0
        L1f:
            if (r1 >= r0) goto L2d
            java.nio.ByteBuffer r2 = r4.buffer
            byte r3 = r5.get()
            r2.put(r3)
            int r1 = r1 + 1
            goto L1f
        L2d:
            r4.munch()
        L30:
            int r0 = r5.remaining()
            int r1 = r4.chunkSize
            if (r0 < r1) goto L3c
            r4.process(r5)
            goto L30
        L3c:
            java.nio.ByteBuffer r0 = r4.buffer
            r0.put(r5)
            return r4
    }

    @Override // com.google.common.hash.Hasher
    public final com.google.common.hash.HashCode hash() {
            r2 = this;
            r2.munch()
            java.nio.ByteBuffer r0 = r2.buffer
            r0.flip()
            java.nio.ByteBuffer r0 = r2.buffer
            int r0 = r0.remaining()
            if (r0 <= 0) goto L1e
            java.nio.ByteBuffer r0 = r2.buffer
            r2.processRemaining(r0)
            java.nio.ByteBuffer r0 = r2.buffer
            int r1 = r0.limit()
            r0.position(r1)
        L1e:
            com.google.common.hash.HashCode r0 = r2.makeHash()
            return r0
    }

    public abstract com.google.common.hash.HashCode makeHash();

    public abstract void process(java.nio.ByteBuffer r1);

    public void processRemaining(java.nio.ByteBuffer r3) {
            r2 = this;
            int r0 = r3.limit()
            r3.position(r0)
            int r0 = r2.chunkSize
            int r0 = r0 + 7
            r3.limit(r0)
        Le:
            int r0 = r3.position()
            int r1 = r2.chunkSize
            if (r0 >= r1) goto L1c
            r0 = 0
            r3.putLong(r0)
            goto Le
        L1c:
            r3.limit(r1)
            r3.flip()
            r2.process(r3)
            return
    }

    @Override // com.google.common.hash.AbstractHasher, com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    public final com.google.common.hash.Hasher putByte(byte r2) {
            r1 = this;
            java.nio.ByteBuffer r0 = r1.buffer
            r0.put(r2)
            r1.munchIfFull()
            return r1
    }

    @Override // com.google.common.hash.AbstractHasher, com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    public /* bridge */ /* synthetic */ com.google.common.hash.PrimitiveSink putByte(byte r1) {
            r0 = this;
            com.google.common.hash.Hasher r1 = r0.putByte(r1)
            return r1
    }

    @Override // com.google.common.hash.AbstractHasher, com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    public final com.google.common.hash.Hasher putBytes(java.nio.ByteBuffer r3) {
            r2 = this;
            java.nio.ByteOrder r0 = r3.order()
            java.nio.ByteOrder r1 = java.nio.ByteOrder.LITTLE_ENDIAN     // Catch: java.lang.Throwable -> L11
            r3.order(r1)     // Catch: java.lang.Throwable -> L11
            com.google.common.hash.Hasher r1 = r2.putBytesInternal(r3)     // Catch: java.lang.Throwable -> L11
            r3.order(r0)
            return r1
        L11:
            r1 = move-exception
            r3.order(r0)
            throw r1
    }

    @Override // com.google.common.hash.AbstractHasher, com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    public final com.google.common.hash.Hasher putBytes(byte[] r1, int r2, int r3) {
            r0 = this;
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.wrap(r1, r2, r3)
            java.nio.ByteOrder r2 = java.nio.ByteOrder.LITTLE_ENDIAN
            java.nio.ByteBuffer r1 = r1.order(r2)
            com.google.common.hash.Hasher r1 = r0.putBytesInternal(r1)
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

    @Override // com.google.common.hash.AbstractHasher, com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    public final com.google.common.hash.Hasher putChar(char r2) {
            r1 = this;
            java.nio.ByteBuffer r0 = r1.buffer
            r0.putChar(r2)
            r1.munchIfFull()
            return r1
    }

    @Override // com.google.common.hash.AbstractHasher, com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    public /* bridge */ /* synthetic */ com.google.common.hash.PrimitiveSink putChar(char r1) {
            r0 = this;
            com.google.common.hash.Hasher r1 = r0.putChar(r1)
            return r1
    }

    @Override // com.google.common.hash.AbstractHasher, com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    public final com.google.common.hash.Hasher putInt(int r2) {
            r1 = this;
            java.nio.ByteBuffer r0 = r1.buffer
            r0.putInt(r2)
            r1.munchIfFull()
            return r1
    }

    @Override // com.google.common.hash.AbstractHasher, com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    public /* bridge */ /* synthetic */ com.google.common.hash.PrimitiveSink putInt(int r1) {
            r0 = this;
            com.google.common.hash.Hasher r1 = r0.putInt(r1)
            return r1
    }

    @Override // com.google.common.hash.AbstractHasher, com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    public final com.google.common.hash.Hasher putLong(long r2) {
            r1 = this;
            java.nio.ByteBuffer r0 = r1.buffer
            r0.putLong(r2)
            r1.munchIfFull()
            return r1
    }

    @Override // com.google.common.hash.AbstractHasher, com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    public /* bridge */ /* synthetic */ com.google.common.hash.PrimitiveSink putLong(long r1) {
            r0 = this;
            com.google.common.hash.Hasher r1 = r0.putLong(r1)
            return r1
    }

    @Override // com.google.common.hash.AbstractHasher, com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    public final com.google.common.hash.Hasher putShort(short r2) {
            r1 = this;
            java.nio.ByteBuffer r0 = r1.buffer
            r0.putShort(r2)
            r1.munchIfFull()
            return r1
    }

    @Override // com.google.common.hash.AbstractHasher, com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    public /* bridge */ /* synthetic */ com.google.common.hash.PrimitiveSink putShort(short r1) {
            r0 = this;
            com.google.common.hash.Hasher r1 = r0.putShort(r1)
            return r1
    }
}
