package org.bson.codecs.pojo;

/* JADX INFO: loaded from: classes3.dex */
final class FallbackPropertyCodecProvider implements org.bson.codecs.pojo.PropertyCodecProvider {
    private final org.bson.codecs.configuration.CodecRegistry codecRegistry;
    private final org.bson.codecs.pojo.PojoCodec<?> pojoCodec;

    public FallbackPropertyCodecProvider(org.bson.codecs.pojo.PojoCodec<?> r1, org.bson.codecs.configuration.CodecRegistry r2) {
            r0 = this;
            r0.<init>()
            r0.pojoCodec = r1
            r0.codecRegistry = r2
            return
    }

    @Override // org.bson.codecs.pojo.PropertyCodecProvider
    public <S> org.bson.codecs.Codec<S> get(org.bson.codecs.pojo.TypeWithTypeParameters<S> r2, org.bson.codecs.pojo.PropertyCodecRegistry r3) {
            r1 = this;
            java.lang.Class r3 = r2.getType()
            org.bson.codecs.pojo.PojoCodec<?> r0 = r1.pojoCodec
            java.lang.Class r0 = r0.getEncoderClass()
            if (r3 != r0) goto Lf
            org.bson.codecs.pojo.PojoCodec<?> r2 = r1.pojoCodec
            return r2
        Lf:
            org.bson.codecs.configuration.CodecRegistry r3 = r1.codecRegistry
            java.lang.Class r2 = r2.getType()
            org.bson.codecs.Codec r2 = r3.get(r2)
            return r2
    }
}
