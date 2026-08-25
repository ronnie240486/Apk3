package org.bson.codecs;

/* JADX INFO: loaded from: classes.dex */
public class BinaryCodec implements org.bson.codecs.Codec<org.bson.types.Binary> {
    public BinaryCodec() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // org.bson.codecs.Decoder
    public /* bridge */ /* synthetic */ java.lang.Object decode(org.bson.BsonReader r1, org.bson.codecs.DecoderContext r2) {
            r0 = this;
            org.bson.types.Binary r1 = r0.decode(r1, r2)
            return r1
    }

    @Override // org.bson.codecs.Decoder
    public org.bson.types.Binary decode(org.bson.BsonReader r2, org.bson.codecs.DecoderContext r3) {
            r1 = this;
            org.bson.BsonBinary r2 = r2.readBinaryData()
            org.bson.types.Binary r3 = new org.bson.types.Binary
            byte r0 = r2.getType()
            byte[] r2 = r2.getData()
            r3.<init>(r0, r2)
            return r3
    }

    @Override // org.bson.codecs.Encoder
    public /* bridge */ /* synthetic */ void encode(org.bson.BsonWriter r1, java.lang.Object r2, org.bson.codecs.EncoderContext r3) {
            r0 = this;
            org.bson.types.Binary r2 = (org.bson.types.Binary) r2
            r0.encode(r1, r2, r3)
            return
    }

    public void encode(org.bson.BsonWriter r2, org.bson.types.Binary r3, org.bson.codecs.EncoderContext r4) {
            r1 = this;
            org.bson.BsonBinary r4 = new org.bson.BsonBinary
            byte r0 = r3.getType()
            byte[] r3 = r3.getData()
            r4.<init>(r0, r3)
            r2.writeBinaryData(r4)
            return
    }

    @Override // org.bson.codecs.Encoder
    public java.lang.Class<org.bson.types.Binary> getEncoderClass() {
            r1 = this;
            java.lang.Class<org.bson.types.Binary> r0 = org.bson.types.Binary.class
            return r0
    }
}
