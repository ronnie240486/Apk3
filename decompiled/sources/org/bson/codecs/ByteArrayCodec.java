package org.bson.codecs;

/* JADX INFO: loaded from: classes.dex */
public class ByteArrayCodec implements org.bson.codecs.Codec<byte[]> {
    public ByteArrayCodec() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // org.bson.codecs.Decoder
    public /* bridge */ /* synthetic */ java.lang.Object decode(org.bson.BsonReader r1, org.bson.codecs.DecoderContext r2) {
            r0 = this;
            byte[] r1 = r0.decode(r1, r2)
            return r1
    }

    @Override // org.bson.codecs.Decoder
    public byte[] decode(org.bson.BsonReader r1, org.bson.codecs.DecoderContext r2) {
            r0 = this;
            org.bson.BsonBinary r1 = r1.readBinaryData()
            byte[] r1 = r1.getData()
            return r1
    }

    @Override // org.bson.codecs.Encoder
    public /* bridge */ /* synthetic */ void encode(org.bson.BsonWriter r1, java.lang.Object r2, org.bson.codecs.EncoderContext r3) {
            r0 = this;
            byte[] r2 = (byte[]) r2
            r0.encode(r1, r2, r3)
            return
    }

    public void encode(org.bson.BsonWriter r1, byte[] r2, org.bson.codecs.EncoderContext r3) {
            r0 = this;
            org.bson.BsonBinary r3 = new org.bson.BsonBinary
            r3.<init>(r2)
            r1.writeBinaryData(r3)
            return
    }

    @Override // org.bson.codecs.Encoder
    public java.lang.Class<byte[]> getEncoderClass() {
            r1 = this;
            java.lang.Class<byte[]> r0 = byte[].class
            return r0
    }
}
