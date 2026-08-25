package org.bson.codecs;

/* JADX INFO: loaded from: classes.dex */
public class BsonDecimal128Codec implements org.bson.codecs.Codec<org.bson.BsonDecimal128> {
    public BsonDecimal128Codec() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // org.bson.codecs.Decoder
    public /* bridge */ /* synthetic */ java.lang.Object decode(org.bson.BsonReader r1, org.bson.codecs.DecoderContext r2) {
            r0 = this;
            org.bson.BsonDecimal128 r1 = r0.decode(r1, r2)
            return r1
    }

    @Override // org.bson.codecs.Decoder
    public org.bson.BsonDecimal128 decode(org.bson.BsonReader r1, org.bson.codecs.DecoderContext r2) {
            r0 = this;
            org.bson.BsonDecimal128 r2 = new org.bson.BsonDecimal128
            org.bson.types.Decimal128 r1 = r1.readDecimal128()
            r2.<init>(r1)
            return r2
    }

    @Override // org.bson.codecs.Encoder
    public /* bridge */ /* synthetic */ void encode(org.bson.BsonWriter r1, java.lang.Object r2, org.bson.codecs.EncoderContext r3) {
            r0 = this;
            org.bson.BsonDecimal128 r2 = (org.bson.BsonDecimal128) r2
            r0.encode(r1, r2, r3)
            return
    }

    public void encode(org.bson.BsonWriter r1, org.bson.BsonDecimal128 r2, org.bson.codecs.EncoderContext r3) {
            r0 = this;
            org.bson.types.Decimal128 r2 = r2.getValue()
            r1.writeDecimal128(r2)
            return
    }

    @Override // org.bson.codecs.Encoder
    public java.lang.Class<org.bson.BsonDecimal128> getEncoderClass() {
            r1 = this;
            java.lang.Class<org.bson.BsonDecimal128> r0 = org.bson.BsonDecimal128.class
            return r0
    }
}
