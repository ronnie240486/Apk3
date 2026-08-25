package org.bson.codecs;

/* JADX INFO: loaded from: classes3.dex */
public class BsonBinaryCodec implements org.bson.codecs.Codec<org.bson.BsonBinary> {
    public BsonBinaryCodec() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // org.bson.codecs.Decoder
    public /* bridge */ /* synthetic */ java.lang.Object decode(org.bson.BsonReader r1, org.bson.codecs.DecoderContext r2) {
            r0 = this;
            org.bson.BsonBinary r1 = r0.decode(r1, r2)
            return r1
    }

    @Override // org.bson.codecs.Decoder
    public org.bson.BsonBinary decode(org.bson.BsonReader r1, org.bson.codecs.DecoderContext r2) {
            r0 = this;
            org.bson.BsonBinary r1 = r1.readBinaryData()
            return r1
    }

    @Override // org.bson.codecs.Encoder
    public /* bridge */ /* synthetic */ void encode(org.bson.BsonWriter r1, java.lang.Object r2, org.bson.codecs.EncoderContext r3) {
            r0 = this;
            org.bson.BsonBinary r2 = (org.bson.BsonBinary) r2
            r0.encode(r1, r2, r3)
            return
    }

    public void encode(org.bson.BsonWriter r1, org.bson.BsonBinary r2, org.bson.codecs.EncoderContext r3) {
            r0 = this;
            r1.writeBinaryData(r2)
            return
    }

    @Override // org.bson.codecs.Encoder
    public java.lang.Class<org.bson.BsonBinary> getEncoderClass() {
            r1 = this;
            java.lang.Class<org.bson.BsonBinary> r0 = org.bson.BsonBinary.class
            return r0
    }
}
