package org.bson.codecs;

/* JADX INFO: loaded from: classes3.dex */
public class LongCodec implements org.bson.codecs.Codec<java.lang.Long> {
    public LongCodec() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // org.bson.codecs.Decoder
    public java.lang.Long decode(org.bson.BsonReader r1, org.bson.codecs.DecoderContext r2) {
            r0 = this;
            long r1 = org.bson.codecs.NumberCodecHelper.decodeLong(r1)
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            return r1
    }

    @Override // org.bson.codecs.Decoder
    public /* bridge */ /* synthetic */ java.lang.Object decode(org.bson.BsonReader r1, org.bson.codecs.DecoderContext r2) {
            r0 = this;
            java.lang.Long r1 = r0.decode(r1, r2)
            return r1
    }

    public void encode(org.bson.BsonWriter r1, java.lang.Long r2, org.bson.codecs.EncoderContext r3) {
            r0 = this;
            long r2 = r2.longValue()
            r1.writeInt64(r2)
            return
    }

    @Override // org.bson.codecs.Encoder
    public /* bridge */ /* synthetic */ void encode(org.bson.BsonWriter r1, java.lang.Object r2, org.bson.codecs.EncoderContext r3) {
            r0 = this;
            java.lang.Long r2 = (java.lang.Long) r2
            r0.encode(r1, r2, r3)
            return
    }

    @Override // org.bson.codecs.Encoder
    public java.lang.Class<java.lang.Long> getEncoderClass() {
            r1 = this;
            java.lang.Class<java.lang.Long> r0 = java.lang.Long.class
            return r0
    }
}
