package org.bson.codecs;

/* JADX INFO: loaded from: classes3.dex */
public class BsonInt64Codec implements org.bson.codecs.Codec<org.bson.BsonInt64> {
    public BsonInt64Codec() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // org.bson.codecs.Decoder
    public /* bridge */ /* synthetic */ java.lang.Object decode(org.bson.BsonReader r1, org.bson.codecs.DecoderContext r2) {
            r0 = this;
            org.bson.BsonInt64 r1 = r0.decode(r1, r2)
            return r1
    }

    @Override // org.bson.codecs.Decoder
    public org.bson.BsonInt64 decode(org.bson.BsonReader r3, org.bson.codecs.DecoderContext r4) {
            r2 = this;
            org.bson.BsonInt64 r4 = new org.bson.BsonInt64
            long r0 = r3.readInt64()
            r4.<init>(r0)
            return r4
    }

    @Override // org.bson.codecs.Encoder
    public /* bridge */ /* synthetic */ void encode(org.bson.BsonWriter r1, java.lang.Object r2, org.bson.codecs.EncoderContext r3) {
            r0 = this;
            org.bson.BsonInt64 r2 = (org.bson.BsonInt64) r2
            r0.encode(r1, r2, r3)
            return
    }

    public void encode(org.bson.BsonWriter r1, org.bson.BsonInt64 r2, org.bson.codecs.EncoderContext r3) {
            r0 = this;
            long r2 = r2.getValue()
            r1.writeInt64(r2)
            return
    }

    @Override // org.bson.codecs.Encoder
    public java.lang.Class<org.bson.BsonInt64> getEncoderClass() {
            r1 = this;
            java.lang.Class<org.bson.BsonInt64> r0 = org.bson.BsonInt64.class
            return r0
    }
}
