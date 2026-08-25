package org.bson.codecs;

/* JADX INFO: loaded from: classes3.dex */
public class BsonInt32Codec implements org.bson.codecs.Codec<org.bson.BsonInt32> {
    public BsonInt32Codec() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // org.bson.codecs.Decoder
    public /* bridge */ /* synthetic */ java.lang.Object decode(org.bson.BsonReader r1, org.bson.codecs.DecoderContext r2) {
            r0 = this;
            org.bson.BsonInt32 r1 = r0.decode(r1, r2)
            return r1
    }

    @Override // org.bson.codecs.Decoder
    public org.bson.BsonInt32 decode(org.bson.BsonReader r1, org.bson.codecs.DecoderContext r2) {
            r0 = this;
            org.bson.BsonInt32 r2 = new org.bson.BsonInt32
            int r1 = r1.readInt32()
            r2.<init>(r1)
            return r2
    }

    @Override // org.bson.codecs.Encoder
    public /* bridge */ /* synthetic */ void encode(org.bson.BsonWriter r1, java.lang.Object r2, org.bson.codecs.EncoderContext r3) {
            r0 = this;
            org.bson.BsonInt32 r2 = (org.bson.BsonInt32) r2
            r0.encode(r1, r2, r3)
            return
    }

    public void encode(org.bson.BsonWriter r1, org.bson.BsonInt32 r2, org.bson.codecs.EncoderContext r3) {
            r0 = this;
            int r2 = r2.getValue()
            r1.writeInt32(r2)
            return
    }

    @Override // org.bson.codecs.Encoder
    public java.lang.Class<org.bson.BsonInt32> getEncoderClass() {
            r1 = this;
            java.lang.Class<org.bson.BsonInt32> r0 = org.bson.BsonInt32.class
            return r0
    }
}
