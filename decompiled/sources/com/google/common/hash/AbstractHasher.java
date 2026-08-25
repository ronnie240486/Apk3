package com.google.common.hash;

/* JADX INFO: loaded from: classes2.dex */
@com.google.errorprone.annotations.CanIgnoreReturnValue
@com.google.common.hash.ElementTypesAreNonnullByDefault
abstract class AbstractHasher implements com.google.common.hash.Hasher {
    public AbstractHasher() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    public final com.google.common.hash.Hasher putBoolean(boolean r1) {
            r0 = this;
            com.google.common.hash.Hasher r1 = r0.putByte(r1)
            return r1
    }

    @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    public /* bridge */ /* synthetic */ com.google.common.hash.PrimitiveSink putBoolean(boolean r1) {
            r0 = this;
            com.google.common.hash.Hasher r1 = r0.putBoolean(r1)
            return r1
    }

    @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    public /* bridge */ /* synthetic */ com.google.common.hash.PrimitiveSink putByte(byte r1) {
            r0 = this;
            com.google.common.hash.PrimitiveSink r1 = com.google.common.hash.Hasher.CC.$default$putByte(r0, r1)
            return r1
    }

    @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    public com.google.common.hash.Hasher putBytes(java.nio.ByteBuffer r4) {
            r3 = this;
            boolean r0 = r4.hasArray()
            if (r0 == 0) goto L22
            byte[] r0 = r4.array()
            int r1 = r4.arrayOffset()
            int r2 = r4.position()
            int r2 = r2 + r1
            int r1 = r4.remaining()
            r3.putBytes(r0, r2, r1)
            int r0 = r4.limit()
            r4.position(r0)
            goto L32
        L22:
            int r0 = r4.remaining()
        L26:
            if (r0 <= 0) goto L32
            byte r1 = r4.get()
            r3.putByte(r1)
            int r0 = r0 + (-1)
            goto L26
        L32:
            return r3
    }

    @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    public com.google.common.hash.Hasher putBytes(byte[] r3) {
            r2 = this;
            int r0 = r3.length
            r1 = 0
            com.google.common.hash.Hasher r3 = r2.putBytes(r3, r1, r0)
            return r3
    }

    @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    public com.google.common.hash.Hasher putBytes(byte[] r3, int r4, int r5) {
            r2 = this;
            int r0 = r4 + r5
            int r1 = r3.length
            com.google.common.base.Preconditions.checkPositionIndexes(r4, r0, r1)
            r0 = 0
        L7:
            if (r0 >= r5) goto L13
            int r1 = r4 + r0
            r1 = r3[r1]
            r2.putByte(r1)
            int r0 = r0 + 1
            goto L7
        L13:
            return r2
    }

    @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    public /* bridge */ /* synthetic */ com.google.common.hash.PrimitiveSink putBytes(java.nio.ByteBuffer r1) {
            r0 = this;
            com.google.common.hash.Hasher r1 = r0.putBytes(r1)
            return r1
    }

    @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    public /* bridge */ /* synthetic */ com.google.common.hash.PrimitiveSink putBytes(byte[] r1) {
            r0 = this;
            com.google.common.hash.Hasher r1 = r0.putBytes(r1)
            return r1
    }

    @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    public /* bridge */ /* synthetic */ com.google.common.hash.PrimitiveSink putBytes(byte[] r1, int r2, int r3) {
            r0 = this;
            com.google.common.hash.Hasher r1 = r0.putBytes(r1, r2, r3)
            return r1
    }

    @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    public com.google.common.hash.Hasher putChar(char r2) {
            r1 = this;
            byte r0 = (byte) r2
            r1.putByte(r0)
            int r2 = r2 >>> 8
            byte r2 = (byte) r2
            r1.putByte(r2)
            return r1
    }

    @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    public /* bridge */ /* synthetic */ com.google.common.hash.PrimitiveSink putChar(char r1) {
            r0 = this;
            com.google.common.hash.Hasher r1 = r0.putChar(r1)
            return r1
    }

    @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    public final com.google.common.hash.Hasher putDouble(double r1) {
            r0 = this;
            long r1 = java.lang.Double.doubleToRawLongBits(r1)
            com.google.common.hash.Hasher r1 = r0.putLong(r1)
            return r1
    }

    @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    public /* bridge */ /* synthetic */ com.google.common.hash.PrimitiveSink putDouble(double r1) {
            r0 = this;
            com.google.common.hash.Hasher r1 = r0.putDouble(r1)
            return r1
    }

    @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    public final com.google.common.hash.Hasher putFloat(float r1) {
            r0 = this;
            int r1 = java.lang.Float.floatToRawIntBits(r1)
            com.google.common.hash.Hasher r1 = r0.putInt(r1)
            return r1
    }

    @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    public /* bridge */ /* synthetic */ com.google.common.hash.PrimitiveSink putFloat(float r1) {
            r0 = this;
            com.google.common.hash.Hasher r1 = r0.putFloat(r1)
            return r1
    }

    @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    public com.google.common.hash.Hasher putInt(int r2) {
            r1 = this;
            byte r0 = (byte) r2
            r1.putByte(r0)
            int r0 = r2 >>> 8
            byte r0 = (byte) r0
            r1.putByte(r0)
            int r0 = r2 >>> 16
            byte r0 = (byte) r0
            r1.putByte(r0)
            int r2 = r2 >>> 24
            byte r2 = (byte) r2
            r1.putByte(r2)
            return r1
    }

    @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    public /* bridge */ /* synthetic */ com.google.common.hash.PrimitiveSink putInt(int r1) {
            r0 = this;
            com.google.common.hash.Hasher r1 = r0.putInt(r1)
            return r1
    }

    @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    public com.google.common.hash.Hasher putLong(long r4) {
            r3 = this;
            r0 = 0
        L1:
            r1 = 64
            if (r0 >= r1) goto Lf
            long r1 = r4 >>> r0
            int r2 = (int) r1
            byte r1 = (byte) r2
            r3.putByte(r1)
            int r0 = r0 + 8
            goto L1
        Lf:
            return r3
    }

    @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    public /* bridge */ /* synthetic */ com.google.common.hash.PrimitiveSink putLong(long r1) {
            r0 = this;
            com.google.common.hash.Hasher r1 = r0.putLong(r1)
            return r1
    }

    @Override // com.google.common.hash.Hasher
    public <T> com.google.common.hash.Hasher putObject(@com.google.common.hash.ParametricNullness T r1, com.google.common.hash.Funnel<? super T> r2) {
            r0 = this;
            r2.funnel(r1, r0)
            return r0
    }

    @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    public com.google.common.hash.Hasher putShort(short r2) {
            r1 = this;
            byte r0 = (byte) r2
            r1.putByte(r0)
            int r2 = r2 >>> 8
            byte r2 = (byte) r2
            r1.putByte(r2)
            return r1
    }

    @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    public /* bridge */ /* synthetic */ com.google.common.hash.PrimitiveSink putShort(short r1) {
            r0 = this;
            com.google.common.hash.Hasher r1 = r0.putShort(r1)
            return r1
    }

    @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    public com.google.common.hash.Hasher putString(java.lang.CharSequence r1, java.nio.charset.Charset r2) {
            r0 = this;
            java.lang.String r1 = r1.toString()
            byte[] r1 = r1.getBytes(r2)
            com.google.common.hash.Hasher r1 = r0.putBytes(r1)
            return r1
    }

    @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    public /* bridge */ /* synthetic */ com.google.common.hash.PrimitiveSink putString(java.lang.CharSequence r1, java.nio.charset.Charset r2) {
            r0 = this;
            com.google.common.hash.Hasher r1 = r0.putString(r1, r2)
            return r1
    }

    @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    public com.google.common.hash.Hasher putUnencodedChars(java.lang.CharSequence r4) {
            r3 = this;
            int r0 = r4.length()
            r1 = 0
        L5:
            if (r1 >= r0) goto L11
            char r2 = r4.charAt(r1)
            r3.putChar(r2)
            int r1 = r1 + 1
            goto L5
        L11:
            return r3
    }

    @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    public /* bridge */ /* synthetic */ com.google.common.hash.PrimitiveSink putUnencodedChars(java.lang.CharSequence r1) {
            r0 = this;
            com.google.common.hash.Hasher r1 = r0.putUnencodedChars(r1)
            return r1
    }
}
