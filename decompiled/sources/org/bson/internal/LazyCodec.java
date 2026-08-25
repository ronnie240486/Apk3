package org.bson.internal;

/* JADX INFO: loaded from: classes3.dex */
class LazyCodec<T> implements org.bson.codecs.Codec<T> {
    private final java.lang.Class<T> clazz;
    private final org.bson.codecs.configuration.CodecRegistry registry;
    private volatile org.bson.codecs.Codec<T> wrapped;

    public LazyCodec(org.bson.codecs.configuration.CodecRegistry r1, java.lang.Class<T> r2) {
            r0 = this;
            r0.<init>()
            r0.registry = r1
            r0.clazz = r2
            return
    }

    private org.bson.codecs.Codec<T> getWrapped() {
            r2 = this;
            org.bson.codecs.Codec<T> r0 = r2.wrapped
            if (r0 != 0) goto Le
            org.bson.codecs.configuration.CodecRegistry r0 = r2.registry
            java.lang.Class<T> r1 = r2.clazz
            org.bson.codecs.Codec r0 = r0.get(r1)
            r2.wrapped = r0
        Le:
            org.bson.codecs.Codec<T> r0 = r2.wrapped
            return r0
    }

    @Override // org.bson.codecs.Decoder
    public T decode(org.bson.BsonReader r2, org.bson.codecs.DecoderContext r3) {
            r1 = this;
            org.bson.codecs.Codec r0 = r1.getWrapped()
            java.lang.Object r2 = r0.decode(r2, r3)
            return r2
    }

    @Override // org.bson.codecs.Encoder
    public void encode(org.bson.BsonWriter r2, T r3, org.bson.codecs.EncoderContext r4) {
            r1 = this;
            org.bson.codecs.Codec r0 = r1.getWrapped()
            r0.encode(r2, r3, r4)
            return
    }

    @Override // org.bson.codecs.Encoder
    public java.lang.Class<T> getEncoderClass() {
            r1 = this;
            java.lang.Class<T> r0 = r1.clazz
            return r0
    }
}
