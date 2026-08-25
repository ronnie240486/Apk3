package org.bson.codecs;

/* JADX INFO: loaded from: classes3.dex */
public class DateCodec implements org.bson.codecs.Codec<java.util.Date> {
    public DateCodec() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // org.bson.codecs.Decoder
    public /* bridge */ /* synthetic */ java.lang.Object decode(org.bson.BsonReader r1, org.bson.codecs.DecoderContext r2) {
            r0 = this;
            java.util.Date r1 = r0.decode(r1, r2)
            return r1
    }

    @Override // org.bson.codecs.Decoder
    public java.util.Date decode(org.bson.BsonReader r3, org.bson.codecs.DecoderContext r4) {
            r2 = this;
            java.util.Date r4 = new java.util.Date
            long r0 = r3.readDateTime()
            r4.<init>(r0)
            return r4
    }

    @Override // org.bson.codecs.Encoder
    public /* bridge */ /* synthetic */ void encode(org.bson.BsonWriter r1, java.lang.Object r2, org.bson.codecs.EncoderContext r3) {
            r0 = this;
            java.util.Date r2 = (java.util.Date) r2
            r0.encode(r1, r2, r3)
            return
    }

    public void encode(org.bson.BsonWriter r1, java.util.Date r2, org.bson.codecs.EncoderContext r3) {
            r0 = this;
            long r2 = r2.getTime()
            r1.writeDateTime(r2)
            return
    }

    @Override // org.bson.codecs.Encoder
    public java.lang.Class<java.util.Date> getEncoderClass() {
            r1 = this;
            java.lang.Class<java.util.Date> r0 = java.util.Date.class
            return r0
    }
}
