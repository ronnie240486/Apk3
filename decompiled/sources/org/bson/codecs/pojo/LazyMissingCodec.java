package org.bson.codecs.pojo;

/* JADX INFO: loaded from: classes3.dex */
class LazyMissingCodec<S> implements org.bson.codecs.Codec<S> {
    private final java.lang.Class<S> clazz;
    private final org.bson.codecs.configuration.CodecConfigurationException exception;

    public LazyMissingCodec(java.lang.Class<S> r1, org.bson.codecs.configuration.CodecConfigurationException r2) {
            r0 = this;
            r0.<init>()
            r0.clazz = r1
            r0.exception = r2
            return
    }

    @Override // org.bson.codecs.Decoder
    public S decode(org.bson.BsonReader r1, org.bson.codecs.DecoderContext r2) {
            r0 = this;
            org.bson.codecs.configuration.CodecConfigurationException r1 = r0.exception
            throw r1
    }

    @Override // org.bson.codecs.Encoder
    public void encode(org.bson.BsonWriter r1, S r2, org.bson.codecs.EncoderContext r3) {
            r0 = this;
            org.bson.codecs.configuration.CodecConfigurationException r1 = r0.exception
            throw r1
    }

    @Override // org.bson.codecs.Encoder
    public java.lang.Class<S> getEncoderClass() {
            r1 = this;
            java.lang.Class<S> r0 = r1.clazz
            return r0
    }
}
