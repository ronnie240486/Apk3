package com.google.common.hash;

/* JADX INFO: loaded from: classes.dex */
@com.google.errorprone.annotations.CanIgnoreReturnValue
@com.google.common.annotations.Beta
@com.google.common.hash.ElementTypesAreNonnullByDefault
public interface Hasher extends com.google.common.hash.PrimitiveSink {

    /* JADX INFO: renamed from: com.google.common.hash.Hasher$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static /* bridge */ /* synthetic */ com.google.common.hash.PrimitiveSink $default$putBoolean(com.google.common.hash.Hasher r0, boolean r1) {
                com.google.common.hash.Hasher r0 = r0.putBoolean(r1)
                return r0
        }

        public static /* bridge */ /* synthetic */ com.google.common.hash.PrimitiveSink $default$putByte(com.google.common.hash.Hasher r0, byte r1) {
                com.google.common.hash.Hasher r0 = r0.putByte(r1)
                return r0
        }

        public static /* bridge */ /* synthetic */ com.google.common.hash.PrimitiveSink $default$putBytes(com.google.common.hash.Hasher r0, java.nio.ByteBuffer r1) {
                com.google.common.hash.Hasher r0 = r0.putBytes(r1)
                return r0
        }

        public static /* bridge */ /* synthetic */ com.google.common.hash.PrimitiveSink $default$putBytes(com.google.common.hash.Hasher r0, byte[] r1) {
                com.google.common.hash.Hasher r0 = r0.putBytes(r1)
                return r0
        }

        public static /* bridge */ /* synthetic */ com.google.common.hash.PrimitiveSink $default$putBytes(com.google.common.hash.Hasher r0, byte[] r1, int r2, int r3) {
                com.google.common.hash.Hasher r0 = r0.putBytes(r1, r2, r3)
                return r0
        }

        public static /* bridge */ /* synthetic */ com.google.common.hash.PrimitiveSink $default$putChar(com.google.common.hash.Hasher r0, char r1) {
                com.google.common.hash.Hasher r0 = r0.putChar(r1)
                return r0
        }

        public static /* bridge */ /* synthetic */ com.google.common.hash.PrimitiveSink $default$putDouble(com.google.common.hash.Hasher r0, double r1) {
                com.google.common.hash.Hasher r0 = r0.putDouble(r1)
                return r0
        }

        public static /* bridge */ /* synthetic */ com.google.common.hash.PrimitiveSink $default$putFloat(com.google.common.hash.Hasher r0, float r1) {
                com.google.common.hash.Hasher r0 = r0.putFloat(r1)
                return r0
        }

        public static /* bridge */ /* synthetic */ com.google.common.hash.PrimitiveSink $default$putInt(com.google.common.hash.Hasher r0, int r1) {
                com.google.common.hash.Hasher r0 = r0.putInt(r1)
                return r0
        }

        public static /* bridge */ /* synthetic */ com.google.common.hash.PrimitiveSink $default$putLong(com.google.common.hash.Hasher r0, long r1) {
                com.google.common.hash.Hasher r0 = r0.putLong(r1)
                return r0
        }

        public static /* bridge */ /* synthetic */ com.google.common.hash.PrimitiveSink $default$putShort(com.google.common.hash.Hasher r0, short r1) {
                com.google.common.hash.Hasher r0 = r0.putShort(r1)
                return r0
        }

        public static /* bridge */ /* synthetic */ com.google.common.hash.PrimitiveSink $default$putString(com.google.common.hash.Hasher r0, java.lang.CharSequence r1, java.nio.charset.Charset r2) {
                com.google.common.hash.Hasher r0 = r0.putString(r1, r2)
                return r0
        }

        public static /* bridge */ /* synthetic */ com.google.common.hash.PrimitiveSink $default$putUnencodedChars(com.google.common.hash.Hasher r0, java.lang.CharSequence r1) {
                com.google.common.hash.Hasher r0 = r0.putUnencodedChars(r1)
                return r0
        }
    }

    com.google.common.hash.HashCode hash();

    @java.lang.Deprecated
    int hashCode();

    @Override // com.google.common.hash.PrimitiveSink
    com.google.common.hash.Hasher putBoolean(boolean r1);

    @Override // com.google.common.hash.PrimitiveSink
    /* bridge */ /* synthetic */ com.google.common.hash.PrimitiveSink putBoolean(boolean r1);

    @Override // com.google.common.hash.PrimitiveSink
    com.google.common.hash.Hasher putByte(byte r1);

    @Override // com.google.common.hash.PrimitiveSink
    /* bridge */ /* synthetic */ com.google.common.hash.PrimitiveSink putByte(byte r1);

    @Override // com.google.common.hash.PrimitiveSink
    com.google.common.hash.Hasher putBytes(java.nio.ByteBuffer r1);

    @Override // com.google.common.hash.PrimitiveSink
    com.google.common.hash.Hasher putBytes(byte[] r1);

    @Override // com.google.common.hash.PrimitiveSink
    com.google.common.hash.Hasher putBytes(byte[] r1, int r2, int r3);

    @Override // com.google.common.hash.PrimitiveSink
    /* bridge */ /* synthetic */ com.google.common.hash.PrimitiveSink putBytes(java.nio.ByteBuffer r1);

    @Override // com.google.common.hash.PrimitiveSink
    /* bridge */ /* synthetic */ com.google.common.hash.PrimitiveSink putBytes(byte[] r1);

    @Override // com.google.common.hash.PrimitiveSink
    /* bridge */ /* synthetic */ com.google.common.hash.PrimitiveSink putBytes(byte[] r1, int r2, int r3);

    @Override // com.google.common.hash.PrimitiveSink
    com.google.common.hash.Hasher putChar(char r1);

    @Override // com.google.common.hash.PrimitiveSink
    /* bridge */ /* synthetic */ com.google.common.hash.PrimitiveSink putChar(char r1);

    @Override // com.google.common.hash.PrimitiveSink
    com.google.common.hash.Hasher putDouble(double r1);

    @Override // com.google.common.hash.PrimitiveSink
    /* bridge */ /* synthetic */ com.google.common.hash.PrimitiveSink putDouble(double r1);

    @Override // com.google.common.hash.PrimitiveSink
    com.google.common.hash.Hasher putFloat(float r1);

    @Override // com.google.common.hash.PrimitiveSink
    /* bridge */ /* synthetic */ com.google.common.hash.PrimitiveSink putFloat(float r1);

    @Override // com.google.common.hash.PrimitiveSink
    com.google.common.hash.Hasher putInt(int r1);

    @Override // com.google.common.hash.PrimitiveSink
    /* bridge */ /* synthetic */ com.google.common.hash.PrimitiveSink putInt(int r1);

    @Override // com.google.common.hash.PrimitiveSink
    com.google.common.hash.Hasher putLong(long r1);

    @Override // com.google.common.hash.PrimitiveSink
    /* bridge */ /* synthetic */ com.google.common.hash.PrimitiveSink putLong(long r1);

    <T> com.google.common.hash.Hasher putObject(@com.google.common.hash.ParametricNullness T r1, com.google.common.hash.Funnel<? super T> r2);

    @Override // com.google.common.hash.PrimitiveSink
    com.google.common.hash.Hasher putShort(short r1);

    @Override // com.google.common.hash.PrimitiveSink
    /* bridge */ /* synthetic */ com.google.common.hash.PrimitiveSink putShort(short r1);

    @Override // com.google.common.hash.PrimitiveSink
    com.google.common.hash.Hasher putString(java.lang.CharSequence r1, java.nio.charset.Charset r2);

    @Override // com.google.common.hash.PrimitiveSink
    /* bridge */ /* synthetic */ com.google.common.hash.PrimitiveSink putString(java.lang.CharSequence r1, java.nio.charset.Charset r2);

    @Override // com.google.common.hash.PrimitiveSink
    com.google.common.hash.Hasher putUnencodedChars(java.lang.CharSequence r1);

    @Override // com.google.common.hash.PrimitiveSink
    /* bridge */ /* synthetic */ com.google.common.hash.PrimitiveSink putUnencodedChars(java.lang.CharSequence r1);
}
