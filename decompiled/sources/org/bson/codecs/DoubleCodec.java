package org.bson.codecs;

/* JADX INFO: loaded from: classes.dex */
public class DoubleCodec implements org.bson.codecs.Codec<java.lang.Double> {
    public DoubleCodec() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // org.bson.codecs.Decoder
    public java.lang.Double decode(org.bson.BsonReader r1, org.bson.codecs.DecoderContext r2) {
            r0 = this;
            double r1 = org.bson.codecs.NumberCodecHelper.decodeDouble(r1)
            java.lang.Double r1 = java.lang.Double.valueOf(r1)
            return r1
    }

    @Override // org.bson.codecs.Decoder
    public /* bridge */ /* synthetic */ java.lang.Object decode(org.bson.BsonReader r1, org.bson.codecs.DecoderContext r2) {
            r0 = this;
            java.lang.Double r1 = r0.decode(r1, r2)
            return r1
    }

    public void encode(org.bson.BsonWriter r1, java.lang.Double r2, org.bson.codecs.EncoderContext r3) {
            r0 = this;
            double r2 = r2.doubleValue()
            r1.writeDouble(r2)
            return
    }

    @Override // org.bson.codecs.Encoder
    public /* bridge */ /* synthetic */ void encode(org.bson.BsonWriter r1, java.lang.Object r2, org.bson.codecs.EncoderContext r3) {
            r0 = this;
            java.lang.Double r2 = (java.lang.Double) r2
            r0.encode(r1, r2, r3)
            return
    }

    @Override // org.bson.codecs.Encoder
    public java.lang.Class<java.lang.Double> getEncoderClass() {
            r1 = this;
            java.lang.Class<java.lang.Double> r0 = java.lang.Double.class
            return r0
    }
}
