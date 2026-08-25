package org.bson.codecs;

/* JADX INFO: loaded from: classes3.dex */
public class ValueCodecProvider implements org.bson.codecs.configuration.CodecProvider {
    private final java.util.Map<java.lang.Class<?>, org.bson.codecs.Codec<?>> codecs;

    public ValueCodecProvider() {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.codecs = r0
            r1.addCodecs()
            return
    }

    private <T> void addCodec(org.bson.codecs.Codec<T> r3) {
            r2 = this;
            java.util.Map<java.lang.Class<?>, org.bson.codecs.Codec<?>> r0 = r2.codecs
            java.lang.Class r1 = r3.getEncoderClass()
            r0.put(r1, r3)
            return
    }

    private void addCodecs() {
            r1 = this;
            org.bson.codecs.BinaryCodec r0 = new org.bson.codecs.BinaryCodec
            r0.<init>()
            r1.addCodec(r0)
            org.bson.codecs.BooleanCodec r0 = new org.bson.codecs.BooleanCodec
            r0.<init>()
            r1.addCodec(r0)
            org.bson.codecs.DateCodec r0 = new org.bson.codecs.DateCodec
            r0.<init>()
            r1.addCodec(r0)
            org.bson.codecs.DoubleCodec r0 = new org.bson.codecs.DoubleCodec
            r0.<init>()
            r1.addCodec(r0)
            org.bson.codecs.IntegerCodec r0 = new org.bson.codecs.IntegerCodec
            r0.<init>()
            r1.addCodec(r0)
            org.bson.codecs.LongCodec r0 = new org.bson.codecs.LongCodec
            r0.<init>()
            r1.addCodec(r0)
            org.bson.codecs.MinKeyCodec r0 = new org.bson.codecs.MinKeyCodec
            r0.<init>()
            r1.addCodec(r0)
            org.bson.codecs.MaxKeyCodec r0 = new org.bson.codecs.MaxKeyCodec
            r0.<init>()
            r1.addCodec(r0)
            org.bson.codecs.CodeCodec r0 = new org.bson.codecs.CodeCodec
            r0.<init>()
            r1.addCodec(r0)
            org.bson.codecs.Decimal128Codec r0 = new org.bson.codecs.Decimal128Codec
            r0.<init>()
            r1.addCodec(r0)
            org.bson.codecs.BigDecimalCodec r0 = new org.bson.codecs.BigDecimalCodec
            r0.<init>()
            r1.addCodec(r0)
            org.bson.codecs.ObjectIdCodec r0 = new org.bson.codecs.ObjectIdCodec
            r0.<init>()
            r1.addCodec(r0)
            org.bson.codecs.CharacterCodec r0 = new org.bson.codecs.CharacterCodec
            r0.<init>()
            r1.addCodec(r0)
            org.bson.codecs.StringCodec r0 = new org.bson.codecs.StringCodec
            r0.<init>()
            r1.addCodec(r0)
            org.bson.codecs.SymbolCodec r0 = new org.bson.codecs.SymbolCodec
            r0.<init>()
            r1.addCodec(r0)
            org.bson.codecs.OverridableUuidRepresentationUuidCodec r0 = new org.bson.codecs.OverridableUuidRepresentationUuidCodec
            r0.<init>()
            r1.addCodec(r0)
            org.bson.codecs.ByteCodec r0 = new org.bson.codecs.ByteCodec
            r0.<init>()
            r1.addCodec(r0)
            org.bson.codecs.PatternCodec r0 = new org.bson.codecs.PatternCodec
            r0.<init>()
            r1.addCodec(r0)
            org.bson.codecs.ShortCodec r0 = new org.bson.codecs.ShortCodec
            r0.<init>()
            r1.addCodec(r0)
            org.bson.codecs.ByteArrayCodec r0 = new org.bson.codecs.ByteArrayCodec
            r0.<init>()
            r1.addCodec(r0)
            org.bson.codecs.FloatCodec r0 = new org.bson.codecs.FloatCodec
            r0.<init>()
            r1.addCodec(r0)
            org.bson.codecs.AtomicBooleanCodec r0 = new org.bson.codecs.AtomicBooleanCodec
            r0.<init>()
            r1.addCodec(r0)
            org.bson.codecs.AtomicIntegerCodec r0 = new org.bson.codecs.AtomicIntegerCodec
            r0.<init>()
            r1.addCodec(r0)
            org.bson.codecs.AtomicLongCodec r0 = new org.bson.codecs.AtomicLongCodec
            r0.<init>()
            r1.addCodec(r0)
            return
    }

    public boolean equals(java.lang.Object r3) {
            r2 = this;
            r0 = 1
            if (r2 != r3) goto L4
            return r0
        L4:
            if (r3 == 0) goto L12
            java.lang.Class r1 = r2.getClass()
            java.lang.Class r3 = r3.getClass()
            if (r1 == r3) goto L11
            goto L12
        L11:
            return r0
        L12:
            r3 = 0
            return r3
    }

    @Override // org.bson.codecs.configuration.CodecProvider
    public <T> org.bson.codecs.Codec<T> get(java.lang.Class<T> r1, org.bson.codecs.configuration.CodecRegistry r2) {
            r0 = this;
            java.util.Map<java.lang.Class<?>, org.bson.codecs.Codec<?>> r2 = r0.codecs
            java.lang.Object r1 = r2.get(r1)
            org.bson.codecs.Codec r1 = (org.bson.codecs.Codec) r1
            return r1
    }

    public int hashCode() {
            r1 = this;
            r0 = 0
            return r0
    }
}
