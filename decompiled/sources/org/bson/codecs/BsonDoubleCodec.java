package org.bson.codecs;

/* JADX INFO: loaded from: classes3.dex */
public class BsonDoubleCodec implements org.bson.codecs.Codec<org.bson.BsonDouble> {
    public BsonDoubleCodec() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // org.bson.codecs.Decoder
    public /* bridge */ /* synthetic */ java.lang.Object decode(org.bson.BsonReader r1, org.bson.codecs.DecoderContext r2) {
            r0 = this;
            org.bson.BsonDouble r1 = r0.decode(r1, r2)
            return r1
    }

    @Override // org.bson.codecs.Decoder
    public org.bson.BsonDouble decode(org.bson.BsonReader r3, org.bson.codecs.DecoderContext r4) {
            r2 = this;
            org.bson.BsonDouble r4 = new org.bson.BsonDouble
            double r0 = r3.readDouble()
            r4.<init>(r0)
            return r4
    }

    @Override // org.bson.codecs.Encoder
    public /* bridge */ /* synthetic */ void encode(org.bson.BsonWriter r1, java.lang.Object r2, org.bson.codecs.EncoderContext r3) {
            r0 = this;
            org.bson.BsonDouble r2 = (org.bson.BsonDouble) r2
            r0.encode(r1, r2, r3)
            return
    }

    public void encode(org.bson.BsonWriter r1, org.bson.BsonDouble r2, org.bson.codecs.EncoderContext r3) {
            r0 = this;
            double r2 = r2.getValue()
            r1.writeDouble(r2)
            return
    }

    @Override // org.bson.codecs.Encoder
    public java.lang.Class<org.bson.BsonDouble> getEncoderClass() {
            r1 = this;
            java.lang.Class<org.bson.BsonDouble> r0 = org.bson.BsonDouble.class
            return r0
    }
}
