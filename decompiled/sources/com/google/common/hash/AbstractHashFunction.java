package com.google.common.hash;

/* JADX INFO: loaded from: classes2.dex */
@com.google.errorprone.annotations.Immutable
@com.google.common.hash.ElementTypesAreNonnullByDefault
abstract class AbstractHashFunction implements com.google.common.hash.HashFunction {
    public AbstractHashFunction() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.common.hash.HashFunction
    public com.google.common.hash.HashCode hashBytes(java.nio.ByteBuffer r2) {
            r1 = this;
            int r0 = r2.remaining()
            com.google.common.hash.Hasher r0 = r1.newHasher(r0)
            com.google.common.hash.Hasher r2 = r0.putBytes(r2)
            com.google.common.hash.HashCode r2 = r2.hash()
            return r2
    }

    @Override // com.google.common.hash.HashFunction
    public com.google.common.hash.HashCode hashBytes(byte[] r3) {
            r2 = this;
            int r0 = r3.length
            r1 = 0
            com.google.common.hash.HashCode r3 = r2.hashBytes(r3, r1, r0)
            return r3
    }

    @Override // com.google.common.hash.HashFunction
    public com.google.common.hash.HashCode hashBytes(byte[] r3, int r4, int r5) {
            r2 = this;
            int r0 = r4 + r5
            int r1 = r3.length
            com.google.common.base.Preconditions.checkPositionIndexes(r4, r0, r1)
            com.google.common.hash.Hasher r0 = r2.newHasher(r5)
            com.google.common.hash.Hasher r3 = r0.putBytes(r3, r4, r5)
            com.google.common.hash.HashCode r3 = r3.hash()
            return r3
    }

    @Override // com.google.common.hash.HashFunction
    public com.google.common.hash.HashCode hashInt(int r2) {
            r1 = this;
            r0 = 4
            com.google.common.hash.Hasher r0 = r1.newHasher(r0)
            com.google.common.hash.Hasher r2 = r0.putInt(r2)
            com.google.common.hash.HashCode r2 = r2.hash()
            return r2
    }

    @Override // com.google.common.hash.HashFunction
    public com.google.common.hash.HashCode hashLong(long r2) {
            r1 = this;
            r0 = 8
            com.google.common.hash.Hasher r0 = r1.newHasher(r0)
            com.google.common.hash.Hasher r2 = r0.putLong(r2)
            com.google.common.hash.HashCode r2 = r2.hash()
            return r2
    }

    @Override // com.google.common.hash.HashFunction
    public <T> com.google.common.hash.HashCode hashObject(@com.google.common.hash.ParametricNullness T r2, com.google.common.hash.Funnel<? super T> r3) {
            r1 = this;
            com.google.common.hash.Hasher r0 = r1.newHasher()
            com.google.common.hash.Hasher r2 = r0.putObject(r2, r3)
            com.google.common.hash.HashCode r2 = r2.hash()
            return r2
    }

    @Override // com.google.common.hash.HashFunction
    public com.google.common.hash.HashCode hashString(java.lang.CharSequence r2, java.nio.charset.Charset r3) {
            r1 = this;
            com.google.common.hash.Hasher r0 = r1.newHasher()
            com.google.common.hash.Hasher r2 = r0.putString(r2, r3)
            com.google.common.hash.HashCode r2 = r2.hash()
            return r2
    }

    @Override // com.google.common.hash.HashFunction
    public com.google.common.hash.HashCode hashUnencodedChars(java.lang.CharSequence r2) {
            r1 = this;
            int r0 = r2.length()
            int r0 = r0 * 2
            com.google.common.hash.Hasher r0 = r1.newHasher(r0)
            com.google.common.hash.Hasher r2 = r0.putUnencodedChars(r2)
            com.google.common.hash.HashCode r2 = r2.hash()
            return r2
    }

    @Override // com.google.common.hash.HashFunction
    public com.google.common.hash.Hasher newHasher(int r3) {
            r2 = this;
            if (r3 < 0) goto L4
            r0 = 1
            goto L5
        L4:
            r0 = 0
        L5:
            java.lang.String r1 = "expectedInputSize must be >= 0 but was %s"
            com.google.common.base.Preconditions.checkArgument(r0, r1, r3)
            com.google.common.hash.Hasher r3 = r2.newHasher()
            return r3
    }
}
