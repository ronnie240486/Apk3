package androidx.emoji2.text.flatbuffer;

/* JADX INFO: loaded from: classes3.dex */
public class Utf8Old extends androidx.emoji2.text.flatbuffer.Utf8 {
    private static final java.lang.ThreadLocal<androidx.emoji2.text.flatbuffer.Utf8Old.Cache> CACHE = null;

    /* JADX INFO: loaded from: classes2.dex */
    public static class Cache {
        public final java.nio.charset.CharsetDecoder decoder;
        public final java.nio.charset.CharsetEncoder encoder;
        public java.lang.CharSequence lastInput;
        public java.nio.ByteBuffer lastOutput;

        public Cache() {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.lastInput = r0
                r1.lastOutput = r0
                java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_8
                java.nio.charset.CharsetEncoder r0 = r0.newEncoder()
                r1.encoder = r0
                java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_8
                java.nio.charset.CharsetDecoder r0 = r0.newDecoder()
                r1.decoder = r0
                return
        }
    }

    /* JADX INFO: renamed from: $r8$lambda$3aH_IojK_oDyJD-2_vEnld_hMZQ, reason: not valid java name */
    public static /* synthetic */ androidx.emoji2.text.flatbuffer.Utf8Old.Cache m40$r8$lambda$3aH_IojK_oDyJD2_vEnld_hMZQ() {
            androidx.emoji2.text.flatbuffer.Utf8Old$Cache r0 = lambda$static$0()
            return r0
    }

    static {
            androidx.emoji2.text.flatbuffer.Utf8Old$$ExternalSyntheticLambda0 r0 = androidx.emoji2.text.flatbuffer.Utf8Old$$ExternalSyntheticLambda0.INSTANCE
            java.lang.ThreadLocal r0 = java.lang.ThreadLocal.withInitial(r0)
            androidx.emoji2.text.flatbuffer.Utf8Old.CACHE = r0
            return
    }

    public Utf8Old() {
            r0 = this;
            r0.<init>()
            return
    }

    private static /* synthetic */ androidx.emoji2.text.flatbuffer.Utf8Old.Cache lambda$static$0() {
            androidx.emoji2.text.flatbuffer.Utf8Old$Cache r0 = new androidx.emoji2.text.flatbuffer.Utf8Old$Cache
            r0.<init>()
            return r0
    }

    @Override // androidx.emoji2.text.flatbuffer.Utf8
    public java.lang.String decodeUtf8(java.nio.ByteBuffer r2, int r3, int r4) {
            r1 = this;
            java.lang.ThreadLocal<androidx.emoji2.text.flatbuffer.Utf8Old$Cache> r0 = androidx.emoji2.text.flatbuffer.Utf8Old.CACHE
            java.lang.Object r0 = r0.get()
            androidx.emoji2.text.flatbuffer.Utf8Old$Cache r0 = (androidx.emoji2.text.flatbuffer.Utf8Old.Cache) r0
            java.nio.charset.CharsetDecoder r0 = r0.decoder
            r0.reset()
            java.nio.ByteBuffer r2 = r2.duplicate()
            r2.position(r3)
            int r3 = r3 + r4
            r2.limit(r3)
            java.nio.CharBuffer r2 = r0.decode(r2)     // Catch: java.nio.charset.CharacterCodingException -> L21
            java.lang.String r2 = r2.toString()     // Catch: java.nio.charset.CharacterCodingException -> L21
            return r2
        L21:
            r2 = move-exception
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "Bad encoding"
            r3.<init>(r4, r2)
            throw r3
    }

    @Override // androidx.emoji2.text.flatbuffer.Utf8
    public void encodeUtf8(java.lang.CharSequence r3, java.nio.ByteBuffer r4) {
            r2 = this;
            java.lang.ThreadLocal<androidx.emoji2.text.flatbuffer.Utf8Old$Cache> r0 = androidx.emoji2.text.flatbuffer.Utf8Old.CACHE
            java.lang.Object r0 = r0.get()
            androidx.emoji2.text.flatbuffer.Utf8Old$Cache r0 = (androidx.emoji2.text.flatbuffer.Utf8Old.Cache) r0
            java.lang.CharSequence r1 = r0.lastInput
            if (r1 == r3) goto Lf
            r2.encodedLength(r3)
        Lf:
            java.nio.ByteBuffer r3 = r0.lastOutput
            r4.put(r3)
            return
    }

    @Override // androidx.emoji2.text.flatbuffer.Utf8
    public int encodedLength(java.lang.CharSequence r5) {
            r4 = this;
            java.lang.ThreadLocal<androidx.emoji2.text.flatbuffer.Utf8Old$Cache> r0 = androidx.emoji2.text.flatbuffer.Utf8Old.CACHE
            java.lang.Object r0 = r0.get()
            androidx.emoji2.text.flatbuffer.Utf8Old$Cache r0 = (androidx.emoji2.text.flatbuffer.Utf8Old.Cache) r0
            int r1 = r5.length()
            float r1 = (float) r1
            java.nio.charset.CharsetEncoder r2 = r0.encoder
            float r2 = r2.maxBytesPerChar()
            float r2 = r2 * r1
            int r1 = (int) r2
            java.nio.ByteBuffer r2 = r0.lastOutput
            if (r2 == 0) goto L20
            int r2 = r2.capacity()
            if (r2 >= r1) goto L2c
        L20:
            r2 = 128(0x80, float:1.8E-43)
            int r1 = java.lang.Math.max(r2, r1)
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.allocate(r1)
            r0.lastOutput = r1
        L2c:
            java.nio.ByteBuffer r1 = r0.lastOutput
            r1.clear()
            r0.lastInput = r5
            boolean r1 = r5 instanceof java.nio.CharBuffer
            if (r1 == 0) goto L3a
            java.nio.CharBuffer r5 = (java.nio.CharBuffer) r5
            goto L3e
        L3a:
            java.nio.CharBuffer r5 = java.nio.CharBuffer.wrap(r5)
        L3e:
            java.nio.charset.CharsetEncoder r1 = r0.encoder
            java.nio.ByteBuffer r2 = r0.lastOutput
            r3 = 1
            java.nio.charset.CoderResult r5 = r1.encode(r5, r2, r3)
            boolean r1 = r5.isError()
            if (r1 == 0) goto L5a
            r5.throwException()     // Catch: java.nio.charset.CharacterCodingException -> L51
            goto L5a
        L51:
            r5 = move-exception
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "bad character encoding"
            r0.<init>(r1, r5)
            throw r0
        L5a:
            java.nio.ByteBuffer r5 = r0.lastOutput
            r5.flip()
            java.nio.ByteBuffer r5 = r0.lastOutput
            int r5 = r5.remaining()
            return r5
    }
}
