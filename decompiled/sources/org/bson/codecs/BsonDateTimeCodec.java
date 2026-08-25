package org.bson.codecs;

/* JADX INFO: loaded from: classes3.dex */
public class BsonDateTimeCodec implements org.bson.codecs.Codec<org.bson.BsonDateTime> {
    public BsonDateTimeCodec() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // org.bson.codecs.Decoder
    public /* bridge */ /* synthetic */ java.lang.Object decode(org.bson.BsonReader r1, org.bson.codecs.DecoderContext r2) {
            r0 = this;
            org.bson.BsonDateTime r1 = r0.decode(r1, r2)
            return r1
    }

    @Override // org.bson.codecs.Decoder
    public org.bson.BsonDateTime decode(org.bson.BsonReader r3, org.bson.codecs.DecoderContext r4) {
            r2 = this;
            org.bson.BsonDateTime r4 = new org.bson.BsonDateTime
            long r0 = r3.readDateTime()
            r4.<init>(r0)
            return r4
    }

    @Override // org.bson.codecs.Encoder
    public /* bridge */ /* synthetic */ void encode(org.bson.BsonWriter r1, java.lang.Object r2, org.bson.codecs.EncoderContext r3) {
            r0 = this;
            org.bson.BsonDateTime r2 = (org.bson.BsonDateTime) r2
            r0.encode(r1, r2, r3)
            return
    }

    public void encode(org.bson.BsonWriter r1, org.bson.BsonDateTime r2, org.bson.codecs.EncoderContext r3) {
            r0 = this;
            long r2 = r2.getValue()
            r1.writeDateTime(r2)
            return
    }

    @Override // org.bson.codecs.Encoder
    public java.lang.Class<org.bson.BsonDateTime> getEncoderClass() {
            r1 = this;
            java.lang.Class<org.bson.BsonDateTime> r0 = org.bson.BsonDateTime.class
            return r0
    }
}
