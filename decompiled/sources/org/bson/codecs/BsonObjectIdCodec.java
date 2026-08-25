package org.bson.codecs;

/* JADX INFO: loaded from: classes3.dex */
public class BsonObjectIdCodec implements org.bson.codecs.Codec<org.bson.BsonObjectId> {
    public BsonObjectIdCodec() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // org.bson.codecs.Decoder
    public /* bridge */ /* synthetic */ java.lang.Object decode(org.bson.BsonReader r1, org.bson.codecs.DecoderContext r2) {
            r0 = this;
            org.bson.BsonObjectId r1 = r0.decode(r1, r2)
            return r1
    }

    @Override // org.bson.codecs.Decoder
    public org.bson.BsonObjectId decode(org.bson.BsonReader r1, org.bson.codecs.DecoderContext r2) {
            r0 = this;
            org.bson.BsonObjectId r2 = new org.bson.BsonObjectId
            org.bson.types.ObjectId r1 = r1.readObjectId()
            r2.<init>(r1)
            return r2
    }

    @Override // org.bson.codecs.Encoder
    public /* bridge */ /* synthetic */ void encode(org.bson.BsonWriter r1, java.lang.Object r2, org.bson.codecs.EncoderContext r3) {
            r0 = this;
            org.bson.BsonObjectId r2 = (org.bson.BsonObjectId) r2
            r0.encode(r1, r2, r3)
            return
    }

    public void encode(org.bson.BsonWriter r1, org.bson.BsonObjectId r2, org.bson.codecs.EncoderContext r3) {
            r0 = this;
            org.bson.types.ObjectId r2 = r2.getValue()
            r1.writeObjectId(r2)
            return
    }

    @Override // org.bson.codecs.Encoder
    public java.lang.Class<org.bson.BsonObjectId> getEncoderClass() {
            r1 = this;
            java.lang.Class<org.bson.BsonObjectId> r0 = org.bson.BsonObjectId.class
            return r0
    }
}
