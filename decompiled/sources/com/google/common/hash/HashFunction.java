package com.google.common.hash;

/* JADX INFO: loaded from: classes2.dex */
@com.google.errorprone.annotations.Immutable
@com.google.common.hash.ElementTypesAreNonnullByDefault
public interface HashFunction {
    int bits();

    com.google.common.hash.HashCode hashBytes(java.nio.ByteBuffer r1);

    com.google.common.hash.HashCode hashBytes(byte[] r1);

    com.google.common.hash.HashCode hashBytes(byte[] r1, int r2, int r3);

    com.google.common.hash.HashCode hashInt(int r1);

    com.google.common.hash.HashCode hashLong(long r1);

    <T> com.google.common.hash.HashCode hashObject(@com.google.common.hash.ParametricNullness T r1, com.google.common.hash.Funnel<? super T> r2);

    com.google.common.hash.HashCode hashString(java.lang.CharSequence r1, java.nio.charset.Charset r2);

    com.google.common.hash.HashCode hashUnencodedChars(java.lang.CharSequence r1);

    com.google.common.hash.Hasher newHasher();

    com.google.common.hash.Hasher newHasher(int r1);
}
