package com.google.common.hash;

/* JADX INFO: loaded from: classes3.dex */
@com.google.errorprone.annotations.CanIgnoreReturnValue
@com.google.common.hash.ElementTypesAreNonnullByDefault
abstract class AbstractByteHasher extends com.google.common.hash.AbstractHasher {
    private final java.nio.ByteBuffer scratch;

    public AbstractByteHasher() {
            r2 = this;
            r2.<init>()
            r0 = 8
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r0)
            java.nio.ByteOrder r1 = java.nio.ByteOrder.LITTLE_ENDIAN
            java.nio.ByteBuffer r0 = r0.order(r1)
            r2.scratch = r0
            return
    }

    private com.google.common.hash.Hasher update(int r3) {
            r2 = this;
            java.nio.ByteBuffer r0 = r2.scratch     // Catch: java.lang.Throwable -> L10
            byte[] r0 = r0.array()     // Catch: java.lang.Throwable -> L10
            r1 = 0
            r2.update(r0, r1, r3)     // Catch: java.lang.Throwable -> L10
            java.nio.ByteBuffer r3 = r2.scratch
            r3.clear()
            return r2
        L10:
            r3 = move-exception
            java.nio.ByteBuffer r0 = r2.scratch
            r0.clear()
            throw r3
    }

    @Override // com.google.common.hash.AbstractHasher, com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    public com.google.common.hash.Hasher putByte(byte r1) {
            r0 = this;
            r0.update(r1)
            return r0
    }

    @Override // com.google.common.hash.AbstractHasher, com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    public /* bridge */ /* synthetic */ com.google.common.hash.PrimitiveSink putByte(byte r1) {
            r0 = this;
            com.google.common.hash.Hasher r1 = r0.putByte(r1)
            return r1
    }

    @Override // com.google.common.hash.AbstractHasher, com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    public com.google.common.hash.Hasher putBytes(java.nio.ByteBuffer r1) {
            r0 = this;
            r0.update(r1)
            return r0
    }

    @Override // com.google.common.hash.AbstractHasher, com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    public com.google.common.hash.Hasher putBytes(byte[] r1) {
            r0 = this;
            com.google.common.base.Preconditions.checkNotNull(r1)
            r0.update(r1)
            return r0
    }

    @Override // com.google.common.hash.AbstractHasher, com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    public com.google.common.hash.Hasher putBytes(byte[] r3, int r4, int r5) {
            r2 = this;
            int r0 = r4 + r5
            int r1 = r3.length
            com.google.common.base.Preconditions.checkPositionIndexes(r4, r0, r1)
            r2.update(r3, r4, r5)
            return r2
    }

    @Override // com.google.common.hash.AbstractHasher, com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    public /* bridge */ /* synthetic */ com.google.common.hash.PrimitiveSink putBytes(java.nio.ByteBuffer r1) {
            r0 = this;
            com.google.common.hash.Hasher r1 = r0.putBytes(r1)
            return r1
    }

    @Override // com.google.common.hash.AbstractHasher, com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    public /* bridge */ /* synthetic */ com.google.common.hash.PrimitiveSink putBytes(byte[] r1) {
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
    public com.google.common.hash.Hasher putChar(char r2) {
            r1 = this;
            java.nio.ByteBuffer r0 = r1.scratch
            r0.putChar(r2)
            r2 = 2
            com.google.common.hash.Hasher r2 = r1.update(r2)
            return r2
    }

    @Override // com.google.common.hash.AbstractHasher, com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    public /* bridge */ /* synthetic */ com.google.common.hash.PrimitiveSink putChar(char r1) {
            r0 = this;
            com.google.common.hash.Hasher r1 = r0.putChar(r1)
            return r1
    }

    @Override // com.google.common.hash.AbstractHasher, com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    public com.google.common.hash.Hasher putInt(int r2) {
            r1 = this;
            java.nio.ByteBuffer r0 = r1.scratch
            r0.putInt(r2)
            r2 = 4
            com.google.common.hash.Hasher r2 = r1.update(r2)
            return r2
    }

    @Override // com.google.common.hash.AbstractHasher, com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    public /* bridge */ /* synthetic */ com.google.common.hash.PrimitiveSink putInt(int r1) {
            r0 = this;
            com.google.common.hash.Hasher r1 = r0.putInt(r1)
            return r1
    }

    @Override // com.google.common.hash.AbstractHasher, com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    public com.google.common.hash.Hasher putLong(long r2) {
            r1 = this;
            java.nio.ByteBuffer r0 = r1.scratch
            r0.putLong(r2)
            r2 = 8
            com.google.common.hash.Hasher r2 = r1.update(r2)
            return r2
    }

    @Override // com.google.common.hash.AbstractHasher, com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    public /* bridge */ /* synthetic */ com.google.common.hash.PrimitiveSink putLong(long r1) {
            r0 = this;
            com.google.common.hash.Hasher r1 = r0.putLong(r1)
            return r1
    }

    @Override // com.google.common.hash.AbstractHasher, com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    public com.google.common.hash.Hasher putShort(short r2) {
            r1 = this;
            java.nio.ByteBuffer r0 = r1.scratch
            r0.putShort(r2)
            r2 = 2
            com.google.common.hash.Hasher r2 = r1.update(r2)
            return r2
    }

    @Override // com.google.common.hash.AbstractHasher, com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    public /* bridge */ /* synthetic */ com.google.common.hash.PrimitiveSink putShort(short r1) {
            r0 = this;
            com.google.common.hash.Hasher r1 = r0.putShort(r1)
            return r1
    }

    public abstract void update(byte r1);

    public void update(java.nio.ByteBuffer r4) {
            r3 = this;
            boolean r0 = r4.hasArray()
            if (r0 == 0) goto L22
            byte[] r0 = r4.array()
            int r1 = r4.arrayOffset()
            int r2 = r4.position()
            int r2 = r2 + r1
            int r1 = r4.remaining()
            r3.update(r0, r2, r1)
            int r0 = r4.limit()
            r4.position(r0)
            goto L32
        L22:
            int r0 = r4.remaining()
        L26:
            if (r0 <= 0) goto L32
            byte r1 = r4.get()
            r3.update(r1)
            int r0 = r0 + (-1)
            goto L26
        L32:
            return
    }

    public void update(byte[] r3) {
            r2 = this;
            int r0 = r3.length
            r1 = 0
            r2.update(r3, r1, r0)
            return
    }

    public void update(byte[] r3, int r4, int r5) {
            r2 = this;
            r0 = r4
        L1:
            int r1 = r4 + r5
            if (r0 >= r1) goto Ld
            r1 = r3[r0]
            r2.update(r1)
            int r0 = r0 + 1
            goto L1
        Ld:
            return
    }
}
