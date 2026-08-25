package org.bson.codecs;

/* JADX INFO: loaded from: classes3.dex */
public class BsonDocumentWrapperCodec implements org.bson.codecs.Codec<org.bson.BsonDocumentWrapper> {
    private final org.bson.codecs.Codec<org.bson.BsonDocument> bsonDocumentCodec;

    public BsonDocumentWrapperCodec(org.bson.codecs.Codec<org.bson.BsonDocument> r1) {
            r0 = this;
            r0.<init>()
            r0.bsonDocumentCodec = r1
            return
    }

    @Override // org.bson.codecs.Decoder
    public /* bridge */ /* synthetic */ java.lang.Object decode(org.bson.BsonReader r1, org.bson.codecs.DecoderContext r2) {
            r0 = this;
            org.bson.BsonDocumentWrapper r1 = r0.decode(r1, r2)
            return r1
    }

    @Override // org.bson.codecs.Decoder
    public org.bson.BsonDocumentWrapper decode(org.bson.BsonReader r1, org.bson.codecs.DecoderContext r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Decoding into a BsonDocumentWrapper is not allowed"
            r1.<init>(r2)
            throw r1
    }

    @Override // org.bson.codecs.Encoder
    public /* bridge */ /* synthetic */ void encode(org.bson.BsonWriter r1, java.lang.Object r2, org.bson.codecs.EncoderContext r3) {
            r0 = this;
            org.bson.BsonDocumentWrapper r2 = (org.bson.BsonDocumentWrapper) r2
            r0.encode(r1, r2, r3)
            return
    }

    public void encode(org.bson.BsonWriter r2, org.bson.BsonDocumentWrapper r3, org.bson.codecs.EncoderContext r4) {
            r1 = this;
            boolean r0 = r3.isUnwrapped()
            if (r0 == 0) goto Lc
            org.bson.codecs.Codec<org.bson.BsonDocument> r0 = r1.bsonDocumentCodec
            r0.encode(r2, r3, r4)
            goto L17
        Lc:
            org.bson.codecs.Encoder r0 = r3.getEncoder()
            java.lang.Object r3 = r3.getWrappedDocument()
            r0.encode(r2, r3, r4)
        L17:
            return
    }

    @Override // org.bson.codecs.Encoder
    public java.lang.Class<org.bson.BsonDocumentWrapper> getEncoderClass() {
            r1 = this;
            java.lang.Class<org.bson.BsonDocumentWrapper> r0 = org.bson.BsonDocumentWrapper.class
            return r0
    }
}
