package org.bson.codecs;

/* JADX INFO: loaded from: classes3.dex */
public class BsonRegularExpressionCodec implements org.bson.codecs.Codec<org.bson.BsonRegularExpression> {
    public BsonRegularExpressionCodec() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // org.bson.codecs.Decoder
    public /* bridge */ /* synthetic */ java.lang.Object decode(org.bson.BsonReader r1, org.bson.codecs.DecoderContext r2) {
            r0 = this;
            org.bson.BsonRegularExpression r1 = r0.decode(r1, r2)
            return r1
    }

    @Override // org.bson.codecs.Decoder
    public org.bson.BsonRegularExpression decode(org.bson.BsonReader r1, org.bson.codecs.DecoderContext r2) {
            r0 = this;
            org.bson.BsonRegularExpression r1 = r1.readRegularExpression()
            return r1
    }

    @Override // org.bson.codecs.Encoder
    public /* bridge */ /* synthetic */ void encode(org.bson.BsonWriter r1, java.lang.Object r2, org.bson.codecs.EncoderContext r3) {
            r0 = this;
            org.bson.BsonRegularExpression r2 = (org.bson.BsonRegularExpression) r2
            r0.encode(r1, r2, r3)
            return
    }

    public void encode(org.bson.BsonWriter r1, org.bson.BsonRegularExpression r2, org.bson.codecs.EncoderContext r3) {
            r0 = this;
            r1.writeRegularExpression(r2)
            return
    }

    @Override // org.bson.codecs.Encoder
    public java.lang.Class<org.bson.BsonRegularExpression> getEncoderClass() {
            r1 = this;
            java.lang.Class<org.bson.BsonRegularExpression> r0 = org.bson.BsonRegularExpression.class
            return r0
    }
}
