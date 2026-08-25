package org.bson.codecs;

/* JADX INFO: loaded from: classes.dex */
public final class BigDecimalCodec implements org.bson.codecs.Codec<java.math.BigDecimal> {
    public BigDecimalCodec() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // org.bson.codecs.Decoder
    public /* bridge */ /* synthetic */ java.lang.Object decode(org.bson.BsonReader r1, org.bson.codecs.DecoderContext r2) {
            r0 = this;
            java.math.BigDecimal r1 = r0.decode(r1, r2)
            return r1
    }

    @Override // org.bson.codecs.Decoder
    public java.math.BigDecimal decode(org.bson.BsonReader r1, org.bson.codecs.DecoderContext r2) {
            r0 = this;
            org.bson.types.Decimal128 r1 = r1.readDecimal128()
            java.math.BigDecimal r1 = r1.bigDecimalValue()
            return r1
    }

    @Override // org.bson.codecs.Encoder
    public /* bridge */ /* synthetic */ void encode(org.bson.BsonWriter r1, java.lang.Object r2, org.bson.codecs.EncoderContext r3) {
            r0 = this;
            java.math.BigDecimal r2 = (java.math.BigDecimal) r2
            r0.encode(r1, r2, r3)
            return
    }

    public void encode(org.bson.BsonWriter r1, java.math.BigDecimal r2, org.bson.codecs.EncoderContext r3) {
            r0 = this;
            org.bson.types.Decimal128 r3 = new org.bson.types.Decimal128
            r3.<init>(r2)
            r1.writeDecimal128(r3)
            return
    }

    @Override // org.bson.codecs.Encoder
    public java.lang.Class<java.math.BigDecimal> getEncoderClass() {
            r1 = this;
            java.lang.Class<java.math.BigDecimal> r0 = java.math.BigDecimal.class
            return r0
    }
}
