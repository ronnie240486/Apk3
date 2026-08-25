package org.bson.codecs;

/* JADX INFO: loaded from: classes.dex */
public class IntegerCodec implements org.bson.codecs.Codec<java.lang.Integer> {
    public IntegerCodec() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // org.bson.codecs.Decoder
    public java.lang.Integer decode(org.bson.BsonReader r1, org.bson.codecs.DecoderContext r2) {
            r0 = this;
            int r1 = org.bson.codecs.NumberCodecHelper.decodeInt(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            return r1
    }

    @Override // org.bson.codecs.Decoder
    public /* bridge */ /* synthetic */ java.lang.Object decode(org.bson.BsonReader r1, org.bson.codecs.DecoderContext r2) {
            r0 = this;
            java.lang.Integer r1 = r0.decode(r1, r2)
            return r1
    }

    public void encode(org.bson.BsonWriter r1, java.lang.Integer r2, org.bson.codecs.EncoderContext r3) {
            r0 = this;
            int r2 = r2.intValue()
            r1.writeInt32(r2)
            return
    }

    @Override // org.bson.codecs.Encoder
    public /* bridge */ /* synthetic */ void encode(org.bson.BsonWriter r1, java.lang.Object r2, org.bson.codecs.EncoderContext r3) {
            r0 = this;
            java.lang.Integer r2 = (java.lang.Integer) r2
            r0.encode(r1, r2, r3)
            return
    }

    @Override // org.bson.codecs.Encoder
    public java.lang.Class<java.lang.Integer> getEncoderClass() {
            r1 = this;
            java.lang.Class<java.lang.Integer> r0 = java.lang.Integer.class
            return r0
    }
}
