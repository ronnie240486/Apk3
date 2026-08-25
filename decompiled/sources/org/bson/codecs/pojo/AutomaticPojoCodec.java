package org.bson.codecs.pojo;

/* JADX INFO: loaded from: classes.dex */
final class AutomaticPojoCodec<T> extends org.bson.codecs.pojo.PojoCodec<T> {
    private final org.bson.codecs.pojo.PojoCodec<T> pojoCodec;

    public AutomaticPojoCodec(org.bson.codecs.pojo.PojoCodec<T> r1) {
            r0 = this;
            r0.<init>()
            r0.pojoCodec = r1
            return
    }

    @Override // org.bson.codecs.Decoder
    public T decode(org.bson.BsonReader r4, org.bson.codecs.DecoderContext r5) {
            r3 = this;
            org.bson.codecs.pojo.PojoCodec<T> r0 = r3.pojoCodec     // Catch: org.bson.codecs.configuration.CodecConfigurationException -> L7
            java.lang.Object r4 = r0.decode(r4, r5)     // Catch: org.bson.codecs.configuration.CodecConfigurationException -> L7
            return r4
        L7:
            r4 = move-exception
            org.bson.codecs.configuration.CodecConfigurationException r5 = new org.bson.codecs.configuration.CodecConfigurationException
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            org.bson.codecs.pojo.PojoCodec<T> r2 = r3.pojoCodec
            java.lang.Class r2 = r2.getEncoderClass()
            java.lang.String r2 = r2.getSimpleName()
            r0[r1] = r2
            r1 = 1
            java.lang.String r2 = r4.getMessage()
            r0[r1] = r2
            java.lang.String r1 = "An exception occurred when decoding using the AutomaticPojoCodec.%nDecoding into a '%s' failed with the following exception:%n%n%s%n%nA custom Codec or PojoCodec may need to be explicitly configured and registered to handle this type."
            java.lang.String r0 = java.lang.String.format(r1, r0)
            r5.<init>(r0, r4)
            throw r5
    }

    @Override // org.bson.codecs.Encoder
    public void encode(org.bson.BsonWriter r4, T r5, org.bson.codecs.EncoderContext r6) {
            r3 = this;
            org.bson.codecs.pojo.PojoCodec<T> r0 = r3.pojoCodec     // Catch: org.bson.codecs.configuration.CodecConfigurationException -> L6
            r0.encode(r4, r5, r6)     // Catch: org.bson.codecs.configuration.CodecConfigurationException -> L6
            return
        L6:
            r4 = move-exception
            org.bson.codecs.configuration.CodecConfigurationException r6 = new org.bson.codecs.configuration.CodecConfigurationException
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            java.lang.Class r2 = r3.getEncoderClass()
            java.lang.String r2 = r2.getSimpleName()
            r0[r1] = r2
            r1 = 1
            r0[r1] = r5
            r5 = 2
            java.lang.String r1 = r4.getMessage()
            r0[r5] = r1
            java.lang.String r5 = "An exception occurred when encoding using the AutomaticPojoCodec.%nEncoding a %s: '%s' failed with the following exception:%n%n%s%n%nA custom Codec or PojoCodec may need to be explicitly configured and registered to handle this type."
            java.lang.String r5 = java.lang.String.format(r5, r0)
            r6.<init>(r5, r4)
            throw r6
    }

    @Override // org.bson.codecs.pojo.PojoCodec
    public final org.bson.codecs.pojo.ClassModel<T> getClassModel() {
            r1 = this;
            org.bson.codecs.pojo.PojoCodec<T> r0 = r1.pojoCodec
            org.bson.codecs.pojo.ClassModel r0 = r0.getClassModel()
            return r0
    }

    @Override // org.bson.codecs.Encoder
    public java.lang.Class<T> getEncoderClass() {
            r1 = this;
            org.bson.codecs.pojo.PojoCodec<T> r0 = r1.pojoCodec
            java.lang.Class r0 = r0.getEncoderClass()
            return r0
    }
}
