package org.bson.codecs;

/* JADX INFO: loaded from: classes3.dex */
public class BsonCodec implements org.bson.codecs.Codec<org.bson.conversions.Bson> {
    private static final org.bson.codecs.Codec<org.bson.BsonDocument> BSON_DOCUMENT_CODEC = null;
    private final org.bson.codecs.configuration.CodecRegistry registry;

    static {
            org.bson.codecs.BsonDocumentCodec r0 = new org.bson.codecs.BsonDocumentCodec
            r0.<init>()
            org.bson.codecs.BsonCodec.BSON_DOCUMENT_CODEC = r0
            return
    }

    public BsonCodec(org.bson.codecs.configuration.CodecRegistry r1) {
            r0 = this;
            r0.<init>()
            r0.registry = r1
            return
    }

    @Override // org.bson.codecs.Decoder
    public /* bridge */ /* synthetic */ java.lang.Object decode(org.bson.BsonReader r1, org.bson.codecs.DecoderContext r2) {
            r0 = this;
            org.bson.conversions.Bson r1 = r0.decode(r1, r2)
            return r1
    }

    @Override // org.bson.codecs.Decoder
    public org.bson.conversions.Bson decode(org.bson.BsonReader r1, org.bson.codecs.DecoderContext r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "The BsonCodec can only encode to Bson"
            r1.<init>(r2)
            throw r1
    }

    @Override // org.bson.codecs.Encoder
    public /* bridge */ /* synthetic */ void encode(org.bson.BsonWriter r1, java.lang.Object r2, org.bson.codecs.EncoderContext r3) {
            r0 = this;
            org.bson.conversions.Bson r2 = (org.bson.conversions.Bson) r2
            r0.encode(r1, r2, r3)
            return
    }

    public void encode(org.bson.BsonWriter r3, org.bson.conversions.Bson r4, org.bson.codecs.EncoderContext r5) {
            r2 = this;
            java.lang.Class<org.bson.BsonDocument> r0 = org.bson.BsonDocument.class
            org.bson.codecs.configuration.CodecRegistry r1 = r2.registry     // Catch: java.lang.Exception -> Le
            org.bson.BsonDocument r0 = r4.toBsonDocument(r0, r1)     // Catch: java.lang.Exception -> Le
            org.bson.codecs.Codec<org.bson.BsonDocument> r1 = org.bson.codecs.BsonCodec.BSON_DOCUMENT_CODEC     // Catch: java.lang.Exception -> Le
            r1.encode(r3, r0, r5)     // Catch: java.lang.Exception -> Le
            return
        Le:
            r3 = move-exception
            org.bson.codecs.configuration.CodecConfigurationException r5 = new org.bson.codecs.configuration.CodecConfigurationException
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r4
            java.lang.String r4 = "Unable to encode a Bson implementation: %s"
            java.lang.String r4 = java.lang.String.format(r4, r0)
            r5.<init>(r4, r3)
            throw r5
    }

    @Override // org.bson.codecs.Encoder
    public java.lang.Class<org.bson.conversions.Bson> getEncoderClass() {
            r1 = this;
            java.lang.Class<org.bson.conversions.Bson> r0 = org.bson.conversions.Bson.class
            return r0
    }
}
