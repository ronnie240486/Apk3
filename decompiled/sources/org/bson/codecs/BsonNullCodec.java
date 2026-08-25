package org.bson.codecs;

/* JADX INFO: loaded from: classes.dex */
public class BsonNullCodec implements org.bson.codecs.Codec<org.bson.BsonNull> {
    public BsonNullCodec() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // org.bson.codecs.Decoder
    public /* bridge */ /* synthetic */ java.lang.Object decode(org.bson.BsonReader r1, org.bson.codecs.DecoderContext r2) {
            r0 = this;
            org.bson.BsonNull r1 = r0.decode(r1, r2)
            return r1
    }

    @Override // org.bson.codecs.Decoder
    public org.bson.BsonNull decode(org.bson.BsonReader r1, org.bson.codecs.DecoderContext r2) {
            r0 = this;
            r1.readNull()
            org.bson.BsonNull r1 = org.bson.BsonNull.VALUE
            return r1
    }

    @Override // org.bson.codecs.Encoder
    public /* bridge */ /* synthetic */ void encode(org.bson.BsonWriter r1, java.lang.Object r2, org.bson.codecs.EncoderContext r3) {
            r0 = this;
            org.bson.BsonNull r2 = (org.bson.BsonNull) r2
            r0.encode(r1, r2, r3)
            return
    }

    public void encode(org.bson.BsonWriter r1, org.bson.BsonNull r2, org.bson.codecs.EncoderContext r3) {
            r0 = this;
            r1.writeNull()
            return
    }

    @Override // org.bson.codecs.Encoder
    public java.lang.Class<org.bson.BsonNull> getEncoderClass() {
            r1 = this;
            java.lang.Class<org.bson.BsonNull> r0 = org.bson.BsonNull.class
            return r0
    }
}
